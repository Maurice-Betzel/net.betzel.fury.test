
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImmobilizedSecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmobilizedSecurityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ImmobilizationCertificateID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SecurityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FaceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarketValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SharesNumberQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImmobilizedSecurityType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "immobilizationCertificateID",
    "securityID",
    "issueDate",
    "faceValueAmount",
    "marketValueAmount",
    "sharesNumberQuantity",
    "issuerParty"
})
@XmlRootElement(name = "ImmobilizedSecurity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ImmobilizedSecurity
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ImmobilizationCertificateID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ImmobilizationCertificateID immobilizationCertificateID;
    @XmlElement(name = "SecurityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SecurityID securityID;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IssueDate issueDate;
    @XmlElement(name = "FaceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FaceValueAmount faceValueAmount;
    @XmlElement(name = "MarketValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MarketValueAmount marketValueAmount;
    @XmlElement(name = "SharesNumberQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SharesNumberQuantity sharesNumberQuantity;
    @XmlElement(name = "IssuerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType issuerParty;

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
     * Gets the value of the immobilizationCertificateID property.
     * 
     * @return
     *     possible object is
     *     {@link ImmobilizationCertificateID }
     *     
     */
    public ImmobilizationCertificateID getImmobilizationCertificateID() {
        return immobilizationCertificateID;
    }

    /**
     * Sets the value of the immobilizationCertificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmobilizationCertificateID }
     *     
     */
    public void setImmobilizationCertificateID(ImmobilizationCertificateID value) {
        this.immobilizationCertificateID = value;
    }

    /**
     * Gets the value of the securityID property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityID }
     *     
     */
    public SecurityID getSecurityID() {
        return securityID;
    }

    /**
     * Sets the value of the securityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityID }
     *     
     */
    public void setSecurityID(SecurityID value) {
        this.securityID = value;
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
     * Gets the value of the faceValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FaceValueAmount }
     *     
     */
    public FaceValueAmount getFaceValueAmount() {
        return faceValueAmount;
    }

    /**
     * Sets the value of the faceValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaceValueAmount }
     *     
     */
    public void setFaceValueAmount(FaceValueAmount value) {
        this.faceValueAmount = value;
    }

    /**
     * Gets the value of the marketValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MarketValueAmount }
     *     
     */
    public MarketValueAmount getMarketValueAmount() {
        return marketValueAmount;
    }

    /**
     * Sets the value of the marketValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketValueAmount }
     *     
     */
    public void setMarketValueAmount(MarketValueAmount value) {
        this.marketValueAmount = value;
    }

    /**
     * Gets the value of the sharesNumberQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link SharesNumberQuantity }
     *     
     */
    public SharesNumberQuantity getSharesNumberQuantity() {
        return sharesNumberQuantity;
    }

    /**
     * Sets the value of the sharesNumberQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharesNumberQuantity }
     *     
     */
    public void setSharesNumberQuantity(SharesNumberQuantity value) {
        this.sharesNumberQuantity = value;
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

}
