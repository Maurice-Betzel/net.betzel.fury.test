
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
 * <p>Java class for ConsumptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UtilityStatementTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnergyWaterSupply" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TelecommunicationsSupply" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LegalMonetaryTotal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "utilityStatementTypeCode",
    "mainPeriod",
    "allowanceCharges",
    "taxTotals",
    "energyWaterSupply",
    "telecommunicationsSupply",
    "legalMonetaryTotal"
})
@XmlRootElement(name = "Consumption", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class Consumption
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "UtilityStatementTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UtilityStatementTypeCode utilityStatementTypeCode;
    @XmlElement(name = "MainPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType mainPeriod;
    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "EnergyWaterSupply", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected EnergyWaterSupply energyWaterSupply;
    @XmlElement(name = "TelecommunicationsSupply", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TelecommunicationsSupply telecommunicationsSupply;
    @XmlElement(name = "LegalMonetaryTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected MonetaryTotalType legalMonetaryTotal;

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
     * Gets the value of the utilityStatementTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link UtilityStatementTypeCode }
     *     
     */
    public UtilityStatementTypeCode getUtilityStatementTypeCode() {
        return utilityStatementTypeCode;
    }

    /**
     * Sets the value of the utilityStatementTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UtilityStatementTypeCode }
     *     
     */
    public void setUtilityStatementTypeCode(UtilityStatementTypeCode value) {
        this.utilityStatementTypeCode = value;
    }

    /**
     * Gets the value of the mainPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getMainPeriod() {
        return mainPeriod;
    }

    /**
     * Sets the value of the mainPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setMainPeriod(PeriodType value) {
        this.mainPeriod = value;
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
     * Gets the value of the taxTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotals() {
        if (taxTotals == null) {
            taxTotals = new ArrayList<TaxTotalType>();
        }
        return this.taxTotals;
    }

    /**
     * Gets the value of the energyWaterSupply property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyWaterSupply }
     *     
     */
    public EnergyWaterSupply getEnergyWaterSupply() {
        return energyWaterSupply;
    }

    /**
     * Sets the value of the energyWaterSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyWaterSupply }
     *     
     */
    public void setEnergyWaterSupply(EnergyWaterSupply value) {
        this.energyWaterSupply = value;
    }

    /**
     * Gets the value of the telecommunicationsSupply property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsSupply }
     *     
     */
    public TelecommunicationsSupply getTelecommunicationsSupply() {
        return telecommunicationsSupply;
    }

    /**
     * Sets the value of the telecommunicationsSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsSupply }
     *     
     */
    public void setTelecommunicationsSupply(TelecommunicationsSupply value) {
        this.telecommunicationsSupply = value;
    }

    /**
     * Gets the value of the legalMonetaryTotal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryTotalType }
     *     
     */
    public MonetaryTotalType getLegalMonetaryTotal() {
        return legalMonetaryTotal;
    }

    /**
     * Sets the value of the legalMonetaryTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryTotalType }
     *     
     */
    public void setLegalMonetaryTotal(MonetaryTotalType value) {
        this.legalMonetaryTotal = value;
    }

}
