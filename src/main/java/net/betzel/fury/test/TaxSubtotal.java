
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxSubtotalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSubtotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxableAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusiveAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationSequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransactionCurrencyTaxAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseUnitMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRange" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRatePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxDueCountry" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSubtotalType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "taxableAmount",
    "taxAmount",
    "taxInclusiveAmount",
    "calculationSequenceNumeric",
    "transactionCurrencyTaxAmount",
    "percent",
    "baseUnitMeasure",
    "perUnitAmount",
    "tierRange",
    "tierRatePercent",
    "taxCategory",
    "taxDueCountry"
})
@XmlRootElement(name = "TaxSubtotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TaxSubtotal
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TaxableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxableAmount taxableAmount;
    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected TaxAmount taxAmount;
    @XmlElement(name = "TaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxInclusiveAmount taxInclusiveAmount;
    @XmlElement(name = "CalculationSequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CalculationSequenceNumeric calculationSequenceNumeric;
    @XmlElement(name = "TransactionCurrencyTaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransactionCurrencyTaxAmount transactionCurrencyTaxAmount;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Percent percent;
    @XmlElement(name = "BaseUnitMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BaseUnitMeasure baseUnitMeasure;
    @XmlElement(name = "PerUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PerUnitAmount perUnitAmount;
    @XmlElement(name = "TierRange", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TierRange tierRange;
    @XmlElement(name = "TierRatePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TierRatePercent tierRatePercent;
    @XmlElement(name = "TaxCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected TaxCategoryType taxCategory;
    @XmlElement(name = "TaxDueCountry", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CountryType taxDueCountry;

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
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableAmount }
     *     
     */
    public TaxableAmount getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableAmount }
     *     
     */
    public void setTaxableAmount(TaxableAmount value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount }
     *     
     */
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount }
     *     
     */
    public void setTaxAmount(TaxAmount value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxInclusiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInclusiveAmount }
     *     
     */
    public TaxInclusiveAmount getTaxInclusiveAmount() {
        return taxInclusiveAmount;
    }

    /**
     * Sets the value of the taxInclusiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInclusiveAmount }
     *     
     */
    public void setTaxInclusiveAmount(TaxInclusiveAmount value) {
        this.taxInclusiveAmount = value;
    }

    /**
     * Gets the value of the calculationSequenceNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationSequenceNumeric }
     *     
     */
    public CalculationSequenceNumeric getCalculationSequenceNumeric() {
        return calculationSequenceNumeric;
    }

    /**
     * Sets the value of the calculationSequenceNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSequenceNumeric }
     *     
     */
    public void setCalculationSequenceNumeric(CalculationSequenceNumeric value) {
        this.calculationSequenceNumeric = value;
    }

    /**
     * Gets the value of the transactionCurrencyTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCurrencyTaxAmount }
     *     
     */
    public TransactionCurrencyTaxAmount getTransactionCurrencyTaxAmount() {
        return transactionCurrencyTaxAmount;
    }

    /**
     * Sets the value of the transactionCurrencyTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCurrencyTaxAmount }
     *     
     */
    public void setTransactionCurrencyTaxAmount(TransactionCurrencyTaxAmount value) {
        this.transactionCurrencyTaxAmount = value;
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
     * Gets the value of the taxDueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getTaxDueCountry() {
        return taxDueCountry;
    }

    /**
     * Sets the value of the taxDueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setTaxDueCountry(CountryType value) {
        this.taxDueCountry = value;
    }

}
