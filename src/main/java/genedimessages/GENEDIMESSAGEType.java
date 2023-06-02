
package be.intris.tris.service.editool.xsd2edidefinition.genedimessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GENEDIMESSAGEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GENEDIMESSAGEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SENDER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RECEIVER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DIRECTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SOFTWARE_COMPONENTS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOGLEVEL_ERROR_REPORT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LOGLEVEL_PROCESSING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SAVE_INCOMING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SAVE_OUTGOING" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CREATION_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CREATION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODIFICATION_TIME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MODIFICATION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ENTITY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HEADER_INCLUDE_VERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUPER_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESTINATION_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESTINATION_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONNECTION_URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CONNECTION_USER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JAXB_CLASS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SMOOKS_CONFIG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRE_PROCESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="POST_PROCESS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OUTPUT_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DECIMAL_FORMAT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MESSAGE_DELIMITER" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GEN_EDI_SEGMENTS" type="{http://www.example.org/GenEdiMessages}GENEDISEGMENTSType"/>
 *         &lt;element name="GEN_EDI_CLEANUP_PARAMETERS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GEN_EDI_SEARCH_FIELDS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MsgControllingAgency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msgMainVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MsgVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MsgRelease" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msgSubrelease" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GENEDIMESSAGEType", namespace = "http://www.example.org/GenEdiMessages", propOrder = {
    "name",
    "description",
    "sender",
    "receiver",
    "type",
    "direction",
    "softwarecomponents",
    "loglevelerrorreport",
    "loglevelprocessing",
    "saveincoming",
    "saveoutgoing",
    "creationtime",
    "creationuser",
    "modificationtime",
    "modificationuser",
    "entity",
    "headerincludeversion",
    "superclass",
    "destinationtype",
    "destinationname",
    "connectionurl",
    "connectionuser",
    "jaxbclass",
    "smooksconfig",
    "preprocess",
    "postprocess",
    "outputformat",
    "decimalformat",
    "messagedelimiter",
    "genedisegments",
    "genedicleanupparameters",
    "genedisearchfields"
})
public class GENEDIMESSAGEType {

