
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceCurrencyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceCurrencyBaseRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetCurrencyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TargetCurrencyBaseRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExchangeMarketID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MathematicOperatorCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForeignExchangeContract" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "sourceCurrencyCode",
    "sourceCurrencyBaseRate",
    "targetCurrencyCode",
    "targetCurrencyBaseRate",
    "exchangeMarketID",
    "calculationRate",
    "mathematicOperatorCode",
    "date",
    "foreignExchangeContract"
})
public class ExchangeRateType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "SourceCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected SourceCurrencyCode sourceCurrencyCode;
    @XmlElement(name = "SourceCurrencyBaseRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SourceCurrencyBaseRate sourceCurrencyBaseRate;
    @XmlElement(name = "TargetCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected TargetCurrencyCode targetCurrencyCode;
    @XmlElement(name = "TargetCurrencyBaseRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TargetCurrencyBaseRate targetCurrencyBaseRate;
    @XmlElement(name = "ExchangeMarketID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExchangeMarketID exchangeMarketID;
    @XmlElement(name = "CalculationRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CalculationRate calculationRate;
    @XmlElement(name = "MathematicOperatorCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MathematicOperatorCode mathematicOperatorCode;
    @XmlElement(name = "Date", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Date date;
    @XmlElement(name = "ForeignExchangeContract", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContractType foreignExchangeContract;

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
     * Gets the value of the sourceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyCode }
     *     
     */
    public SourceCurrencyCode getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Sets the value of the sourceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyCode }
     *     
     */
    public void setSourceCurrencyCode(SourceCurrencyCode value) {
        this.sourceCurrencyCode = value;
    }

    /**
     * Gets the value of the sourceCurrencyBaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link SourceCurrencyBaseRate }
     *     
     */
    public SourceCurrencyBaseRate getSourceCurrencyBaseRate() {
        return sourceCurrencyBaseRate;
    }

    /**
     * Sets the value of the sourceCurrencyBaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceCurrencyBaseRate }
     *     
     */
    public void setSourceCurrencyBaseRate(SourceCurrencyBaseRate value) {
        this.sourceCurrencyBaseRate = value;
    }

    /**
     * Gets the value of the targetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyCode }
     *     
     */
    public TargetCurrencyCode getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Sets the value of the targetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyCode }
     *     
     */
    public void setTargetCurrencyCode(TargetCurrencyCode value) {
        this.targetCurrencyCode = value;
    }

    /**
     * Gets the value of the targetCurrencyBaseRate property.
     * 
     * @return
     *     possible object is
     *     {@link TargetCurrencyBaseRate }
     *     
     */
    public TargetCurrencyBaseRate getTargetCurrencyBaseRate() {
        return targetCurrencyBaseRate;
    }

    /**
     * Sets the value of the targetCurrencyBaseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetCurrencyBaseRate }
     *     
     */
    public void setTargetCurrencyBaseRate(TargetCurrencyBaseRate value) {
        this.targetCurrencyBaseRate = value;
    }

    /**
     * Gets the value of the exchangeMarketID property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeMarketID }
     *     
     */
    public ExchangeMarketID getExchangeMarketID() {
        return exchangeMarketID;
    }

    /**
     * Sets the value of the exchangeMarketID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeMarketID }
     *     
     */
    public void setExchangeMarketID(ExchangeMarketID value) {
        this.exchangeMarketID = value;
    }

    /**
     * Gets the value of the calculationRate property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationRate }
     *     
     */
    public CalculationRate getCalculationRate() {
        return calculationRate;
    }

    /**
     * Sets the value of the calculationRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationRate }
     *     
     */
    public void setCalculationRate(CalculationRate value) {
        this.calculationRate = value;
    }

    /**
     * Gets the value of the mathematicOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link MathematicOperatorCode }
     *     
     */
    public MathematicOperatorCode getMathematicOperatorCode() {
        return mathematicOperatorCode;
    }

    /**
     * Sets the value of the mathematicOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MathematicOperatorCode }
     *     
     */
    public void setMathematicOperatorCode(MathematicOperatorCode value) {
        this.mathematicOperatorCode = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the foreignExchangeContract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getForeignExchangeContract() {
        return foreignExchangeContract;
    }

    /**
     * Sets the value of the foreignExchangeContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setForeignExchangeContract(ContractType value) {
        this.foreignExchangeContract = value;
    }

}
