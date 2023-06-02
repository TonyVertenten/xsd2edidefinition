
package be.intris.tris.service.editool.xsd2edidefinition.genedimessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GENEDISEGMENTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENEDISEGMENTType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PARENT_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUBCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEGMENT_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SORT_ORDER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MIN_OCCURRENCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MAX_OCCURRENCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QUERY_STATEMENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QUERY_MAPPING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QUERY_BUFFERS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEGMENT_REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INACTIVE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INACTIVATION_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INACTIVATION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CREATION_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CREATION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODIFICATION_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MODIFICATION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ENTITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRE_PROCESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POST_PROCESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ADDITIONAL_BEHAVIOUR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAMESPACE_PREFIX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GEN_EDI_DATATAGS" type="{http://www.example.org/GenEdiMessages}GENEDIDATATAGSType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENEDISEGMENTType", namespace = "http://www.example.org/GenEdiMessages", propOrder = {
    "parentcode",
    "code",
    "subcode",
    "segmentname",
    "description",
    "type",
    "sortorder",
    "minoccurrence",
    "maxoccurrence",
    "querystatement",
    "querymapping",
    "querybuffers",
    "segmentreference",
    "inactive",
    "inactivationtime",
    "inactivationuser",
    "creationtime",
    "creationuser",
    "modificationtime",
    "modificationuser",
    "entity",
    "preprocess",
    "postprocess",
    "additionalbehaviour",
    "namespaceprefix",
    "genedidatatags"
})
public class GENEDISEGMENTType {

