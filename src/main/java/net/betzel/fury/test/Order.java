
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UBLVersionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomizationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProfileExecutionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SalesOrderID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CopyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedInvoiceCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PricingCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomerReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineCountNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}QuotationDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginatorDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contract" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProjectReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Signature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyerCustomerParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginatorCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightForwarderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccountingCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransactionConditions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DestinationCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AnticipatedMonetaryTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderLine" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:Order-2", propOrder = {
    "ublExtensions",
    "ublVersionID",
    "customizationID",
    "profileID",
    "profileExecutionID",
    "id",
    "salesOrderID",
    "copyIndicator",
    "uuid",
    "issueDate",
    "issueTime",
    "orderTypeCode",
    "notes",
    "requestedInvoiceCurrencyCode",
    "documentCurrencyCode",
    "pricingCurrencyCode",
    "taxCurrencyCode",
    "customerReference",
    "accountingCostCode",
    "accountingCost",
    "lineCountNumeric",
    "validityPeriods",
    "quotationDocumentReference",
    "orderDocumentReferences",
    "originatorDocumentReference",
    "catalogueReference",
    "additionalDocumentReferences",
    "contracts",
    "projectReferences",
    "signatures",
    "buyerCustomerParty",
    "sellerSupplierParty",
    "originatorCustomerParty",
    "freightForwarderParty",
    "accountingCustomerParty",
    "deliveries",
    "deliveryTerms",
    "paymentMeans",
    "paymentTerms",
    "transactionConditions",
    "allowanceCharges",
    "taxExchangeRate",
    "pricingExchangeRate",
    "paymentExchangeRate",
    "destinationCountry",
    "taxTotals",
    "anticipatedMonetaryTotal",
    "orderLines"
})
@XmlRootElement(name = "Order", namespace = "urn:oasis:names:specification:ubl:schema:xsd:Order-2")
public class Order
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "UBLVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UBLVersionID ublVersionID;
    @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CustomizationID customizationID;
    @XmlElement(name = "ProfileID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ProfileID profileID;
    @XmlElement(name = "ProfileExecutionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ProfileExecutionID profileExecutionID;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ID id;
    @XmlElement(name = "SalesOrderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SalesOrderID salesOrderID;
    @XmlElement(name = "CopyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CopyIndicator copyIndicator;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UUID uuid;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected IssueDate issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IssueTime issueTime;
    @XmlElement(name = "OrderTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OrderTypeCode orderTypeCode;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "RequestedInvoiceCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequestedInvoiceCurrencyCode requestedInvoiceCurrencyCode;
    @XmlElement(name = "DocumentCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DocumentCurrencyCode documentCurrencyCode;
    @XmlElement(name = "PricingCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PricingCurrencyCode pricingCurrencyCode;
    @XmlElement(name = "TaxCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxCurrencyCode taxCurrencyCode;
    @XmlElement(name = "CustomerReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CustomerReference customerReference;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCostCode accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCost accountingCost;
    @XmlElement(name = "LineCountNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LineCountNumeric lineCountNumeric;
    @XmlElement(name = "ValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PeriodType> validityPeriods;
    @XmlElement(name = "QuotationDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType quotationDocumentReference;
    @XmlElement(name = "OrderDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> orderDocumentReferences;
    @XmlElement(name = "OriginatorDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType originatorDocumentReference;
    @XmlElement(name = "CatalogueReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CatalogueReferenceType catalogueReference;
    @XmlElement(name = "AdditionalDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> additionalDocumentReferences;
    @XmlElement(name = "Contract", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ContractType> contracts;
    @XmlElement(name = "ProjectReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ProjectReference> projectReferences;
    @XmlElement(name = "Signature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<Signature> signatures;
    @XmlElement(name = "BuyerCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected CustomerPartyType buyerCustomerParty;
    @XmlElement(name = "SellerSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "OriginatorCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CustomerPartyType originatorCustomerParty;
    @XmlElement(name = "FreightForwarderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType freightForwarderParty;
    @XmlElement(name = "AccountingCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CustomerPartyType accountingCustomerParty;
    @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DeliveryType> deliveries;
    @XmlElement(name = "DeliveryTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DeliveryTerms> deliveryTerms;
    @XmlElement(name = "PaymentMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PaymentMeans> paymentMeans;
    @XmlElement(name = "PaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "TransactionConditions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransactionConditions transactionConditions;
    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "TaxExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ExchangeRateType taxExchangeRate;
    @XmlElement(name = "PricingExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ExchangeRateType pricingExchangeRate;
    @XmlElement(name = "PaymentExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ExchangeRateType paymentExchangeRate;
    @XmlElement(name = "DestinationCountry", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CountryType destinationCountry;
    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "AnticipatedMonetaryTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected MonetaryTotalType anticipatedMonetaryTotal;
    @XmlElement(name = "OrderLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<OrderLine> orderLines;

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
     * Gets the value of the ublVersionID property.
     * 
     * @return
     *     possible object is
     *     {@link UBLVersionID }
     *     
     */
    public UBLVersionID getUBLVersionID() {
        return ublVersionID;
    }

    /**
     * Sets the value of the ublVersionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLVersionID }
     *     
     */
    public void setUBLVersionID(UBLVersionID value) {
        this.ublVersionID = value;
    }

    /**
     * Gets the value of the customizationID property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationID }
     *     
     */
    public CustomizationID getCustomizationID() {
        return customizationID;
    }

    /**
     * Sets the value of the customizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationID }
     *     
     */
    public void setCustomizationID(CustomizationID value) {
        this.customizationID = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileID }
     *     
     */
    public ProfileID getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileID }
     *     
     */
    public void setProfileID(ProfileID value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the profileExecutionID property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileExecutionID }
     *     
     */
    public ProfileExecutionID getProfileExecutionID() {
        return profileExecutionID;
    }

    /**
     * Sets the value of the profileExecutionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileExecutionID }
     *     
     */
    public void setProfileExecutionID(ProfileExecutionID value) {
        this.profileExecutionID = value;
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
     * Gets the value of the salesOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderID }
     *     
     */
    public SalesOrderID getSalesOrderID() {
        return salesOrderID;
    }

    /**
     * Sets the value of the salesOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderID }
     *     
     */
    public void setSalesOrderID(SalesOrderID value) {
        this.salesOrderID = value;
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
     * Gets the value of the orderTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrderTypeCode }
     *     
     */
    public OrderTypeCode getOrderTypeCode() {
        return orderTypeCode;
    }

    /**
     * Sets the value of the orderTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTypeCode }
     *     
     */
    public void setOrderTypeCode(OrderTypeCode value) {
        this.orderTypeCode = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the requestedInvoiceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedInvoiceCurrencyCode }
     *     
     */
    public RequestedInvoiceCurrencyCode getRequestedInvoiceCurrencyCode() {
        return requestedInvoiceCurrencyCode;
    }

    /**
     * Sets the value of the requestedInvoiceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedInvoiceCurrencyCode }
     *     
     */
    public void setRequestedInvoiceCurrencyCode(RequestedInvoiceCurrencyCode value) {
        this.requestedInvoiceCurrencyCode = value;
    }

    /**
     * Gets the value of the documentCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentCurrencyCode }
     *     
     */
    public DocumentCurrencyCode getDocumentCurrencyCode() {
        return documentCurrencyCode;
    }

    /**
     * Sets the value of the documentCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentCurrencyCode }
     *     
     */
    public void setDocumentCurrencyCode(DocumentCurrencyCode value) {
        this.documentCurrencyCode = value;
    }

    /**
     * Gets the value of the pricingCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link PricingCurrencyCode }
     *     
     */
    public PricingCurrencyCode getPricingCurrencyCode() {
        return pricingCurrencyCode;
    }

    /**
     * Sets the value of the pricingCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingCurrencyCode }
     *     
     */
    public void setPricingCurrencyCode(PricingCurrencyCode value) {
        this.pricingCurrencyCode = value;
    }

    /**
     * Gets the value of the taxCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCurrencyCode }
     *     
     */
    public TaxCurrencyCode getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    /**
     * Sets the value of the taxCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCurrencyCode }
     *     
     */
    public void setTaxCurrencyCode(TaxCurrencyCode value) {
        this.taxCurrencyCode = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReference }
     *     
     */
    public CustomerReference getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReference }
     *     
     */
    public void setCustomerReference(CustomerReference value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the accountingCostCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingCostCode }
     *     
     */
    public AccountingCostCode getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * Sets the value of the accountingCostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCostCode }
     *     
     */
    public void setAccountingCostCode(AccountingCostCode value) {
        this.accountingCostCode = value;
    }

    /**
     * Gets the value of the accountingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingCost }
     *     
     */
    public AccountingCost getAccountingCost() {
        return accountingCost;
    }

    /**
     * Sets the value of the accountingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCost }
     *     
     */
    public void setAccountingCost(AccountingCost value) {
        this.accountingCost = value;
    }

    /**
     * Gets the value of the lineCountNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link LineCountNumeric }
     *     
     */
    public LineCountNumeric getLineCountNumeric() {
        return lineCountNumeric;
    }

    /**
     * Sets the value of the lineCountNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineCountNumeric }
     *     
     */
    public void setLineCountNumeric(LineCountNumeric value) {
        this.lineCountNumeric = value;
    }

    /**
     * Gets the value of the validityPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validityPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getValidityPeriods() {
        if (validityPeriods == null) {
            validityPeriods = new ArrayList<PeriodType>();
        }
        return this.validityPeriods;
    }

    /**
     * Gets the value of the quotationDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getQuotationDocumentReference() {
        return quotationDocumentReference;
    }

    /**
     * Sets the value of the quotationDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setQuotationDocumentReference(DocumentReferenceType value) {
        this.quotationDocumentReference = value;
    }

    /**
     * Gets the value of the orderDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getOrderDocumentReferences() {
        if (orderDocumentReferences == null) {
            orderDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.orderDocumentReferences;
    }

    /**
     * Gets the value of the originatorDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getOriginatorDocumentReference() {
        return originatorDocumentReference;
    }

    /**
     * Sets the value of the originatorDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setOriginatorDocumentReference(DocumentReferenceType value) {
        this.originatorDocumentReference = value;
    }

    /**
     * Gets the value of the catalogueReference property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogueReferenceType }
     *     
     */
    public CatalogueReferenceType getCatalogueReference() {
        return catalogueReference;
    }

    /**
     * Sets the value of the catalogueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogueReferenceType }
     *     
     */
    public void setCatalogueReference(CatalogueReferenceType value) {
        this.catalogueReference = value;
    }

    /**
     * Gets the value of the additionalDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getAdditionalDocumentReferences() {
        if (additionalDocumentReferences == null) {
            additionalDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.additionalDocumentReferences;
    }

    /**
     * Gets the value of the contracts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contracts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContracts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractType }
     * 
     * 
     */
    public List<ContractType> getContracts() {
        if (contracts == null) {
            contracts = new ArrayList<ContractType>();
        }
        return this.contracts;
    }

    /**
     * Gets the value of the projectReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectReference }
     * 
     * 
     */
    public List<ProjectReference> getProjectReferences() {
        if (projectReferences == null) {
            projectReferences = new ArrayList<ProjectReference>();
        }
        return this.projectReferences;
    }

    /**
     * Gets the value of the signatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signature }
     * 
     * 
     */
    public List<Signature> getSignatures() {
        if (signatures == null) {
            signatures = new ArrayList<Signature>();
        }
        return this.signatures;
    }

    /**
     * Gets the value of the buyerCustomerParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getBuyerCustomerParty() {
        return buyerCustomerParty;
    }

    /**
     * Sets the value of the buyerCustomerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setBuyerCustomerParty(CustomerPartyType value) {
        this.buyerCustomerParty = value;
    }

    /**
     * Gets the value of the sellerSupplierParty property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Sets the value of the sellerSupplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSellerSupplierParty(SupplierPartyType value) {
        this.sellerSupplierParty = value;
    }

    /**
     * Gets the value of the originatorCustomerParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getOriginatorCustomerParty() {
        return originatorCustomerParty;
    }

    /**
     * Sets the value of the originatorCustomerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setOriginatorCustomerParty(CustomerPartyType value) {
        this.originatorCustomerParty = value;
    }

    /**
     * Gets the value of the freightForwarderParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFreightForwarderParty() {
        return freightForwarderParty;
    }

    /**
     * Sets the value of the freightForwarderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFreightForwarderParty(PartyType value) {
        this.freightForwarderParty = value;
    }

    /**
     * Gets the value of the accountingCustomerParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getAccountingCustomerParty() {
        return accountingCustomerParty;
    }

    /**
     * Sets the value of the accountingCustomerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setAccountingCustomerParty(CustomerPartyType value) {
        this.accountingCustomerParty = value;
    }

    /**
     * Gets the value of the deliveries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryType }
     * 
     * 
     */
    public List<DeliveryType> getDeliveries() {
        if (deliveries == null) {
            deliveries = new ArrayList<DeliveryType>();
        }
        return this.deliveries;
    }

    /**
     * Gets the value of the deliveryTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryTerms }
     * 
     * 
     */
    public List<DeliveryTerms> getDeliveryTerms() {
        if (deliveryTerms == null) {
            deliveryTerms = new ArrayList<DeliveryTerms>();
        }
        return this.deliveryTerms;
    }

    /**
     * Gets the value of the paymentMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeans }
     * 
     * 
     */
    public List<PaymentMeans> getPaymentMeans() {
        if (paymentMeans == null) {
            paymentMeans = new ArrayList<PaymentMeans>();
        }
        return this.paymentMeans;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the transactionConditions property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionConditions }
     *     
     */
    public TransactionConditions getTransactionConditions() {
        return transactionConditions;
    }

    /**
     * Sets the value of the transactionConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionConditions }
     *     
     */
    public void setTransactionConditions(TransactionConditions value) {
        this.transactionConditions = value;
    }

    /**
     * Gets the value of the allowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getAllowanceCharges() {
        if (allowanceCharges == null) {
            allowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharges;
    }

    /**
     * Gets the value of the taxExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getTaxExchangeRate() {
        return taxExchangeRate;
    }

    /**
     * Sets the value of the taxExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setTaxExchangeRate(ExchangeRateType value) {
        this.taxExchangeRate = value;
    }

    /**
     * Gets the value of the pricingExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getPricingExchangeRate() {
        return pricingExchangeRate;
    }

    /**
     * Sets the value of the pricingExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setPricingExchangeRate(ExchangeRateType value) {
        this.pricingExchangeRate = value;
    }

    /**
     * Gets the value of the paymentExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getPaymentExchangeRate() {
        return paymentExchangeRate;
    }

    /**
     * Sets the value of the paymentExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setPaymentExchangeRate(ExchangeRateType value) {
        this.paymentExchangeRate = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setDestinationCountry(CountryType value) {
        this.destinationCountry = value;
    }

    /**
     * Gets the value of the taxTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotals() {
        if (taxTotals == null) {
            taxTotals = new ArrayList<TaxTotalType>();
        }
        return this.taxTotals;
    }

    /**
     * Gets the value of the anticipatedMonetaryTotal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryTotalType }
     *     
     */
    public MonetaryTotalType getAnticipatedMonetaryTotal() {
        return anticipatedMonetaryTotal;
    }

    /**
     * Sets the value of the anticipatedMonetaryTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryTotalType }
     *     
     */
    public void setAnticipatedMonetaryTotal(MonetaryTotalType value) {
        this.anticipatedMonetaryTotal = value;
    }

    /**
     * Gets the value of the orderLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLine }
     * 
     * 
     */
    public List<OrderLine> getOrderLines() {
        if (orderLines == null) {
            orderLines = new ArrayList<OrderLine>();
        }
        return this.orderLines;
    }

}
