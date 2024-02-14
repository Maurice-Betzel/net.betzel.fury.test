
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FormatID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VersionID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SchemaURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentMetadataType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "formatID",
    "versionID",
    "schemaURI",
    "documentTypeCode"
})
public class DocumentMetadataType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "FormatID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected FormatID formatID;
    @XmlElement(name = "VersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected VersionID versionID;
    @XmlElement(name = "SchemaURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SchemaURI schemaURI;
    @XmlElement(name = "DocumentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DocumentTypeCode documentTypeCode;

    /**
     * Gets the value of the ublExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link UBLExtensions }
     *     
     */
    public UBLExtensions getUBLExtensions() {
        return ublExtensions;
    }

    /**
     * Sets the value of the ublExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLExtensions }
     *     
     */
    public void setUBLExtensions(UBLExtensions value) {
        this.ublExtensions = value;
    }

    /**
     * Gets the value of the id property.
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
     * Gets the value of the formatID property.
     * 
     * @return
     *     possible object is
     *     {@link FormatID }
     *     
     */
    public FormatID getFormatID() {
        return formatID;
    }

    /**
     * Sets the value of the formatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatID }
     *     
     */
    public void setFormatID(FormatID value) {
        this.formatID = value;
    }

    /**
     * Gets the value of the versionID property.
     * 
     * @return
     *     possible object is
     *     {@link VersionID }
     *     
     */
    public VersionID getVersionID() {
        return versionID;
    }

    /**
     * Sets the value of the versionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionID }
     *     
     */
    public void setVersionID(VersionID value) {
        this.versionID = value;
    }

    /**
     * Gets the value of the schemaURI property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaURI }
     *     
     */
    public SchemaURI getSchemaURI() {
        return schemaURI;
    }

    /**
     * Sets the value of the schemaURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaURI }
     *     
     */
    public void setSchemaURI(SchemaURI value) {
        this.schemaURI = value;
    }

    /**
     * Gets the value of the documentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeCode }
     *     
     */
    public DocumentTypeCode getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeCode }
     *     
     */
    public void setDocumentTypeCode(DocumentTypeCode value) {
        this.documentTypeCode = value;
    }

}
