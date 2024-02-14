
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 A single extension for private use.
 *             
 * 
 * <p>Java class for UBLExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UBLExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionVersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionAgencyURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionReason" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}ExtensionContent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLExtensionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", propOrder = {
    "id",
    "name",
    "extensionAgencyID",
    "extensionAgencyName",
    "extensionVersionID",
    "extensionAgencyURI",
    "extensionURI",
    "extensionReasonCode",
    "extensionReason",
    "extensionContent"
})
@XmlRootElement(name = "UBLExtension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
public class UBLExtension
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Name name;
    @XmlElement(name = "ExtensionAgencyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected ExtensionAgencyID extensionAgencyID;
    @XmlElement(name = "ExtensionAgencyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected ExtensionAgencyName extensionAgencyName;
    @XmlElement(name = "ExtensionVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected ExtensionVersionID extensionVersionID;
    @XmlElement(name = "ExtensionAgencyURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected ExtensionAgencyURI extensionAgencyURI;
    @XmlElement(name = "ExtensionURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected ExtensionURI extensionURI;
    @XmlElement(name = "ExtensionReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected ExtensionReasonCode extensionReasonCode;
    @XmlElement(name = "ExtensionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected ExtensionReason extensionReason;
    @XmlElement(name = "ExtensionContent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", required = true)
    @NotNull
    @Valid
    protected ExtensionContent extensionContent;

    /**
     * 
     *                         An identifier for the Extension assigned by the creator of the extension.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * 
     *                         A name for the Extension assigned by the creator of the extension.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * 
     *                         An agency that maintains one or more Extensions.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyID }
     *     
     */
    public ExtensionAgencyID getExtensionAgencyID() {
        return extensionAgencyID;
    }

    /**
     * Sets the value of the extensionAgencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyID }
     *     
     */
    public void setExtensionAgencyID(ExtensionAgencyID value) {
        this.extensionAgencyID = value;
    }

    /**
     * 
     *                         The name of the agency that maintains the Extension.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyName }
     *     
     */
    public ExtensionAgencyName getExtensionAgencyName() {
        return extensionAgencyName;
    }

    /**
     * Sets the value of the extensionAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyName }
     *     
     */
    public void setExtensionAgencyName(ExtensionAgencyName value) {
        this.extensionAgencyName = value;
    }

    /**
     * 
     *                         The version of the Extension.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ExtensionVersionID }
     *     
     */
    public ExtensionVersionID getExtensionVersionID() {
        return extensionVersionID;
    }

    /**
     * Sets the value of the extensionVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionVersionID }
     *     
     */
    public void setExtensionVersionID(ExtensionVersionID value) {
        this.extensionVersionID = value;
    }

    /**
     * 
     *                         A URI for the Agency that maintains the Extension.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ExtensionAgencyURI }
     *     
     */
    public ExtensionAgencyURI getExtensionAgencyURI() {
        return extensionAgencyURI;
    }

    /**
     * Sets the value of the extensionAgencyURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionAgencyURI }
     *     
     */
    public void setExtensionAgencyURI(ExtensionAgencyURI value) {
        this.extensionAgencyURI = value;
    }

    /**
     * 
     *                         A URI for the Extension.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ExtensionURI }
     *     
     */
    public ExtensionURI getExtensionURI() {
        return extensionURI;
    }

    /**
     * Sets the value of the extensionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionURI }
     *     
     */
    public void setExtensionURI(ExtensionURI value) {
        this.extensionURI = value;
    }

    /**
     * 
     *                         A code for reason the Extension is being included.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ExtensionReasonCode }
     *     
     */
    public ExtensionReasonCode getExtensionReasonCode() {
        return extensionReasonCode;
    }

    /**
     * Sets the value of the extensionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionReasonCode }
     *     
     */
    public void setExtensionReasonCode(ExtensionReasonCode value) {
        this.extensionReasonCode = value;
    }

    /**
     * 
     *                         A description of the reason for the Extension.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ExtensionReason }
     *     
     */
    public ExtensionReason getExtensionReason() {
        return extensionReason;
    }

    /**
     * Sets the value of the extensionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionReason }
     *     
     */
    public void setExtensionReason(ExtensionReason value) {
        this.extensionReason = value;
    }

    /**
     * 
     *                         The definition of the extension content.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ExtensionContent }
     *     
     */
    public ExtensionContent getExtensionContent() {
        return extensionContent;
    }

    /**
     * Sets the value of the extensionContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionContent }
     *     
     */
    public void setExtensionContent(ExtensionContent value) {
        this.extensionContent = value;
    }

}
