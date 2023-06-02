
package be.intris.tris.service.editool.xsd2edidefinition.genedimessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GENEDIMESSAGESType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENEDIMESSAGESType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GEN_EDI_MESSAGE" type="{http://www.example.org/GenEdiMessages}GENEDIMESSAGEType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENEDIMESSAGESType", namespace = "http://www.example.org/GenEdiMessages", propOrder = {
    "genedimessage"
})
public class GENEDIMESSAGESType {

    @XmlElement(name = "GEN_EDI_MESSAGE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected GENEDIMESSAGEType genedimessage;

    /**
     * Gets the value of the genedimessage property.
     *
     * @return
     * possible object is
     * {@link GENEDIMESSAGEType}
     *
     */
    public GENEDIMESSAGEType getGENEDIMESSAGE() {
        return genedimessage;
    }

    /**
     * Sets the value of the genedimessage property.
     *
     * @param value
     * allowed object is
     * {@link GENEDIMESSAGEType}
     *
     */
    public void setGENEDIMESSAGE(GENEDIMESSAGEType value) {
        this.genedimessage = value;
    }

}
