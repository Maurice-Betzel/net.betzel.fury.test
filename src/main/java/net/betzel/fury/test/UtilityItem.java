
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
 * <p>Java class for UtilityItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubscriberTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackSizeNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CurrentChargeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CurrentChargeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OneTimeChargeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OneTimeChargeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contract" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityItemType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "subscriberID",
    "subscriberType",
    "subscriberTypeCode",
    "descriptions",
    "packQuantity",
    "packSizeNumeric",
    "consumptionType",
    "consumptionTypeCode",
    "currentChargeType",
    "currentChargeTypeCode",
    "oneTimeChargeType",
    "oneTimeChargeTypeCode",
    "taxCategory",
    "contract"
})
@XmlRootElement(name = "UtilityItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class UtilityItem
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
    @XmlElement(name = "SubscriberID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SubscriberID subscriberID;
    @XmlElement(name = "SubscriberType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SubscriberType subscriberType;
    @XmlElement(name = "SubscriberTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SubscriberTypeCode subscriberTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "PackQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PackQuantity packQuantity;
    @XmlElement(name = "PackSizeNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PackSizeNumeric packSizeNumeric;
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionTypeCode consumptionTypeCode;
    @XmlElement(name = "CurrentChargeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CurrentChargeType currentChargeType;
    @XmlElement(name = "CurrentChargeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CurrentChargeTypeCode currentChargeTypeCode;
    @XmlElement(name = "OneTimeChargeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OneTimeChargeType oneTimeChargeType;
    @XmlElement(name = "OneTimeChargeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OneTimeChargeTypeCode oneTimeChargeTypeCode;
    @XmlElement(name = "TaxCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TaxCategoryType taxCategory;
    @XmlElement(name = "Contract", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContractType contract;

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
     * Gets the value of the subscriberID property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberID }
     *     
     */
    public SubscriberID getSubscriberID() {
        return subscriberID;
    }

    /**
     * Sets the value of the subscriberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberID }
     *     
     */
    public void setSubscriberID(SubscriberID value) {
        this.subscriberID = value;
    }

    /**
     * Gets the value of the subscriberType property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberType }
     *     
     */
    public SubscriberType getSubscriberType() {
        return subscriberType;
    }

    /**
     * Sets the value of the subscriberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberType }
     *     
     */
    public void setSubscriberType(SubscriberType value) {
        this.subscriberType = value;
    }

    /**
     * Gets the value of the subscriberTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberTypeCode }
     *     
     */
    public SubscriberTypeCode getSubscriberTypeCode() {
        return subscriberTypeCode;
    }

    /**
     * Sets the value of the subscriberTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberTypeCode }
     *     
     */
    public void setSubscriberTypeCode(SubscriberTypeCode value) {
        this.subscriberTypeCode = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the packQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PackQuantity }
     *     
     */
    public PackQuantity getPackQuantity() {
        return packQuantity;
    }

    /**
     * Sets the value of the packQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackQuantity }
     *     
     */
    public void setPackQuantity(PackQuantity value) {
        this.packQuantity = value;
    }

    /**
     * Gets the value of the packSizeNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link PackSizeNumeric }
     *     
     */
    public PackSizeNumeric getPackSizeNumeric() {
        return packSizeNumeric;
    }

    /**
     * Sets the value of the packSizeNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackSizeNumeric }
     *     
     */
    public void setPackSizeNumeric(PackSizeNumeric value) {
        this.packSizeNumeric = value;
    }

    /**
     * Gets the value of the consumptionType property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionType }
     *     
     */
    public ConsumptionType getConsumptionType() {
        return consumptionType;
    }

    /**
     * Sets the value of the consumptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionType }
     *     
     */
    public void setConsumptionType(ConsumptionType value) {
        this.consumptionType = value;
    }

    /**
     * Gets the value of the consumptionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeCode }
     *     
     */
    public ConsumptionTypeCode getConsumptionTypeCode() {
        return consumptionTypeCode;
    }

    /**
     * Sets the value of the consumptionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeCode }
     *     
     */
    public void setConsumptionTypeCode(ConsumptionTypeCode value) {
        this.consumptionTypeCode = value;
    }

    /**
     * Gets the value of the currentChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentChargeType }
     *     
     */
    public CurrentChargeType getCurrentChargeType() {
        return currentChargeType;
    }

    /**
     * Sets the value of the currentChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentChargeType }
     *     
     */
    public void setCurrentChargeType(CurrentChargeType value) {
        this.currentChargeType = value;
    }

    /**
     * Gets the value of the currentChargeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentChargeTypeCode }
     *     
     */
    public CurrentChargeTypeCode getCurrentChargeTypeCode() {
        return currentChargeTypeCode;
    }

    /**
     * Sets the value of the currentChargeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentChargeTypeCode }
     *     
     */
    public void setCurrentChargeTypeCode(CurrentChargeTypeCode value) {
        this.currentChargeTypeCode = value;
    }

    /**
     * Gets the value of the oneTimeChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeChargeType }
     *     
     */
    public OneTimeChargeType getOneTimeChargeType() {
        return oneTimeChargeType;
    }

    /**
     * Sets the value of the oneTimeChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeChargeType }
     *     
     */
    public void setOneTimeChargeType(OneTimeChargeType value) {
        this.oneTimeChargeType = value;
    }

    /**
     * Gets the value of the oneTimeChargeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OneTimeChargeTypeCode }
     *     
     */
    public OneTimeChargeTypeCode getOneTimeChargeTypeCode() {
        return oneTimeChargeTypeCode;
    }

    /**
     * Sets the value of the oneTimeChargeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneTimeChargeTypeCode }
     *     
     */
    public void setOneTimeChargeTypeCode(OneTimeChargeTypeCode value) {
        this.oneTimeChargeTypeCode = value;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryType }
     *     
     */
    public TaxCategoryType getTaxCategory() {
        return taxCategory;
    }

    /**
     * Sets the value of the taxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryType }
     *     
     */
    public void setTaxCategory(TaxCategoryType value) {
        this.taxCategory = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContract(ContractType value) {
        this.contract = value;
    }

}
