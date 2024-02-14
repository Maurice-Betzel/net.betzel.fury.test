
package net.betzel.fury.test;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDNDRUDT0000019&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string (i.e. a finite set of characters), generally in the form of words of a language.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Text&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;TextType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextType", namespace = "urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1")
@XmlSeeAlso({
    XPath.class,
    WeightingConsiderationDescription.class,
    WeightScoringMethodologyNote.class,
    Weight.class,
    TransportationServiceDescription.class,
    TransportUserRemarks.class,
    TransportServiceProviderRemarks.class,
    TradingRestrictions.class,
    TimingComplaint.class,
    TimezoneOffset.class,
    Text.class,
    TestMethod.class,
    Telephone.class,
    Telefax.class,
    TaxExemptionReason.class,
    TariffDescription.class,
    SummaryDescription.class,
    StatusReason.class,
    Status.class,
    SpecialTransportRequirements.class,
    SpecialServiceInstructions.class,
    SpecialInstructions.class,
    ShippingMarks.class,
    ShipmentStageType2 .class,
    Room.class,
    ReportType.class,
    RejectionNote.class,
    RejectReason.class,
    RegulatoryDomain.class,
    RegistrationNationality.class,
    Region.class,
    ReferencedDocumentInternalAddress.class,
    Reference.class,
    PurposeType.class,
    Purpose.class,
    Priority.class,
    PrintQualifier.class,
    PriceType2 .class,
    PriceChangeReason.class,
    Postbox.class,
    PostalZone.class,
    PlotIdentification.class,
    PlannedWorksDescription.class,
    PlannedOperationsDescription.class,
    PlannedInspectionsDescription.class,
    PaymentOrderReference.class,
    PaymentNote.class,
    PayerReference.class,
    PackingMaterial.class,
    PackagingType.class,
    OutstandingReason.class,
    OtherInstruction.class,
    OrganizationDepartment.class,
    NameSuffix.class,
    ModificationReasonDescription.class,
    MinimumImprovementBid.class,
    MeterConstant.class,
    MessageFormat.class,
    MarkCare.class,
    MarkAttention.class,
    ManifestType.class,
    Location.class,
    ListValue.class,
    LegalReference.class,
    Keyword.class,
    JobTitle.class,
    InhouseMail.class,
    Information.class,
    HaulageInstructions.class,
    HandlingInstructions.class,
    GroupType.class,
    ForwarderServiceInstructions.class,
    Floor.class,
    Expression.class,
    ExportReason.class,
    EmbeddedDocument.class,
    ElectronicMail.class,
    Duty.class,
    DocumentType.class,
    DocumentStatusReasonDescription.class,
    DocumentDescription.class,
    District.class,
    DistributionType.class,
    Department.class,
    DemurrageInstructions.class,
    DeliveryInstructions.class,
    DataSendingCapability.class,
    DamageRemarks.class,
    CustomsClearanceServiceInstructions.class,
    CountrySubentity.class,
    CorrectionType.class,
    ContractType2 .class,
    Content.class,
    Conditions.class,
    CodeValue.class,
    Characteristics.class,
    Channel.class,
    CarrierServiceInstructions.class,
    CargoAndBallastTankConditionDescription.class,
    CandidateStatement.class,
    CancellationNote.class,
    CalculationExpression.class,
    BuyerReference.class,
    BuildingNumber.class,
    BriefDescription.class,
    BackorderReason.class,
    AwardingCriterionDescription.class,
    ApprovalStatus.class,
    AllowanceChargeReason.class,
    Login.class,
    Password.class,
    WeighingDeviceType.class,
    ChangeConditions.class,
    TransportServiceProviderSpecialTerms.class,
    TransportUserSpecialTerms.class,
    SealingPartyType.class,
    Condition2 .class,
    AdditionalConditions.class,
    EstimatedTimingFurtherPublication.class,
    RecurringProcurementDescription.class,
    FundingProgram.class,
    PriceRevisionFormulaDescription.class,
    AcceptedVariantsDescription.class,
    NegotiationDescription.class,
    CertificationLevelDescription.class,
    ExpectedDescription.class,
    PersonalSituation.class,
    Rank.class,
    TierRange.class,
    OfficialUse.class,
    ValidateToolVersion.class,
    ValidateTool.class,
    ValidateProcess.class,
    Response.class,
    InvoicingPartyReference.class,
    Resolution.class,
    ExclusionReason.class,
    MonetaryScope.class,
    FeeDescription.class,
    ProcurementType.class,
    ProcessReason.class,
    ExemptionReason.class,
    CompanyLegalForm.class,
    SubTypeDescription.class,
    MeterReadingComments.class,
    LatestMeterReadingMethod.class,
    PreviousMeterReadingMethod.class,
    MeterReadingType.class,
    ValueQualifier.class,
    CourseOverGroundDirection.class,
    AntennaLocus.class,
    ShipsRequirements.class,
    GivenTreatmentDescription.class,
    NatureOfIllnessDescription.class,
    StowawayDescription.class,
    SickAnimalDescription.class,
    GroupingLots.class,
    Article.class,
    JurisdictionLevel.class,
    Title.class,
    MaximumValue.class,
    MinimumValue.class,
    ReplenishmentOwnerDescription.class,
    AdditionalMattersDescription.class,
    ISSCAbsenceReason.class,
    Extension.class,
    UNPackingGroup.class,
    AdditionalInformation.class,
    PlacardEndorsement.class,
    PlacardNotation.class,
    TransitDescription.class,
    FuelType.class,
    Frequency.class,
    Justification.class,
    HashAlgorithmMethod.class,
    DocumentHash.class,
    Comment.class,
    LimitationDescription.class,
    RoleDescription.class,
    ServiceType.class,
    Instructions.class,
    CriterionDescription.class,
    EffectDescription.class,
    RepresentationType.class,
    PartyType2 .class,
    ActivityType.class,
    OptionsDescription.class,
    TimeAmount.class,
    OneTimeChargeType.class,
    CurrentChargeType.class,
    SubscriberType.class,
    TelecommunicationsServiceCall.class,
    PayPerView.class,
    MovieTitle.class,
    TelecommunicationsServiceCategory.class,
    ServiceNumberCalled.class,
    PhoneNumber.class,
    TelecommunicationsSupplyType.class,
    ConsumptionLevel.class,
    MeterNumber.class,
    HeatingType.class,
    ResidenceType.class,
    ConsumersEnergyLevel.class,
    ConsumptionType.class,
    Remarks.class,
    CertificateType2 .class,
    WarrantyInformation.class,
    OrderableUnit.class,
    ContractSubdivision.class,
    NoControlActionsReason.class,
    OtherControlActions.class,
    PaymentDescription.class,
    PrizeDescription.class,
    LowTendersDescription.class,
    TechnicalCommitteeDescription.class,
    ElectronicDeviceDescription.class,
    ConditionsDescription.class,
    ProcessDescription.class,
    JustificationDescription.class,
    Line.class,
    Value.class,
    Description.class,
    InstructionNote.class,
    PaymentMeansDescription.class,
    LossRisk.class,
    SpecialTerms.class,
    SignatureMethod.class,
    CanonicalizationMethod.class,
    WorkPhase.class,
    AccountingCost.class,
    CustomerReference.class,
    Note.class,
    ExtensionReason.class
})
public class TextType2
    extends TextType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
