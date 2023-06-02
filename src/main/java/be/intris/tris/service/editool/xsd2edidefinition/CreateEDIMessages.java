package be.intris.tris.service.editool.xsd2edidefinition;

import be.intris.tris.service.editool.xsd2edidefinition.genedimessages.GENEDIDATATAGSType;
import be.intris.tris.service.editool.xsd2edidefinition.genedimessages.GENEDIDATATAGType;
import be.intris.tris.service.editool.xsd2edidefinition.genedimessages.GENEDIMESSAGESType;
import be.intris.tris.service.editool.xsd2edidefinition.genedimessages.GENEDIMESSAGEType;
import be.intris.tris.service.editool.xsd2edidefinition.genedimessages.GENEDISEGMENTSType;
import be.intris.tris.service.editool.xsd2edidefinition.genedimessages.GENEDISEGMENTType;
import be.intris.tris.service.editool.xsd2edidefinition.genedimessages.ObjectFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Stack;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import oracle.adf.share.logging.ADFLogger;

public class CreateEDIMessages {
    
    private static final ADFLogger LOG = ADFLogger.createADFLogger(CreateEDIMessages.class);
    
    private String messageCode;
    private String messageName;
    private String messageDescription;
    private String messageDirection;
    private String rootElement;
    private String urlXSD;
    private String softWareComponent;
    private ObjectFactory factory = new ObjectFactory();
    private String msgMainVersion;
    private String msgVersion;
    private String msgRelease;
    private String msgType;
    private String creationUser;
    private GENEDIMESSAGESType ediMessages;
    private GENEDIMESSAGEType ediMessage;
    private GENEDISEGMENTSType ediSegments;
    private Properties props;
    private int nrOfSegments;
    private GENEDISEGMENTType currentSegment;
    private int dataTagSequence;
    private int segmentSortOrder;
    private ArrayList<String> listParentCodes;
    private Stack<String> stackParentCodes;
    private String oldParentCode = "";
    private GENEDIDATATAGType currentDataTag;
    private GENEDIDATATAGSType currentDatatags;
    private int prevLevel;


    public CreateEDIMessages(Properties msgProps) {
        this.props = msgProps;
        listParentCodes = new ArrayList<>();
        stackParentCodes = new Stack<>();
    }

    public CreateEDIMessages() {
        // init variables
        listParentCodes = new ArrayList<>();
    }

    public boolean createEDIMessage() {
        ediMessages = factory.createGENEDIMESSAGESType();
        if (ediMessages != null) {
            ediMessage = factory.createGENEDIMESSAGEType();
            if (ediMessage != null) {
                ediMessage.setMessageCode(this.getMessageCode());
                ediMessage.setMsgMainVersion(this.getMsgMainVersion());
                ediMessage.setNAME(this.getMessageName());
                ediMessage.setMsgVersion(this.getMsgVersion());
                ediMessage.setMsgRelease(this.getMsgRelease());
                ediMessage.setTYPE(this.getMsgType());
                ediMessage.setDIRECTION(this.getMessageDirection());
                ediMessage.setSOFTWARECOMPONENTS(this.getSoftWareComponent());
                ediMessage.setCREATIONUSER(this.getCreationUser());
                ediMessage.setENTITY("GEN_EDI_MESSAGES");
                ediMessage.setDESCRIPTION(this.getMessageName());
                ediMessage.setHEADERINCLUDEVERSION("0");
                ediSegments = factory.createGENEDISEGMENTSType();
                ediMessage.setGENEDISEGMENTS(ediSegments);
                ediMessages.setGENEDIMESSAGE(ediMessage);
                nrOfSegments = 0;
                return true;
            }
        }
        return false;
    }

