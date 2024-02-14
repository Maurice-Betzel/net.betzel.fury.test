
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
 * <p>Java class for TransportationServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportServiceCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Priority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreightRateClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportationServiceDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportationServiceDetailsURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NominationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NominationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnsupportedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportedCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnsupportedCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TotalCapacityDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResponsibleTransportServiceProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalEmission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ScheduledServiceFrequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationServiceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "transportServiceCode",
    "tariffClassCode",
    "priority",
    "freightRateClassCode",
    "transportationServiceDescriptions",
    "transportationServiceDetailsURI",
    "nominationDate",
    "nominationTime",
    "name",
    "sequenceNumeric",
    "transportEquipments",
    "supportedTransportEquipments",
    "unsupportedTransportEquipments",
    "commodityClassifications",
    "supportedCommodityClassifications",
    "unsupportedCommodityClassifications",
    "totalCapacityDimension",
    "shipmentStages",
    "transportEvents",
    "responsibleTransportServiceProviderParty",
    "environmentalEmissions",
    "estimatedDurationPeriod",
    "scheduledServiceFrequencies"
})
public class TransportationServiceType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TransportServiceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected TransportServiceCode transportServiceCode;
    @XmlElement(name = "TariffClassCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TariffClassCode tariffClassCode;
    @XmlElement(name = "Priority", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Priority priority;
    @XmlElement(name = "FreightRateClassCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FreightRateClassCode freightRateClassCode;
    @XmlElement(name = "TransportationServiceDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<TransportationServiceDescription> transportationServiceDescriptions;
    @XmlElement(name = "TransportationServiceDetailsURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransportationServiceDetailsURI transportationServiceDetailsURI;
    @XmlElement(name = "NominationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NominationDate nominationDate;
    @XmlElement(name = "NominationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NominationTime nominationTime;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Name name;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SequenceNumeric sequenceNumeric;
    @XmlElement(name = "TransportEquipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEquipmentType> transportEquipments;
    @XmlElement(name = "SupportedTransportEquipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEquipmentType> supportedTransportEquipments;
    @XmlElement(name = "UnsupportedTransportEquipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEquipmentType> unsupportedTransportEquipments;
    @XmlElement(name = "CommodityClassification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CommodityClassificationType> commodityClassifications;
    @XmlElement(name = "SupportedCommodityClassification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CommodityClassificationType> supportedCommodityClassifications;
    @XmlElement(name = "UnsupportedCommodityClassification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CommodityClassificationType> unsupportedCommodityClassifications;
    @XmlElement(name = "TotalCapacityDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DimensionType totalCapacityDimension;
    @XmlElement(name = "ShipmentStage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentStageType> shipmentStages;
    @XmlElement(name = "TransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> transportEvents;
    @XmlElement(name = "ResponsibleTransportServiceProviderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType responsibleTransportServiceProviderParty;
    @XmlElement(name = "EnvironmentalEmission", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EnvironmentalEmission> environmentalEmissions;
    @XmlElement(name = "EstimatedDurationPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType estimatedDurationPeriod;
    @XmlElement(name = "ScheduledServiceFrequency", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ServiceFrequencyType> scheduledServiceFrequencies;

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
     * Gets the value of the transportServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportServiceCode }
     *     
     */
    public TransportServiceCode getTransportServiceCode() {
        return transportServiceCode;
    }

    /**
     * Sets the value of the transportServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportServiceCode }
     *     
     */
    public void setTransportServiceCode(TransportServiceCode value) {
        this.transportServiceCode = value;
    }

    /**
     * Gets the value of the tariffClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link TariffClassCode }
     *     
     */
    public TariffClassCode getTariffClassCode() {
        return tariffClassCode;
    }

    /**
     * Sets the value of the tariffClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffClassCode }
     *     
     */
    public void setTariffClassCode(TariffClassCode value) {
        this.tariffClassCode = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the freightRateClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link FreightRateClassCode }
     *     
     */
    public FreightRateClassCode getFreightRateClassCode() {
        return freightRateClassCode;
    }

    /**
     * Sets the value of the freightRateClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightRateClassCode }
     *     
     */
    public void setFreightRateClassCode(FreightRateClassCode value) {
        this.freightRateClassCode = value;
    }

    /**
     * Gets the value of the transportationServiceDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportationServiceDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportationServiceDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationServiceDescription }
     * 
     * 
     */
    public List<TransportationServiceDescription> getTransportationServiceDescriptions() {
        if (transportationServiceDescriptions == null) {
            transportationServiceDescriptions = new ArrayList<TransportationServiceDescription>();
        }
        return this.transportationServiceDescriptions;
    }

    /**
     * Gets the value of the transportationServiceDetailsURI property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceDetailsURI }
     *     
     */
    public TransportationServiceDetailsURI getTransportationServiceDetailsURI() {
        return transportationServiceDetailsURI;
    }

    /**
     * Sets the value of the transportationServiceDetailsURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceDetailsURI }
     *     
     */
    public void setTransportationServiceDetailsURI(TransportationServiceDetailsURI value) {
        this.transportationServiceDetailsURI = value;
    }

    /**
     * Gets the value of the nominationDate property.
     * 
     * @return
     *     possible object is
     *     {@link NominationDate }
     *     
     */
    public NominationDate getNominationDate() {
        return nominationDate;
    }

    /**
     * Sets the value of the nominationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NominationDate }
     *     
     */
    public void setNominationDate(NominationDate value) {
        this.nominationDate = value;
    }

    /**
     * Gets the value of the nominationTime property.
     * 
     * @return
     *     possible object is
     *     {@link NominationTime }
     *     
     */
    public NominationTime getNominationTime() {
        return nominationTime;
    }

    /**
     * Sets the value of the nominationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link NominationTime }
     *     
     */
    public void setNominationTime(NominationTime value) {
        this.nominationTime = value;
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
     * Gets the value of the transportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getTransportEquipments() {
        if (transportEquipments == null) {
            transportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.transportEquipments;
    }

    /**
     * Gets the value of the supportedTransportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedTransportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getSupportedTransportEquipments() {
        if (supportedTransportEquipments == null) {
            supportedTransportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.supportedTransportEquipments;
    }

    /**
     * Gets the value of the unsupportedTransportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsupportedTransportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsupportedTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getUnsupportedTransportEquipments() {
        if (unsupportedTransportEquipments == null) {
            unsupportedTransportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.unsupportedTransportEquipments;
    }

    /**
     * Gets the value of the commodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getCommodityClassifications() {
        if (commodityClassifications == null) {
            commodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.commodityClassifications;
    }

    /**
     * Gets the value of the supportedCommodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedCommodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getSupportedCommodityClassifications() {
        if (supportedCommodityClassifications == null) {
            supportedCommodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.supportedCommodityClassifications;
    }

    /**
     * Gets the value of the unsupportedCommodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsupportedCommodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsupportedCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getUnsupportedCommodityClassifications() {
        if (unsupportedCommodityClassifications == null) {
            unsupportedCommodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.unsupportedCommodityClassifications;
    }

    /**
     * Gets the value of the totalCapacityDimension property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getTotalCapacityDimension() {
        return totalCapacityDimension;
    }

    /**
     * Sets the value of the totalCapacityDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setTotalCapacityDimension(DimensionType value) {
        this.totalCapacityDimension = value;
    }

    /**
     * Gets the value of the shipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getShipmentStages() {
        if (shipmentStages == null) {
            shipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.shipmentStages;
    }

    /**
     * Gets the value of the transportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getTransportEvents() {
        if (transportEvents == null) {
            transportEvents = new ArrayList<TransportEventType>();
        }
        return this.transportEvents;
    }

    /**
     * Gets the value of the responsibleTransportServiceProviderParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getResponsibleTransportServiceProviderParty() {
        return responsibleTransportServiceProviderParty;
    }

    /**
     * Sets the value of the responsibleTransportServiceProviderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setResponsibleTransportServiceProviderParty(PartyType value) {
        this.responsibleTransportServiceProviderParty = value;
    }

    /**
     * Gets the value of the environmentalEmissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalEmissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalEmissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentalEmission }
     * 
     * 
     */
    public List<EnvironmentalEmission> getEnvironmentalEmissions() {
        if (environmentalEmissions == null) {
            environmentalEmissions = new ArrayList<EnvironmentalEmission>();
        }
        return this.environmentalEmissions;
    }

    /**
     * Gets the value of the estimatedDurationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedDurationPeriod() {
        return estimatedDurationPeriod;
    }

    /**
     * Sets the value of the estimatedDurationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedDurationPeriod(PeriodType value) {
        this.estimatedDurationPeriod = value;
    }

    /**
     * Gets the value of the scheduledServiceFrequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduledServiceFrequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduledServiceFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFrequencyType }
     * 
     * 
     */
    public List<ServiceFrequencyType> getScheduledServiceFrequencies() {
        if (scheduledServiceFrequencies == null) {
            scheduledServiceFrequencies = new ArrayList<ServiceFrequencyType>();
        }
        return this.scheduledServiceFrequencies;
    }

}
