
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReleaseID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TrackingID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AlternativeDeliveryLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDeliveryPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromisedDeliveryPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDeliveryPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumDeliveryUnit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumDeliveryUnit" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Shipment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FuelConsumption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "quantity",
    "minimumQuantity",
    "maximumQuantity",
    "actualDeliveryDate",
    "actualDeliveryTime",
    "latestDeliveryDate",
    "latestDeliveryTime",
    "releaseID",
    "trackingID",
    "deliveryAddress",
    "deliveryLocation",
    "alternativeDeliveryLocation",
    "requestedDeliveryPeriod",
    "promisedDeliveryPeriod",
    "estimatedDeliveryPeriod",
    "carrierParty",
    "deliveryParty",
    "notifyParties",
    "despatch",
    "deliveryTerms",
    "minimumDeliveryUnit",
    "maximumDeliveryUnit",
    "shipment",
    "fuelConsumptions"
})
public class DeliveryType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Quantity quantity;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumQuantity minimumQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumQuantity maximumQuantity;
    @XmlElement(name = "ActualDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ActualDeliveryDate actualDeliveryDate;
    @XmlElement(name = "ActualDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ActualDeliveryTime actualDeliveryTime;
    @XmlElement(name = "LatestDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatestDeliveryDate latestDeliveryDate;
    @XmlElement(name = "LatestDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatestDeliveryTime latestDeliveryTime;
    @XmlElement(name = "ReleaseID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReleaseID releaseID;
    @XmlElement(name = "TrackingID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TrackingID trackingID;
    @XmlElement(name = "DeliveryAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AddressType deliveryAddress;
    @XmlElement(name = "DeliveryLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType deliveryLocation;
    @XmlElement(name = "AlternativeDeliveryLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType alternativeDeliveryLocation;
    @XmlElement(name = "RequestedDeliveryPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType requestedDeliveryPeriod;
    @XmlElement(name = "PromisedDeliveryPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType promisedDeliveryPeriod;
    @XmlElement(name = "EstimatedDeliveryPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType estimatedDeliveryPeriod;
    @XmlElement(name = "CarrierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType carrierParty;
    @XmlElement(name = "DeliveryParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType deliveryParty;
    @XmlElement(name = "NotifyParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyType> notifyParties;
    @XmlElement(name = "Despatch", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected Despatch despatch;
    @XmlElement(name = "DeliveryTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DeliveryTerms> deliveryTerms;
    @XmlElement(name = "MinimumDeliveryUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DeliveryUnitType minimumDeliveryUnit;
    @XmlElement(name = "MaximumDeliveryUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DeliveryUnitType maximumDeliveryUnit;
    @XmlElement(name = "Shipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ShipmentType shipment;
    @XmlElement(name = "FuelConsumption", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<FuelConsumption> fuelConsumptions;

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumQuantity }
     *     
     */
    public MinimumQuantity getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumQuantity }
     *     
     */
    public void setMinimumQuantity(MinimumQuantity value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumQuantity }
     *     
     */
    public MaximumQuantity getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumQuantity }
     *     
     */
    public void setMaximumQuantity(MaximumQuantity value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the actualDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link ActualDeliveryDate }
     *     
     */
    public ActualDeliveryDate getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * Sets the value of the actualDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDeliveryDate }
     *     
     */
    public void setActualDeliveryDate(ActualDeliveryDate value) {
        this.actualDeliveryDate = value;
    }

    /**
     * Gets the value of the actualDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link ActualDeliveryTime }
     *     
     */
    public ActualDeliveryTime getActualDeliveryTime() {
        return actualDeliveryTime;
    }

    /**
     * Sets the value of the actualDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDeliveryTime }
     *     
     */
    public void setActualDeliveryTime(ActualDeliveryTime value) {
        this.actualDeliveryTime = value;
    }

    /**
     * Gets the value of the latestDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link LatestDeliveryDate }
     *     
     */
    public LatestDeliveryDate getLatestDeliveryDate() {
        return latestDeliveryDate;
    }

    /**
     * Sets the value of the latestDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestDeliveryDate }
     *     
     */
    public void setLatestDeliveryDate(LatestDeliveryDate value) {
        this.latestDeliveryDate = value;
    }

    /**
     * Gets the value of the latestDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link LatestDeliveryTime }
     *     
     */
    public LatestDeliveryTime getLatestDeliveryTime() {
        return latestDeliveryTime;
    }

    /**
     * Sets the value of the latestDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestDeliveryTime }
     *     
     */
    public void setLatestDeliveryTime(LatestDeliveryTime value) {
        this.latestDeliveryTime = value;
    }

    /**
     * Gets the value of the releaseID property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseID }
     *     
     */
    public ReleaseID getReleaseID() {
        return releaseID;
    }

    /**
     * Sets the value of the releaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseID }
     *     
     */
    public void setReleaseID(ReleaseID value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the trackingID property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingID }
     *     
     */
    public TrackingID getTrackingID() {
        return trackingID;
    }

    /**
     * Sets the value of the trackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingID }
     *     
     */
    public void setTrackingID(TrackingID value) {
        this.trackingID = value;
    }

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDeliveryAddress(AddressType value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Sets the value of the deliveryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDeliveryLocation(LocationType value) {
        this.deliveryLocation = value;
    }

    /**
     * Gets the value of the alternativeDeliveryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getAlternativeDeliveryLocation() {
        return alternativeDeliveryLocation;
    }

    /**
     * Sets the value of the alternativeDeliveryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setAlternativeDeliveryLocation(LocationType value) {
        this.alternativeDeliveryLocation = value;
    }

    /**
     * Gets the value of the requestedDeliveryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getRequestedDeliveryPeriod() {
        return requestedDeliveryPeriod;
    }

    /**
     * Sets the value of the requestedDeliveryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setRequestedDeliveryPeriod(PeriodType value) {
        this.requestedDeliveryPeriod = value;
    }

    /**
     * Gets the value of the promisedDeliveryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPromisedDeliveryPeriod() {
        return promisedDeliveryPeriod;
    }

    /**
     * Sets the value of the promisedDeliveryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPromisedDeliveryPeriod(PeriodType value) {
        this.promisedDeliveryPeriod = value;
    }

    /**
     * Gets the value of the estimatedDeliveryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedDeliveryPeriod() {
        return estimatedDeliveryPeriod;
    }

    /**
     * Sets the value of the estimatedDeliveryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedDeliveryPeriod(PeriodType value) {
        this.estimatedDeliveryPeriod = value;
    }

    /**
     * Gets the value of the carrierParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCarrierParty() {
        return carrierParty;
    }

    /**
     * Sets the value of the carrierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCarrierParty(PartyType value) {
        this.carrierParty = value;
    }

    /**
     * Gets the value of the deliveryParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDeliveryParty() {
        return deliveryParty;
    }

    /**
     * Sets the value of the deliveryParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDeliveryParty(PartyType value) {
        this.deliveryParty = value;
    }

    /**
     * Gets the value of the notifyParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getNotifyParties() {
        if (notifyParties == null) {
            notifyParties = new ArrayList<PartyType>();
        }
        return this.notifyParties;
    }

    /**
     * Gets the value of the despatch property.
     * 
     * @return
     *     possible object is
     *     {@link Despatch }
     *     
     */
    public Despatch getDespatch() {
        return despatch;
    }

    /**
     * Sets the value of the despatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Despatch }
     *     
     */
    public void setDespatch(Despatch value) {
        this.despatch = value;
    }

    /**
     * Gets the value of the deliveryTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryTerms }
     * 
     * 
     */
    public List<DeliveryTerms> getDeliveryTerms() {
        if (deliveryTerms == null) {
            deliveryTerms = new ArrayList<DeliveryTerms>();
        }
        return this.deliveryTerms;
    }

    /**
     * Gets the value of the minimumDeliveryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryUnitType }
     *     
     */
    public DeliveryUnitType getMinimumDeliveryUnit() {
        return minimumDeliveryUnit;
    }

    /**
     * Sets the value of the minimumDeliveryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryUnitType }
     *     
     */
    public void setMinimumDeliveryUnit(DeliveryUnitType value) {
        this.minimumDeliveryUnit = value;
    }

    /**
     * Gets the value of the maximumDeliveryUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryUnitType }
     *     
     */
    public DeliveryUnitType getMaximumDeliveryUnit() {
        return maximumDeliveryUnit;
    }

    /**
     * Sets the value of the maximumDeliveryUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryUnitType }
     *     
     */
    public void setMaximumDeliveryUnit(DeliveryUnitType value) {
        this.maximumDeliveryUnit = value;
    }

    /**
     * Gets the value of the shipment property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipment() {
        return shipment;
    }

    /**
     * Sets the value of the shipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipment(ShipmentType value) {
        this.shipment = value;
    }

    /**
     * Gets the value of the fuelConsumptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuelConsumptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuelConsumptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuelConsumption }
     * 
     * 
     */
    public List<FuelConsumption> getFuelConsumptions() {
        if (fuelConsumptions == null) {
            fuelConsumptions = new ArrayList<FuelConsumption>();
        }
        return this.fuelConsumptions;
    }

}
