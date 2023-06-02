
package be.intris.tris.service.editool.xsd2edidefinition.genedimessages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GENEDIDATATAGSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENEDIDATATAGSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GEN_EDI_DATATAG" type="{http://www.example.org/GenEdiMessages}GENEDIDATATAGType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENEDIDATATAGSType", namespace = "http://www.example.org/GenEdiMessages", propOrder = {
    "genedidatatag"
})
public class GENEDIDATATAGSType {

    @XmlElement(name = "GEN_EDI_DATATAG", namespace = "http://www.example.org/GenEdiMessages")
    protected List<GENEDIDATATAGType> genedidatatag;

    /**
     * Gets the value of the genedidatatag property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genedidatatag property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getGENEDIDATATAG().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GENEDIDATATAGType}
     *
     *
     */
    public List<GENEDIDATATAGType> getGENEDIDATATAG() {
        if (genedidatatag == null) {
            genedidatatag = new ArrayList<GENEDIDATATAGType>();
        }
        return this.genedidatatag;
    }

}
