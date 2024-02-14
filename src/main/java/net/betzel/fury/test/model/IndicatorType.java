
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDNDRUDT0000012&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indicator. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A list of two mutually exclusive Boolean values that express the only possible states of a property.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indicator&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IndicatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndicatorType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorType", namespace = "urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1", propOrder = {
    "value"
})
@XmlSeeAlso({
    WithdrawOfferIndicator.class,
    UnknownPriceIndicator.class,
    ToOrderIndicator.class,
    ThirdPartyPayerIndicator.class,
    TestIndicator.class,
    TaxEvidenceIndicator.class,
    StatusAvailableIndicator.class,
    SplitConsignmentIndicator.class,
    SpecialSecurityIndicator.class,
    ReturnableMaterialIndicator.class,
    ReturnabilityIndicator.class,
    RefrigerationOnIndicator.class,
    PublishAwardIndicator.class,
    PricingUpdateRequestIndicator.class,
    PrepaidIndicator.class,
    PreCarriageIndicator.class,
    PartialDeliveryIndicator.class,
    OnCarriageIndicator.class,
    MarkCareIndicator.class,
    MarkAttentionIndicator.class,
    LivestockIndicator.class,
    LegalStatusIndicator.class,
    ItemUpdateRequestIndicator.class,
    IndicationIndicator.class,
    HumanFoodIndicator.class,
    HazardousRiskIndicator.class,
    GeneralCargoIndicator.class,
    FulfilmentIndicator.class,
    FreeOfChargeIndicator.class,
    ExpectedAnchorageIndicator.class,
    CustomsImportClassifiedIndicator.class,
    ContainerizedIndicator.class,
    ConsolidatedIndicator.class,
    ConsolidatableIndicator.class,
    CompletionIndicator.class,
    ChargeIndicator.class,
    CatalogueIndicator.class,
    CabotageIndicator.class,
    BulkCargoIndicator.class,
    BasedOnConsensusIndicator.class,
    BackOrderAllowedIndicator.class,
    AnimalFoodIndicator.class,
    AdValoremIndicator.class,
    AcceptedIndicator.class,
    RecurringProcurementIndicator.class,
    OtherConditionsIndicator.class,
    RequiredCurriculaIndicator.class,
    VariantConstraintIndicator.class,
    TerminatedIndicator.class,
    GovernmentAgreementConstraintIndicator.class,
    CandidateReductionConstraintIndicator.class,
    ExpectedIndicator.class,
    PowerIndicator.class,
    RefrigeratedIndicator.class,
    DangerousGoodsApprovedIndicator.class,
    HumanFoodApprovedIndicator.class,
    AnimalFoodApprovedIndicator.class,
    ResponseIndicator.class,
    OptionalLineItemIndicator.class,
    BalanceBroughtForwardIndicator.class,
    TaxIncludedIndicator.class,
    SMESuitableIndicator.class,
    ElectronicPaymentUsageIndicator.class,
    ElectronicOrderUsageIndicator.class,
    ElectronicInvoiceAcceptedIndicator.class,
    ElectronicCatalogueUsageIndicator.class,
    FullyPaidSharesIndicator.class,
    SoleProprietorshipIndicator.class,
    ServiceProviderPartyIndicator.class,
    PublicPartyIndicator.class,
    PrivatePartyIndicator.class,
    InitiatingPartyIndicator.class,
    AtAnchorageIndicator.class,
    BuriedAtSeaIndicator.class,
    EvacuatedIndicator.class,
    StillOnBoardIndicator.class,
    DiedIndicator.class,
    StillIllIndicator.class,
    ReportedToMedicalOfficerIndicator.class,
    ReinspectionRequiredIndicator.class,
    ValidSanitationCertificateOnBoardIndicator.class,
    SanitaryMeasuresAppliedIndicator.class,
    FumigatedCargoTransportIndicator.class,
    SickAnimalOnBoardIndicator.class,
    StowawaysFoundOnBoardIndicator.class,
    MedicalPractitionerConsultedIndicator.class,
    MoreIllThanExpectedIndicator.class,
    InfectiousDiseaseCaseOnBoardIndicator.class,
    SSPSecurityMeasuresAppliedIndicator.class,
    SSPOnBoardIndicator.class,
    ValidISSCIndicator.class,
    FrozenDocumentIndicator.class,
    SundayAvailabilityIndicator.class,
    SaturdayAvailabilityIndicator.class,
    FridayAvailabilityIndicator.class,
    ThursdayAvailabilityIndicator.class,
    WednesdayAvailabilityIndicator.class,
    TuesdayAvailabilityIndicator.class,
    MondayAvailabilityIndicator.class,
    RenewalsIndicator.class,
    OrderableIndicator.class,
    IMOGuidelinesOnBoardIndicator.class,
    ManagementPlanImplementedIndicator.class,
    ManagementPlanOnBoardIndicator.class,
    NoFurtherNegotiationIndicator.class,
    BindingOnBuyerIndicator.class,
    FollowupContractIndicator.class,
    PrizeIndicator.class,
    AuctionConstraintIndicator.class,
    AcceptanceIndicator.class,
    CopyIndicator.class
})
public class IndicatorType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlValue
    protected boolean value;

    /**
     * Gets the value of the value property.
     * 
     */
    public boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(boolean value) {
        this.value = value;
    }

}
