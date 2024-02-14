
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumptionCorrectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCorrectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GasPressureQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NormalTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DifferenceTemperatureReductionQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionEnergyQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionWaterQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CorrectionAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCorrectionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "correctionType",
    "correctionTypeCode",
    "meterNumber",
    "gasPressureQuantity",
    "actualTemperatureReductionQuantity",
    "normalTemperatureReductionQuantity",
    "differenceTemperatureReductionQuantity",
    "descriptions",
    "correctionUnitAmount",
    "consumptionEnergyQuantity",
    "consumptionWaterQuantity",
    "correctionAmount"
})
public class ConsumptionCorrectionType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "CorrectionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CorrectionType correctionType;
    @XmlElement(name = "CorrectionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CorrectionTypeCode correctionTypeCode;
    @XmlElement(name = "MeterNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MeterNumber meterNumber;
    @XmlElement(name = "GasPressureQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GasPressureQuantity gasPressureQuantity;
    @XmlElement(name = "ActualTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ActualTemperatureReductionQuantity actualTemperatureReductionQuantity;
    @XmlElement(name = "NormalTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NormalTemperatureReductionQuantity normalTemperatureReductionQuantity;
    @XmlElement(name = "DifferenceTemperatureReductionQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DifferenceTemperatureReductionQuantity differenceTemperatureReductionQuantity;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "CorrectionUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CorrectionUnitAmount correctionUnitAmount;
    @XmlElement(name = "ConsumptionEnergyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionEnergyQuantity consumptionEnergyQuantity;
    @XmlElement(name = "ConsumptionWaterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionWaterQuantity consumptionWaterQuantity;
    @XmlElement(name = "CorrectionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CorrectionAmount correctionAmount;

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
     * Gets the value of the correctionType property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionType }
     *     
     */
    public CorrectionType getCorrectionType() {
        return correctionType;
    }

    /**
     * Sets the value of the correctionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionType }
     *     
     */
    public void setCorrectionType(CorrectionType value) {
        this.correctionType = value;
    }

    /**
     * Gets the value of the correctionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionTypeCode }
     *     
     */
    public CorrectionTypeCode getCorrectionTypeCode() {
        return correctionTypeCode;
    }

    /**
     * Sets the value of the correctionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionTypeCode }
     *     
     */
    public void setCorrectionTypeCode(CorrectionTypeCode value) {
        this.correctionTypeCode = value;
    }

    /**
     * Gets the value of the meterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MeterNumber }
     *     
     */
    public MeterNumber getMeterNumber() {
        return meterNumber;
    }

    /**
     * Sets the value of the meterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterNumber }
     *     
     */
    public void setMeterNumber(MeterNumber value) {
        this.meterNumber = value;
    }

    /**
     * Gets the value of the gasPressureQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link GasPressureQuantity }
     *     
     */
    public GasPressureQuantity getGasPressureQuantity() {
        return gasPressureQuantity;
    }

    /**
     * Sets the value of the gasPressureQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasPressureQuantity }
     *     
     */
    public void setGasPressureQuantity(GasPressureQuantity value) {
        this.gasPressureQuantity = value;
    }

    /**
     * Gets the value of the actualTemperatureReductionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ActualTemperatureReductionQuantity }
     *     
     */
    public ActualTemperatureReductionQuantity getActualTemperatureReductionQuantity() {
        return actualTemperatureReductionQuantity;
    }

    /**
     * Sets the value of the actualTemperatureReductionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualTemperatureReductionQuantity }
     *     
     */
    public void setActualTemperatureReductionQuantity(ActualTemperatureReductionQuantity value) {
        this.actualTemperatureReductionQuantity = value;
    }

    /**
     * Gets the value of the normalTemperatureReductionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link NormalTemperatureReductionQuantity }
     *     
     */
    public NormalTemperatureReductionQuantity getNormalTemperatureReductionQuantity() {
        return normalTemperatureReductionQuantity;
    }

    /**
     * Sets the value of the normalTemperatureReductionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalTemperatureReductionQuantity }
     *     
     */
    public void setNormalTemperatureReductionQuantity(NormalTemperatureReductionQuantity value) {
        this.normalTemperatureReductionQuantity = value;
    }

    /**
     * Gets the value of the differenceTemperatureReductionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DifferenceTemperatureReductionQuantity }
     *     
     */
    public DifferenceTemperatureReductionQuantity getDifferenceTemperatureReductionQuantity() {
        return differenceTemperatureReductionQuantity;
    }

    /**
     * Sets the value of the differenceTemperatureReductionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifferenceTemperatureReductionQuantity }
     *     
     */
    public void setDifferenceTemperatureReductionQuantity(DifferenceTemperatureReductionQuantity value) {
        this.differenceTemperatureReductionQuantity = value;
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
     * Gets the value of the correctionUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionUnitAmount }
     *     
     */
    public CorrectionUnitAmount getCorrectionUnitAmount() {
        return correctionUnitAmount;
    }

    /**
     * Sets the value of the correctionUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionUnitAmount }
     *     
     */
    public void setCorrectionUnitAmount(CorrectionUnitAmount value) {
        this.correctionUnitAmount = value;
    }

    /**
     * Gets the value of the consumptionEnergyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionEnergyQuantity }
     *     
     */
    public ConsumptionEnergyQuantity getConsumptionEnergyQuantity() {
        return consumptionEnergyQuantity;
    }

    /**
     * Sets the value of the consumptionEnergyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionEnergyQuantity }
     *     
     */
    public void setConsumptionEnergyQuantity(ConsumptionEnergyQuantity value) {
        this.consumptionEnergyQuantity = value;
    }

    /**
     * Gets the value of the consumptionWaterQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionWaterQuantity }
     *     
     */
    public ConsumptionWaterQuantity getConsumptionWaterQuantity() {
        return consumptionWaterQuantity;
    }

    /**
     * Sets the value of the consumptionWaterQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionWaterQuantity }
     *     
     */
    public void setConsumptionWaterQuantity(ConsumptionWaterQuantity value) {
        this.consumptionWaterQuantity = value;
    }

    /**
     * Gets the value of the correctionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionAmount }
     *     
     */
    public CorrectionAmount getCorrectionAmount() {
        return correctionAmount;
    }

    /**
     * Sets the value of the correctionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionAmount }
     *     
     */
    public void setCorrectionAmount(CorrectionAmount value) {
        this.correctionAmount = value;
    }

}
