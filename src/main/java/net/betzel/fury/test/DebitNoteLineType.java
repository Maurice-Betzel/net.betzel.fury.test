
package net.betzel.fury.test;

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
 * <p>Java class for DebitNoteLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitNoteLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DebitedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusiveLineExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxPointDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DiscrepancyResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiptLineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WithholdingTaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubDebitNoteLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitNoteLineType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "uuid",
    "notes",
    "debitedQuantity",
    "lineExtensionAmount",
    "taxInclusiveLineExtensionAmount",
    "taxPointDate",
    "accountingCostCode",
    "accountingCost",
    "paymentPurposeCode",
    "discrepancyResponses",
    "despatchLineReferences",
    "receiptLineReferences",
    "billingReferences",
    "documentReferences",
    "pricingReference",
    "deliveries",
    "taxTotals",
    "withholdingTaxTotals",
    "allowanceCharges",
    "item",
    "price",
    "subDebitNoteLines"
})
public class DebitNoteLineType
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
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UUID uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "DebitedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DebitedQuantity debitedQuantity;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected LineExtensionAmount lineExtensionAmount;
    @XmlElement(name = "TaxInclusiveLineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxInclusiveLineExtensionAmount taxInclusiveLineExtensionAmount;
    @XmlElement(name = "TaxPointDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxPointDate taxPointDate;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCostCode accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCost accountingCost;
    @XmlElement(name = "PaymentPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaymentPurposeCode paymentPurposeCode;
    @XmlElement(name = "DiscrepancyResponse", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ResponseType> discrepancyResponses;
    @XmlElement(name = "DespatchLineReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LineReferenceType> despatchLineReferences;
    @XmlElement(name = "ReceiptLineReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LineReferenceType> receiptLineReferences;
    @XmlElement(name = "BillingReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<BillingReference> billingReferences;
    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "PricingReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PricingReference pricingReference;
    @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DeliveryType> deliveries;
    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "WithholdingTaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxTotalType> withholdingTaxTotals;
    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "Item", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ItemType item;
    @XmlElement(name = "Price", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PriceType price;
    @XmlElement(name = "SubDebitNoteLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DebitNoteLineType> subDebitNoteLines;

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
     * Gets the value of the debitedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DebitedQuantity }
     *     
     */
    public DebitedQuantity getDebitedQuantity() {
        return debitedQuantity;
    }

    /**
     * Sets the value of the debitedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitedQuantity }
     *     
     */
    public void setDebitedQuantity(DebitedQuantity value) {
        this.debitedQuantity = value;
    }

    /**
     * Gets the value of the lineExtensionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LineExtensionAmount }
     *     
     */
    public LineExtensionAmount getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Sets the value of the lineExtensionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineExtensionAmount }
     *     
     */
    public void setLineExtensionAmount(LineExtensionAmount value) {
        this.lineExtensionAmount = value;
    }

    /**
     * Gets the value of the taxInclusiveLineExtensionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInclusiveLineExtensionAmount }
     *     
     */
    public TaxInclusiveLineExtensionAmount getTaxInclusiveLineExtensionAmount() {
        return taxInclusiveLineExtensionAmount;
    }

    /**
     * Sets the value of the taxInclusiveLineExtensionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInclusiveLineExtensionAmount }
     *     
     */
    public void setTaxInclusiveLineExtensionAmount(TaxInclusiveLineExtensionAmount value) {
        this.taxInclusiveLineExtensionAmount = value;
    }

    /**
     * Gets the value of the taxPointDate property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPointDate }
     *     
     */
    public TaxPointDate getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * Sets the value of the taxPointDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPointDate }
     *     
     */
    public void setTaxPointDate(TaxPointDate value) {
        this.taxPointDate = value;
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
     * Gets the value of the paymentPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPurposeCode }
     *     
     */
    public PaymentPurposeCode getPaymentPurposeCode() {
        return paymentPurposeCode;
    }

    /**
     * Sets the value of the paymentPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPurposeCode }
     *     
     */
    public void setPaymentPurposeCode(PaymentPurposeCode value) {
        this.paymentPurposeCode = value;
    }

    /**
     * Gets the value of the discrepancyResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType }
     * 
     * 
     */
    public List<ResponseType> getDiscrepancyResponses() {
        if (discrepancyResponses == null) {
            discrepancyResponses = new ArrayList<ResponseType>();
        }
        return this.discrepancyResponses;
    }

    /**
     * Gets the value of the despatchLineReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despatchLineReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespatchLineReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getDespatchLineReferences() {
        if (despatchLineReferences == null) {
            despatchLineReferences = new ArrayList<LineReferenceType>();
        }
        return this.despatchLineReferences;
    }

    /**
     * Gets the value of the receiptLineReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptLineReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptLineReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getReceiptLineReferences() {
        if (receiptLineReferences == null) {
            receiptLineReferences = new ArrayList<LineReferenceType>();
        }
        return this.receiptLineReferences;
    }

    /**
     * Gets the value of the billingReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingReference }
     * 
     * 
     */
    public List<BillingReference> getBillingReferences() {
        if (billingReferences == null) {
            billingReferences = new ArrayList<BillingReference>();
        }
        return this.billingReferences;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReferences;
    }

    /**
     * Gets the value of the pricingReference property.
     * 
     * @return
     *     possible object is
     *     {@link PricingReference }
     *     
     */
    public PricingReference getPricingReference() {
        return pricingReference;
    }

    /**
     * Sets the value of the pricingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingReference }
     *     
     */
    public void setPricingReference(PricingReference value) {
        this.pricingReference = value;
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
     * Gets the value of the withholdingTaxTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdingTaxTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdingTaxTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getWithholdingTaxTotals() {
        if (withholdingTaxTotals == null) {
            withholdingTaxTotals = new ArrayList<TaxTotalType>();
        }
        return this.withholdingTaxTotals;
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
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the subDebitNoteLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDebitNoteLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDebitNoteLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebitNoteLineType }
     * 
     * 
     */
    public List<DebitNoteLineType> getSubDebitNoteLines() {
        if (subDebitNoteLines == null) {
            subDebitNoteLines = new ArrayList<DebitNoteLineType>();
        }
        return this.subDebitNoteLines;
    }

}
