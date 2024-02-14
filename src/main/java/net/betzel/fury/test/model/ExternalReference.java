
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}URI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentHash" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HashAlgorithmMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MimeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FormatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EncodingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CharacterSetCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FileName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalReferenceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "uri",
    "documentHash",
    "hashAlgorithmMethod",
    "expiryDate",
    "expiryTime",
    "mimeCode",
    "formatCode",
    "encodingCode",
    "characterSetCode",
    "fileName",
    "descriptions"
})
@XmlRootElement(name = "ExternalReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ExternalReference
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "URI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected URI uri;
    @XmlElement(name = "DocumentHash", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DocumentHash documentHash;
    @XmlElement(name = "HashAlgorithmMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HashAlgorithmMethod hashAlgorithmMethod;
    @XmlElement(name = "ExpiryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpiryDate expiryDate;
    @XmlElement(name = "ExpiryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpiryTime expiryTime;
    @XmlElement(name = "MimeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MimeCode mimeCode;
    @XmlElement(name = "FormatCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FormatCode formatCode;
    @XmlElement(name = "EncodingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EncodingCode encodingCode;
    @XmlElement(name = "CharacterSetCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CharacterSetCode characterSetCode;
    @XmlElement(name = "FileName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FileName fileName;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;

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
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    public URI getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     */
    public void setURI(URI value) {
        this.uri = value;
    }

    /**
     * Gets the value of the documentHash property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHash }
     *     
     */
    public DocumentHash getDocumentHash() {
        return documentHash;
    }

    /**
     * Sets the value of the documentHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHash }
     *     
     */
    public void setDocumentHash(DocumentHash value) {
        this.documentHash = value;
    }

    /**
     * Gets the value of the hashAlgorithmMethod property.
     * 
     * @return
     *     possible object is
     *     {@link HashAlgorithmMethod }
     *     
     */
    public HashAlgorithmMethod getHashAlgorithmMethod() {
        return hashAlgorithmMethod;
    }

    /**
     * Sets the value of the hashAlgorithmMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashAlgorithmMethod }
     *     
     */
    public void setHashAlgorithmMethod(HashAlgorithmMethod value) {
        this.hashAlgorithmMethod = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryDate }
     *     
     */
    public ExpiryDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryDate }
     *     
     */
    public void setExpiryDate(ExpiryDate value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryTime }
     *     
     */
    public ExpiryTime getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryTime }
     *     
     */
    public void setExpiryTime(ExpiryTime value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the mimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MimeCode }
     *     
     */
    public MimeCode getMimeCode() {
        return mimeCode;
    }

    /**
     * Sets the value of the mimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeCode }
     *     
     */
    public void setMimeCode(MimeCode value) {
        this.mimeCode = value;
    }

    /**
     * Gets the value of the formatCode property.
     * 
     * @return
     *     possible object is
     *     {@link FormatCode }
     *     
     */
    public FormatCode getFormatCode() {
        return formatCode;
    }

    /**
     * Sets the value of the formatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatCode }
     *     
     */
    public void setFormatCode(FormatCode value) {
        this.formatCode = value;
    }

    /**
     * Gets the value of the encodingCode property.
     * 
     * @return
     *     possible object is
     *     {@link EncodingCode }
     *     
     */
    public EncodingCode getEncodingCode() {
        return encodingCode;
    }

    /**
     * Sets the value of the encodingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncodingCode }
     *     
     */
    public void setEncodingCode(EncodingCode value) {
        this.encodingCode = value;
    }

    /**
     * Gets the value of the characterSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSetCode }
     *     
     */
    public CharacterSetCode getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * Sets the value of the characterSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSetCode }
     *     
     */
    public void setCharacterSetCode(CharacterSetCode value) {
        this.characterSetCode = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link FileName }
     *     
     */
    public FileName getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileName }
     *     
     */
    public void setFileName(FileName value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

}
