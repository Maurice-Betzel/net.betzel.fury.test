
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
 * <p>Java class for ConsignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsigneeAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsignorAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreightForwarderAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BrokerAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractedCarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformingCarrierAssignedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SummaryDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalInvoiceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredCustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TariffCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsurancePremiumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetNetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeableWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingLengthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Remarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnimalFoodIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HumanFoodIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LivestockIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BulkCargoIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContainerizedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GeneralCargoIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialSecurityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThirdPartyPayerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CarrierServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CustomsClearanceServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForwarderServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialServiceInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShippingPriorityLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalGoodsItemQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTransportHandlingUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsuranceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredForCarriageValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredStatisticsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreeOnBoardValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SplitConsignmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveryInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsignmentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsolidatableIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HaulageInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LoadingSequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChildConsignmentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalPackagesQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsolidatedShipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CustomsDeclaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedDeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualPickupTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualDeliveryTransportEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ChildConsignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsigneeParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExporterParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsignorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ImporterParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightForwarderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDespatchParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDeliveryParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PerformingCarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubstituteCarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LogisticsOperatorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportAdvisorParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousItemNotificationParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InsuranceParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MortgageHolderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillOfLadingHolderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDepartureCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDestinationCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransitCountry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportContract" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginalDespatchTransportationService" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinalDeliveryTransportationService" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CollectPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DisbursementPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PrepaidPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExtraAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PreCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OnCarriageShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FirstArrivalPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LastExitPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OfficeOfEntryLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OfficeOfSubSequentiallyEntryLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OfficeOfExitLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OfficeOfDepartureLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OfficeOfDestinationLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OfficeOfImportLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OfficeOfExportLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalEmission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "carrierAssignedID",
    "consigneeAssignedID",
    "consignorAssignedID",
    "freightForwarderAssignedID",
    "brokerAssignedID",
    "contractedCarrierAssignedID",
    "performingCarrierAssignedID",
    "summaryDescriptions",
    "totalInvoiceAmount",
    "declaredCustomsValueAmount",
    "tariffDescriptions",
    "tariffCode",
    "insurancePremiumAmount",
    "grossWeightMeasure",
    "netWeightMeasure",
    "netNetWeightMeasure",
    "chargeableWeightMeasure",
    "grossVolumeMeasure",
    "netVolumeMeasure",
    "loadingLengthMeasure",
    "remarks",
    "hazardousRiskIndicator",
    "animalFoodIndicator",
    "humanFoodIndicator",
    "livestockIndicator",
    "bulkCargoIndicator",
    "containerizedIndicator",
    "generalCargoIndicator",
    "specialSecurityIndicator",
    "thirdPartyPayerIndicator",
    "carrierServiceInstructions",
    "customsClearanceServiceInstructions",
    "forwarderServiceInstructions",
    "specialServiceInstructions",
    "sequenceID",
    "shippingPriorityLevelCode",
    "handlingCode",
    "handlingInstructions",
    "informations",
    "totalGoodsItemQuantity",
    "totalTransportHandlingUnitQuantity",
    "insuranceValueAmount",
    "declaredForCarriageValueAmount",
    "declaredStatisticsValueAmount",
    "freeOnBoardValueAmount",
    "specialInstructions",
    "splitConsignmentIndicator",
    "deliveryInstructions",
    "consignmentQuantity",
    "consolidatableIndicator",
    "haulageInstructions",
    "loadingSequenceID",
    "childConsignmentQuantity",
    "totalPackagesQuantity",
    "consolidatedShipments",
    "customsDeclarations",
    "requestedPickupTransportEvent",
    "requestedDeliveryTransportEvent",
    "plannedPickupTransportEvent",
    "plannedDeliveryTransportEvent",
    "actualPickupTransportEvent",
    "actualDeliveryTransportEvent",
    "statuses",
    "childConsignments",
    "consigneeParty",
    "exporterParty",
    "consignorParty",
    "importerParty",
    "carrierParty",
    "freightForwarderParty",
    "notifyParty",
    "originalDespatchParty",
    "finalDeliveryParty",
    "performingCarrierParty",
    "substituteCarrierParty",
    "logisticsOperatorParty",
    "transportAdvisorParty",
    "hazardousItemNotificationParty",
    "insuranceParty",
    "mortgageHolderParty",
    "billOfLadingHolderParty",
    "originalDepartureCountry",
    "finalDestinationCountry",
    "transitCountries",
    "transportContract",
    "transportEvents",
    "originalDespatchTransportationService",
    "finalDeliveryTransportationService",
    "deliveryTerms",
    "paymentTerms",
    "collectPaymentTerms",
    "disbursementPaymentTerms",
    "prepaidPaymentTerms",
    "freightAllowanceCharges",
    "extraAllowanceCharges",
    "mainCarriageShipmentStages",
    "preCarriageShipmentStages",
    "onCarriageShipmentStages",
    "transportHandlingUnits",
    "firstArrivalPortLocation",
    "lastExitPortLocation",
    "officeOfEntryLocation",
    "officeOfSubSequentiallyEntryLocation",
    "officeOfExitLocation",
    "officeOfDepartureLocation",
    "officeOfDestinationLocation",
    "officeOfImportLocation",
    "officeOfExportLocation",
    "documentReferences",
    "environmentalEmissions"
})
public class ConsignmentType
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
    @XmlElement(name = "CarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CarrierAssignedID carrierAssignedID;
    @XmlElement(name = "ConsigneeAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsigneeAssignedID consigneeAssignedID;
    @XmlElement(name = "ConsignorAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsignorAssignedID consignorAssignedID;
    @XmlElement(name = "FreightForwarderAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FreightForwarderAssignedID freightForwarderAssignedID;
    @XmlElement(name = "BrokerAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BrokerAssignedID brokerAssignedID;
    @XmlElement(name = "ContractedCarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ContractedCarrierAssignedID contractedCarrierAssignedID;
    @XmlElement(name = "PerformingCarrierAssignedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PerformingCarrierAssignedID performingCarrierAssignedID;
    @XmlElement(name = "SummaryDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<SummaryDescription> summaryDescriptions;
    @XmlElement(name = "TotalInvoiceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalInvoiceAmount totalInvoiceAmount;
    @XmlElement(name = "DeclaredCustomsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DeclaredCustomsValueAmount declaredCustomsValueAmount;
    @XmlElement(name = "TariffDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<TariffDescription> tariffDescriptions;
    @XmlElement(name = "TariffCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TariffCode tariffCode;
    @XmlElement(name = "InsurancePremiumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InsurancePremiumAmount insurancePremiumAmount;
    @XmlElement(name = "GrossWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GrossWeightMeasure grossWeightMeasure;
    @XmlElement(name = "NetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetWeightMeasure netWeightMeasure;
    @XmlElement(name = "NetNetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetNetWeightMeasure netNetWeightMeasure;
    @XmlElement(name = "ChargeableWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ChargeableWeightMeasure chargeableWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GrossVolumeMeasure grossVolumeMeasure;
    @XmlElement(name = "NetVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetVolumeMeasure netVolumeMeasure;
    @XmlElement(name = "LoadingLengthMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LoadingLengthMeasure loadingLengthMeasure;
    @XmlElement(name = "Remarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Remarks> remarks;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HazardousRiskIndicator hazardousRiskIndicator;
    @XmlElement(name = "AnimalFoodIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AnimalFoodIndicator animalFoodIndicator;
    @XmlElement(name = "HumanFoodIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HumanFoodIndicator humanFoodIndicator;
    @XmlElement(name = "LivestockIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LivestockIndicator livestockIndicator;
    @XmlElement(name = "BulkCargoIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BulkCargoIndicator bulkCargoIndicator;
    @XmlElement(name = "ContainerizedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ContainerizedIndicator containerizedIndicator;
    @XmlElement(name = "GeneralCargoIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GeneralCargoIndicator generalCargoIndicator;
    @XmlElement(name = "SpecialSecurityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SpecialSecurityIndicator specialSecurityIndicator;
    @XmlElement(name = "ThirdPartyPayerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ThirdPartyPayerIndicator thirdPartyPayerIndicator;
    @XmlElement(name = "CarrierServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<CarrierServiceInstructions> carrierServiceInstructions;
    @XmlElement(name = "CustomsClearanceServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<CustomsClearanceServiceInstructions> customsClearanceServiceInstructions;
    @XmlElement(name = "ForwarderServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ForwarderServiceInstructions> forwarderServiceInstructions;
    @XmlElement(name = "SpecialServiceInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<SpecialServiceInstructions> specialServiceInstructions;
    @XmlElement(name = "SequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SequenceID sequenceID;
    @XmlElement(name = "ShippingPriorityLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ShippingPriorityLevelCode shippingPriorityLevelCode;
    @XmlElement(name = "HandlingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HandlingCode handlingCode;
    @XmlElement(name = "HandlingInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<HandlingInstructions> handlingInstructions;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Information> informations;
    @XmlElement(name = "TotalGoodsItemQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalGoodsItemQuantity totalGoodsItemQuantity;
    @XmlElement(name = "TotalTransportHandlingUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalTransportHandlingUnitQuantity totalTransportHandlingUnitQuantity;
    @XmlElement(name = "InsuranceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InsuranceValueAmount insuranceValueAmount;
    @XmlElement(name = "DeclaredForCarriageValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DeclaredForCarriageValueAmount declaredForCarriageValueAmount;
    @XmlElement(name = "DeclaredStatisticsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DeclaredStatisticsValueAmount declaredStatisticsValueAmount;
    @XmlElement(name = "FreeOnBoardValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FreeOnBoardValueAmount freeOnBoardValueAmount;
    @XmlElement(name = "SpecialInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<SpecialInstructions> specialInstructions;
    @XmlElement(name = "SplitConsignmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SplitConsignmentIndicator splitConsignmentIndicator;
    @XmlElement(name = "DeliveryInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<DeliveryInstructions> deliveryInstructions;
    @XmlElement(name = "ConsignmentQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsignmentQuantity consignmentQuantity;
    @XmlElement(name = "ConsolidatableIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsolidatableIndicator consolidatableIndicator;
    @XmlElement(name = "HaulageInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<HaulageInstructions> haulageInstructions;
    @XmlElement(name = "LoadingSequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LoadingSequenceID loadingSequenceID;
    @XmlElement(name = "ChildConsignmentQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ChildConsignmentQuantity childConsignmentQuantity;
    @XmlElement(name = "TotalPackagesQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalPackagesQuantity totalPackagesQuantity;
    @XmlElement(name = "ConsolidatedShipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentType> consolidatedShipments;
    @XmlElement(name = "CustomsDeclaration", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CustomsDeclarationType> customsDeclarations;
    @XmlElement(name = "RequestedPickupTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType requestedPickupTransportEvent;
    @XmlElement(name = "RequestedDeliveryTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType requestedDeliveryTransportEvent;
    @XmlElement(name = "PlannedPickupTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType plannedPickupTransportEvent;
    @XmlElement(name = "PlannedDeliveryTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType plannedDeliveryTransportEvent;
    @XmlElement(name = "ActualPickupTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType actualPickupTransportEvent;
    @XmlElement(name = "ActualDeliveryTransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEventType actualDeliveryTransportEvent;
    @XmlElement(name = "Status", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<StatusType> statuses;
    @XmlElement(name = "ChildConsignment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ConsignmentType> childConsignments;
    @XmlElement(name = "ConsigneeParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType consigneeParty;
    @XmlElement(name = "ExporterParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType exporterParty;
    @XmlElement(name = "ConsignorParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType consignorParty;
    @XmlElement(name = "ImporterParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType importerParty;
    @XmlElement(name = "CarrierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType carrierParty;
    @XmlElement(name = "FreightForwarderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType freightForwarderParty;
    @XmlElement(name = "NotifyParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType notifyParty;
    @XmlElement(name = "OriginalDespatchParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType originalDespatchParty;
    @XmlElement(name = "FinalDeliveryParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType finalDeliveryParty;
    @XmlElement(name = "PerformingCarrierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType performingCarrierParty;
    @XmlElement(name = "SubstituteCarrierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType substituteCarrierParty;
    @XmlElement(name = "LogisticsOperatorParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType logisticsOperatorParty;
    @XmlElement(name = "TransportAdvisorParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType transportAdvisorParty;
    @XmlElement(name = "HazardousItemNotificationParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType hazardousItemNotificationParty;
    @XmlElement(name = "InsuranceParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType insuranceParty;
    @XmlElement(name = "MortgageHolderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType mortgageHolderParty;
    @XmlElement(name = "BillOfLadingHolderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType billOfLadingHolderParty;
    @XmlElement(name = "OriginalDepartureCountry", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CountryType originalDepartureCountry;
    @XmlElement(name = "FinalDestinationCountry", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CountryType finalDestinationCountry;
    @XmlElement(name = "TransitCountry", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CountryType> transitCountries;
    @XmlElement(name = "TransportContract", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContractType transportContract;
    @XmlElement(name = "TransportEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEventType> transportEvents;
    @XmlElement(name = "OriginalDespatchTransportationService", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportationServiceType originalDespatchTransportationService;
    @XmlElement(name = "FinalDeliveryTransportationService", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportationServiceType finalDeliveryTransportationService;
    @XmlElement(name = "DeliveryTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DeliveryTerms deliveryTerms;
    @XmlElement(name = "PaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentTermsType paymentTerms;
    @XmlElement(name = "CollectPaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentTermsType collectPaymentTerms;
    @XmlElement(name = "DisbursementPaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentTermsType disbursementPaymentTerms;
    @XmlElement(name = "PrepaidPaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentTermsType prepaidPaymentTerms;
    @XmlElement(name = "FreightAllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> freightAllowanceCharges;
    @XmlElement(name = "ExtraAllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> extraAllowanceCharges;
    @XmlElement(name = "MainCarriageShipmentStage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentStageType> mainCarriageShipmentStages;
    @XmlElement(name = "PreCarriageShipmentStage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentStageType> preCarriageShipmentStages;
    @XmlElement(name = "OnCarriageShipmentStage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentStageType> onCarriageShipmentStages;
    @XmlElement(name = "TransportHandlingUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportHandlingUnitType> transportHandlingUnits;
    @XmlElement(name = "FirstArrivalPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType firstArrivalPortLocation;
    @XmlElement(name = "LastExitPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType lastExitPortLocation;
    @XmlElement(name = "OfficeOfEntryLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType officeOfEntryLocation;
    @XmlElement(name = "OfficeOfSubSequentiallyEntryLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType officeOfSubSequentiallyEntryLocation;
    @XmlElement(name = "OfficeOfExitLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType officeOfExitLocation;
    @XmlElement(name = "OfficeOfDepartureLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType officeOfDepartureLocation;
    @XmlElement(name = "OfficeOfDestinationLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType officeOfDestinationLocation;
    @XmlElement(name = "OfficeOfImportLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType officeOfImportLocation;
    @XmlElement(name = "OfficeOfExportLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType officeOfExportLocation;
    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "EnvironmentalEmission", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EnvironmentalEmission> environmentalEmissions;

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
     * Gets the value of the carrierAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAssignedID }
     *     
     */
    public CarrierAssignedID getCarrierAssignedID() {
        return carrierAssignedID;
    }

    /**
     * Sets the value of the carrierAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAssignedID }
     *     
     */
    public void setCarrierAssignedID(CarrierAssignedID value) {
        this.carrierAssignedID = value;
    }

    /**
     * Gets the value of the consigneeAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsigneeAssignedID }
     *     
     */
    public ConsigneeAssignedID getConsigneeAssignedID() {
        return consigneeAssignedID;
    }

    /**
     * Sets the value of the consigneeAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsigneeAssignedID }
     *     
     */
    public void setConsigneeAssignedID(ConsigneeAssignedID value) {
        this.consigneeAssignedID = value;
    }

    /**
     * Gets the value of the consignorAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignorAssignedID }
     *     
     */
    public ConsignorAssignedID getConsignorAssignedID() {
        return consignorAssignedID;
    }

    /**
     * Sets the value of the consignorAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignorAssignedID }
     *     
     */
    public void setConsignorAssignedID(ConsignorAssignedID value) {
        this.consignorAssignedID = value;
    }

    /**
     * Gets the value of the freightForwarderAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link FreightForwarderAssignedID }
     *     
     */
    public FreightForwarderAssignedID getFreightForwarderAssignedID() {
        return freightForwarderAssignedID;
    }

    /**
     * Sets the value of the freightForwarderAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightForwarderAssignedID }
     *     
     */
    public void setFreightForwarderAssignedID(FreightForwarderAssignedID value) {
        this.freightForwarderAssignedID = value;
    }

    /**
     * Gets the value of the brokerAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerAssignedID }
     *     
     */
    public BrokerAssignedID getBrokerAssignedID() {
        return brokerAssignedID;
    }

    /**
     * Sets the value of the brokerAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerAssignedID }
     *     
     */
    public void setBrokerAssignedID(BrokerAssignedID value) {
        this.brokerAssignedID = value;
    }

    /**
     * Gets the value of the contractedCarrierAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link ContractedCarrierAssignedID }
     *     
     */
    public ContractedCarrierAssignedID getContractedCarrierAssignedID() {
        return contractedCarrierAssignedID;
    }

    /**
     * Sets the value of the contractedCarrierAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractedCarrierAssignedID }
     *     
     */
    public void setContractedCarrierAssignedID(ContractedCarrierAssignedID value) {
        this.contractedCarrierAssignedID = value;
    }

    /**
     * Gets the value of the performingCarrierAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link PerformingCarrierAssignedID }
     *     
     */
    public PerformingCarrierAssignedID getPerformingCarrierAssignedID() {
        return performingCarrierAssignedID;
    }

    /**
     * Sets the value of the performingCarrierAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformingCarrierAssignedID }
     *     
     */
    public void setPerformingCarrierAssignedID(PerformingCarrierAssignedID value) {
        this.performingCarrierAssignedID = value;
    }

    /**
     * Gets the value of the summaryDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryDescription }
     * 
     * 
     */
    public List<SummaryDescription> getSummaryDescriptions() {
        if (summaryDescriptions == null) {
            summaryDescriptions = new ArrayList<SummaryDescription>();
        }
        return this.summaryDescriptions;
    }

    /**
     * Gets the value of the totalInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalInvoiceAmount }
     *     
     */
    public TotalInvoiceAmount getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Sets the value of the totalInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalInvoiceAmount }
     *     
     */
    public void setTotalInvoiceAmount(TotalInvoiceAmount value) {
        this.totalInvoiceAmount = value;
    }

    /**
     * Gets the value of the declaredCustomsValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredCustomsValueAmount }
     *     
     */
    public DeclaredCustomsValueAmount getDeclaredCustomsValueAmount() {
        return declaredCustomsValueAmount;
    }

    /**
     * Sets the value of the declaredCustomsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredCustomsValueAmount }
     *     
     */
    public void setDeclaredCustomsValueAmount(DeclaredCustomsValueAmount value) {
        this.declaredCustomsValueAmount = value;
    }

    /**
     * Gets the value of the tariffDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffDescription }
     * 
     * 
     */
    public List<TariffDescription> getTariffDescriptions() {
        if (tariffDescriptions == null) {
            tariffDescriptions = new ArrayList<TariffDescription>();
        }
        return this.tariffDescriptions;
    }

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link TariffCode }
     *     
     */
    public TariffCode getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffCode }
     *     
     */
    public void setTariffCode(TariffCode value) {
        this.tariffCode = value;
    }

    /**
     * Gets the value of the insurancePremiumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InsurancePremiumAmount }
     *     
     */
    public InsurancePremiumAmount getInsurancePremiumAmount() {
        return insurancePremiumAmount;
    }

    /**
     * Sets the value of the insurancePremiumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurancePremiumAmount }
     *     
     */
    public void setInsurancePremiumAmount(InsurancePremiumAmount value) {
        this.insurancePremiumAmount = value;
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
     * Gets the value of the netWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link NetWeightMeasure }
     *     
     */
    public NetWeightMeasure getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Sets the value of the netWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWeightMeasure }
     *     
     */
    public void setNetWeightMeasure(NetWeightMeasure value) {
        this.netWeightMeasure = value;
    }

    /**
     * Gets the value of the netNetWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link NetNetWeightMeasure }
     *     
     */
    public NetNetWeightMeasure getNetNetWeightMeasure() {
        return netNetWeightMeasure;
    }

    /**
     * Sets the value of the netNetWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetNetWeightMeasure }
     *     
     */
    public void setNetNetWeightMeasure(NetNetWeightMeasure value) {
        this.netNetWeightMeasure = value;
    }

    /**
     * Gets the value of the chargeableWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeableWeightMeasure }
     *     
     */
    public ChargeableWeightMeasure getChargeableWeightMeasure() {
        return chargeableWeightMeasure;
    }

    /**
     * Sets the value of the chargeableWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeableWeightMeasure }
     *     
     */
    public void setChargeableWeightMeasure(ChargeableWeightMeasure value) {
        this.chargeableWeightMeasure = value;
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
     * Gets the value of the netVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link NetVolumeMeasure }
     *     
     */
    public NetVolumeMeasure getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Sets the value of the netVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetVolumeMeasure }
     *     
     */
    public void setNetVolumeMeasure(NetVolumeMeasure value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Gets the value of the loadingLengthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LoadingLengthMeasure }
     *     
     */
    public LoadingLengthMeasure getLoadingLengthMeasure() {
        return loadingLengthMeasure;
    }

    /**
     * Sets the value of the loadingLengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingLengthMeasure }
     *     
     */
    public void setLoadingLengthMeasure(LoadingLengthMeasure value) {
        this.loadingLengthMeasure = value;
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
     * Gets the value of the animalFoodIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalFoodIndicator }
     *     
     */
    public AnimalFoodIndicator getAnimalFoodIndicator() {
        return animalFoodIndicator;
    }

    /**
     * Sets the value of the animalFoodIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalFoodIndicator }
     *     
     */
    public void setAnimalFoodIndicator(AnimalFoodIndicator value) {
        this.animalFoodIndicator = value;
    }

    /**
     * Gets the value of the humanFoodIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link HumanFoodIndicator }
     *     
     */
    public HumanFoodIndicator getHumanFoodIndicator() {
        return humanFoodIndicator;
    }

    /**
     * Sets the value of the humanFoodIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanFoodIndicator }
     *     
     */
    public void setHumanFoodIndicator(HumanFoodIndicator value) {
        this.humanFoodIndicator = value;
    }

    /**
     * Gets the value of the livestockIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link LivestockIndicator }
     *     
     */
    public LivestockIndicator getLivestockIndicator() {
        return livestockIndicator;
    }

    /**
     * Sets the value of the livestockIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LivestockIndicator }
     *     
     */
    public void setLivestockIndicator(LivestockIndicator value) {
        this.livestockIndicator = value;
    }

    /**
     * Gets the value of the bulkCargoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BulkCargoIndicator }
     *     
     */
    public BulkCargoIndicator getBulkCargoIndicator() {
        return bulkCargoIndicator;
    }

    /**
     * Sets the value of the bulkCargoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkCargoIndicator }
     *     
     */
    public void setBulkCargoIndicator(BulkCargoIndicator value) {
        this.bulkCargoIndicator = value;
    }

    /**
     * Gets the value of the containerizedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerizedIndicator }
     *     
     */
    public ContainerizedIndicator getContainerizedIndicator() {
        return containerizedIndicator;
    }

    /**
     * Sets the value of the containerizedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerizedIndicator }
     *     
     */
    public void setContainerizedIndicator(ContainerizedIndicator value) {
        this.containerizedIndicator = value;
    }

    /**
     * Gets the value of the generalCargoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCargoIndicator }
     *     
     */
    public GeneralCargoIndicator getGeneralCargoIndicator() {
        return generalCargoIndicator;
    }

    /**
     * Sets the value of the generalCargoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCargoIndicator }
     *     
     */
    public void setGeneralCargoIndicator(GeneralCargoIndicator value) {
        this.generalCargoIndicator = value;
    }

    /**
     * Gets the value of the specialSecurityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialSecurityIndicator }
     *     
     */
    public SpecialSecurityIndicator getSpecialSecurityIndicator() {
        return specialSecurityIndicator;
    }

    /**
     * Sets the value of the specialSecurityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialSecurityIndicator }
     *     
     */
    public void setSpecialSecurityIndicator(SpecialSecurityIndicator value) {
        this.specialSecurityIndicator = value;
    }

    /**
     * Gets the value of the thirdPartyPayerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyPayerIndicator }
     *     
     */
    public ThirdPartyPayerIndicator getThirdPartyPayerIndicator() {
        return thirdPartyPayerIndicator;
    }

    /**
     * Sets the value of the thirdPartyPayerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyPayerIndicator }
     *     
     */
    public void setThirdPartyPayerIndicator(ThirdPartyPayerIndicator value) {
        this.thirdPartyPayerIndicator = value;
    }

    /**
     * Gets the value of the carrierServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierServiceInstructions }
     * 
     * 
     */
    public List<CarrierServiceInstructions> getCarrierServiceInstructions() {
        if (carrierServiceInstructions == null) {
            carrierServiceInstructions = new ArrayList<CarrierServiceInstructions>();
        }
        return this.carrierServiceInstructions;
    }

    /**
     * Gets the value of the customsClearanceServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsClearanceServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsClearanceServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsClearanceServiceInstructions }
     * 
     * 
     */
    public List<CustomsClearanceServiceInstructions> getCustomsClearanceServiceInstructions() {
        if (customsClearanceServiceInstructions == null) {
            customsClearanceServiceInstructions = new ArrayList<CustomsClearanceServiceInstructions>();
        }
        return this.customsClearanceServiceInstructions;
    }

    /**
     * Gets the value of the forwarderServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwarderServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwarderServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForwarderServiceInstructions }
     * 
     * 
     */
    public List<ForwarderServiceInstructions> getForwarderServiceInstructions() {
        if (forwarderServiceInstructions == null) {
            forwarderServiceInstructions = new ArrayList<ForwarderServiceInstructions>();
        }
        return this.forwarderServiceInstructions;
    }

    /**
     * Gets the value of the specialServiceInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialServiceInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialServiceInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceInstructions }
     * 
     * 
     */
    public List<SpecialServiceInstructions> getSpecialServiceInstructions() {
        if (specialServiceInstructions == null) {
            specialServiceInstructions = new ArrayList<SpecialServiceInstructions>();
        }
        return this.specialServiceInstructions;
    }

    /**
     * Gets the value of the sequenceID property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceID }
     *     
     */
    public SequenceID getSequenceID() {
        return sequenceID;
    }

    /**
     * Sets the value of the sequenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceID }
     *     
     */
    public void setSequenceID(SequenceID value) {
        this.sequenceID = value;
    }

    /**
     * Gets the value of the shippingPriorityLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPriorityLevelCode }
     *     
     */
    public ShippingPriorityLevelCode getShippingPriorityLevelCode() {
        return shippingPriorityLevelCode;
    }

    /**
     * Sets the value of the shippingPriorityLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPriorityLevelCode }
     *     
     */
    public void setShippingPriorityLevelCode(ShippingPriorityLevelCode value) {
        this.shippingPriorityLevelCode = value;
    }

    /**
     * Gets the value of the handlingCode property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingCode }
     *     
     */
    public HandlingCode getHandlingCode() {
        return handlingCode;
    }

    /**
     * Sets the value of the handlingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingCode }
     *     
     */
    public void setHandlingCode(HandlingCode value) {
        this.handlingCode = value;
    }

    /**
     * Gets the value of the handlingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingInstructions }
     * 
     * 
     */
    public List<HandlingInstructions> getHandlingInstructions() {
        if (handlingInstructions == null) {
            handlingInstructions = new ArrayList<HandlingInstructions>();
        }
        return this.handlingInstructions;
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
     * Gets the value of the totalGoodsItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalGoodsItemQuantity }
     *     
     */
    public TotalGoodsItemQuantity getTotalGoodsItemQuantity() {
        return totalGoodsItemQuantity;
    }

    /**
     * Sets the value of the totalGoodsItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalGoodsItemQuantity }
     *     
     */
    public void setTotalGoodsItemQuantity(TotalGoodsItemQuantity value) {
        this.totalGoodsItemQuantity = value;
    }

    /**
     * Gets the value of the totalTransportHandlingUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransportHandlingUnitQuantity }
     *     
     */
    public TotalTransportHandlingUnitQuantity getTotalTransportHandlingUnitQuantity() {
        return totalTransportHandlingUnitQuantity;
    }

    /**
     * Sets the value of the totalTransportHandlingUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransportHandlingUnitQuantity }
     *     
     */
    public void setTotalTransportHandlingUnitQuantity(TotalTransportHandlingUnitQuantity value) {
        this.totalTransportHandlingUnitQuantity = value;
    }

    /**
     * Gets the value of the insuranceValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceValueAmount }
     *     
     */
    public InsuranceValueAmount getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Sets the value of the insuranceValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceValueAmount }
     *     
     */
    public void setInsuranceValueAmount(InsuranceValueAmount value) {
        this.insuranceValueAmount = value;
    }

    /**
     * Gets the value of the declaredForCarriageValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredForCarriageValueAmount }
     *     
     */
    public DeclaredForCarriageValueAmount getDeclaredForCarriageValueAmount() {
        return declaredForCarriageValueAmount;
    }

    /**
     * Sets the value of the declaredForCarriageValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredForCarriageValueAmount }
     *     
     */
    public void setDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmount value) {
        this.declaredForCarriageValueAmount = value;
    }

    /**
     * Gets the value of the declaredStatisticsValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredStatisticsValueAmount }
     *     
     */
    public DeclaredStatisticsValueAmount getDeclaredStatisticsValueAmount() {
        return declaredStatisticsValueAmount;
    }

    /**
     * Sets the value of the declaredStatisticsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredStatisticsValueAmount }
     *     
     */
    public void setDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmount value) {
        this.declaredStatisticsValueAmount = value;
    }

    /**
     * Gets the value of the freeOnBoardValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoardValueAmount }
     *     
     */
    public FreeOnBoardValueAmount getFreeOnBoardValueAmount() {
        return freeOnBoardValueAmount;
    }

    /**
     * Sets the value of the freeOnBoardValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoardValueAmount }
     *     
     */
    public void setFreeOnBoardValueAmount(FreeOnBoardValueAmount value) {
        this.freeOnBoardValueAmount = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructions }
     * 
     * 
     */
    public List<SpecialInstructions> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructions>();
        }
        return this.specialInstructions;
    }

    /**
     * Gets the value of the splitConsignmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SplitConsignmentIndicator }
     *     
     */
    public SplitConsignmentIndicator getSplitConsignmentIndicator() {
        return splitConsignmentIndicator;
    }

    /**
     * Sets the value of the splitConsignmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitConsignmentIndicator }
     *     
     */
    public void setSplitConsignmentIndicator(SplitConsignmentIndicator value) {
        this.splitConsignmentIndicator = value;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInstructions }
     * 
     * 
     */
    public List<DeliveryInstructions> getDeliveryInstructions() {
        if (deliveryInstructions == null) {
            deliveryInstructions = new ArrayList<DeliveryInstructions>();
        }
        return this.deliveryInstructions;
    }

    /**
     * Gets the value of the consignmentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentQuantity }
     *     
     */
    public ConsignmentQuantity getConsignmentQuantity() {
        return consignmentQuantity;
    }

    /**
     * Sets the value of the consignmentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentQuantity }
     *     
     */
    public void setConsignmentQuantity(ConsignmentQuantity value) {
        this.consignmentQuantity = value;
    }

    /**
     * Gets the value of the consolidatableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatableIndicator }
     *     
     */
    public ConsolidatableIndicator getConsolidatableIndicator() {
        return consolidatableIndicator;
    }

    /**
     * Sets the value of the consolidatableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatableIndicator }
     *     
     */
    public void setConsolidatableIndicator(ConsolidatableIndicator value) {
        this.consolidatableIndicator = value;
    }

    /**
     * Gets the value of the haulageInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haulageInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaulageInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HaulageInstructions }
     * 
     * 
     */
    public List<HaulageInstructions> getHaulageInstructions() {
        if (haulageInstructions == null) {
            haulageInstructions = new ArrayList<HaulageInstructions>();
        }
        return this.haulageInstructions;
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
     * Gets the value of the childConsignmentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ChildConsignmentQuantity }
     *     
     */
    public ChildConsignmentQuantity getChildConsignmentQuantity() {
        return childConsignmentQuantity;
    }

    /**
     * Sets the value of the childConsignmentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildConsignmentQuantity }
     *     
     */
    public void setChildConsignmentQuantity(ChildConsignmentQuantity value) {
        this.childConsignmentQuantity = value;
    }

    /**
     * Gets the value of the totalPackagesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPackagesQuantity }
     *     
     */
    public TotalPackagesQuantity getTotalPackagesQuantity() {
        return totalPackagesQuantity;
    }

    /**
     * Sets the value of the totalPackagesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPackagesQuantity }
     *     
     */
    public void setTotalPackagesQuantity(TotalPackagesQuantity value) {
        this.totalPackagesQuantity = value;
    }

    /**
     * Gets the value of the consolidatedShipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolidatedShipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidatedShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getConsolidatedShipments() {
        if (consolidatedShipments == null) {
            consolidatedShipments = new ArrayList<ShipmentType>();
        }
        return this.consolidatedShipments;
    }

    /**
     * Gets the value of the customsDeclarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsDeclarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsDeclarationType }
     * 
     * 
     */
    public List<CustomsDeclarationType> getCustomsDeclarations() {
        if (customsDeclarations == null) {
            customsDeclarations = new ArrayList<CustomsDeclarationType>();
        }
        return this.customsDeclarations;
    }

    /**
     * Gets the value of the requestedPickupTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedPickupTransportEvent() {
        return requestedPickupTransportEvent;
    }

    /**
     * Sets the value of the requestedPickupTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedPickupTransportEvent(TransportEventType value) {
        this.requestedPickupTransportEvent = value;
    }

    /**
     * Gets the value of the requestedDeliveryTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getRequestedDeliveryTransportEvent() {
        return requestedDeliveryTransportEvent;
    }

    /**
     * Sets the value of the requestedDeliveryTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setRequestedDeliveryTransportEvent(TransportEventType value) {
        this.requestedDeliveryTransportEvent = value;
    }

    /**
     * Gets the value of the plannedPickupTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedPickupTransportEvent() {
        return plannedPickupTransportEvent;
    }

    /**
     * Sets the value of the plannedPickupTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedPickupTransportEvent(TransportEventType value) {
        this.plannedPickupTransportEvent = value;
    }

    /**
     * Gets the value of the plannedDeliveryTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getPlannedDeliveryTransportEvent() {
        return plannedDeliveryTransportEvent;
    }

    /**
     * Sets the value of the plannedDeliveryTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setPlannedDeliveryTransportEvent(TransportEventType value) {
        this.plannedDeliveryTransportEvent = value;
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
     * Gets the value of the actualDeliveryTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getActualDeliveryTransportEvent() {
        return actualDeliveryTransportEvent;
    }

    /**
     * Sets the value of the actualDeliveryTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setActualDeliveryTransportEvent(TransportEventType value) {
        this.actualDeliveryTransportEvent = value;
    }

    /**
     * Gets the value of the statuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatuses() {
        if (statuses == null) {
            statuses = new ArrayList<StatusType>();
        }
        return this.statuses;
    }

    /**
     * Gets the value of the childConsignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childConsignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildConsignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentType }
     * 
     * 
     */
    public List<ConsignmentType> getChildConsignments() {
        if (childConsignments == null) {
            childConsignments = new ArrayList<ConsignmentType>();
        }
        return this.childConsignments;
    }

    /**
     * Gets the value of the consigneeParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getConsigneeParty() {
        return consigneeParty;
    }

    /**
     * Sets the value of the consigneeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setConsigneeParty(PartyType value) {
        this.consigneeParty = value;
    }

    /**
     * Gets the value of the exporterParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getExporterParty() {
        return exporterParty;
    }

    /**
     * Sets the value of the exporterParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setExporterParty(PartyType value) {
        this.exporterParty = value;
    }

    /**
     * Gets the value of the consignorParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getConsignorParty() {
        return consignorParty;
    }

    /**
     * Sets the value of the consignorParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setConsignorParty(PartyType value) {
        this.consignorParty = value;
    }

    /**
     * Gets the value of the importerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getImporterParty() {
        return importerParty;
    }

    /**
     * Sets the value of the importerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setImporterParty(PartyType value) {
        this.importerParty = value;
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
     * Gets the value of the freightForwarderParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFreightForwarderParty() {
        return freightForwarderParty;
    }

    /**
     * Sets the value of the freightForwarderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFreightForwarderParty(PartyType value) {
        this.freightForwarderParty = value;
    }

    /**
     * Gets the value of the notifyParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getNotifyParty() {
        return notifyParty;
    }

    /**
     * Sets the value of the notifyParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setNotifyParty(PartyType value) {
        this.notifyParty = value;
    }

    /**
     * Gets the value of the originalDespatchParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getOriginalDespatchParty() {
        return originalDespatchParty;
    }

    /**
     * Sets the value of the originalDespatchParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setOriginalDespatchParty(PartyType value) {
        this.originalDespatchParty = value;
    }

    /**
     * Gets the value of the finalDeliveryParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFinalDeliveryParty() {
        return finalDeliveryParty;
    }

    /**
     * Sets the value of the finalDeliveryParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFinalDeliveryParty(PartyType value) {
        this.finalDeliveryParty = value;
    }

    /**
     * Gets the value of the performingCarrierParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPerformingCarrierParty() {
        return performingCarrierParty;
    }

    /**
     * Sets the value of the performingCarrierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPerformingCarrierParty(PartyType value) {
        this.performingCarrierParty = value;
    }

    /**
     * Gets the value of the substituteCarrierParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSubstituteCarrierParty() {
        return substituteCarrierParty;
    }

    /**
     * Sets the value of the substituteCarrierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSubstituteCarrierParty(PartyType value) {
        this.substituteCarrierParty = value;
    }

    /**
     * Gets the value of the logisticsOperatorParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getLogisticsOperatorParty() {
        return logisticsOperatorParty;
    }

    /**
     * Sets the value of the logisticsOperatorParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setLogisticsOperatorParty(PartyType value) {
        this.logisticsOperatorParty = value;
    }

    /**
     * Gets the value of the transportAdvisorParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTransportAdvisorParty() {
        return transportAdvisorParty;
    }

    /**
     * Sets the value of the transportAdvisorParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTransportAdvisorParty(PartyType value) {
        this.transportAdvisorParty = value;
    }

    /**
     * Gets the value of the hazardousItemNotificationParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getHazardousItemNotificationParty() {
        return hazardousItemNotificationParty;
    }

    /**
     * Sets the value of the hazardousItemNotificationParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setHazardousItemNotificationParty(PartyType value) {
        this.hazardousItemNotificationParty = value;
    }

    /**
     * Gets the value of the insuranceParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getInsuranceParty() {
        return insuranceParty;
    }

    /**
     * Sets the value of the insuranceParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setInsuranceParty(PartyType value) {
        this.insuranceParty = value;
    }

    /**
     * Gets the value of the mortgageHolderParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getMortgageHolderParty() {
        return mortgageHolderParty;
    }

    /**
     * Sets the value of the mortgageHolderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setMortgageHolderParty(PartyType value) {
        this.mortgageHolderParty = value;
    }

    /**
     * Gets the value of the billOfLadingHolderParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getBillOfLadingHolderParty() {
        return billOfLadingHolderParty;
    }

    /**
     * Sets the value of the billOfLadingHolderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setBillOfLadingHolderParty(PartyType value) {
        this.billOfLadingHolderParty = value;
    }

    /**
     * Gets the value of the originalDepartureCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getOriginalDepartureCountry() {
        return originalDepartureCountry;
    }

    /**
     * Sets the value of the originalDepartureCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setOriginalDepartureCountry(CountryType value) {
        this.originalDepartureCountry = value;
    }

    /**
     * Gets the value of the finalDestinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getFinalDestinationCountry() {
        return finalDestinationCountry;
    }

    /**
     * Sets the value of the finalDestinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setFinalDestinationCountry(CountryType value) {
        this.finalDestinationCountry = value;
    }

    /**
     * Gets the value of the transitCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getTransitCountries() {
        if (transitCountries == null) {
            transitCountries = new ArrayList<CountryType>();
        }
        return this.transitCountries;
    }

    /**
     * Gets the value of the transportContract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getTransportContract() {
        return transportContract;
    }

    /**
     * Sets the value of the transportContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setTransportContract(ContractType value) {
        this.transportContract = value;
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
     * Gets the value of the originalDespatchTransportationService property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceType }
     *     
     */
    public TransportationServiceType getOriginalDespatchTransportationService() {
        return originalDespatchTransportationService;
    }

    /**
     * Sets the value of the originalDespatchTransportationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceType }
     *     
     */
    public void setOriginalDespatchTransportationService(TransportationServiceType value) {
        this.originalDespatchTransportationService = value;
    }

    /**
     * Gets the value of the finalDeliveryTransportationService property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationServiceType }
     *     
     */
    public TransportationServiceType getFinalDeliveryTransportationService() {
        return finalDeliveryTransportationService;
    }

    /**
     * Sets the value of the finalDeliveryTransportationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationServiceType }
     *     
     */
    public void setFinalDeliveryTransportationService(TransportationServiceType value) {
        this.finalDeliveryTransportationService = value;
    }

    /**
     * Gets the value of the deliveryTerms property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTerms }
     *     
     */
    public DeliveryTerms getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Sets the value of the deliveryTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTerms }
     *     
     */
    public void setDeliveryTerms(DeliveryTerms value) {
        this.deliveryTerms = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPaymentTerms(PaymentTermsType value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the collectPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getCollectPaymentTerms() {
        return collectPaymentTerms;
    }

    /**
     * Sets the value of the collectPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setCollectPaymentTerms(PaymentTermsType value) {
        this.collectPaymentTerms = value;
    }

    /**
     * Gets the value of the disbursementPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getDisbursementPaymentTerms() {
        return disbursementPaymentTerms;
    }

    /**
     * Sets the value of the disbursementPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setDisbursementPaymentTerms(PaymentTermsType value) {
        this.disbursementPaymentTerms = value;
    }

    /**
     * Gets the value of the prepaidPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPrepaidPaymentTerms() {
        return prepaidPaymentTerms;
    }

    /**
     * Sets the value of the prepaidPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPrepaidPaymentTerms(PaymentTermsType value) {
        this.prepaidPaymentTerms = value;
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
     * Gets the value of the extraAllowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraAllowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getExtraAllowanceCharges() {
        if (extraAllowanceCharges == null) {
            extraAllowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.extraAllowanceCharges;
    }

    /**
     * Gets the value of the mainCarriageShipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainCarriageShipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainCarriageShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getMainCarriageShipmentStages() {
        if (mainCarriageShipmentStages == null) {
            mainCarriageShipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.mainCarriageShipmentStages;
    }

    /**
     * Gets the value of the preCarriageShipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preCarriageShipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreCarriageShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getPreCarriageShipmentStages() {
        if (preCarriageShipmentStages == null) {
            preCarriageShipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.preCarriageShipmentStages;
    }

    /**
     * Gets the value of the onCarriageShipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onCarriageShipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnCarriageShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getOnCarriageShipmentStages() {
        if (onCarriageShipmentStages == null) {
            onCarriageShipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.onCarriageShipmentStages;
    }

    /**
     * Gets the value of the transportHandlingUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportHandlingUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportHandlingUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportHandlingUnitType }
     * 
     * 
     */
    public List<TransportHandlingUnitType> getTransportHandlingUnits() {
        if (transportHandlingUnits == null) {
            transportHandlingUnits = new ArrayList<TransportHandlingUnitType>();
        }
        return this.transportHandlingUnits;
    }

    /**
     * Gets the value of the firstArrivalPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getFirstArrivalPortLocation() {
        return firstArrivalPortLocation;
    }

    /**
     * Sets the value of the firstArrivalPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setFirstArrivalPortLocation(LocationType value) {
        this.firstArrivalPortLocation = value;
    }

    /**
     * Gets the value of the lastExitPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLastExitPortLocation() {
        return lastExitPortLocation;
    }

    /**
     * Sets the value of the lastExitPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLastExitPortLocation(LocationType value) {
        this.lastExitPortLocation = value;
    }

    /**
     * Gets the value of the officeOfEntryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOfficeOfEntryLocation() {
        return officeOfEntryLocation;
    }

    /**
     * Sets the value of the officeOfEntryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOfficeOfEntryLocation(LocationType value) {
        this.officeOfEntryLocation = value;
    }

    /**
     * Gets the value of the officeOfSubSequentiallyEntryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOfficeOfSubSequentiallyEntryLocation() {
        return officeOfSubSequentiallyEntryLocation;
    }

    /**
     * Sets the value of the officeOfSubSequentiallyEntryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOfficeOfSubSequentiallyEntryLocation(LocationType value) {
        this.officeOfSubSequentiallyEntryLocation = value;
    }

    /**
     * Gets the value of the officeOfExitLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOfficeOfExitLocation() {
        return officeOfExitLocation;
    }

    /**
     * Sets the value of the officeOfExitLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOfficeOfExitLocation(LocationType value) {
        this.officeOfExitLocation = value;
    }

    /**
     * Gets the value of the officeOfDepartureLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOfficeOfDepartureLocation() {
        return officeOfDepartureLocation;
    }

    /**
     * Sets the value of the officeOfDepartureLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOfficeOfDepartureLocation(LocationType value) {
        this.officeOfDepartureLocation = value;
    }

    /**
     * Gets the value of the officeOfDestinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOfficeOfDestinationLocation() {
        return officeOfDestinationLocation;
    }

    /**
     * Sets the value of the officeOfDestinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOfficeOfDestinationLocation(LocationType value) {
        this.officeOfDestinationLocation = value;
    }

    /**
     * Gets the value of the officeOfImportLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOfficeOfImportLocation() {
        return officeOfImportLocation;
    }

    /**
     * Sets the value of the officeOfImportLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOfficeOfImportLocation(LocationType value) {
        this.officeOfImportLocation = value;
    }

    /**
     * Gets the value of the officeOfExportLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOfficeOfExportLocation() {
        return officeOfExportLocation;
    }

    /**
     * Sets the value of the officeOfExportLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOfficeOfExportLocation(LocationType value) {
        this.officeOfExportLocation = value;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReferences;
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

}
