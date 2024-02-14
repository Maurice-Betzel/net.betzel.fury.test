
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
 * <p>Java class for StorageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StorageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GateID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AirFlowPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumidityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnimalFoodApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumanFoodApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DangerousGoodsApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RefrigeratedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PowerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "name",
    "gateID",
    "airFlowPercent",
    "humidityPercent",
    "animalFoodApprovedIndicator",
    "humanFoodApprovedIndicator",
    "dangerousGoodsApprovedIndicator",
    "refrigeratedIndicator",
    "powerIndicator",
    "minimumTemperature",
    "maximumTemperature",
    "certificates"
})
@XmlRootElement(name = "Storage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class Storage
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Name name;
    @XmlElement(name = "GateID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GateID gateID;
    @XmlElement(name = "AirFlowPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AirFlowPercent airFlowPercent;
    @XmlElement(name = "HumidityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HumidityPercent humidityPercent;
    @XmlElement(name = "AnimalFoodApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AnimalFoodApprovedIndicator animalFoodApprovedIndicator;
    @XmlElement(name = "HumanFoodApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HumanFoodApprovedIndicator humanFoodApprovedIndicator;
    @XmlElement(name = "DangerousGoodsApprovedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DangerousGoodsApprovedIndicator dangerousGoodsApprovedIndicator;
    @XmlElement(name = "RefrigeratedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RefrigeratedIndicator refrigeratedIndicator;
    @XmlElement(name = "PowerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PowerIndicator powerIndicator;
    @XmlElement(name = "MinimumTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "Certificate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CertificateType> certificates;

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
     * Gets the value of the gateID property.
     * 
     * @return
     *     possible object is
     *     {@link GateID }
     *     
     */
    public GateID getGateID() {
        return gateID;
    }

    /**
     * Sets the value of the gateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link GateID }
     *     
     */
    public void setGateID(GateID value) {
        this.gateID = value;
    }

    /**
     * Gets the value of the airFlowPercent property.
     * 
     * @return
     *     possible object is
     *     {@link AirFlowPercent }
     *     
     */
    public AirFlowPercent getAirFlowPercent() {
        return airFlowPercent;
    }

    /**
     * Sets the value of the airFlowPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFlowPercent }
     *     
     */
    public void setAirFlowPercent(AirFlowPercent value) {
        this.airFlowPercent = value;
    }

    /**
     * Gets the value of the humidityPercent property.
     * 
     * @return
     *     possible object is
     *     {@link HumidityPercent }
     *     
     */
    public HumidityPercent getHumidityPercent() {
        return humidityPercent;
    }

    /**
     * Sets the value of the humidityPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumidityPercent }
     *     
     */
    public void setHumidityPercent(HumidityPercent value) {
        this.humidityPercent = value;
    }

    /**
     * Gets the value of the animalFoodApprovedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalFoodApprovedIndicator }
     *     
     */
    public AnimalFoodApprovedIndicator getAnimalFoodApprovedIndicator() {
        return animalFoodApprovedIndicator;
    }

    /**
     * Sets the value of the animalFoodApprovedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalFoodApprovedIndicator }
     *     
     */
    public void setAnimalFoodApprovedIndicator(AnimalFoodApprovedIndicator value) {
        this.animalFoodApprovedIndicator = value;
    }

    /**
     * Gets the value of the humanFoodApprovedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link HumanFoodApprovedIndicator }
     *     
     */
    public HumanFoodApprovedIndicator getHumanFoodApprovedIndicator() {
        return humanFoodApprovedIndicator;
    }

    /**
     * Sets the value of the humanFoodApprovedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanFoodApprovedIndicator }
     *     
     */
    public void setHumanFoodApprovedIndicator(HumanFoodApprovedIndicator value) {
        this.humanFoodApprovedIndicator = value;
    }

    /**
     * Gets the value of the dangerousGoodsApprovedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsApprovedIndicator }
     *     
     */
    public DangerousGoodsApprovedIndicator getDangerousGoodsApprovedIndicator() {
        return dangerousGoodsApprovedIndicator;
    }

    /**
     * Sets the value of the dangerousGoodsApprovedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsApprovedIndicator }
     *     
     */
    public void setDangerousGoodsApprovedIndicator(DangerousGoodsApprovedIndicator value) {
        this.dangerousGoodsApprovedIndicator = value;
    }

    /**
     * Gets the value of the refrigeratedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link RefrigeratedIndicator }
     *     
     */
    public RefrigeratedIndicator getRefrigeratedIndicator() {
        return refrigeratedIndicator;
    }

    /**
     * Sets the value of the refrigeratedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefrigeratedIndicator }
     *     
     */
    public void setRefrigeratedIndicator(RefrigeratedIndicator value) {
        this.refrigeratedIndicator = value;
    }

    /**
     * Gets the value of the powerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PowerIndicator }
     *     
     */
    public PowerIndicator getPowerIndicator() {
        return powerIndicator;
    }

    /**
     * Sets the value of the powerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerIndicator }
     *     
     */
    public void setPowerIndicator(PowerIndicator value) {
        this.powerIndicator = value;
    }

    /**
     * Gets the value of the minimumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Sets the value of the minimumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMinimumTemperature(TemperatureType value) {
        this.minimumTemperature = value;
    }

    /**
     * Gets the value of the maximumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Sets the value of the maximumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMaximumTemperature(TemperatureType value) {
        this.maximumTemperature = value;
    }

    /**
     * Gets the value of the certificates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateType }
     * 
     * 
     */
    public List<CertificateType> getCertificates() {
        if (certificates == null) {
            certificates = new ArrayList<CertificateType>();
        }
        return this.certificates;
    }

}
