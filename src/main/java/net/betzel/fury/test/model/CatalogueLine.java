
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogueLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CatalogueLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractSubdivision" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableUnit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContentUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderQuantityIncrementNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WarrantyInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractorCustomerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellerSupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LineValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemComparison" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ComponentRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AccessoryRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacementRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ComplementaryRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacedRelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredItemLocationQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}KeywordItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersLineReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueLineType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "actionCode",
    "lifeCycleStatusCode",
    "contractSubdivision",
    "notes",
    "orderableIndicator",
    "orderableUnit",
    "contentUnitQuantity",
    "orderQuantityIncrementNumeric",
    "minimumOrderQuantity",
    "maximumOrderQuantity",
    "warrantyInformations",
    "packLevelCode",
    "contractorCustomerParty",
    "sellerSupplierParty",
    "warrantyParty",
    "warrantyValidityPeriod",
    "lineValidityPeriod",
    "itemComparisons",
    "componentRelatedItems",
    "accessoryRelatedItems",
    "requiredRelatedItems",
    "replacementRelatedItems",
    "complementaryRelatedItems",
    "replacedRelatedItems",
    "requiredItemLocationQuantities",
    "documentReferences",
    "item",
    "keywordItemProperties",
    "callForTendersLineReference",
    "callForTendersDocumentReferences"
})
@XmlRootElement(name = "CatalogueLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class CatalogueLine
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
    @XmlElement(name = "ActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ActionCode actionCode;
    @XmlElement(name = "LifeCycleStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LifeCycleStatusCode lifeCycleStatusCode;
    @XmlElement(name = "ContractSubdivision", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ContractSubdivision contractSubdivision;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "OrderableIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OrderableIndicator orderableIndicator;
    @XmlElement(name = "OrderableUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OrderableUnit orderableUnit;
    @XmlElement(name = "ContentUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ContentUnitQuantity contentUnitQuantity;
    @XmlElement(name = "OrderQuantityIncrementNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OrderQuantityIncrementNumeric orderQuantityIncrementNumeric;
    @XmlElement(name = "MinimumOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumOrderQuantity minimumOrderQuantity;
    @XmlElement(name = "MaximumOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumOrderQuantity maximumOrderQuantity;
    @XmlElement(name = "WarrantyInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<WarrantyInformation> warrantyInformations;
    @XmlElement(name = "PackLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PackLevelCode packLevelCode;
    @XmlElement(name = "ContractorCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CustomerPartyType contractorCustomerParty;
    @XmlElement(name = "SellerSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected SupplierPartyType sellerSupplierParty;
    @XmlElement(name = "WarrantyParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType warrantyParty;
    @XmlElement(name = "WarrantyValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "LineValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType lineValidityPeriod;
    @XmlElement(name = "ItemComparison", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ItemComparison> itemComparisons;
    @XmlElement(name = "ComponentRelatedItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<RelatedItemType> componentRelatedItems;
    @XmlElement(name = "AccessoryRelatedItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<RelatedItemType> accessoryRelatedItems;
    @XmlElement(name = "RequiredRelatedItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<RelatedItemType> requiredRelatedItems;
    @XmlElement(name = "ReplacementRelatedItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<RelatedItemType> replacementRelatedItems;
    @XmlElement(name = "ComplementaryRelatedItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<RelatedItemType> complementaryRelatedItems;
    @XmlElement(name = "ReplacedRelatedItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<RelatedItemType> replacedRelatedItems;
    @XmlElement(name = "RequiredItemLocationQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ItemLocationQuantityType> requiredItemLocationQuantities;
    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "Item", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected ItemType item;
    @XmlElement(name = "KeywordItemProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ItemPropertyType> keywordItemProperties;
    @XmlElement(name = "CallForTendersLineReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LineReferenceType callForTendersLineReference;
    @XmlElement(name = "CallForTendersDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> callForTendersDocumentReferences;

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
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the lifeCycleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleStatusCode }
     *     
     */
    public LifeCycleStatusCode getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * Sets the value of the lifeCycleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleStatusCode }
     *     
     */
    public void setLifeCycleStatusCode(LifeCycleStatusCode value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Gets the value of the contractSubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSubdivision }
     *     
     */
    public ContractSubdivision getContractSubdivision() {
        return contractSubdivision;
    }

    /**
     * Sets the value of the contractSubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSubdivision }
     *     
     */
    public void setContractSubdivision(ContractSubdivision value) {
        this.contractSubdivision = value;
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
     * Gets the value of the orderableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link OrderableIndicator }
     *     
     */
    public OrderableIndicator getOrderableIndicator() {
        return orderableIndicator;
    }

    /**
     * Sets the value of the orderableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableIndicator }
     *     
     */
    public void setOrderableIndicator(OrderableIndicator value) {
        this.orderableIndicator = value;
    }

    /**
     * Gets the value of the orderableUnit property.
     * 
     * @return
     *     possible object is
     *     {@link OrderableUnit }
     *     
     */
    public OrderableUnit getOrderableUnit() {
        return orderableUnit;
    }

    /**
     * Sets the value of the orderableUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableUnit }
     *     
     */
    public void setOrderableUnit(OrderableUnit value) {
        this.orderableUnit = value;
    }

    /**
     * Gets the value of the contentUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ContentUnitQuantity }
     *     
     */
    public ContentUnitQuantity getContentUnitQuantity() {
        return contentUnitQuantity;
    }

    /**
     * Sets the value of the contentUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentUnitQuantity }
     *     
     */
    public void setContentUnitQuantity(ContentUnitQuantity value) {
        this.contentUnitQuantity = value;
    }

    /**
     * Gets the value of the orderQuantityIncrementNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityIncrementNumeric }
     *     
     */
    public OrderQuantityIncrementNumeric getOrderQuantityIncrementNumeric() {
        return orderQuantityIncrementNumeric;
    }

    /**
     * Sets the value of the orderQuantityIncrementNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityIncrementNumeric }
     *     
     */
    public void setOrderQuantityIncrementNumeric(OrderQuantityIncrementNumeric value) {
        this.orderQuantityIncrementNumeric = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumOrderQuantity }
     *     
     */
    public MinimumOrderQuantity getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumOrderQuantity }
     *     
     */
    public void setMinimumOrderQuantity(MinimumOrderQuantity value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the maximumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumOrderQuantity }
     *     
     */
    public MaximumOrderQuantity getMaximumOrderQuantity() {
        return maximumOrderQuantity;
    }

    /**
     * Sets the value of the maximumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumOrderQuantity }
     *     
     */
    public void setMaximumOrderQuantity(MaximumOrderQuantity value) {
        this.maximumOrderQuantity = value;
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
     * Gets the value of the packLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackLevelCode }
     *     
     */
    public PackLevelCode getPackLevelCode() {
        return packLevelCode;
    }

    /**
     * Sets the value of the packLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackLevelCode }
     *     
     */
    public void setPackLevelCode(PackLevelCode value) {
        this.packLevelCode = value;
    }

    /**
     * Gets the value of the contractorCustomerParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getContractorCustomerParty() {
        return contractorCustomerParty;
    }

    /**
     * Sets the value of the contractorCustomerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setContractorCustomerParty(CustomerPartyType value) {
        this.contractorCustomerParty = value;
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
     * Gets the value of the lineValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getLineValidityPeriod() {
        return lineValidityPeriod;
    }

    /**
     * Sets the value of the lineValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setLineValidityPeriod(PeriodType value) {
        this.lineValidityPeriod = value;
    }

    /**
     * Gets the value of the itemComparisons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemComparisons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemComparisons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemComparison }
     * 
     * 
     */
    public List<ItemComparison> getItemComparisons() {
        if (itemComparisons == null) {
            itemComparisons = new ArrayList<ItemComparison>();
        }
        return this.itemComparisons;
    }

    /**
     * Gets the value of the componentRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getComponentRelatedItems() {
        if (componentRelatedItems == null) {
            componentRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.componentRelatedItems;
    }

    /**
     * Gets the value of the accessoryRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessoryRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessoryRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getAccessoryRelatedItems() {
        if (accessoryRelatedItems == null) {
            accessoryRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.accessoryRelatedItems;
    }

    /**
     * Gets the value of the requiredRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getRequiredRelatedItems() {
        if (requiredRelatedItems == null) {
            requiredRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.requiredRelatedItems;
    }

    /**
     * Gets the value of the replacementRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacementRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacementRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getReplacementRelatedItems() {
        if (replacementRelatedItems == null) {
            replacementRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.replacementRelatedItems;
    }

    /**
     * Gets the value of the complementaryRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the complementaryRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComplementaryRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getComplementaryRelatedItems() {
        if (complementaryRelatedItems == null) {
            complementaryRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.complementaryRelatedItems;
    }

    /**
     * Gets the value of the replacedRelatedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacedRelatedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacedRelatedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItemType }
     * 
     * 
     */
    public List<RelatedItemType> getReplacedRelatedItems() {
        if (replacedRelatedItems == null) {
            replacedRelatedItems = new ArrayList<RelatedItemType>();
        }
        return this.replacedRelatedItems;
    }

    /**
     * Gets the value of the requiredItemLocationQuantities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredItemLocationQuantities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredItemLocationQuantities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLocationQuantityType }
     * 
     * 
     */
    public List<ItemLocationQuantityType> getRequiredItemLocationQuantities() {
        if (requiredItemLocationQuantities == null) {
            requiredItemLocationQuantities = new ArrayList<ItemLocationQuantityType>();
        }
        return this.requiredItemLocationQuantities;
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
     * Gets the value of the keywordItemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordItemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getKeywordItemProperties() {
        if (keywordItemProperties == null) {
            keywordItemProperties = new ArrayList<ItemPropertyType>();
        }
        return this.keywordItemProperties;
    }

    /**
     * Gets the value of the callForTendersLineReference property.
     * 
     * @return
     *     possible object is
     *     {@link LineReferenceType }
     *     
     */
    public LineReferenceType getCallForTendersLineReference() {
        return callForTendersLineReference;
    }

    /**
     * Sets the value of the callForTendersLineReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineReferenceType }
     *     
     */
    public void setCallForTendersLineReference(LineReferenceType value) {
        this.callForTendersLineReference = value;
    }

    /**
     * Gets the value of the callForTendersDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callForTendersDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallForTendersDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getCallForTendersDocumentReferences() {
        if (callForTendersDocumentReferences == null) {
            callForTendersDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.callForTendersDocumentReferences;
    }

}