    @XmlElement(name = "PARENT_CODE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String parentcode;
    @XmlElement(name = "CODE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String code;
    @XmlElement(name = "SUBCODE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String subcode;
    @XmlElement(name = "SEGMENT_NAME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String segmentname;
    @XmlElement(name = "DESCRIPTION", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String description;
    @XmlElement(name = "TYPE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String type;
    @XmlElement(name = "SORT_ORDER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String sortorder;
    @XmlElement(name = "MIN_OCCURRENCE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String minoccurrence;
    @XmlElement(name = "MAX_OCCURRENCE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String maxoccurrence;
    @XmlElement(name = "QUERY_STATEMENT", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String querystatement;
    @XmlElement(name = "QUERY_MAPPING", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String querymapping;
    @XmlElement(name = "QUERY_BUFFERS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String querybuffers;
    @XmlElement(name = "SEGMENT_REFERENCE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String segmentreference;
    @XmlElement(name = "INACTIVE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String inactive;
    @XmlElement(name = "INACTIVATION_TIME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String inactivationtime;
    @XmlElement(name = "INACTIVATION_USER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String inactivationuser;
    @XmlElement(name = "CREATION_TIME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationtime;
    @XmlElement(name = "CREATION_USER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String creationuser;
    @XmlElement(name = "MODIFICATION_TIME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationtime;
    @XmlElement(name = "MODIFICATION_USER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String modificationuser;
    @XmlElement(name = "ENTITY", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String entity;
    @XmlElement(name = "PRE_PROCESS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String preprocess;
    @XmlElement(name = "POST_PROCESS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String postprocess;
    @XmlElement(name = "ADDITIONAL_BEHAVIOUR", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String additionalbehaviour;
    @XmlElement(name = "NAMESPACE_PREFIX", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String namespaceprefix;
    @XmlElement(name = "GEN_EDI_DATATAGS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected GENEDIDATATAGSType genedidatatags;

    /**
     * Gets the value of the parentcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARENTCODE() {
        return parentcode;
    }

    /**
     * Sets the value of the parentcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARENTCODE(String value) {
        this.parentcode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the subcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBCODE() {
        return subcode;
    }

    /**
     * Sets the value of the subcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBCODE(String value) {
        this.subcode = value;
    }

    /**
     * Gets the value of the segmentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTNAME() {
        return segmentname;
    }

    /**
     * Sets the value of the segmentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTNAME(String value) {
        this.segmentname = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPE(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the sortorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSORTORDER() {
        return sortorder;
    }

    /**
     * Sets the value of the sortorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSORTORDER(String value) {
        this.sortorder = value;
    }

    /**
     * Gets the value of the minoccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINOCCURRENCE() {
        return minoccurrence;
    }

    /**
     * Sets the value of the minoccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINOCCURRENCE(String value) {
        this.minoccurrence = value;
    }

    /**
     * Gets the value of the maxoccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAXOCCURRENCE() {
        return maxoccurrence;
    }

    /**
     * Sets the value of the maxoccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAXOCCURRENCE(String value) {
        this.maxoccurrence = value;
    }

    /**
     * Gets the value of the querystatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUERYSTATEMENT() {
        return querystatement;
    }

    /**
     * Sets the value of the querystatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUERYSTATEMENT(String value) {
        this.querystatement = value;
    }

    /**
     * Gets the value of the querymapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUERYMAPPING() {
        return querymapping;
    }

    /**
     * Sets the value of the querymapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUERYMAPPING(String value) {
        this.querymapping = value;
    }

    /**
     * Gets the value of the querybuffers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUERYBUFFERS() {
        return querybuffers;
    }

    /**
     * Sets the value of the querybuffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUERYBUFFERS(String value) {
        this.querybuffers = value;
    }

    /**
     * Gets the value of the segmentreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTREFERENCE() {
        return segmentreference;
    }

    /**
     * Sets the value of the segmentreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTREFERENCE(String value) {
        this.segmentreference = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINACTIVE() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINACTIVE(String value) {
        this.inactive = value;
    }

    /**
     * Gets the value of the inactivationtime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINACTIVATIONTIME() {
        return inactivationtime;
    }

    /**
     * Sets the value of the inactivationtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINACTIVATIONTIME(String value) {
        this.inactivationtime = value;
    }

    /**
     * Gets the value of the inactivationuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINACTIVATIONUSER() {
        return inactivationuser;
    }

    /**
     * Sets the value of the inactivationuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINACTIVATIONUSER(String value) {
        this.inactivationuser = value;
    }

    /**
     * Gets the value of the creationtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCREATIONTIME() {
        return creationtime;
    }

    /**
     * Sets the value of the creationtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCREATIONTIME(XMLGregorianCalendar value) {
        this.creationtime = value;
    }

    /**
     * Gets the value of the creationuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREATIONUSER() {
        return creationuser;
    }

    /**
     * Sets the value of the creationuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATIONUSER(String value) {
        this.creationuser = value;
    }

    /**
     * Gets the value of the modificationtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMODIFICATIONTIME() {
        return modificationtime;
    }

    /**
     * Sets the value of the modificationtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMODIFICATIONTIME(XMLGregorianCalendar value) {
        this.modificationtime = value;
    }

    /**
     * Gets the value of the modificationuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFICATIONUSER() {
        return modificationuser;
    }

    /**
     * Sets the value of the modificationuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFICATIONUSER(String value) {
        this.modificationuser = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENTITY() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENTITY(String value) {
        this.entity = value;
    }

    /**
     * Gets the value of the preprocess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREPROCESS() {
        return preprocess;
    }

    /**
     * Sets the value of the preprocess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREPROCESS(String value) {
        this.preprocess = value;
    }

    /**
     * Gets the value of the postprocess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTPROCESS() {
        return postprocess;
    }

    /**
     * Sets the value of the postprocess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTPROCESS(String value) {
        this.postprocess = value;
    }

    /**
     * Gets the value of the additionalbehaviour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDITIONALBEHAVIOUR() {
        return additionalbehaviour;
    }

    /**
     * Sets the value of the additionalbehaviour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDITIONALBEHAVIOUR(String value) {
        this.additionalbehaviour = value;
    }

    /**
     * Gets the value of the namespaceprefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMESPACEPREFIX() {
        return namespaceprefix;
    }

    /**
     * Sets the value of the namespaceprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMESPACEPREFIX(String value) {
        this.namespaceprefix = value;
    }

    /**
     * Gets the value of the genedidatatags property.
     *
     * @return
     * possible object is
     * {@link GENEDIDATATAGSType}
     *
     */
    public GENEDIDATATAGSType getGENEDIDATATAGS() {
        return genedidatatags;
    }

    /**
     * Sets the value of the genedidatatags property.
     *
     * @param value
     * allowed object is
     * {@link GENEDIDATATAGSType}
     *
     */
    public void setGENEDIDATATAGS(GENEDIDATATAGSType value) {
        this.genedidatatags = value;
    }

}
