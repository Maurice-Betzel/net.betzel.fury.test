
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonetaryTotalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxExclusiveAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusiveAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceTotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AllowanceTotalTaxInclusiveAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeTotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeTotalTaxInclusiveAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WithholdingTaxTotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableRoundingAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayableAlternativeAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryTotalType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "lineExtensionAmount",
    "taxExclusiveAmount",
    "taxInclusiveAmount",
    "allowanceTotalAmount",
    "allowanceTotalTaxInclusiveAmount",
    "chargeTotalAmount",
    "chargeTotalTaxInclusiveAmount",
    "withholdingTaxTotalAmount",
    "prepaidAmount",
    "payableRoundingAmount",
    "payableAmount",
    "payableAlternativeAmount"
})
public class MonetaryTotalType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "LineExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LineExtensionAmount lineExtensionAmount;
    @XmlElement(name = "TaxExclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxExclusiveAmount taxExclusiveAmount;
    @XmlElement(name = "TaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxInclusiveAmount taxInclusiveAmount;
    @XmlElement(name = "AllowanceTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AllowanceTotalAmount allowanceTotalAmount;
    @XmlElement(name = "AllowanceTotalTaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AllowanceTotalTaxInclusiveAmount allowanceTotalTaxInclusiveAmount;
    @XmlElement(name = "ChargeTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ChargeTotalAmount chargeTotalAmount;
    @XmlElement(name = "ChargeTotalTaxInclusiveAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ChargeTotalTaxInclusiveAmount chargeTotalTaxInclusiveAmount;
    @XmlElement(name = "WithholdingTaxTotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WithholdingTaxTotalAmount withholdingTaxTotalAmount;
    @XmlElement(name = "PrepaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PrepaidAmount prepaidAmount;
    @XmlElement(name = "PayableRoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PayableRoundingAmount payableRoundingAmount;
    @XmlElement(name = "PayableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected PayableAmount payableAmount;
    @XmlElement(name = "PayableAlternativeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PayableAlternativeAmount payableAlternativeAmount;

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
     * Gets the value of the taxExclusiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExclusiveAmount }
     *     
     */
    public TaxExclusiveAmount getTaxExclusiveAmount() {
        return taxExclusiveAmount;
    }

    /**
     * Sets the value of the taxExclusiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExclusiveAmount }
     *     
     */
    public void setTaxExclusiveAmount(TaxExclusiveAmount value) {
        this.taxExclusiveAmount = value;
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
     * Gets the value of the allowanceTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceTotalAmount }
     *     
     */
    public AllowanceTotalAmount getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    /**
     * Sets the value of the allowanceTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceTotalAmount }
     *     
     */
    public void setAllowanceTotalAmount(AllowanceTotalAmount value) {
        this.allowanceTotalAmount = value;
    }

    /**
     * Gets the value of the allowanceTotalTaxInclusiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AllowanceTotalTaxInclusiveAmount }
     *     
     */
    public AllowanceTotalTaxInclusiveAmount getAllowanceTotalTaxInclusiveAmount() {
        return allowanceTotalTaxInclusiveAmount;
    }

    /**
     * Sets the value of the allowanceTotalTaxInclusiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceTotalTaxInclusiveAmount }
     *     
     */
    public void setAllowanceTotalTaxInclusiveAmount(AllowanceTotalTaxInclusiveAmount value) {
        this.allowanceTotalTaxInclusiveAmount = value;
    }

    /**
     * Gets the value of the chargeTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTotalAmount }
     *     
     */
    public ChargeTotalAmount getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    /**
     * Sets the value of the chargeTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTotalAmount }
     *     
     */
    public void setChargeTotalAmount(ChargeTotalAmount value) {
        this.chargeTotalAmount = value;
    }

    /**
     * Gets the value of the chargeTotalTaxInclusiveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeTotalTaxInclusiveAmount }
     *     
     */
    public ChargeTotalTaxInclusiveAmount getChargeTotalTaxInclusiveAmount() {
        return chargeTotalTaxInclusiveAmount;
    }

    /**
     * Sets the value of the chargeTotalTaxInclusiveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeTotalTaxInclusiveAmount }
     *     
     */
    public void setChargeTotalTaxInclusiveAmount(ChargeTotalTaxInclusiveAmount value) {
        this.chargeTotalTaxInclusiveAmount = value;
    }

    /**
     * Gets the value of the withholdingTaxTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTaxTotalAmount }
     *     
     */
    public WithholdingTaxTotalAmount getWithholdingTaxTotalAmount() {
        return withholdingTaxTotalAmount;
    }

    /**
     * Sets the value of the withholdingTaxTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTaxTotalAmount }
     *     
     */
    public void setWithholdingTaxTotalAmount(WithholdingTaxTotalAmount value) {
        this.withholdingTaxTotalAmount = value;
    }

    /**
     * Gets the value of the prepaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidAmount }
     *     
     */
    public PrepaidAmount getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * Sets the value of the prepaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidAmount }
     *     
     */
    public void setPrepaidAmount(PrepaidAmount value) {
        this.prepaidAmount = value;
    }

    /**
     * Gets the value of the payableRoundingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PayableRoundingAmount }
     *     
     */
    public PayableRoundingAmount getPayableRoundingAmount() {
        return payableRoundingAmount;
    }

    /**
     * Sets the value of the payableRoundingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableRoundingAmount }
     *     
     */
    public void setPayableRoundingAmount(PayableRoundingAmount value) {
        this.payableRoundingAmount = value;
    }

    /**
     * Gets the value of the payableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PayableAmount }
     *     
     */
    public PayableAmount getPayableAmount() {
        return payableAmount;
    }

    /**
     * Sets the value of the payableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableAmount }
     *     
     */
    public void setPayableAmount(PayableAmount value) {
        this.payableAmount = value;
    }

    /**
     * Gets the value of the payableAlternativeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PayableAlternativeAmount }
     *     
     */
    public PayableAlternativeAmount getPayableAlternativeAmount() {
        return payableAlternativeAmount;
    }

    /**
     * Sets the value of the payableAlternativeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayableAlternativeAmount }
     *     
     */
    public void setPayableAlternativeAmount(PayableAlternativeAmount value) {
        this.payableAlternativeAmount = value;
    }

}
