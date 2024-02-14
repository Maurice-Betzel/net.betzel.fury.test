
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseUnitMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxExemptionReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxExemptionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRange" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRatePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCategoryType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "name",
    "percent",
    "baseUnitMeasure",
    "perUnitAmount",
    "taxExemptionReasonCode",
    "taxExemptionReasons",
    "tierRange",
    "tierRatePercent",
    "taxScheme"
})
public class TaxCategoryType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Name name;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Percent percent;
    @XmlElement(name = "BaseUnitMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BaseUnitMeasure baseUnitMeasure;
    @XmlElement(name = "PerUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PerUnitAmount perUnitAmount;
    @XmlElement(name = "TaxExemptionReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxExemptionReasonCode taxExemptionReasonCode;
    @XmlElement(name = "TaxExemptionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<TaxExemptionReason> taxExemptionReasons;
    @XmlElement(name = "TierRange", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TierRange tierRange;
    @XmlElement(name = "TierRatePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TierRatePercent tierRatePercent;
    @XmlElement(name = "TaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TaxScheme taxScheme;

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
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Percent }
     *     
     */
    public Percent getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Percent }
     *     
     */
    public void setPercent(Percent value) {
        this.percent = value;
    }

    /**
     * Gets the value of the baseUnitMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BaseUnitMeasure }
     *     
     */
    public BaseUnitMeasure getBaseUnitMeasure() {
        return baseUnitMeasure;
    }

    /**
     * Sets the value of the baseUnitMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseUnitMeasure }
     *     
     */
    public void setBaseUnitMeasure(BaseUnitMeasure value) {
        this.baseUnitMeasure = value;
    }

    /**
     * Gets the value of the perUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PerUnitAmount }
     *     
     */
    public PerUnitAmount getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Sets the value of the perUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerUnitAmount }
     *     
     */
    public void setPerUnitAmount(PerUnitAmount value) {
        this.perUnitAmount = value;
    }

    /**
     * Gets the value of the taxExemptionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public TaxExemptionReasonCode getTaxExemptionReasonCode() {
        return taxExemptionReasonCode;
    }

    /**
     * Sets the value of the taxExemptionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public void setTaxExemptionReasonCode(TaxExemptionReasonCode value) {
        this.taxExemptionReasonCode = value;
    }

    /**
     * Gets the value of the taxExemptionReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptionReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptionReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionReason }
     * 
     * 
     */
    public List<TaxExemptionReason> getTaxExemptionReasons() {
        if (taxExemptionReasons == null) {
            taxExemptionReasons = new ArrayList<TaxExemptionReason>();
        }
        return this.taxExemptionReasons;
    }

    /**
     * Gets the value of the tierRange property.
     * 
     * @return
     *     possible object is
     *     {@link TierRange }
     *     
     */
    public TierRange getTierRange() {
        return tierRange;
    }

    /**
     * Sets the value of the tierRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRange }
     *     
     */
    public void setTierRange(TierRange value) {
        this.tierRange = value;
    }

    /**
     * Gets the value of the tierRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link TierRatePercent }
     *     
     */
    public TierRatePercent getTierRatePercent() {
        return tierRatePercent;
    }

    /**
     * Sets the value of the tierRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRatePercent }
     *     
     */
    public void setTierRatePercent(TierRatePercent value) {
        this.tierRatePercent = value;
    }

    /**
     * Gets the value of the taxScheme property.
     * 
     * @return
     *     possible object is
     *     {@link TaxScheme }
     *     
     */
    public TaxScheme getTaxScheme() {
        return taxScheme;
    }

    /**
     * Sets the value of the taxScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxScheme }
     *     
     */
    public void setTaxScheme(TaxScheme value) {
        this.taxScheme = value;
    }

}
