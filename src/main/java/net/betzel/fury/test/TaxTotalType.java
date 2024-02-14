
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
 * <p>Java class for TaxTotalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationSequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoundingAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEvidenceIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxIncludedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxSubtotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTotalType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "taxAmount",
    "calculationSequenceNumeric",
    "roundingAmount",
    "taxEvidenceIndicator",
    "taxIncludedIndicator",
    "taxSubtotals"
})
public class TaxTotalType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected TaxAmount taxAmount;
    @XmlElement(name = "CalculationSequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CalculationSequenceNumeric calculationSequenceNumeric;
    @XmlElement(name = "RoundingAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RoundingAmount roundingAmount;
    @XmlElement(name = "TaxEvidenceIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxEvidenceIndicator taxEvidenceIndicator;
    @XmlElement(name = "TaxIncludedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxIncludedIndicator taxIncludedIndicator;
    @XmlElement(name = "TaxSubtotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxSubtotal> taxSubtotals;

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
     * Gets the value of the roundingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingAmount }
     *     
     */
    public RoundingAmount getRoundingAmount() {
        return roundingAmount;
    }

    /**
     * Sets the value of the roundingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingAmount }
     *     
     */
    public void setRoundingAmount(RoundingAmount value) {
        this.roundingAmount = value;
    }

    /**
     * Gets the value of the taxEvidenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEvidenceIndicator }
     *     
     */
    public TaxEvidenceIndicator getTaxEvidenceIndicator() {
        return taxEvidenceIndicator;
    }

    /**
     * Sets the value of the taxEvidenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEvidenceIndicator }
     *     
     */
    public void setTaxEvidenceIndicator(TaxEvidenceIndicator value) {
        this.taxEvidenceIndicator = value;
    }

    /**
     * Gets the value of the taxIncludedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncludedIndicator }
     *     
     */
    public TaxIncludedIndicator getTaxIncludedIndicator() {
        return taxIncludedIndicator;
    }

    /**
     * Sets the value of the taxIncludedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncludedIndicator }
     *     
     */
    public void setTaxIncludedIndicator(TaxIncludedIndicator value) {
        this.taxIncludedIndicator = value;
    }

    /**
     * Gets the value of the taxSubtotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSubtotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxSubtotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSubtotal }
     * 
     * 
     */
    public List<TaxSubtotal> getTaxSubtotals() {
        if (taxSubtotals == null) {
            taxSubtotals = new ArrayList<TaxSubtotal>();
        }
        return this.taxSubtotals;
    }

}
