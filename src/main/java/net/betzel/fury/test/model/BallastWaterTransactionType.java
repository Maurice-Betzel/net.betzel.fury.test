
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BallastWaterTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BallastWaterTransactionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TankID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TankTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExchangeMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExchangedPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SeaHeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SalinityMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransactionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Location" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BallastWaterTemperature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BallastWaterTransactionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "tankID",
    "tankTypeCode",
    "exchangeMethodCode",
    "exchangedPercent",
    "volumeMeasure",
    "seaHeightMeasure",
    "salinityMeasure",
    "transactionDate",
    "location",
    "ballastWaterTemperature"
})
public class BallastWaterTransactionType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TankID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TankID tankID;
    @XmlElement(name = "TankTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TankTypeCode tankTypeCode;
    @XmlElement(name = "ExchangeMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExchangeMethodCode exchangeMethodCode;
    @XmlElement(name = "ExchangedPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExchangedPercent exchangedPercent;
    @XmlElement(name = "VolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected VolumeMeasure volumeMeasure;
    @XmlElement(name = "SeaHeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SeaHeightMeasure seaHeightMeasure;
    @XmlElement(name = "SalinityMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SalinityMeasure salinityMeasure;
    @XmlElement(name = "TransactionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransactionDate transactionDate;
    @XmlElement(name = "Location", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType location;
    @XmlElement(name = "BallastWaterTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType ballastWaterTemperature;

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
     * Gets the value of the tankID property.
     * 
     * @return
     *     possible object is
     *     {@link TankID }
     *     
     */
    public TankID getTankID() {
        return tankID;
    }

    /**
     * Sets the value of the tankID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TankID }
     *     
     */
    public void setTankID(TankID value) {
        this.tankID = value;
    }

    /**
     * Gets the value of the tankTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TankTypeCode }
     *     
     */
    public TankTypeCode getTankTypeCode() {
        return tankTypeCode;
    }

    /**
     * Sets the value of the tankTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TankTypeCode }
     *     
     */
    public void setTankTypeCode(TankTypeCode value) {
        this.tankTypeCode = value;
    }

    /**
     * Gets the value of the exchangeMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeMethodCode }
     *     
     */
    public ExchangeMethodCode getExchangeMethodCode() {
        return exchangeMethodCode;
    }

    /**
     * Sets the value of the exchangeMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeMethodCode }
     *     
     */
    public void setExchangeMethodCode(ExchangeMethodCode value) {
        this.exchangeMethodCode = value;
    }

    /**
     * Gets the value of the exchangedPercent property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangedPercent }
     *     
     */
    public ExchangedPercent getExchangedPercent() {
        return exchangedPercent;
    }

    /**
     * Sets the value of the exchangedPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangedPercent }
     *     
     */
    public void setExchangedPercent(ExchangedPercent value) {
        this.exchangedPercent = value;
    }

    /**
     * Gets the value of the volumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeasure }
     *     
     */
    public VolumeMeasure getVolumeMeasure() {
        return volumeMeasure;
    }

    /**
     * Sets the value of the volumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasure }
     *     
     */
    public void setVolumeMeasure(VolumeMeasure value) {
        this.volumeMeasure = value;
    }

    /**
     * Gets the value of the seaHeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link SeaHeightMeasure }
     *     
     */
    public SeaHeightMeasure getSeaHeightMeasure() {
        return seaHeightMeasure;
    }

    /**
     * Sets the value of the seaHeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaHeightMeasure }
     *     
     */
    public void setSeaHeightMeasure(SeaHeightMeasure value) {
        this.seaHeightMeasure = value;
    }

    /**
     * Gets the value of the salinityMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link SalinityMeasure }
     *     
     */
    public SalinityMeasure getSalinityMeasure() {
        return salinityMeasure;
    }

    /**
     * Sets the value of the salinityMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalinityMeasure }
     *     
     */
    public void setSalinityMeasure(SalinityMeasure value) {
        this.salinityMeasure = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDate }
     *     
     */
    public TransactionDate getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDate }
     *     
     */
    public void setTransactionDate(TransactionDate value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the ballastWaterTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getBallastWaterTemperature() {
        return ballastWaterTemperature;
    }

    /**
     * Sets the value of the ballastWaterTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setBallastWaterTemperature(TemperatureType value) {
        this.ballastWaterTemperature = value;
    }

}
