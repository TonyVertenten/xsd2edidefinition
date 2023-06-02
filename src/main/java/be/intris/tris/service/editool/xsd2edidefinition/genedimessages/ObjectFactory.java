
package be.intris.tris.service.editool.xsd2edidefinition.genedimessages;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.intris.genedimessages package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GENEDIMESSAGES_QNAME = new QName("http://www.example.org/GenEdiMessages", "GEN_EDI_MESSAGES");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.intris.genedimessages
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GENEDIMESSAGESType}
     *
     */
    public GENEDIMESSAGESType createGENEDIMESSAGESType() {
        return new GENEDIMESSAGESType();
    }

    /**
     * Create an instance of {@link GENEDIDATATAGType}
     *
     */
    public GENEDIDATATAGType createGENEDIDATATAGType() {
        return new GENEDIDATATAGType();
    }

    /**
     * Create an instance of {@link GENEDISEGMENTSType}
     *
     */
    public GENEDISEGMENTSType createGENEDISEGMENTSType() {
        return new GENEDISEGMENTSType();
    }

    /**
     * Create an instance of {@link GENEDISEGMENTType}
     *
     */
    public GENEDISEGMENTType createGENEDISEGMENTType() {
        return new GENEDISEGMENTType();
    }

    /**
     * Create an instance of {@link GENEDIDATATAGSType}
     *
     */
    public GENEDIDATATAGSType createGENEDIDATATAGSType() {
        return new GENEDIDATATAGSType();
    }

    /**
     * Create an instance of {@link GENEDIMESSAGEType}
     *
     */
    public GENEDIMESSAGEType createGENEDIMESSAGEType() {
        return new GENEDIMESSAGEType();
    }

    /**
     * Create an instance of {@link JAXBElement} {@code <} {@link GENEDIMESSAGESType} {@code >} }
     *
     */
    @XmlElementDecl(namespace = "http://www.example.org/GenEdiMessages", name = "GEN_EDI_MESSAGES")
    public JAXBElement<GENEDIMESSAGESType> createGENEDIMESSAGES(GENEDIMESSAGESType value) {
        return new JAXBElement<GENEDIMESSAGESType>(_GENEDIMESSAGES_QNAME, GENEDIMESSAGESType.class, null, value);
    }

}
