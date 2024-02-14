
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
 * <p>Java class for PortCallType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortCallType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlannedOperationsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlannedWorksDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlannedInspectionsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedAnchorageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PositionInPortID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CargoAndBallastTankConditionDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PrimaryPortCallPurpose" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalPortCallPurpose" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedArrivalEvent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortCallType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "plannedOperationsDescriptions",
    "plannedWorksDescriptions",
    "plannedInspectionsDescriptions",
    "expectedAnchorageIndicator",
    "positionInPortID",
    "cargoAndBallastTankConditionDescriptions",
    "shipRequirements",
    "primaryPortCallPurpose",
    "additionalPortCallPurposes",
    "requestedArrivalEvent"
})
public class PortCallType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "PlannedOperationsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PlannedOperationsDescription> plannedOperationsDescriptions;
    @XmlElement(name = "PlannedWorksDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PlannedWorksDescription> plannedWorksDescriptions;
    @XmlElement(name = "PlannedInspectionsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PlannedInspectionsDescription> plannedInspectionsDescriptions;
    @XmlElement(name = "ExpectedAnchorageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedAnchorageIndicator expectedAnchorageIndicator;
    @XmlElement(name = "PositionInPortID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PositionInPortID positionInPortID;
    @XmlElement(name = "CargoAndBallastTankConditionDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<CargoAndBallastTankConditionDescription> cargoAndBallastTankConditionDescriptions;
    @XmlElement(name = "ShipRequirement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipRequirement> shipRequirements;
    @XmlElement(name = "PrimaryPortCallPurpose", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PortCallPurposeType primaryPortCallPurpose;
    @XmlElement(name = "AdditionalPortCallPurpose", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PortCallPurposeType> additionalPortCallPurposes;
    @XmlElement(name = "RequestedArrivalEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected EventType requestedArrivalEvent;

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
     * Gets the value of the plannedOperationsDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedOperationsDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannedOperationsDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlannedOperationsDescription }
     * 
     * 
     */
    public List<PlannedOperationsDescription> getPlannedOperationsDescriptions() {
        if (plannedOperationsDescriptions == null) {
            plannedOperationsDescriptions = new ArrayList<PlannedOperationsDescription>();
        }
        return this.plannedOperationsDescriptions;
    }

    /**
     * Gets the value of the plannedWorksDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedWorksDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannedWorksDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlannedWorksDescription }
     * 
     * 
     */
    public List<PlannedWorksDescription> getPlannedWorksDescriptions() {
        if (plannedWorksDescriptions == null) {
            plannedWorksDescriptions = new ArrayList<PlannedWorksDescription>();
        }
        return this.plannedWorksDescriptions;
    }

    /**
     * Gets the value of the plannedInspectionsDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedInspectionsDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannedInspectionsDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlannedInspectionsDescription }
     * 
     * 
     */
    public List<PlannedInspectionsDescription> getPlannedInspectionsDescriptions() {
        if (plannedInspectionsDescriptions == null) {
            plannedInspectionsDescriptions = new ArrayList<PlannedInspectionsDescription>();
        }
        return this.plannedInspectionsDescriptions;
    }

    /**
     * Gets the value of the expectedAnchorageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedAnchorageIndicator }
     *     
     */
    public ExpectedAnchorageIndicator getExpectedAnchorageIndicator() {
        return expectedAnchorageIndicator;
    }

    /**
     * Sets the value of the expectedAnchorageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedAnchorageIndicator }
     *     
     */
    public void setExpectedAnchorageIndicator(ExpectedAnchorageIndicator value) {
        this.expectedAnchorageIndicator = value;
    }

    /**
     * Gets the value of the positionInPortID property.
     * 
     * @return
     *     possible object is
     *     {@link PositionInPortID }
     *     
     */
    public PositionInPortID getPositionInPortID() {
        return positionInPortID;
    }

    /**
     * Sets the value of the positionInPortID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionInPortID }
     *     
     */
    public void setPositionInPortID(PositionInPortID value) {
        this.positionInPortID = value;
    }

    /**
     * Gets the value of the cargoAndBallastTankConditionDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cargoAndBallastTankConditionDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoAndBallastTankConditionDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CargoAndBallastTankConditionDescription }
     * 
     * 
     */
    public List<CargoAndBallastTankConditionDescription> getCargoAndBallastTankConditionDescriptions() {
        if (cargoAndBallastTankConditionDescriptions == null) {
            cargoAndBallastTankConditionDescriptions = new ArrayList<CargoAndBallastTankConditionDescription>();
        }
        return this.cargoAndBallastTankConditionDescriptions;
    }

    /**
     * Gets the value of the shipRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipRequirement }
     * 
     * 
     */
    public List<ShipRequirement> getShipRequirements() {
        if (shipRequirements == null) {
            shipRequirements = new ArrayList<ShipRequirement>();
        }
        return this.shipRequirements;
    }

    /**
     * Gets the value of the primaryPortCallPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link PortCallPurposeType }
     *     
     */
    public PortCallPurposeType getPrimaryPortCallPurpose() {
        return primaryPortCallPurpose;
    }

    /**
     * Sets the value of the primaryPortCallPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortCallPurposeType }
     *     
     */
    public void setPrimaryPortCallPurpose(PortCallPurposeType value) {
        this.primaryPortCallPurpose = value;
    }

    /**
     * Gets the value of the additionalPortCallPurposes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalPortCallPurposes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalPortCallPurposes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortCallPurposeType }
     * 
     * 
     */
    public List<PortCallPurposeType> getAdditionalPortCallPurposes() {
        if (additionalPortCallPurposes == null) {
            additionalPortCallPurposes = new ArrayList<PortCallPurposeType>();
        }
        return this.additionalPortCallPurposes;
    }

    /**
     * Gets the value of the requestedArrivalEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getRequestedArrivalEvent() {
        return requestedArrivalEvent;
    }

    /**
     * Sets the value of the requestedArrivalEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setRequestedArrivalEvent(EventType value) {
        this.requestedArrivalEvent = value;
    }

}
