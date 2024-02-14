
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmbeddedDocumentBinaryObject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmbeddedDocument" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExternalReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "embeddedDocumentBinaryObject",
    "embeddedDocument",
    "externalReference"
})
public class AttachmentType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "EmbeddedDocumentBinaryObject", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EmbeddedDocumentBinaryObject embeddedDocumentBinaryObject;
    @XmlElement(name = "EmbeddedDocument", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EmbeddedDocument embeddedDocument;
    @XmlElement(name = "ExternalReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ExternalReference externalReference;

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
     * Gets the value of the embeddedDocumentBinaryObject property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedDocumentBinaryObject }
     *     
     */
    public EmbeddedDocumentBinaryObject getEmbeddedDocumentBinaryObject() {
        return embeddedDocumentBinaryObject;
    }

    /**
     * Sets the value of the embeddedDocumentBinaryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedDocumentBinaryObject }
     *     
     */
    public void setEmbeddedDocumentBinaryObject(EmbeddedDocumentBinaryObject value) {
        this.embeddedDocumentBinaryObject = value;
    }

    /**
     * Gets the value of the embeddedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedDocument }
     *     
     */
    public EmbeddedDocument getEmbeddedDocument() {
        return embeddedDocument;
    }

    /**
     * Sets the value of the embeddedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedDocument }
     *     
     */
    public void setEmbeddedDocument(EmbeddedDocument value) {
        this.embeddedDocument = value;
    }

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReference }
     *     
     */
    public ExternalReference getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReference }
     *     
     */
    public void setExternalReference(ExternalReference value) {
        this.externalReference = value;
    }

}
