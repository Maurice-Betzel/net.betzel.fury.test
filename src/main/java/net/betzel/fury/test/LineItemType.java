
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
 * <p>Java class for LineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SalesOrderID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusiveLineExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTaxAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumBackorderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumBackorderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InspectionMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartialDeliveryIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BackOrderAllowedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WarrantyInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginatorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderedShipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubLineItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemPriceExtension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "salesOrderID",
    "uuid",
    "notes",
    "lineStatusCode",
    "quantity",
    "lineExtensionAmount",
    "taxInclusiveLineExtensionAmount",
    "totalTaxAmount",
    "minimumQuantity",
    "maximumQuantity",
    "minimumBackorderQuantity",
    "maximumBackorderQuantity",
    "inspectionMethodCode",
    "partialDeliveryIndicator",
    "backOrderAllowedIndicator",
    "accountingCostCode",
    "accountingCost",
    "warrantyInformations",
    "deliveries",
    "deliveryTerms",
    "originatorParty",
    "orderedShipments",
    "pricingReference",
    "allowanceCharges",
    "price",
    "item",
    "subLineItems",
    "warrantyValidityPeriod",
    "warrantyParty",
    "taxTotals",
    "itemPriceExtension",
    "lineReferences"
})
public class LineItemType
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
    @XmlElement(name = "SalesOrderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SalesOrderID salesOrderID;
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UUID uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "LineStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LineStatusCode lineStatusCode;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Quantity quantity;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LineExtensionAmount lineExtensionAmount;
    @XmlElement(name = "TaxInclusiveLineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxInclusiveLineExtensionAmount taxInclusiveLineExtensionAmount;
    @XmlElement(name = "TotalTaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalTaxAmount totalTaxAmount;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumQuantity minimumQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumQuantity maximumQuantity;
    @XmlElement(name = "MinimumBackorderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumBackorderQuantity minimumBackorderQuantity;
    @XmlElement(name = "MaximumBackorderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumBackorderQuantity maximumBackorderQuantity;
    @XmlElement(name = "InspectionMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InspectionMethodCode inspectionMethodCode;
    @XmlElement(name = "PartialDeliveryIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PartialDeliveryIndicator partialDeliveryIndicator;
    @XmlElement(name = "BackOrderAllowedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BackOrderAllowedIndicator backOrderAllowedIndicator;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCostCode accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCost accountingCost;
    @XmlElement(name = "WarrantyInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<WarrantyInformation> warrantyInformations;
    @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DeliveryType> deliveries;
    @XmlElement(name = "DeliveryTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DeliveryTerms deliveryTerms;
    @XmlElement(name = "OriginatorParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType originatorParty;
    @XmlElement(name = "OrderedShipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<OrderedShipment> orderedShipments;
    @XmlElement(name = "PricingReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PricingReference pricingReference;
    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "Price", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PriceType price;
    @XmlElement(name = "Item", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected ItemType item;
    @XmlElement(name = "SubLineItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LineItemType> subLineItems;
    @XmlElement(name = "WarrantyValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "WarrantyParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType warrantyParty;
    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "ItemPriceExtension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PriceExtensionType itemPriceExtension;
    @XmlElement(name = "LineReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LineReferenceType> lineReferences;

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
     * Gets the value of the lineStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusCode }
     *     
     */
    public LineStatusCode getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Sets the value of the lineStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusCode }
     *     
     */
    public void setLineStatusCode(LineStatusCode value) {
        this.lineStatusCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
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
     * Gets the value of the totalTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaxAmount }
     *     
     */
    public TotalTaxAmount getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Sets the value of the totalTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaxAmount }
     *     
     */
    public void setTotalTaxAmount(TotalTaxAmount value) {
        this.totalTaxAmount = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumQuantity }
     *     
     */
    public MinimumQuantity getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumQuantity }
     *     
     */
    public void setMinimumQuantity(MinimumQuantity value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumQuantity }
     *     
     */
    public MaximumQuantity getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumQuantity }
     *     
     */
    public void setMaximumQuantity(MaximumQuantity value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minimumBackorderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumBackorderQuantity }
     *     
     */
    public MinimumBackorderQuantity getMinimumBackorderQuantity() {
        return minimumBackorderQuantity;
    }

    /**
     * Sets the value of the minimumBackorderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumBackorderQuantity }
     *     
     */
    public void setMinimumBackorderQuantity(MinimumBackorderQuantity value) {
        this.minimumBackorderQuantity = value;
    }

    /**
     * Gets the value of the maximumBackorderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumBackorderQuantity }
     *     
     */
    public MaximumBackorderQuantity getMaximumBackorderQuantity() {
        return maximumBackorderQuantity;
    }

    /**
     * Sets the value of the maximumBackorderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumBackorderQuantity }
     *     
     */
    public void setMaximumBackorderQuantity(MaximumBackorderQuantity value) {
        this.maximumBackorderQuantity = value;
    }

    /**
     * Gets the value of the inspectionMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link InspectionMethodCode }
     *     
     */
    public InspectionMethodCode getInspectionMethodCode() {
        return inspectionMethodCode;
    }

    /**
     * Sets the value of the inspectionMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionMethodCode }
     *     
     */
    public void setInspectionMethodCode(InspectionMethodCode value) {
        this.inspectionMethodCode = value;
    }

    /**
     * Gets the value of the partialDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PartialDeliveryIndicator }
     *     
     */
    public PartialDeliveryIndicator getPartialDeliveryIndicator() {
        return partialDeliveryIndicator;
    }

    /**
     * Sets the value of the partialDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialDeliveryIndicator }
     *     
     */
    public void setPartialDeliveryIndicator(PartialDeliveryIndicator value) {
        this.partialDeliveryIndicator = value;
    }

    /**
     * Gets the value of the backOrderAllowedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BackOrderAllowedIndicator }
     *     
     */
    public BackOrderAllowedIndicator getBackOrderAllowedIndicator() {
        return backOrderAllowedIndicator;
    }

    /**
     * Sets the value of the backOrderAllowedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackOrderAllowedIndicator }
     *     
     */
    public void setBackOrderAllowedIndicator(BackOrderAllowedIndicator value) {
        this.backOrderAllowedIndicator = value;
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
     * Gets the value of the warrantyInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyInformation }
     * 
     * 
     */
    public List<WarrantyInformation> getWarrantyInformations() {
        if (warrantyInformations == null) {
            warrantyInformations = new ArrayList<WarrantyInformation>();
        }
        return this.warrantyInformations;
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
     * @return
     *     possible object is
     *     {@link DeliveryTerms }
     *     
     */
    public DeliveryTerms getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Sets the value of the deliveryTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTerms }
     *     
     */
    public void setDeliveryTerms(DeliveryTerms value) {
        this.deliveryTerms = value;
    }

    /**
     * Gets the value of the originatorParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOriginatorParty() {
        return originatorParty;
    }

    /**
     * Sets the value of the originatorParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOriginatorParty(PartyType value) {
        this.originatorParty = value;
    }

    /**
     * Gets the value of the orderedShipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderedShipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderedShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderedShipment }
     * 
     * 
     */
    public List<OrderedShipment> getOrderedShipments() {
        if (orderedShipments == null) {
            orderedShipments = new ArrayList<OrderedShipment>();
        }
        return this.orderedShipments;
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
     * Gets the value of the subLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getSubLineItems() {
        if (subLineItems == null) {
            subLineItems = new ArrayList<LineItemType>();
        }
        return this.subLineItems;
    }

    /**
     * Gets the value of the warrantyValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getWarrantyValidityPeriod() {
        return warrantyValidityPeriod;
    }

    /**
     * Sets the value of the warrantyValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setWarrantyValidityPeriod(PeriodType value) {
        this.warrantyValidityPeriod = value;
    }

    /**
     * Gets the value of the warrantyParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getWarrantyParty() {
        return warrantyParty;
    }

    /**
     * Sets the value of the warrantyParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setWarrantyParty(PartyType value) {
        this.warrantyParty = value;
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
     * Gets the value of the itemPriceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link PriceExtensionType }
     *     
     */
    public PriceExtensionType getItemPriceExtension() {
        return itemPriceExtension;
    }

    /**
     * Sets the value of the itemPriceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceExtensionType }
     *     
     */
    public void setItemPriceExtension(PriceExtensionType value) {
        this.itemPriceExtension = value;
    }

    /**
     * Gets the value of the lineReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getLineReferences() {
        if (lineReferences == null) {
            lineReferences = new ArrayList<LineReferenceType>();
        }
        return this.lineReferences;
    }

}
