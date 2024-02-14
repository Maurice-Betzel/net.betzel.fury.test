
package net.betzel.fury.test.model;

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
 * <p>Java class for PriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusivePriceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceChangeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrderableUnitFactorRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PriceList" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PricingExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AlternativeCurrencyPrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "priceAmount",
    "taxInclusivePriceAmount",
    "baseQuantity",
    "priceChangeReasons",
    "priceTypeCode",
    "priceType",
    "orderableUnitFactorRate",
    "validityPeriods",
    "priceList",
    "allowanceCharges",
    "pricingExchangeRate",
    "alternativeCurrencyPrices"
})
public class PriceType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "PriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected PriceAmount priceAmount;
    @XmlElement(name = "TaxInclusivePriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxInclusivePriceAmount taxInclusivePriceAmount;
    @XmlElement(name = "BaseQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BaseQuantity baseQuantity;
    @XmlElement(name = "PriceChangeReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PriceChangeReason> priceChangeReasons;
    @XmlElement(name = "PriceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PriceTypeCode priceTypeCode;
    @XmlElement(name = "PriceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PriceType2 priceType;
    @XmlElement(name = "OrderableUnitFactorRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OrderableUnitFactorRate orderableUnitFactorRate;
    @XmlElement(name = "ValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PeriodType> validityPeriods;
    @XmlElement(name = "PriceList", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PriceListType priceList;
    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "PricingExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ExchangeRateType pricingExchangeRate;
    @XmlElement(name = "AlternativeCurrencyPrice", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PriceType> alternativeCurrencyPrices;

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
     * Gets the value of the priceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAmount }
     *     
     */
    public PriceAmount getPriceAmount() {
        return priceAmount;
    }

    /**
     * Sets the value of the priceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAmount }
     *     
     */
    public void setPriceAmount(PriceAmount value) {
        this.priceAmount = value;
    }

    /**
     * Gets the value of the taxInclusivePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInclusivePriceAmount }
     *     
     */
    public TaxInclusivePriceAmount getTaxInclusivePriceAmount() {
        return taxInclusivePriceAmount;
    }

    /**
     * Sets the value of the taxInclusivePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInclusivePriceAmount }
     *     
     */
    public void setTaxInclusivePriceAmount(TaxInclusivePriceAmount value) {
        this.taxInclusivePriceAmount = value;
    }

    /**
     * Gets the value of the baseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BaseQuantity }
     *     
     */
    public BaseQuantity getBaseQuantity() {
        return baseQuantity;
    }

    /**
     * Sets the value of the baseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseQuantity }
     *     
     */
    public void setBaseQuantity(BaseQuantity value) {
        this.baseQuantity = value;
    }

    /**
     * Gets the value of the priceChangeReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceChangeReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceChangeReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceChangeReason }
     * 
     * 
     */
    public List<PriceChangeReason> getPriceChangeReasons() {
        if (priceChangeReasons == null) {
            priceChangeReasons = new ArrayList<PriceChangeReason>();
        }
        return this.priceChangeReasons;
    }

    /**
     * Gets the value of the priceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceTypeCode }
     *     
     */
    public PriceTypeCode getPriceTypeCode() {
        return priceTypeCode;
    }

    /**
     * Sets the value of the priceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTypeCode }
     *     
     */
    public void setPriceTypeCode(PriceTypeCode value) {
        this.priceTypeCode = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType2 }
     *     
     */
    public PriceType2 getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType2 }
     *     
     */
    public void setPriceType(PriceType2 value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the orderableUnitFactorRate property.
     * 
     * @return
     *     possible object is
     *     {@link OrderableUnitFactorRate }
     *     
     */
    public OrderableUnitFactorRate getOrderableUnitFactorRate() {
        return orderableUnitFactorRate;
    }

    /**
     * Sets the value of the orderableUnitFactorRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderableUnitFactorRate }
     *     
     */
    public void setOrderableUnitFactorRate(OrderableUnitFactorRate value) {
        this.orderableUnitFactorRate = value;
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
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link PriceListType }
     *     
     */
    public PriceListType getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListType }
     *     
     */
    public void setPriceList(PriceListType value) {
        this.priceList = value;
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
     * Gets the value of the alternativeCurrencyPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeCurrencyPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeCurrencyPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceType }
     * 
     * 
     */
    public List<PriceType> getAlternativeCurrencyPrices() {
        if (alternativeCurrencyPrices == null) {
            alternativeCurrencyPrices = new ArrayList<PriceType>();
        }
        return this.alternativeCurrencyPrices;
    }

}
