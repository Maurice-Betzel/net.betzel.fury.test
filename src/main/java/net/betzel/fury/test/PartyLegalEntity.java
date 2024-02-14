
package net.betzel.fury.test;

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
 * <p>Java class for PartyLegalEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyLegalEntityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationExpirationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SoleProprietorshipIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLiquidationStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorporateStockAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullyPaidSharesIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistrationAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CorporateRegistrationScheme" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HeadOfficeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShareholderParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyLegalEntityType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "registrationName",
    "companyID",
    "registrationDate",
    "registrationExpirationDate",
    "companyLegalFormCode",
    "companyLegalForms",
    "soleProprietorshipIndicator",
    "companyLiquidationStatusCode",
    "corporateStockAmount",
    "fullyPaidSharesIndicator",
    "registrationAddress",
    "corporateRegistrationScheme",
    "headOfficeParty",
    "shareholderParties"
})
@XmlRootElement(name = "PartyLegalEntity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class PartyLegalEntity
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RegistrationName registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CompanyID companyID;
    @XmlElement(name = "RegistrationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RegistrationDate registrationDate;
    @XmlElement(name = "RegistrationExpirationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RegistrationExpirationDate registrationExpirationDate;
    @XmlElement(name = "CompanyLegalFormCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CompanyLegalFormCode companyLegalFormCode;
    @XmlElement(name = "CompanyLegalForm", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<CompanyLegalForm> companyLegalForms;
    @XmlElement(name = "SoleProprietorshipIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SoleProprietorshipIndicator soleProprietorshipIndicator;
    @XmlElement(name = "CompanyLiquidationStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CompanyLiquidationStatusCode companyLiquidationStatusCode;
    @XmlElement(name = "CorporateStockAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CorporateStockAmount corporateStockAmount;
    @XmlElement(name = "FullyPaidSharesIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FullyPaidSharesIndicator fullyPaidSharesIndicator;
    @XmlElement(name = "RegistrationAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AddressType registrationAddress;
    @XmlElement(name = "CorporateRegistrationScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CorporateRegistrationScheme corporateRegistrationScheme;
    @XmlElement(name = "HeadOfficeParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType headOfficeParty;
    @XmlElement(name = "ShareholderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShareholderParty> shareholderParties;

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
     * Gets the value of the registrationName property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationName }
     *     
     */
    public RegistrationName getRegistrationName() {
        return registrationName;
    }

    /**
     * Sets the value of the registrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationName }
     *     
     */
    public void setRegistrationName(RegistrationName value) {
        this.registrationName = value;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyID }
     *     
     */
    public CompanyID getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyID }
     *     
     */
    public void setCompanyID(CompanyID value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDate }
     *     
     */
    public RegistrationDate getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDate }
     *     
     */
    public void setRegistrationDate(RegistrationDate value) {
        this.registrationDate = value;
    }

    /**
     * Gets the value of the registrationExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationExpirationDate }
     *     
     */
    public RegistrationExpirationDate getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }

    /**
     * Sets the value of the registrationExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationExpirationDate }
     *     
     */
    public void setRegistrationExpirationDate(RegistrationExpirationDate value) {
        this.registrationExpirationDate = value;
    }

    /**
     * Gets the value of the companyLegalFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public CompanyLegalFormCode getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * Sets the value of the companyLegalFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public void setCompanyLegalFormCode(CompanyLegalFormCode value) {
        this.companyLegalFormCode = value;
    }

    /**
     * Gets the value of the companyLegalForms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyLegalForms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyLegalForms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyLegalForm }
     * 
     * 
     */
    public List<CompanyLegalForm> getCompanyLegalForms() {
        if (companyLegalForms == null) {
            companyLegalForms = new ArrayList<CompanyLegalForm>();
        }
        return this.companyLegalForms;
    }

    /**
     * Gets the value of the soleProprietorshipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SoleProprietorshipIndicator }
     *     
     */
    public SoleProprietorshipIndicator getSoleProprietorshipIndicator() {
        return soleProprietorshipIndicator;
    }

    /**
     * Sets the value of the soleProprietorshipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoleProprietorshipIndicator }
     *     
     */
    public void setSoleProprietorshipIndicator(SoleProprietorshipIndicator value) {
        this.soleProprietorshipIndicator = value;
    }

    /**
     * Gets the value of the companyLiquidationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLiquidationStatusCode }
     *     
     */
    public CompanyLiquidationStatusCode getCompanyLiquidationStatusCode() {
        return companyLiquidationStatusCode;
    }

    /**
     * Sets the value of the companyLiquidationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLiquidationStatusCode }
     *     
     */
    public void setCompanyLiquidationStatusCode(CompanyLiquidationStatusCode value) {
        this.companyLiquidationStatusCode = value;
    }

    /**
     * Gets the value of the corporateStockAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateStockAmount }
     *     
     */
    public CorporateStockAmount getCorporateStockAmount() {
        return corporateStockAmount;
    }

    /**
     * Sets the value of the corporateStockAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateStockAmount }
     *     
     */
    public void setCorporateStockAmount(CorporateStockAmount value) {
        this.corporateStockAmount = value;
    }

    /**
     * Gets the value of the fullyPaidSharesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link FullyPaidSharesIndicator }
     *     
     */
    public FullyPaidSharesIndicator getFullyPaidSharesIndicator() {
        return fullyPaidSharesIndicator;
    }

    /**
     * Sets the value of the fullyPaidSharesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullyPaidSharesIndicator }
     *     
     */
    public void setFullyPaidSharesIndicator(FullyPaidSharesIndicator value) {
        this.fullyPaidSharesIndicator = value;
    }

    /**
     * Gets the value of the registrationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Sets the value of the registrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Gets the value of the corporateRegistrationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateRegistrationScheme }
     *     
     */
    public CorporateRegistrationScheme getCorporateRegistrationScheme() {
        return corporateRegistrationScheme;
    }

    /**
     * Sets the value of the corporateRegistrationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateRegistrationScheme }
     *     
     */
    public void setCorporateRegistrationScheme(CorporateRegistrationScheme value) {
        this.corporateRegistrationScheme = value;
    }

    /**
     * Gets the value of the headOfficeParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getHeadOfficeParty() {
        return headOfficeParty;
    }

    /**
     * Sets the value of the headOfficeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setHeadOfficeParty(PartyType value) {
        this.headOfficeParty = value;
    }

    /**
     * Gets the value of the shareholderParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholderParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholderParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareholderParty }
     * 
     * 
     */
    public List<ShareholderParty> getShareholderParties() {
        if (shareholderParties == null) {
            shareholderParties = new ArrayList<ShareholderParty>();
        }
        return this.shareholderParties;
    }

}