    @XmlElement(name = "NAME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String name;
    @XmlElement(name = "DESCRIPTION", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String description;
    @XmlElement(name = "SENDER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String sender;
    @XmlElement(name = "RECEIVER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String receiver;
    @XmlElement(name = "TYPE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String type;
    @XmlElement(name = "DIRECTION", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String direction;
    @XmlElement(name = "SOFTWARE_COMPONENTS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String softwarecomponents;
    @XmlElement(name = "LOGLEVEL_ERROR_REPORT", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String loglevelerrorreport;
    @XmlElement(name = "LOGLEVEL_PROCESSING", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String loglevelprocessing;
    @XmlElement(name = "SAVE_INCOMING", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String saveincoming;
    @XmlElement(name = "SAVE_OUTGOING", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String saveoutgoing;
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
    @XmlElement(name = "HEADER_INCLUDE_VERSION", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String headerincludeversion;
    @XmlElement(name = "SUPER_CLASS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String superclass;
    @XmlElement(name = "DESTINATION_TYPE", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String destinationtype;
    @XmlElement(name = "DESTINATION_NAME", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String destinationname;
    @XmlElement(name = "CONNECTION_URL", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String connectionurl;
    @XmlElement(name = "CONNECTION_USER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String connectionuser;
    @XmlElement(name = "JAXB_CLASS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String jaxbclass;
    @XmlElement(name = "SMOOKS_CONFIG", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String smooksconfig;
    @XmlElement(name = "PRE_PROCESS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String preprocess;
    @XmlElement(name = "POST_PROCESS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String postprocess;
    @XmlElement(name = "OUTPUT_FORMAT", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String outputformat;
    @XmlElement(name = "DECIMAL_FORMAT", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String decimalformat;
    @XmlElement(name = "MESSAGE_DELIMITER", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String messagedelimiter;
    @XmlElement(name = "GEN_EDI_SEGMENTS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected GENEDISEGMENTSType genedisegments;
    @XmlElement(name = "GEN_EDI_CLEANUP_PARAMETERS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String genedicleanupparameters;
    @XmlElement(name = "GEN_EDI_SEARCH_FIELDS", namespace = "http://www.example.org/GenEdiMessages", required = true)
    protected String genedisearchfields;
    @XmlAttribute(name = "MessageCode")
    protected String messageCode;
    @XmlAttribute(name = "MsgControllingAgency")
    protected String msgControllingAgency;
    @XmlAttribute(name = "msgMainVersion")
    protected String msgMainVersion;
    @XmlAttribute(name = "MsgVersion")
    protected String msgVersion;
    @XmlAttribute(name = "MsgRelease")
    protected String msgRelease;
    @XmlAttribute(name = "msgSubrelease")
    protected String msgSubrelease;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME(String value) {
        this.name = value;
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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENDER() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENDER(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECEIVER() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECEIVER(String value) {
        this.receiver = value;
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
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIRECTION() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIRECTION(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the softwarecomponents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOFTWARECOMPONENTS() {
        return softwarecomponents;
    }

    /**
     * Sets the value of the softwarecomponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOFTWARECOMPONENTS(String value) {
        this.softwarecomponents = value;
    }

    /**
     * Gets the value of the loglevelerrorreport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOGLEVELERRORREPORT() {
        return loglevelerrorreport;
    }

    /**
     * Sets the value of the loglevelerrorreport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOGLEVELERRORREPORT(String value) {
        this.loglevelerrorreport = value;
    }

    /**
     * Gets the value of the loglevelprocessing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOGLEVELPROCESSING() {
        return loglevelprocessing;
    }

    /**
     * Sets the value of the loglevelprocessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOGLEVELPROCESSING(String value) {
        this.loglevelprocessing = value;
    }

    /**
     * Gets the value of the saveincoming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAVEINCOMING() {
        return saveincoming;
    }

    /**
     * Sets the value of the saveincoming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAVEINCOMING(String value) {
        this.saveincoming = value;
    }

    /**
     * Gets the value of the saveoutgoing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAVEOUTGOING() {
        return saveoutgoing;
    }

    /**
     * Sets the value of the saveoutgoing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAVEOUTGOING(String value) {
        this.saveoutgoing = value;
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
     * Gets the value of the headerincludeversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEADERINCLUDEVERSION() {
        return headerincludeversion;
    }

    /**
     * Sets the value of the headerincludeversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEADERINCLUDEVERSION(String value) {
        this.headerincludeversion = value;
    }

    /**
     * Gets the value of the superclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPERCLASS() {
        return superclass;
    }

    /**
     * Sets the value of the superclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPERCLASS(String value) {
        this.superclass = value;
    }

    /**
     * Gets the value of the destinationtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATIONTYPE() {
        return destinationtype;
    }

    /**
     * Sets the value of the destinationtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATIONTYPE(String value) {
        this.destinationtype = value;
    }

    /**
     * Gets the value of the destinationname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATIONNAME() {
        return destinationname;
    }

    /**
     * Sets the value of the destinationname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATIONNAME(String value) {
        this.destinationname = value;
    }

    /**
     * Gets the value of the connectionurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONNECTIONURL() {
        return connectionurl;
    }

    /**
     * Sets the value of the connectionurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONNECTIONURL(String value) {
        this.connectionurl = value;
    }

    /**
     * Gets the value of the connectionuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONNECTIONUSER() {
        return connectionuser;
    }

    /**
     * Sets the value of the connectionuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONNECTIONUSER(String value) {
        this.connectionuser = value;
    }

    /**
     * Gets the value of the jaxbclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJAXBCLASS() {
        return jaxbclass;
    }

    /**
     * Sets the value of the jaxbclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJAXBCLASS(String value) {
        this.jaxbclass = value;
    }

    /**
     * Gets the value of the smooksconfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMOOKSCONFIG() {
        return smooksconfig;
    }

    /**
     * Sets the value of the smooksconfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMOOKSCONFIG(String value) {
        this.smooksconfig = value;
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
     * Gets the value of the outputformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOUTPUTFORMAT() {
        return outputformat;
    }

    /**
     * Sets the value of the outputformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOUTPUTFORMAT(String value) {
        this.outputformat = value;
    }

    /**
     * Gets the value of the decimalformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDECIMALFORMAT() {
        return decimalformat;
    }

    /**
     * Sets the value of the decimalformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDECIMALFORMAT(String value) {
        this.decimalformat = value;
    }

    /**
     * Gets the value of the messagedelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESSAGEDELIMITER() {
        return messagedelimiter;
    }

    /**
     * Sets the value of the messagedelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESSAGEDELIMITER(String value) {
        this.messagedelimiter = value;
    }

    /**
     * Gets the value of the genedisegments property.
     *
     * @return
     * possible object is
     * {@link GENEDISEGMENTSType}
     *
     */
    public GENEDISEGMENTSType getGENEDISEGMENTS() {
        return genedisegments;
    }

    /**
     * Sets the value of the genedisegments property.
     *
     * @param value
     * allowed object is
     * {@link GENEDISEGMENTSType}
     *
     */
    public void setGENEDISEGMENTS(GENEDISEGMENTSType value) {
        this.genedisegments = value;
    }

    /**
     * Gets the value of the genedicleanupparameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENEDICLEANUPPARAMETERS() {
        return genedicleanupparameters;
    }

    /**
     * Sets the value of the genedicleanupparameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENEDICLEANUPPARAMETERS(String value) {
        this.genedicleanupparameters = value;
    }

    /**
     * Gets the value of the genedisearchfields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGENEDISEARCHFIELDS() {
        return genedisearchfields;
    }

    /**
     * Sets the value of the genedisearchfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGENEDISEARCHFIELDS(String value) {
        this.genedisearchfields = value;
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the msgControllingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgControllingAgency() {
        return msgControllingAgency;
    }

    /**
     * Sets the value of the msgControllingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgControllingAgency(String value) {
        this.msgControllingAgency = value;
    }

    /**
     * Gets the value of the msgMainVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgMainVersion() {
        return msgMainVersion;
    }

    /**
     * Sets the value of the msgMainVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgMainVersion(String value) {
        this.msgMainVersion = value;
    }

    /**
     * Gets the value of the msgVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgVersion() {
        return msgVersion;
    }

    /**
     * Sets the value of the msgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgVersion(String value) {
        this.msgVersion = value;
    }

    /**
     * Gets the value of the msgRelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRelease() {
        return msgRelease;
    }

    /**
     * Sets the value of the msgRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRelease(String value) {
        this.msgRelease = value;
    }

    /**
     * Gets the value of the msgSubrelease property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSubrelease() {
        return msgSubrelease;
    }

    /**
     * Sets the value of the msgSubrelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSubrelease(String value) {
        this.msgSubrelease = value;
    }

}
