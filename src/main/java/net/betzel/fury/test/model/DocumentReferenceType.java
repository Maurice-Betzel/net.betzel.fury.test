
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CopyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}XPath" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferencedDocumentInternalAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LanguageID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LocaleCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Attachment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResultOfVerification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReferenceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "copyIndicator",
    "uuid",
    "issueDate",
    "issueTime",
    "documentTypeCode",
    "documentTypes",
    "xPaths",
    "referencedDocumentInternalAddress",
    "languageID",
    "localeCode",
    "versionID",
    "documentStatusCode",
    "documentDescriptions",
    "attachment",
    "validityPeriod",
    "issuerParty",
    "resultOfVerification"
})
public class DocumentReferenceType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ID id;
    @XmlElement(name = "CopyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CopyIndicator copyIndicator;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UUID uuid;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IssueDate issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IssueTime issueTime;
    @XmlElement(name = "DocumentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DocumentTypeCode documentTypeCode;
    @XmlElement(name = "DocumentType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<DocumentType> documentTypes;
    @XmlElement(name = "XPath", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<XPath> xPaths;
    @XmlElement(name = "ReferencedDocumentInternalAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReferencedDocumentInternalAddress referencedDocumentInternalAddress;
    @XmlElement(name = "LanguageID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LanguageID languageID;
    @XmlElement(name = "LocaleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LocaleCode localeCode;
    @XmlElement(name = "VersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected VersionID versionID;
    @XmlElement(name = "DocumentStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DocumentStatusCode documentStatusCode;
    @XmlElement(name = "DocumentDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<DocumentDescription> documentDescriptions;
    @XmlElement(name = "Attachment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AttachmentType attachment;
    @XmlElement(name = "ValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType validityPeriod;
    @XmlElement(name = "IssuerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType issuerParty;
    @XmlElement(name = "ResultOfVerification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ResultOfVerification resultOfVerification;

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
     * Gets the value of the copyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CopyIndicator }
     *     
     */
    public CopyIndicator getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Sets the value of the copyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyIndicator }
     *     
     */
    public void setCopyIndicator(CopyIndicator value) {
        this.copyIndicator = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link IssueDate }
     *     
     */
    public IssueDate getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDate }
     *     
     */
    public void setIssueDate(IssueDate value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issueTime property.
     * 
     * @return
     *     possible object is
     *     {@link IssueTime }
     *     
     */
    public IssueTime getIssueTime() {
        return issueTime;
    }

    /**
     * Sets the value of the issueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTime }
     *     
     */
    public void setIssueTime(IssueTime value) {
        this.issueTime = value;
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

    /**
     * Gets the value of the documentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocumentTypes() {
        if (documentTypes == null) {
            documentTypes = new ArrayList<DocumentType>();
        }
        return this.documentTypes;
    }

    /**
     * Gets the value of the xPaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xPaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXPaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XPath }
     * 
     * 
     */
    public List<XPath> getXPaths() {
        if (xPaths == null) {
            xPaths = new ArrayList<XPath>();
        }
        return this.xPaths;
    }

    /**
     * Gets the value of the referencedDocumentInternalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencedDocumentInternalAddress }
     *     
     */
    public ReferencedDocumentInternalAddress getReferencedDocumentInternalAddress() {
        return referencedDocumentInternalAddress;
    }

    /**
     * Sets the value of the referencedDocumentInternalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencedDocumentInternalAddress }
     *     
     */
    public void setReferencedDocumentInternalAddress(ReferencedDocumentInternalAddress value) {
        this.referencedDocumentInternalAddress = value;
    }

    /**
     * Gets the value of the languageID property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageID }
     *     
     */
    public LanguageID getLanguageID() {
        return languageID;
    }

    /**
     * Sets the value of the languageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageID }
     *     
     */
    public void setLanguageID(LanguageID value) {
        this.languageID = value;
    }

    /**
     * Gets the value of the localeCode property.
     * 
     * @return
     *     possible object is
     *     {@link LocaleCode }
     *     
     */
    public LocaleCode getLocaleCode() {
        return localeCode;
    }

    /**
     * Sets the value of the localeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocaleCode }
     *     
     */
    public void setLocaleCode(LocaleCode value) {
        this.localeCode = value;
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
     * Gets the value of the documentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStatusCode }
     *     
     */
    public DocumentStatusCode getDocumentStatusCode() {
        return documentStatusCode;
    }

    /**
     * Sets the value of the documentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStatusCode }
     *     
     */
    public void setDocumentStatusCode(DocumentStatusCode value) {
        this.documentStatusCode = value;
    }

    /**
     * Gets the value of the documentDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentDescription }
     * 
     * 
     */
    public List<DocumentDescription> getDocumentDescriptions() {
        if (documentDescriptions == null) {
            documentDescriptions = new ArrayList<DocumentDescription>();
        }
        return this.documentDescriptions;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setAttachment(AttachmentType value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
    }

    /**
     * Gets the value of the issuerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getIssuerParty() {
        return issuerParty;
    }

    /**
     * Sets the value of the issuerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setIssuerParty(PartyType value) {
        this.issuerParty = value;
    }

    /**
     * Gets the value of the resultOfVerification property.
     * 
     * @return
     *     possible object is
     *     {@link ResultOfVerification }
     *     
     */
    public ResultOfVerification getResultOfVerification() {
        return resultOfVerification;
    }

    /**
     * Sets the value of the resultOfVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfVerification }
     *     
     */
    public void setResultOfVerification(ResultOfVerification value) {
        this.resultOfVerification = value;
    }

}
