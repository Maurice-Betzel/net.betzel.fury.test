
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
 * <p>Java class for TransportMeansType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportMeansType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JourneyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationNationalityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationNationality" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportMeansTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TradeServiceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Stowage" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AirTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RoadTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RailTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaritimeTransport" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OwnerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeansType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "journeyID",
    "registrationNationalityID",
    "registrationNationalities",
    "directionCode",
    "transportMeansTypeCode",
    "tradeServiceCode",
    "stowage",
    "airTransport",
    "roadTransport",
    "railTransport",
    "maritimeTransport",
    "ownerParty",
    "measurementDimensions"
})
public class TransportMeansType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "JourneyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected JourneyID journeyID;
    @XmlElement(name = "RegistrationNationalityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RegistrationNationalityID registrationNationalityID;
    @XmlElement(name = "RegistrationNationality", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<RegistrationNationality> registrationNationalities;
    @XmlElement(name = "DirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DirectionCode directionCode;
    @XmlElement(name = "TransportMeansTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransportMeansTypeCode transportMeansTypeCode;
    @XmlElement(name = "TradeServiceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TradeServiceCode tradeServiceCode;
    @XmlElement(name = "Stowage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected StowageType stowage;
    @XmlElement(name = "AirTransport", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AirTransport airTransport;
    @XmlElement(name = "RoadTransport", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected RoadTransport roadTransport;
    @XmlElement(name = "RailTransport", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected RailTransport railTransport;
    @XmlElement(name = "MaritimeTransport", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected MaritimeTransport maritimeTransport;
    @XmlElement(name = "OwnerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType ownerParty;
    @XmlElement(name = "MeasurementDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DimensionType> measurementDimensions;

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
     * Gets the value of the journeyID property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyID }
     *     
     */
    public JourneyID getJourneyID() {
        return journeyID;
    }

    /**
     * Sets the value of the journeyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyID }
     *     
     */
    public void setJourneyID(JourneyID value) {
        this.journeyID = value;
    }

    /**
     * Gets the value of the registrationNationalityID property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNationalityID }
     *     
     */
    public RegistrationNationalityID getRegistrationNationalityID() {
        return registrationNationalityID;
    }

    /**
     * Sets the value of the registrationNationalityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNationalityID }
     *     
     */
    public void setRegistrationNationalityID(RegistrationNationalityID value) {
        this.registrationNationalityID = value;
    }

    /**
     * Gets the value of the registrationNationalities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrationNationalities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrationNationalities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistrationNationality }
     * 
     * 
     */
    public List<RegistrationNationality> getRegistrationNationalities() {
        if (registrationNationalities == null) {
            registrationNationalities = new ArrayList<RegistrationNationality>();
        }
        return this.registrationNationalities;
    }

    /**
     * Gets the value of the directionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCode }
     *     
     */
    public DirectionCode getDirectionCode() {
        return directionCode;
    }

    /**
     * Sets the value of the directionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCode }
     *     
     */
    public void setDirectionCode(DirectionCode value) {
        this.directionCode = value;
    }

    /**
     * Gets the value of the transportMeansTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansTypeCode }
     *     
     */
    public TransportMeansTypeCode getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /**
     * Sets the value of the transportMeansTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansTypeCode }
     *     
     */
    public void setTransportMeansTypeCode(TransportMeansTypeCode value) {
        this.transportMeansTypeCode = value;
    }

    /**
     * Gets the value of the tradeServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeServiceCode }
     *     
     */
    public TradeServiceCode getTradeServiceCode() {
        return tradeServiceCode;
    }

    /**
     * Sets the value of the tradeServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeServiceCode }
     *     
     */
    public void setTradeServiceCode(TradeServiceCode value) {
        this.tradeServiceCode = value;
    }

    /**
     * Gets the value of the stowage property.
     * 
     * @return
     *     possible object is
     *     {@link StowageType }
     *     
     */
    public StowageType getStowage() {
        return stowage;
    }

    /**
     * Sets the value of the stowage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StowageType }
     *     
     */
    public void setStowage(StowageType value) {
        this.stowage = value;
    }

    /**
     * Gets the value of the airTransport property.
     * 
     * @return
     *     possible object is
     *     {@link AirTransport }
     *     
     */
    public AirTransport getAirTransport() {
        return airTransport;
    }

    /**
     * Sets the value of the airTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTransport }
     *     
     */
    public void setAirTransport(AirTransport value) {
        this.airTransport = value;
    }

    /**
     * Gets the value of the roadTransport property.
     * 
     * @return
     *     possible object is
     *     {@link RoadTransport }
     *     
     */
    public RoadTransport getRoadTransport() {
        return roadTransport;
    }

    /**
     * Sets the value of the roadTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadTransport }
     *     
     */
    public void setRoadTransport(RoadTransport value) {
        this.roadTransport = value;
    }

    /**
     * Gets the value of the railTransport property.
     * 
     * @return
     *     possible object is
     *     {@link RailTransport }
     *     
     */
    public RailTransport getRailTransport() {
        return railTransport;
    }

    /**
     * Sets the value of the railTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailTransport }
     *     
     */
    public void setRailTransport(RailTransport value) {
        this.railTransport = value;
    }

    /**
     * Gets the value of the maritimeTransport property.
     * 
     * @return
     *     possible object is
     *     {@link MaritimeTransport }
     *     
     */
    public MaritimeTransport getMaritimeTransport() {
        return maritimeTransport;
    }

    /**
     * Sets the value of the maritimeTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritimeTransport }
     *     
     */
    public void setMaritimeTransport(MaritimeTransport value) {
        this.maritimeTransport = value;
    }

    /**
     * Gets the value of the ownerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOwnerParty() {
        return ownerParty;
    }

    /**
     * Sets the value of the ownerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOwnerParty(PartyType value) {
        this.ownerParty = value;
    }

    /**
     * Gets the value of the measurementDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getMeasurementDimensions() {
        if (measurementDimensions == null) {
            measurementDimensions = new ArrayList<DimensionType>();
        }
        return this.measurementDimensions;
    }

}
