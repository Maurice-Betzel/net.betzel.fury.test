
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
 * <p>Java class for AllowanceChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowanceChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeIndicator"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceChargeReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceChargeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MultiplierFactorNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusiveAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceChargeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "chargeIndicator",
    "allowanceChargeReasonCode",
    "allowanceChargeReasons",
    "multiplierFactorNumeric",
    "prepaidIndicator",
    "sequenceNumeric",
    "amount",
    "taxInclusiveAmount",
    "baseAmount",
    "accountingCostCode",
    "accountingCost",
    "perUnitAmount",
    "taxCategories",
    "taxTotal",
    "paymentMeans"
})
public class AllowanceChargeType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "ChargeIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ChargeIndicator chargeIndicator;
    @XmlElement(name = "AllowanceChargeReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AllowanceChargeReasonCode allowanceChargeReasonCode;
    @XmlElement(name = "AllowanceChargeReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<AllowanceChargeReason> allowanceChargeReasons;
    @XmlElement(name = "MultiplierFactorNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MultiplierFactorNumeric multiplierFactorNumeric;
    @XmlElement(name = "PrepaidIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PrepaidIndicator prepaidIndicator;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SequenceNumeric sequenceNumeric;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected Amount amount;
    @XmlElement(name = "TaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxInclusiveAmount taxInclusiveAmount;
    @XmlElement(name = "BaseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BaseAmount baseAmount;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCostCode accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCost accountingCost;
    @XmlElement(name = "PerUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PerUnitAmount perUnitAmount;
    @XmlElement(name = "TaxCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxCategoryType> taxCategories;
    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TaxTotalType taxTotal;
    @XmlElement(name = "PaymentMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PaymentMeans> paymentMeans;

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
     * Gets the value of the chargeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeIndicator }
     *     
     */
    public ChargeIndicator getChargeIndicator() {
        return chargeIndicator;
    }

    /**
     * Sets the value of the chargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeIndicator }
     *     
     */
    public void setChargeIndicator(ChargeIndicator value) {
        this.chargeIndicator = value;
    }

    /**
     * Gets the value of the allowanceChargeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeReasonCode }
     *     
     */
    public AllowanceChargeReasonCode getAllowanceChargeReasonCode() {
        return allowanceChargeReasonCode;
    }

    /**
     * Sets the value of the allowanceChargeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeReasonCode }
     *     
     */
    public void setAllowanceChargeReasonCode(AllowanceChargeReasonCode value) {
        this.allowanceChargeReasonCode = value;
    }

    /**
     * Gets the value of the allowanceChargeReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceChargeReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceChargeReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeReason }
     * 
     * 
     */
    public List<AllowanceChargeReason> getAllowanceChargeReasons() {
        if (allowanceChargeReasons == null) {
            allowanceChargeReasons = new ArrayList<AllowanceChargeReason>();
        }
        return this.allowanceChargeReasons;
    }

    /**
     * Gets the value of the multiplierFactorNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MultiplierFactorNumeric }
     *     
     */
    public MultiplierFactorNumeric getMultiplierFactorNumeric() {
        return multiplierFactorNumeric;
    }

    /**
     * Sets the value of the multiplierFactorNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiplierFactorNumeric }
     *     
     */
    public void setMultiplierFactorNumeric(MultiplierFactorNumeric value) {
        this.multiplierFactorNumeric = value;
    }

    /**
     * Gets the value of the prepaidIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidIndicator }
     *     
     */
    public PrepaidIndicator getPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Sets the value of the prepaidIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidIndicator }
     *     
     */
    public void setPrepaidIndicator(PrepaidIndicator value) {
        this.prepaidIndicator = value;
    }

    /**
     * Gets the value of the sequenceNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumeric }
     *     
     */
    public SequenceNumeric getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Sets the value of the sequenceNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumeric }
     *     
     */
    public void setSequenceNumeric(SequenceNumeric value) {
        this.sequenceNumeric = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
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
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAmount }
     *     
     */
    public BaseAmount getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAmount }
     *     
     */
    public void setBaseAmount(BaseAmount value) {
        this.baseAmount = value;
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
     * Gets the value of the taxCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getTaxCategories() {
        if (taxCategories == null) {
            taxCategories = new ArrayList<TaxCategoryType>();
        }
        return this.taxCategories;
    }

    /**
     * Gets the value of the taxTotal property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTotalType }
     *     
     */
    public TaxTotalType getTaxTotal() {
        return taxTotal;
    }

    /**
     * Sets the value of the taxTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTotalType }
     *     
     */
    public void setTaxTotal(TaxTotalType value) {
        this.taxTotal = value;
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

}
