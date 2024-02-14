
package net.betzel.fury.test.model;

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
 * <p>Java class for TransportScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceNumeric"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReliabilityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Remarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StatusLocation"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedArrivalTransportEvent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportScheduleType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "sequenceNumeric",
    "referenceDate",
    "referenceTime",
    "reliabilityPercent",
    "remarks",
    "statusLocation",
    "actualArrivalTransportEvent",
    "actualDepartureTransportEvent",
    "estimatedDepartureTransportEvent",
    "estimatedArrivalTransportEvent",
    "plannedDepartureTransportEvent",
    "plannedArrivalTransportEvent"
})
@XmlRootElement(name = "TransportSchedule", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TransportSchedule
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "SequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected SequenceNumeric sequenceNumeric;
    @XmlElement(name = "ReferenceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReferenceDate referenceDate;
    @XmlElement(name = "ReferenceTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReferenceTime referenceTime;
    @XmlElement(name = "ReliabilityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReliabilityPercent reliabilityPercent;
    @XmlElement(name = "Remarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Remarks> remarks;
    @XmlElement(name = "StatusLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected LocationType statusLocation;
    @XmlElement(name = "ActualArrivalTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType actualArrivalTransportEvent;
    @XmlElement(name = "ActualDepartureTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType actualDepartureTransportEvent;
    @XmlElement(name = "EstimatedDepartureTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType estimatedDepartureTransportEvent;
    @XmlElement(name = "EstimatedArrivalTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType estimatedArrivalTransportEvent;
    @XmlElement(name = "PlannedDepartureTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType plannedDepartureTransportEvent;
    @XmlElement(name = "PlannedArrivalTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType plannedArrivalTransportEvent;

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
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDate }
     *     
     */
    public ReferenceDate getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDate }
     *     
     */
    public void setReferenceDate(ReferenceDate value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the referenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTime }
     *     
     */
    public ReferenceTime getReferenceTime() {
        return referenceTime;
    }

    /**
     * Sets the value of the referenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTime }
     *     
     */
    public void setReferenceTime(ReferenceTime value) {
        this.referenceTime = value;
    }

    /**
     * Gets the value of the reliabilityPercent property.
     * 
     * @return
     *     possible object is
     *     {@link ReliabilityPercent }
     *     
     */
    public ReliabilityPercent getReliabilityPercent() {
        return reliabilityPercent;
    }

    /**
     * Sets the value of the reliabilityPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliabilityPercent }
     *     
     */
    public void setReliabilityPercent(ReliabilityPercent value) {
        this.reliabilityPercent = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remarks }
     * 
     * 
     */
    public List<Remarks> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<Remarks>();
        }
        return this.remarks;
    }

    /**
     * Gets the value of the statusLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getStatusLocation() {
        return statusLocation;
    }

    /**
     * Sets the value of the statusLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setStatusLocation(LocationType value) {
        this.statusLocation = value;
    }

    /**
     * Gets the value of the actualArrivalTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualArrivalTransportEvent() {
        return actualArrivalTransportEvent;
    }

    /**
     * Sets the value of the actualArrivalTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualArrivalTransportEvent(TransportEventType value) {
        this.actualArrivalTransportEvent = value;
    }

    /**
     * Gets the value of the actualDepartureTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualDepartureTransportEvent() {
        return actualDepartureTransportEvent;
    }

    /**
     * Sets the value of the actualDepartureTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualDepartureTransportEvent(TransportEventType value) {
        this.actualDepartureTransportEvent = value;
    }

    /**
     * Gets the value of the estimatedDepartureTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getEstimatedDepartureTransportEvent() {
        return estimatedDepartureTransportEvent;
    }

    /**
     * Sets the value of the estimatedDepartureTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setEstimatedDepartureTransportEvent(TransportEventType value) {
        this.estimatedDepartureTransportEvent = value;
    }

    /**
     * Gets the value of the estimatedArrivalTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getEstimatedArrivalTransportEvent() {
        return estimatedArrivalTransportEvent;
    }

    /**
     * Sets the value of the estimatedArrivalTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setEstimatedArrivalTransportEvent(TransportEventType value) {
        this.estimatedArrivalTransportEvent = value;
    }

    /**
     * Gets the value of the plannedDepartureTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedDepartureTransportEvent() {
        return plannedDepartureTransportEvent;
    }

    /**
     * Sets the value of the plannedDepartureTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedDepartureTransportEvent(TransportEventType value) {
        this.plannedDepartureTransportEvent = value;
    }

    /**
     * Gets the value of the plannedArrivalTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedArrivalTransportEvent() {
        return plannedArrivalTransportEvent;
    }

    /**
     * Sets the value of the plannedArrivalTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedArrivalTransportEvent(TransportEventType value) {
        this.plannedArrivalTransportEvent = value;
    }

}
