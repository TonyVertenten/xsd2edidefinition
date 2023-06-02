package be.intris.tris.service.editool.xsd2edidefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;

import oracle.adf.share.logging.ADFLogger;

import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaAll;
import org.apache.ws.commons.schema.XmlSchemaAllMember;
import org.apache.ws.commons.schema.XmlSchemaAttribute;
import org.apache.ws.commons.schema.XmlSchemaAttributeGroupRef;
import org.apache.ws.commons.schema.XmlSchemaAttributeOrGroupRef;
import org.apache.ws.commons.schema.XmlSchemaCollection;
import org.apache.ws.commons.schema.XmlSchemaComplexType;
import org.apache.ws.commons.schema.XmlSchemaContent;
import org.apache.ws.commons.schema.XmlSchemaContentModel;
import org.apache.ws.commons.schema.XmlSchemaElement;
import org.apache.ws.commons.schema.XmlSchemaFacet;
import org.apache.ws.commons.schema.XmlSchemaMaxLengthFacet;
import org.apache.ws.commons.schema.XmlSchemaParticle;
import org.apache.ws.commons.schema.XmlSchemaSequence;
import org.apache.ws.commons.schema.XmlSchemaSequenceMember;
import org.apache.ws.commons.schema.XmlSchemaSimpleContentExtension;
import org.apache.ws.commons.schema.XmlSchemaSimpleType;
import org.apache.ws.commons.schema.XmlSchemaSimpleTypeContent;
import org.apache.ws.commons.schema.XmlSchemaSimpleTypeRestriction;
import org.apache.ws.commons.schema.XmlSchemaType;

/**
 * @Author:  Vertenten
 * <p>
 * This is an example for how to iterate XmlSchema
 */
public class XmlSchema2EdiMessageDefinition {
    
    private static final ADFLogger LOG = ADFLogger.createADFLogger(XmlSchema2EdiMessageDefinition.class);

    private FileHandler logFileHandler;
    private FileInputStream propsFile;
    private Properties props;
    private Logger logger = Logger.getLogger(this.getClass().getPackage().getName());
    private ComplexTypeController complexTypeController;
    private CreateEDIMessages createEDIMessages;
    private long lastMaxOccurs;
    private int complexLevel = 0;
    private XmlSchema xmlSchema;



