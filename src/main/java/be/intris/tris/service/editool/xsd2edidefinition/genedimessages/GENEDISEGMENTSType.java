
package be.intris.tris.service.editool.xsd2edidefinition.genedimessages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GENEDISEGMENTSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENEDISEGMENTSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GEN_EDI_SEGMENT" type="{http://www.example.org/GenEdiMessages}GENEDISEGMENTType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENEDISEGMENTSType", namespace = "http://www.example.org/GenEdiMessages", propOrder = {
    "genedisegment"
})
public class GENEDISEGMENTSType {

    @XmlElement(name = "GEN_EDI_SEGMENT", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected List<GENEDISEGMENTType> genedisegment;

    /**
     * Gets the value of the genedisegment property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genedisegment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getGENEDISEGMENT().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GENEDISEGMENTType}
     *
     *
     */
    public List<GENEDISEGMENTType> getGENEDISEGMENT() {
        if (genedisegment == null) {
            genedisegment = new ArrayList<GENEDISEGMENTType>();
        }
        return this.genedisegment;
    }

}
