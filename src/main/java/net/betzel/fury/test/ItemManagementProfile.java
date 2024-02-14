
package net.betzel.fury.test;

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
 * <p>Java class for ItemManagementProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemManagementProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FrozenPeriodDaysNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumInventoryQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MultipleOrderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderIntervalDaysNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReplenishmentOwnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetServicePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetInventoryQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EffectivePeriod"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemLocationQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemManagementProfileType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "frozenPeriodDaysNumeric",
    "minimumInventoryQuantity",
    "multipleOrderQuantity",
    "orderIntervalDaysNumeric",
    "replenishmentOwnerDescriptions",
    "targetServicePercent",
    "targetInventoryQuantity",
    "effectivePeriod",
    "item",
    "itemLocationQuantity"
})
@XmlRootElement(name = "ItemManagementProfile", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ItemManagementProfile
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "FrozenPeriodDaysNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FrozenPeriodDaysNumeric frozenPeriodDaysNumeric;
    @XmlElement(name = "MinimumInventoryQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumInventoryQuantity minimumInventoryQuantity;
    @XmlElement(name = "MultipleOrderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MultipleOrderQuantity multipleOrderQuantity;
    @XmlElement(name = "OrderIntervalDaysNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OrderIntervalDaysNumeric orderIntervalDaysNumeric;
    @XmlElement(name = "ReplenishmentOwnerDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ReplenishmentOwnerDescription> replenishmentOwnerDescriptions;
    @XmlElement(name = "TargetServicePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TargetServicePercent targetServicePercent;
    @XmlElement(name = "TargetInventoryQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TargetInventoryQuantity targetInventoryQuantity;
    @XmlElement(name = "EffectivePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected PeriodType effectivePeriod;
    @XmlElement(name = "Item", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected ItemType item;
    @XmlElement(name = "ItemLocationQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ItemLocationQuantityType itemLocationQuantity;

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
     * Gets the value of the frozenPeriodDaysNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link FrozenPeriodDaysNumeric }
     *     
     */
    public FrozenPeriodDaysNumeric getFrozenPeriodDaysNumeric() {
        return frozenPeriodDaysNumeric;
    }

    /**
     * Sets the value of the frozenPeriodDaysNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrozenPeriodDaysNumeric }
     *     
     */
    public void setFrozenPeriodDaysNumeric(FrozenPeriodDaysNumeric value) {
        this.frozenPeriodDaysNumeric = value;
    }

    /**
     * Gets the value of the minimumInventoryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumInventoryQuantity }
     *     
     */
    public MinimumInventoryQuantity getMinimumInventoryQuantity() {
        return minimumInventoryQuantity;
    }

    /**
     * Sets the value of the minimumInventoryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumInventoryQuantity }
     *     
     */
    public void setMinimumInventoryQuantity(MinimumInventoryQuantity value) {
        this.minimumInventoryQuantity = value;
    }

    /**
     * Gets the value of the multipleOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleOrderQuantity }
     *     
     */
    public MultipleOrderQuantity getMultipleOrderQuantity() {
        return multipleOrderQuantity;
    }

    /**
     * Sets the value of the multipleOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleOrderQuantity }
     *     
     */
    public void setMultipleOrderQuantity(MultipleOrderQuantity value) {
        this.multipleOrderQuantity = value;
    }

    /**
     * Gets the value of the orderIntervalDaysNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIntervalDaysNumeric }
     *     
     */
    public OrderIntervalDaysNumeric getOrderIntervalDaysNumeric() {
        return orderIntervalDaysNumeric;
    }

    /**
     * Sets the value of the orderIntervalDaysNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIntervalDaysNumeric }
     *     
     */
    public void setOrderIntervalDaysNumeric(OrderIntervalDaysNumeric value) {
        this.orderIntervalDaysNumeric = value;
    }

    /**
     * Gets the value of the replenishmentOwnerDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replenishmentOwnerDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplenishmentOwnerDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReplenishmentOwnerDescription }
     * 
     * 
     */
    public List<ReplenishmentOwnerDescription> getReplenishmentOwnerDescriptions() {
        if (replenishmentOwnerDescriptions == null) {
            replenishmentOwnerDescriptions = new ArrayList<ReplenishmentOwnerDescription>();
        }
        return this.replenishmentOwnerDescriptions;
    }

    /**
     * Gets the value of the targetServicePercent property.
     * 
     * @return
     *     possible object is
     *     {@link TargetServicePercent }
     *     
     */
    public TargetServicePercent getTargetServicePercent() {
        return targetServicePercent;
    }

    /**
     * Sets the value of the targetServicePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetServicePercent }
     *     
     */
    public void setTargetServicePercent(TargetServicePercent value) {
        this.targetServicePercent = value;
    }

    /**
     * Gets the value of the targetInventoryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TargetInventoryQuantity }
     *     
     */
    public TargetInventoryQuantity getTargetInventoryQuantity() {
        return targetInventoryQuantity;
    }

    /**
     * Sets the value of the targetInventoryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetInventoryQuantity }
     *     
     */
    public void setTargetInventoryQuantity(TargetInventoryQuantity value) {
        this.targetInventoryQuantity = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEffectivePeriod(PeriodType value) {
        this.effectivePeriod = value;
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
     * Gets the value of the itemLocationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public ItemLocationQuantityType getItemLocationQuantity() {
        return itemLocationQuantity;
    }

    /**
     * Sets the value of the itemLocationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLocationQuantityType }
     *     
     */
    public void setItemLocationQuantity(ItemLocationQuantityType value) {
        this.itemLocationQuantity = value;
    }

}
