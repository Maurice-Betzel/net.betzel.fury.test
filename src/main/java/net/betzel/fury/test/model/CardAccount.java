
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
 * <p>Java class for CardAccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAccountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrimaryAccountNumberID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetworkID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CardTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidityStartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpiryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssuerID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueNumberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CV2ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CardChipCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChipApplicationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HolderName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccountType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "primaryAccountNumberID",
    "networkID",
    "cardTypeCode",
    "validityStartDate",
    "expiryDate",
    "issuerID",
    "issueNumberID",
    "cv2ID",
    "cardChipCode",
    "chipApplicationID",
    "holderName",
    "roleCode"
})
@XmlRootElement(name = "CardAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class CardAccount
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "PrimaryAccountNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected PrimaryAccountNumberID primaryAccountNumberID;
    @XmlElement(name = "NetworkID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected NetworkID networkID;
    @XmlElement(name = "CardTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CardTypeCode cardTypeCode;
    @XmlElement(name = "ValidityStartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidityStartDate validityStartDate;
    @XmlElement(name = "ExpiryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpiryDate expiryDate;
    @XmlElement(name = "IssuerID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IssuerID issuerID;
    @XmlElement(name = "IssueNumberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IssueNumberID issueNumberID;
    @XmlElement(name = "CV2ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CV2ID cv2ID;
    @XmlElement(name = "CardChipCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CardChipCode cardChipCode;
    @XmlElement(name = "ChipApplicationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ChipApplicationID chipApplicationID;
    @XmlElement(name = "HolderName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HolderName holderName;
    @XmlElement(name = "RoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RoleCode roleCode;

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
     * Gets the value of the primaryAccountNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAccountNumberID }
     *     
     */
    public PrimaryAccountNumberID getPrimaryAccountNumberID() {
        return primaryAccountNumberID;
    }

    /**
     * Sets the value of the primaryAccountNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAccountNumberID }
     *     
     */
    public void setPrimaryAccountNumberID(PrimaryAccountNumberID value) {
        this.primaryAccountNumberID = value;
    }

    /**
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkID }
     *     
     */
    public NetworkID getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkID }
     *     
     */
    public void setNetworkID(NetworkID value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the cardTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeCode }
     *     
     */
    public CardTypeCode getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * Sets the value of the cardTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeCode }
     *     
     */
    public void setCardTypeCode(CardTypeCode value) {
        this.cardTypeCode = value;
    }

    /**
     * Gets the value of the validityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityStartDate }
     *     
     */
    public ValidityStartDate getValidityStartDate() {
        return validityStartDate;
    }

    /**
     * Sets the value of the validityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityStartDate }
     *     
     */
    public void setValidityStartDate(ValidityStartDate value) {
        this.validityStartDate = value;
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
     * Gets the value of the issuerID property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerID }
     *     
     */
    public IssuerID getIssuerID() {
        return issuerID;
    }

    /**
     * Sets the value of the issuerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerID }
     *     
     */
    public void setIssuerID(IssuerID value) {
        this.issuerID = value;
    }

    /**
     * Gets the value of the issueNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IssueNumberID }
     *     
     */
    public IssueNumberID getIssueNumberID() {
        return issueNumberID;
    }

    /**
     * Sets the value of the issueNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueNumberID }
     *     
     */
    public void setIssueNumberID(IssueNumberID value) {
        this.issueNumberID = value;
    }

    /**
     * Gets the value of the cv2ID property.
     * 
     * @return
     *     possible object is
     *     {@link CV2ID }
     *     
     */
    public CV2ID getCV2ID() {
        return cv2ID;
    }

    /**
     * Sets the value of the cv2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV2ID }
     *     
     */
    public void setCV2ID(CV2ID value) {
        this.cv2ID = value;
    }

    /**
     * Gets the value of the cardChipCode property.
     * 
     * @return
     *     possible object is
     *     {@link CardChipCode }
     *     
     */
    public CardChipCode getCardChipCode() {
        return cardChipCode;
    }

    /**
     * Sets the value of the cardChipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardChipCode }
     *     
     */
    public void setCardChipCode(CardChipCode value) {
        this.cardChipCode = value;
    }

    /**
     * Gets the value of the chipApplicationID property.
     * 
     * @return
     *     possible object is
     *     {@link ChipApplicationID }
     *     
     */
    public ChipApplicationID getChipApplicationID() {
        return chipApplicationID;
    }

    /**
     * Sets the value of the chipApplicationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipApplicationID }
     *     
     */
    public void setChipApplicationID(ChipApplicationID value) {
        this.chipApplicationID = value;
    }

    /**
     * Gets the value of the holderName property.
     * 
     * @return
     *     possible object is
     *     {@link HolderName }
     *     
     */
    public HolderName getHolderName() {
        return holderName;
    }

    /**
     * Sets the value of the holderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HolderName }
     *     
     */
    public void setHolderName(HolderName value) {
        this.holderName = value;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleCode }
     *     
     */
    public RoleCode getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCode }
     *     
     */
    public void setRoleCode(RoleCode value) {
        this.roleCode = value;
    }

}
