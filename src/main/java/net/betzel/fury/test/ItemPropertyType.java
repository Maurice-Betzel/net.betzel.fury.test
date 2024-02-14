
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
 * <p>Java class for ItemPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NameCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TestMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Value" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueQualifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ImportanceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ListValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UsabilityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemPropertyGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RangeDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemPropertyRange" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StandardPropertyIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPropertyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "name",
    "nameCode",
    "testMethod",
    "value",
    "valueQuantity",
    "valueQualifiers",
    "importanceCode",
    "listValues",
    "usabilityPeriod",
    "itemPropertyGroups",
    "rangeDimension",
    "itemPropertyRange",
    "standardPropertyIdentification",
    "subItemProperties"
})
public class ItemPropertyType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected Name name;
    @XmlElement(name = "NameCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NameCode nameCode;
    @XmlElement(name = "TestMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TestMethod testMethod;
    @XmlElement(name = "Value", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Value value;
    @XmlElement(name = "ValueQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValueQuantity valueQuantity;
    @XmlElement(name = "ValueQualifier", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ValueQualifier> valueQualifiers;
    @XmlElement(name = "ImportanceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ImportanceCode importanceCode;
    @XmlElement(name = "ListValue", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ListValue> listValues;
    @XmlElement(name = "UsabilityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType usabilityPeriod;
    @XmlElement(name = "ItemPropertyGroup", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ItemPropertyGroup> itemPropertyGroups;
    @XmlElement(name = "RangeDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DimensionType rangeDimension;
    @XmlElement(name = "ItemPropertyRange", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ItemPropertyRange itemPropertyRange;
    @XmlElement(name = "StandardPropertyIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PropertyIdentificationType standardPropertyIdentification;
    @XmlElement(name = "SubItemProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ItemPropertyType> subItemProperties;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameCode property.
     * 
     * @return
     *     possible object is
     *     {@link NameCode }
     *     
     */
    public NameCode getNameCode() {
        return nameCode;
    }

    /**
     * Sets the value of the nameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCode }
     *     
     */
    public void setNameCode(NameCode value) {
        this.nameCode = value;
    }

    /**
     * Gets the value of the testMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TestMethod }
     *     
     */
    public TestMethod getTestMethod() {
        return testMethod;
    }

    /**
     * Sets the value of the testMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestMethod }
     *     
     */
    public void setTestMethod(TestMethod value) {
        this.testMethod = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the valueQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ValueQuantity }
     *     
     */
    public ValueQuantity getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Sets the value of the valueQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueQuantity }
     *     
     */
    public void setValueQuantity(ValueQuantity value) {
        this.valueQuantity = value;
    }

    /**
     * Gets the value of the valueQualifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueQualifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueQualifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueQualifier }
     * 
     * 
     */
    public List<ValueQualifier> getValueQualifiers() {
        if (valueQualifiers == null) {
            valueQualifiers = new ArrayList<ValueQualifier>();
        }
        return this.valueQualifiers;
    }

    /**
     * Gets the value of the importanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceCode }
     *     
     */
    public ImportanceCode getImportanceCode() {
        return importanceCode;
    }

    /**
     * Sets the value of the importanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceCode }
     *     
     */
    public void setImportanceCode(ImportanceCode value) {
        this.importanceCode = value;
    }

    /**
     * Gets the value of the listValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListValue }
     * 
     * 
     */
    public List<ListValue> getListValues() {
        if (listValues == null) {
            listValues = new ArrayList<ListValue>();
        }
        return this.listValues;
    }

    /**
     * Gets the value of the usabilityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getUsabilityPeriod() {
        return usabilityPeriod;
    }

    /**
     * Sets the value of the usabilityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setUsabilityPeriod(PeriodType value) {
        this.usabilityPeriod = value;
    }

    /**
     * Gets the value of the itemPropertyGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPropertyGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPropertyGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyGroup }
     * 
     * 
     */
    public List<ItemPropertyGroup> getItemPropertyGroups() {
        if (itemPropertyGroups == null) {
            itemPropertyGroups = new ArrayList<ItemPropertyGroup>();
        }
        return this.itemPropertyGroups;
    }

    /**
     * Gets the value of the rangeDimension property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getRangeDimension() {
        return rangeDimension;
    }

    /**
     * Sets the value of the rangeDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setRangeDimension(DimensionType value) {
        this.rangeDimension = value;
    }

    /**
     * Gets the value of the itemPropertyRange property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPropertyRange }
     *     
     */
    public ItemPropertyRange getItemPropertyRange() {
        return itemPropertyRange;
    }

    /**
     * Sets the value of the itemPropertyRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPropertyRange }
     *     
     */
    public void setItemPropertyRange(ItemPropertyRange value) {
        this.itemPropertyRange = value;
    }

    /**
     * Gets the value of the standardPropertyIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyIdentificationType }
     *     
     */
    public PropertyIdentificationType getStandardPropertyIdentification() {
        return standardPropertyIdentification;
    }

    /**
     * Sets the value of the standardPropertyIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIdentificationType }
     *     
     */
    public void setStandardPropertyIdentification(PropertyIdentificationType value) {
        this.standardPropertyIdentification = value;
    }

    /**
     * Gets the value of the subItemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subItemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getSubItemProperties() {
        if (subItemProperties == null) {
            subItemProperties = new ArrayList<ItemPropertyType>();
        }
        return this.subItemProperties;
    }

}
