
package be.intris.tris.service.editool.xsd2edidefinition.genedimessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GENEDIDATATAGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENEDIDATATAGType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATATAG_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEQUENCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIELD_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIELD_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MANDATORY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SOURCE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SOURCE_FIELD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LITERAL_VALUE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FUNCTION_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PROPERTY_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="START_POSITION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LENGTH" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMPOSITE_POSITION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONVERSION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONVERSION_CONDITION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ATTRIBUTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ATTRIBUTE_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OMIT_WHEN_EMPTY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INACTIVE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INACTIVATION_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INACTIVATION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CREATION_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CREATION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODIFICATION_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODIFICATION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ENTITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ZERO_WHEN_NULL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NAMESPACE_PREFIX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENEDIDATATAGType", namespace = "http://www.example.org/GenEdiMessages", propOrder = {
    "code",
    "datatagname",
    "description",
    "sequence",
    "fieldformat",
    "fieldtype",
    "mandatory",
    "source",
    "sourcefield",
    "literalvalue",
    "functionname",
    "propertyname",
    "startposition",
    "length",
    "compositeposition",
    "conversiontype",
    "conversioncondition",
    "attribute",
    "attributecode",
    "omitwhenempty",
    "inactive",
    "inactivationtime",
    "inactivationuser",
    "creationtime",
    "creationuser",
    "modificationtime",
    "modificationuser",
    "entity",
    "zerowhennull",
    "namespaceprefix"
})
public class GENEDIDATATAGType {

    @XmlElement(name = "CODE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String code;
    @XmlElement(name = "DATATAG_NAME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String datatagname;
    @XmlElement(name = "DESCRIPTION", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String description;
    @XmlElement(name = "SEQUENCE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String sequence;
    @XmlElement(name = "FIELD_FORMAT", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String fieldformat;
    @XmlElement(name = "FIELD_TYPE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String fieldtype;
    @XmlElement(name = "MANDATORY", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String mandatory;
    @XmlElement(name = "SOURCE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String source;
    @XmlElement(name = "SOURCE_FIELD", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String sourcefield;
    @XmlElement(name = "LITERAL_VALUE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String literalvalue;
    @XmlElement(name = "FUNCTION_NAME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String functionname;
    @XmlElement(name = "PROPERTY_NAME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String propertyname;
    @XmlElement(name = "START_POSITION", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String startposition;
    @XmlElement(name = "LENGTH", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String length;
    @XmlElement(name = "COMPOSITE_POSITION", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String compositeposition;
    @XmlElement(name = "CONVERSION_TYPE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String conversiontype;
    @XmlElement(name = "CONVERSION_CONDITION", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String conversioncondition;
    @XmlElement(name = "ATTRIBUTE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String attribute;
    @XmlElement(name = "ATTRIBUTE_CODE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String attributecode;
    @XmlElement(name = "OMIT_WHEN_EMPTY", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String omitwhenempty;
    @XmlElement(name = "INACTIVE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String inactive;
    @XmlElement(name = "INACTIVATION_TIME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String inactivationtime;
    @XmlElement(name = "INACTIVATION_USER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String inactivationuser;
    @XmlElement(name = "CREATION_TIME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String creationtime;
    @XmlElement(name = "CREATION_USER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String creationuser;
    @XmlElement(name = "MODIFICATION_TIME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String modificationtime;
    @XmlElement(name = "MODIFICATION_USER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String modificationuser;
    @XmlElement(name = "ENTITY", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String entity;
    @XmlElement(name = "ZERO_WHEN_NULL", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String zerowhennull;
    @XmlElement(name = "NAMESPACE_PREFIX", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String namespaceprefix;

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
     * Gets the value of the datatagname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATATAGNAME() {
        return datatagname;
    }

    /**
     * Sets the value of the datatagname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATATAGNAME(String value) {
        this.datatagname = value;
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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCE() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCE(String value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the fieldformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIELDFORMAT() {
        return fieldformat;
    }

    /**
     * Sets the value of the fieldformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIELDFORMAT(String value) {
        this.fieldformat = value;
    }

    /**
     * Gets the value of the fieldtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIELDTYPE() {
        return fieldtype;
    }

    /**
     * Sets the value of the fieldtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIELDTYPE(String value) {
        this.fieldtype = value;
    }

    /**
     * Gets the value of the mandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMANDATORY() {
        return mandatory;
    }

    /**
     * Sets the value of the mandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMANDATORY(String value) {
        this.mandatory = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCE() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCE(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourcefield property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOURCEFIELD() {
        return sourcefield;
    }

    /**
     * Sets the value of the sourcefield property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOURCEFIELD(String value) {
        this.sourcefield = value;
    }

    /**
     * Gets the value of the literalvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLITERALVALUE() {
        return literalvalue;
    }

    /**
     * Sets the value of the literalvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLITERALVALUE(String value) {
        this.literalvalue = value;
    }

    /**
     * Gets the value of the functionname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTIONNAME() {
        return functionname;
    }

    /**
     * Sets the value of the functionname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTIONNAME(String value) {
        this.functionname = value;
    }

    /**
     * Gets the value of the propertyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROPERTYNAME() {
        return propertyname;
    }

    /**
     * Sets the value of the propertyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROPERTYNAME(String value) {
        this.propertyname = value;
    }

    /**
     * Gets the value of the startposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTPOSITION() {
        return startposition;
    }

    /**
     * Sets the value of the startposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTPOSITION(String value) {
        this.startposition = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLENGTH() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLENGTH(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the compositeposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOMPOSITEPOSITION() {
        return compositeposition;
    }

    /**
     * Sets the value of the compositeposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOMPOSITEPOSITION(String value) {
        this.compositeposition = value;
    }

    /**
     * Gets the value of the conversiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONVERSIONTYPE() {
        return conversiontype;
    }

    /**
     * Sets the value of the conversiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONVERSIONTYPE(String value) {
        this.conversiontype = value;
    }

    /**
     * Gets the value of the conversioncondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONVERSIONCONDITION() {
        return conversioncondition;
    }

    /**
     * Sets the value of the conversioncondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONVERSIONCONDITION(String value) {
        this.conversioncondition = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTRIBUTE() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTRIBUTE(String value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the attributecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTRIBUTECODE() {
        return attributecode;
    }

    /**
     * Sets the value of the attributecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTRIBUTECODE(String value) {
        this.attributecode = value;
    }

    /**
     * Gets the value of the omitwhenempty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOMITWHENEMPTY() {
        return omitwhenempty;
    }

    /**
     * Sets the value of the omitwhenempty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOMITWHENEMPTY(String value) {
        this.omitwhenempty = value;
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
     *     {@link String }
     *     
     */
    public String getCREATIONTIME() {
        return creationtime;
    }

    /**
     * Sets the value of the creationtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREATIONTIME(String value) {
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
     *     {@link String }
     *     
     */
    public String getMODIFICATIONTIME() {
        return modificationtime;
    }

    /**
     * Sets the value of the modificationtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFICATIONTIME(String value) {
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
     * Gets the value of the zerowhennull property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZEROWHENNULL() {
        return zerowhennull;
    }

    /**
     * Sets the value of the zerowhennull property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZEROWHENNULL(String value) {
        this.zerowhennull = value;
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

}
