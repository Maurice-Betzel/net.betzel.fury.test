
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
 * <p>Java class for DocumentDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DistributionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DistributionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrintQualifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CopyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumCopiesNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOriginalsNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Communication" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentDistributionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "documentTypeCode",
    "distributionTypeCode",
    "distributionTypes",
    "printQualifier",
    "copyIndicator",
    "maximumCopiesNumeric",
    "maximumOriginalsNumeric",
    "communication",
    "party"
})
public class DocumentDistributionType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "DocumentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DocumentTypeCode documentTypeCode;
    @XmlElement(name = "DistributionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DistributionTypeCode distributionTypeCode;
    @XmlElement(name = "DistributionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<DistributionType> distributionTypes;
    @XmlElement(name = "PrintQualifier", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PrintQualifier printQualifier;
    @XmlElement(name = "CopyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CopyIndicator copyIndicator;
    @XmlElement(name = "MaximumCopiesNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumCopiesNumeric maximumCopiesNumeric;
    @XmlElement(name = "MaximumOriginalsNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumOriginalsNumeric maximumOriginalsNumeric;
    @XmlElement(name = "Communication", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CommunicationType communication;
    @XmlElement(name = "Party", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected PartyType party;

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
     * Gets the value of the distributionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionTypeCode }
     *     
     */
    public DistributionTypeCode getDistributionTypeCode() {
        return distributionTypeCode;
    }

    /**
     * Sets the value of the distributionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionTypeCode }
     *     
     */
    public void setDistributionTypeCode(DistributionTypeCode value) {
        this.distributionTypeCode = value;
    }

    /**
     * Gets the value of the distributionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionType }
     * 
     * 
     */
    public List<DistributionType> getDistributionTypes() {
        if (distributionTypes == null) {
            distributionTypes = new ArrayList<DistributionType>();
        }
        return this.distributionTypes;
    }

    /**
     * Gets the value of the printQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link PrintQualifier }
     *     
     */
    public PrintQualifier getPrintQualifier() {
        return printQualifier;
    }

    /**
     * Sets the value of the printQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintQualifier }
     *     
     */
    public void setPrintQualifier(PrintQualifier value) {
        this.printQualifier = value;
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
     * Gets the value of the maximumCopiesNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumCopiesNumeric }
     *     
     */
    public MaximumCopiesNumeric getMaximumCopiesNumeric() {
        return maximumCopiesNumeric;
    }

    /**
     * Sets the value of the maximumCopiesNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumCopiesNumeric }
     *     
     */
    public void setMaximumCopiesNumeric(MaximumCopiesNumeric value) {
        this.maximumCopiesNumeric = value;
    }

    /**
     * Gets the value of the maximumOriginalsNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumOriginalsNumeric }
     *     
     */
    public MaximumOriginalsNumeric getMaximumOriginalsNumeric() {
        return maximumOriginalsNumeric;
    }

    /**
     * Sets the value of the maximumOriginalsNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumOriginalsNumeric }
     *     
     */
    public void setMaximumOriginalsNumeric(MaximumOriginalsNumeric value) {
        this.maximumOriginalsNumeric = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationType }
     *     
     */
    public CommunicationType getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationType }
     *     
     */
    public void setCommunication(CommunicationType value) {
        this.communication = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

}
