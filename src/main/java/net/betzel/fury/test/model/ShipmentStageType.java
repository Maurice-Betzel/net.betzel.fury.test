
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
 * <p>Java class for ShipmentStageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShipmentStageTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShipmentStageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportMeansTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransitDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreCarriageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OnCarriageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CabotageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredDeliveryTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SuccessiveSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Instructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DemurrageInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CrewQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PassengerQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransitPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportMeans" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnloadingPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransshipPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExaminationTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AvailabilityTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExportationTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DischargeTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarehousingTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TakeoverTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OptionalTakeoverTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DropoffTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceiptTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StorageTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AcceptanceTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TerminalOperatorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CustomsAgentParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedTransitPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightChargeLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DetentionTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedWaypointTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedWaypointTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualWaypointTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDepartureTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedArrivalTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PassengerPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DriverPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReportingPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CrewMemberPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SecurityOfficerPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MasterPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipsSurgeonPerson" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DestinationPortCall" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipStoreArticle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CrewPersonEffect" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaritimeWaste" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BallastWaterSummary" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ISPSRequirements" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaritimeHealthDeclaration" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentStageType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "shipmentStageTypeCode",
    "shipmentStageTypes",
    "transportModeCode",
    "transportMeansTypeCode",
    "transitDirectionCode",
    "preCarriageIndicator",
    "onCarriageIndicator",
    "cabotageIndicator",
    "hazardousRiskIndicator",
    "estimatedDeliveryDate",
    "estimatedDeliveryTime",
    "requiredDeliveryDate",
    "requiredDeliveryTime",
    "loadingSequenceID",
    "successiveSequenceID",
    "instructions",
    "demurrageInstructions",
    "crewQuantity",
    "passengerQuantity",
    "transitPeriod",
    "carrierParties",
    "transportMeans",
    "loadingPortLocation",
    "unloadingPortLocation",
    "transshipPortLocation",
    "loadingTransportEvent",
    "examinationTransportEvent",
    "availabilityTransportEvent",
    "exportationTransportEvent",
    "dischargeTransportEvent",
    "warehousingTransportEvent",
    "takeoverTransportEvent",
    "optionalTakeoverTransportEvent",
    "dropoffTransportEvent",
    "actualPickupTransportEvent",
    "deliveryTransportEvent",
    "receiptTransportEvent",
    "storageTransportEvent",
    "acceptanceTransportEvent",
    "terminalOperatorParty",
    "customsAgentParty",
    "estimatedTransitPeriod",
    "freightAllowanceCharges",
    "freightChargeLocation",
    "detentionTransportEvents",
    "requestedDepartureTransportEvent",
    "requestedArrivalTransportEvent",
    "requestedWaypointTransportEvents",
    "plannedDepartureTransportEvent",
    "plannedArrivalTransportEvent",
    "plannedWaypointTransportEvents",
    "actualDepartureTransportEvent",
    "actualWaypointTransportEvent",
    "actualArrivalTransportEvent",
    "transportEvents",
    "estimatedDepartureTransportEvent",
    "estimatedArrivalTransportEvent",
    "passengerPersons",
    "driverPersons",
    "reportingPerson",
    "crewMemberPersons",
    "securityOfficerPerson",
    "masterPerson",
    "shipsSurgeonPerson",
    "destinationPortCall",
    "shipStoreArticles",
    "crewPersonEffects",
    "maritimeWastes",
    "ballastWaterSummary",
    "ispsRequirements",
    "maritimeHealthDeclaration",
    "fuelConsumptions"
})
public class ShipmentStageType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "ShipmentStageTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ShipmentStageTypeCode shipmentStageTypeCode;
    @XmlElement(name = "ShipmentStageType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ShipmentStageType2> shipmentStageTypes;
    @XmlElement(name = "TransportModeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransportModeCode transportModeCode;
    @XmlElement(name = "TransportMeansTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransportMeansTypeCode transportMeansTypeCode;
    @XmlElement(name = "TransitDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransitDirectionCode transitDirectionCode;
    @XmlElement(name = "PreCarriageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PreCarriageIndicator preCarriageIndicator;
    @XmlElement(name = "OnCarriageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OnCarriageIndicator onCarriageIndicator;
    @XmlElement(name = "CabotageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CabotageIndicator cabotageIndicator;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HazardousRiskIndicator hazardousRiskIndicator;
    @XmlElement(name = "EstimatedDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedDeliveryDate estimatedDeliveryDate;
    @XmlElement(name = "EstimatedDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedDeliveryTime estimatedDeliveryTime;
    @XmlElement(name = "RequiredDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequiredDeliveryDate requiredDeliveryDate;
    @XmlElement(name = "RequiredDeliveryTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequiredDeliveryTime requiredDeliveryTime;
    @XmlElement(name = "LoadingSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LoadingSequenceID loadingSequenceID;
    @XmlElement(name = "SuccessiveSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SuccessiveSequenceID successiveSequenceID;
    @XmlElement(name = "Instructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Instructions> instructions;
    @XmlElement(name = "DemurrageInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<DemurrageInstructions> demurrageInstructions;
    @XmlElement(name = "CrewQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CrewQuantity crewQuantity;
    @XmlElement(name = "PassengerQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PassengerQuantity passengerQuantity;
    @XmlElement(name = "TransitPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType transitPeriod;
    @XmlElement(name = "CarrierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyType> carrierParties;
    @XmlElement(name = "TransportMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportMeansType transportMeans;
    @XmlElement(name = "LoadingPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType loadingPortLocation;
    @XmlElement(name = "UnloadingPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType unloadingPortLocation;
    @XmlElement(name = "TransshipPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType transshipPortLocation;
    @XmlElement(name = "LoadingTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType loadingTransportEvent;
    @XmlElement(name = "ExaminationTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType examinationTransportEvent;
    @XmlElement(name = "AvailabilityTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType availabilityTransportEvent;
    @XmlElement(name = "ExportationTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType exportationTransportEvent;
    @XmlElement(name = "DischargeTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType dischargeTransportEvent;
    @XmlElement(name = "WarehousingTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType warehousingTransportEvent;
    @XmlElement(name = "TakeoverTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType takeoverTransportEvent;
    @XmlElement(name = "OptionalTakeoverTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType optionalTakeoverTransportEvent;
    @XmlElement(name = "DropoffTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType dropoffTransportEvent;
    @XmlElement(name = "ActualPickupTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType actualPickupTransportEvent;
    @XmlElement(name = "DeliveryTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType deliveryTransportEvent;
    @XmlElement(name = "ReceiptTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType receiptTransportEvent;
    @XmlElement(name = "StorageTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType storageTransportEvent;
    @XmlElement(name = "AcceptanceTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType acceptanceTransportEvent;
    @XmlElement(name = "TerminalOperatorParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType terminalOperatorParty;
    @XmlElement(name = "CustomsAgentParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType customsAgentParty;
    @XmlElement(name = "EstimatedTransitPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType estimatedTransitPeriod;
    @XmlElement(name = "FreightAllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> freightAllowanceCharges;
    @XmlElement(name = "FreightChargeLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType freightChargeLocation;
    @XmlElement(name = "DetentionTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> detentionTransportEvents;
    @XmlElement(name = "RequestedDepartureTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType requestedDepartureTransportEvent;
    @XmlElement(name = "RequestedArrivalTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType requestedArrivalTransportEvent;
    @XmlElement(name = "RequestedWaypointTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> requestedWaypointTransportEvents;
    @XmlElement(name = "PlannedDepartureTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType plannedDepartureTransportEvent;
    @XmlElement(name = "PlannedArrivalTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType plannedArrivalTransportEvent;
    @XmlElement(name = "PlannedWaypointTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> plannedWaypointTransportEvents;
    @XmlElement(name = "ActualDepartureTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType actualDepartureTransportEvent;
    @XmlElement(name = "ActualWaypointTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType actualWaypointTransportEvent;
    @XmlElement(name = "ActualArrivalTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType actualArrivalTransportEvent;
    @XmlElement(name = "TransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> transportEvents;
    @XmlElement(name = "EstimatedDepartureTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType estimatedDepartureTransportEvent;
    @XmlElement(name = "EstimatedArrivalTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType estimatedArrivalTransportEvent;
    @XmlElement(name = "PassengerPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PersonType> passengerPersons;
    @XmlElement(name = "DriverPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PersonType> driverPersons;
    @XmlElement(name = "ReportingPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PersonType reportingPerson;
    @XmlElement(name = "CrewMemberPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PersonType> crewMemberPersons;
    @XmlElement(name = "SecurityOfficerPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PersonType securityOfficerPerson;
    @XmlElement(name = "MasterPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PersonType masterPerson;
    @XmlElement(name = "ShipsSurgeonPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PersonType shipsSurgeonPerson;
    @XmlElement(name = "DestinationPortCall", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PortCallType destinationPortCall;
    @XmlElement(name = "ShipStoreArticle", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipStoreArticle> shipStoreArticles;
    @XmlElement(name = "CrewPersonEffect", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CrewPersonEffect> crewPersonEffects;
    @XmlElement(name = "MaritimeWaste", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<MaritimeWaste> maritimeWastes;
    @XmlElement(name = "BallastWaterSummary", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected BallastWaterSummary ballastWaterSummary;
    @XmlElement(name = "ISPSRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ISPSRequirements ispsRequirements;
    @XmlElement(name = "MaritimeHealthDeclaration", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected MaritimeHealthDeclaration maritimeHealthDeclaration;
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
     * Gets the value of the shipmentStageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentStageTypeCode }
     *     
     */
    public ShipmentStageTypeCode getShipmentStageTypeCode() {
        return shipmentStageTypeCode;
    }

    /**
     * Sets the value of the shipmentStageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentStageTypeCode }
     *     
     */
    public void setShipmentStageTypeCode(ShipmentStageTypeCode value) {
        this.shipmentStageTypeCode = value;
    }

    /**
     * Gets the value of the shipmentStageTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStageTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStageTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType2 }
     * 
     * 
     */
    public List<ShipmentStageType2> getShipmentStageTypes() {
        if (shipmentStageTypes == null) {
            shipmentStageTypes = new ArrayList<ShipmentStageType2>();
        }
        return this.shipmentStageTypes;
    }

    /**
     * Gets the value of the transportModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportModeCode }
     *     
     */
    public TransportModeCode getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * Sets the value of the transportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportModeCode }
     *     
     */
    public void setTransportModeCode(TransportModeCode value) {
        this.transportModeCode = value;
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
     * Gets the value of the transitDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransitDirectionCode }
     *     
     */
    public TransitDirectionCode getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /**
     * Sets the value of the transitDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDirectionCode }
     *     
     */
    public void setTransitDirectionCode(TransitDirectionCode value) {
        this.transitDirectionCode = value;
    }

    /**
     * Gets the value of the preCarriageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PreCarriageIndicator }
     *     
     */
    public PreCarriageIndicator getPreCarriageIndicator() {
        return preCarriageIndicator;
    }

    /**
     * Sets the value of the preCarriageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreCarriageIndicator }
     *     
     */
    public void setPreCarriageIndicator(PreCarriageIndicator value) {
        this.preCarriageIndicator = value;
    }

    /**
     * Gets the value of the onCarriageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link OnCarriageIndicator }
     *     
     */
    public OnCarriageIndicator getOnCarriageIndicator() {
        return onCarriageIndicator;
    }

    /**
     * Sets the value of the onCarriageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnCarriageIndicator }
     *     
     */
    public void setOnCarriageIndicator(OnCarriageIndicator value) {
        this.onCarriageIndicator = value;
    }

    /**
     * Gets the value of the cabotageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CabotageIndicator }
     *     
     */
    public CabotageIndicator getCabotageIndicator() {
        return cabotageIndicator;
    }

    /**
     * Sets the value of the cabotageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabotageIndicator }
     *     
     */
    public void setCabotageIndicator(CabotageIndicator value) {
        this.cabotageIndicator = value;
    }

    /**
     * Gets the value of the hazardousRiskIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public HazardousRiskIndicator getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Sets the value of the hazardousRiskIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicator value) {
        this.hazardousRiskIndicator = value;
    }

    /**
     * Gets the value of the estimatedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryDate }
     *     
     */
    public EstimatedDeliveryDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Sets the value of the estimatedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryDate }
     *     
     */
    public void setEstimatedDeliveryDate(EstimatedDeliveryDate value) {
        this.estimatedDeliveryDate = value;
    }

    /**
     * Gets the value of the estimatedDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryTime }
     *     
     */
    public EstimatedDeliveryTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    /**
     * Sets the value of the estimatedDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryTime }
     *     
     */
    public void setEstimatedDeliveryTime(EstimatedDeliveryTime value) {
        this.estimatedDeliveryTime = value;
    }

    /**
     * Gets the value of the requiredDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredDeliveryDate }
     *     
     */
    public RequiredDeliveryDate getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    /**
     * Sets the value of the requiredDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredDeliveryDate }
     *     
     */
    public void setRequiredDeliveryDate(RequiredDeliveryDate value) {
        this.requiredDeliveryDate = value;
    }

    /**
     * Gets the value of the requiredDeliveryTime property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredDeliveryTime }
     *     
     */
    public RequiredDeliveryTime getRequiredDeliveryTime() {
        return requiredDeliveryTime;
    }

    /**
     * Sets the value of the requiredDeliveryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredDeliveryTime }
     *     
     */
    public void setRequiredDeliveryTime(RequiredDeliveryTime value) {
        this.requiredDeliveryTime = value;
    }

    /**
     * Gets the value of the loadingSequenceID property.
     * 
     * @return
     *     possible object is
     *     {@link LoadingSequenceID }
     *     
     */
    public LoadingSequenceID getLoadingSequenceID() {
        return loadingSequenceID;
    }

    /**
     * Sets the value of the loadingSequenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingSequenceID }
     *     
     */
    public void setLoadingSequenceID(LoadingSequenceID value) {
        this.loadingSequenceID = value;
    }

    /**
     * Gets the value of the successiveSequenceID property.
     * 
     * @return
     *     possible object is
     *     {@link SuccessiveSequenceID }
     *     
     */
    public SuccessiveSequenceID getSuccessiveSequenceID() {
        return successiveSequenceID;
    }

    /**
     * Sets the value of the successiveSequenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuccessiveSequenceID }
     *     
     */
    public void setSuccessiveSequenceID(SuccessiveSequenceID value) {
        this.successiveSequenceID = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instructions }
     * 
     * 
     */
    public List<Instructions> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<Instructions>();
        }
        return this.instructions;
    }

    /**
     * Gets the value of the demurrageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demurrageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemurrageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DemurrageInstructions }
     * 
     * 
     */
    public List<DemurrageInstructions> getDemurrageInstructions() {
        if (demurrageInstructions == null) {
            demurrageInstructions = new ArrayList<DemurrageInstructions>();
        }
        return this.demurrageInstructions;
    }

    /**
     * Gets the value of the crewQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CrewQuantity }
     *     
     */
    public CrewQuantity getCrewQuantity() {
        return crewQuantity;
    }

    /**
     * Sets the value of the crewQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewQuantity }
     *     
     */
    public void setCrewQuantity(CrewQuantity value) {
        this.crewQuantity = value;
    }

    /**
     * Gets the value of the passengerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerQuantity }
     *     
     */
    public PassengerQuantity getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Sets the value of the passengerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerQuantity }
     *     
     */
    public void setPassengerQuantity(PassengerQuantity value) {
        this.passengerQuantity = value;
    }

    /**
     * Gets the value of the transitPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTransitPeriod() {
        return transitPeriod;
    }

    /**
     * Sets the value of the transitPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTransitPeriod(PeriodType value) {
        this.transitPeriod = value;
    }

    /**
     * Gets the value of the carrierParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getCarrierParties() {
        if (carrierParties == null) {
            carrierParties = new ArrayList<PartyType>();
        }
        return this.carrierParties;
    }

    /**
     * Gets the value of the transportMeans property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansType }
     *     
     */
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /**
     * Sets the value of the transportMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansType }
     *     
     */
    public void setTransportMeans(TransportMeansType value) {
        this.transportMeans = value;
    }

    /**
     * Gets the value of the loadingPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLoadingPortLocation() {
        return loadingPortLocation;
    }

    /**
     * Sets the value of the loadingPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLoadingPortLocation(LocationType value) {
        this.loadingPortLocation = value;
    }

    /**
     * Gets the value of the unloadingPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getUnloadingPortLocation() {
        return unloadingPortLocation;
    }

    /**
     * Sets the value of the unloadingPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setUnloadingPortLocation(LocationType value) {
        this.unloadingPortLocation = value;
    }

    /**
     * Gets the value of the transshipPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getTransshipPortLocation() {
        return transshipPortLocation;
    }

    /**
     * Sets the value of the transshipPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setTransshipPortLocation(LocationType value) {
        this.transshipPortLocation = value;
    }

    /**
     * Gets the value of the loadingTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getLoadingTransportEvent() {
        return loadingTransportEvent;
    }

    /**
     * Sets the value of the loadingTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setLoadingTransportEvent(TransportEventType value) {
        this.loadingTransportEvent = value;
    }

    /**
     * Gets the value of the examinationTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getExaminationTransportEvent() {
        return examinationTransportEvent;
    }

    /**
     * Sets the value of the examinationTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setExaminationTransportEvent(TransportEventType value) {
        this.examinationTransportEvent = value;
    }

    /**
     * Gets the value of the availabilityTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getAvailabilityTransportEvent() {
        return availabilityTransportEvent;
    }

    /**
     * Sets the value of the availabilityTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setAvailabilityTransportEvent(TransportEventType value) {
        this.availabilityTransportEvent = value;
    }

    /**
     * Gets the value of the exportationTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getExportationTransportEvent() {
        return exportationTransportEvent;
    }

    /**
     * Sets the value of the exportationTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setExportationTransportEvent(TransportEventType value) {
        this.exportationTransportEvent = value;
    }

    /**
     * Gets the value of the dischargeTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDischargeTransportEvent() {
        return dischargeTransportEvent;
    }

    /**
     * Sets the value of the dischargeTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDischargeTransportEvent(TransportEventType value) {
        this.dischargeTransportEvent = value;
    }

    /**
     * Gets the value of the warehousingTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getWarehousingTransportEvent() {
        return warehousingTransportEvent;
    }

    /**
     * Sets the value of the warehousingTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setWarehousingTransportEvent(TransportEventType value) {
        this.warehousingTransportEvent = value;
    }

    /**
     * Gets the value of the takeoverTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getTakeoverTransportEvent() {
        return takeoverTransportEvent;
    }

    /**
     * Sets the value of the takeoverTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setTakeoverTransportEvent(TransportEventType value) {
        this.takeoverTransportEvent = value;
    }

    /**
     * Gets the value of the optionalTakeoverTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getOptionalTakeoverTransportEvent() {
        return optionalTakeoverTransportEvent;
    }

    /**
     * Sets the value of the optionalTakeoverTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setOptionalTakeoverTransportEvent(TransportEventType value) {
        this.optionalTakeoverTransportEvent = value;
    }

    /**
     * Gets the value of the dropoffTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDropoffTransportEvent() {
        return dropoffTransportEvent;
    }

    /**
     * Sets the value of the dropoffTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDropoffTransportEvent(TransportEventType value) {
        this.dropoffTransportEvent = value;
    }

    /**
     * Gets the value of the actualPickupTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualPickupTransportEvent() {
        return actualPickupTransportEvent;
    }

    /**
     * Sets the value of the actualPickupTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualPickupTransportEvent(TransportEventType value) {
        this.actualPickupTransportEvent = value;
    }

    /**
     * Gets the value of the deliveryTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getDeliveryTransportEvent() {
        return deliveryTransportEvent;
    }

    /**
     * Sets the value of the deliveryTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setDeliveryTransportEvent(TransportEventType value) {
        this.deliveryTransportEvent = value;
    }

    /**
     * Gets the value of the receiptTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getReceiptTransportEvent() {
        return receiptTransportEvent;
    }

    /**
     * Sets the value of the receiptTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setReceiptTransportEvent(TransportEventType value) {
        this.receiptTransportEvent = value;
    }

    /**
     * Gets the value of the storageTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getStorageTransportEvent() {
        return storageTransportEvent;
    }

    /**
     * Sets the value of the storageTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setStorageTransportEvent(TransportEventType value) {
        this.storageTransportEvent = value;
    }

    /**
     * Gets the value of the acceptanceTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getAcceptanceTransportEvent() {
        return acceptanceTransportEvent;
    }

    /**
     * Sets the value of the acceptanceTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setAcceptanceTransportEvent(TransportEventType value) {
        this.acceptanceTransportEvent = value;
    }

    /**
     * Gets the value of the terminalOperatorParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTerminalOperatorParty() {
        return terminalOperatorParty;
    }

    /**
     * Sets the value of the terminalOperatorParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTerminalOperatorParty(PartyType value) {
        this.terminalOperatorParty = value;
    }

    /**
     * Gets the value of the customsAgentParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCustomsAgentParty() {
        return customsAgentParty;
    }

    /**
     * Sets the value of the customsAgentParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCustomsAgentParty(PartyType value) {
        this.customsAgentParty = value;
    }

    /**
     * Gets the value of the estimatedTransitPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedTransitPeriod() {
        return estimatedTransitPeriod;
    }

    /**
     * Sets the value of the estimatedTransitPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedTransitPeriod(PeriodType value) {
        this.estimatedTransitPeriod = value;
    }

    /**
     * Gets the value of the freightAllowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freightAllowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreightAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getFreightAllowanceCharges() {
        if (freightAllowanceCharges == null) {
            freightAllowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.freightAllowanceCharges;
    }

    /**
     * Gets the value of the freightChargeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getFreightChargeLocation() {
        return freightChargeLocation;
    }

    /**
     * Sets the value of the freightChargeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setFreightChargeLocation(LocationType value) {
        this.freightChargeLocation = value;
    }

    /**
     * Gets the value of the detentionTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detentionTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetentionTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getDetentionTransportEvents() {
        if (detentionTransportEvents == null) {
            detentionTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.detentionTransportEvents;
    }

    /**
     * Gets the value of the requestedDepartureTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedDepartureTransportEvent() {
        return requestedDepartureTransportEvent;
    }

    /**
     * Sets the value of the requestedDepartureTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedDepartureTransportEvent(TransportEventType value) {
        this.requestedDepartureTransportEvent = value;
    }

    /**
     * Gets the value of the requestedArrivalTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedArrivalTransportEvent() {
        return requestedArrivalTransportEvent;
    }

    /**
     * Sets the value of the requestedArrivalTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedArrivalTransportEvent(TransportEventType value) {
        this.requestedArrivalTransportEvent = value;
    }

    /**
     * Gets the value of the requestedWaypointTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedWaypointTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedWaypointTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getRequestedWaypointTransportEvents() {
        if (requestedWaypointTransportEvents == null) {
            requestedWaypointTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.requestedWaypointTransportEvents;
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

    /**
     * Gets the value of the plannedWaypointTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedWaypointTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlannedWaypointTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPlannedWaypointTransportEvents() {
        if (plannedWaypointTransportEvents == null) {
            plannedWaypointTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.plannedWaypointTransportEvents;
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
     * Gets the value of the actualWaypointTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualWaypointTransportEvent() {
        return actualWaypointTransportEvent;
    }

    /**
     * Sets the value of the actualWaypointTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualWaypointTransportEvent(TransportEventType value) {
        this.actualWaypointTransportEvent = value;
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
     * Gets the value of the passengerPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPassengerPersons() {
        if (passengerPersons == null) {
            passengerPersons = new ArrayList<PersonType>();
        }
        return this.passengerPersons;
    }

    /**
     * Gets the value of the driverPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the driverPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getDriverPersons() {
        if (driverPersons == null) {
            driverPersons = new ArrayList<PersonType>();
        }
        return this.driverPersons;
    }

    /**
     * Gets the value of the reportingPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getReportingPerson() {
        return reportingPerson;
    }

    /**
     * Sets the value of the reportingPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setReportingPerson(PersonType value) {
        this.reportingPerson = value;
    }

    /**
     * Gets the value of the crewMemberPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crewMemberPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrewMemberPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getCrewMemberPersons() {
        if (crewMemberPersons == null) {
            crewMemberPersons = new ArrayList<PersonType>();
        }
        return this.crewMemberPersons;
    }

    /**
     * Gets the value of the securityOfficerPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getSecurityOfficerPerson() {
        return securityOfficerPerson;
    }

    /**
     * Sets the value of the securityOfficerPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setSecurityOfficerPerson(PersonType value) {
        this.securityOfficerPerson = value;
    }

    /**
     * Gets the value of the masterPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getMasterPerson() {
        return masterPerson;
    }

    /**
     * Sets the value of the masterPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setMasterPerson(PersonType value) {
        this.masterPerson = value;
    }

    /**
     * Gets the value of the shipsSurgeonPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getShipsSurgeonPerson() {
        return shipsSurgeonPerson;
    }

    /**
     * Sets the value of the shipsSurgeonPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setShipsSurgeonPerson(PersonType value) {
        this.shipsSurgeonPerson = value;
    }

    /**
     * Gets the value of the destinationPortCall property.
     * 
     * @return
     *     possible object is
     *     {@link PortCallType }
     *     
     */
    public PortCallType getDestinationPortCall() {
        return destinationPortCall;
    }

    /**
     * Sets the value of the destinationPortCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortCallType }
     *     
     */
    public void setDestinationPortCall(PortCallType value) {
        this.destinationPortCall = value;
    }

    /**
     * Gets the value of the shipStoreArticles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipStoreArticles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipStoreArticles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipStoreArticle }
     * 
     * 
     */
    public List<ShipStoreArticle> getShipStoreArticles() {
        if (shipStoreArticles == null) {
            shipStoreArticles = new ArrayList<ShipStoreArticle>();
        }
        return this.shipStoreArticles;
    }

    /**
     * Gets the value of the crewPersonEffects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crewPersonEffects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrewPersonEffects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CrewPersonEffect }
     * 
     * 
     */
    public List<CrewPersonEffect> getCrewPersonEffects() {
        if (crewPersonEffects == null) {
            crewPersonEffects = new ArrayList<CrewPersonEffect>();
        }
        return this.crewPersonEffects;
    }

    /**
     * Gets the value of the maritimeWastes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maritimeWastes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaritimeWastes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaritimeWaste }
     * 
     * 
     */
    public List<MaritimeWaste> getMaritimeWastes() {
        if (maritimeWastes == null) {
            maritimeWastes = new ArrayList<MaritimeWaste>();
        }
        return this.maritimeWastes;
    }

    /**
     * Gets the value of the ballastWaterSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BallastWaterSummary }
     *     
     */
    public BallastWaterSummary getBallastWaterSummary() {
        return ballastWaterSummary;
    }

    /**
     * Sets the value of the ballastWaterSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BallastWaterSummary }
     *     
     */
    public void setBallastWaterSummary(BallastWaterSummary value) {
        this.ballastWaterSummary = value;
    }

    /**
     * Gets the value of the ispsRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link ISPSRequirements }
     *     
     */
    public ISPSRequirements getISPSRequirements() {
        return ispsRequirements;
    }

    /**
     * Sets the value of the ispsRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISPSRequirements }
     *     
     */
    public void setISPSRequirements(ISPSRequirements value) {
        this.ispsRequirements = value;
    }

    /**
     * Gets the value of the maritimeHealthDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link MaritimeHealthDeclaration }
     *     
     */
    public MaritimeHealthDeclaration getMaritimeHealthDeclaration() {
        return maritimeHealthDeclaration;
    }

    /**
     * Sets the value of the maritimeHealthDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritimeHealthDeclaration }
     *     
     */
    public void setMaritimeHealthDeclaration(MaritimeHealthDeclaration value) {
        this.maritimeHealthDeclaration = value;
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
