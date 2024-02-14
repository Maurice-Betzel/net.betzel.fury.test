
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
 * <p>Java class for TransportEquipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportEquipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferencedConsignmentID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportEquipmentTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProviderTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OwnerTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SizeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DispositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullnessIndicationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RefrigerationOnIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReturnabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LegalStatusIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AirFlowPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumidityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnimalFoodApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumanFoodApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DangerousGoodsApprovedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RefrigeratedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Characteristics" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DamageRemarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialTransportRequirements" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TareWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TrackingDeviceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PowerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipmentSeal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingProofParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OwnerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OperatingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UnloadingLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StorageLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PositioningTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}QuarantineTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PickupTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HandlingTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LoadingTransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableTransportMeans" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HaulageTradingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousGoodsTransit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PackagedTransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AttachedTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Pickup" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainedInTransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Package" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}VerifiedGrossMass" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportEquipmentType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "referencedConsignmentIDs",
    "transportEquipmentTypeCode",
    "providerTypeCode",
    "ownerTypeCode",
    "sizeTypeCode",
    "dispositionCode",
    "fullnessIndicationCode",
    "refrigerationOnIndicator",
    "informations",
    "returnabilityIndicator",
    "legalStatusIndicator",
    "airFlowPercent",
    "humidityPercent",
    "animalFoodApprovedIndicator",
    "humanFoodApprovedIndicator",
    "dangerousGoodsApprovedIndicator",
    "refrigeratedIndicator",
    "characteristics",
    "damageRemarks",
    "descriptions",
    "specialTransportRequirements",
    "grossWeightMeasure",
    "grossVolumeMeasure",
    "tareWeightMeasure",
    "trackingDeviceCode",
    "powerIndicator",
    "traceID",
    "measurementDimensions",
    "transportEquipmentSeals",
    "minimumTemperature",
    "maximumTemperature",
    "providerParty",
    "loadingProofParty",
    "supplierParty",
    "ownerParty",
    "operatingParty",
    "loadingLocation",
    "unloadingLocation",
    "storageLocation",
    "positioningTransportEvents",
    "quarantineTransportEvents",
    "deliveryTransportEvents",
    "pickupTransportEvents",
    "handlingTransportEvents",
    "loadingTransportEvents",
    "transportEvents",
    "applicableTransportMeans",
    "haulageTradingTerms",
    "hazardousGoodsTransits",
    "packagedTransportHandlingUnits",
    "serviceAllowanceCharges",
    "freightAllowanceCharges",
    "attachedTransportEquipments",
    "delivery",
    "pickup",
    "despatch",
    "shipmentDocumentReferences",
    "containedInTransportEquipments",
    "packages",
    "goodsItems",
    "verifiedGrossMass"
})
public class TransportEquipmentType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "ReferencedConsignmentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ReferencedConsignmentID> referencedConsignmentIDs;
    @XmlElement(name = "TransportEquipmentTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransportEquipmentTypeCode transportEquipmentTypeCode;
    @XmlElement(name = "ProviderTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ProviderTypeCode providerTypeCode;
    @XmlElement(name = "OwnerTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OwnerTypeCode ownerTypeCode;
    @XmlElement(name = "SizeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SizeTypeCode sizeTypeCode;
    @XmlElement(name = "DispositionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DispositionCode dispositionCode;
    @XmlElement(name = "FullnessIndicationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FullnessIndicationCode fullnessIndicationCode;
    @XmlElement(name = "RefrigerationOnIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RefrigerationOnIndicator refrigerationOnIndicator;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Information> informations;
    @XmlElement(name = "ReturnabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReturnabilityIndicator returnabilityIndicator;
    @XmlElement(name = "LegalStatusIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LegalStatusIndicator legalStatusIndicator;
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
    @XmlElement(name = "Characteristics", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Characteristics characteristics;
    @XmlElement(name = "DamageRemarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<DamageRemarks> damageRemarks;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "SpecialTransportRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<SpecialTransportRequirements> specialTransportRequirements;
    @XmlElement(name = "GrossWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GrossWeightMeasure grossWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GrossVolumeMeasure grossVolumeMeasure;
    @XmlElement(name = "TareWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TareWeightMeasure tareWeightMeasure;
    @XmlElement(name = "TrackingDeviceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TrackingDeviceCode trackingDeviceCode;
    @XmlElement(name = "PowerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PowerIndicator powerIndicator;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TraceID traceID;
    @XmlElement(name = "MeasurementDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DimensionType> measurementDimensions;
    @XmlElement(name = "TransportEquipmentSeal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEquipmentSeal> transportEquipmentSeals;
    @XmlElement(name = "MinimumTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "ProviderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType providerParty;
    @XmlElement(name = "LoadingProofParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType loadingProofParty;
    @XmlElement(name = "SupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "OwnerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType ownerParty;
    @XmlElement(name = "OperatingParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType operatingParty;
    @XmlElement(name = "LoadingLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType loadingLocation;
    @XmlElement(name = "UnloadingLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType unloadingLocation;
    @XmlElement(name = "StorageLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType storageLocation;
    @XmlElement(name = "PositioningTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> positioningTransportEvents;
    @XmlElement(name = "QuarantineTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> quarantineTransportEvents;
    @XmlElement(name = "DeliveryTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> deliveryTransportEvents;
    @XmlElement(name = "PickupTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> pickupTransportEvents;
    @XmlElement(name = "HandlingTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> handlingTransportEvents;
    @XmlElement(name = "LoadingTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> loadingTransportEvents;
    @XmlElement(name = "TransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> transportEvents;
    @XmlElement(name = "ApplicableTransportMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportMeansType applicableTransportMeans;
    @XmlElement(name = "HaulageTradingTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TradingTermsType> haulageTradingTerms;
    @XmlElement(name = "HazardousGoodsTransit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<HazardousGoodsTransit> hazardousGoodsTransits;
    @XmlElement(name = "PackagedTransportHandlingUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportHandlingUnitType> packagedTransportHandlingUnits;
    @XmlElement(name = "ServiceAllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> serviceAllowanceCharges;
    @XmlElement(name = "FreightAllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> freightAllowanceCharges;
    @XmlElement(name = "AttachedTransportEquipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEquipmentType> attachedTransportEquipments;
    @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DeliveryType delivery;
    @XmlElement(name = "Pickup", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected Pickup pickup;
    @XmlElement(name = "Despatch", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected Despatch despatch;
    @XmlElement(name = "ShipmentDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> shipmentDocumentReferences;
    @XmlElement(name = "ContainedInTransportEquipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEquipmentType> containedInTransportEquipments;
    @XmlElement(name = "Package", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PackageType> packages;
    @XmlElement(name = "GoodsItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<GoodsItemType> goodsItems;
    @XmlElement(name = "VerifiedGrossMass", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected VerifiedGrossMass verifiedGrossMass;

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
     * Gets the value of the referencedConsignmentIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedConsignmentIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedConsignmentIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedConsignmentID }
     * 
     * 
     */
    public List<ReferencedConsignmentID> getReferencedConsignmentIDs() {
        if (referencedConsignmentIDs == null) {
            referencedConsignmentIDs = new ArrayList<ReferencedConsignmentID>();
        }
        return this.referencedConsignmentIDs;
    }

    /**
     * Gets the value of the transportEquipmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEquipmentTypeCode }
     *     
     */
    public TransportEquipmentTypeCode getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    /**
     * Sets the value of the transportEquipmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEquipmentTypeCode }
     *     
     */
    public void setTransportEquipmentTypeCode(TransportEquipmentTypeCode value) {
        this.transportEquipmentTypeCode = value;
    }

    /**
     * Gets the value of the providerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderTypeCode }
     *     
     */
    public ProviderTypeCode getProviderTypeCode() {
        return providerTypeCode;
    }

    /**
     * Sets the value of the providerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderTypeCode }
     *     
     */
    public void setProviderTypeCode(ProviderTypeCode value) {
        this.providerTypeCode = value;
    }

    /**
     * Gets the value of the ownerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeCode }
     *     
     */
    public OwnerTypeCode getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeCode }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeCode value) {
        this.ownerTypeCode = value;
    }

    /**
     * Gets the value of the sizeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SizeTypeCode }
     *     
     */
    public SizeTypeCode getSizeTypeCode() {
        return sizeTypeCode;
    }

    /**
     * Sets the value of the sizeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeTypeCode }
     *     
     */
    public void setSizeTypeCode(SizeTypeCode value) {
        this.sizeTypeCode = value;
    }

    /**
     * Gets the value of the dispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link DispositionCode }
     *     
     */
    public DispositionCode getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Sets the value of the dispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispositionCode }
     *     
     */
    public void setDispositionCode(DispositionCode value) {
        this.dispositionCode = value;
    }

    /**
     * Gets the value of the fullnessIndicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link FullnessIndicationCode }
     *     
     */
    public FullnessIndicationCode getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    /**
     * Sets the value of the fullnessIndicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullnessIndicationCode }
     *     
     */
    public void setFullnessIndicationCode(FullnessIndicationCode value) {
        this.fullnessIndicationCode = value;
    }

    /**
     * Gets the value of the refrigerationOnIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link RefrigerationOnIndicator }
     *     
     */
    public RefrigerationOnIndicator getRefrigerationOnIndicator() {
        return refrigerationOnIndicator;
    }

    /**
     * Sets the value of the refrigerationOnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefrigerationOnIndicator }
     *     
     */
    public void setRefrigerationOnIndicator(RefrigerationOnIndicator value) {
        this.refrigerationOnIndicator = value;
    }

    /**
     * Gets the value of the informations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Information }
     * 
     * 
     */
    public List<Information> getInformations() {
        if (informations == null) {
            informations = new ArrayList<Information>();
        }
        return this.informations;
    }

    /**
     * Gets the value of the returnabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnabilityIndicator }
     *     
     */
    public ReturnabilityIndicator getReturnabilityIndicator() {
        return returnabilityIndicator;
    }

    /**
     * Sets the value of the returnabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnabilityIndicator }
     *     
     */
    public void setReturnabilityIndicator(ReturnabilityIndicator value) {
        this.returnabilityIndicator = value;
    }

    /**
     * Gets the value of the legalStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link LegalStatusIndicator }
     *     
     */
    public LegalStatusIndicator getLegalStatusIndicator() {
        return legalStatusIndicator;
    }

    /**
     * Sets the value of the legalStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalStatusIndicator }
     *     
     */
    public void setLegalStatusIndicator(LegalStatusIndicator value) {
        this.legalStatusIndicator = value;
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
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link Characteristics }
     *     
     */
    public Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Characteristics }
     *     
     */
    public void setCharacteristics(Characteristics value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the damageRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the damageRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDamageRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DamageRemarks }
     * 
     * 
     */
    public List<DamageRemarks> getDamageRemarks() {
        if (damageRemarks == null) {
            damageRemarks = new ArrayList<DamageRemarks>();
        }
        return this.damageRemarks;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the specialTransportRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialTransportRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialTransportRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialTransportRequirements }
     * 
     * 
     */
    public List<SpecialTransportRequirements> getSpecialTransportRequirements() {
        if (specialTransportRequirements == null) {
            specialTransportRequirements = new ArrayList<SpecialTransportRequirements>();
        }
        return this.specialTransportRequirements;
    }

    /**
     * Gets the value of the grossWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GrossWeightMeasure }
     *     
     */
    public GrossWeightMeasure getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Sets the value of the grossWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossWeightMeasure }
     *     
     */
    public void setGrossWeightMeasure(GrossWeightMeasure value) {
        this.grossWeightMeasure = value;
    }

    /**
     * Gets the value of the grossVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GrossVolumeMeasure }
     *     
     */
    public GrossVolumeMeasure getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Sets the value of the grossVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossVolumeMeasure }
     *     
     */
    public void setGrossVolumeMeasure(GrossVolumeMeasure value) {
        this.grossVolumeMeasure = value;
    }

    /**
     * Gets the value of the tareWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link TareWeightMeasure }
     *     
     */
    public TareWeightMeasure getTareWeightMeasure() {
        return tareWeightMeasure;
    }

    /**
     * Sets the value of the tareWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link TareWeightMeasure }
     *     
     */
    public void setTareWeightMeasure(TareWeightMeasure value) {
        this.tareWeightMeasure = value;
    }

    /**
     * Gets the value of the trackingDeviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingDeviceCode }
     *     
     */
    public TrackingDeviceCode getTrackingDeviceCode() {
        return trackingDeviceCode;
    }

    /**
     * Sets the value of the trackingDeviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingDeviceCode }
     *     
     */
    public void setTrackingDeviceCode(TrackingDeviceCode value) {
        this.trackingDeviceCode = value;
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
     * Gets the value of the traceID property.
     * 
     * @return
     *     possible object is
     *     {@link TraceID }
     *     
     */
    public TraceID getTraceID() {
        return traceID;
    }

    /**
     * Sets the value of the traceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceID }
     *     
     */
    public void setTraceID(TraceID value) {
        this.traceID = value;
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

    /**
     * Gets the value of the transportEquipmentSeals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipmentSeals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipmentSeals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentSeal }
     * 
     * 
     */
    public List<TransportEquipmentSeal> getTransportEquipmentSeals() {
        if (transportEquipmentSeals == null) {
            transportEquipmentSeals = new ArrayList<TransportEquipmentSeal>();
        }
        return this.transportEquipmentSeals;
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
     * Gets the value of the providerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getProviderParty() {
        return providerParty;
    }

    /**
     * Sets the value of the providerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setProviderParty(PartyType value) {
        this.providerParty = value;
    }

    /**
     * Gets the value of the loadingProofParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getLoadingProofParty() {
        return loadingProofParty;
    }

    /**
     * Sets the value of the loadingProofParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setLoadingProofParty(PartyType value) {
        this.loadingProofParty = value;
    }

    /**
     * Gets the value of the supplierParty property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Sets the value of the supplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSupplierParty(SupplierPartyType value) {
        this.supplierParty = value;
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
     * Gets the value of the operatingParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOperatingParty() {
        return operatingParty;
    }

    /**
     * Sets the value of the operatingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOperatingParty(PartyType value) {
        this.operatingParty = value;
    }

    /**
     * Gets the value of the loadingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLoadingLocation() {
        return loadingLocation;
    }

    /**
     * Sets the value of the loadingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLoadingLocation(LocationType value) {
        this.loadingLocation = value;
    }

    /**
     * Gets the value of the unloadingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getUnloadingLocation() {
        return unloadingLocation;
    }

    /**
     * Sets the value of the unloadingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setUnloadingLocation(LocationType value) {
        this.unloadingLocation = value;
    }

    /**
     * Gets the value of the storageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getStorageLocation() {
        return storageLocation;
    }

    /**
     * Sets the value of the storageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setStorageLocation(LocationType value) {
        this.storageLocation = value;
    }

    /**
     * Gets the value of the positioningTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positioningTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositioningTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPositioningTransportEvents() {
        if (positioningTransportEvents == null) {
            positioningTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.positioningTransportEvents;
    }

    /**
     * Gets the value of the quarantineTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quarantineTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuarantineTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getQuarantineTransportEvents() {
        if (quarantineTransportEvents == null) {
            quarantineTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.quarantineTransportEvents;
    }

    /**
     * Gets the value of the deliveryTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getDeliveryTransportEvents() {
        if (deliveryTransportEvents == null) {
            deliveryTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.deliveryTransportEvents;
    }

    /**
     * Gets the value of the pickupTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pickupTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPickupTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getPickupTransportEvents() {
        if (pickupTransportEvents == null) {
            pickupTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.pickupTransportEvents;
    }

    /**
     * Gets the value of the handlingTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getHandlingTransportEvents() {
        if (handlingTransportEvents == null) {
            handlingTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.handlingTransportEvents;
    }

    /**
     * Gets the value of the loadingTransportEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadingTransportEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadingTransportEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEventType }
     * 
     * 
     */
    public List<TransportEventType> getLoadingTransportEvents() {
        if (loadingTransportEvents == null) {
            loadingTransportEvents = new ArrayList<TransportEventType>();
        }
        return this.loadingTransportEvents;
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
     * Gets the value of the applicableTransportMeans property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansType }
     *     
     */
    public TransportMeansType getApplicableTransportMeans() {
        return applicableTransportMeans;
    }

    /**
     * Sets the value of the applicableTransportMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansType }
     *     
     */
    public void setApplicableTransportMeans(TransportMeansType value) {
        this.applicableTransportMeans = value;
    }

    /**
     * Gets the value of the haulageTradingTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haulageTradingTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaulageTradingTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingTermsType }
     * 
     * 
     */
    public List<TradingTermsType> getHaulageTradingTerms() {
        if (haulageTradingTerms == null) {
            haulageTradingTerms = new ArrayList<TradingTermsType>();
        }
        return this.haulageTradingTerms;
    }

    /**
     * Gets the value of the hazardousGoodsTransits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousGoodsTransits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousGoodsTransits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousGoodsTransit }
     * 
     * 
     */
    public List<HazardousGoodsTransit> getHazardousGoodsTransits() {
        if (hazardousGoodsTransits == null) {
            hazardousGoodsTransits = new ArrayList<HazardousGoodsTransit>();
        }
        return this.hazardousGoodsTransits;
    }

    /**
     * Gets the value of the packagedTransportHandlingUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagedTransportHandlingUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagedTransportHandlingUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportHandlingUnitType }
     * 
     * 
     */
    public List<TransportHandlingUnitType> getPackagedTransportHandlingUnits() {
        if (packagedTransportHandlingUnits == null) {
            packagedTransportHandlingUnits = new ArrayList<TransportHandlingUnitType>();
        }
        return this.packagedTransportHandlingUnits;
    }

    /**
     * Gets the value of the serviceAllowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAllowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getServiceAllowanceCharges() {
        if (serviceAllowanceCharges == null) {
            serviceAllowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.serviceAllowanceCharges;
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
     * Gets the value of the attachedTransportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedTransportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getAttachedTransportEquipments() {
        if (attachedTransportEquipments == null) {
            attachedTransportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.attachedTransportEquipments;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDelivery(DeliveryType value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the pickup property.
     * 
     * @return
     *     possible object is
     *     {@link Pickup }
     *     
     */
    public Pickup getPickup() {
        return pickup;
    }

    /**
     * Sets the value of the pickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pickup }
     *     
     */
    public void setPickup(Pickup value) {
        this.pickup = value;
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
     * Gets the value of the shipmentDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getShipmentDocumentReferences() {
        if (shipmentDocumentReferences == null) {
            shipmentDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.shipmentDocumentReferences;
    }

    /**
     * Gets the value of the containedInTransportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedInTransportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedInTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getContainedInTransportEquipments() {
        if (containedInTransportEquipments == null) {
            containedInTransportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.containedInTransportEquipments;
    }

    /**
     * Gets the value of the packages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackages() {
        if (packages == null) {
            packages = new ArrayList<PackageType>();
        }
        return this.packages;
    }

    /**
     * Gets the value of the goodsItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemType }
     * 
     * 
     */
    public List<GoodsItemType> getGoodsItems() {
        if (goodsItems == null) {
            goodsItems = new ArrayList<GoodsItemType>();
        }
        return this.goodsItems;
    }

    /**
     * Gets the value of the verifiedGrossMass property.
     * 
     * @return
     *     possible object is
     *     {@link VerifiedGrossMass }
     *     
     */
    public VerifiedGrossMass getVerifiedGrossMass() {
        return verifiedGrossMass;
    }

    /**
     * Sets the value of the verifiedGrossMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifiedGrossMass }
     *     
     */
    public void setVerifiedGrossMass(VerifiedGrossMass value) {
        this.verifiedGrossMass = value;
    }

}
