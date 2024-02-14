
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EarliestPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EarliestPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestPickupDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestPickupTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "actualPickupDate",
    "actualPickupTime",
    "earliestPickupDate",
    "earliestPickupTime",
    "latestPickupDate",
    "latestPickupTime",
    "pickupLocation",
    "pickupParty"
})
@XmlRootElement(name = "Pickup", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class Pickup
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "ActualPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ActualPickupDate actualPickupDate;
    @XmlElement(name = "ActualPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ActualPickupTime actualPickupTime;
    @XmlElement(name = "EarliestPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EarliestPickupDate earliestPickupDate;
    @XmlElement(name = "EarliestPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EarliestPickupTime earliestPickupTime;
    @XmlElement(name = "LatestPickupDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatestPickupDate latestPickupDate;
    @XmlElement(name = "LatestPickupTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatestPickupTime latestPickupTime;
    @XmlElement(name = "PickupLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType pickupLocation;
    @XmlElement(name = "PickupParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType pickupParty;

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
     * Gets the value of the actualPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link ActualPickupDate }
     *     
     */
    public ActualPickupDate getActualPickupDate() {
        return actualPickupDate;
    }

    /**
     * Sets the value of the actualPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPickupDate }
     *     
     */
    public void setActualPickupDate(ActualPickupDate value) {
        this.actualPickupDate = value;
    }

    /**
     * Gets the value of the actualPickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link ActualPickupTime }
     *     
     */
    public ActualPickupTime getActualPickupTime() {
        return actualPickupTime;
    }

    /**
     * Sets the value of the actualPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualPickupTime }
     *     
     */
    public void setActualPickupTime(ActualPickupTime value) {
        this.actualPickupTime = value;
    }

    /**
     * Gets the value of the earliestPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link EarliestPickupDate }
     *     
     */
    public EarliestPickupDate getEarliestPickupDate() {
        return earliestPickupDate;
    }

    /**
     * Sets the value of the earliestPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestPickupDate }
     *     
     */
    public void setEarliestPickupDate(EarliestPickupDate value) {
        this.earliestPickupDate = value;
    }

    /**
     * Gets the value of the earliestPickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link EarliestPickupTime }
     *     
     */
    public EarliestPickupTime getEarliestPickupTime() {
        return earliestPickupTime;
    }

    /**
     * Sets the value of the earliestPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarliestPickupTime }
     *     
     */
    public void setEarliestPickupTime(EarliestPickupTime value) {
        this.earliestPickupTime = value;
    }

    /**
     * Gets the value of the latestPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link LatestPickupDate }
     *     
     */
    public LatestPickupDate getLatestPickupDate() {
        return latestPickupDate;
    }

    /**
     * Sets the value of the latestPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestPickupDate }
     *     
     */
    public void setLatestPickupDate(LatestPickupDate value) {
        this.latestPickupDate = value;
    }

    /**
     * Gets the value of the latestPickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link LatestPickupTime }
     *     
     */
    public LatestPickupTime getLatestPickupTime() {
        return latestPickupTime;
    }

    /**
     * Sets the value of the latestPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestPickupTime }
     *     
     */
    public void setLatestPickupTime(LatestPickupTime value) {
        this.latestPickupTime = value;
    }

    /**
     * Gets the value of the pickupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Sets the value of the pickupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPickupLocation(LocationType value) {
        this.pickupLocation = value;
    }

    /**
     * Gets the value of the pickupParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPickupParty() {
        return pickupParty;
    }

    /**
     * Sets the value of the pickupParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPickupParty(PartyType value) {
        this.pickupParty = value;
    }

}