    public Boolean createSegment(ComplexTypeInfo complexTypeInfo) {
        currentSegment = factory.createGENEDISEGMENTType();
        if (nrOfSegments == 0) {  // first segment is used as message definition
            this.createEDIMessage();
            nrOfSegments = 1;
        } else {
            dataTagSequence = 0;

        }
        currentSegment.setPARENTCODE(this.getParentCode(complexTypeInfo));
        currentSegment.setCODE(String.format("%.35s",complexTypeInfo.getName().toUpperCase()));
        currentSegment.setSUBCODE(Integer.toString(nrOfSegments));
        currentSegment.setSEGMENTNAME(complexTypeInfo.getName());
        currentSegment.setDESCRIPTION(complexTypeInfo.getName() + " Segment");
        currentSegment.setTYPE("TEXT");
        segmentSortOrder += 10;
        currentSegment.setSORTORDER(String.format("%05d", segmentSortOrder));
        currentSegment.setMINOCCURRENCE(String.format("%05d", complexTypeInfo.getMinOccurs()));
        if (complexTypeInfo.getMaxOccurs() > 99999)
            currentSegment.setMAXOCCURRENCE("99999");
        else
            currentSegment.setMAXOCCURRENCE(String.format("%05d", complexTypeInfo.getMaxOccurs()));
        currentSegment.setINACTIVE("0");
        currentSegment.setENTITY("GEN_EDI_SEGMENTS");
        ediSegments.getGENEDISEGMENT().add(currentSegment);
        nrOfSegments++;

        return true;
    }

    private String getParentCode(ComplexTypeInfo parentinfo) { ////// need to use Level to determine parentcode
        String parent = parentinfo.getParentName().toUpperCase();
        int currentLevel = parentinfo.getLevel();
        String parentCode = "";
        int indexParent;
        if(nrOfSegments == 1) {
            String newParentCode = String.format("%.35s|%d",parentinfo.getName().toUpperCase(),nrOfSegments);
            stackParentCodes.push(newParentCode);
        } else if(currentLevel == prevLevel){
            // return same parentcode as previous
            parentCode = stackParentCodes.peek();
            while(!parentCode.startsWith(parent)){
                String tmpparent = stackParentCodes.pop();
                parentCode = stackParentCodes.peek();
            }
            String newParentCode = String.format("%s.35|%d",parentinfo.getName().toUpperCase(),nrOfSegments);
            stackParentCodes.push(newParentCode);
            if(!parentCode.startsWith(parent)){
                System.out.println("unexpected parentcode: " + parentCode + " expected: " + parent);
            }
        } else if(currentLevel > prevLevel) {
            // add new parentcode push on stack
            parentCode = stackParentCodes.peek();
            String newParentCode = String.format("%.35s|%d",parentinfo.getName().toUpperCase(),nrOfSegments);
            stackParentCodes.push(newParentCode);
            if(!parentCode.startsWith(parent)) {
                System.out.println("unexpected parentcode: " + parentCode + " expected: " + parent);
            }
        } else {
            // pop previous #parentcodes from stack
            /*
            for(int i = prevLevel; i > currentLevel; i--){
                String tmpparentCode = stackParentCodes.pop();
            }
            */
            parentCode = stackParentCodes.peek();
            while(!parentCode.startsWith(parent)){
                String tmpparent = stackParentCodes.pop();
                parentCode = stackParentCodes.peek();
            }
            String newParentCode = String.format("%.35s|%d",parentinfo.getName().toUpperCase(),nrOfSegments);
            stackParentCodes.push(newParentCode);
            if(!parentCode.startsWith(parent)) {
                System.out.println("unexpected parentcode: " + parentCode + " expected: " + parent);
            }
        }
        oldParentCode = parentCode;
        prevLevel = currentLevel;
        return parentCode;
    }