    public XmlSchema2EdiMessageDefinition(String propertyFile) {
        try {
            logFileHandler = new FileHandler("logs/XmlSchema2EdiMessageDefinition.log");
            logFileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(logFileHandler);
            logger.setLevel(Level.INFO);

            // createEdiMessage with properties from propertiesfile;
            propsFile = new FileInputStream(propertyFile);
            props = new Properties();
            props.load(propsFile);
            propsFile.close();

        } catch (IOException e) {
            //TODO: does the ADFLogger works here?
//            e.printStackTrace();
            LOG.severe("<ERROR> <init>(): stacktrace: ", e);
            logger.severe("Error reading file");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        logFileHandler.close();
    }

    public void run(){
        String xsdUrl = props.getProperty("UrlXSD");
        if(loadXmlSchema(xsdUrl)){
            complexTypeController = new ComplexTypeController(this);
            createEDIMessages = new CreateEDIMessages(props);
            processXmlSchema();
            try {
                createEDIMessages.writeEDIMessageXML();
            } catch (JAXBException e) {
                //TODO: does the ADFLogger works here?
                //            e.printStackTrace();
                LOG.severe("<ERROR> <run>(): stacktrace: ", e);
                logger.severe("Error marshalling JAXB to XML");
            }
            createEDIMessages = null;
        }
    }

    public Logger getLogger() {
        return logger;
    }

    public int getComplexLevel() {
        return complexLevel;
    }

    private boolean loadXmlSchema(String xsdUrl) {
        try(InputStream is = new FileInputStream(xsdUrl)){
            XmlSchemaCollection schemaCollection = new XmlSchemaCollection();
            xmlSchema = schemaCollection.read(new StreamSource(is));
        } catch (FileNotFoundException e){
            logger.severe("XSD file:  " + xsdUrl + " not found");
            return false;
        } catch(IOException ioExc){
            logger.severe("Something went wrong during the loadXmlSchema of[" + xsdUrl + "]." +
                  "Probably during clsoing: " + ioExc.getMessage());
        }
        return true;
    }


    public void processXmlSchema() {
        //XmlSchemaObjectTable schemaObjectTable =
        Map<QName, XmlSchemaElement> schemaObjectTable = this.xmlSchema.getElements();
        if(schemaObjectTable.size() > 0){
            Iterator xmlSchemaElementIterator = schemaObjectTable.values().iterator();
            processElements(xmlSchemaElementIterator);
            complexTypeController.printComplexTypeInfoMap();
        } else {
            logger.warning("No SchemaElments where found to process");
        }
    }

    public void processComplexType(XmlSchemaElement xmlSchemaElement) {

        String name = xmlSchemaElement.getName();
        complexLevel++;
        if (!complexTypeController.addParent(complexLevel, name)) {
            logger.warning("Parent could not be added because it already exists ignoring complextype");
            complexLevel--;
            return;
        }
        String parentName = "";
        if (complexLevel > 1) {
            parentName = complexTypeController.getParentName(complexLevel - 1);
        }
        ComplexTypeInfo complexTypeInfo = new ComplexTypeInfo(name, parentName, complexLevel, xmlSchemaElement.getMaxOccurs(), xmlSchemaElement.getMinOccurs());
        if (!complexTypeController.addComplexType(complexTypeInfo)) {
            logger.warning("ComplexType info could not be added to complextypeinfomap " + complexTypeInfo);
            complexLevel--;
            return;
        }
        logger.info("ComplexType -----> name = " + name + " parent is " + parentName );
        createEDIMessages.createSegment(complexTypeInfo);

        XmlSchemaType schemaType = xmlSchemaElement.getSchemaType();
        XmlSchemaComplexType complexType = (XmlSchemaComplexType) schemaType;
        // get the Attributes

        List<XmlSchemaAttributeOrGroupRef> complexTypeAttributes = complexType.getAttributes();
        getAttributes(complexTypeAttributes,'C');

        processParticle(complexType);
        complexTypeController.removeParent(complexLevel, name);
        complexTypeController.removeComplexType(complexTypeInfo);
        complexLevel--;
    }

    private void processParticle(XmlSchemaComplexType complexType) {
        XmlSchemaParticle particle = complexType.getParticle();
        if (particle != null) {
            if (particle instanceof XmlSchemaSequence) {
                logger.info("It's an XmlSchemaSequence ");
                processSchemaSequence((XmlSchemaSequence) particle);
            } else if (particle instanceof XmlSchemaAll) {
                logger.info("instance of XmlSchemaAll");
                processSchemaAll((XmlSchemaAll) particle);
            } else if (particle instanceof XmlSchemaElement) {
                logger.info("It's an XmlSchemaElement");
                processXmlSchemaElement((XmlSchemaElement) particle);
            } else {
                logger.warning("particle is something else " + particle.getClass().getCanonicalName());
            }
        } else {
            // check if there is content
            XmlSchemaContentModel contentModel = complexType.getContentModel();
            if (contentModel != null) {
                XmlSchemaContent content = contentModel.getContent();
                if (content instanceof XmlSchemaSimpleContentExtension) {
                    XmlSchemaSimpleContentExtension simpleContentExtension = (XmlSchemaSimpleContentExtension) content;
                    List<XmlSchemaAttributeOrGroupRef> simpleContentExtensionAttributes = simpleContentExtension.getAttributes();
                    getAttributes(simpleContentExtensionAttributes, 'C');
                } else {
                    logger.warning("Content has different class: " + content.getClass().getCanonicalName());
                }
            }
        }
    }

    private void getAttributes(List<XmlSchemaAttributeOrGroupRef> complexTypeAttributes, char c) {
        Iterator<XmlSchemaAttributeOrGroupRef> attributeOrGroupRefIterator = complexTypeAttributes.iterator();
        while (attributeOrGroupRefIterator.hasNext()) {
            XmlSchemaAttributeOrGroupRef attributeOrGroupRef = attributeOrGroupRefIterator.next();
            if (attributeOrGroupRef instanceof XmlSchemaAttribute) {
                XmlSchemaAttribute schemaAttribute = (XmlSchemaAttribute) attributeOrGroupRef;
                String attributeName = schemaAttribute.getName();
                logger.info("attributeName = " + attributeName);
                String parent = complexTypeController.getLastComplexTypeInfo().getName();
                createEDIMessages.createAttribute(attributeName,c,parent);
            } else if (attributeOrGroupRef instanceof XmlSchemaAttributeGroupRef) {
                logger.warning("There is an attributeGroupRef");
            }
        }
    }

    private void processXmlSchemaElement(XmlSchemaElement particle) {
        logger.warning("processXmlSchemaElement not implemented");
    }

    private void processSchemaAll(XmlSchemaAll particle) {
        XmlSchemaAll complexparticles = (XmlSchemaAll) particle;
        List<XmlSchemaAllMember> complexparticlesItems = complexparticles.getItems();
        Iterator complexparticlesItemsIterator = complexparticlesItems.iterator();
        processElements(complexparticlesItemsIterator);
    }

    private void processSchemaSequence(XmlSchemaSequence particle) {
        XmlSchemaSequence schemaSequence = (XmlSchemaSequence) particle;
        //XmlSchemaObjectCollection schemaObjectCollection =
        final List<XmlSchemaSequenceMember> schemaObjectCollection = schemaSequence.getItems();
        Iterator iterator = schemaObjectCollection.iterator();
        processElements(iterator);
    }

    private void processElements(Iterator iterator) {
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (element instanceof XmlSchemaElement) {
                XmlSchemaElement innerElement = ((XmlSchemaElement) element);
                XmlSchemaType innerEleType = innerElement.getSchemaType();
                if (innerEleType instanceof XmlSchemaComplexType) {
                    processComplexType(innerElement);
                } else if (innerEleType instanceof XmlSchemaSimpleType) {
                    processSimpleType(innerElement);
                }
            } else {
                logger.warning("element is not an XmlSchemaElement but " + element.getClass().getCanonicalName());
            }
        }
    }

