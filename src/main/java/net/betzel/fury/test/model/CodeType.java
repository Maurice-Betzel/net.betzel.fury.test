
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDNDRUDT000007&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string (letters, figures, or symbols) that for brevity and/or language independence may be used to represent or replace a definitive value or text of an attribute, together
 *                     with relevant supplementary information.
 *                 &lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Other supplementary components in the CCT are captured as part of the token and name for the schema module containing the code list and thus, are not declared as attributes.
 *                 &lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;CodeType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", namespace = "urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1")
@XmlSeeAlso({
    WeightingTypeCode.class,
    WeightStatementTypeCode.class,
    WeekDayCodeType.class,
    WebSiteTypeCode.class,
    WaybillTypeCode.class,
    TransportationStatusTypeCode.class,
    TransportServiceCode.class,
    TransportModeCodeType.class,
    TransportMeansTypeCode.class,
    TransportHandlingUnitTypeCode.class,
    TransportExecutionStatusCode.class,
    TransportEventTypeCode.class,
    TransportEquipmentTypeCodeType.class,
    TransitDirectionCode.class,
    TradeServiceCode.class,
    TrackingDeviceCode.class,
    TimingComplaintCode.class,
    TendererRoleCode.class,
    TendererRequirementTypeCode.class,
    TenderTypeCode.class,
    TaxExemptionReasonCode.class,
    TariffCode.class,
    TariffClassCode.class,
    TankTypeCode.class,
    SubcontractingConditionsCode.class,
    StatusReasonCode.class,
    StatusCode.class,
    StatementTypeCode.class,
    SizeTypeCode.class,
    ShortageActionCode.class,
    ShippingPriorityLevelCode.class,
    ShipmentStageTypeCode.class,
    ServiceInformationPreferenceCode.class,
    RevisionStatusCode.class,
    RetailEventStatusCode.class,
    RequiredResponseMessageLevelCode.class,
    ReportTypeCode.class,
    ReminderTypeCode.class,
    RejectReasonCode.class,
    RejectActionCode.class,
    ReferenceEventCode.class,
    ReceiptAdviceTypeCodeType.class,
    QuantityDiscrepancyCode.class,
    QualificationApplicationTypeCode.class,
    PurposeTypeCode.class,
    PurposeCode.class,
    ProviderTypeCode.class,
    PropertyGroupTypeCode.class,
    ProfileStatusCode.class,
    PriceTypeCode.class,
    PreferenceCriterionCode.class,
    ParentDocumentTypeCode.class,
    PackagingTypeCodeType.class,
    PackageLevelCode.class,
    OwnerTypeCode.class,
    OrderResponseCode.class,
    NoticeTypeCode.class,
    NoticeLanguageCode.class,
    NatureOfTransactionCode.class,
    NatureCode.class,
    ModificationReasonCode.class,
    MeterConstantCode.class,
    MeasureCode.class,
    OperatorCodeType.class,
    ManifestTypeCode.class,
    LocationTypeCode.class,
    LanguageCodeType.class,
    ItemTypeCode.class,
    ItemClassificationCode.class,
    InvoiceTypeCode.class,
    InspectionMethodCode.class,
    IndustryClassificationCode.class,
    CountryIdentificationCodeType.class,
    HandlingCode.class,
    GuaranteeTypeCode.class,
    GroupTypeCode.class,
    GenderCode.class,
    FunctionCode.class,
    FulfilmentIndicatorTypeCode.class,
    FreightRateClassCode.class,
    FeeTypeCode.class,
    ExpressionCode.class,
    ExportTypeCode.class,
    ExportReasonCode.class,
    ExchangeMethodCode.class,
    EvidenceTypeCode.class,
    EvaluationMethodTypeCode.class,
    EvaluationCriterionTypeCode.class,
    EnvelopeTypeCode.class,
    DutyCode.class,
    DocumentTypeCode.class,
    DocumentStatusReasonCode.class,
    DocumentStatusCodeType.class,
    DistributionTypeCode.class,
    DispositionCode.class,
    DirectionCode.class,
    DespatchAdviceTypeCode.class,
    DeliveryAcceptanceCode.class,
    CustomsStatusCode.class,
    CustomsProcedureCode.class,
    CriterionTypeCode.class,
    CreditNoteTypeCode.class,
    CountrySubentityCode.class,
    CorrectionTypeCode.class,
    ContractTypeCode.class,
    ConstitutionCode.class,
    ConditionCode.class,
    CommodityCode.class,
    ChannelCodeType.class,
    CertificateTypeCode.class,
    CargoTypeCode.class,
    CapabilityTypeCode.class,
    CalculationExpressionCode.class,
    AwardingCriterionTypeCode.class,
    AllowanceChargeReasonCodeType.class,
    AgreementTypeCode.class,
    AddressTypeCode.class,
    AddressFormatCode.class,
    AccountTypeCode.class,
    AccountFormatCode.class,
    WeighingMethodCodeType.class,
    SealStatusCode.class,
    SealIssuerTypeCode.class,
    MultipleTendersCode.class,
    RequiredCurriculaCode.class,
    PaymentFrequencyCode.class,
    FundingProgramCode.class,
    VariantConstraintCode.class,
    PriceEvaluationCode.class,
    AwardingMethodTypeCode.class,
    SubmissionMethodCode.class,
    ContractingSystemCode.class,
    PartPresentationCode.class,
    ExpenseCode.class,
    UrgencyCode.class,
    ProcedureCode.class,
    ConfidentialityLevelCode.class,
    CopyQualityTypeCode.class,
    TranslationTypeCode.class,
    ExpectedCode.class,
    UnitOfMeasureCodeType.class,
    ValueDataTypeCode.class,
    TenderResultCode.class,
    TenderEnvelopeTypeCode.class,
    SpecificationTypeCode.class,
    SocialMediaTypeCode.class,
    ValidationResultCode.class,
    ResponseCode.class,
    SecurityClassificationCode.class,
    PaymentPurposeCode.class,
    AdmissionCode.class,
    PromotionalEventTypeCode.class,
    QualityControlCode.class,
    ProcurementSubTypeCode.class,
    ProcurementTypeCode.class,
    ProcessReasonCode.class,
    PreviousCancellationReasonCode.class,
    DescriptionCode.class,
    PositionCode.class,
    ExemptionReasonCode.class,
    TaxLevelCode.class,
    CompanyLiquidationStatusCode.class,
    CompanyLegalFormCode.class,
    Code.class,
    NotificationTypeCode.class,
    SubTypeCode.class,
    MiscellaneousEventTypeCode.class,
    LatestMeterReadingMethodCode.class,
    PreviousMeterReadingMethodCode.class,
    MeterReadingTypeCode.class,
    NameCode.class,
    WasteTypeCode.class,
    NavigationStatusCode.class,
    INFShipClassCode.class,
    ShipConfigurationCode.class,
    SanitaryMeasureTypeCode.class,
    LongitudeDirectionCodeType.class,
    LatitudeDirectionCodeType.class,
    CoordinateSystemCode.class,
    ImportanceCode.class,
    TimeFrequencyCode.class,
    AvailabilityStatusCode.class,
    SecurityLevelCode.class,
    CurrentOperatingSecurityLevelCode.class,
    HazardousCategoryCode.class,
    MaritimePollutantCode.class,
    TunnelRestrictionCode.class,
    MedicalFirstAidGuideCode.class,
    EmergencyProceduresCode.class,
    UNPackingGroupCode.class,
    UNDGCode.class,
    TransportAuthorizationCode.class,
    InhalationToxicityZoneCode.class,
    HazardousRegulationCode.class,
    PackingCriteriaCode.class,
    TransportEmergencyCardCode.class,
    FuelTypeCode.class,
    AdjustmentReasonCode.class,
    CharacterSetCode.class,
    EncodingCode.class,
    FormatCode.class,
    MimeCode.class,
    ComparisonDataCode.class,
    ResolutionCode.class,
    DataSourceCode.class,
    ComparisonDataSourceCode.class,
    PerformanceMetricTypeCode.class,
    SupplyChainActivityTypeCode.class,
    ExceptionResolutionCode.class,
    CollaborationPriorityCode.class,
    ExceptionStatusCode.class,
    ThresholdValueComparisonCode.class,
    TradeItemPackingLabelingTypeCode.class,
    FeatureTacticTypeCode.class,
    DisplayTacticTypeCode.class,
    ConsumerIncentiveTacticTypeCode.class,
    ForecastTypeCode.class,
    ForecastPurposeCode.class,
    EnvironmentalEmissionTypeCode.class,
    FullnessIndicationCode.class,
    CalculationMethodCode.class,
    ServiceTypeCode.class,
    DeclarationTypeCode.class,
    TypeCode.class,
    CorporateRegistrationTypeCode.class,
    ContractingSystemTypeCode.class,
    RepresentationTypeCode.class,
    PartyTypeCode.class,
    ActivityTypeCode.class,
    ExecutionRequirementCode.class,
    OneTimeChargeTypeCode.class,
    CurrentChargeTypeCode.class,
    SubscriberTypeCode.class,
    TelecommunicationsServiceCallCode.class,
    TelecommunicationsServiceCategoryCode.class,
    PrivacyCode.class,
    TelecommunicationsSupplyTypeCode.class,
    TaxTypeCode.class,
    ConsumptionLevelCode.class,
    HeatingTypeCode.class,
    ResidenceTypeCode.class,
    ConsumersEnergyLevelCode.class,
    ConsumptionTypeCode.class,
    UtilityStatementTypeCode.class,
    ApplicationStatusCode.class,
    PackLevelCode.class,
    LifeCycleStatusCode.class,
    RankCode.class,
    WeightingAlgorithmCode.class,
    LineStatusCodeType.class,
    SubstitutionStatusCodeType.class,
    ActionCode.class,
    FinancingInstrumentCode.class,
    MandateTypeCode.class,
    RoleCode.class,
    ChipCodeType.class,
    CardTypeCode.class,
    ServiceLevelCode.class,
    ChargeBearerCode.class,
    PaymentChannelCode.class,
    PaymentMeansCodeType.class,
    LossRiskResponsibilityCode.class,
    ReasonCode.class,
    WorkPhaseCode.class,
    AccountingCostCode.class,
    CurrencyCodeType.class,
    OrderTypeCode.class,
    ExtensionReasonCode.class
})
public class CodeType
    extends CodeType2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