    public String getMessageCode() {
        if (this.messageCode == null) {
            this.setMessageCode(props.getProperty("MessageCode"));
        }
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageName() {
        if (this.messageName == null) {
            this.setMessageName(props.getProperty("MessageName"));
        }
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getMessageDirection() {
        if (this.messageDirection == null) {
            this.setMessageDirection(props.getProperty("MessageDirection"));
        }
        return messageDirection;
    }

    public void setMessageDirection(String messageDirection) {
        this.messageDirection = messageDirection;
    }

    public String getRootElement() {
        if (this.rootElement == null) {
            this.setRootElement(props.getProperty("RootElement"));
        }
        return rootElement;
    }

    public void setRootElement(String rootElement) {
        this.rootElement = rootElement;
    }

    public String getUrlXSD() {
        if (this.urlXSD == null) {
            this.setUrlXSD(props.getProperty("UrlXSD"));
        }
        return urlXSD;
    }

    public void setUrlXSD(String urlXSD) {
        this.urlXSD = urlXSD;
    }

    public String getSoftWareComponent() {
        if (this.softWareComponent == null) {
            this.setSoftWareComponent(props.getProperty("SoftwareComponents"));
        }
        return softWareComponent;
    }

    public void setSoftWareComponent(String softWareComponent) {
        this.softWareComponent = softWareComponent;
    }

    public String getMessageDescription() {
        if (this.messageDescription == null) {
            this.setMessageDescription(props.getProperty("MessageDescription"));
        }
        return messageDescription;
    }

    public void setMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
    }

    public ObjectFactory getFactory() {
        return factory;
    }

    public void setFactory(ObjectFactory factory) {
        this.factory = factory;
    }

    public String getMsgMainVersion() {
        if (this.msgMainVersion == null) {
            this.setMsgMainVersion(props.getProperty("MsgMainVersion"));
        }
        return msgMainVersion;
    }

    public void setMsgMainVersion(String msgMainVersion) {
        this.msgMainVersion = msgMainVersion;
    }

    public String getMsgVersion() {
        if (this.msgVersion == null) {
            this.setMsgVersion(props.getProperty("MsgVersion"));
        }
        return msgVersion;
    }

    public void setMsgVersion(String msgVersion) {
        this.msgVersion = msgVersion;
    }

    public String getMsgRelease() {
        if (this.msgRelease == null) {
            this.setMsgRelease(props.getProperty("MsgRelease"));
        }
        return msgRelease;
    }

    public void setMsgRelease(String msgRelease) {
        this.msgRelease = msgRelease;
    }

    public String getMsgType() {
        if (this.msgType == null) {
            this.setMsgType(props.getProperty("MsgType"));
        }
        return msgType;
    }

    public void setMsgType(String msgType) {
        if (msgType == null) {
            this.msgType = "XML";
        } else
            this.msgType = msgType;
    }

    public String getCreationUser() {
        if (this.creationUser == null) {
            this.setCreationUser(props.getProperty("CreationUser"));
        }
        return creationUser;
    }


    public void setCreationUser(String creationUser) {
        if (creationUser == null) {
            this.creationUser = "VRTNTN";
        } else
            this.creationUser = creationUser;
    }

    public void createDataTag(String name, String type, String length, long minOccurs, String parent, int complexLevel) {
        GENEDIDATATAGSType actualDataTags = currentDatatags;
        GENEDISEGMENTType actualSegment = currentSegment;
        int actualDataTagSequence = dataTagSequence;
        Boolean grandParent = false;
        if(complexLevel < prevLevel && complexLevel >=0){
            // lookup the previous parent segment to make it current
            grandParent = true;
            /*
            int level = complexLevel - 1;//ediSegments.getGENEDISEGMENT().size() - 1;
            actualSegment = ediSegments.getGENEDISEGMENT().get(level);
            if (actualSegment.getGENEDIDATATAGS() == null) {
                actualDataTagSequence = 1;
            } else {
                actualDataTagSequence = actualSegment.getGENEDIDATATAGS().getGENEDIDATATAG().size() + 2;
            }
            */

            int level = ediSegments.getGENEDISEGMENT().size();// - 1;
            while(!actualSegment.getSEGMENTNAME().equals(parent) && level > 0){
                level--;
                actualSegment = ediSegments.getGENEDISEGMENT().get(level);
            }
            if(!actualSegment.getSEGMENTNAME().equals(parent)){
                System.out.println("DataTag: " + name + " indicates other parent but parent: " + parent + " not found!!");
                return;
            }
        }
        if (actualSegment.getGENEDIDATATAGS() == null) {
            actualDataTags = factory.createGENEDIDATATAGSType();
            //actualSegment.setGENEDIDATATAGS(actualDataTags);
            actualDataTagSequence = 1;
            //actualDataTags = currentDatatags;
        } else {
            actualDataTags = actualSegment.getGENEDIDATATAGS();
            actualDataTagSequence = actualSegment.getGENEDIDATATAGS().getGENEDIDATATAG().size() + 2;
        }
        currentDataTag = factory.createGENEDIDATATAGType();
        currentDataTag.setCODE(name.toUpperCase());
        currentDataTag.setDATATAGNAME(name);
        currentDataTag.setDESCRIPTION(name);
        currentDataTag.setSEQUENCE(String.format("%03d", actualDataTagSequence++));
        if (type == null) {
            type = "string";
        }
        switch (type.toUpperCase()) {
            case "DATETIME":
                currentDataTag.setFIELDFORMAT("yyyy-MM-ddTHH:mm:ss");
                currentDataTag.setFIELDTYPE("DATE");
                break;
            case "LONG":
            case "INT":
                currentDataTag.setFIELDFORMAT("0(8)");
                currentDataTag.setFIELDTYPE("INTEGER");
                break;
            case "DECIMAL":
                currentDataTag.setFIELDFORMAT("00000000.000");
                currentDataTag.setFIELDTYPE("NUMBER");
                break;
            case "BOOLEAN":
                currentDataTag.setFIELDFORMAT("X");
                currentDataTag.setFIELDTYPE("BOOLEAN");
                break;
            default:
                Integer len = length == null ? 15 : Integer.parseInt(length);
                if(len > 99999)
                    len = 99999;
                currentDataTag.setFIELDFORMAT("X(" + len.toString() + ")");
                currentDataTag.setFIELDTYPE("TEXT");
        }
        if (minOccurs > 0)
            currentDataTag.setMANDATORY("1");
        else
            currentDataTag.setMANDATORY("0");
        currentDataTag.setSOURCE("LIT");
        currentDataTag.setLITERALVALUE(name);
        currentDataTag.setENTITY("GEN_EDI_DATATAGS");
        currentDataTag.setATTRIBUTE("NO");
        actualDataTags.getGENEDIDATATAG().add(currentDataTag);
        actualSegment.setGENEDIDATATAGS(actualDataTags);
        if(!grandParent){
            dataTagSequence = actualDataTagSequence;
        }
    }

    public void createAttribute(String attributeName, char c, String parent) {
        GENEDISEGMENTType actualSegment = currentSegment;
        GENEDIDATATAGSType actualDataTags;
        int actualDataTagSequence;
        int level = ediSegments.getGENEDISEGMENT().size() - 1;
        while(!actualSegment.getSEGMENTNAME().equals(parent) && level >= 0){
            level--;
            actualSegment = ediSegments.getGENEDISEGMENT().get(level);
        }
        if(!actualSegment.getSEGMENTNAME().equals(parent)){
            System.out.println("Atribute: " + attributeName + " indicates other parent but parent: " + parent + " not found!!");
            return;
        }
        if (actualSegment.getGENEDIDATATAGS() == null) {
            actualDataTags = factory.createGENEDIDATATAGSType();
            actualSegment.setGENEDIDATATAGS(actualDataTags);
            actualDataTagSequence = 1;
        } else {
            actualDataTagSequence = actualSegment.getGENEDIDATATAGS().getGENEDIDATATAG().size() + 2;
            actualDataTags = actualSegment.getGENEDIDATATAGS();
        }
        GENEDIDATATAGType attributeDataTag = factory.createGENEDIDATATAGType();
        attributeDataTag.setCODE(attributeName.toUpperCase());
        attributeDataTag.setDATATAGNAME(attributeName);
        attributeDataTag.setDESCRIPTION(attributeName);
        attributeDataTag.setSEQUENCE(String.format("%03d", dataTagSequence++));
        attributeDataTag.setFIELDFORMAT("X(80)");
        attributeDataTag.setFIELDTYPE("TEXT");
        if (c == 'C') {
            attributeDataTag.setATTRIBUTE("SEGMENT");
            attributeDataTag.setATTRIBUTECODE(currentSegment.getCODE());
        } else {
            attributeDataTag.setATTRIBUTE("DATATAG");
            attributeDataTag.setATTRIBUTECODE(currentDataTag.getCODE());
        }
        attributeDataTag.setSOURCE("LIT");
        actualDataTags.getGENEDIDATATAG().add(attributeDataTag);
        actualSegment.setGENEDIDATATAGS(actualDataTags);

    }

    public void writeEDIMessageXML() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(ediMessages.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        String fileName = "EDIMessage_" + this.getMessageCode() + ".XML";
        try (OutputStream os = new FileOutputStream(fileName)) {
            JAXBElement<GENEDIMESSAGESType> genedimessagesTypeJAXBElement = factory.createGENEDIMESSAGES(ediMessages);
            marshaller.marshal(genedimessagesTypeJAXBElement, os);
            os.close();
        } catch (FileNotFoundException e) {
            LOG.severe("<ERROR> writeEDIMessageXML(): FileNotFoundException! Stacktrace: ", e);
        } catch (IOException e) {
            LOG.severe("<ERROR> writeEDIMessageXML(): IOException! Stacktrace: ", e);
        }
    }
}