    public void processSimpleType(XmlSchemaElement xmlSchemaElement) {
        String type = null;
        String length = null;
        XmlSchemaType schemaType = xmlSchemaElement.getSchemaType();
        if (schemaType instanceof XmlSchemaSimpleType) {
            XmlSchemaSimpleType simpleType = (XmlSchemaSimpleType) schemaType;
            XmlSchemaSimpleTypeContent simpleTypeContent = simpleType.getContent();
            if (simpleTypeContent instanceof XmlSchemaSimpleTypeRestriction) {
                XmlSchemaSimpleTypeRestriction simpleTypeRestriction = (XmlSchemaSimpleTypeRestriction) simpleTypeContent;
                type = simpleTypeRestriction.getBaseTypeName().getLocalPart();
                if(type.equals("anySimpleType")){
                    type = simpleType.getQName().getLocalPart();
                }
                List<XmlSchemaFacet> simpleTypeRestrictionFacets = simpleTypeRestriction.getFacets();
                for (XmlSchemaFacet facet : simpleTypeRestrictionFacets) {
                    if (facet instanceof XmlSchemaMaxLengthFacet) {
                        length = facet.getValue().toString();
                    }
                }

            } else {
                logger.info(" XmlTypeContent is of class " + simpleTypeContent.getClass().getCanonicalName());
                int underscorePos = schemaType.getName().lastIndexOf("_");
                if(underscorePos > 0){
                    type = schemaType.getName().substring(underscorePos+1);
                }
            }
        }
        StringBuilder sbPrintElement = new StringBuilder();
        sbPrintElement.append(xmlSchemaElement.getName());
        sbPrintElement.append(" ------> simple ");
        sbPrintElement.append(type);
        sbPrintElement.append(" type ");
        if (length != null) {
            sbPrintElement.append(" length: ");
            sbPrintElement.append(length);
        }
        sbPrintElement.append(" MinOccurs: " + xmlSchemaElement.getMinOccurs());
        String parent = complexTypeController.getLastComplexTypeInfo().getName();
        logger.info(sbPrintElement.toString());
        createEDIMessages.createDataTag(xmlSchemaElement.getName(),type,length,xmlSchemaElement.getMinOccurs(),parent,complexLevel);
    }


}
