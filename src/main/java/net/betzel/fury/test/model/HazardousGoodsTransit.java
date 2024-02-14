
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HazardousGoodsTransitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousGoodsTransitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportEmergencyCardCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackingCriteriaCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRegulationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InhalationToxicityZoneCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportAuthorizationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransitDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousGoodsTransitType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "transportEmergencyCardCode",
    "packingCriteriaCode",
    "hazardousRegulationCode",
    "inhalationToxicityZoneCode",
    "transportAuthorizationCode",
    "transitDescriptions",
    "maximumTemperature",
    "minimumTemperature"
})
@XmlRootElement(name = "HazardousGoodsTransit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class HazardousGoodsTransit
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TransportEmergencyCardCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransportEmergencyCardCode transportEmergencyCardCode;
    @XmlElement(name = "PackingCriteriaCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PackingCriteriaCode packingCriteriaCode;
    @XmlElement(name = "HazardousRegulationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HazardousRegulationCode hazardousRegulationCode;
    @XmlElement(name = "InhalationToxicityZoneCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InhalationToxicityZoneCode inhalationToxicityZoneCode;
    @XmlElement(name = "TransportAuthorizationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransportAuthorizationCode transportAuthorizationCode;
    @XmlElement(name = "TransitDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<TransitDescription> transitDescriptions;
    @XmlElement(name = "MaximumTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "MinimumTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType minimumTemperature;

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
     * Gets the value of the transportEmergencyCardCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEmergencyCardCode }
     *     
     */
    public TransportEmergencyCardCode getTransportEmergencyCardCode() {
        return transportEmergencyCardCode;
    }

    /**
     * Sets the value of the transportEmergencyCardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEmergencyCardCode }
     *     
     */
    public void setTransportEmergencyCardCode(TransportEmergencyCardCode value) {
        this.transportEmergencyCardCode = value;
    }

    /**
     * Gets the value of the packingCriteriaCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackingCriteriaCode }
     *     
     */
    public PackingCriteriaCode getPackingCriteriaCode() {
        return packingCriteriaCode;
    }

    /**
     * Sets the value of the packingCriteriaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingCriteriaCode }
     *     
     */
    public void setPackingCriteriaCode(PackingCriteriaCode value) {
        this.packingCriteriaCode = value;
    }

    /**
     * Gets the value of the hazardousRegulationCode property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRegulationCode }
     *     
     */
    public HazardousRegulationCode getHazardousRegulationCode() {
        return hazardousRegulationCode;
    }

    /**
     * Sets the value of the hazardousRegulationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRegulationCode }
     *     
     */
    public void setHazardousRegulationCode(HazardousRegulationCode value) {
        this.hazardousRegulationCode = value;
    }

    /**
     * Gets the value of the inhalationToxicityZoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link InhalationToxicityZoneCode }
     *     
     */
    public InhalationToxicityZoneCode getInhalationToxicityZoneCode() {
        return inhalationToxicityZoneCode;
    }

    /**
     * Sets the value of the inhalationToxicityZoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InhalationToxicityZoneCode }
     *     
     */
    public void setInhalationToxicityZoneCode(InhalationToxicityZoneCode value) {
        this.inhalationToxicityZoneCode = value;
    }

    /**
     * Gets the value of the transportAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportAuthorizationCode }
     *     
     */
    public TransportAuthorizationCode getTransportAuthorizationCode() {
        return transportAuthorizationCode;
    }

    /**
     * Sets the value of the transportAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportAuthorizationCode }
     *     
     */
    public void setTransportAuthorizationCode(TransportAuthorizationCode value) {
        this.transportAuthorizationCode = value;
    }

    /**
     * Gets the value of the transitDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitDescription }
     * 
     * 
     */
    public List<TransitDescription> getTransitDescriptions() {
        if (transitDescriptions == null) {
            transitDescriptions = new ArrayList<TransitDescription>();
        }
        return this.transitDescriptions;
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

}
