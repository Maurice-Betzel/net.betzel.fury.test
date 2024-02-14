
package net.betzel.fury.test.model;

import java.math.BigInteger;
import java.time.OffsetDateTime;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.abeel.platform.facade.oasis.ubl.api.generated.order package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ValidityPeriod");
    private final static QName _QuotationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QuotationDocumentReference");
    private final static QName _OrderDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OrderDocumentReference");
    private final static QName _OriginatorDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginatorDocumentReference");
    private final static QName _CatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueReference");
    private final static QName _AdditionalDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalDocumentReference");
    private final static QName _Contract_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Contract");
    private final static QName _WorkOrderDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WorkOrderDocumentReference");
    private final static QName _SignatoryParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SignatoryParty");
    private final static QName _DigitalSignatureAttachment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DigitalSignatureAttachment");
    private final static QName _OriginalDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalDocumentReference");
    private final static QName _BuyerCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BuyerCustomerParty");
    private final static QName _SellerSupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellerSupplierParty");
    private final static QName _OriginatorCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginatorCustomerParty");
    private final static QName _FreightForwarderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FreightForwarderParty");
    private final static QName _AccountingCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AccountingCustomerParty");
    private final static QName _Delivery_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Delivery");
    private final static QName _DeliveryLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryLocation");
    private final static QName _AllowanceCharge_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AllowanceCharge");
    private final static QName _PayerFinancialAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PayerFinancialAccount");
    private final static QName _PayeeFinancialAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PayeeFinancialAccount");
    private final static QName _PayerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PayerParty");
    private final static QName _PaymentReversalPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PaymentReversalPeriod");
    private final static QName _Clause_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Clause");
    private final static QName _ContractDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractDocumentReference");
    private final static QName _DocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentReference");
    private final static QName _FinancingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancingParty");
    private final static QName _FinancingFinancialAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancingFinancialAccount");
    private final static QName _RemittanceDocumentDistribution_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RemittanceDocumentDistribution");
    private final static QName _PaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PaymentTerms");
    private final static QName _TaxExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxExchangeRate");
    private final static QName _PricingExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PricingExchangeRate");
    private final static QName _PaymentExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PaymentExchangeRate");
    private final static QName _DestinationCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DestinationCountry");
    private final static QName _TaxTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxTotal");
    private final static QName _AnticipatedMonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AnticipatedMonetaryTotal");
    private final static QName _LineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LineItem");
    private final static QName _SellerProposedSubstituteLineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellerProposedSubstituteLineItem");
    private final static QName _SellerSubstitutedLineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellerSubstitutedLineItem");
    private final static QName _BuyerProposedSubstituteLineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BuyerProposedSubstituteLineItem");
    private final static QName _CatalogueLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueLineReference");
    private final static QName _QuotationLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QuotationLineReference");
    private final static QName _AcceptanceTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AcceptanceTransportEvent");
    private final static QName _AccessoryRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AccessoryRelatedItem");
    private final static QName _AccountingContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AccountingContact");
    private final static QName _AccountingSupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AccountingSupplierParty");
    private final static QName _ActivityDataLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActivityDataLine");
    private final static QName _ActivityFinalLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActivityFinalLocation");
    private final static QName _ActivityOriginLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActivityOriginLocation");
    private final static QName _ActivityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActivityPeriod");
    private final static QName _ActualArrivalTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActualArrivalTransportEvent");
    private final static QName _ActualDeliveryTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActualDeliveryTransportEvent");
    private final static QName _ActualDepartureTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActualDepartureTransportEvent");
    private final static QName _ActualPackage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActualPackage");
    private final static QName _ActualPickupTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActualPickupTransportEvent");
    private final static QName _ActualWaypointTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActualWaypointTransportEvent");
    private final static QName _AdditionalCommodityClassification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalCommodityClassification");
    private final static QName _AdditionalDocumentResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalDocumentResponse");
    private final static QName _AdditionalFee_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalFee");
    private final static QName _AdditionalFuelProperty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalFuelProperty");
    private final static QName _AdditionalInformationParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalInformationParty");
    private final static QName _AdditionalInformationRequestPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalInformationRequestPeriod");
    private final static QName _AdditionalItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalItemIdentification");
    private final static QName _AdditionalItemProperty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalItemProperty");
    private final static QName _AdditionalNoticeLanguage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalNoticeLanguage");
    private final static QName _AdditionalPortCallPurpose_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalPortCallPurpose");
    private final static QName _AdditionalQualifyingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalQualifyingParty");
    private final static QName _AdditionalSecurityMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalSecurityMeasure");
    private final static QName _AdditionalTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalTemperature");
    private final static QName _AdditionalTransportationService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalTransportationService");
    private final static QName _AdditionalWebSite_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalWebSite");
    private final static QName _Address_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Address");
    private final static QName _AdoptionPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdoptionPeriod");
    private final static QName _AgentParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AgentParty");
    private final static QName _AgreementCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AgreementCountry");
    private final static QName _AllowedSubcontractTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AllowedSubcontractTerms");
    private final static QName _AlternativeConditionPrice_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AlternativeConditionPrice");
    private final static QName _AlternativeCurrencyPrice_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AlternativeCurrencyPrice");
    private final static QName _AlternativeDeliveryLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AlternativeDeliveryLocation");
    private final static QName _AlternativeLineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AlternativeLineItem");
    private final static QName _AppealInformationParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AppealInformationParty");
    private final static QName _AppealReceiverParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AppealReceiverParty");
    private final static QName _PresentationPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PresentationPeriod");
    private final static QName _MediationParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MediationParty");
    private final static QName _ApplicableAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableAddress");
    private final static QName _ApplicableDeliveryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableDeliveryPeriod");
    private final static QName _ApplicablePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicablePeriod");
    private final static QName _ApplicableRegulation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableRegulation");
    private final static QName _ApplicableTaxCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableTaxCategory");
    private final static QName _ApplicableTerritoryAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableTerritoryAddress");
    private final static QName _ApplicableTransportMeans_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableTransportMeans");
    private final static QName _ApplicantParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicantParty");
    private final static QName _AppliedSecurityMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AppliedSecurityMeasure");
    private final static QName _AtLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AtLocation");
    private final static QName _AttachedTransportEquipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AttachedTransportEquipment");
    private final static QName _Attachment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Attachment");
    private final static QName _IssuerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "IssuerParty");
    private final static QName _AttestationLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AttestationLine");
    private final static QName _AuthorityParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AuthorityParty");
    private final static QName _Authorization_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Authorization");
    private final static QName _AvailabilityTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AvailabilityTransportEvent");
    private final static QName _AwardedTenderedProject_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AwardedTenderedProject");
    private final static QName _AwardingCriterion_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AwardingCriterion");
    private final static QName _AwardingCriterionResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AwardingCriterionResponse");
    private final static QName _TechnicalCommitteePerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TechnicalCommitteePerson");
    private final static QName _UptakeBallastWaterTransaction_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UptakeBallastWaterTransaction");
    private final static QName _ExchangeBallastWaterTransaction_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExchangeBallastWaterTransaction");
    private final static QName _DischargeBallastWaterTransaction_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DischargeBallastWaterTransaction");
    private final static QName _ResponsibleOfficerPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ResponsibleOfficerPerson");
    private final static QName _BallastWaterTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BallastWaterTemperature");
    private final static QName _BallastWaterTransaction_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BallastWaterTransaction");
    private final static QName _BeneficiaryParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BeneficiaryParty");
    private final static QName _BillOfLadingHolderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BillOfLadingHolderParty");
    private final static QName _BillToParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BillToParty");
    private final static QName _InvoiceDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InvoiceDocumentReference");
    private final static QName _SelfBilledInvoiceDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SelfBilledInvoiceDocumentReference");
    private final static QName _CreditNoteDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CreditNoteDocumentReference");
    private final static QName _SelfBilledCreditNoteDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SelfBilledCreditNoteDocumentReference");
    private final static QName _DebitNoteDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DebitNoteDocumentReference");
    private final static QName _ReminderDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReminderDocumentReference");
    private final static QName _BirthplaceLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BirthplaceLocation");
    private final static QName _BondedWarehouseLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BondedWarehouseLocation");
    private final static QName _BonusPaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BonusPaymentTerms");
    private final static QName _Branch_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Branch");
    private final static QName _BrochureDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BrochureDocumentReference");
    private final static QName _RequiredClassificationScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredClassificationScheme");
    private final static QName _BusinessCapability_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BusinessCapability");
    private final static QName _BusinessClassificationScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BusinessClassificationScheme");
    private final static QName _BusinessParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BusinessParty");
    private final static QName _BusinessPartyGroup_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BusinessPartyGroup");
    private final static QName _BuyerContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BuyerContact");
    private final static QName _BuyersItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BuyersItemIdentification");
    private final static QName _CallDuty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CallDuty");
    private final static QName _CallForTenderDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CallForTenderDocumentReference");
    private final static QName _CallForTendersDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CallForTendersDocumentReference");
    private final static QName _CallForTendersLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CallForTendersLineReference");
    private final static QName _Capability_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Capability");
    private final static QName _CarrierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CarrierParty");
    private final static QName _CashierContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CashierContact");
    private final static QName _CatalogueDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueDocumentReference");
    private final static QName _CatalogueItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueItemIdentification");
    private final static QName _ContractorCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractorCustomerParty");
    private final static QName _Item_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Item");
    private final static QName _WarrantyParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WarrantyParty");
    private final static QName _WarrantyValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WarrantyValidityPeriod");
    private final static QName _LineValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LineValidityPeriod");
    private final static QName _ComponentRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ComponentRelatedItem");
    private final static QName _RequiredRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredRelatedItem");
    private final static QName _ReplacementRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReplacementRelatedItem");
    private final static QName _ComplementaryRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ComplementaryRelatedItem");
    private final static QName _ReplacedRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReplacedRelatedItem");
    private final static QName _RequiredItemLocationQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredItemLocationQuantity");
    private final static QName _KeywordItemProperty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "KeywordItemProperty");
    private final static QName _CategorizesClassificationCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CategorizesClassificationCategory");
    private final static QName _Certificate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Certificate");
    private final static QName _Shipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Shipment");
    private final static QName _Party_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Party");
    private final static QName _SignatoryContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SignatoryContact");
    private final static QName _PreparationParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PreparationParty");
    private final static QName _ExporterParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExporterParty");
    private final static QName _ImporterParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ImporterParty");
    private final static QName _IssuingCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "IssuingCountry");
    private final static QName _DocumentDistribution_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentDistribution");
    private final static QName _SupportingDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupportingDocumentReference");
    private final static QName _CertificationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CertificationDocumentReference");
    private final static QName _ChildConsignment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ChildConsignment");
    private final static QName _CitizenshipCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CitizenshipCountry");
    private final static QName _ClassificationCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ClassificationCategory");
    private final static QName _ClassificationScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ClassificationScheme");
    private final static QName _ClassifiedTaxCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ClassifiedTaxCategory");
    private final static QName _CollectPaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CollectPaymentTerms");
    private final static QName _CollectedPayment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CollectedPayment");
    private final static QName _CommercialContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CommercialContact");
    private final static QName _CommissionPaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CommissionPaymentTerms");
    private final static QName _CommodityClassification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CommodityClassification");
    private final static QName _Communication_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Communication");
    private final static QName _Period_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Period");
    private final static QName _RecipientCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RecipientCustomerParty");
    private final static QName _ConsigneeParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ConsigneeParty");
    private final static QName _Consignment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Consignment");
    private final static QName _ConsignorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ConsignorParty");
    private final static QName _ConsolidatedShipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ConsolidatedShipment");
    private final static QName _ConstitutionPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ConstitutionPeriod");
    private final static QName _MainPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MainPeriod");
    private final static QName _GuidanceDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GuidanceDocumentReference");
    private final static QName _JurisdictionRegionAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "JurisdictionRegionAddress");
    private final static QName _EnergyWaterConsumptionCorrection_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EnergyWaterConsumptionCorrection");
    private final static QName _ExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExchangeRate");
    private final static QName _Price_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Price");
    private final static QName _Country_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Country");
    private final static QName _TimeDuty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TimeDuty");
    private final static QName _LegalMonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LegalMonetaryTotal");
    private final static QName _ConsumptionCorrection_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ConsumptionCorrection");
    private final static QName _TaxCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxCategory");
    private final static QName _ConsumptionPoint_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ConsumptionPoint");
    private final static QName _Contact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Contact");
    private final static QName _ContactParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContactParty");
    private final static QName _ContainedGoodsItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContainedGoodsItem");
    private final static QName _ContainedInTransportEquipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContainedInTransportEquipment");
    private final static QName _ContainedPackage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContainedPackage");
    private final static QName _ContainingPackage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContainingPackage");
    private final static QName _ContainingTransportEquipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContainingTransportEquipment");
    private final static QName _ContractAcceptancePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractAcceptancePeriod");
    private final static QName _OptionValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OptionValidityPeriod");
    private final static QName _ContractFormalizationPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractFormalizationPeriod");
    private final static QName _ContractResponsibleParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractResponsibleParty");
    private final static QName _ContractualDelivery_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractualDelivery");
    private final static QName _ContractualDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractualDocumentReference");
    private final static QName _CreditNoteLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CreditNoteLine");
    private final static QName _CrewMemberPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CrewMemberPerson");
    private final static QName _CrewPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CrewPerson");
    private final static QName _DeclaredPropertyItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeclaredPropertyItem");
    private final static QName _CurrentStatus_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CurrentStatus");
    private final static QName _CustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CustomerParty");
    private final static QName _CustomsAgentParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CustomsAgentParty");
    private final static QName _CustomsDeclaration_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CustomsDeclaration");
    private final static QName _CustomsExitOfficeLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CustomsExitOfficeLocation");
    private final static QName _CustomsOfficeLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CustomsOfficeLocation");
    private final static QName _CustomsParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CustomsParty");
    private final static QName _DamageDocumentationAttachment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DamageDocumentationAttachment");
    private final static QName _DebitNoteLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DebitNoteLine");
    private final static QName _DefaultLanguage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DefaultLanguage");
    private final static QName _DeletedCatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeletedCatalogueReference");
    private final static QName _DeliveryAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryAddress");
    private final static QName _DeliveryChannel_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryChannel");
    private final static QName _DeliveryContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryContact");
    private final static QName _DeliveryCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryCustomerParty");
    private final static QName _DeliveryParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryParty");
    private final static QName _DeliveryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryPeriod");
    private final static QName _DeliveryTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryTransportEvent");
    private final static QName _DeliveryUnit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryUnit");
    private final static QName _DependentLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DependentLineReference");
    private final static QName _LocationAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LocationAddress");
    private final static QName _DespatchAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchAddress");
    private final static QName _DespatchLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchLocation");
    private final static QName _DespatchParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchParty");
    private final static QName _NotifyParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "NotifyParty");
    private final static QName _ResponsibleParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ResponsibleParty");
    private final static QName _EstimatedDespatchPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EstimatedDespatchPeriod");
    private final static QName _RequestedDespatchPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedDespatchPeriod");
    private final static QName _DespatchContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchContact");
    private final static QName _DespatchDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchDocumentReference");
    private final static QName _DespatchLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchLine");
    private final static QName _DespatchLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchLineReference");
    private final static QName _DespatchSupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchSupplierParty");
    private final static QName _DestinationPortCall_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DestinationPortCall");
    private final static QName _DetentionTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DetentionTransportEvent");
    private final static QName _ServiceAvailabilityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ServiceAvailabilityPeriod");
    private final static QName _ServiceMaintenancePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ServiceMaintenancePeriod");
    private final static QName _DigitalCertificate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DigitalCertificate");
    private final static QName _SendingDigitalService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SendingDigitalService");
    private final static QName _ReceivingDigitalService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceivingDigitalService");
    private final static QName _DigitalDeliveryChannel_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DigitalDeliveryChannel");
    private final static QName _DigitalDocumentMetadata_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DigitalDocumentMetadata");
    private final static QName _DigitalMessageDelivery_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DigitalMessageDelivery");
    private final static QName _DigitalService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DigitalService");
    private final static QName _Dimension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Dimension");
    private final static QName _DisbursementPaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DisbursementPaymentTerms");
    private final static QName _DischargeTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DischargeTransportEvent");
    private final static QName _DiscrepancyResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DiscrepancyResponse");
    private final static QName _DocumentAvailabilityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentAvailabilityPeriod");
    private final static QName _DocumentMetadata_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentMetadata");
    private final static QName _DocumentProviderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentProviderParty");
    private final static QName _DocumentResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentResponse");
    private final static QName _DocumentTenderRequirement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentTenderRequirement");
    private final static QName _DriverPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DriverPerson");
    private final static QName _DropoffTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DropoffTransportEvent");
    private final static QName _DurationPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DurationPeriod");
    private final static QName _Duty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Duty");
    private final static QName _QualifyingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QualifyingParty");
    private final static QName _PreSelectedParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PreSelectedParty");
    private final static QName _EffectivePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EffectivePeriod");
    private final static QName _EmbassyEndorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EmbassyEndorsement");
    private final static QName _EmergencyTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EmergencyTemperature");
    private final static QName _MeasurementFromLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MeasurementFromLocation");
    private final static QName _MeasurementToLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MeasurementToLocation");
    private final static QName _EmploymentLegislationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EmploymentLegislationDocumentReference");
    private final static QName _EncryptionCertificateAttachment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EncryptionCertificateAttachment");
    private final static QName _EncryptionData_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EncryptionData");
    private final static QName _Endorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Endorsement");
    private final static QName _EnvironmentalLegislationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EnvironmentalLegislationDocumentReference");
    private final static QName _EstimatedArrivalTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EstimatedArrivalTransportEvent");
    private final static QName _EstimatedDeliveryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EstimatedDeliveryPeriod");
    private final static QName _EstimatedDepartureTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EstimatedDepartureTransportEvent");
    private final static QName _EstimatedDurationPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EstimatedDurationPeriod");
    private final static QName _EstimatedTransitPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EstimatedTransitPeriod");
    private final static QName _EvaluationCriterion_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EvaluationCriterion");
    private final static QName _Event_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Event");
    private final static QName _ParticipatingLocationsLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ParticipatingLocationsLocation");
    private final static QName _SupplyItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupplyItem");
    private final static QName _Evidence_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Evidence");
    private final static QName _EvidenceDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EvidenceDocumentReference");
    private final static QName _EvidenceIssuingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EvidenceIssuingParty");
    private final static QName _ExaminationTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExaminationTransportEvent");
    private final static QName _ExceptionObservationPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExceptionObservationPeriod");
    private final static QName _ExportCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExportCountry");
    private final static QName _ExportCustomsExitOfficeLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExportCustomsExitOfficeLocation");
    private final static QName _ExportationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExportationDocumentReference");
    private final static QName _ExportationTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExportationTransportEvent");
    private final static QName _ExportingCustomsParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExportingCustomsParty");
    private final static QName _ExportingGuarantorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExportingGuarantorParty");
    private final static QName _ExpressionOfInterestDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExpressionOfInterestDocumentReference");
    private final static QName _ExtraAllowanceCharge_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExtraAllowanceCharge");
    private final static QName _Fee_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Fee");
    private final static QName _FinalDeliveryParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinalDeliveryParty");
    private final static QName _FinalDeliveryTransportationService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinalDeliveryTransportationService");
    private final static QName _FinalDestinationCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinalDestinationCountry");
    private final static QName _FinalFinancialGuarantee_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinalFinancialGuarantee");
    private final static QName _FinancialAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancialAccount");
    private final static QName _FinancialCapability_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancialCapability");
    private final static QName _FinancialEvaluationCriterion_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancialEvaluationCriterion");
    private final static QName _FinancialGuarantee_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancialGuarantee");
    private final static QName _FinancialInstitutionBranch_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancialInstitutionBranch");
    private final static QName _FirstArrivalPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FirstArrivalPortLocation");
    private final static QName _FiscalLegislationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FiscalLegislationDocumentReference");
    private final static QName _FlashpointTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FlashpointTemperature");
    private final static QName _FloorSpaceMeasurementDimension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FloorSpaceMeasurementDimension");
    private final static QName _ForecastPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ForecastPeriod");
    private final static QName _TaxExclusivePrice_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxExclusivePrice");
    private final static QName _TaxInclusivePrice_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxInclusivePrice");
    private final static QName _ForeignExchangeContract_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ForeignExchangeContract");
    private final static QName _SubsequentProcessTenderRequirement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubsequentProcessTenderRequirement");
    private final static QName _FreightAllowanceCharge_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FreightAllowanceCharge");
    private final static QName _FreightChargeLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FreightChargeLocation");
    private final static QName _FrequencyPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FrequencyPeriod");
    private final static QName _FromLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FromLocation");
    private final static QName _FuelProviderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FuelProviderParty");
    private final static QName _FuelProperty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FuelProperty");
    private final static QName _GoodsItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GoodsItem");
    private final static QName _TransportEquipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportEquipment");
    private final static QName _GoodsItemPassportAttachment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GoodsItemPassportAttachment");
    private final static QName _ImportationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ImportationDocumentReference");
    private final static QName _ReexportationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReexportationDocumentReference");
    private final static QName _ReimportationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReimportationDocumentReference");
    private final static QName _VoucherDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "VoucherDocumentReference");
    private final static QName _GoodsProcessing_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GoodsProcessing");
    private final static QName _GovernorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GovernorParty");
    private final static QName _GuaranteeDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GuaranteeDocumentReference");
    private final static QName _GuarantorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GuarantorParty");
    private final static QName _HandlingTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HandlingTransportEvent");
    private final static QName _HandlingUnitDespatchLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HandlingUnitDespatchLine");
    private final static QName _HaulageTradingTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HaulageTradingTerms");
    private final static QName _MaximumTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MaximumTemperature");
    private final static QName _MinimumTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MinimumTemperature");
    private final static QName _PositionOnBoardStowage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PositionOnBoardStowage");
    private final static QName _HazardousItemNotificationParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HazardousItemNotificationParty");
    private final static QName _HeadOfficeParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HeadOfficeParty");
    private final static QName _HolderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HolderParty");
    private final static QName _SecurityMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SecurityMeasure");
    private final static QName _PortFacilityLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PortFacilityLocation");
    private final static QName _Location_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Location");
    private final static QName _ReportLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReportLocation");
    private final static QName _ISSCIssuerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ISSCIssuerParty");
    private final static QName _SecurityOfficerPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SecurityOfficerPerson");
    private final static QName _IdentityDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "IdentityDocumentReference");
    private final static QName _ImportCustomsExitOfficeLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ImportCustomsExitOfficeLocation");
    private final static QName _ImportingCustomsParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ImportingCustomsParty");
    private final static QName _ImportingGuarantorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ImportingGuarantorParty");
    private final static QName _InformationContentProviderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InformationContentProviderParty");
    private final static QName _ManufacturerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ManufacturerParty");
    private final static QName _InsuranceEndorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InsuranceEndorsement");
    private final static QName _InsuranceParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InsuranceParty");
    private final static QName _InterestedParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InterestedParty");
    private final static QName _InterestedProcurementProjectLot_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InterestedProcurementProjectLot");
    private final static QName _InventoryLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InventoryLocation");
    private final static QName _InventoryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InventoryPeriod");
    private final static QName _InventoryReportingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InventoryReportingParty");
    private final static QName _InvitationSubmissionPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InvitationSubmissionPeriod");
    private final static QName _InvoiceLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InvoiceLine");
    private final static QName _InvoicePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InvoicePeriod");
    private final static QName _IssueLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "IssueLocation");
    private final static QName _IssuerEndorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "IssuerEndorsement");
    private final static QName _ItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemIdentification");
    private final static QName _ItemLocationQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemLocationQuantity");
    private final static QName _ItemPriceExtension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemPriceExtension");
    private final static QName _ItemProperty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemProperty");
    private final static QName _ItemSpecificationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemSpecificationDocumentReference");
    private final static QName _Language_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Language");
    private final static QName _LastExitPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LastExitPortLocation");
    private final static QName _LegalAuthorityParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LegalAuthorityParty");
    private final static QName _LegalContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LegalContact");
    private final static QName _LegalDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LegalDocumentReference");
    private final static QName _LineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LineReference");
    private final static QName _Response_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Response");
    private final static QName _LoadingLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LoadingLocation");
    private final static QName _LoadingPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LoadingPortLocation");
    private final static QName _LoadingProofParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LoadingProofParty");
    private final static QName _LoadingTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LoadingTransportEvent");
    private final static QName _LogisticsOperatorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LogisticsOperatorParty");
    private final static QName _MainCarriageShipmentStage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MainCarriageShipmentStage");
    private final static QName _MainCommodityClassification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MainCommodityClassification");
    private final static QName _MainOnAccountPayment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MainOnAccountPayment");
    private final static QName _MainQualifyingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MainQualifyingParty");
    private final static QName _MainTransportationService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MainTransportationService");
    private final static QName _MandateDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MandateDocumentReference");
    private final static QName _ManufacturersItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ManufacturersItemIdentification");
    private final static QName _WHOAffectedAreaPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WHOAffectedAreaPortLocation");
    private final static QName _Person_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Person");
    private final static QName _PlaceOfReportLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PlaceOfReportLocation");
    private final static QName _MedicalCertificate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MedicalCertificate");
    private final static QName _ShipSanitationControlCertificate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ShipSanitationControlCertificate");
    private final static QName _ShipSanitationControlExemptionDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ShipSanitationControlExemptionDocumentReference");
    private final static QName _RegistryCertificateDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RegistryCertificateDocumentReference");
    private final static QName _RegistryPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RegistryPortLocation");
    private final static QName _RemainingWasteDeliveryPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RemainingWasteDeliveryPortLocation");
    private final static QName _MasterPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MasterPerson");
    private final static QName _MaximumDeliveryUnit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MaximumDeliveryUnit");
    private final static QName _MeasurementDimension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MeasurementDimension");
    private final static QName _MessageDelivery_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MessageDelivery");
    private final static QName _Meter_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Meter");
    private final static QName _MinimumDeliveryUnit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MinimumDeliveryUnit");
    private final static QName _MinutesDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MinutesDocumentReference");
    private final static QName _MonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MonetaryTotal");
    private final static QName _MortgageHolderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MortgageHolderParty");
    private final static QName _NominationPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "NominationPeriod");
    private final static QName _NotaryParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "NotaryParty");
    private final static QName _NoticeDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "NoticeDocumentReference");
    private final static QName _NotificationLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "NotificationLocation");
    private final static QName _NotificationPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "NotificationPeriod");
    private final static QName _NotifierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "NotifierParty");
    private final static QName _OccurenceLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OccurenceLocation");
    private final static QName _OfferedItemLocationQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OfferedItemLocationQuantity");
    private final static QName _OfficeOfDepartureLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OfficeOfDepartureLocation");
    private final static QName _OfficeOfDestinationLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OfficeOfDestinationLocation");
    private final static QName _OfficeOfEntryLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OfficeOfEntryLocation");
    private final static QName _OfficeOfExitLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OfficeOfExitLocation");
    private final static QName _OfficeOfExportLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OfficeOfExportLocation");
    private final static QName _OfficeOfImportLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OfficeOfImportLocation");
    private final static QName _OfficeOfSubSequentiallyEntryLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OfficeOfSubSequentiallyEntryLocation");
    private final static QName _OnAccountPayment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OnAccountPayment");
    private final static QName _OnCarriageShipmentStage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OnCarriageShipmentStage");
    private final static QName _OpenTenderEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OpenTenderEvent");
    private final static QName _OperatingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OperatingParty");
    private final static QName _OptionalTakeoverTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OptionalTakeoverTransportEvent");
    private final static QName _OrderChangeDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OrderChangeDocumentReference");
    private final static QName _Package_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Package");
    private final static QName _OriginAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginAddress");
    private final static QName _OriginCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginCountry");
    private final static QName _OriginalDepartureCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalDepartureCountry");
    private final static QName _OriginalDespatchParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalDespatchParty");
    private final static QName _OriginalDespatchTransportationService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalDespatchTransportationService");
    private final static QName _OriginalItemLocationQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalItemLocationQuantity");
    private final static QName _OriginatorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginatorParty");
    private final static QName _OtherCommunication_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OtherCommunication");
    private final static QName _OwnerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OwnerParty");
    private final static QName _PackagedTransportHandlingUnit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PackagedTransportHandlingUnit");
    private final static QName _PalletSpaceMeasurementDimension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PalletSpaceMeasurementDimension");
    private final static QName _ParentDocumentLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ParentDocumentLineReference");
    private final static QName _ParentDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ParentDocumentReference");
    private final static QName _TechnicalContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TechnicalContact");
    private final static QName _SupportContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupportContact");
    private final static QName _ParticipationInvitationPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ParticipationInvitationPeriod");
    private final static QName _ParticipationRequestReceptionPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ParticipationRequestReceptionPeriod");
    private final static QName _PartyAuthorization_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PartyAuthorization");
    private final static QName _PartyGroup_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PartyGroup");
    private final static QName _RegistrationAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RegistrationAddress");
    private final static QName _PassengerPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PassengerPerson");
    private final static QName _PayeeParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PayeeParty");
    private final static QName _Payment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Payment");
    private final static QName _PaymentAlternativeExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PaymentAlternativeExchangeRate");
    private final static QName _PenaltyClause_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PenaltyClause");
    private final static QName _PenaltyPaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PenaltyPaymentTerms");
    private final static QName _PenaltyPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PenaltyPeriod");
    private final static QName _PerformingCarrierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PerformingCarrierParty");
    private final static QName _PhysicalLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PhysicalLocation");
    private final static QName _PickupLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PickupLocation");
    private final static QName _PickupParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PickupParty");
    private final static QName _PickupTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PickupTransportEvent");
    private final static QName _PlannedArrivalTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PlannedArrivalTransportEvent");
    private final static QName _PlannedDeliveryTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PlannedDeliveryTransportEvent");
    private final static QName _PlannedDepartureTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PlannedDepartureTransportEvent");
    private final static QName _PlannedPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PlannedPeriod");
    private final static QName _PlannedPickupTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PlannedPickupTransportEvent");
    private final static QName _PlannedWaypointTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PlannedWaypointTransportEvent");
    private final static QName _PointOfSaleContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PointOfSaleContact");
    private final static QName _PointOfSaleLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PointOfSaleLocation");
    private final static QName _PortCall_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PortCall");
    private final static QName _PortCallPurpose_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PortCallPurpose");
    private final static QName _PositioningTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PositioningTransportEvent");
    private final static QName _PostalAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PostalAddress");
    private final static QName _WitnessParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WitnessParty");
    private final static QName _PreCarriageShipmentStage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PreCarriageShipmentStage");
    private final static QName _PrepaidPayment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PrepaidPayment");
    private final static QName _PrepaidPaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PrepaidPaymentTerms");
    private final static QName _PreviousCustomsDeclaration_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PreviousCustomsDeclaration");
    private final static QName _PreviousDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PreviousDocumentReference");
    private final static QName _PreviousPriceList_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PreviousPriceList");
    private final static QName _PriceExtension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PriceExtension");
    private final static QName _PriceList_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PriceList");
    private final static QName _PrimaryPortCallPurpose_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PrimaryPortCallPurpose");
    private final static QName _ProcessingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ProcessingParty");
    private final static QName _ProcurementLegislationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ProcurementLegislationDocumentReference");
    private final static QName _RealizedLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RealizedLocation");
    private final static QName _RequestForTenderLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestForTenderLine");
    private final static QName _ProcurementProjectLot_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ProcurementProjectLot");
    private final static QName _PromisedDeliveryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PromisedDeliveryPeriod");
    private final static QName _ProofOfReexportationRequestDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ProofOfReexportationRequestDocumentReference");
    private final static QName _PropertyIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PropertyIdentification");
    private final static QName _ProvidedDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ProvidedDocumentReference");
    private final static QName _ProviderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ProviderParty");
    private final static QName _PurchaseLinePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PurchaseLinePeriod");
    private final static QName _QualificationRequestRecipientParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QualificationRequestRecipientParty");
    private final static QName _QuarantineTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QuarantineTransportEvent");
    private final static QName _RequestLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestLineReference");
    private final static QName _QuotedMonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QuotedMonetaryTotal");
    private final static QName _RangeDimension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RangeDimension");
    private final static QName _ReceiptDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiptDocumentReference");
    private final static QName _ReceiptLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiptLine");
    private final static QName _ReceiptLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiptLineReference");
    private final static QName _ReceiptTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiptTransportEvent");
    private final static QName _ReceivedHandlingUnitReceiptLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceivedHandlingUnitReceiptLine");
    private final static QName _ReceiverParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiverParty");
    private final static QName _RecipientParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RecipientParty");
    private final static QName _ReexportationEvidence_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReexportationEvidence");
    private final static QName _ReferencedConsignment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReferencedConsignment");
    private final static QName _ReferencedContract_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReferencedContract");
    private final static QName _ReferencedGoodsItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReferencedGoodsItem");
    private final static QName _ReferencedPackage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReferencedPackage");
    private final static QName _ReferencedShipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReferencedShipment");
    private final static QName _ReferencedTransportEquipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReferencedTransportEquipment");
    private final static QName _Regulation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Regulation");
    private final static QName _RelatedCatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RelatedCatalogueReference");
    private final static QName _RelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RelatedItem");
    private final static QName _ReminderPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReminderPeriod");
    private final static QName _ReplacedNoticeDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReplacedNoticeDocumentReference");
    private final static QName _ReportedShipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReportedShipment");
    private final static QName _ReporterParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReporterParty");
    private final static QName _ReportingLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReportingLocation");
    private final static QName _ReportingPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReportingPerson");
    private final static QName _RepresentativeParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RepresentativeParty");
    private final static QName _RequestForQuotationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestForQuotationDocumentReference");
    private final static QName _RequestedArrivalEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedArrivalEvent");
    private final static QName _RequestedArrivalTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedArrivalTransportEvent");
    private final static QName _RequestedCatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedCatalogueReference");
    private final static QName _RequestedClassificationScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedClassificationScheme");
    private final static QName _RequestedDeliveryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedDeliveryPeriod");
    private final static QName _RequestedDeliveryTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedDeliveryTransportEvent");
    private final static QName _RequestedDepartureTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedDepartureTransportEvent");
    private final static QName _RequestedDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedDocumentReference");
    private final static QName _RequestedLanguage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedLanguage");
    private final static QName _RequestedMonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedMonetaryTotal");
    private final static QName _RequestedPickupTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedPickupTransportEvent");
    private final static QName _RequestedStatusLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedStatusLocation");
    private final static QName _RequestedStatusPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedStatusPeriod");
    private final static QName _RequestedValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedValidityPeriod");
    private final static QName _RequestedWaypointTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedWaypointTransportEvent");
    private final static QName _RequestorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestorParty");
    private final static QName _RequiredBusinessClassificationScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredBusinessClassificationScheme");
    private final static QName _RequiredCertificationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredCertificationDocumentReference");
    private final static QName _RequiredDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredDocumentReference");
    private final static QName _RequiredFinancialGuarantee_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredFinancialGuarantee");
    private final static QName _ResidenceAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ResidenceAddress");
    private final static QName _ResolutionDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ResolutionDocumentReference");
    private final static QName _ResponderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ResponderParty");
    private final static QName _ResponsibleTransportServiceProviderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ResponsibleTransportServiceProviderParty");
    private final static QName _RetailerCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RetailerCustomerParty");
    private final static QName _ReturnAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReturnAddress");
    private final static QName _SalesDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SalesDocumentReference");
    private final static QName _ScheduledServiceFrequency_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ScheduledServiceFrequency");
    private final static QName _SellerContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellerContact");
    private final static QName _SellersItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellersItemIdentification");
    private final static QName _SenderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SenderParty");
    private final static QName _SendingLogisticsOperatorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SendingLogisticsOperatorParty");
    private final static QName _ServiceAllowanceCharge_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ServiceAllowanceCharge");
    private final static QName _ServiceChargePaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ServiceChargePaymentTerms");
    private final static QName _ServiceEndTimePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ServiceEndTimePeriod");
    private final static QName _ServiceFrequency_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ServiceFrequency");
    private final static QName _ServiceStartTimePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ServiceStartTimePeriod");
    private final static QName _SettlementPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SettlementPeriod");
    private final static QName _Stowage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Stowage");
    private final static QName _ShipmentDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ShipmentDocumentReference");
    private final static QName _ShipmentStage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ShipmentStage");
    private final static QName _ShipperParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ShipperParty");
    private final static QName _ShipsSurgeonPerson_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ShipsSurgeonPerson");
    private final static QName _SourceCatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SourceCatalogueReference");
    private final static QName _SourceIssuerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SourceIssuerParty");
    private final static QName _SpecificTendererRequirement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SpecificTendererRequirement");
    private final static QName _StandardItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StandardItemIdentification");
    private final static QName _StandardPropertyIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StandardPropertyIdentification");
    private final static QName _StatementDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StatementDocumentReference");
    private final static QName _StatementPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StatementPeriod");
    private final static QName _Status_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Status");
    private final static QName _StatusLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StatusLocation");
    private final static QName _StatusPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StatusPeriod");
    private final static QName _StorageLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StorageLocation");
    private final static QName _StorageTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StorageTransportEvent");
    private final static QName _SubAttestationLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubAttestationLine");
    private final static QName _SubCreditNoteLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubCreditNoteLine");
    private final static QName _SubDebitNoteLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubDebitNoteLine");
    private final static QName _SubDespatchLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubDespatchLine");
    private final static QName _SubGoodsProcessing_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubGoodsProcessing");
    private final static QName _SubInvoiceLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubInvoiceLine");
    private final static QName _SubItemProperty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubItemProperty");
    private final static QName _SubLineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubLineItem");
    private final static QName _SubRequestForTenderLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubRequestForTenderLine");
    private final static QName _SubStatus_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubStatus");
    private final static QName _SubTenderLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubTenderLine");
    private final static QName _SubTenderingCriterion_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubTenderingCriterion");
    private final static QName _SubcontractTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubcontractTerms");
    private final static QName _SubcontractorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubcontractorParty");
    private final static QName _SubordinateAwardingCriterion_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubordinateAwardingCriterion");
    private final static QName _SubordinateAwardingCriterionResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubordinateAwardingCriterionResponse");
    private final static QName _SubscriberParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubscriberParty");
    private final static QName _UtilityConsumptionPoint_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UtilityConsumptionPoint");
    private final static QName _UtilitySupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UtilitySupplierParty");
    private final static QName _UtilityCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UtilityCustomerParty");
    private final static QName _SubsidiaryLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubsidiaryLocation");
    private final static QName _SubsidiaryTenderingCriterionPropertyGroup_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubsidiaryTenderingCriterionPropertyGroup");
    private final static QName _SubstituteCarrierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SubstituteCarrierParty");
    private final static QName _SuggestedEvidence_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SuggestedEvidence");
    private final static QName _SupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupplierParty");
    private final static QName _SupplyChainActivityDataLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupplyChainActivityDataLine");
    private final static QName _SupportedCommodityClassification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupportedCommodityClassification");
    private final static QName _SupportedTransportEquipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupportedTransportEquipment");
    private final static QName _TakeoverTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TakeoverTransportEvent");
    private final static QName _TaxDueCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxDueCountry");
    private final static QName _TaxRepresentativeParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxRepresentativeParty");
    private final static QName _TechnicalCapability_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TechnicalCapability");
    private final static QName _TechnicalDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TechnicalDocumentReference");
    private final static QName _TechnicalEvaluationCriterion_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TechnicalEvaluationCriterion");
    private final static QName _Temperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Temperature");
    private final static QName _TemplateDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TemplateDocumentReference");
    private final static QName _TemplateEvidence_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TemplateEvidence");
    private final static QName _TenderDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderDocumentReference");
    private final static QName _TenderEncryptionData_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderEncryptionData");
    private final static QName _TenderEvaluationParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderEvaluationParty");
    private final static QName _TenderLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderLine");
    private final static QName _TenderNotificationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderNotificationDocumentReference");
    private final static QName _TenderRecipientParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderRecipientParty");
    private final static QName _TenderRequirement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderRequirement");
    private final static QName _TenderStatusInquiryDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderStatusInquiryDocumentReference");
    private final static QName _TenderSubmissionDeadlinePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderSubmissionDeadlinePeriod");
    private final static QName _TenderValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderValidityPeriod");
    private final static QName _TenderedProject_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderedProject");
    private final static QName _TendererParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TendererParty");
    private final static QName _TendererQualificationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TendererQualificationDocumentReference");
    private final static QName _TendererRequirement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TendererRequirement");
    private final static QName _TenderingCriterion_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderingCriterion");
    private final static QName _TenderingCriterionPropertyGroup_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TenderingCriterionPropertyGroup");
    private final static QName _TerminalOperatorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TerminalOperatorParty");
    private final static QName _ToLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ToLocation");
    private final static QName _TotalCapacityDimension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TotalCapacityDimension");
    private final static QName _TradingTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TradingTerms");
    private final static QName _TransitCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransitCountry");
    private final static QName _TransitCustomsExitOfficeLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransitCustomsExitOfficeLocation");
    private final static QName _TransitExporterParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransitExporterParty");
    private final static QName _TransitPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransitPeriod");
    private final static QName _TransportAdvisorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportAdvisorParty");
    private final static QName _TransportContract_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportContract");
    private final static QName _TransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportEvent");
    private final static QName _TransportExecutionPlanDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportExecutionPlanDocumentReference");
    private final static QName _TransportExecutionPlanRequestDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportExecutionPlanRequestDocumentReference");
    private final static QName _TransportHandlingUnit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportHandlingUnit");
    private final static QName _TransportMeans_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportMeans");
    private final static QName _TransportProgressStatusRequestDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportProgressStatusRequestDocumentReference");
    private final static QName _TransportServiceDescriptionDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportServiceDescriptionDocumentReference");
    private final static QName _TransportServiceDescriptionRequestDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportServiceDescriptionRequestDocumentReference");
    private final static QName _TransportServiceProviderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportServiceProviderParty");
    private final static QName _TransportServiceProviderResponseDeadlinePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportServiceProviderResponseDeadlinePeriod");
    private final static QName _TransportServiceProviderResponseRequiredPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportServiceProviderResponseRequiredPeriod");
    private final static QName _TransportUserParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportUserParty");
    private final static QName _TransportUserResponseRequiredPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportUserResponseRequiredPeriod");
    private final static QName _TransportationService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportationService");
    private final static QName _TransportationStatusRequestDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportationStatusRequestDocumentReference");
    private final static QName _TransshipPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransshipPortLocation");
    private final static QName _UnloadingLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UnloadingLocation");
    private final static QName _UnloadingPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UnloadingPortLocation");
    private final static QName _UnsubscribeToProcedureDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UnsubscribeToProcedureDocumentReference");
    private final static QName _UnsupportedCommodityClassification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UnsupportedCommodityClassification");
    private final static QName _UnsupportedTransportEquipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UnsupportedTransportEquipment");
    private final static QName _UpdatedDeliveryTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UpdatedDeliveryTransportEvent");
    private final static QName _UpdatedPickupTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UpdatedPickupTransportEvent");
    private final static QName _UsabilityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UsabilityPeriod");
    private final static QName _UtilityMeter_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UtilityMeter");
    private final static QName _WeighingParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WeighingParty");
    private final static QName _WarehouseParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WarehouseParty");
    private final static QName _WarehousingTransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WarehousingTransportEvent");
    private final static QName _WebSite_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WebSite");
    private final static QName _WithholdingTaxTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WithholdingTaxTotal");
    private final static QName _DigestValue_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "DigestValue");
    private final static QName _KeyName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "KeyName");
    private final static QName _MgmtData_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "MgmtData");
    private final static QName _GnB_QNAME = new QName("http://www.w3.org/2009/xmldsig11#", "GnB");
    private final static QName _Any_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "Any");
    private final static QName _ObjectIdentifier_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "ObjectIdentifier");
    private final static QName _EncapsulatedPKIData_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "EncapsulatedPKIData");
    private final static QName _XAdESTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "XAdESTimeStamp");
    private final static QName _SigningTime_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigningTime");
    private final static QName _SignedAssertion_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignedAssertion");
    private final static QName _AllDataObjectsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AllDataObjectsTimeStamp");
    private final static QName _IndividualDataObjectsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "IndividualDataObjectsTimeStamp");
    private final static QName _SignatureTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SignatureTimeStamp");
    private final static QName _CompleteCertificateRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteCertificateRefs");
    private final static QName _CompleteRevocationRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CompleteRevocationRefs");
    private final static QName _AttributeCertificateRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeCertificateRefs");
    private final static QName _AttributeRevocationRefs_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeRevocationRefs");
    private final static QName _SigAndRefsTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SigAndRefsTimeStamp");
    private final static QName _RefsOnlyTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "RefsOnlyTimeStamp");
    private final static QName _CertificateValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "CertificateValues");
    private final static QName _RevocationValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "RevocationValues");
    private final static QName _AttrAuthoritiesCertValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttrAuthoritiesCertValues");
    private final static QName _AttributeRevocationValues_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "AttributeRevocationValues");
    private final static QName _ArchiveTimeStamp_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "ArchiveTimeStamp");
    private final static QName _SPURI_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "SPURI");
    private final static QName _X509AttributeCertificate_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "X509AttributeCertificate");
    private final static QName _OtherAttributeCertificate_QNAME = new QName("http://uri.etsi.org/01903/v1.3.2#", "OtherAttributeCertificate");
    private final static QName _SPDocSpecification_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "SPDocSpecification");
    private final static QName _ArchiveTimeStampV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "ArchiveTimeStampV2");
    private final static QName _CompleteCertificateRefsV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "CompleteCertificateRefsV2");
    private final static QName _AttributeCertificateRefsV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "AttributeCertificateRefsV2");
    private final static QName _SigAndRefsTimeStampV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "SigAndRefsTimeStampV2");
    private final static QName _RefsOnlyTimeStampV2_QNAME = new QName("http://uri.etsi.org/01903/v1.4.1#", "RefsOnlyTimeStampV2");
    private final static QName _SignatureMethod2HMACOutputLength_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "HMACOutputLength");
    private final static QName _TransformXPath_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "XPath");
    private final static QName _X509DataX509IssuerSerial_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerial");
    private final static QName _X509DataX509SKI_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SKI");
    private final static QName _X509DataX509SubjectName_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509SubjectName");
    private final static QName _X509DataX509Certificate_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
    private final static QName _X509DataX509CRL_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "X509CRL");
    private final static QName _SPKIDataSPKISexp_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "SPKISexp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.abeel.platform.facade.oasis.ubl.api.generated.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link UBLExtensions }
     * 
     */
    public UBLExtensions createUBLExtensions() {
        return new UBLExtensions();
    }

    /**
     * Create an instance of {@link UBLExtension }
     * 
     */
    public UBLExtension createUBLExtension() {
        return new UBLExtension();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link IdentifierType }
     * 
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link IdentifierType2 }
     * 
     */
    public IdentifierType2 createIdentifierType2() {
        return new IdentifierType2();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link ExtensionAgencyID }
     * 
     */
    public ExtensionAgencyID createExtensionAgencyID() {
        return new ExtensionAgencyID();
    }

    /**
     * Create an instance of {@link ExtensionAgencyName }
     * 
     */
    public ExtensionAgencyName createExtensionAgencyName() {
        return new ExtensionAgencyName();
    }

    /**
     * Create an instance of {@link ExtensionVersionID }
     * 
     */
    public ExtensionVersionID createExtensionVersionID() {
        return new ExtensionVersionID();
    }

    /**
     * Create an instance of {@link ExtensionAgencyURI }
     * 
     */
    public ExtensionAgencyURI createExtensionAgencyURI() {
        return new ExtensionAgencyURI();
    }

    /**
     * Create an instance of {@link ExtensionURI }
     * 
     */
    public ExtensionURI createExtensionURI() {
        return new ExtensionURI();
    }

    /**
     * Create an instance of {@link ExtensionReasonCode }
     * 
     */
    public ExtensionReasonCode createExtensionReasonCode() {
        return new ExtensionReasonCode();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link CodeType2 }
     * 
     */
    public CodeType2 createCodeType2() {
        return new CodeType2();
    }

    /**
     * Create an instance of {@link ExtensionReason }
     * 
     */
    public ExtensionReason createExtensionReason() {
        return new ExtensionReason();
    }

    /**
     * Create an instance of {@link TextType2 }
     * 
     */
    public TextType2 createTextType2() {
        return new TextType2();
    }

    /**
     * Create an instance of {@link ExtensionContent }
     * 
     */
    public ExtensionContent createExtensionContent() {
        return new ExtensionContent();
    }

    /**
     * Create an instance of {@link UBLVersionID }
     * 
     */
    public UBLVersionID createUBLVersionID() {
        return new UBLVersionID();
    }

    /**
     * Create an instance of {@link CustomizationID }
     * 
     */
    public CustomizationID createCustomizationID() {
        return new CustomizationID();
    }

    /**
     * Create an instance of {@link ProfileID }
     * 
     */
    public ProfileID createProfileID() {
        return new ProfileID();
    }

    /**
     * Create an instance of {@link ProfileExecutionID }
     * 
     */
    public ProfileExecutionID createProfileExecutionID() {
        return new ProfileExecutionID();
    }

    /**
     * Create an instance of {@link SalesOrderID }
     * 
     */
    public SalesOrderID createSalesOrderID() {
        return new SalesOrderID();
    }

    /**
     * Create an instance of {@link CopyIndicator }
     * 
     */
    public CopyIndicator createCopyIndicator() {
        return new CopyIndicator();
    }

    /**
     * Create an instance of {@link IndicatorType }
     * 
     */
    public IndicatorType createIndicatorType() {
        return new IndicatorType();
    }

    /**
     * Create an instance of {@link UUID }
     * 
     */
    public UUID createUUID() {
        return new UUID();
    }

    /**
     * Create an instance of {@link IssueDate }
     * 
     */
    public IssueDate createIssueDate() {
        return new IssueDate();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link IssueTime }
     * 
     */
    public IssueTime createIssueTime() {
        return new IssueTime();
    }

    /**
     * Create an instance of {@link TimeType }
     * 
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link OrderTypeCode }
     * 
     */
    public OrderTypeCode createOrderTypeCode() {
        return new OrderTypeCode();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link RequestedInvoiceCurrencyCode }
     * 
     */
    public RequestedInvoiceCurrencyCode createRequestedInvoiceCurrencyCode() {
        return new RequestedInvoiceCurrencyCode();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link DocumentCurrencyCode }
     * 
     */
    public DocumentCurrencyCode createDocumentCurrencyCode() {
        return new DocumentCurrencyCode();
    }

    /**
     * Create an instance of {@link PricingCurrencyCode }
     * 
     */
    public PricingCurrencyCode createPricingCurrencyCode() {
        return new PricingCurrencyCode();
    }

    /**
     * Create an instance of {@link TaxCurrencyCode }
     * 
     */
    public TaxCurrencyCode createTaxCurrencyCode() {
        return new TaxCurrencyCode();
    }

    /**
     * Create an instance of {@link CustomerReference }
     * 
     */
    public CustomerReference createCustomerReference() {
        return new CustomerReference();
    }

    /**
     * Create an instance of {@link AccountingCostCode }
     * 
     */
    public AccountingCostCode createAccountingCostCode() {
        return new AccountingCostCode();
    }

    /**
     * Create an instance of {@link AccountingCost }
     * 
     */
    public AccountingCost createAccountingCost() {
        return new AccountingCost();
    }

    /**
     * Create an instance of {@link LineCountNumeric }
     * 
     */
    public LineCountNumeric createLineCountNumeric() {
        return new LineCountNumeric();
    }

    /**
     * Create an instance of {@link NumericType }
     * 
     */
    public NumericType createNumericType() {
        return new NumericType();
    }

    /**
     * Create an instance of {@link NumericType2 }
     * 
     */
    public NumericType2 createNumericType2() {
        return new NumericType2();
    }

    /**
     * Create an instance of {@link PeriodType }
     * 
     */
    public PeriodType createPeriodType() {
        return new PeriodType();
    }

    /**
     * Create an instance of {@link DocumentReferenceType }
     * 
     */
    public DocumentReferenceType createDocumentReferenceType() {
        return new DocumentReferenceType();
    }

    /**
     * Create an instance of {@link CatalogueReferenceType }
     * 
     */
    public CatalogueReferenceType createCatalogueReferenceType() {
        return new CatalogueReferenceType();
    }

    /**
     * Create an instance of {@link ContractType }
     * 
     */
    public ContractType createContractType() {
        return new ContractType();
    }

    /**
     * Create an instance of {@link ProjectReference }
     * 
     */
    public ProjectReference createProjectReference() {
        return new ProjectReference();
    }

    /**
     * Create an instance of {@link WorkPhaseReference }
     * 
     */
    public WorkPhaseReference createWorkPhaseReference() {
        return new WorkPhaseReference();
    }

    /**
     * Create an instance of {@link WorkPhaseCode }
     * 
     */
    public WorkPhaseCode createWorkPhaseCode() {
        return new WorkPhaseCode();
    }

    /**
     * Create an instance of {@link WorkPhase }
     * 
     */
    public WorkPhase createWorkPhase() {
        return new WorkPhase();
    }

    /**
     * Create an instance of {@link ProgressPercent }
     * 
     */
    public ProgressPercent createProgressPercent() {
        return new ProgressPercent();
    }

    /**
     * Create an instance of {@link PercentType }
     * 
     */
    public PercentType createPercentType() {
        return new PercentType();
    }

    /**
     * Create an instance of {@link StartDate }
     * 
     */
    public StartDate createStartDate() {
        return new StartDate();
    }

    /**
     * Create an instance of {@link EndDate }
     * 
     */
    public EndDate createEndDate() {
        return new EndDate();
    }

    /**
     * Create an instance of {@link Signature }
     * 
     */
    public Signature createSignature() {
        return new Signature();
    }

    /**
     * Create an instance of {@link ReasonCode }
     * 
     */
    public ReasonCode createReasonCode() {
        return new ReasonCode();
    }

    /**
     * Create an instance of {@link ValidationDate }
     * 
     */
    public ValidationDate createValidationDate() {
        return new ValidationDate();
    }

    /**
     * Create an instance of {@link ValidationTime }
     * 
     */
    public ValidationTime createValidationTime() {
        return new ValidationTime();
    }

    /**
     * Create an instance of {@link ValidatorID }
     * 
     */
    public ValidatorID createValidatorID() {
        return new ValidatorID();
    }

    /**
     * Create an instance of {@link CanonicalizationMethod }
     * 
     */
    public CanonicalizationMethod createCanonicalizationMethod() {
        return new CanonicalizationMethod();
    }

    /**
     * Create an instance of {@link SignatureMethod }
     * 
     */
    public SignatureMethod createSignatureMethod() {
        return new SignatureMethod();
    }

    /**
     * Create an instance of {@link PartyType }
     * 
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     * 
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link CustomerPartyType }
     * 
     */
    public CustomerPartyType createCustomerPartyType() {
        return new CustomerPartyType();
    }

    /**
     * Create an instance of {@link SupplierPartyType }
     * 
     */
    public SupplierPartyType createSupplierPartyType() {
        return new SupplierPartyType();
    }

    /**
     * Create an instance of {@link DeliveryType }
     * 
     */
    public DeliveryType createDeliveryType() {
        return new DeliveryType();
    }

    /**
     * Create an instance of {@link DeliveryTerms }
     * 
     */
    public DeliveryTerms createDeliveryTerms() {
        return new DeliveryTerms();
    }

    /**
     * Create an instance of {@link SpecialTerms }
     * 
     */
    public SpecialTerms createSpecialTerms() {
        return new SpecialTerms();
    }

    /**
     * Create an instance of {@link LossRiskResponsibilityCode }
     * 
     */
    public LossRiskResponsibilityCode createLossRiskResponsibilityCode() {
        return new LossRiskResponsibilityCode();
    }

    /**
     * Create an instance of {@link LossRisk }
     * 
     */
    public LossRisk createLossRisk() {
        return new LossRisk();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link AmountType2 }
     * 
     */
    public AmountType2 createAmountType2() {
        return new AmountType2();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link AllowanceChargeType }
     * 
     */
    public AllowanceChargeType createAllowanceChargeType() {
        return new AllowanceChargeType();
    }

    /**
     * Create an instance of {@link PaymentMeans }
     * 
     */
    public PaymentMeans createPaymentMeans() {
        return new PaymentMeans();
    }

    /**
     * Create an instance of {@link PaymentMeansCode }
     * 
     */
    public PaymentMeansCode createPaymentMeansCode() {
        return new PaymentMeansCode();
    }

    /**
     * Create an instance of {@link PaymentMeansCodeType }
     * 
     */
    public PaymentMeansCodeType createPaymentMeansCodeType() {
        return new PaymentMeansCodeType();
    }

    /**
     * Create an instance of {@link PaymentMeansDescription }
     * 
     */
    public PaymentMeansDescription createPaymentMeansDescription() {
        return new PaymentMeansDescription();
    }

    /**
     * Create an instance of {@link PaymentDueDate }
     * 
     */
    public PaymentDueDate createPaymentDueDate() {
        return new PaymentDueDate();
    }

    /**
     * Create an instance of {@link PaymentChannelCode }
     * 
     */
    public PaymentChannelCode createPaymentChannelCode() {
        return new PaymentChannelCode();
    }

    /**
     * Create an instance of {@link InstructionID }
     * 
     */
    public InstructionID createInstructionID() {
        return new InstructionID();
    }

    /**
     * Create an instance of {@link InstructionNote }
     * 
     */
    public InstructionNote createInstructionNote() {
        return new InstructionNote();
    }

    /**
     * Create an instance of {@link PaymentID }
     * 
     */
    public PaymentID createPaymentID() {
        return new PaymentID();
    }

    /**
     * Create an instance of {@link ChargeBearerCode }
     * 
     */
    public ChargeBearerCode createChargeBearerCode() {
        return new ChargeBearerCode();
    }

    /**
     * Create an instance of {@link ServiceLevelCode }
     * 
     */
    public ServiceLevelCode createServiceLevelCode() {
        return new ServiceLevelCode();
    }

    /**
     * Create an instance of {@link CardAccount }
     * 
     */
    public CardAccount createCardAccount() {
        return new CardAccount();
    }

    /**
     * Create an instance of {@link PrimaryAccountNumberID }
     * 
     */
    public PrimaryAccountNumberID createPrimaryAccountNumberID() {
        return new PrimaryAccountNumberID();
    }

    /**
     * Create an instance of {@link NetworkID }
     * 
     */
    public NetworkID createNetworkID() {
        return new NetworkID();
    }

    /**
     * Create an instance of {@link CardTypeCode }
     * 
     */
    public CardTypeCode createCardTypeCode() {
        return new CardTypeCode();
    }

    /**
     * Create an instance of {@link ValidityStartDate }
     * 
     */
    public ValidityStartDate createValidityStartDate() {
        return new ValidityStartDate();
    }

    /**
     * Create an instance of {@link ExpiryDate }
     * 
     */
    public ExpiryDate createExpiryDate() {
        return new ExpiryDate();
    }

    /**
     * Create an instance of {@link IssuerID }
     * 
     */
    public IssuerID createIssuerID() {
        return new IssuerID();
    }

    /**
     * Create an instance of {@link IssueNumberID }
     * 
     */
    public IssueNumberID createIssueNumberID() {
        return new IssueNumberID();
    }

    /**
     * Create an instance of {@link CV2ID }
     * 
     */
    public CV2ID createCV2ID() {
        return new CV2ID();
    }

    /**
     * Create an instance of {@link CardChipCode }
     * 
     */
    public CardChipCode createCardChipCode() {
        return new CardChipCode();
    }

    /**
     * Create an instance of {@link ChipCodeType }
     * 
     */
    public ChipCodeType createChipCodeType() {
        return new ChipCodeType();
    }

    /**
     * Create an instance of {@link ChipApplicationID }
     * 
     */
    public ChipApplicationID createChipApplicationID() {
        return new ChipApplicationID();
    }

    /**
     * Create an instance of {@link HolderName }
     * 
     */
    public HolderName createHolderName() {
        return new HolderName();
    }

    /**
     * Create an instance of {@link RoleCode }
     * 
     */
    public RoleCode createRoleCode() {
        return new RoleCode();
    }

    /**
     * Create an instance of {@link FinancialAccountType }
     * 
     */
    public FinancialAccountType createFinancialAccountType() {
        return new FinancialAccountType();
    }

    /**
     * Create an instance of {@link CreditAccount }
     * 
     */
    public CreditAccount createCreditAccount() {
        return new CreditAccount();
    }

    /**
     * Create an instance of {@link AccountID }
     * 
     */
    public AccountID createAccountID() {
        return new AccountID();
    }

    /**
     * Create an instance of {@link PaymentMandate }
     * 
     */
    public PaymentMandate createPaymentMandate() {
        return new PaymentMandate();
    }

    /**
     * Create an instance of {@link MandateTypeCode }
     * 
     */
    public MandateTypeCode createMandateTypeCode() {
        return new MandateTypeCode();
    }

    /**
     * Create an instance of {@link MaximumPaymentInstructionsNumeric }
     * 
     */
    public MaximumPaymentInstructionsNumeric createMaximumPaymentInstructionsNumeric() {
        return new MaximumPaymentInstructionsNumeric();
    }

    /**
     * Create an instance of {@link MaximumPaidAmount }
     * 
     */
    public MaximumPaidAmount createMaximumPaidAmount() {
        return new MaximumPaidAmount();
    }

    /**
     * Create an instance of {@link SignatureID }
     * 
     */
    public SignatureID createSignatureID() {
        return new SignatureID();
    }

    /**
     * Create an instance of {@link ClauseType }
     * 
     */
    public ClauseType createClauseType() {
        return new ClauseType();
    }

    /**
     * Create an instance of {@link TradeFinancing }
     * 
     */
    public TradeFinancing createTradeFinancing() {
        return new TradeFinancing();
    }

    /**
     * Create an instance of {@link FinancingInstrumentCode }
     * 
     */
    public FinancingInstrumentCode createFinancingInstrumentCode() {
        return new FinancingInstrumentCode();
    }

    /**
     * Create an instance of {@link DocumentDistributionType }
     * 
     */
    public DocumentDistributionType createDocumentDistributionType() {
        return new DocumentDistributionType();
    }

    /**
     * Create an instance of {@link PaymentTermsType }
     * 
     */
    public PaymentTermsType createPaymentTermsType() {
        return new PaymentTermsType();
    }

    /**
     * Create an instance of {@link TransactionConditions }
     * 
     */
    public TransactionConditions createTransactionConditions() {
        return new TransactionConditions();
    }

    /**
     * Create an instance of {@link ActionCode }
     * 
     */
    public ActionCode createActionCode() {
        return new ActionCode();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link ExchangeRateType }
     * 
     */
    public ExchangeRateType createExchangeRateType() {
        return new ExchangeRateType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link TaxTotalType }
     * 
     */
    public TaxTotalType createTaxTotalType() {
        return new TaxTotalType();
    }

    /**
     * Create an instance of {@link MonetaryTotalType }
     * 
     */
    public MonetaryTotalType createMonetaryTotalType() {
        return new MonetaryTotalType();
    }

    /**
     * Create an instance of {@link OrderLine }
     * 
     */
    public OrderLine createOrderLine() {
        return new OrderLine();
    }

    /**
     * Create an instance of {@link SubstitutionStatusCode }
     * 
     */
    public SubstitutionStatusCode createSubstitutionStatusCode() {
        return new SubstitutionStatusCode();
    }

    /**
     * Create an instance of {@link SubstitutionStatusCodeType }
     * 
     */
    public SubstitutionStatusCodeType createSubstitutionStatusCodeType() {
        return new SubstitutionStatusCodeType();
    }

    /**
     * Create an instance of {@link LineItemType }
     * 
     */
    public LineItemType createLineItemType() {
        return new LineItemType();
    }

    /**
     * Create an instance of {@link LineReferenceType }
     * 
     */
    public LineReferenceType createLineReferenceType() {
        return new LineReferenceType();
    }

    /**
     * Create an instance of {@link OrderLineReference }
     * 
     */
    public OrderLineReference createOrderLineReference() {
        return new OrderLineReference();
    }

    /**
     * Create an instance of {@link LineID }
     * 
     */
    public LineID createLineID() {
        return new LineID();
    }

    /**
     * Create an instance of {@link SalesOrderLineID }
     * 
     */
    public SalesOrderLineID createSalesOrderLineID() {
        return new SalesOrderLineID();
    }

    /**
     * Create an instance of {@link LineStatusCode }
     * 
     */
    public LineStatusCode createLineStatusCode() {
        return new LineStatusCode();
    }

    /**
     * Create an instance of {@link LineStatusCodeType }
     * 
     */
    public LineStatusCodeType createLineStatusCodeType() {
        return new LineStatusCodeType();
    }

    /**
     * Create an instance of {@link OrderReference }
     * 
     */
    public OrderReference createOrderReference() {
        return new OrderReference();
    }

    /**
     * Create an instance of {@link TransportEventType }
     * 
     */
    public TransportEventType createTransportEventType() {
        return new TransportEventType();
    }

    /**
     * Create an instance of {@link RelatedItemType }
     * 
     */
    public RelatedItemType createRelatedItemType() {
        return new RelatedItemType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link ActivityDataLineType }
     * 
     */
    public ActivityDataLineType createActivityDataLineType() {
        return new ActivityDataLineType();
    }

    /**
     * Create an instance of {@link ActivityProperty }
     * 
     */
    public ActivityProperty createActivityProperty() {
        return new ActivityProperty();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link PackageType }
     * 
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link CommodityClassificationType }
     * 
     */
    public CommodityClassificationType createCommodityClassificationType() {
        return new CommodityClassificationType();
    }

    /**
     * Create an instance of {@link DocumentResponseType }
     * 
     */
    public DocumentResponseType createDocumentResponseType() {
        return new DocumentResponseType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link FuelPropertyType }
     * 
     */
    public FuelPropertyType createFuelPropertyType() {
        return new FuelPropertyType();
    }

    /**
     * Create an instance of {@link ItemIdentificationType }
     * 
     */
    public ItemIdentificationType createItemIdentificationType() {
        return new ItemIdentificationType();
    }

    /**
     * Create an instance of {@link ItemPropertyType }
     * 
     */
    public ItemPropertyType createItemPropertyType() {
        return new ItemPropertyType();
    }

    /**
     * Create an instance of {@link LanguageType }
     * 
     */
    public LanguageType createLanguageType() {
        return new LanguageType();
    }

    /**
     * Create an instance of {@link PortCallPurposeType }
     * 
     */
    public PortCallPurposeType createPortCallPurposeType() {
        return new PortCallPurposeType();
    }

    /**
     * Create an instance of {@link QualifyingPartyType }
     * 
     */
    public QualifyingPartyType createQualifyingPartyType() {
        return new QualifyingPartyType();
    }

    /**
     * Create an instance of {@link SecurityMeasureType }
     * 
     */
    public SecurityMeasureType createSecurityMeasureType() {
        return new SecurityMeasureType();
    }

    /**
     * Create an instance of {@link TemperatureType }
     * 
     */
    public TemperatureType createTemperatureType() {
        return new TemperatureType();
    }

    /**
     * Create an instance of {@link TransportationServiceType }
     * 
     */
    public TransportationServiceType createTransportationServiceType() {
        return new TransportationServiceType();
    }

    /**
     * Create an instance of {@link WebSiteType }
     * 
     */
    public WebSiteType createWebSiteType() {
        return new WebSiteType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link AddressLine }
     * 
     */
    public AddressLine createAddressLine() {
        return new AddressLine();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link AirTransport }
     * 
     */
    public AirTransport createAirTransport() {
        return new AirTransport();
    }

    /**
     * Create an instance of {@link AircraftID }
     * 
     */
    public AircraftID createAircraftID() {
        return new AircraftID();
    }

    /**
     * Create an instance of {@link SubcontractTermsType }
     * 
     */
    public SubcontractTermsType createSubcontractTermsType() {
        return new SubcontractTermsType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link AppealTerms }
     * 
     */
    public AppealTerms createAppealTerms() {
        return new AppealTerms();
    }

    /**
     * Create an instance of {@link RegulationType }
     * 
     */
    public RegulationType createRegulationType() {
        return new RegulationType();
    }

    /**
     * Create an instance of {@link TaxCategoryType }
     * 
     */
    public TaxCategoryType createTaxCategoryType() {
        return new TaxCategoryType();
    }

    /**
     * Create an instance of {@link TransportMeansType }
     * 
     */
    public TransportMeansType createTransportMeansType() {
        return new TransportMeansType();
    }

    /**
     * Create an instance of {@link TransportEquipmentType }
     * 
     */
    public TransportEquipmentType createTransportEquipmentType() {
        return new TransportEquipmentType();
    }

    /**
     * Create an instance of {@link Attestation }
     * 
     */
    public Attestation createAttestation() {
        return new Attestation();
    }

    /**
     * Create an instance of {@link AcceptanceIndicator }
     * 
     */
    public AcceptanceIndicator createAcceptanceIndicator() {
        return new AcceptanceIndicator();
    }

    /**
     * Create an instance of {@link AttestationLineType }
     * 
     */
    public AttestationLineType createAttestationLineType() {
        return new AttestationLineType();
    }

    /**
     * Create an instance of {@link AuctionTerms }
     * 
     */
    public AuctionTerms createAuctionTerms() {
        return new AuctionTerms();
    }

    /**
     * Create an instance of {@link AuctionConstraintIndicator }
     * 
     */
    public AuctionConstraintIndicator createAuctionConstraintIndicator() {
        return new AuctionConstraintIndicator();
    }

    /**
     * Create an instance of {@link JustificationDescription }
     * 
     */
    public JustificationDescription createJustificationDescription() {
        return new JustificationDescription();
    }

    /**
     * Create an instance of {@link ProcessDescription }
     * 
     */
    public ProcessDescription createProcessDescription() {
        return new ProcessDescription();
    }

    /**
     * Create an instance of {@link ConditionsDescription }
     * 
     */
    public ConditionsDescription createConditionsDescription() {
        return new ConditionsDescription();
    }

    /**
     * Create an instance of {@link ElectronicDeviceDescription }
     * 
     */
    public ElectronicDeviceDescription createElectronicDeviceDescription() {
        return new ElectronicDeviceDescription();
    }

    /**
     * Create an instance of {@link AuctionURI }
     * 
     */
    public AuctionURI createAuctionURI() {
        return new AuctionURI();
    }

    /**
     * Create an instance of {@link AuthorizationType }
     * 
     */
    public AuthorizationType createAuthorizationType() {
        return new AuthorizationType();
    }

    /**
     * Create an instance of {@link TenderedProjectType }
     * 
     */
    public TenderedProjectType createTenderedProjectType() {
        return new TenderedProjectType();
    }

    /**
     * Create an instance of {@link AwardingCriterionType }
     * 
     */
    public AwardingCriterionType createAwardingCriterionType() {
        return new AwardingCriterionType();
    }

    /**
     * Create an instance of {@link AwardingCriterionResponseType }
     * 
     */
    public AwardingCriterionResponseType createAwardingCriterionResponseType() {
        return new AwardingCriterionResponseType();
    }

    /**
     * Create an instance of {@link AwardingTerms }
     * 
     */
    public AwardingTerms createAwardingTerms() {
        return new AwardingTerms();
    }

    /**
     * Create an instance of {@link WeightingAlgorithmCode }
     * 
     */
    public WeightingAlgorithmCode createWeightingAlgorithmCode() {
        return new WeightingAlgorithmCode();
    }

    /**
     * Create an instance of {@link TechnicalCommitteeDescription }
     * 
     */
    public TechnicalCommitteeDescription createTechnicalCommitteeDescription() {
        return new TechnicalCommitteeDescription();
    }

    /**
     * Create an instance of {@link LowTendersDescription }
     * 
     */
    public LowTendersDescription createLowTendersDescription() {
        return new LowTendersDescription();
    }

    /**
     * Create an instance of {@link PrizeIndicator }
     * 
     */
    public PrizeIndicator createPrizeIndicator() {
        return new PrizeIndicator();
    }

    /**
     * Create an instance of {@link PrizeDescription }
     * 
     */
    public PrizeDescription createPrizeDescription() {
        return new PrizeDescription();
    }

    /**
     * Create an instance of {@link PaymentDescription }
     * 
     */
    public PaymentDescription createPaymentDescription() {
        return new PaymentDescription();
    }

    /**
     * Create an instance of {@link FollowupContractIndicator }
     * 
     */
    public FollowupContractIndicator createFollowupContractIndicator() {
        return new FollowupContractIndicator();
    }

    /**
     * Create an instance of {@link BindingOnBuyerIndicator }
     * 
     */
    public BindingOnBuyerIndicator createBindingOnBuyerIndicator() {
        return new BindingOnBuyerIndicator();
    }

    /**
     * Create an instance of {@link NoFurtherNegotiationIndicator }
     * 
     */
    public NoFurtherNegotiationIndicator createNoFurtherNegotiationIndicator() {
        return new NoFurtherNegotiationIndicator();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link Prize }
     * 
     */
    public Prize createPrize() {
        return new Prize();
    }

    /**
     * Create an instance of {@link RankCode }
     * 
     */
    public RankCode createRankCode() {
        return new RankCode();
    }

    /**
     * Create an instance of {@link ValueAmount }
     * 
     */
    public ValueAmount createValueAmount() {
        return new ValueAmount();
    }

    /**
     * Create an instance of {@link BallastWaterSummary }
     * 
     */
    public BallastWaterSummary createBallastWaterSummary() {
        return new BallastWaterSummary();
    }

    /**
     * Create an instance of {@link ManagementPlanOnBoardIndicator }
     * 
     */
    public ManagementPlanOnBoardIndicator createManagementPlanOnBoardIndicator() {
        return new ManagementPlanOnBoardIndicator();
    }

    /**
     * Create an instance of {@link ManagementPlanImplementedIndicator }
     * 
     */
    public ManagementPlanImplementedIndicator createManagementPlanImplementedIndicator() {
        return new ManagementPlanImplementedIndicator();
    }

    /**
     * Create an instance of {@link IMOGuidelinesOnBoardIndicator }
     * 
     */
    public IMOGuidelinesOnBoardIndicator createIMOGuidelinesOnBoardIndicator() {
        return new IMOGuidelinesOnBoardIndicator();
    }

    /**
     * Create an instance of {@link TotalBallastTanksOnBoardQuantity }
     * 
     */
    public TotalBallastTanksOnBoardQuantity createTotalBallastTanksOnBoardQuantity() {
        return new TotalBallastTanksOnBoardQuantity();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link QuantityType2 }
     * 
     */
    public QuantityType2 createQuantityType2() {
        return new QuantityType2();
    }

    /**
     * Create an instance of {@link TanksInBallastQuantity }
     * 
     */
    public TanksInBallastQuantity createTanksInBallastQuantity() {
        return new TanksInBallastQuantity();
    }

    /**
     * Create an instance of {@link TanksExchangedQuantity }
     * 
     */
    public TanksExchangedQuantity createTanksExchangedQuantity() {
        return new TanksExchangedQuantity();
    }

    /**
     * Create an instance of {@link TanksNotExchangedQuantity }
     * 
     */
    public TanksNotExchangedQuantity createTanksNotExchangedQuantity() {
        return new TanksNotExchangedQuantity();
    }

    /**
     * Create an instance of {@link TotalBallastWaterOnBoardMeasure }
     * 
     */
    public TotalBallastWaterOnBoardMeasure createTotalBallastWaterOnBoardMeasure() {
        return new TotalBallastWaterOnBoardMeasure();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link MeasureType2 }
     * 
     */
    public MeasureType2 createMeasureType2() {
        return new MeasureType2();
    }

    /**
     * Create an instance of {@link TotalBallastWaterCapacityMeasure }
     * 
     */
    public TotalBallastWaterCapacityMeasure createTotalBallastWaterCapacityMeasure() {
        return new TotalBallastWaterCapacityMeasure();
    }

    /**
     * Create an instance of {@link OtherControlActions }
     * 
     */
    public OtherControlActions createOtherControlActions() {
        return new OtherControlActions();
    }

    /**
     * Create an instance of {@link NoControlActionsReason }
     * 
     */
    public NoControlActionsReason createNoControlActionsReason() {
        return new NoControlActionsReason();
    }

    /**
     * Create an instance of {@link BallastWaterTransactionType }
     * 
     */
    public BallastWaterTransactionType createBallastWaterTransactionType() {
        return new BallastWaterTransactionType();
    }

    /**
     * Create an instance of {@link BillingReference }
     * 
     */
    public BillingReference createBillingReference() {
        return new BillingReference();
    }

    /**
     * Create an instance of {@link BillingReferenceLine }
     * 
     */
    public BillingReferenceLine createBillingReferenceLine() {
        return new BillingReferenceLine();
    }

    /**
     * Create an instance of {@link BranchType }
     * 
     */
    public BranchType createBranchType() {
        return new BranchType();
    }

    /**
     * Create an instance of {@link BudgetAccount }
     * 
     */
    public BudgetAccount createBudgetAccount() {
        return new BudgetAccount();
    }

    /**
     * Create an instance of {@link BudgetYearNumeric }
     * 
     */
    public BudgetYearNumeric createBudgetYearNumeric() {
        return new BudgetYearNumeric();
    }

    /**
     * Create an instance of {@link ClassificationSchemeType }
     * 
     */
    public ClassificationSchemeType createClassificationSchemeType() {
        return new ClassificationSchemeType();
    }

    /**
     * Create an instance of {@link BudgetAccountLine }
     * 
     */
    public BudgetAccountLine createBudgetAccountLine() {
        return new BudgetAccountLine();
    }

    /**
     * Create an instance of {@link TotalAmount }
     * 
     */
    public TotalAmount createTotalAmount() {
        return new TotalAmount();
    }

    /**
     * Create an instance of {@link CapabilityType }
     * 
     */
    public CapabilityType createCapabilityType() {
        return new CapabilityType();
    }

    /**
     * Create an instance of {@link PartyGroupType }
     * 
     */
    public PartyGroupType createPartyGroupType() {
        return new PartyGroupType();
    }

    /**
     * Create an instance of {@link DutyType }
     * 
     */
    public DutyType createDutyType() {
        return new DutyType();
    }

    /**
     * Create an instance of {@link CashRegister }
     * 
     */
    public CashRegister createCashRegister() {
        return new CashRegister();
    }

    /**
     * Create an instance of {@link SerialNumberID }
     * 
     */
    public SerialNumberID createSerialNumberID() {
        return new SerialNumberID();
    }

    /**
     * Create an instance of {@link CatalogueItemSpecificationUpdateLine }
     * 
     */
    public CatalogueItemSpecificationUpdateLine createCatalogueItemSpecificationUpdateLine() {
        return new CatalogueItemSpecificationUpdateLine();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link CatalogueLine }
     * 
     */
    public CatalogueLine createCatalogueLine() {
        return new CatalogueLine();
    }

    /**
     * Create an instance of {@link LifeCycleStatusCode }
     * 
     */
    public LifeCycleStatusCode createLifeCycleStatusCode() {
        return new LifeCycleStatusCode();
    }

    /**
     * Create an instance of {@link ContractSubdivision }
     * 
     */
    public ContractSubdivision createContractSubdivision() {
        return new ContractSubdivision();
    }

    /**
     * Create an instance of {@link OrderableIndicator }
     * 
     */
    public OrderableIndicator createOrderableIndicator() {
        return new OrderableIndicator();
    }

    /**
     * Create an instance of {@link OrderableUnit }
     * 
     */
    public OrderableUnit createOrderableUnit() {
        return new OrderableUnit();
    }

    /**
     * Create an instance of {@link ContentUnitQuantity }
     * 
     */
    public ContentUnitQuantity createContentUnitQuantity() {
        return new ContentUnitQuantity();
    }

    /**
     * Create an instance of {@link OrderQuantityIncrementNumeric }
     * 
     */
    public OrderQuantityIncrementNumeric createOrderQuantityIncrementNumeric() {
        return new OrderQuantityIncrementNumeric();
    }

    /**
     * Create an instance of {@link MinimumOrderQuantity }
     * 
     */
    public MinimumOrderQuantity createMinimumOrderQuantity() {
        return new MinimumOrderQuantity();
    }

    /**
     * Create an instance of {@link MaximumOrderQuantity }
     * 
     */
    public MaximumOrderQuantity createMaximumOrderQuantity() {
        return new MaximumOrderQuantity();
    }

    /**
     * Create an instance of {@link WarrantyInformation }
     * 
     */
    public WarrantyInformation createWarrantyInformation() {
        return new WarrantyInformation();
    }

    /**
     * Create an instance of {@link PackLevelCode }
     * 
     */
    public PackLevelCode createPackLevelCode() {
        return new PackLevelCode();
    }

    /**
     * Create an instance of {@link ItemComparison }
     * 
     */
    public ItemComparison createItemComparison() {
        return new ItemComparison();
    }

    /**
     * Create an instance of {@link PriceAmount }
     * 
     */
    public PriceAmount createPriceAmount() {
        return new PriceAmount();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link ItemLocationQuantityType }
     * 
     */
    public ItemLocationQuantityType createItemLocationQuantityType() {
        return new ItemLocationQuantityType();
    }

    /**
     * Create an instance of {@link CataloguePricingUpdateLine }
     * 
     */
    public CataloguePricingUpdateLine createCataloguePricingUpdateLine() {
        return new CataloguePricingUpdateLine();
    }

    /**
     * Create an instance of {@link CatalogueRequestLine }
     * 
     */
    public CatalogueRequestLine createCatalogueRequestLine() {
        return new CatalogueRequestLine();
    }

    /**
     * Create an instance of {@link ClassificationCategoryType }
     * 
     */
    public ClassificationCategoryType createClassificationCategoryType() {
        return new ClassificationCategoryType();
    }

    /**
     * Create an instance of {@link CertificateType }
     * 
     */
    public CertificateType createCertificateType() {
        return new CertificateType();
    }

    /**
     * Create an instance of {@link CertificateOfOriginApplication }
     * 
     */
    public CertificateOfOriginApplication createCertificateOfOriginApplication() {
        return new CertificateOfOriginApplication();
    }

    /**
     * Create an instance of {@link ReferenceID }
     * 
     */
    public ReferenceID createReferenceID() {
        return new ReferenceID();
    }

    /**
     * Create an instance of {@link CertificateType2 }
     * 
     */
    public CertificateType2 createCertificateType2() {
        return new CertificateType2();
    }

    /**
     * Create an instance of {@link ApplicationStatusCode }
     * 
     */
    public ApplicationStatusCode createApplicationStatusCode() {
        return new ApplicationStatusCode();
    }

    /**
     * Create an instance of {@link OriginalJobID }
     * 
     */
    public OriginalJobID createOriginalJobID() {
        return new OriginalJobID();
    }

    /**
     * Create an instance of {@link PreviousJobID }
     * 
     */
    public PreviousJobID createPreviousJobID() {
        return new PreviousJobID();
    }

    /**
     * Create an instance of {@link Remarks }
     * 
     */
    public Remarks createRemarks() {
        return new Remarks();
    }

    /**
     * Create an instance of {@link ShipmentType }
     * 
     */
    public ShipmentType createShipmentType() {
        return new ShipmentType();
    }

    /**
     * Create an instance of {@link EndorserParty }
     * 
     */
    public EndorserParty createEndorserParty() {
        return new EndorserParty();
    }

    /**
     * Create an instance of {@link SequenceNumeric }
     * 
     */
    public SequenceNumeric createSequenceNumeric() {
        return new SequenceNumeric();
    }

    /**
     * Create an instance of {@link ConsignmentType }
     * 
     */
    public ConsignmentType createConsignmentType() {
        return new ConsignmentType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link CommunicationType }
     * 
     */
    public CommunicationType createCommunicationType() {
        return new CommunicationType();
    }

    /**
     * Create an instance of {@link CompletedTask }
     * 
     */
    public CompletedTask createCompletedTask() {
        return new CompletedTask();
    }

    /**
     * Create an instance of {@link AnnualAverageAmount }
     * 
     */
    public AnnualAverageAmount createAnnualAverageAmount() {
        return new AnnualAverageAmount();
    }

    /**
     * Create an instance of {@link TotalTaskAmount }
     * 
     */
    public TotalTaskAmount createTotalTaskAmount() {
        return new TotalTaskAmount();
    }

    /**
     * Create an instance of {@link PartyCapacityAmount }
     * 
     */
    public PartyCapacityAmount createPartyCapacityAmount() {
        return new PartyCapacityAmount();
    }

    /**
     * Create an instance of {@link EvidenceSupplied }
     * 
     */
    public EvidenceSupplied createEvidenceSupplied() {
        return new EvidenceSupplied();
    }

    /**
     * Create an instance of {@link Condition }
     * 
     */
    public Condition createCondition() {
        return new Condition();
    }

    /**
     * Create an instance of {@link AttributeID }
     * 
     */
    public AttributeID createAttributeID() {
        return new AttributeID();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link MinimumMeasure }
     * 
     */
    public MinimumMeasure createMinimumMeasure() {
        return new MinimumMeasure();
    }

    /**
     * Create an instance of {@link MaximumMeasure }
     * 
     */
    public MaximumMeasure createMaximumMeasure() {
        return new MaximumMeasure();
    }

    /**
     * Create an instance of {@link Consumption }
     * 
     */
    public Consumption createConsumption() {
        return new Consumption();
    }

    /**
     * Create an instance of {@link UtilityStatementTypeCode }
     * 
     */
    public UtilityStatementTypeCode createUtilityStatementTypeCode() {
        return new UtilityStatementTypeCode();
    }

    /**
     * Create an instance of {@link EnergyWaterSupply }
     * 
     */
    public EnergyWaterSupply createEnergyWaterSupply() {
        return new EnergyWaterSupply();
    }

    /**
     * Create an instance of {@link ConsumptionReport }
     * 
     */
    public ConsumptionReport createConsumptionReport() {
        return new ConsumptionReport();
    }

    /**
     * Create an instance of {@link ConsumptionType }
     * 
     */
    public ConsumptionType createConsumptionType() {
        return new ConsumptionType();
    }

    /**
     * Create an instance of {@link ConsumptionTypeCode }
     * 
     */
    public ConsumptionTypeCode createConsumptionTypeCode() {
        return new ConsumptionTypeCode();
    }

    /**
     * Create an instance of {@link TotalConsumedQuantity }
     * 
     */
    public TotalConsumedQuantity createTotalConsumedQuantity() {
        return new TotalConsumedQuantity();
    }

    /**
     * Create an instance of {@link BasicConsumedQuantity }
     * 
     */
    public BasicConsumedQuantity createBasicConsumedQuantity() {
        return new BasicConsumedQuantity();
    }

    /**
     * Create an instance of {@link ResidentOccupantsNumeric }
     * 
     */
    public ResidentOccupantsNumeric createResidentOccupantsNumeric() {
        return new ResidentOccupantsNumeric();
    }

    /**
     * Create an instance of {@link ConsumersEnergyLevelCode }
     * 
     */
    public ConsumersEnergyLevelCode createConsumersEnergyLevelCode() {
        return new ConsumersEnergyLevelCode();
    }

    /**
     * Create an instance of {@link ConsumersEnergyLevel }
     * 
     */
    public ConsumersEnergyLevel createConsumersEnergyLevel() {
        return new ConsumersEnergyLevel();
    }

    /**
     * Create an instance of {@link ResidenceType }
     * 
     */
    public ResidenceType createResidenceType() {
        return new ResidenceType();
    }

    /**
     * Create an instance of {@link ResidenceTypeCode }
     * 
     */
    public ResidenceTypeCode createResidenceTypeCode() {
        return new ResidenceTypeCode();
    }

    /**
     * Create an instance of {@link HeatingType }
     * 
     */
    public HeatingType createHeatingType() {
        return new HeatingType();
    }

    /**
     * Create an instance of {@link HeatingTypeCode }
     * 
     */
    public HeatingTypeCode createHeatingTypeCode() {
        return new HeatingTypeCode();
    }

    /**
     * Create an instance of {@link ConsumptionReportReference }
     * 
     */
    public ConsumptionReportReference createConsumptionReportReference() {
        return new ConsumptionReportReference();
    }

    /**
     * Create an instance of {@link ConsumptionReportID }
     * 
     */
    public ConsumptionReportID createConsumptionReportID() {
        return new ConsumptionReportID();
    }

    /**
     * Create an instance of {@link ConsumptionHistory }
     * 
     */
    public ConsumptionHistory createConsumptionHistory() {
        return new ConsumptionHistory();
    }

    /**
     * Create an instance of {@link MeterNumber }
     * 
     */
    public MeterNumber createMeterNumber() {
        return new MeterNumber();
    }

    /**
     * Create an instance of {@link ConsumptionLevelCode }
     * 
     */
    public ConsumptionLevelCode createConsumptionLevelCode() {
        return new ConsumptionLevelCode();
    }

    /**
     * Create an instance of {@link ConsumptionLevel }
     * 
     */
    public ConsumptionLevel createConsumptionLevel() {
        return new ConsumptionLevel();
    }

    /**
     * Create an instance of {@link EnergyTaxReport }
     * 
     */
    public EnergyTaxReport createEnergyTaxReport() {
        return new EnergyTaxReport();
    }

    /**
     * Create an instance of {@link TaxEnergyAmount }
     * 
     */
    public TaxEnergyAmount createTaxEnergyAmount() {
        return new TaxEnergyAmount();
    }

    /**
     * Create an instance of {@link TaxEnergyOnAccountAmount }
     * 
     */
    public TaxEnergyOnAccountAmount createTaxEnergyOnAccountAmount() {
        return new TaxEnergyOnAccountAmount();
    }

    /**
     * Create an instance of {@link TaxEnergyBalanceAmount }
     * 
     */
    public TaxEnergyBalanceAmount createTaxEnergyBalanceAmount() {
        return new TaxEnergyBalanceAmount();
    }

    /**
     * Create an instance of {@link TaxScheme }
     * 
     */
    public TaxScheme createTaxScheme() {
        return new TaxScheme();
    }

    /**
     * Create an instance of {@link TaxTypeCode }
     * 
     */
    public TaxTypeCode createTaxTypeCode() {
        return new TaxTypeCode();
    }

    /**
     * Create an instance of {@link CurrencyCode }
     * 
     */
    public CurrencyCode createCurrencyCode() {
        return new CurrencyCode();
    }

    /**
     * Create an instance of {@link ConsumptionAverage }
     * 
     */
    public ConsumptionAverage createConsumptionAverage() {
        return new ConsumptionAverage();
    }

    /**
     * Create an instance of {@link AverageAmount }
     * 
     */
    public AverageAmount createAverageAmount() {
        return new AverageAmount();
    }

    /**
     * Create an instance of {@link ConsumptionCorrectionType }
     * 
     */
    public ConsumptionCorrectionType createConsumptionCorrectionType() {
        return new ConsumptionCorrectionType();
    }

    /**
     * Create an instance of {@link TelecommunicationsSupply }
     * 
     */
    public TelecommunicationsSupply createTelecommunicationsSupply() {
        return new TelecommunicationsSupply();
    }

    /**
     * Create an instance of {@link TelecommunicationsSupplyType }
     * 
     */
    public TelecommunicationsSupplyType createTelecommunicationsSupplyType() {
        return new TelecommunicationsSupplyType();
    }

    /**
     * Create an instance of {@link TelecommunicationsSupplyTypeCode }
     * 
     */
    public TelecommunicationsSupplyTypeCode createTelecommunicationsSupplyTypeCode() {
        return new TelecommunicationsSupplyTypeCode();
    }

    /**
     * Create an instance of {@link PrivacyCode }
     * 
     */
    public PrivacyCode createPrivacyCode() {
        return new PrivacyCode();
    }

    /**
     * Create an instance of {@link TelecommunicationsSupplyLine }
     * 
     */
    public TelecommunicationsSupplyLine createTelecommunicationsSupplyLine() {
        return new TelecommunicationsSupplyLine();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link LineExtensionAmount }
     * 
     */
    public LineExtensionAmount createLineExtensionAmount() {
        return new LineExtensionAmount();
    }

    /**
     * Create an instance of {@link TaxInclusiveLineExtensionAmount }
     * 
     */
    public TaxInclusiveLineExtensionAmount createTaxInclusiveLineExtensionAmount() {
        return new TaxInclusiveLineExtensionAmount();
    }

    /**
     * Create an instance of {@link TelecommunicationsService }
     * 
     */
    public TelecommunicationsService createTelecommunicationsService() {
        return new TelecommunicationsService();
    }

    /**
     * Create an instance of {@link CallDate }
     * 
     */
    public CallDate createCallDate() {
        return new CallDate();
    }

    /**
     * Create an instance of {@link CallTime }
     * 
     */
    public CallTime createCallTime() {
        return new CallTime();
    }

    /**
     * Create an instance of {@link ServiceNumberCalled }
     * 
     */
    public ServiceNumberCalled createServiceNumberCalled() {
        return new ServiceNumberCalled();
    }

    /**
     * Create an instance of {@link TelecommunicationsServiceCategory }
     * 
     */
    public TelecommunicationsServiceCategory createTelecommunicationsServiceCategory() {
        return new TelecommunicationsServiceCategory();
    }

    /**
     * Create an instance of {@link TelecommunicationsServiceCategoryCode }
     * 
     */
    public TelecommunicationsServiceCategoryCode createTelecommunicationsServiceCategoryCode() {
        return new TelecommunicationsServiceCategoryCode();
    }

    /**
     * Create an instance of {@link MovieTitle }
     * 
     */
    public MovieTitle createMovieTitle() {
        return new MovieTitle();
    }

    /**
     * Create an instance of {@link RoamingPartnerName }
     * 
     */
    public RoamingPartnerName createRoamingPartnerName() {
        return new RoamingPartnerName();
    }

    /**
     * Create an instance of {@link PayPerView }
     * 
     */
    public PayPerView createPayPerView() {
        return new PayPerView();
    }

    /**
     * Create an instance of {@link TelecommunicationsServiceCall }
     * 
     */
    public TelecommunicationsServiceCall createTelecommunicationsServiceCall() {
        return new TelecommunicationsServiceCall();
    }

    /**
     * Create an instance of {@link TelecommunicationsServiceCallCode }
     * 
     */
    public TelecommunicationsServiceCallCode createTelecommunicationsServiceCallCode() {
        return new TelecommunicationsServiceCallCode();
    }

    /**
     * Create an instance of {@link CallBaseAmount }
     * 
     */
    public CallBaseAmount createCallBaseAmount() {
        return new CallBaseAmount();
    }

    /**
     * Create an instance of {@link CallExtensionAmount }
     * 
     */
    public CallExtensionAmount createCallExtensionAmount() {
        return new CallExtensionAmount();
    }

    /**
     * Create an instance of {@link ConsumptionLine }
     * 
     */
    public ConsumptionLine createConsumptionLine() {
        return new ConsumptionLine();
    }

    /**
     * Create an instance of {@link ParentDocumentLineReferenceID }
     * 
     */
    public ParentDocumentLineReferenceID createParentDocumentLineReferenceID() {
        return new ParentDocumentLineReferenceID();
    }

    /**
     * Create an instance of {@link InvoicedQuantity }
     * 
     */
    public InvoicedQuantity createInvoicedQuantity() {
        return new InvoicedQuantity();
    }

    /**
     * Create an instance of {@link UtilityItem }
     * 
     */
    public UtilityItem createUtilityItem() {
        return new UtilityItem();
    }

    /**
     * Create an instance of {@link SubscriberID }
     * 
     */
    public SubscriberID createSubscriberID() {
        return new SubscriberID();
    }

    /**
     * Create an instance of {@link SubscriberType }
     * 
     */
    public SubscriberType createSubscriberType() {
        return new SubscriberType();
    }

    /**
     * Create an instance of {@link SubscriberTypeCode }
     * 
     */
    public SubscriberTypeCode createSubscriberTypeCode() {
        return new SubscriberTypeCode();
    }

    /**
     * Create an instance of {@link PackQuantity }
     * 
     */
    public PackQuantity createPackQuantity() {
        return new PackQuantity();
    }

    /**
     * Create an instance of {@link PackSizeNumeric }
     * 
     */
    public PackSizeNumeric createPackSizeNumeric() {
        return new PackSizeNumeric();
    }

    /**
     * Create an instance of {@link CurrentChargeType }
     * 
     */
    public CurrentChargeType createCurrentChargeType() {
        return new CurrentChargeType();
    }

    /**
     * Create an instance of {@link CurrentChargeTypeCode }
     * 
     */
    public CurrentChargeTypeCode createCurrentChargeTypeCode() {
        return new CurrentChargeTypeCode();
    }

    /**
     * Create an instance of {@link OneTimeChargeType }
     * 
     */
    public OneTimeChargeType createOneTimeChargeType() {
        return new OneTimeChargeType();
    }

    /**
     * Create an instance of {@link OneTimeChargeTypeCode }
     * 
     */
    public OneTimeChargeTypeCode createOneTimeChargeTypeCode() {
        return new OneTimeChargeTypeCode();
    }

    /**
     * Create an instance of {@link UnstructuredPrice }
     * 
     */
    public UnstructuredPrice createUnstructuredPrice() {
        return new UnstructuredPrice();
    }

    /**
     * Create an instance of {@link TaxInclusivePriceAmount }
     * 
     */
    public TaxInclusivePriceAmount createTaxInclusivePriceAmount() {
        return new TaxInclusivePriceAmount();
    }

    /**
     * Create an instance of {@link TimeAmount }
     * 
     */
    public TimeAmount createTimeAmount() {
        return new TimeAmount();
    }

    /**
     * Create an instance of {@link ConsumptionPointType }
     * 
     */
    public ConsumptionPointType createConsumptionPointType() {
        return new ConsumptionPointType();
    }

    /**
     * Create an instance of {@link GoodsItemType }
     * 
     */
    public GoodsItemType createGoodsItemType() {
        return new GoodsItemType();
    }

    /**
     * Create an instance of {@link ContractExecutionRequirement }
     * 
     */
    public ContractExecutionRequirement createContractExecutionRequirement() {
        return new ContractExecutionRequirement();
    }

    /**
     * Create an instance of {@link ExecutionRequirementCode }
     * 
     */
    public ExecutionRequirementCode createExecutionRequirementCode() {
        return new ExecutionRequirementCode();
    }

    /**
     * Create an instance of {@link ContractExtension }
     * 
     */
    public ContractExtension createContractExtension() {
        return new ContractExtension();
    }

    /**
     * Create an instance of {@link OptionsDescription }
     * 
     */
    public OptionsDescription createOptionsDescription() {
        return new OptionsDescription();
    }

    /**
     * Create an instance of {@link MinimumNumberNumeric }
     * 
     */
    public MinimumNumberNumeric createMinimumNumberNumeric() {
        return new MinimumNumberNumeric();
    }

    /**
     * Create an instance of {@link MaximumNumberNumeric }
     * 
     */
    public MaximumNumberNumeric createMaximumNumberNumeric() {
        return new MaximumNumberNumeric();
    }

    /**
     * Create an instance of {@link RenewalsIndicator }
     * 
     */
    public RenewalsIndicator createRenewalsIndicator() {
        return new RenewalsIndicator();
    }

    /**
     * Create an instance of {@link Renewal }
     * 
     */
    public Renewal createRenewal() {
        return new Renewal();
    }

    /**
     * Create an instance of {@link ContractingActivity }
     * 
     */
    public ContractingActivity createContractingActivity() {
        return new ContractingActivity();
    }

    /**
     * Create an instance of {@link ActivityTypeCode }
     * 
     */
    public ActivityTypeCode createActivityTypeCode() {
        return new ActivityTypeCode();
    }

    /**
     * Create an instance of {@link ActivityType }
     * 
     */
    public ActivityType createActivityType() {
        return new ActivityType();
    }

    /**
     * Create an instance of {@link ContractingParty }
     * 
     */
    public ContractingParty createContractingParty() {
        return new ContractingParty();
    }

    /**
     * Create an instance of {@link BuyerProfileURI }
     * 
     */
    public BuyerProfileURI createBuyerProfileURI() {
        return new BuyerProfileURI();
    }

    /**
     * Create an instance of {@link ContractingPartyType }
     * 
     */
    public ContractingPartyType createContractingPartyType() {
        return new ContractingPartyType();
    }

    /**
     * Create an instance of {@link PartyTypeCode }
     * 
     */
    public PartyTypeCode createPartyTypeCode() {
        return new PartyTypeCode();
    }

    /**
     * Create an instance of {@link PartyType2 }
     * 
     */
    public PartyType2 createPartyType2() {
        return new PartyType2();
    }

    /**
     * Create an instance of {@link ContractingRepresentationType }
     * 
     */
    public ContractingRepresentationType createContractingRepresentationType() {
        return new ContractingRepresentationType();
    }

    /**
     * Create an instance of {@link RepresentationTypeCode }
     * 
     */
    public RepresentationTypeCode createRepresentationTypeCode() {
        return new RepresentationTypeCode();
    }

    /**
     * Create an instance of {@link RepresentationType }
     * 
     */
    public RepresentationType createRepresentationType() {
        return new RepresentationType();
    }

    /**
     * Create an instance of {@link ContractingSystem }
     * 
     */
    public ContractingSystem createContractingSystem() {
        return new ContractingSystem();
    }

    /**
     * Create an instance of {@link ContractingSystemTypeCode }
     * 
     */
    public ContractingSystemTypeCode createContractingSystemTypeCode() {
        return new ContractingSystemTypeCode();
    }

    /**
     * Create an instance of {@link CorporateRegistrationScheme }
     * 
     */
    public CorporateRegistrationScheme createCorporateRegistrationScheme() {
        return new CorporateRegistrationScheme();
    }

    /**
     * Create an instance of {@link CorporateRegistrationTypeCode }
     * 
     */
    public CorporateRegistrationTypeCode createCorporateRegistrationTypeCode() {
        return new CorporateRegistrationTypeCode();
    }

    /**
     * Create an instance of {@link CreditNoteLineType }
     * 
     */
    public CreditNoteLineType createCreditNoteLineType() {
        return new CreditNoteLineType();
    }

    /**
     * Create an instance of {@link CrewPersonEffect }
     * 
     */
    public CrewPersonEffect createCrewPersonEffect() {
        return new CrewPersonEffect();
    }

    /**
     * Create an instance of {@link EffectDescription }
     * 
     */
    public EffectDescription createEffectDescription() {
        return new EffectDescription();
    }

    /**
     * Create an instance of {@link CriterionItem }
     * 
     */
    public CriterionItem createCriterionItem() {
        return new CriterionItem();
    }

    /**
     * Create an instance of {@link TypeCode }
     * 
     */
    public TypeCode createTypeCode() {
        return new TypeCode();
    }

    /**
     * Create an instance of {@link CriterionDescription }
     * 
     */
    public CriterionDescription createCriterionDescription() {
        return new CriterionDescription();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link CustomsDeclarationType }
     * 
     */
    public CustomsDeclarationType createCustomsDeclarationType() {
        return new CustomsDeclarationType();
    }

    /**
     * Create an instance of {@link DebitNoteLineType }
     * 
     */
    public DebitNoteLineType createDebitNoteLineType() {
        return new DebitNoteLineType();
    }

    /**
     * Create an instance of {@link Declaration }
     * 
     */
    public Declaration createDeclaration() {
        return new Declaration();
    }

    /**
     * Create an instance of {@link DeclarationTypeCode }
     * 
     */
    public DeclarationTypeCode createDeclarationTypeCode() {
        return new DeclarationTypeCode();
    }

    /**
     * Create an instance of {@link DeliveryChannelType }
     * 
     */
    public DeliveryChannelType createDeliveryChannelType() {
        return new DeliveryChannelType();
    }

    /**
     * Create an instance of {@link DeliveryUnitType }
     * 
     */
    public DeliveryUnitType createDeliveryUnitType() {
        return new DeliveryUnitType();
    }

    /**
     * Create an instance of {@link DependentPriceReference }
     * 
     */
    public DependentPriceReference createDependentPriceReference() {
        return new DependentPriceReference();
    }

    /**
     * Create an instance of {@link Percent }
     * 
     */
    public Percent createPercent() {
        return new Percent();
    }

    /**
     * Create an instance of {@link Despatch }
     * 
     */
    public Despatch createDespatch() {
        return new Despatch();
    }

    /**
     * Create an instance of {@link RequestedDespatchDate }
     * 
     */
    public RequestedDespatchDate createRequestedDespatchDate() {
        return new RequestedDespatchDate();
    }

    /**
     * Create an instance of {@link RequestedDespatchTime }
     * 
     */
    public RequestedDespatchTime createRequestedDespatchTime() {
        return new RequestedDespatchTime();
    }

    /**
     * Create an instance of {@link EstimatedDespatchDate }
     * 
     */
    public EstimatedDespatchDate createEstimatedDespatchDate() {
        return new EstimatedDespatchDate();
    }

    /**
     * Create an instance of {@link EstimatedDespatchTime }
     * 
     */
    public EstimatedDespatchTime createEstimatedDespatchTime() {
        return new EstimatedDespatchTime();
    }

    /**
     * Create an instance of {@link ActualDespatchDate }
     * 
     */
    public ActualDespatchDate createActualDespatchDate() {
        return new ActualDespatchDate();
    }

    /**
     * Create an instance of {@link ActualDespatchTime }
     * 
     */
    public ActualDespatchTime createActualDespatchTime() {
        return new ActualDespatchTime();
    }

    /**
     * Create an instance of {@link GuaranteedDespatchDate }
     * 
     */
    public GuaranteedDespatchDate createGuaranteedDespatchDate() {
        return new GuaranteedDespatchDate();
    }

    /**
     * Create an instance of {@link GuaranteedDespatchTime }
     * 
     */
    public GuaranteedDespatchTime createGuaranteedDespatchTime() {
        return new GuaranteedDespatchTime();
    }

    /**
     * Create an instance of {@link ReleaseID }
     * 
     */
    public ReleaseID createReleaseID() {
        return new ReleaseID();
    }

    /**
     * Create an instance of {@link Instructions }
     * 
     */
    public Instructions createInstructions() {
        return new Instructions();
    }

    /**
     * Create an instance of {@link DespatchLineType }
     * 
     */
    public DespatchLineType createDespatchLineType() {
        return new DespatchLineType();
    }

    /**
     * Create an instance of {@link PortCallType }
     * 
     */
    public PortCallType createPortCallType() {
        return new PortCallType();
    }

    /**
     * Create an instance of {@link DigitalAgreementTerms }
     * 
     */
    public DigitalAgreementTerms createDigitalAgreementTerms() {
        return new DigitalAgreementTerms();
    }

    /**
     * Create an instance of {@link ServiceLevelAgreement }
     * 
     */
    public ServiceLevelAgreement createServiceLevelAgreement() {
        return new ServiceLevelAgreement();
    }

    /**
     * Create an instance of {@link ServiceTypeCode }
     * 
     */
    public ServiceTypeCode createServiceTypeCode() {
        return new ServiceTypeCode();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link AvailabilityTimePercent }
     * 
     */
    public AvailabilityTimePercent createAvailabilityTimePercent() {
        return new AvailabilityTimePercent();
    }

    /**
     * Create an instance of {@link MondayAvailabilityIndicator }
     * 
     */
    public MondayAvailabilityIndicator createMondayAvailabilityIndicator() {
        return new MondayAvailabilityIndicator();
    }

    /**
     * Create an instance of {@link TuesdayAvailabilityIndicator }
     * 
     */
    public TuesdayAvailabilityIndicator createTuesdayAvailabilityIndicator() {
        return new TuesdayAvailabilityIndicator();
    }

    /**
     * Create an instance of {@link WednesdayAvailabilityIndicator }
     * 
     */
    public WednesdayAvailabilityIndicator createWednesdayAvailabilityIndicator() {
        return new WednesdayAvailabilityIndicator();
    }

    /**
     * Create an instance of {@link ThursdayAvailabilityIndicator }
     * 
     */
    public ThursdayAvailabilityIndicator createThursdayAvailabilityIndicator() {
        return new ThursdayAvailabilityIndicator();
    }

    /**
     * Create an instance of {@link FridayAvailabilityIndicator }
     * 
     */
    public FridayAvailabilityIndicator createFridayAvailabilityIndicator() {
        return new FridayAvailabilityIndicator();
    }

    /**
     * Create an instance of {@link SaturdayAvailabilityIndicator }
     * 
     */
    public SaturdayAvailabilityIndicator createSaturdayAvailabilityIndicator() {
        return new SaturdayAvailabilityIndicator();
    }

    /**
     * Create an instance of {@link SundayAvailabilityIndicator }
     * 
     */
    public SundayAvailabilityIndicator createSundayAvailabilityIndicator() {
        return new SundayAvailabilityIndicator();
    }

    /**
     * Create an instance of {@link MinimumResponseTimeDurationMeasure }
     * 
     */
    public MinimumResponseTimeDurationMeasure createMinimumResponseTimeDurationMeasure() {
        return new MinimumResponseTimeDurationMeasure();
    }

    /**
     * Create an instance of {@link MinimumDownTimeScheduleDurationMeasure }
     * 
     */
    public MinimumDownTimeScheduleDurationMeasure createMinimumDownTimeScheduleDurationMeasure() {
        return new MinimumDownTimeScheduleDurationMeasure();
    }

    /**
     * Create an instance of {@link MaximumIncidentNotificationDurationMeasure }
     * 
     */
    public MaximumIncidentNotificationDurationMeasure createMaximumIncidentNotificationDurationMeasure() {
        return new MaximumIncidentNotificationDurationMeasure();
    }

    /**
     * Create an instance of {@link MaximumDataLossDurationMeasure }
     * 
     */
    public MaximumDataLossDurationMeasure createMaximumDataLossDurationMeasure() {
        return new MaximumDataLossDurationMeasure();
    }

    /**
     * Create an instance of {@link MeanTimeToRecoverDurationMeasure }
     * 
     */
    public MeanTimeToRecoverDurationMeasure createMeanTimeToRecoverDurationMeasure() {
        return new MeanTimeToRecoverDurationMeasure();
    }

    /**
     * Create an instance of {@link DigitalCollaboration }
     * 
     */
    public DigitalCollaboration createDigitalCollaboration() {
        return new DigitalCollaboration();
    }

    /**
     * Create an instance of {@link DigitalServiceType }
     * 
     */
    public DigitalServiceType createDigitalServiceType() {
        return new DigitalServiceType();
    }

    /**
     * Create an instance of {@link DocumentMetadataType }
     * 
     */
    public DocumentMetadataType createDocumentMetadataType() {
        return new DocumentMetadataType();
    }

    /**
     * Create an instance of {@link MessageDeliveryType }
     * 
     */
    public MessageDeliveryType createMessageDeliveryType() {
        return new MessageDeliveryType();
    }

    /**
     * Create an instance of {@link DigitalProcess }
     * 
     */
    public DigitalProcess createDigitalProcess() {
        return new DigitalProcess();
    }

    /**
     * Create an instance of {@link DimensionType }
     * 
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link TenderRequirementType }
     * 
     */
    public TenderRequirementType createTenderRequirementType() {
        return new TenderRequirementType();
    }

    /**
     * Create an instance of {@link EconomicOperatorParty }
     * 
     */
    public EconomicOperatorParty createEconomicOperatorParty() {
        return new EconomicOperatorParty();
    }

    /**
     * Create an instance of {@link EconomicOperatorRole }
     * 
     */
    public EconomicOperatorRole createEconomicOperatorRole() {
        return new EconomicOperatorRole();
    }

    /**
     * Create an instance of {@link RoleDescription }
     * 
     */
    public RoleDescription createRoleDescription() {
        return new RoleDescription();
    }

    /**
     * Create an instance of {@link EconomicOperatorShortList }
     * 
     */
    public EconomicOperatorShortList createEconomicOperatorShortList() {
        return new EconomicOperatorShortList();
    }

    /**
     * Create an instance of {@link LimitationDescription }
     * 
     */
    public LimitationDescription createLimitationDescription() {
        return new LimitationDescription();
    }

    /**
     * Create an instance of {@link ExpectedQuantity }
     * 
     */
    public ExpectedQuantity createExpectedQuantity() {
        return new ExpectedQuantity();
    }

    /**
     * Create an instance of {@link MaximumQuantity }
     * 
     */
    public MaximumQuantity createMaximumQuantity() {
        return new MaximumQuantity();
    }

    /**
     * Create an instance of {@link MinimumQuantity }
     * 
     */
    public MinimumQuantity createMinimumQuantity() {
        return new MinimumQuantity();
    }

    /**
     * Create an instance of {@link EndorsementType }
     * 
     */
    public EndorsementType createEndorsementType() {
        return new EndorsementType();
    }

    /**
     * Create an instance of {@link EmissionCalculationMethod }
     * 
     */
    public EmissionCalculationMethod createEmissionCalculationMethod() {
        return new EmissionCalculationMethod();
    }

    /**
     * Create an instance of {@link CalculationMethodCode }
     * 
     */
    public CalculationMethodCode createCalculationMethodCode() {
        return new CalculationMethodCode();
    }

    /**
     * Create an instance of {@link FullnessIndicationCode }
     * 
     */
    public FullnessIndicationCode createFullnessIndicationCode() {
        return new FullnessIndicationCode();
    }

    /**
     * Create an instance of {@link EncryptionCertificatePathChain }
     * 
     */
    public EncryptionCertificatePathChain createEncryptionCertificatePathChain() {
        return new EncryptionCertificatePathChain();
    }

    /**
     * Create an instance of {@link URI }
     * 
     */
    public URI createURI() {
        return new URI();
    }

    /**
     * Create an instance of {@link EncryptionDataType }
     * 
     */
    public EncryptionDataType createEncryptionDataType() {
        return new EncryptionDataType();
    }

    /**
     * Create an instance of {@link EncryptionSymmetricAlgorithm }
     * 
     */
    public EncryptionSymmetricAlgorithm createEncryptionSymmetricAlgorithm() {
        return new EncryptionSymmetricAlgorithm();
    }

    /**
     * Create an instance of {@link OID }
     * 
     */
    public OID createOID() {
        return new OID();
    }

    /**
     * Create an instance of {@link EnvironmentalEmission }
     * 
     */
    public EnvironmentalEmission createEnvironmentalEmission() {
        return new EnvironmentalEmission();
    }

    /**
     * Create an instance of {@link EnvironmentalEmissionTypeCode }
     * 
     */
    public EnvironmentalEmissionTypeCode createEnvironmentalEmissionTypeCode() {
        return new EnvironmentalEmissionTypeCode();
    }

    /**
     * Create an instance of {@link ValueMeasure }
     * 
     */
    public ValueMeasure createValueMeasure() {
        return new ValueMeasure();
    }

    /**
     * Create an instance of {@link EvaluationCriterionType }
     * 
     */
    public EvaluationCriterionType createEvaluationCriterionType() {
        return new EvaluationCriterionType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link EventComment }
     * 
     */
    public EventComment createEventComment() {
        return new EventComment();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link EventLineItem }
     * 
     */
    public EventLineItem createEventLineItem() {
        return new EventLineItem();
    }

    /**
     * Create an instance of {@link LineNumberNumeric }
     * 
     */
    public LineNumberNumeric createLineNumberNumeric() {
        return new LineNumberNumeric();
    }

    /**
     * Create an instance of {@link RetailPlannedImpact }
     * 
     */
    public RetailPlannedImpact createRetailPlannedImpact() {
        return new RetailPlannedImpact();
    }

    /**
     * Create an instance of {@link ForecastPurposeCode }
     * 
     */
    public ForecastPurposeCode createForecastPurposeCode() {
        return new ForecastPurposeCode();
    }

    /**
     * Create an instance of {@link ForecastTypeCode }
     * 
     */
    public ForecastTypeCode createForecastTypeCode() {
        return new ForecastTypeCode();
    }

    /**
     * Create an instance of {@link EventTactic }
     * 
     */
    public EventTactic createEventTactic() {
        return new EventTactic();
    }

    /**
     * Create an instance of {@link EventTacticEnumeration }
     * 
     */
    public EventTacticEnumeration createEventTacticEnumeration() {
        return new EventTacticEnumeration();
    }

    /**
     * Create an instance of {@link ConsumerIncentiveTacticTypeCode }
     * 
     */
    public ConsumerIncentiveTacticTypeCode createConsumerIncentiveTacticTypeCode() {
        return new ConsumerIncentiveTacticTypeCode();
    }

    /**
     * Create an instance of {@link DisplayTacticTypeCode }
     * 
     */
    public DisplayTacticTypeCode createDisplayTacticTypeCode() {
        return new DisplayTacticTypeCode();
    }

    /**
     * Create an instance of {@link FeatureTacticTypeCode }
     * 
     */
    public FeatureTacticTypeCode createFeatureTacticTypeCode() {
        return new FeatureTacticTypeCode();
    }

    /**
     * Create an instance of {@link TradeItemPackingLabelingTypeCode }
     * 
     */
    public TradeItemPackingLabelingTypeCode createTradeItemPackingLabelingTypeCode() {
        return new TradeItemPackingLabelingTypeCode();
    }

    /**
     * Create an instance of {@link EvidenceType }
     * 
     */
    public EvidenceType createEvidenceType() {
        return new EvidenceType();
    }

    /**
     * Create an instance of {@link ExceptionCriteriaLine }
     * 
     */
    public ExceptionCriteriaLine createExceptionCriteriaLine() {
        return new ExceptionCriteriaLine();
    }

    /**
     * Create an instance of {@link ThresholdValueComparisonCode }
     * 
     */
    public ThresholdValueComparisonCode createThresholdValueComparisonCode() {
        return new ThresholdValueComparisonCode();
    }

    /**
     * Create an instance of {@link ThresholdQuantity }
     * 
     */
    public ThresholdQuantity createThresholdQuantity() {
        return new ThresholdQuantity();
    }

    /**
     * Create an instance of {@link ExceptionStatusCode }
     * 
     */
    public ExceptionStatusCode createExceptionStatusCode() {
        return new ExceptionStatusCode();
    }

    /**
     * Create an instance of {@link CollaborationPriorityCode }
     * 
     */
    public CollaborationPriorityCode createCollaborationPriorityCode() {
        return new CollaborationPriorityCode();
    }

    /**
     * Create an instance of {@link ExceptionResolutionCode }
     * 
     */
    public ExceptionResolutionCode createExceptionResolutionCode() {
        return new ExceptionResolutionCode();
    }

    /**
     * Create an instance of {@link SupplyChainActivityTypeCode }
     * 
     */
    public SupplyChainActivityTypeCode createSupplyChainActivityTypeCode() {
        return new SupplyChainActivityTypeCode();
    }

    /**
     * Create an instance of {@link PerformanceMetricTypeCode }
     * 
     */
    public PerformanceMetricTypeCode createPerformanceMetricTypeCode() {
        return new PerformanceMetricTypeCode();
    }

    /**
     * Create an instance of {@link ForecastExceptionCriterionLine }
     * 
     */
    public ForecastExceptionCriterionLine createForecastExceptionCriterionLine() {
        return new ForecastExceptionCriterionLine();
    }

    /**
     * Create an instance of {@link ComparisonDataSourceCode }
     * 
     */
    public ComparisonDataSourceCode createComparisonDataSourceCode() {
        return new ComparisonDataSourceCode();
    }

    /**
     * Create an instance of {@link DataSourceCode }
     * 
     */
    public DataSourceCode createDataSourceCode() {
        return new DataSourceCode();
    }

    /**
     * Create an instance of {@link TimeDeltaDaysQuantity }
     * 
     */
    public TimeDeltaDaysQuantity createTimeDeltaDaysQuantity() {
        return new TimeDeltaDaysQuantity();
    }

    /**
     * Create an instance of {@link ExceptionNotificationLine }
     * 
     */
    public ExceptionNotificationLine createExceptionNotificationLine() {
        return new ExceptionNotificationLine();
    }

    /**
     * Create an instance of {@link ResolutionCode }
     * 
     */
    public ResolutionCode createResolutionCode() {
        return new ResolutionCode();
    }

    /**
     * Create an instance of {@link ComparedValueMeasure }
     * 
     */
    public ComparedValueMeasure createComparedValueMeasure() {
        return new ComparedValueMeasure();
    }

    /**
     * Create an instance of {@link SourceValueMeasure }
     * 
     */
    public SourceValueMeasure createSourceValueMeasure() {
        return new SourceValueMeasure();
    }

    /**
     * Create an instance of {@link VarianceQuantity }
     * 
     */
    public VarianceQuantity createVarianceQuantity() {
        return new VarianceQuantity();
    }

    /**
     * Create an instance of {@link ForecastException }
     * 
     */
    public ForecastException createForecastException() {
        return new ForecastException();
    }

    /**
     * Create an instance of {@link ComparisonDataCode }
     * 
     */
    public ComparisonDataCode createComparisonDataCode() {
        return new ComparisonDataCode();
    }

    /**
     * Create an instance of {@link ComparisonForecastIssueTime }
     * 
     */
    public ComparisonForecastIssueTime createComparisonForecastIssueTime() {
        return new ComparisonForecastIssueTime();
    }

    /**
     * Create an instance of {@link ComparisonForecastIssueDate }
     * 
     */
    public ComparisonForecastIssueDate createComparisonForecastIssueDate() {
        return new ComparisonForecastIssueDate();
    }

    /**
     * Create an instance of {@link ExternalReference }
     * 
     */
    public ExternalReference createExternalReference() {
        return new ExternalReference();
    }

    /**
     * Create an instance of {@link DocumentHash }
     * 
     */
    public DocumentHash createDocumentHash() {
        return new DocumentHash();
    }

    /**
     * Create an instance of {@link HashAlgorithmMethod }
     * 
     */
    public HashAlgorithmMethod createHashAlgorithmMethod() {
        return new HashAlgorithmMethod();
    }

    /**
     * Create an instance of {@link ExpiryTime }
     * 
     */
    public ExpiryTime createExpiryTime() {
        return new ExpiryTime();
    }

    /**
     * Create an instance of {@link MimeCode }
     * 
     */
    public MimeCode createMimeCode() {
        return new MimeCode();
    }

    /**
     * Create an instance of {@link FormatCode }
     * 
     */
    public FormatCode createFormatCode() {
        return new FormatCode();
    }

    /**
     * Create an instance of {@link EncodingCode }
     * 
     */
    public EncodingCode createEncodingCode() {
        return new EncodingCode();
    }

    /**
     * Create an instance of {@link CharacterSetCode }
     * 
     */
    public CharacterSetCode createCharacterSetCode() {
        return new CharacterSetCode();
    }

    /**
     * Create an instance of {@link FileName }
     * 
     */
    public FileName createFileName() {
        return new FileName();
    }

    /**
     * Create an instance of {@link FinancialGuaranteeType }
     * 
     */
    public FinancialGuaranteeType createFinancialGuaranteeType() {
        return new FinancialGuaranteeType();
    }

    /**
     * Create an instance of {@link FinancialInstitution }
     * 
     */
    public FinancialInstitution createFinancialInstitution() {
        return new FinancialInstitution();
    }

    /**
     * Create an instance of {@link ForecastLine }
     * 
     */
    public ForecastLine createForecastLine() {
        return new ForecastLine();
    }

    /**
     * Create an instance of {@link FrozenDocumentIndicator }
     * 
     */
    public FrozenDocumentIndicator createFrozenDocumentIndicator() {
        return new FrozenDocumentIndicator();
    }

    /**
     * Create an instance of {@link SalesItem }
     * 
     */
    public SalesItem createSalesItem() {
        return new SalesItem();
    }

    /**
     * Create an instance of {@link ForecastRevisionLine }
     * 
     */
    public ForecastRevisionLine createForecastRevisionLine() {
        return new ForecastRevisionLine();
    }

    /**
     * Create an instance of {@link RevisedForecastLineID }
     * 
     */
    public RevisedForecastLineID createRevisedForecastLineID() {
        return new RevisedForecastLineID();
    }

    /**
     * Create an instance of {@link SourceForecastIssueDate }
     * 
     */
    public SourceForecastIssueDate createSourceForecastIssueDate() {
        return new SourceForecastIssueDate();
    }

    /**
     * Create an instance of {@link SourceForecastIssueTime }
     * 
     */
    public SourceForecastIssueTime createSourceForecastIssueTime() {
        return new SourceForecastIssueTime();
    }

    /**
     * Create an instance of {@link AdjustmentReasonCode }
     * 
     */
    public AdjustmentReasonCode createAdjustmentReasonCode() {
        return new AdjustmentReasonCode();
    }

    /**
     * Create an instance of {@link FrameworkAgreement }
     * 
     */
    public FrameworkAgreement createFrameworkAgreement() {
        return new FrameworkAgreement();
    }

    /**
     * Create an instance of {@link ExpectedOperatorQuantity }
     * 
     */
    public ExpectedOperatorQuantity createExpectedOperatorQuantity() {
        return new ExpectedOperatorQuantity();
    }

    /**
     * Create an instance of {@link MaximumOperatorQuantity }
     * 
     */
    public MaximumOperatorQuantity createMaximumOperatorQuantity() {
        return new MaximumOperatorQuantity();
    }

    /**
     * Create an instance of {@link Justification }
     * 
     */
    public Justification createJustification() {
        return new Justification();
    }

    /**
     * Create an instance of {@link Frequency }
     * 
     */
    public Frequency createFrequency() {
        return new Frequency();
    }

    /**
     * Create an instance of {@link EstimatedMaximumValueAmount }
     * 
     */
    public EstimatedMaximumValueAmount createEstimatedMaximumValueAmount() {
        return new EstimatedMaximumValueAmount();
    }

    /**
     * Create an instance of {@link MaximumValueAmount }
     * 
     */
    public MaximumValueAmount createMaximumValueAmount() {
        return new MaximumValueAmount();
    }

    /**
     * Create an instance of {@link FuelConsumption }
     * 
     */
    public FuelConsumption createFuelConsumption() {
        return new FuelConsumption();
    }

    /**
     * Create an instance of {@link FuelTypeCode }
     * 
     */
    public FuelTypeCode createFuelTypeCode() {
        return new FuelTypeCode();
    }

    /**
     * Create an instance of {@link FuelType }
     * 
     */
    public FuelType createFuelType() {
        return new FuelType();
    }

    /**
     * Create an instance of {@link FuelConsumptionMeasure }
     * 
     */
    public FuelConsumptionMeasure createFuelConsumptionMeasure() {
        return new FuelConsumptionMeasure();
    }

    /**
     * Create an instance of {@link FuelMetering }
     * 
     */
    public FuelMetering createFuelMetering() {
        return new FuelMetering();
    }

    /**
     * Create an instance of {@link TypeID }
     * 
     */
    public TypeID createTypeID() {
        return new TypeID();
    }

    /**
     * Create an instance of {@link GoodsItemContainer }
     * 
     */
    public GoodsItemContainer createGoodsItemContainer() {
        return new GoodsItemContainer();
    }

    /**
     * Create an instance of {@link GoodsItemPassportCounterfoil }
     * 
     */
    public GoodsItemPassportCounterfoil createGoodsItemPassportCounterfoil() {
        return new GoodsItemPassportCounterfoil();
    }

    /**
     * Create an instance of {@link GoodsItemPassportID }
     * 
     */
    public GoodsItemPassportID createGoodsItemPassportID() {
        return new GoodsItemPassportID();
    }

    /**
     * Create an instance of {@link FinalReexportationDate }
     * 
     */
    public FinalReexportationDate createFinalReexportationDate() {
        return new FinalReexportationDate();
    }

    /**
     * Create an instance of {@link GoodsProcessingType }
     * 
     */
    public GoodsProcessingType createGoodsProcessingType() {
        return new GoodsProcessingType();
    }

    /**
     * Create an instance of {@link TradingTermsType }
     * 
     */
    public TradingTermsType createTradingTermsType() {
        return new TradingTermsType();
    }

    /**
     * Create an instance of {@link HazardousGoodsTransit }
     * 
     */
    public HazardousGoodsTransit createHazardousGoodsTransit() {
        return new HazardousGoodsTransit();
    }

    /**
     * Create an instance of {@link TransportEmergencyCardCode }
     * 
     */
    public TransportEmergencyCardCode createTransportEmergencyCardCode() {
        return new TransportEmergencyCardCode();
    }

    /**
     * Create an instance of {@link PackingCriteriaCode }
     * 
     */
    public PackingCriteriaCode createPackingCriteriaCode() {
        return new PackingCriteriaCode();
    }

    /**
     * Create an instance of {@link HazardousRegulationCode }
     * 
     */
    public HazardousRegulationCode createHazardousRegulationCode() {
        return new HazardousRegulationCode();
    }

    /**
     * Create an instance of {@link InhalationToxicityZoneCode }
     * 
     */
    public InhalationToxicityZoneCode createInhalationToxicityZoneCode() {
        return new InhalationToxicityZoneCode();
    }

    /**
     * Create an instance of {@link TransportAuthorizationCode }
     * 
     */
    public TransportAuthorizationCode createTransportAuthorizationCode() {
        return new TransportAuthorizationCode();
    }

    /**
     * Create an instance of {@link TransitDescription }
     * 
     */
    public TransitDescription createTransitDescription() {
        return new TransitDescription();
    }

    /**
     * Create an instance of {@link HazardousItem }
     * 
     */
    public HazardousItem createHazardousItem() {
        return new HazardousItem();
    }

    /**
     * Create an instance of {@link PlacardNotation }
     * 
     */
    public PlacardNotation createPlacardNotation() {
        return new PlacardNotation();
    }

    /**
     * Create an instance of {@link PlacardEndorsement }
     * 
     */
    public PlacardEndorsement createPlacardEndorsement() {
        return new PlacardEndorsement();
    }

    /**
     * Create an instance of {@link AdditionalInformation }
     * 
     */
    public AdditionalInformation createAdditionalInformation() {
        return new AdditionalInformation();
    }

    /**
     * Create an instance of {@link UNDGCode }
     * 
     */
    public UNDGCode createUNDGCode() {
        return new UNDGCode();
    }

    /**
     * Create an instance of {@link UNPackingGroupCode }
     * 
     */
    public UNPackingGroupCode createUNPackingGroupCode() {
        return new UNPackingGroupCode();
    }

    /**
     * Create an instance of {@link UNPackingGroup }
     * 
     */
    public UNPackingGroup createUNPackingGroup() {
        return new UNPackingGroup();
    }

    /**
     * Create an instance of {@link EmergencyProceduresCode }
     * 
     */
    public EmergencyProceduresCode createEmergencyProceduresCode() {
        return new EmergencyProceduresCode();
    }

    /**
     * Create an instance of {@link MedicalFirstAidGuideCode }
     * 
     */
    public MedicalFirstAidGuideCode createMedicalFirstAidGuideCode() {
        return new MedicalFirstAidGuideCode();
    }

    /**
     * Create an instance of {@link TunnelRestrictionCode }
     * 
     */
    public TunnelRestrictionCode createTunnelRestrictionCode() {
        return new TunnelRestrictionCode();
    }

    /**
     * Create an instance of {@link MaritimePollutantCode }
     * 
     */
    public MaritimePollutantCode createMaritimePollutantCode() {
        return new MaritimePollutantCode();
    }

    /**
     * Create an instance of {@link TechnicalName }
     * 
     */
    public TechnicalName createTechnicalName() {
        return new TechnicalName();
    }

    /**
     * Create an instance of {@link CategoryName }
     * 
     */
    public CategoryName createCategoryName() {
        return new CategoryName();
    }

    /**
     * Create an instance of {@link HazardousCategoryCode }
     * 
     */
    public HazardousCategoryCode createHazardousCategoryCode() {
        return new HazardousCategoryCode();
    }

    /**
     * Create an instance of {@link UpperOrangeHazardPlacardID }
     * 
     */
    public UpperOrangeHazardPlacardID createUpperOrangeHazardPlacardID() {
        return new UpperOrangeHazardPlacardID();
    }

    /**
     * Create an instance of {@link LowerOrangeHazardPlacardID }
     * 
     */
    public LowerOrangeHazardPlacardID createLowerOrangeHazardPlacardID() {
        return new LowerOrangeHazardPlacardID();
    }

    /**
     * Create an instance of {@link MarkingID }
     * 
     */
    public MarkingID createMarkingID() {
        return new MarkingID();
    }

    /**
     * Create an instance of {@link HazardClassID }
     * 
     */
    public HazardClassID createHazardClassID() {
        return new HazardClassID();
    }

    /**
     * Create an instance of {@link NetWeightMeasure }
     * 
     */
    public NetWeightMeasure createNetWeightMeasure() {
        return new NetWeightMeasure();
    }

    /**
     * Create an instance of {@link NetVolumeMeasure }
     * 
     */
    public NetVolumeMeasure createNetVolumeMeasure() {
        return new NetVolumeMeasure();
    }

    /**
     * Create an instance of {@link SecondaryHazard }
     * 
     */
    public SecondaryHazard createSecondaryHazard() {
        return new SecondaryHazard();
    }

    /**
     * Create an instance of {@link Extension }
     * 
     */
    public Extension createExtension() {
        return new Extension();
    }

    /**
     * Create an instance of {@link StowageType }
     * 
     */
    public StowageType createStowageType() {
        return new StowageType();
    }

    /**
     * Create an instance of {@link ISPSRequirements }
     * 
     */
    public ISPSRequirements createISPSRequirements() {
        return new ISPSRequirements();
    }

    /**
     * Create an instance of {@link ValidISSCIndicator }
     * 
     */
    public ValidISSCIndicator createValidISSCIndicator() {
        return new ValidISSCIndicator();
    }

    /**
     * Create an instance of {@link ISSCAbsenceReason }
     * 
     */
    public ISSCAbsenceReason createISSCAbsenceReason() {
        return new ISSCAbsenceReason();
    }

    /**
     * Create an instance of {@link ISSCExpiryDate }
     * 
     */
    public ISSCExpiryDate createISSCExpiryDate() {
        return new ISSCExpiryDate();
    }

    /**
     * Create an instance of {@link SSPOnBoardIndicator }
     * 
     */
    public SSPOnBoardIndicator createSSPOnBoardIndicator() {
        return new SSPOnBoardIndicator();
    }

    /**
     * Create an instance of {@link SSPSecurityMeasuresAppliedIndicator }
     * 
     */
    public SSPSecurityMeasuresAppliedIndicator createSSPSecurityMeasuresAppliedIndicator() {
        return new SSPSecurityMeasuresAppliedIndicator();
    }

    /**
     * Create an instance of {@link CurrentOperatingSecurityLevelCode }
     * 
     */
    public CurrentOperatingSecurityLevelCode createCurrentOperatingSecurityLevelCode() {
        return new CurrentOperatingSecurityLevelCode();
    }

    /**
     * Create an instance of {@link AdditionalMattersDescription }
     * 
     */
    public AdditionalMattersDescription createAdditionalMattersDescription() {
        return new AdditionalMattersDescription();
    }

    /**
     * Create an instance of {@link PortCallRecord }
     * 
     */
    public PortCallRecord createPortCallRecord() {
        return new PortCallRecord();
    }

    /**
     * Create an instance of {@link SecurityLevelCode }
     * 
     */
    public SecurityLevelCode createSecurityLevelCode() {
        return new SecurityLevelCode();
    }

    /**
     * Create an instance of {@link ShipToShipActivityRecord }
     * 
     */
    public ShipToShipActivityRecord createShipToShipActivityRecord() {
        return new ShipToShipActivityRecord();
    }

    /**
     * Create an instance of {@link ImmobilizedSecurity }
     * 
     */
    public ImmobilizedSecurity createImmobilizedSecurity() {
        return new ImmobilizedSecurity();
    }

    /**
     * Create an instance of {@link ImmobilizationCertificateID }
     * 
     */
    public ImmobilizationCertificateID createImmobilizationCertificateID() {
        return new ImmobilizationCertificateID();
    }

    /**
     * Create an instance of {@link SecurityID }
     * 
     */
    public SecurityID createSecurityID() {
        return new SecurityID();
    }

    /**
     * Create an instance of {@link FaceValueAmount }
     * 
     */
    public FaceValueAmount createFaceValueAmount() {
        return new FaceValueAmount();
    }

    /**
     * Create an instance of {@link MarketValueAmount }
     * 
     */
    public MarketValueAmount createMarketValueAmount() {
        return new MarketValueAmount();
    }

    /**
     * Create an instance of {@link SharesNumberQuantity }
     * 
     */
    public SharesNumberQuantity createSharesNumberQuantity() {
        return new SharesNumberQuantity();
    }

    /**
     * Create an instance of {@link InstructionForReturnsLine }
     * 
     */
    public InstructionForReturnsLine createInstructionForReturnsLine() {
        return new InstructionForReturnsLine();
    }

    /**
     * Create an instance of {@link ProcurementProjectLotType }
     * 
     */
    public ProcurementProjectLotType createProcurementProjectLotType() {
        return new ProcurementProjectLotType();
    }

    /**
     * Create an instance of {@link InventoryReportLine }
     * 
     */
    public InventoryReportLine createInventoryReportLine() {
        return new InventoryReportLine();
    }

    /**
     * Create an instance of {@link InventoryValueAmount }
     * 
     */
    public InventoryValueAmount createInventoryValueAmount() {
        return new InventoryValueAmount();
    }

    /**
     * Create an instance of {@link AvailabilityDate }
     * 
     */
    public AvailabilityDate createAvailabilityDate() {
        return new AvailabilityDate();
    }

    /**
     * Create an instance of {@link AvailabilityStatusCode }
     * 
     */
    public AvailabilityStatusCode createAvailabilityStatusCode() {
        return new AvailabilityStatusCode();
    }

    /**
     * Create an instance of {@link InvoiceLineType }
     * 
     */
    public InvoiceLineType createInvoiceLineType() {
        return new InvoiceLineType();
    }

    /**
     * Create an instance of {@link ItemInformationRequestLine }
     * 
     */
    public ItemInformationRequestLine createItemInformationRequestLine() {
        return new ItemInformationRequestLine();
    }

    /**
     * Create an instance of {@link TimeFrequencyCode }
     * 
     */
    public TimeFrequencyCode createTimeFrequencyCode() {
        return new TimeFrequencyCode();
    }

    /**
     * Create an instance of {@link ItemInstance }
     * 
     */
    public ItemInstance createItemInstance() {
        return new ItemInstance();
    }

    /**
     * Create an instance of {@link ProductTraceID }
     * 
     */
    public ProductTraceID createProductTraceID() {
        return new ProductTraceID();
    }

    /**
     * Create an instance of {@link ManufactureDate }
     * 
     */
    public ManufactureDate createManufactureDate() {
        return new ManufactureDate();
    }

    /**
     * Create an instance of {@link ManufactureTime }
     * 
     */
    public ManufactureTime createManufactureTime() {
        return new ManufactureTime();
    }

    /**
     * Create an instance of {@link BestBeforeDate }
     * 
     */
    public BestBeforeDate createBestBeforeDate() {
        return new BestBeforeDate();
    }

    /**
     * Create an instance of {@link RegistrationID }
     * 
     */
    public RegistrationID createRegistrationID() {
        return new RegistrationID();
    }

    /**
     * Create an instance of {@link SerialID }
     * 
     */
    public SerialID createSerialID() {
        return new SerialID();
    }

    /**
     * Create an instance of {@link LotIdentification }
     * 
     */
    public LotIdentification createLotIdentification() {
        return new LotIdentification();
    }

    /**
     * Create an instance of {@link LotNumberID }
     * 
     */
    public LotNumberID createLotNumberID() {
        return new LotNumberID();
    }

    /**
     * Create an instance of {@link ItemManagementProfile }
     * 
     */
    public ItemManagementProfile createItemManagementProfile() {
        return new ItemManagementProfile();
    }

    /**
     * Create an instance of {@link FrozenPeriodDaysNumeric }
     * 
     */
    public FrozenPeriodDaysNumeric createFrozenPeriodDaysNumeric() {
        return new FrozenPeriodDaysNumeric();
    }

    /**
     * Create an instance of {@link MinimumInventoryQuantity }
     * 
     */
    public MinimumInventoryQuantity createMinimumInventoryQuantity() {
        return new MinimumInventoryQuantity();
    }

    /**
     * Create an instance of {@link MultipleOrderQuantity }
     * 
     */
    public MultipleOrderQuantity createMultipleOrderQuantity() {
        return new MultipleOrderQuantity();
    }

    /**
     * Create an instance of {@link OrderIntervalDaysNumeric }
     * 
     */
    public OrderIntervalDaysNumeric createOrderIntervalDaysNumeric() {
        return new OrderIntervalDaysNumeric();
    }

    /**
     * Create an instance of {@link ReplenishmentOwnerDescription }
     * 
     */
    public ReplenishmentOwnerDescription createReplenishmentOwnerDescription() {
        return new ReplenishmentOwnerDescription();
    }

    /**
     * Create an instance of {@link TargetServicePercent }
     * 
     */
    public TargetServicePercent createTargetServicePercent() {
        return new TargetServicePercent();
    }

    /**
     * Create an instance of {@link TargetInventoryQuantity }
     * 
     */
    public TargetInventoryQuantity createTargetInventoryQuantity() {
        return new TargetInventoryQuantity();
    }

    /**
     * Create an instance of {@link PriceExtensionType }
     * 
     */
    public PriceExtensionType createPriceExtensionType() {
        return new PriceExtensionType();
    }

    /**
     * Create an instance of {@link ItemPropertyGroup }
     * 
     */
    public ItemPropertyGroup createItemPropertyGroup() {
        return new ItemPropertyGroup();
    }

    /**
     * Create an instance of {@link ImportanceCode }
     * 
     */
    public ImportanceCode createImportanceCode() {
        return new ImportanceCode();
    }

    /**
     * Create an instance of {@link ItemPropertyRange }
     * 
     */
    public ItemPropertyRange createItemPropertyRange() {
        return new ItemPropertyRange();
    }

    /**
     * Create an instance of {@link MinimumValue }
     * 
     */
    public MinimumValue createMinimumValue() {
        return new MinimumValue();
    }

    /**
     * Create an instance of {@link MaximumValue }
     * 
     */
    public MaximumValue createMaximumValue() {
        return new MaximumValue();
    }

    /**
     * Create an instance of {@link Legislation }
     * 
     */
    public Legislation createLegislation() {
        return new Legislation();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link JurisdictionLevel }
     * 
     */
    public JurisdictionLevel createJurisdictionLevel() {
        return new JurisdictionLevel();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link LineResponse }
     * 
     */
    public LineResponse createLineResponse() {
        return new LineResponse();
    }

    /**
     * Create an instance of {@link LocationCoordinate }
     * 
     */
    public LocationCoordinate createLocationCoordinate() {
        return new LocationCoordinate();
    }

    /**
     * Create an instance of {@link CoordinateSystemCode }
     * 
     */
    public CoordinateSystemCode createCoordinateSystemCode() {
        return new CoordinateSystemCode();
    }

    /**
     * Create an instance of {@link LatitudeDegreesMeasure }
     * 
     */
    public LatitudeDegreesMeasure createLatitudeDegreesMeasure() {
        return new LatitudeDegreesMeasure();
    }

    /**
     * Create an instance of {@link LatitudeMinutesMeasure }
     * 
     */
    public LatitudeMinutesMeasure createLatitudeMinutesMeasure() {
        return new LatitudeMinutesMeasure();
    }

    /**
     * Create an instance of {@link LatitudeDirectionCode }
     * 
     */
    public LatitudeDirectionCode createLatitudeDirectionCode() {
        return new LatitudeDirectionCode();
    }

    /**
     * Create an instance of {@link LatitudeDirectionCodeType }
     * 
     */
    public LatitudeDirectionCodeType createLatitudeDirectionCodeType() {
        return new LatitudeDirectionCodeType();
    }

    /**
     * Create an instance of {@link LongitudeDegreesMeasure }
     * 
     */
    public LongitudeDegreesMeasure createLongitudeDegreesMeasure() {
        return new LongitudeDegreesMeasure();
    }

    /**
     * Create an instance of {@link LongitudeMinutesMeasure }
     * 
     */
    public LongitudeMinutesMeasure createLongitudeMinutesMeasure() {
        return new LongitudeMinutesMeasure();
    }

    /**
     * Create an instance of {@link LongitudeDirectionCode }
     * 
     */
    public LongitudeDirectionCode createLongitudeDirectionCode() {
        return new LongitudeDirectionCode();
    }

    /**
     * Create an instance of {@link LongitudeDirectionCodeType }
     * 
     */
    public LongitudeDirectionCodeType createLongitudeDirectionCodeType() {
        return new LongitudeDirectionCodeType();
    }

    /**
     * Create an instance of {@link AltitudeMeasure }
     * 
     */
    public AltitudeMeasure createAltitudeMeasure() {
        return new AltitudeMeasure();
    }

    /**
     * Create an instance of {@link LotDistribution }
     * 
     */
    public LotDistribution createLotDistribution() {
        return new LotDistribution();
    }

    /**
     * Create an instance of {@link MaximumLotsAwardedNumeric }
     * 
     */
    public MaximumLotsAwardedNumeric createMaximumLotsAwardedNumeric() {
        return new MaximumLotsAwardedNumeric();
    }

    /**
     * Create an instance of {@link MaximumLotsSubmittedNumeric }
     * 
     */
    public MaximumLotsSubmittedNumeric createMaximumLotsSubmittedNumeric() {
        return new MaximumLotsSubmittedNumeric();
    }

    /**
     * Create an instance of {@link GroupingLots }
     * 
     */
    public GroupingLots createGroupingLots() {
        return new GroupingLots();
    }

    /**
     * Create an instance of {@link LotsGroup }
     * 
     */
    public LotsGroup createLotsGroup() {
        return new LotsGroup();
    }

    /**
     * Create an instance of {@link LotsGroupID }
     * 
     */
    public LotsGroupID createLotsGroupID() {
        return new LotsGroupID();
    }

    /**
     * Create an instance of {@link ProcurementProjectLotReference }
     * 
     */
    public ProcurementProjectLotReference createProcurementProjectLotReference() {
        return new ProcurementProjectLotReference();
    }

    /**
     * Create an instance of {@link ShipmentStageType }
     * 
     */
    public ShipmentStageType createShipmentStageType() {
        return new ShipmentStageType();
    }

    /**
     * Create an instance of {@link OnAccountPaymentType }
     * 
     */
    public OnAccountPaymentType createOnAccountPaymentType() {
        return new OnAccountPaymentType();
    }

    /**
     * Create an instance of {@link MaritimeHealthDeclaration }
     * 
     */
    public MaritimeHealthDeclaration createMaritimeHealthDeclaration() {
        return new MaritimeHealthDeclaration();
    }

    /**
     * Create an instance of {@link InfectiousDiseaseCaseOnBoardIndicator }
     * 
     */
    public InfectiousDiseaseCaseOnBoardIndicator createInfectiousDiseaseCaseOnBoardIndicator() {
        return new InfectiousDiseaseCaseOnBoardIndicator();
    }

    /**
     * Create an instance of {@link MoreIllThanExpectedIndicator }
     * 
     */
    public MoreIllThanExpectedIndicator createMoreIllThanExpectedIndicator() {
        return new MoreIllThanExpectedIndicator();
    }

    /**
     * Create an instance of {@link MedicalPractitionerConsultedIndicator }
     * 
     */
    public MedicalPractitionerConsultedIndicator createMedicalPractitionerConsultedIndicator() {
        return new MedicalPractitionerConsultedIndicator();
    }

    /**
     * Create an instance of {@link StowawaysFoundOnBoardIndicator }
     * 
     */
    public StowawaysFoundOnBoardIndicator createStowawaysFoundOnBoardIndicator() {
        return new StowawaysFoundOnBoardIndicator();
    }

    /**
     * Create an instance of {@link SickAnimalOnBoardIndicator }
     * 
     */
    public SickAnimalOnBoardIndicator createSickAnimalOnBoardIndicator() {
        return new SickAnimalOnBoardIndicator();
    }

    /**
     * Create an instance of {@link FumigatedCargoTransportIndicator }
     * 
     */
    public FumigatedCargoTransportIndicator createFumigatedCargoTransportIndicator() {
        return new FumigatedCargoTransportIndicator();
    }

    /**
     * Create an instance of {@link SanitaryMeasuresAppliedIndicator }
     * 
     */
    public SanitaryMeasuresAppliedIndicator createSanitaryMeasuresAppliedIndicator() {
        return new SanitaryMeasuresAppliedIndicator();
    }

    /**
     * Create an instance of {@link ValidSanitationCertificateOnBoardIndicator }
     * 
     */
    public ValidSanitationCertificateOnBoardIndicator createValidSanitationCertificateOnBoardIndicator() {
        return new ValidSanitationCertificateOnBoardIndicator();
    }

    /**
     * Create an instance of {@link ReinspectionRequiredIndicator }
     * 
     */
    public ReinspectionRequiredIndicator createReinspectionRequiredIndicator() {
        return new ReinspectionRequiredIndicator();
    }

    /**
     * Create an instance of {@link TotalDeadPersonQuantity }
     * 
     */
    public TotalDeadPersonQuantity createTotalDeadPersonQuantity() {
        return new TotalDeadPersonQuantity();
    }

    /**
     * Create an instance of {@link TotalIllPersonQuantity }
     * 
     */
    public TotalIllPersonQuantity createTotalIllPersonQuantity() {
        return new TotalIllPersonQuantity();
    }

    /**
     * Create an instance of {@link SickAnimalDescription }
     * 
     */
    public SickAnimalDescription createSickAnimalDescription() {
        return new SickAnimalDescription();
    }

    /**
     * Create an instance of {@link StowawayDescription }
     * 
     */
    public StowawayDescription createStowawayDescription() {
        return new StowawayDescription();
    }

    /**
     * Create an instance of {@link LastDrinkingWaterAnalysisDate }
     * 
     */
    public LastDrinkingWaterAnalysisDate createLastDrinkingWaterAnalysisDate() {
        return new LastDrinkingWaterAnalysisDate();
    }

    /**
     * Create an instance of {@link WHOAffectedAreaVisit }
     * 
     */
    public WHOAffectedAreaVisit createWHOAffectedAreaVisit() {
        return new WHOAffectedAreaVisit();
    }

    /**
     * Create an instance of {@link VisitDate }
     * 
     */
    public VisitDate createVisitDate() {
        return new VisitDate();
    }

    /**
     * Create an instance of {@link PersonnelHealthIncident }
     * 
     */
    public PersonnelHealthIncident createPersonnelHealthIncident() {
        return new PersonnelHealthIncident();
    }

    /**
     * Create an instance of {@link JoinedShipDate }
     * 
     */
    public JoinedShipDate createJoinedShipDate() {
        return new JoinedShipDate();
    }

    /**
     * Create an instance of {@link NatureOfIllnessDescription }
     * 
     */
    public NatureOfIllnessDescription createNatureOfIllnessDescription() {
        return new NatureOfIllnessDescription();
    }

    /**
     * Create an instance of {@link OnsetDate }
     * 
     */
    public OnsetDate createOnsetDate() {
        return new OnsetDate();
    }

    /**
     * Create an instance of {@link ReportedToMedicalOfficerIndicator }
     * 
     */
    public ReportedToMedicalOfficerIndicator createReportedToMedicalOfficerIndicator() {
        return new ReportedToMedicalOfficerIndicator();
    }

    /**
     * Create an instance of {@link GivenTreatmentDescription }
     * 
     */
    public GivenTreatmentDescription createGivenTreatmentDescription() {
        return new GivenTreatmentDescription();
    }

    /**
     * Create an instance of {@link StillIllIndicator }
     * 
     */
    public StillIllIndicator createStillIllIndicator() {
        return new StillIllIndicator();
    }

    /**
     * Create an instance of {@link DiedIndicator }
     * 
     */
    public DiedIndicator createDiedIndicator() {
        return new DiedIndicator();
    }

    /**
     * Create an instance of {@link StillOnBoardIndicator }
     * 
     */
    public StillOnBoardIndicator createStillOnBoardIndicator() {
        return new StillOnBoardIndicator();
    }

    /**
     * Create an instance of {@link EvacuatedIndicator }
     * 
     */
    public EvacuatedIndicator createEvacuatedIndicator() {
        return new EvacuatedIndicator();
    }

    /**
     * Create an instance of {@link BuriedAtSeaIndicator }
     * 
     */
    public BuriedAtSeaIndicator createBuriedAtSeaIndicator() {
        return new BuriedAtSeaIndicator();
    }

    /**
     * Create an instance of {@link SanitaryMeasure }
     * 
     */
    public SanitaryMeasure createSanitaryMeasure() {
        return new SanitaryMeasure();
    }

    /**
     * Create an instance of {@link SanitaryMeasureTypeCode }
     * 
     */
    public SanitaryMeasureTypeCode createSanitaryMeasureTypeCode() {
        return new SanitaryMeasureTypeCode();
    }

    /**
     * Create an instance of {@link ApplicationDate }
     * 
     */
    public ApplicationDate createApplicationDate() {
        return new ApplicationDate();
    }

    /**
     * Create an instance of {@link MaritimeTransport }
     * 
     */
    public MaritimeTransport createMaritimeTransport() {
        return new MaritimeTransport();
    }

    /**
     * Create an instance of {@link VesselID }
     * 
     */
    public VesselID createVesselID() {
        return new VesselID();
    }

    /**
     * Create an instance of {@link VesselName }
     * 
     */
    public VesselName createVesselName() {
        return new VesselName();
    }

    /**
     * Create an instance of {@link RadioCallSignID }
     * 
     */
    public RadioCallSignID createRadioCallSignID() {
        return new RadioCallSignID();
    }

    /**
     * Create an instance of {@link MMSIRegistrationID }
     * 
     */
    public MMSIRegistrationID createMMSIRegistrationID() {
        return new MMSIRegistrationID();
    }

    /**
     * Create an instance of {@link ShipsRequirements }
     * 
     */
    public ShipsRequirements createShipsRequirements() {
        return new ShipsRequirements();
    }

    /**
     * Create an instance of {@link GrossTonnageMeasure }
     * 
     */
    public GrossTonnageMeasure createGrossTonnageMeasure() {
        return new GrossTonnageMeasure();
    }

    /**
     * Create an instance of {@link NetTonnageMeasure }
     * 
     */
    public NetTonnageMeasure createNetTonnageMeasure() {
        return new NetTonnageMeasure();
    }

    /**
     * Create an instance of {@link SegregatedBallastMeasure }
     * 
     */
    public SegregatedBallastMeasure createSegregatedBallastMeasure() {
        return new SegregatedBallastMeasure();
    }

    /**
     * Create an instance of {@link ShipConfigurationCode }
     * 
     */
    public ShipConfigurationCode createShipConfigurationCode() {
        return new ShipConfigurationCode();
    }

    /**
     * Create an instance of {@link INFShipClassCode }
     * 
     */
    public INFShipClassCode createINFShipClassCode() {
        return new INFShipClassCode();
    }

    /**
     * Create an instance of {@link AntennaLocus }
     * 
     */
    public AntennaLocus createAntennaLocus() {
        return new AntennaLocus();
    }

    /**
     * Create an instance of {@link VesselDynamics }
     * 
     */
    public VesselDynamics createVesselDynamics() {
        return new VesselDynamics();
    }

    /**
     * Create an instance of {@link NavigationStatusCode }
     * 
     */
    public NavigationStatusCode createNavigationStatusCode() {
        return new NavigationStatusCode();
    }

    /**
     * Create an instance of {@link AtAnchorageIndicator }
     * 
     */
    public AtAnchorageIndicator createAtAnchorageIndicator() {
        return new AtAnchorageIndicator();
    }

    /**
     * Create an instance of {@link CourseOverGroundDirection }
     * 
     */
    public CourseOverGroundDirection createCourseOverGroundDirection() {
        return new CourseOverGroundDirection();
    }

    /**
     * Create an instance of {@link SpeedOverGroundMeasure }
     * 
     */
    public SpeedOverGroundMeasure createSpeedOverGroundMeasure() {
        return new SpeedOverGroundMeasure();
    }

    /**
     * Create an instance of {@link RateOfTurnMeasure }
     * 
     */
    public RateOfTurnMeasure createRateOfTurnMeasure() {
        return new RateOfTurnMeasure();
    }

    /**
     * Create an instance of {@link MaritimeWaste }
     * 
     */
    public MaritimeWaste createMaritimeWaste() {
        return new MaritimeWaste();
    }

    /**
     * Create an instance of {@link WasteTypeCode }
     * 
     */
    public WasteTypeCode createWasteTypeCode() {
        return new WasteTypeCode();
    }

    /**
     * Create an instance of {@link ToBeDeliveredMeasure }
     * 
     */
    public ToBeDeliveredMeasure createToBeDeliveredMeasure() {
        return new ToBeDeliveredMeasure();
    }

    /**
     * Create an instance of {@link RetainedOnBoardMeasure }
     * 
     */
    public RetainedOnBoardMeasure createRetainedOnBoardMeasure() {
        return new RetainedOnBoardMeasure();
    }

    /**
     * Create an instance of {@link MaxDedicatedStorageCapacityMeasure }
     * 
     */
    public MaxDedicatedStorageCapacityMeasure createMaxDedicatedStorageCapacityMeasure() {
        return new MaxDedicatedStorageCapacityMeasure();
    }

    /**
     * Create an instance of {@link EstimatedGeneratedUntilNextPortMeasure }
     * 
     */
    public EstimatedGeneratedUntilNextPortMeasure createEstimatedGeneratedUntilNextPortMeasure() {
        return new EstimatedGeneratedUntilNextPortMeasure();
    }

    /**
     * Create an instance of {@link MeterType }
     * 
     */
    public MeterType createMeterType() {
        return new MeterType();
    }

    /**
     * Create an instance of {@link MeterProperty }
     * 
     */
    public MeterProperty createMeterProperty() {
        return new MeterProperty();
    }

    /**
     * Create an instance of {@link NameCode }
     * 
     */
    public NameCode createNameCode() {
        return new NameCode();
    }

    /**
     * Create an instance of {@link ValueQuantity }
     * 
     */
    public ValueQuantity createValueQuantity() {
        return new ValueQuantity();
    }

    /**
     * Create an instance of {@link ValueQualifier }
     * 
     */
    public ValueQualifier createValueQualifier() {
        return new ValueQualifier();
    }

    /**
     * Create an instance of {@link MeterReading }
     * 
     */
    public MeterReading createMeterReading() {
        return new MeterReading();
    }

    /**
     * Create an instance of {@link MeterReadingType }
     * 
     */
    public MeterReadingType createMeterReadingType() {
        return new MeterReadingType();
    }

    /**
     * Create an instance of {@link MeterReadingTypeCode }
     * 
     */
    public MeterReadingTypeCode createMeterReadingTypeCode() {
        return new MeterReadingTypeCode();
    }

    /**
     * Create an instance of {@link PreviousMeterReadingDate }
     * 
     */
    public PreviousMeterReadingDate createPreviousMeterReadingDate() {
        return new PreviousMeterReadingDate();
    }

    /**
     * Create an instance of {@link PreviousMeterQuantity }
     * 
     */
    public PreviousMeterQuantity createPreviousMeterQuantity() {
        return new PreviousMeterQuantity();
    }

    /**
     * Create an instance of {@link LatestMeterReadingDate }
     * 
     */
    public LatestMeterReadingDate createLatestMeterReadingDate() {
        return new LatestMeterReadingDate();
    }

    /**
     * Create an instance of {@link LatestMeterQuantity }
     * 
     */
    public LatestMeterQuantity createLatestMeterQuantity() {
        return new LatestMeterQuantity();
    }

    /**
     * Create an instance of {@link PreviousMeterReadingMethod }
     * 
     */
    public PreviousMeterReadingMethod createPreviousMeterReadingMethod() {
        return new PreviousMeterReadingMethod();
    }

    /**
     * Create an instance of {@link PreviousMeterReadingMethodCode }
     * 
     */
    public PreviousMeterReadingMethodCode createPreviousMeterReadingMethodCode() {
        return new PreviousMeterReadingMethodCode();
    }

    /**
     * Create an instance of {@link LatestMeterReadingMethod }
     * 
     */
    public LatestMeterReadingMethod createLatestMeterReadingMethod() {
        return new LatestMeterReadingMethod();
    }

    /**
     * Create an instance of {@link LatestMeterReadingMethodCode }
     * 
     */
    public LatestMeterReadingMethodCode createLatestMeterReadingMethodCode() {
        return new LatestMeterReadingMethodCode();
    }

    /**
     * Create an instance of {@link MeterReadingComments }
     * 
     */
    public MeterReadingComments createMeterReadingComments() {
        return new MeterReadingComments();
    }

    /**
     * Create an instance of {@link DeliveredQuantity }
     * 
     */
    public DeliveredQuantity createDeliveredQuantity() {
        return new DeliveredQuantity();
    }

    /**
     * Create an instance of {@link MiscellaneousEvent }
     * 
     */
    public MiscellaneousEvent createMiscellaneousEvent() {
        return new MiscellaneousEvent();
    }

    /**
     * Create an instance of {@link MiscellaneousEventTypeCode }
     * 
     */
    public MiscellaneousEventTypeCode createMiscellaneousEventTypeCode() {
        return new MiscellaneousEventTypeCode();
    }

    /**
     * Create an instance of {@link NoticeSubType }
     * 
     */
    public NoticeSubType createNoticeSubType() {
        return new NoticeSubType();
    }

    /**
     * Create an instance of {@link SubTypeCode }
     * 
     */
    public SubTypeCode createSubTypeCode() {
        return new SubTypeCode();
    }

    /**
     * Create an instance of {@link SubTypeDescription }
     * 
     */
    public SubTypeDescription createSubTypeDescription() {
        return new SubTypeDescription();
    }

    /**
     * Create an instance of {@link NotificationRequirement }
     * 
     */
    public NotificationRequirement createNotificationRequirement() {
        return new NotificationRequirement();
    }

    /**
     * Create an instance of {@link NotificationTypeCode }
     * 
     */
    public NotificationTypeCode createNotificationTypeCode() {
        return new NotificationTypeCode();
    }

    /**
     * Create an instance of {@link PostEventNotificationDurationMeasure }
     * 
     */
    public PostEventNotificationDurationMeasure createPostEventNotificationDurationMeasure() {
        return new PostEventNotificationDurationMeasure();
    }

    /**
     * Create an instance of {@link PreEventNotificationDurationMeasure }
     * 
     */
    public PreEventNotificationDurationMeasure createPreEventNotificationDurationMeasure() {
        return new PreEventNotificationDurationMeasure();
    }

    /**
     * Create an instance of {@link OperationType }
     * 
     */
    public OperationType createOperationType() {
        return new OperationType();
    }

    /**
     * Create an instance of {@link Code }
     * 
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link OrderedShipment }
     * 
     */
    public OrderedShipment createOrderedShipment() {
        return new OrderedShipment();
    }

    /**
     * Create an instance of {@link TransportHandlingUnitType }
     * 
     */
    public TransportHandlingUnitType createTransportHandlingUnitType() {
        return new TransportHandlingUnitType();
    }

    /**
     * Create an instance of {@link ParticipantParty }
     * 
     */
    public ParticipantParty createParticipantParty() {
        return new ParticipantParty();
    }

    /**
     * Create an instance of {@link InitiatingPartyIndicator }
     * 
     */
    public InitiatingPartyIndicator createInitiatingPartyIndicator() {
        return new InitiatingPartyIndicator();
    }

    /**
     * Create an instance of {@link PrivatePartyIndicator }
     * 
     */
    public PrivatePartyIndicator createPrivatePartyIndicator() {
        return new PrivatePartyIndicator();
    }

    /**
     * Create an instance of {@link PublicPartyIndicator }
     * 
     */
    public PublicPartyIndicator createPublicPartyIndicator() {
        return new PublicPartyIndicator();
    }

    /**
     * Create an instance of {@link ServiceProviderPartyIndicator }
     * 
     */
    public ServiceProviderPartyIndicator createServiceProviderPartyIndicator() {
        return new ServiceProviderPartyIndicator();
    }

    /**
     * Create an instance of {@link PartyIdentification }
     * 
     */
    public PartyIdentification createPartyIdentification() {
        return new PartyIdentification();
    }

    /**
     * Create an instance of {@link PartyLegalEntity }
     * 
     */
    public PartyLegalEntity createPartyLegalEntity() {
        return new PartyLegalEntity();
    }

    /**
     * Create an instance of {@link RegistrationName }
     * 
     */
    public RegistrationName createRegistrationName() {
        return new RegistrationName();
    }

    /**
     * Create an instance of {@link CompanyID }
     * 
     */
    public CompanyID createCompanyID() {
        return new CompanyID();
    }

    /**
     * Create an instance of {@link RegistrationDate }
     * 
     */
    public RegistrationDate createRegistrationDate() {
        return new RegistrationDate();
    }

    /**
     * Create an instance of {@link RegistrationExpirationDate }
     * 
     */
    public RegistrationExpirationDate createRegistrationExpirationDate() {
        return new RegistrationExpirationDate();
    }

    /**
     * Create an instance of {@link CompanyLegalFormCode }
     * 
     */
    public CompanyLegalFormCode createCompanyLegalFormCode() {
        return new CompanyLegalFormCode();
    }

    /**
     * Create an instance of {@link CompanyLegalForm }
     * 
     */
    public CompanyLegalForm createCompanyLegalForm() {
        return new CompanyLegalForm();
    }

    /**
     * Create an instance of {@link SoleProprietorshipIndicator }
     * 
     */
    public SoleProprietorshipIndicator createSoleProprietorshipIndicator() {
        return new SoleProprietorshipIndicator();
    }

    /**
     * Create an instance of {@link CompanyLiquidationStatusCode }
     * 
     */
    public CompanyLiquidationStatusCode createCompanyLiquidationStatusCode() {
        return new CompanyLiquidationStatusCode();
    }

    /**
     * Create an instance of {@link CorporateStockAmount }
     * 
     */
    public CorporateStockAmount createCorporateStockAmount() {
        return new CorporateStockAmount();
    }

    /**
     * Create an instance of {@link FullyPaidSharesIndicator }
     * 
     */
    public FullyPaidSharesIndicator createFullyPaidSharesIndicator() {
        return new FullyPaidSharesIndicator();
    }

    /**
     * Create an instance of {@link ShareholderParty }
     * 
     */
    public ShareholderParty createShareholderParty() {
        return new ShareholderParty();
    }

    /**
     * Create an instance of {@link PartecipationPercent }
     * 
     */
    public PartecipationPercent createPartecipationPercent() {
        return new PartecipationPercent();
    }

    /**
     * Create an instance of {@link PartyName }
     * 
     */
    public PartyName createPartyName() {
        return new PartyName();
    }

    /**
     * Create an instance of {@link PartyTaxScheme }
     * 
     */
    public PartyTaxScheme createPartyTaxScheme() {
        return new PartyTaxScheme();
    }

    /**
     * Create an instance of {@link TaxLevelCode }
     * 
     */
    public TaxLevelCode createTaxLevelCode() {
        return new TaxLevelCode();
    }

    /**
     * Create an instance of {@link ExemptionReasonCode }
     * 
     */
    public ExemptionReasonCode createExemptionReasonCode() {
        return new ExemptionReasonCode();
    }

    /**
     * Create an instance of {@link ExemptionReason }
     * 
     */
    public ExemptionReason createExemptionReason() {
        return new ExemptionReason();
    }

    /**
     * Create an instance of {@link PerformanceDataLine }
     * 
     */
    public PerformanceDataLine createPerformanceDataLine() {
        return new PerformanceDataLine();
    }

    /**
     * Create an instance of {@link PerformanceValueQuantity }
     * 
     */
    public PerformanceValueQuantity createPerformanceValueQuantity() {
        return new PerformanceValueQuantity();
    }

    /**
     * Create an instance of {@link PhysicalAttribute }
     * 
     */
    public PhysicalAttribute createPhysicalAttribute() {
        return new PhysicalAttribute();
    }

    /**
     * Create an instance of {@link PositionCode }
     * 
     */
    public PositionCode createPositionCode() {
        return new PositionCode();
    }

    /**
     * Create an instance of {@link DescriptionCode }
     * 
     */
    public DescriptionCode createDescriptionCode() {
        return new DescriptionCode();
    }

    /**
     * Create an instance of {@link Pickup }
     * 
     */
    public Pickup createPickup() {
        return new Pickup();
    }

    /**
     * Create an instance of {@link ActualPickupDate }
     * 
     */
    public ActualPickupDate createActualPickupDate() {
        return new ActualPickupDate();
    }

    /**
     * Create an instance of {@link ActualPickupTime }
     * 
     */
    public ActualPickupTime createActualPickupTime() {
        return new ActualPickupTime();
    }

    /**
     * Create an instance of {@link EarliestPickupDate }
     * 
     */
    public EarliestPickupDate createEarliestPickupDate() {
        return new EarliestPickupDate();
    }

    /**
     * Create an instance of {@link EarliestPickupTime }
     * 
     */
    public EarliestPickupTime createEarliestPickupTime() {
        return new EarliestPickupTime();
    }

    /**
     * Create an instance of {@link LatestPickupDate }
     * 
     */
    public LatestPickupDate createLatestPickupDate() {
        return new LatestPickupDate();
    }

    /**
     * Create an instance of {@link LatestPickupTime }
     * 
     */
    public LatestPickupTime createLatestPickupTime() {
        return new LatestPickupTime();
    }

    /**
     * Create an instance of {@link PostAwardProcess }
     * 
     */
    public PostAwardProcess createPostAwardProcess() {
        return new PostAwardProcess();
    }

    /**
     * Create an instance of {@link ElectronicCatalogueUsageIndicator }
     * 
     */
    public ElectronicCatalogueUsageIndicator createElectronicCatalogueUsageIndicator() {
        return new ElectronicCatalogueUsageIndicator();
    }

    /**
     * Create an instance of {@link ElectronicInvoiceAcceptedIndicator }
     * 
     */
    public ElectronicInvoiceAcceptedIndicator createElectronicInvoiceAcceptedIndicator() {
        return new ElectronicInvoiceAcceptedIndicator();
    }

    /**
     * Create an instance of {@link ElectronicOrderUsageIndicator }
     * 
     */
    public ElectronicOrderUsageIndicator createElectronicOrderUsageIndicator() {
        return new ElectronicOrderUsageIndicator();
    }

    /**
     * Create an instance of {@link ElectronicPaymentUsageIndicator }
     * 
     */
    public ElectronicPaymentUsageIndicator createElectronicPaymentUsageIndicator() {
        return new ElectronicPaymentUsageIndicator();
    }

    /**
     * Create an instance of {@link PowerOfAttorney }
     * 
     */
    public PowerOfAttorney createPowerOfAttorney() {
        return new PowerOfAttorney();
    }

    /**
     * Create an instance of {@link PriceListType }
     * 
     */
    public PriceListType createPriceListType() {
        return new PriceListType();
    }

    /**
     * Create an instance of {@link PricingReference }
     * 
     */
    public PricingReference createPricingReference() {
        return new PricingReference();
    }

    /**
     * Create an instance of {@link ProcessJustification }
     * 
     */
    public ProcessJustification createProcessJustification() {
        return new ProcessJustification();
    }

    /**
     * Create an instance of {@link PreviousCancellationReasonCode }
     * 
     */
    public PreviousCancellationReasonCode createPreviousCancellationReasonCode() {
        return new PreviousCancellationReasonCode();
    }

    /**
     * Create an instance of {@link ProcessReasonCode }
     * 
     */
    public ProcessReasonCode createProcessReasonCode() {
        return new ProcessReasonCode();
    }

    /**
     * Create an instance of {@link ProcessReason }
     * 
     */
    public ProcessReason createProcessReason() {
        return new ProcessReason();
    }

    /**
     * Create an instance of {@link ProcurementAdditionalType }
     * 
     */
    public ProcurementAdditionalType createProcurementAdditionalType() {
        return new ProcurementAdditionalType();
    }

    /**
     * Create an instance of {@link ProcurementTypeCode }
     * 
     */
    public ProcurementTypeCode createProcurementTypeCode() {
        return new ProcurementTypeCode();
    }

    /**
     * Create an instance of {@link ProcurementType }
     * 
     */
    public ProcurementType createProcurementType() {
        return new ProcurementType();
    }

    /**
     * Create an instance of {@link ProcurementProject }
     * 
     */
    public ProcurementProject createProcurementProject() {
        return new ProcurementProject();
    }

    /**
     * Create an instance of {@link ProcurementSubTypeCode }
     * 
     */
    public ProcurementSubTypeCode createProcurementSubTypeCode() {
        return new ProcurementSubTypeCode();
    }

    /**
     * Create an instance of {@link QualityControlCode }
     * 
     */
    public QualityControlCode createQualityControlCode() {
        return new QualityControlCode();
    }

    /**
     * Create an instance of {@link RequiredFeeAmount }
     * 
     */
    public RequiredFeeAmount createRequiredFeeAmount() {
        return new RequiredFeeAmount();
    }

    /**
     * Create an instance of {@link FeeDescription }
     * 
     */
    public FeeDescription createFeeDescription() {
        return new FeeDescription();
    }

    /**
     * Create an instance of {@link RequestedDeliveryDate }
     * 
     */
    public RequestedDeliveryDate createRequestedDeliveryDate() {
        return new RequestedDeliveryDate();
    }

    /**
     * Create an instance of {@link EstimatedOverallContractQuantity }
     * 
     */
    public EstimatedOverallContractQuantity createEstimatedOverallContractQuantity() {
        return new EstimatedOverallContractQuantity();
    }

    /**
     * Create an instance of {@link SMESuitableIndicator }
     * 
     */
    public SMESuitableIndicator createSMESuitableIndicator() {
        return new SMESuitableIndicator();
    }

    /**
     * Create an instance of {@link RequestedTenderTotal }
     * 
     */
    public RequestedTenderTotal createRequestedTenderTotal() {
        return new RequestedTenderTotal();
    }

    /**
     * Create an instance of {@link EstimatedOverallContractAmount }
     * 
     */
    public EstimatedOverallContractAmount createEstimatedOverallContractAmount() {
        return new EstimatedOverallContractAmount();
    }

    /**
     * Create an instance of {@link EstimatedOverallFrameworkContractsAmount }
     * 
     */
    public EstimatedOverallFrameworkContractsAmount createEstimatedOverallFrameworkContractsAmount() {
        return new EstimatedOverallFrameworkContractsAmount();
    }

    /**
     * Create an instance of {@link TaxIncludedIndicator }
     * 
     */
    public TaxIncludedIndicator createTaxIncludedIndicator() {
        return new TaxIncludedIndicator();
    }

    /**
     * Create an instance of {@link MinimumAmount }
     * 
     */
    public MinimumAmount createMinimumAmount() {
        return new MinimumAmount();
    }

    /**
     * Create an instance of {@link MaximumAmount }
     * 
     */
    public MaximumAmount createMaximumAmount() {
        return new MaximumAmount();
    }

    /**
     * Create an instance of {@link MonetaryScope }
     * 
     */
    public MonetaryScope createMonetaryScope() {
        return new MonetaryScope();
    }

    /**
     * Create an instance of {@link AverageSubsequentContractAmount }
     * 
     */
    public AverageSubsequentContractAmount createAverageSubsequentContractAmount() {
        return new AverageSubsequentContractAmount();
    }

    /**
     * Create an instance of {@link RequestForTenderLineType }
     * 
     */
    public RequestForTenderLineType createRequestForTenderLineType() {
        return new RequestForTenderLineType();
    }

    /**
     * Create an instance of {@link PromotionalEvent }
     * 
     */
    public PromotionalEvent createPromotionalEvent() {
        return new PromotionalEvent();
    }

    /**
     * Create an instance of {@link PromotionalEventTypeCode }
     * 
     */
    public PromotionalEventTypeCode createPromotionalEventTypeCode() {
        return new PromotionalEventTypeCode();
    }

    /**
     * Create an instance of {@link SubmissionDate }
     * 
     */
    public SubmissionDate createSubmissionDate() {
        return new SubmissionDate();
    }

    /**
     * Create an instance of {@link FirstShipmentAvailibilityDate }
     * 
     */
    public FirstShipmentAvailibilityDate createFirstShipmentAvailibilityDate() {
        return new FirstShipmentAvailibilityDate();
    }

    /**
     * Create an instance of {@link LatestProposalAcceptanceDate }
     * 
     */
    public LatestProposalAcceptanceDate createLatestProposalAcceptanceDate() {
        return new LatestProposalAcceptanceDate();
    }

    /**
     * Create an instance of {@link PromotionalSpecification }
     * 
     */
    public PromotionalSpecification createPromotionalSpecification() {
        return new PromotionalSpecification();
    }

    /**
     * Create an instance of {@link SpecificationID }
     * 
     */
    public SpecificationID createSpecificationID() {
        return new SpecificationID();
    }

    /**
     * Create an instance of {@link PromotionalEventLineItem }
     * 
     */
    public PromotionalEventLineItem createPromotionalEventLineItem() {
        return new PromotionalEventLineItem();
    }

    /**
     * Create an instance of {@link PropertyIdentificationType }
     * 
     */
    public PropertyIdentificationType createPropertyIdentificationType() {
        return new PropertyIdentificationType();
    }

    /**
     * Create an instance of {@link PurchaseReceiptLine }
     * 
     */
    public PurchaseReceiptLine createPurchaseReceiptLine() {
        return new PurchaseReceiptLine();
    }

    /**
     * Create an instance of {@link PurchaseReference }
     * 
     */
    public PurchaseReference createPurchaseReference() {
        return new PurchaseReference();
    }

    /**
     * Create an instance of {@link QualificationResolution }
     * 
     */
    public QualificationResolution createQualificationResolution() {
        return new QualificationResolution();
    }

    /**
     * Create an instance of {@link AdmissionCode }
     * 
     */
    public AdmissionCode createAdmissionCode() {
        return new AdmissionCode();
    }

    /**
     * Create an instance of {@link ExclusionReason }
     * 
     */
    public ExclusionReason createExclusionReason() {
        return new ExclusionReason();
    }

    /**
     * Create an instance of {@link Resolution }
     * 
     */
    public Resolution createResolution() {
        return new Resolution();
    }

    /**
     * Create an instance of {@link ResolutionDate }
     * 
     */
    public ResolutionDate createResolutionDate() {
        return new ResolutionDate();
    }

    /**
     * Create an instance of {@link ResolutionTime }
     * 
     */
    public ResolutionTime createResolutionTime() {
        return new ResolutionTime();
    }

    /**
     * Create an instance of {@link QuotationLine }
     * 
     */
    public QuotationLine createQuotationLine() {
        return new QuotationLine();
    }

    /**
     * Create an instance of {@link TotalTaxAmount }
     * 
     */
    public TotalTaxAmount createTotalTaxAmount() {
        return new TotalTaxAmount();
    }

    /**
     * Create an instance of {@link RequestForQuotationLineID }
     * 
     */
    public RequestForQuotationLineID createRequestForQuotationLineID() {
        return new RequestForQuotationLineID();
    }

    /**
     * Create an instance of {@link RailTransport }
     * 
     */
    public RailTransport createRailTransport() {
        return new RailTransport();
    }

    /**
     * Create an instance of {@link TrainID }
     * 
     */
    public TrainID createTrainID() {
        return new TrainID();
    }

    /**
     * Create an instance of {@link RailCarID }
     * 
     */
    public RailCarID createRailCarID() {
        return new RailCarID();
    }

    /**
     * Create an instance of {@link ReceiptLineType }
     * 
     */
    public ReceiptLineType createReceiptLineType() {
        return new ReceiptLineType();
    }

    /**
     * Create an instance of {@link ReminderLine }
     * 
     */
    public ReminderLine createReminderLine() {
        return new ReminderLine();
    }

    /**
     * Create an instance of {@link BalanceBroughtForwardIndicator }
     * 
     */
    public BalanceBroughtForwardIndicator createBalanceBroughtForwardIndicator() {
        return new BalanceBroughtForwardIndicator();
    }

    /**
     * Create an instance of {@link DebitLineAmount }
     * 
     */
    public DebitLineAmount createDebitLineAmount() {
        return new DebitLineAmount();
    }

    /**
     * Create an instance of {@link CreditLineAmount }
     * 
     */
    public CreditLineAmount createCreditLineAmount() {
        return new CreditLineAmount();
    }

    /**
     * Create an instance of {@link PenaltySurchargePercent }
     * 
     */
    public PenaltySurchargePercent createPenaltySurchargePercent() {
        return new PenaltySurchargePercent();
    }

    /**
     * Create an instance of {@link PaymentPurposeCode }
     * 
     */
    public PaymentPurposeCode createPaymentPurposeCode() {
        return new PaymentPurposeCode();
    }

    /**
     * Create an instance of {@link RemittanceAdviceLine }
     * 
     */
    public RemittanceAdviceLine createRemittanceAdviceLine() {
        return new RemittanceAdviceLine();
    }

    /**
     * Create an instance of {@link BalanceAmount }
     * 
     */
    public BalanceAmount createBalanceAmount() {
        return new BalanceAmount();
    }

    /**
     * Create an instance of {@link InvoicingPartyReference }
     * 
     */
    public InvoicingPartyReference createInvoicingPartyReference() {
        return new InvoicingPartyReference();
    }

    /**
     * Create an instance of {@link RequestForQuotationLine }
     * 
     */
    public RequestForQuotationLine createRequestForQuotationLine() {
        return new RequestForQuotationLine();
    }

    /**
     * Create an instance of {@link OptionalLineItemIndicator }
     * 
     */
    public OptionalLineItemIndicator createOptionalLineItemIndicator() {
        return new OptionalLineItemIndicator();
    }

    /**
     * Create an instance of {@link SecurityClassificationCode }
     * 
     */
    public SecurityClassificationCode createSecurityClassificationCode() {
        return new SecurityClassificationCode();
    }

    /**
     * Create an instance of {@link ResponseValue }
     * 
     */
    public ResponseValue createResponseValue() {
        return new ResponseValue();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ResponseAmount }
     * 
     */
    public ResponseAmount createResponseAmount() {
        return new ResponseAmount();
    }

    /**
     * Create an instance of {@link ResponseBinaryObject }
     * 
     */
    public ResponseBinaryObject createResponseBinaryObject() {
        return new ResponseBinaryObject();
    }

    /**
     * Create an instance of {@link BinaryObjectType }
     * 
     */
    public BinaryObjectType createBinaryObjectType() {
        return new BinaryObjectType();
    }

    /**
     * Create an instance of {@link BinaryObjectType2 }
     * 
     */
    public BinaryObjectType2 createBinaryObjectType2() {
        return new BinaryObjectType2();
    }

    /**
     * Create an instance of {@link ResponseCode }
     * 
     */
    public ResponseCode createResponseCode() {
        return new ResponseCode();
    }

    /**
     * Create an instance of {@link ResponseDate }
     * 
     */
    public ResponseDate createResponseDate() {
        return new ResponseDate();
    }

    /**
     * Create an instance of {@link ResponseID }
     * 
     */
    public ResponseID createResponseID() {
        return new ResponseID();
    }

    /**
     * Create an instance of {@link ResponseIndicator }
     * 
     */
    public ResponseIndicator createResponseIndicator() {
        return new ResponseIndicator();
    }

    /**
     * Create an instance of {@link ResponseMeasure }
     * 
     */
    public ResponseMeasure createResponseMeasure() {
        return new ResponseMeasure();
    }

    /**
     * Create an instance of {@link ResponseNumeric }
     * 
     */
    public ResponseNumeric createResponseNumeric() {
        return new ResponseNumeric();
    }

    /**
     * Create an instance of {@link ResponseQuantity }
     * 
     */
    public ResponseQuantity createResponseQuantity() {
        return new ResponseQuantity();
    }

    /**
     * Create an instance of {@link ResponseTime }
     * 
     */
    public ResponseTime createResponseTime() {
        return new ResponseTime();
    }

    /**
     * Create an instance of {@link ResponseURI }
     * 
     */
    public ResponseURI createResponseURI() {
        return new ResponseURI();
    }

    /**
     * Create an instance of {@link ResultOfVerification }
     * 
     */
    public ResultOfVerification createResultOfVerification() {
        return new ResultOfVerification();
    }

    /**
     * Create an instance of {@link ValidationResultCode }
     * 
     */
    public ValidationResultCode createValidationResultCode() {
        return new ValidationResultCode();
    }

    /**
     * Create an instance of {@link ValidateProcess }
     * 
     */
    public ValidateProcess createValidateProcess() {
        return new ValidateProcess();
    }

    /**
     * Create an instance of {@link ValidateTool }
     * 
     */
    public ValidateTool createValidateTool() {
        return new ValidateTool();
    }

    /**
     * Create an instance of {@link ValidateToolVersion }
     * 
     */
    public ValidateToolVersion createValidateToolVersion() {
        return new ValidateToolVersion();
    }

    /**
     * Create an instance of {@link RoadTransport }
     * 
     */
    public RoadTransport createRoadTransport() {
        return new RoadTransport();
    }

    /**
     * Create an instance of {@link LicensePlateID }
     * 
     */
    public LicensePlateID createLicensePlateID() {
        return new LicensePlateID();
    }

    /**
     * Create an instance of {@link ServiceFrequencyType }
     * 
     */
    public ServiceFrequencyType createServiceFrequencyType() {
        return new ServiceFrequencyType();
    }

    /**
     * Create an instance of {@link SecurityClearanceTerm }
     * 
     */
    public SecurityClearanceTerm createSecurityClearanceTerm() {
        return new SecurityClearanceTerm();
    }

    /**
     * Create an instance of {@link ServiceProviderParty }
     * 
     */
    public ServiceProviderParty createServiceProviderParty() {
        return new ServiceProviderParty();
    }

    /**
     * Create an instance of {@link ShipRequirement }
     * 
     */
    public ShipRequirement createShipRequirement() {
        return new ShipRequirement();
    }

    /**
     * Create an instance of {@link ShipStoreArticle }
     * 
     */
    public ShipStoreArticle createShipStoreArticle() {
        return new ShipStoreArticle();
    }

    /**
     * Create an instance of {@link OfficialUse }
     * 
     */
    public OfficialUse createOfficialUse() {
        return new OfficialUse();
    }

    /**
     * Create an instance of {@link SocialMediaProfile }
     * 
     */
    public SocialMediaProfile createSocialMediaProfile() {
        return new SocialMediaProfile();
    }

    /**
     * Create an instance of {@link SocialMediaTypeCode }
     * 
     */
    public SocialMediaTypeCode createSocialMediaTypeCode() {
        return new SocialMediaTypeCode();
    }

    /**
     * Create an instance of {@link TendererRequirementType }
     * 
     */
    public TendererRequirementType createTendererRequirementType() {
        return new TendererRequirementType();
    }

    /**
     * Create an instance of {@link StatementLine }
     * 
     */
    public StatementLine createStatementLine() {
        return new StatementLine();
    }

    /**
     * Create an instance of {@link StockAvailabilityReportLine }
     * 
     */
    public StockAvailabilityReportLine createStockAvailabilityReportLine() {
        return new StockAvailabilityReportLine();
    }

    /**
     * Create an instance of {@link Storage }
     * 
     */
    public Storage createStorage() {
        return new Storage();
    }

    /**
     * Create an instance of {@link GateID }
     * 
     */
    public GateID createGateID() {
        return new GateID();
    }

    /**
     * Create an instance of {@link AirFlowPercent }
     * 
     */
    public AirFlowPercent createAirFlowPercent() {
        return new AirFlowPercent();
    }

    /**
     * Create an instance of {@link HumidityPercent }
     * 
     */
    public HumidityPercent createHumidityPercent() {
        return new HumidityPercent();
    }

    /**
     * Create an instance of {@link AnimalFoodApprovedIndicator }
     * 
     */
    public AnimalFoodApprovedIndicator createAnimalFoodApprovedIndicator() {
        return new AnimalFoodApprovedIndicator();
    }

    /**
     * Create an instance of {@link HumanFoodApprovedIndicator }
     * 
     */
    public HumanFoodApprovedIndicator createHumanFoodApprovedIndicator() {
        return new HumanFoodApprovedIndicator();
    }

    /**
     * Create an instance of {@link DangerousGoodsApprovedIndicator }
     * 
     */
    public DangerousGoodsApprovedIndicator createDangerousGoodsApprovedIndicator() {
        return new DangerousGoodsApprovedIndicator();
    }

    /**
     * Create an instance of {@link RefrigeratedIndicator }
     * 
     */
    public RefrigeratedIndicator createRefrigeratedIndicator() {
        return new RefrigeratedIndicator();
    }

    /**
     * Create an instance of {@link PowerIndicator }
     * 
     */
    public PowerIndicator createPowerIndicator() {
        return new PowerIndicator();
    }

    /**
     * Create an instance of {@link TenderLineType }
     * 
     */
    public TenderLineType createTenderLineType() {
        return new TenderLineType();
    }

    /**
     * Create an instance of {@link TenderingCriterionType }
     * 
     */
    public TenderingCriterionType createTenderingCriterionType() {
        return new TenderingCriterionType();
    }

    /**
     * Create an instance of {@link SubscriberConsumption }
     * 
     */
    public SubscriberConsumption createSubscriberConsumption() {
        return new SubscriberConsumption();
    }

    /**
     * Create an instance of {@link ConsumptionID }
     * 
     */
    public ConsumptionID createConsumptionID() {
        return new ConsumptionID();
    }

    /**
     * Create an instance of {@link SpecificationTypeCode }
     * 
     */
    public SpecificationTypeCode createSpecificationTypeCode() {
        return new SpecificationTypeCode();
    }

    /**
     * Create an instance of {@link TotalMeteredQuantity }
     * 
     */
    public TotalMeteredQuantity createTotalMeteredQuantity() {
        return new TotalMeteredQuantity();
    }

    /**
     * Create an instance of {@link SupplierConsumption }
     * 
     */
    public SupplierConsumption createSupplierConsumption() {
        return new SupplierConsumption();
    }

    /**
     * Create an instance of {@link TenderingCriterionPropertyGroupType }
     * 
     */
    public TenderingCriterionPropertyGroupType createTenderingCriterionPropertyGroupType() {
        return new TenderingCriterionPropertyGroupType();
    }

    /**
     * Create an instance of {@link TaxSubtotal }
     * 
     */
    public TaxSubtotal createTaxSubtotal() {
        return new TaxSubtotal();
    }

    /**
     * Create an instance of {@link TaxableAmount }
     * 
     */
    public TaxableAmount createTaxableAmount() {
        return new TaxableAmount();
    }

    /**
     * Create an instance of {@link TaxAmount }
     * 
     */
    public TaxAmount createTaxAmount() {
        return new TaxAmount();
    }

    /**
     * Create an instance of {@link TaxInclusiveAmount }
     * 
     */
    public TaxInclusiveAmount createTaxInclusiveAmount() {
        return new TaxInclusiveAmount();
    }

    /**
     * Create an instance of {@link CalculationSequenceNumeric }
     * 
     */
    public CalculationSequenceNumeric createCalculationSequenceNumeric() {
        return new CalculationSequenceNumeric();
    }

    /**
     * Create an instance of {@link TransactionCurrencyTaxAmount }
     * 
     */
    public TransactionCurrencyTaxAmount createTransactionCurrencyTaxAmount() {
        return new TransactionCurrencyTaxAmount();
    }

    /**
     * Create an instance of {@link BaseUnitMeasure }
     * 
     */
    public BaseUnitMeasure createBaseUnitMeasure() {
        return new BaseUnitMeasure();
    }

    /**
     * Create an instance of {@link PerUnitAmount }
     * 
     */
    public PerUnitAmount createPerUnitAmount() {
        return new PerUnitAmount();
    }

    /**
     * Create an instance of {@link TierRange }
     * 
     */
    public TierRange createTierRange() {
        return new TierRange();
    }

    /**
     * Create an instance of {@link TierRatePercent }
     * 
     */
    public TierRatePercent createTierRatePercent() {
        return new TierRatePercent();
    }

    /**
     * Create an instance of {@link TenderPreparation }
     * 
     */
    public TenderPreparation createTenderPreparation() {
        return new TenderPreparation();
    }

    /**
     * Create an instance of {@link TenderEnvelopeID }
     * 
     */
    public TenderEnvelopeID createTenderEnvelopeID() {
        return new TenderEnvelopeID();
    }

    /**
     * Create an instance of {@link TenderEnvelopeTypeCode }
     * 
     */
    public TenderEnvelopeTypeCode createTenderEnvelopeTypeCode() {
        return new TenderEnvelopeTypeCode();
    }

    /**
     * Create an instance of {@link OpenTenderID }
     * 
     */
    public OpenTenderID createOpenTenderID() {
        return new OpenTenderID();
    }

    /**
     * Create an instance of {@link TenderResult }
     * 
     */
    public TenderResult createTenderResult() {
        return new TenderResult();
    }

    /**
     * Create an instance of {@link AwardID }
     * 
     */
    public AwardID createAwardID() {
        return new AwardID();
    }

    /**
     * Create an instance of {@link TenderResultCode }
     * 
     */
    public TenderResultCode createTenderResultCode() {
        return new TenderResultCode();
    }

    /**
     * Create an instance of {@link AdvertisementAmount }
     * 
     */
    public AdvertisementAmount createAdvertisementAmount() {
        return new AdvertisementAmount();
    }

    /**
     * Create an instance of {@link AwardDate }
     * 
     */
    public AwardDate createAwardDate() {
        return new AwardDate();
    }

    /**
     * Create an instance of {@link AwardTime }
     * 
     */
    public AwardTime createAwardTime() {
        return new AwardTime();
    }

    /**
     * Create an instance of {@link ReceivedTenderQuantity }
     * 
     */
    public ReceivedTenderQuantity createReceivedTenderQuantity() {
        return new ReceivedTenderQuantity();
    }

    /**
     * Create an instance of {@link LowerTenderAmount }
     * 
     */
    public LowerTenderAmount createLowerTenderAmount() {
        return new LowerTenderAmount();
    }

    /**
     * Create an instance of {@link HigherTenderAmount }
     * 
     */
    public HigherTenderAmount createHigherTenderAmount() {
        return new HigherTenderAmount();
    }

    /**
     * Create an instance of {@link ReceivedElectronicTenderQuantity }
     * 
     */
    public ReceivedElectronicTenderQuantity createReceivedElectronicTenderQuantity() {
        return new ReceivedElectronicTenderQuantity();
    }

    /**
     * Create an instance of {@link ReceivedForeignTenderQuantity }
     * 
     */
    public ReceivedForeignTenderQuantity createReceivedForeignTenderQuantity() {
        return new ReceivedForeignTenderQuantity();
    }

    /**
     * Create an instance of {@link WinningParty }
     * 
     */
    public WinningParty createWinningParty() {
        return new WinningParty();
    }

    /**
     * Create an instance of {@link Rank }
     * 
     */
    public Rank createRank() {
        return new Rank();
    }

    /**
     * Create an instance of {@link TendererPartyQualification }
     * 
     */
    public TendererPartyQualification createTendererPartyQualification() {
        return new TendererPartyQualification();
    }

    /**
     * Create an instance of {@link TendererQualificationRequest }
     * 
     */
    public TendererQualificationRequest createTendererQualificationRequest() {
        return new TendererQualificationRequest();
    }

    /**
     * Create an instance of {@link PersonalSituation }
     * 
     */
    public PersonalSituation createPersonalSituation() {
        return new PersonalSituation();
    }

    /**
     * Create an instance of {@link OperatingYearsQuantity }
     * 
     */
    public OperatingYearsQuantity createOperatingYearsQuantity() {
        return new OperatingYearsQuantity();
    }

    /**
     * Create an instance of {@link EmployeeQuantity }
     * 
     */
    public EmployeeQuantity createEmployeeQuantity() {
        return new EmployeeQuantity();
    }

    /**
     * Create an instance of {@link TenderingCriterionProperty }
     * 
     */
    public TenderingCriterionProperty createTenderingCriterionProperty() {
        return new TenderingCriterionProperty();
    }

    /**
     * Create an instance of {@link ValueDataTypeCode }
     * 
     */
    public ValueDataTypeCode createValueDataTypeCode() {
        return new ValueDataTypeCode();
    }

    /**
     * Create an instance of {@link ValueUnitCode }
     * 
     */
    public ValueUnitCode createValueUnitCode() {
        return new ValueUnitCode();
    }

    /**
     * Create an instance of {@link UnitOfMeasureCodeType }
     * 
     */
    public UnitOfMeasureCodeType createUnitOfMeasureCodeType() {
        return new UnitOfMeasureCodeType();
    }

    /**
     * Create an instance of {@link ValueCurrencyCode }
     * 
     */
    public ValueCurrencyCode createValueCurrencyCode() {
        return new ValueCurrencyCode();
    }

    /**
     * Create an instance of {@link ExpectedAmount }
     * 
     */
    public ExpectedAmount createExpectedAmount() {
        return new ExpectedAmount();
    }

    /**
     * Create an instance of {@link ExpectedID }
     * 
     */
    public ExpectedID createExpectedID() {
        return new ExpectedID();
    }

    /**
     * Create an instance of {@link ExpectedIndicator }
     * 
     */
    public ExpectedIndicator createExpectedIndicator() {
        return new ExpectedIndicator();
    }

    /**
     * Create an instance of {@link ExpectedCode }
     * 
     */
    public ExpectedCode createExpectedCode() {
        return new ExpectedCode();
    }

    /**
     * Create an instance of {@link ExpectedValueNumeric }
     * 
     */
    public ExpectedValueNumeric createExpectedValueNumeric() {
        return new ExpectedValueNumeric();
    }

    /**
     * Create an instance of {@link ExpectedDescription }
     * 
     */
    public ExpectedDescription createExpectedDescription() {
        return new ExpectedDescription();
    }

    /**
     * Create an instance of {@link ExpectedURI }
     * 
     */
    public ExpectedURI createExpectedURI() {
        return new ExpectedURI();
    }

    /**
     * Create an instance of {@link MaximumValueNumeric }
     * 
     */
    public MaximumValueNumeric createMaximumValueNumeric() {
        return new MaximumValueNumeric();
    }

    /**
     * Create an instance of {@link MinimumValueNumeric }
     * 
     */
    public MinimumValueNumeric createMinimumValueNumeric() {
        return new MinimumValueNumeric();
    }

    /**
     * Create an instance of {@link TranslationTypeCode }
     * 
     */
    public TranslationTypeCode createTranslationTypeCode() {
        return new TranslationTypeCode();
    }

    /**
     * Create an instance of {@link CertificationLevelDescription }
     * 
     */
    public CertificationLevelDescription createCertificationLevelDescription() {
        return new CertificationLevelDescription();
    }

    /**
     * Create an instance of {@link CopyQualityTypeCode }
     * 
     */
    public CopyQualityTypeCode createCopyQualityTypeCode() {
        return new CopyQualityTypeCode();
    }

    /**
     * Create an instance of {@link TenderingCriterionResponse }
     * 
     */
    public TenderingCriterionResponse createTenderingCriterionResponse() {
        return new TenderingCriterionResponse();
    }

    /**
     * Create an instance of {@link ValidatedCriterionPropertyID }
     * 
     */
    public ValidatedCriterionPropertyID createValidatedCriterionPropertyID() {
        return new ValidatedCriterionPropertyID();
    }

    /**
     * Create an instance of {@link ConfidentialityLevelCode }
     * 
     */
    public ConfidentialityLevelCode createConfidentialityLevelCode() {
        return new ConfidentialityLevelCode();
    }

    /**
     * Create an instance of {@link TenderingProcess }
     * 
     */
    public TenderingProcess createTenderingProcess() {
        return new TenderingProcess();
    }

    /**
     * Create an instance of {@link OriginalContractingSystemID }
     * 
     */
    public OriginalContractingSystemID createOriginalContractingSystemID() {
        return new OriginalContractingSystemID();
    }

    /**
     * Create an instance of {@link NegotiationDescription }
     * 
     */
    public NegotiationDescription createNegotiationDescription() {
        return new NegotiationDescription();
    }

    /**
     * Create an instance of {@link ProcedureCode }
     * 
     */
    public ProcedureCode createProcedureCode() {
        return new ProcedureCode();
    }

    /**
     * Create an instance of {@link UrgencyCode }
     * 
     */
    public UrgencyCode createUrgencyCode() {
        return new UrgencyCode();
    }

    /**
     * Create an instance of {@link ExpenseCode }
     * 
     */
    public ExpenseCode createExpenseCode() {
        return new ExpenseCode();
    }

    /**
     * Create an instance of {@link PartPresentationCode }
     * 
     */
    public PartPresentationCode createPartPresentationCode() {
        return new PartPresentationCode();
    }

    /**
     * Create an instance of {@link ContractingSystemCode }
     * 
     */
    public ContractingSystemCode createContractingSystemCode() {
        return new ContractingSystemCode();
    }

    /**
     * Create an instance of {@link SubmissionMethodCode }
     * 
     */
    public SubmissionMethodCode createSubmissionMethodCode() {
        return new SubmissionMethodCode();
    }

    /**
     * Create an instance of {@link CandidateReductionConstraintIndicator }
     * 
     */
    public CandidateReductionConstraintIndicator createCandidateReductionConstraintIndicator() {
        return new CandidateReductionConstraintIndicator();
    }

    /**
     * Create an instance of {@link GovernmentAgreementConstraintIndicator }
     * 
     */
    public GovernmentAgreementConstraintIndicator createGovernmentAgreementConstraintIndicator() {
        return new GovernmentAgreementConstraintIndicator();
    }

    /**
     * Create an instance of {@link AccessToolsURI }
     * 
     */
    public AccessToolsURI createAccessToolsURI() {
        return new AccessToolsURI();
    }

    /**
     * Create an instance of {@link TerminatedIndicator }
     * 
     */
    public TerminatedIndicator createTerminatedIndicator() {
        return new TerminatedIndicator();
    }

    /**
     * Create an instance of {@link TenderingTerms }
     * 
     */
    public TenderingTerms createTenderingTerms() {
        return new TenderingTerms();
    }

    /**
     * Create an instance of {@link AwardingMethodTypeCode }
     * 
     */
    public AwardingMethodTypeCode createAwardingMethodTypeCode() {
        return new AwardingMethodTypeCode();
    }

    /**
     * Create an instance of {@link PriceEvaluationCode }
     * 
     */
    public PriceEvaluationCode createPriceEvaluationCode() {
        return new PriceEvaluationCode();
    }

    /**
     * Create an instance of {@link MaximumVariantQuantity }
     * 
     */
    public MaximumVariantQuantity createMaximumVariantQuantity() {
        return new MaximumVariantQuantity();
    }

    /**
     * Create an instance of {@link VariantConstraintIndicator }
     * 
     */
    public VariantConstraintIndicator createVariantConstraintIndicator() {
        return new VariantConstraintIndicator();
    }

    /**
     * Create an instance of {@link AcceptedVariantsDescription }
     * 
     */
    public AcceptedVariantsDescription createAcceptedVariantsDescription() {
        return new AcceptedVariantsDescription();
    }

    /**
     * Create an instance of {@link VariantConstraintCode }
     * 
     */
    public VariantConstraintCode createVariantConstraintCode() {
        return new VariantConstraintCode();
    }

    /**
     * Create an instance of {@link PriceRevisionFormulaDescription }
     * 
     */
    public PriceRevisionFormulaDescription createPriceRevisionFormulaDescription() {
        return new PriceRevisionFormulaDescription();
    }

    /**
     * Create an instance of {@link FundingProgramCode }
     * 
     */
    public FundingProgramCode createFundingProgramCode() {
        return new FundingProgramCode();
    }

    /**
     * Create an instance of {@link FundingProgram }
     * 
     */
    public FundingProgram createFundingProgram() {
        return new FundingProgram();
    }

    /**
     * Create an instance of {@link MaximumAdvertisementAmount }
     * 
     */
    public MaximumAdvertisementAmount createMaximumAdvertisementAmount() {
        return new MaximumAdvertisementAmount();
    }

    /**
     * Create an instance of {@link PaymentFrequencyCode }
     * 
     */
    public PaymentFrequencyCode createPaymentFrequencyCode() {
        return new PaymentFrequencyCode();
    }

    /**
     * Create an instance of {@link EconomicOperatorRegistryURI }
     * 
     */
    public EconomicOperatorRegistryURI createEconomicOperatorRegistryURI() {
        return new EconomicOperatorRegistryURI();
    }

    /**
     * Create an instance of {@link RequiredCurriculaIndicator }
     * 
     */
    public RequiredCurriculaIndicator createRequiredCurriculaIndicator() {
        return new RequiredCurriculaIndicator();
    }

    /**
     * Create an instance of {@link RequiredCurriculaCode }
     * 
     */
    public RequiredCurriculaCode createRequiredCurriculaCode() {
        return new RequiredCurriculaCode();
    }

    /**
     * Create an instance of {@link OtherConditionsIndicator }
     * 
     */
    public OtherConditionsIndicator createOtherConditionsIndicator() {
        return new OtherConditionsIndicator();
    }

    /**
     * Create an instance of {@link RecurringProcurementIndicator }
     * 
     */
    public RecurringProcurementIndicator createRecurringProcurementIndicator() {
        return new RecurringProcurementIndicator();
    }

    /**
     * Create an instance of {@link RecurringProcurementDescription }
     * 
     */
    public RecurringProcurementDescription createRecurringProcurementDescription() {
        return new RecurringProcurementDescription();
    }

    /**
     * Create an instance of {@link EstimatedTimingFurtherPublication }
     * 
     */
    public EstimatedTimingFurtherPublication createEstimatedTimingFurtherPublication() {
        return new EstimatedTimingFurtherPublication();
    }

    /**
     * Create an instance of {@link AdditionalConditions }
     * 
     */
    public AdditionalConditions createAdditionalConditions() {
        return new AdditionalConditions();
    }

    /**
     * Create an instance of {@link LatestSecurityClearanceDate }
     * 
     */
    public LatestSecurityClearanceDate createLatestSecurityClearanceDate() {
        return new LatestSecurityClearanceDate();
    }

    /**
     * Create an instance of {@link DocumentationFeeAmount }
     * 
     */
    public DocumentationFeeAmount createDocumentationFeeAmount() {
        return new DocumentationFeeAmount();
    }

    /**
     * Create an instance of {@link MultipleTendersCode }
     * 
     */
    public MultipleTendersCode createMultipleTendersCode() {
        return new MultipleTendersCode();
    }

    /**
     * Create an instance of {@link TransportEquipmentSeal }
     * 
     */
    public TransportEquipmentSeal createTransportEquipmentSeal() {
        return new TransportEquipmentSeal();
    }

    /**
     * Create an instance of {@link SealIssuerTypeCode }
     * 
     */
    public SealIssuerTypeCode createSealIssuerTypeCode() {
        return new SealIssuerTypeCode();
    }

    /**
     * Create an instance of {@link Condition2 }
     * 
     */
    public Condition2 createCondition2() {
        return new Condition2();
    }

    /**
     * Create an instance of {@link SealStatusCode }
     * 
     */
    public SealStatusCode createSealStatusCode() {
        return new SealStatusCode();
    }

    /**
     * Create an instance of {@link SealingPartyType }
     * 
     */
    public SealingPartyType createSealingPartyType() {
        return new SealingPartyType();
    }

    /**
     * Create an instance of {@link TransportExecutionTerms }
     * 
     */
    public TransportExecutionTerms createTransportExecutionTerms() {
        return new TransportExecutionTerms();
    }

    /**
     * Create an instance of {@link TransportUserSpecialTerms }
     * 
     */
    public TransportUserSpecialTerms createTransportUserSpecialTerms() {
        return new TransportUserSpecialTerms();
    }

    /**
     * Create an instance of {@link TransportServiceProviderSpecialTerms }
     * 
     */
    public TransportServiceProviderSpecialTerms createTransportServiceProviderSpecialTerms() {
        return new TransportServiceProviderSpecialTerms();
    }

    /**
     * Create an instance of {@link ChangeConditions }
     * 
     */
    public ChangeConditions createChangeConditions() {
        return new ChangeConditions();
    }

    /**
     * Create an instance of {@link TransportSchedule }
     * 
     */
    public TransportSchedule createTransportSchedule() {
        return new TransportSchedule();
    }

    /**
     * Create an instance of {@link ReferenceDate }
     * 
     */
    public ReferenceDate createReferenceDate() {
        return new ReferenceDate();
    }

    /**
     * Create an instance of {@link ReferenceTime }
     * 
     */
    public ReferenceTime createReferenceTime() {
        return new ReferenceTime();
    }

    /**
     * Create an instance of {@link ReliabilityPercent }
     * 
     */
    public ReliabilityPercent createReliabilityPercent() {
        return new ReliabilityPercent();
    }

    /**
     * Create an instance of {@link TransportationSegment }
     * 
     */
    public TransportationSegment createTransportationSegment() {
        return new TransportationSegment();
    }

    /**
     * Create an instance of {@link TransportExecutionPlanReferenceID }
     * 
     */
    public TransportExecutionPlanReferenceID createTransportExecutionPlanReferenceID() {
        return new TransportExecutionPlanReferenceID();
    }

    /**
     * Create an instance of {@link VerifiedGrossMass }
     * 
     */
    public VerifiedGrossMass createVerifiedGrossMass() {
        return new VerifiedGrossMass();
    }

    /**
     * Create an instance of {@link WeighingDate }
     * 
     */
    public WeighingDate createWeighingDate() {
        return new WeighingDate();
    }

    /**
     * Create an instance of {@link WeighingTime }
     * 
     */
    public WeighingTime createWeighingTime() {
        return new WeighingTime();
    }

    /**
     * Create an instance of {@link WeighingMethodCode }
     * 
     */
    public WeighingMethodCode createWeighingMethodCode() {
        return new WeighingMethodCode();
    }

    /**
     * Create an instance of {@link WeighingMethodCodeType }
     * 
     */
    public WeighingMethodCodeType createWeighingMethodCodeType() {
        return new WeighingMethodCodeType();
    }

    /**
     * Create an instance of {@link WeighingDeviceID }
     * 
     */
    public WeighingDeviceID createWeighingDeviceID() {
        return new WeighingDeviceID();
    }

    /**
     * Create an instance of {@link WeighingDeviceType }
     * 
     */
    public WeighingDeviceType createWeighingDeviceType() {
        return new WeighingDeviceType();
    }

    /**
     * Create an instance of {@link GrossMassMeasure }
     * 
     */
    public GrossMassMeasure createGrossMassMeasure() {
        return new GrossMassMeasure();
    }

    /**
     * Create an instance of {@link WebSiteAccess }
     * 
     */
    public WebSiteAccess createWebSiteAccess() {
        return new WebSiteAccess();
    }

    /**
     * Create an instance of {@link Password }
     * 
     */
    public Password createPassword() {
        return new Password();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AcceptedIndicator }
     * 
     */
    public AcceptedIndicator createAcceptedIndicator() {
        return new AcceptedIndicator();
    }

    /**
     * Create an instance of {@link AccountFormatCode }
     * 
     */
    public AccountFormatCode createAccountFormatCode() {
        return new AccountFormatCode();
    }

    /**
     * Create an instance of {@link AccountTypeCode }
     * 
     */
    public AccountTypeCode createAccountTypeCode() {
        return new AccountTypeCode();
    }

    /**
     * Create an instance of {@link ActualDeliveryDate }
     * 
     */
    public ActualDeliveryDate createActualDeliveryDate() {
        return new ActualDeliveryDate();
    }

    /**
     * Create an instance of {@link ActualDeliveryTime }
     * 
     */
    public ActualDeliveryTime createActualDeliveryTime() {
        return new ActualDeliveryTime();
    }

    /**
     * Create an instance of {@link ActualTemperatureReductionQuantity }
     * 
     */
    public ActualTemperatureReductionQuantity createActualTemperatureReductionQuantity() {
        return new ActualTemperatureReductionQuantity();
    }

    /**
     * Create an instance of {@link AdValoremIndicator }
     * 
     */
    public AdValoremIndicator createAdValoremIndicator() {
        return new AdValoremIndicator();
    }

    /**
     * Create an instance of {@link AdditionalAccountID }
     * 
     */
    public AdditionalAccountID createAdditionalAccountID() {
        return new AdditionalAccountID();
    }

    /**
     * Create an instance of {@link AdditionalStreetName }
     * 
     */
    public AdditionalStreetName createAdditionalStreetName() {
        return new AdditionalStreetName();
    }

    /**
     * Create an instance of {@link AddressFormatCode }
     * 
     */
    public AddressFormatCode createAddressFormatCode() {
        return new AddressFormatCode();
    }

    /**
     * Create an instance of {@link AddressTypeCode }
     * 
     */
    public AddressTypeCode createAddressTypeCode() {
        return new AddressTypeCode();
    }

    /**
     * Create an instance of {@link AgencyID }
     * 
     */
    public AgencyID createAgencyID() {
        return new AgencyID();
    }

    /**
     * Create an instance of {@link AgencyName }
     * 
     */
    public AgencyName createAgencyName() {
        return new AgencyName();
    }

    /**
     * Create an instance of {@link AgreementTypeCode }
     * 
     */
    public AgreementTypeCode createAgreementTypeCode() {
        return new AgreementTypeCode();
    }

    /**
     * Create an instance of {@link AliasName }
     * 
     */
    public AliasName createAliasName() {
        return new AliasName();
    }

    /**
     * Create an instance of {@link AllowanceChargeReason }
     * 
     */
    public AllowanceChargeReason createAllowanceChargeReason() {
        return new AllowanceChargeReason();
    }

    /**
     * Create an instance of {@link AllowanceChargeReasonCode }
     * 
     */
    public AllowanceChargeReasonCode createAllowanceChargeReasonCode() {
        return new AllowanceChargeReasonCode();
    }

    /**
     * Create an instance of {@link AllowanceChargeReasonCodeType }
     * 
     */
    public AllowanceChargeReasonCodeType createAllowanceChargeReasonCodeType() {
        return new AllowanceChargeReasonCodeType();
    }

    /**
     * Create an instance of {@link AllowanceTotalAmount }
     * 
     */
    public AllowanceTotalAmount createAllowanceTotalAmount() {
        return new AllowanceTotalAmount();
    }

    /**
     * Create an instance of {@link AllowanceTotalTaxInclusiveAmount }
     * 
     */
    public AllowanceTotalTaxInclusiveAmount createAllowanceTotalTaxInclusiveAmount() {
        return new AllowanceTotalTaxInclusiveAmount();
    }

    /**
     * Create an instance of {@link AmountRate }
     * 
     */
    public AmountRate createAmountRate() {
        return new AmountRate();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link AnimalFoodIndicator }
     * 
     */
    public AnimalFoodIndicator createAnimalFoodIndicator() {
        return new AnimalFoodIndicator();
    }

    /**
     * Create an instance of {@link ApprovalDate }
     * 
     */
    public ApprovalDate createApprovalDate() {
        return new ApprovalDate();
    }

    /**
     * Create an instance of {@link ApprovalStatus }
     * 
     */
    public ApprovalStatus createApprovalStatus() {
        return new ApprovalStatus();
    }

    /**
     * Create an instance of {@link AuthorizationID }
     * 
     */
    public AuthorizationID createAuthorizationID() {
        return new AuthorizationID();
    }

    /**
     * Create an instance of {@link AwardingCriterionDescription }
     * 
     */
    public AwardingCriterionDescription createAwardingCriterionDescription() {
        return new AwardingCriterionDescription();
    }

    /**
     * Create an instance of {@link AwardingCriterionID }
     * 
     */
    public AwardingCriterionID createAwardingCriterionID() {
        return new AwardingCriterionID();
    }

    /**
     * Create an instance of {@link AwardingCriterionTypeCode }
     * 
     */
    public AwardingCriterionTypeCode createAwardingCriterionTypeCode() {
        return new AwardingCriterionTypeCode();
    }

    /**
     * Create an instance of {@link BackOrderAllowedIndicator }
     * 
     */
    public BackOrderAllowedIndicator createBackOrderAllowedIndicator() {
        return new BackOrderAllowedIndicator();
    }

    /**
     * Create an instance of {@link BackorderQuantity }
     * 
     */
    public BackorderQuantity createBackorderQuantity() {
        return new BackorderQuantity();
    }

    /**
     * Create an instance of {@link BackorderReason }
     * 
     */
    public BackorderReason createBackorderReason() {
        return new BackorderReason();
    }

    /**
     * Create an instance of {@link BarcodeSymbologyID }
     * 
     */
    public BarcodeSymbologyID createBarcodeSymbologyID() {
        return new BarcodeSymbologyID();
    }

    /**
     * Create an instance of {@link BaseAmount }
     * 
     */
    public BaseAmount createBaseAmount() {
        return new BaseAmount();
    }

    /**
     * Create an instance of {@link BaseQuantity }
     * 
     */
    public BaseQuantity createBaseQuantity() {
        return new BaseQuantity();
    }

    /**
     * Create an instance of {@link BasedOnConsensusIndicator }
     * 
     */
    public BasedOnConsensusIndicator createBasedOnConsensusIndicator() {
        return new BasedOnConsensusIndicator();
    }

    /**
     * Create an instance of {@link BatchQuantity }
     * 
     */
    public BatchQuantity createBatchQuantity() {
        return new BatchQuantity();
    }

    /**
     * Create an instance of {@link BirthDate }
     * 
     */
    public BirthDate createBirthDate() {
        return new BirthDate();
    }

    /**
     * Create an instance of {@link BirthplaceName }
     * 
     */
    public BirthplaceName createBirthplaceName() {
        return new BirthplaceName();
    }

    /**
     * Create an instance of {@link BlockName }
     * 
     */
    public BlockName createBlockName() {
        return new BlockName();
    }

    /**
     * Create an instance of {@link BrandName }
     * 
     */
    public BrandName createBrandName() {
        return new BrandName();
    }

    /**
     * Create an instance of {@link BriefDescription }
     * 
     */
    public BriefDescription createBriefDescription() {
        return new BriefDescription();
    }

    /**
     * Create an instance of {@link BrokerAssignedID }
     * 
     */
    public BrokerAssignedID createBrokerAssignedID() {
        return new BrokerAssignedID();
    }

    /**
     * Create an instance of {@link BuildingName }
     * 
     */
    public BuildingName createBuildingName() {
        return new BuildingName();
    }

    /**
     * Create an instance of {@link BuildingNumber }
     * 
     */
    public BuildingNumber createBuildingNumber() {
        return new BuildingNumber();
    }

    /**
     * Create an instance of {@link BulkCargoIndicator }
     * 
     */
    public BulkCargoIndicator createBulkCargoIndicator() {
        return new BulkCargoIndicator();
    }

    /**
     * Create an instance of {@link BusinessClassificationEvidenceID }
     * 
     */
    public BusinessClassificationEvidenceID createBusinessClassificationEvidenceID() {
        return new BusinessClassificationEvidenceID();
    }

    /**
     * Create an instance of {@link BusinessIdentityEvidenceID }
     * 
     */
    public BusinessIdentityEvidenceID createBusinessIdentityEvidenceID() {
        return new BusinessIdentityEvidenceID();
    }

    /**
     * Create an instance of {@link BuyerEventID }
     * 
     */
    public BuyerEventID createBuyerEventID() {
        return new BuyerEventID();
    }

    /**
     * Create an instance of {@link BuyerReference }
     * 
     */
    public BuyerReference createBuyerReference() {
        return new BuyerReference();
    }

    /**
     * Create an instance of {@link CabotageIndicator }
     * 
     */
    public CabotageIndicator createCabotageIndicator() {
        return new CabotageIndicator();
    }

    /**
     * Create an instance of {@link CalculationExpression }
     * 
     */
    public CalculationExpression createCalculationExpression() {
        return new CalculationExpression();
    }

    /**
     * Create an instance of {@link CalculationExpressionCode }
     * 
     */
    public CalculationExpressionCode createCalculationExpressionCode() {
        return new CalculationExpressionCode();
    }

    /**
     * Create an instance of {@link CalculationRate }
     * 
     */
    public CalculationRate createCalculationRate() {
        return new CalculationRate();
    }

    /**
     * Create an instance of {@link CancellationNote }
     * 
     */
    public CancellationNote createCancellationNote() {
        return new CancellationNote();
    }

    /**
     * Create an instance of {@link CandidateStatement }
     * 
     */
    public CandidateStatement createCandidateStatement() {
        return new CandidateStatement();
    }

    /**
     * Create an instance of {@link CapabilityTypeCode }
     * 
     */
    public CapabilityTypeCode createCapabilityTypeCode() {
        return new CapabilityTypeCode();
    }

    /**
     * Create an instance of {@link CargoAndBallastTankConditionDescription }
     * 
     */
    public CargoAndBallastTankConditionDescription createCargoAndBallastTankConditionDescription() {
        return new CargoAndBallastTankConditionDescription();
    }

    /**
     * Create an instance of {@link CargoTypeCode }
     * 
     */
    public CargoTypeCode createCargoTypeCode() {
        return new CargoTypeCode();
    }

    /**
     * Create an instance of {@link CarrierAssignedID }
     * 
     */
    public CarrierAssignedID createCarrierAssignedID() {
        return new CarrierAssignedID();
    }

    /**
     * Create an instance of {@link CarrierServiceInstructions }
     * 
     */
    public CarrierServiceInstructions createCarrierServiceInstructions() {
        return new CarrierServiceInstructions();
    }

    /**
     * Create an instance of {@link CashChangeAmount }
     * 
     */
    public CashChangeAmount createCashChangeAmount() {
        return new CashChangeAmount();
    }

    /**
     * Create an instance of {@link CatalogueIndicator }
     * 
     */
    public CatalogueIndicator createCatalogueIndicator() {
        return new CatalogueIndicator();
    }

    /**
     * Create an instance of {@link CertificateTypeCode }
     * 
     */
    public CertificateTypeCode createCertificateTypeCode() {
        return new CertificateTypeCode();
    }

    /**
     * Create an instance of {@link Channel }
     * 
     */
    public Channel createChannel() {
        return new Channel();
    }

    /**
     * Create an instance of {@link ChannelCode }
     * 
     */
    public ChannelCode createChannelCode() {
        return new ChannelCode();
    }

    /**
     * Create an instance of {@link ChannelCodeType }
     * 
     */
    public ChannelCodeType createChannelCodeType() {
        return new ChannelCodeType();
    }

    /**
     * Create an instance of {@link Characteristics }
     * 
     */
    public Characteristics createCharacteristics() {
        return new Characteristics();
    }

    /**
     * Create an instance of {@link ChargeIndicator }
     * 
     */
    public ChargeIndicator createChargeIndicator() {
        return new ChargeIndicator();
    }

    /**
     * Create an instance of {@link ChargeTotalAmount }
     * 
     */
    public ChargeTotalAmount createChargeTotalAmount() {
        return new ChargeTotalAmount();
    }

    /**
     * Create an instance of {@link ChargeTotalTaxInclusiveAmount }
     * 
     */
    public ChargeTotalTaxInclusiveAmount createChargeTotalTaxInclusiveAmount() {
        return new ChargeTotalTaxInclusiveAmount();
    }

    /**
     * Create an instance of {@link ChargeableQuantity }
     * 
     */
    public ChargeableQuantity createChargeableQuantity() {
        return new ChargeableQuantity();
    }

    /**
     * Create an instance of {@link ChargeableWeightMeasure }
     * 
     */
    public ChargeableWeightMeasure createChargeableWeightMeasure() {
        return new ChargeableWeightMeasure();
    }

    /**
     * Create an instance of {@link ChildConsignmentQuantity }
     * 
     */
    public ChildConsignmentQuantity createChildConsignmentQuantity() {
        return new ChildConsignmentQuantity();
    }

    /**
     * Create an instance of {@link CityName }
     * 
     */
    public CityName createCityName() {
        return new CityName();
    }

    /**
     * Create an instance of {@link CitySubdivisionName }
     * 
     */
    public CitySubdivisionName createCitySubdivisionName() {
        return new CitySubdivisionName();
    }

    /**
     * Create an instance of {@link CodeValue }
     * 
     */
    public CodeValue createCodeValue() {
        return new CodeValue();
    }

    /**
     * Create an instance of {@link CommodityCode }
     * 
     */
    public CommodityCode createCommodityCode() {
        return new CommodityCode();
    }

    /**
     * Create an instance of {@link CompletionIndicator }
     * 
     */
    public CompletionIndicator createCompletionIndicator() {
        return new CompletionIndicator();
    }

    /**
     * Create an instance of {@link ConditionCode }
     * 
     */
    public ConditionCode createConditionCode() {
        return new ConditionCode();
    }

    /**
     * Create an instance of {@link Conditions }
     * 
     */
    public Conditions createConditions() {
        return new Conditions();
    }

    /**
     * Create an instance of {@link ConsigneeAssignedID }
     * 
     */
    public ConsigneeAssignedID createConsigneeAssignedID() {
        return new ConsigneeAssignedID();
    }

    /**
     * Create an instance of {@link ConsignmentQuantity }
     * 
     */
    public ConsignmentQuantity createConsignmentQuantity() {
        return new ConsignmentQuantity();
    }

    /**
     * Create an instance of {@link ConsignorAssignedID }
     * 
     */
    public ConsignorAssignedID createConsignorAssignedID() {
        return new ConsignorAssignedID();
    }

    /**
     * Create an instance of {@link ConsolidatableIndicator }
     * 
     */
    public ConsolidatableIndicator createConsolidatableIndicator() {
        return new ConsolidatableIndicator();
    }

    /**
     * Create an instance of {@link ConsolidatedIndicator }
     * 
     */
    public ConsolidatedIndicator createConsolidatedIndicator() {
        return new ConsolidatedIndicator();
    }

    /**
     * Create an instance of {@link ConstitutionCode }
     * 
     */
    public ConstitutionCode createConstitutionCode() {
        return new ConstitutionCode();
    }

    /**
     * Create an instance of {@link ConsumerUnitQuantity }
     * 
     */
    public ConsumerUnitQuantity createConsumerUnitQuantity() {
        return new ConsumerUnitQuantity();
    }

    /**
     * Create an instance of {@link ConsumptionEnergyQuantity }
     * 
     */
    public ConsumptionEnergyQuantity createConsumptionEnergyQuantity() {
        return new ConsumptionEnergyQuantity();
    }

    /**
     * Create an instance of {@link ConsumptionWaterQuantity }
     * 
     */
    public ConsumptionWaterQuantity createConsumptionWaterQuantity() {
        return new ConsumptionWaterQuantity();
    }

    /**
     * Create an instance of {@link ContainerizedIndicator }
     * 
     */
    public ContainerizedIndicator createContainerizedIndicator() {
        return new ContainerizedIndicator();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link ContractFolderID }
     * 
     */
    public ContractFolderID createContractFolderID() {
        return new ContractFolderID();
    }

    /**
     * Create an instance of {@link ContractName }
     * 
     */
    public ContractName createContractName() {
        return new ContractName();
    }

    /**
     * Create an instance of {@link ContractType2 }
     * 
     */
    public ContractType2 createContractType2() {
        return new ContractType2();
    }

    /**
     * Create an instance of {@link ContractTypeCode }
     * 
     */
    public ContractTypeCode createContractTypeCode() {
        return new ContractTypeCode();
    }

    /**
     * Create an instance of {@link ContractedCarrierAssignedID }
     * 
     */
    public ContractedCarrierAssignedID createContractedCarrierAssignedID() {
        return new ContractedCarrierAssignedID();
    }

    /**
     * Create an instance of {@link CorrectionAmount }
     * 
     */
    public CorrectionAmount createCorrectionAmount() {
        return new CorrectionAmount();
    }

    /**
     * Create an instance of {@link CorrectionType }
     * 
     */
    public CorrectionType createCorrectionType() {
        return new CorrectionType();
    }

    /**
     * Create an instance of {@link CorrectionTypeCode }
     * 
     */
    public CorrectionTypeCode createCorrectionTypeCode() {
        return new CorrectionTypeCode();
    }

    /**
     * Create an instance of {@link CorrectionUnitAmount }
     * 
     */
    public CorrectionUnitAmount createCorrectionUnitAmount() {
        return new CorrectionUnitAmount();
    }

    /**
     * Create an instance of {@link CountrySubentity }
     * 
     */
    public CountrySubentity createCountrySubentity() {
        return new CountrySubentity();
    }

    /**
     * Create an instance of {@link CountrySubentityCode }
     * 
     */
    public CountrySubentityCode createCountrySubentityCode() {
        return new CountrySubentityCode();
    }

    /**
     * Create an instance of {@link CreditNoteTypeCode }
     * 
     */
    public CreditNoteTypeCode createCreditNoteTypeCode() {
        return new CreditNoteTypeCode();
    }

    /**
     * Create an instance of {@link CreditedQuantity }
     * 
     */
    public CreditedQuantity createCreditedQuantity() {
        return new CreditedQuantity();
    }

    /**
     * Create an instance of {@link CrewQuantity }
     * 
     */
    public CrewQuantity createCrewQuantity() {
        return new CrewQuantity();
    }

    /**
     * Create an instance of {@link CriterionTypeCode }
     * 
     */
    public CriterionTypeCode createCriterionTypeCode() {
        return new CriterionTypeCode();
    }

    /**
     * Create an instance of {@link CustomerAssignedAccountID }
     * 
     */
    public CustomerAssignedAccountID createCustomerAssignedAccountID() {
        return new CustomerAssignedAccountID();
    }

    /**
     * Create an instance of {@link CustomsClearanceServiceInstructions }
     * 
     */
    public CustomsClearanceServiceInstructions createCustomsClearanceServiceInstructions() {
        return new CustomsClearanceServiceInstructions();
    }

    /**
     * Create an instance of {@link CustomsImportClassifiedIndicator }
     * 
     */
    public CustomsImportClassifiedIndicator createCustomsImportClassifiedIndicator() {
        return new CustomsImportClassifiedIndicator();
    }

    /**
     * Create an instance of {@link CustomsProcedureCode }
     * 
     */
    public CustomsProcedureCode createCustomsProcedureCode() {
        return new CustomsProcedureCode();
    }

    /**
     * Create an instance of {@link CustomsStatusCode }
     * 
     */
    public CustomsStatusCode createCustomsStatusCode() {
        return new CustomsStatusCode();
    }

    /**
     * Create an instance of {@link CustomsTariffQuantity }
     * 
     */
    public CustomsTariffQuantity createCustomsTariffQuantity() {
        return new CustomsTariffQuantity();
    }

    /**
     * Create an instance of {@link DamageRemarks }
     * 
     */
    public DamageRemarks createDamageRemarks() {
        return new DamageRemarks();
    }

    /**
     * Create an instance of {@link DataSendingCapability }
     * 
     */
    public DataSendingCapability createDataSendingCapability() {
        return new DataSendingCapability();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link DebitedQuantity }
     * 
     */
    public DebitedQuantity createDebitedQuantity() {
        return new DebitedQuantity();
    }

    /**
     * Create an instance of {@link DeclaredCarriageValueAmount }
     * 
     */
    public DeclaredCarriageValueAmount createDeclaredCarriageValueAmount() {
        return new DeclaredCarriageValueAmount();
    }

    /**
     * Create an instance of {@link DeclaredCustomsValueAmount }
     * 
     */
    public DeclaredCustomsValueAmount createDeclaredCustomsValueAmount() {
        return new DeclaredCustomsValueAmount();
    }

    /**
     * Create an instance of {@link DeclaredForCarriageValueAmount }
     * 
     */
    public DeclaredForCarriageValueAmount createDeclaredForCarriageValueAmount() {
        return new DeclaredForCarriageValueAmount();
    }

    /**
     * Create an instance of {@link DeclaredStatisticsValueAmount }
     * 
     */
    public DeclaredStatisticsValueAmount createDeclaredStatisticsValueAmount() {
        return new DeclaredStatisticsValueAmount();
    }

    /**
     * Create an instance of {@link DeliveryAcceptanceCode }
     * 
     */
    public DeliveryAcceptanceCode createDeliveryAcceptanceCode() {
        return new DeliveryAcceptanceCode();
    }

    /**
     * Create an instance of {@link DeliveryInstructions }
     * 
     */
    public DeliveryInstructions createDeliveryInstructions() {
        return new DeliveryInstructions();
    }

    /**
     * Create an instance of {@link DemurrageInstructions }
     * 
     */
    public DemurrageInstructions createDemurrageInstructions() {
        return new DemurrageInstructions();
    }

    /**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

    /**
     * Create an instance of {@link DespatchAdviceTypeCode }
     * 
     */
    public DespatchAdviceTypeCode createDespatchAdviceTypeCode() {
        return new DespatchAdviceTypeCode();
    }

    /**
     * Create an instance of {@link DifferenceTemperatureReductionQuantity }
     * 
     */
    public DifferenceTemperatureReductionQuantity createDifferenceTemperatureReductionQuantity() {
        return new DifferenceTemperatureReductionQuantity();
    }

    /**
     * Create an instance of {@link DirectionCode }
     * 
     */
    public DirectionCode createDirectionCode() {
        return new DirectionCode();
    }

    /**
     * Create an instance of {@link DispositionCode }
     * 
     */
    public DispositionCode createDispositionCode() {
        return new DispositionCode();
    }

    /**
     * Create an instance of {@link DistributionType }
     * 
     */
    public DistributionType createDistributionType() {
        return new DistributionType();
    }

    /**
     * Create an instance of {@link DistributionTypeCode }
     * 
     */
    public DistributionTypeCode createDistributionTypeCode() {
        return new DistributionTypeCode();
    }

    /**
     * Create an instance of {@link District }
     * 
     */
    public District createDistrict() {
        return new District();
    }

    /**
     * Create an instance of {@link DocumentDescription }
     * 
     */
    public DocumentDescription createDocumentDescription() {
        return new DocumentDescription();
    }

    /**
     * Create an instance of {@link DocumentID }
     * 
     */
    public DocumentID createDocumentID() {
        return new DocumentID();
    }

    /**
     * Create an instance of {@link DocumentStatusCode }
     * 
     */
    public DocumentStatusCode createDocumentStatusCode() {
        return new DocumentStatusCode();
    }

    /**
     * Create an instance of {@link DocumentStatusCodeType }
     * 
     */
    public DocumentStatusCodeType createDocumentStatusCodeType() {
        return new DocumentStatusCodeType();
    }

    /**
     * Create an instance of {@link DocumentStatusReasonCode }
     * 
     */
    public DocumentStatusReasonCode createDocumentStatusReasonCode() {
        return new DocumentStatusReasonCode();
    }

    /**
     * Create an instance of {@link DocumentStatusReasonDescription }
     * 
     */
    public DocumentStatusReasonDescription createDocumentStatusReasonDescription() {
        return new DocumentStatusReasonDescription();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link DocumentTypeCode }
     * 
     */
    public DocumentTypeCode createDocumentTypeCode() {
        return new DocumentTypeCode();
    }

    /**
     * Create an instance of {@link DueDate }
     * 
     */
    public DueDate createDueDate() {
        return new DueDate();
    }

    /**
     * Create an instance of {@link DurationMeasure }
     * 
     */
    public DurationMeasure createDurationMeasure() {
        return new DurationMeasure();
    }

    /**
     * Create an instance of {@link Duty }
     * 
     */
    public Duty createDuty() {
        return new Duty();
    }

    /**
     * Create an instance of {@link DutyCode }
     * 
     */
    public DutyCode createDutyCode() {
        return new DutyCode();
    }

    /**
     * Create an instance of {@link EconomicOperatorGroupName }
     * 
     */
    public EconomicOperatorGroupName createEconomicOperatorGroupName() {
        return new EconomicOperatorGroupName();
    }

    /**
     * Create an instance of {@link EffectiveDate }
     * 
     */
    public EffectiveDate createEffectiveDate() {
        return new EffectiveDate();
    }

    /**
     * Create an instance of {@link EffectiveTime }
     * 
     */
    public EffectiveTime createEffectiveTime() {
        return new EffectiveTime();
    }

    /**
     * Create an instance of {@link ElectronicMail }
     * 
     */
    public ElectronicMail createElectronicMail() {
        return new ElectronicMail();
    }

    /**
     * Create an instance of {@link EmbeddedDocument }
     * 
     */
    public EmbeddedDocument createEmbeddedDocument() {
        return new EmbeddedDocument();
    }

    /**
     * Create an instance of {@link EmbeddedDocumentBinaryObject }
     * 
     */
    public EmbeddedDocumentBinaryObject createEmbeddedDocumentBinaryObject() {
        return new EmbeddedDocumentBinaryObject();
    }

    /**
     * Create an instance of {@link EndTime }
     * 
     */
    public EndTime createEndTime() {
        return new EndTime();
    }

    /**
     * Create an instance of {@link EndpointID }
     * 
     */
    public EndpointID createEndpointID() {
        return new EndpointID();
    }

    /**
     * Create an instance of {@link EndpointURI }
     * 
     */
    public EndpointURI createEndpointURI() {
        return new EndpointURI();
    }

    /**
     * Create an instance of {@link EnvelopeTypeCode }
     * 
     */
    public EnvelopeTypeCode createEnvelopeTypeCode() {
        return new EnvelopeTypeCode();
    }

    /**
     * Create an instance of {@link EstimatedAmount }
     * 
     */
    public EstimatedAmount createEstimatedAmount() {
        return new EstimatedAmount();
    }

    /**
     * Create an instance of {@link EstimatedConsumedQuantity }
     * 
     */
    public EstimatedConsumedQuantity createEstimatedConsumedQuantity() {
        return new EstimatedConsumedQuantity();
    }

    /**
     * Create an instance of {@link EstimatedDeliveryDate }
     * 
     */
    public EstimatedDeliveryDate createEstimatedDeliveryDate() {
        return new EstimatedDeliveryDate();
    }

    /**
     * Create an instance of {@link EstimatedDeliveryTime }
     * 
     */
    public EstimatedDeliveryTime createEstimatedDeliveryTime() {
        return new EstimatedDeliveryTime();
    }

    /**
     * Create an instance of {@link EvaluationCriterionTypeCode }
     * 
     */
    public EvaluationCriterionTypeCode createEvaluationCriterionTypeCode() {
        return new EvaluationCriterionTypeCode();
    }

    /**
     * Create an instance of {@link EvaluationMethodTypeCode }
     * 
     */
    public EvaluationMethodTypeCode createEvaluationMethodTypeCode() {
        return new EvaluationMethodTypeCode();
    }

    /**
     * Create an instance of {@link EvidenceTypeCode }
     * 
     */
    public EvidenceTypeCode createEvidenceTypeCode() {
        return new EvidenceTypeCode();
    }

    /**
     * Create an instance of {@link ExchangeMarketID }
     * 
     */
    public ExchangeMarketID createExchangeMarketID() {
        return new ExchangeMarketID();
    }

    /**
     * Create an instance of {@link ExchangeMethodCode }
     * 
     */
    public ExchangeMethodCode createExchangeMethodCode() {
        return new ExchangeMethodCode();
    }

    /**
     * Create an instance of {@link ExchangedPercent }
     * 
     */
    public ExchangedPercent createExchangedPercent() {
        return new ExchangedPercent();
    }

    /**
     * Create an instance of {@link ExpectedAnchorageIndicator }
     * 
     */
    public ExpectedAnchorageIndicator createExpectedAnchorageIndicator() {
        return new ExpectedAnchorageIndicator();
    }

    /**
     * Create an instance of {@link ExportReason }
     * 
     */
    public ExportReason createExportReason() {
        return new ExportReason();
    }

    /**
     * Create an instance of {@link ExportReasonCode }
     * 
     */
    public ExportReasonCode createExportReasonCode() {
        return new ExportReasonCode();
    }

    /**
     * Create an instance of {@link ExportTypeCode }
     * 
     */
    public ExportTypeCode createExportTypeCode() {
        return new ExportTypeCode();
    }

    /**
     * Create an instance of {@link Expression }
     * 
     */
    public Expression createExpression() {
        return new Expression();
    }

    /**
     * Create an instance of {@link ExpressionCode }
     * 
     */
    public ExpressionCode createExpressionCode() {
        return new ExpressionCode();
    }

    /**
     * Create an instance of {@link ExtendedID }
     * 
     */
    public ExtendedID createExtendedID() {
        return new ExtendedID();
    }

    /**
     * Create an instance of {@link FamilyName }
     * 
     */
    public FamilyName createFamilyName() {
        return new FamilyName();
    }

    /**
     * Create an instance of {@link FeeAmount }
     * 
     */
    public FeeAmount createFeeAmount() {
        return new FeeAmount();
    }

    /**
     * Create an instance of {@link FeeTypeCode }
     * 
     */
    public FeeTypeCode createFeeTypeCode() {
        return new FeeTypeCode();
    }

    /**
     * Create an instance of {@link FirstName }
     * 
     */
    public FirstName createFirstName() {
        return new FirstName();
    }

    /**
     * Create an instance of {@link Floor }
     * 
     */
    public Floor createFloor() {
        return new Floor();
    }

    /**
     * Create an instance of {@link FormatID }
     * 
     */
    public FormatID createFormatID() {
        return new FormatID();
    }

    /**
     * Create an instance of {@link ForwarderServiceInstructions }
     * 
     */
    public ForwarderServiceInstructions createForwarderServiceInstructions() {
        return new ForwarderServiceInstructions();
    }

    /**
     * Create an instance of {@link FreeOfChargeIndicator }
     * 
     */
    public FreeOfChargeIndicator createFreeOfChargeIndicator() {
        return new FreeOfChargeIndicator();
    }

    /**
     * Create an instance of {@link FreeOnBoardValueAmount }
     * 
     */
    public FreeOnBoardValueAmount createFreeOnBoardValueAmount() {
        return new FreeOnBoardValueAmount();
    }

    /**
     * Create an instance of {@link FreightForwarderAssignedID }
     * 
     */
    public FreightForwarderAssignedID createFreightForwarderAssignedID() {
        return new FreightForwarderAssignedID();
    }

    /**
     * Create an instance of {@link FreightRateClassCode }
     * 
     */
    public FreightRateClassCode createFreightRateClassCode() {
        return new FreightRateClassCode();
    }

    /**
     * Create an instance of {@link FulfilmentIndicator }
     * 
     */
    public FulfilmentIndicator createFulfilmentIndicator() {
        return new FulfilmentIndicator();
    }

    /**
     * Create an instance of {@link FulfilmentIndicatorTypeCode }
     * 
     */
    public FulfilmentIndicatorTypeCode createFulfilmentIndicatorTypeCode() {
        return new FulfilmentIndicatorTypeCode();
    }

    /**
     * Create an instance of {@link FunctionCode }
     * 
     */
    public FunctionCode createFunctionCode() {
        return new FunctionCode();
    }

    /**
     * Create an instance of {@link GasPressureQuantity }
     * 
     */
    public GasPressureQuantity createGasPressureQuantity() {
        return new GasPressureQuantity();
    }

    /**
     * Create an instance of {@link GenderCode }
     * 
     */
    public GenderCode createGenderCode() {
        return new GenderCode();
    }

    /**
     * Create an instance of {@link GeneralCargoIndicator }
     * 
     */
    public GeneralCargoIndicator createGeneralCargoIndicator() {
        return new GeneralCargoIndicator();
    }

    /**
     * Create an instance of {@link GoodsItemPassportCounterfoilID }
     * 
     */
    public GoodsItemPassportCounterfoilID createGoodsItemPassportCounterfoilID() {
        return new GoodsItemPassportCounterfoilID();
    }

    /**
     * Create an instance of {@link GrossVolumeMeasure }
     * 
     */
    public GrossVolumeMeasure createGrossVolumeMeasure() {
        return new GrossVolumeMeasure();
    }

    /**
     * Create an instance of {@link GrossWeightMeasure }
     * 
     */
    public GrossWeightMeasure createGrossWeightMeasure() {
        return new GrossWeightMeasure();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link GroupTypeCode }
     * 
     */
    public GroupTypeCode createGroupTypeCode() {
        return new GroupTypeCode();
    }

    /**
     * Create an instance of {@link GuaranteeTypeCode }
     * 
     */
    public GuaranteeTypeCode createGuaranteeTypeCode() {
        return new GuaranteeTypeCode();
    }

    /**
     * Create an instance of {@link HandlingCode }
     * 
     */
    public HandlingCode createHandlingCode() {
        return new HandlingCode();
    }

    /**
     * Create an instance of {@link HandlingInstructions }
     * 
     */
    public HandlingInstructions createHandlingInstructions() {
        return new HandlingInstructions();
    }

    /**
     * Create an instance of {@link HaulageInstructions }
     * 
     */
    public HaulageInstructions createHaulageInstructions() {
        return new HaulageInstructions();
    }

    /**
     * Create an instance of {@link HazardousRiskIndicator }
     * 
     */
    public HazardousRiskIndicator createHazardousRiskIndicator() {
        return new HazardousRiskIndicator();
    }

    /**
     * Create an instance of {@link HumanFoodIndicator }
     * 
     */
    public HumanFoodIndicator createHumanFoodIndicator() {
        return new HumanFoodIndicator();
    }

    /**
     * Create an instance of {@link IdentificationCode }
     * 
     */
    public IdentificationCode createIdentificationCode() {
        return new IdentificationCode();
    }

    /**
     * Create an instance of {@link CountryIdentificationCodeType }
     * 
     */
    public CountryIdentificationCodeType createCountryIdentificationCodeType() {
        return new CountryIdentificationCodeType();
    }

    /**
     * Create an instance of {@link IdentificationID }
     * 
     */
    public IdentificationID createIdentificationID() {
        return new IdentificationID();
    }

    /**
     * Create an instance of {@link IndicationIndicator }
     * 
     */
    public IndicationIndicator createIndicationIndicator() {
        return new IndicationIndicator();
    }

    /**
     * Create an instance of {@link IndustryClassificationCode }
     * 
     */
    public IndustryClassificationCode createIndustryClassificationCode() {
        return new IndustryClassificationCode();
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link InformationURI }
     * 
     */
    public InformationURI createInformationURI() {
        return new InformationURI();
    }

    /**
     * Create an instance of {@link InhouseMail }
     * 
     */
    public InhouseMail createInhouseMail() {
        return new InhouseMail();
    }

    /**
     * Create an instance of {@link InspectionMethodCode }
     * 
     */
    public InspectionMethodCode createInspectionMethodCode() {
        return new InspectionMethodCode();
    }

    /**
     * Create an instance of {@link InstallmentDueDate }
     * 
     */
    public InstallmentDueDate createInstallmentDueDate() {
        return new InstallmentDueDate();
    }

    /**
     * Create an instance of {@link InsurancePremiumAmount }
     * 
     */
    public InsurancePremiumAmount createInsurancePremiumAmount() {
        return new InsurancePremiumAmount();
    }

    /**
     * Create an instance of {@link InsuranceValueAmount }
     * 
     */
    public InsuranceValueAmount createInsuranceValueAmount() {
        return new InsuranceValueAmount();
    }

    /**
     * Create an instance of {@link InvoiceTypeCode }
     * 
     */
    public InvoiceTypeCode createInvoiceTypeCode() {
        return new InvoiceTypeCode();
    }

    /**
     * Create an instance of {@link IssuerScopeID }
     * 
     */
    public IssuerScopeID createIssuerScopeID() {
        return new IssuerScopeID();
    }

    /**
     * Create an instance of {@link ItemClassificationCode }
     * 
     */
    public ItemClassificationCode createItemClassificationCode() {
        return new ItemClassificationCode();
    }

    /**
     * Create an instance of {@link ItemTypeCode }
     * 
     */
    public ItemTypeCode createItemTypeCode() {
        return new ItemTypeCode();
    }

    /**
     * Create an instance of {@link ItemUpdateRequestIndicator }
     * 
     */
    public ItemUpdateRequestIndicator createItemUpdateRequestIndicator() {
        return new ItemUpdateRequestIndicator();
    }

    /**
     * Create an instance of {@link JobTitle }
     * 
     */
    public JobTitle createJobTitle() {
        return new JobTitle();
    }

    /**
     * Create an instance of {@link JourneyID }
     * 
     */
    public JourneyID createJourneyID() {
        return new JourneyID();
    }

    /**
     * Create an instance of {@link Keyword }
     * 
     */
    public Keyword createKeyword() {
        return new Keyword();
    }

    /**
     * Create an instance of {@link LanguageID }
     * 
     */
    public LanguageID createLanguageID() {
        return new LanguageID();
    }

    /**
     * Create an instance of {@link LastRevisionDate }
     * 
     */
    public LastRevisionDate createLastRevisionDate() {
        return new LastRevisionDate();
    }

    /**
     * Create an instance of {@link LastRevisionTime }
     * 
     */
    public LastRevisionTime createLastRevisionTime() {
        return new LastRevisionTime();
    }

    /**
     * Create an instance of {@link LatestDeliveryDate }
     * 
     */
    public LatestDeliveryDate createLatestDeliveryDate() {
        return new LatestDeliveryDate();
    }

    /**
     * Create an instance of {@link LatestDeliveryTime }
     * 
     */
    public LatestDeliveryTime createLatestDeliveryTime() {
        return new LatestDeliveryTime();
    }

    /**
     * Create an instance of {@link LatestReplyDate }
     * 
     */
    public LatestReplyDate createLatestReplyDate() {
        return new LatestReplyDate();
    }

    /**
     * Create an instance of {@link LatestReplyTime }
     * 
     */
    public LatestReplyTime createLatestReplyTime() {
        return new LatestReplyTime();
    }

    /**
     * Create an instance of {@link LeadTimeMeasure }
     * 
     */
    public LeadTimeMeasure createLeadTimeMeasure() {
        return new LeadTimeMeasure();
    }

    /**
     * Create an instance of {@link LegalReference }
     * 
     */
    public LegalReference createLegalReference() {
        return new LegalReference();
    }

    /**
     * Create an instance of {@link LegalStatusIndicator }
     * 
     */
    public LegalStatusIndicator createLegalStatusIndicator() {
        return new LegalStatusIndicator();
    }

    /**
     * Create an instance of {@link LiabilityAmount }
     * 
     */
    public LiabilityAmount createLiabilityAmount() {
        return new LiabilityAmount();
    }

    /**
     * Create an instance of {@link ListValue }
     * 
     */
    public ListValue createListValue() {
        return new ListValue();
    }

    /**
     * Create an instance of {@link LivestockIndicator }
     * 
     */
    public LivestockIndicator createLivestockIndicator() {
        return new LivestockIndicator();
    }

    /**
     * Create an instance of {@link LoadingLengthMeasure }
     * 
     */
    public LoadingLengthMeasure createLoadingLengthMeasure() {
        return new LoadingLengthMeasure();
    }

    /**
     * Create an instance of {@link LoadingSequenceID }
     * 
     */
    public LoadingSequenceID createLoadingSequenceID() {
        return new LoadingSequenceID();
    }

    /**
     * Create an instance of {@link LocaleCode }
     * 
     */
    public LocaleCode createLocaleCode() {
        return new LocaleCode();
    }

    /**
     * Create an instance of {@link LanguageCodeType }
     * 
     */
    public LanguageCodeType createLanguageCodeType() {
        return new LanguageCodeType();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link LocationID }
     * 
     */
    public LocationID createLocationID() {
        return new LocationID();
    }

    /**
     * Create an instance of {@link LocationTypeCode }
     * 
     */
    public LocationTypeCode createLocationTypeCode() {
        return new LocationTypeCode();
    }

    /**
     * Create an instance of {@link LogoReferenceID }
     * 
     */
    public LogoReferenceID createLogoReferenceID() {
        return new LogoReferenceID();
    }

    /**
     * Create an instance of {@link ManifestType }
     * 
     */
    public ManifestType createManifestType() {
        return new ManifestType();
    }

    /**
     * Create an instance of {@link ManifestTypeCode }
     * 
     */
    public ManifestTypeCode createManifestTypeCode() {
        return new ManifestTypeCode();
    }

    /**
     * Create an instance of {@link MarkAttention }
     * 
     */
    public MarkAttention createMarkAttention() {
        return new MarkAttention();
    }

    /**
     * Create an instance of {@link MarkAttentionIndicator }
     * 
     */
    public MarkAttentionIndicator createMarkAttentionIndicator() {
        return new MarkAttentionIndicator();
    }

    /**
     * Create an instance of {@link MarkCare }
     * 
     */
    public MarkCare createMarkCare() {
        return new MarkCare();
    }

    /**
     * Create an instance of {@link MarkCareIndicator }
     * 
     */
    public MarkCareIndicator createMarkCareIndicator() {
        return new MarkCareIndicator();
    }

    /**
     * Create an instance of {@link MathematicOperatorCode }
     * 
     */
    public MathematicOperatorCode createMathematicOperatorCode() {
        return new MathematicOperatorCode();
    }

    /**
     * Create an instance of {@link OperatorCodeType }
     * 
     */
    public OperatorCodeType createOperatorCodeType() {
        return new OperatorCodeType();
    }

    /**
     * Create an instance of {@link MaximumBackorderQuantity }
     * 
     */
    public MaximumBackorderQuantity createMaximumBackorderQuantity() {
        return new MaximumBackorderQuantity();
    }

    /**
     * Create an instance of {@link MaximumCopiesNumeric }
     * 
     */
    public MaximumCopiesNumeric createMaximumCopiesNumeric() {
        return new MaximumCopiesNumeric();
    }

    /**
     * Create an instance of {@link MaximumOriginalsNumeric }
     * 
     */
    public MaximumOriginalsNumeric createMaximumOriginalsNumeric() {
        return new MaximumOriginalsNumeric();
    }

    /**
     * Create an instance of {@link MaximumPercent }
     * 
     */
    public MaximumPercent createMaximumPercent() {
        return new MaximumPercent();
    }

    /**
     * Create an instance of {@link MeasureCode }
     * 
     */
    public MeasureCode createMeasureCode() {
        return new MeasureCode();
    }

    /**
     * Create an instance of {@link MerchantID }
     * 
     */
    public MerchantID createMerchantID() {
        return new MerchantID();
    }

    /**
     * Create an instance of {@link MessageFormat }
     * 
     */
    public MessageFormat createMessageFormat() {
        return new MessageFormat();
    }

    /**
     * Create an instance of {@link MeterConstant }
     * 
     */
    public MeterConstant createMeterConstant() {
        return new MeterConstant();
    }

    /**
     * Create an instance of {@link MeterConstantCode }
     * 
     */
    public MeterConstantCode createMeterConstantCode() {
        return new MeterConstantCode();
    }

    /**
     * Create an instance of {@link MeterName }
     * 
     */
    public MeterName createMeterName() {
        return new MeterName();
    }

    /**
     * Create an instance of {@link MiddleName }
     * 
     */
    public MiddleName createMiddleName() {
        return new MiddleName();
    }

    /**
     * Create an instance of {@link MinimumBackorderQuantity }
     * 
     */
    public MinimumBackorderQuantity createMinimumBackorderQuantity() {
        return new MinimumBackorderQuantity();
    }

    /**
     * Create an instance of {@link MinimumImprovementBid }
     * 
     */
    public MinimumImprovementBid createMinimumImprovementBid() {
        return new MinimumImprovementBid();
    }

    /**
     * Create an instance of {@link MinimumPercent }
     * 
     */
    public MinimumPercent createMinimumPercent() {
        return new MinimumPercent();
    }

    /**
     * Create an instance of {@link ModelName }
     * 
     */
    public ModelName createModelName() {
        return new ModelName();
    }

    /**
     * Create an instance of {@link ModificationReasonCode }
     * 
     */
    public ModificationReasonCode createModificationReasonCode() {
        return new ModificationReasonCode();
    }

    /**
     * Create an instance of {@link ModificationReasonDescription }
     * 
     */
    public ModificationReasonDescription createModificationReasonDescription() {
        return new ModificationReasonDescription();
    }

    /**
     * Create an instance of {@link MultiplierFactorNumeric }
     * 
     */
    public MultiplierFactorNumeric createMultiplierFactorNumeric() {
        return new MultiplierFactorNumeric();
    }

    /**
     * Create an instance of {@link NameSuffix }
     * 
     */
    public NameSuffix createNameSuffix() {
        return new NameSuffix();
    }

    /**
     * Create an instance of {@link NationalityID }
     * 
     */
    public NationalityID createNationalityID() {
        return new NationalityID();
    }

    /**
     * Create an instance of {@link NatureCode }
     * 
     */
    public NatureCode createNatureCode() {
        return new NatureCode();
    }

    /**
     * Create an instance of {@link NatureOfTransactionCode }
     * 
     */
    public NatureOfTransactionCode createNatureOfTransactionCode() {
        return new NatureOfTransactionCode();
    }

    /**
     * Create an instance of {@link NetNetWeightMeasure }
     * 
     */
    public NetNetWeightMeasure createNetNetWeightMeasure() {
        return new NetNetWeightMeasure();
    }

    /**
     * Create an instance of {@link NominationDate }
     * 
     */
    public NominationDate createNominationDate() {
        return new NominationDate();
    }

    /**
     * Create an instance of {@link NominationTime }
     * 
     */
    public NominationTime createNominationTime() {
        return new NominationTime();
    }

    /**
     * Create an instance of {@link NormalTemperatureReductionQuantity }
     * 
     */
    public NormalTemperatureReductionQuantity createNormalTemperatureReductionQuantity() {
        return new NormalTemperatureReductionQuantity();
    }

    /**
     * Create an instance of {@link NoticeLanguageCode }
     * 
     */
    public NoticeLanguageCode createNoticeLanguageCode() {
        return new NoticeLanguageCode();
    }

    /**
     * Create an instance of {@link NoticeTypeCode }
     * 
     */
    public NoticeTypeCode createNoticeTypeCode() {
        return new NoticeTypeCode();
    }

    /**
     * Create an instance of {@link OccurrenceDate }
     * 
     */
    public OccurrenceDate createOccurrenceDate() {
        return new OccurrenceDate();
    }

    /**
     * Create an instance of {@link OccurrenceTime }
     * 
     */
    public OccurrenceTime createOccurrenceTime() {
        return new OccurrenceTime();
    }

    /**
     * Create an instance of {@link OnCarriageIndicator }
     * 
     */
    public OnCarriageIndicator createOnCarriageIndicator() {
        return new OnCarriageIndicator();
    }

    /**
     * Create an instance of {@link OntologyURI }
     * 
     */
    public OntologyURI createOntologyURI() {
        return new OntologyURI();
    }

    /**
     * Create an instance of {@link OrderResponseCode }
     * 
     */
    public OrderResponseCode createOrderResponseCode() {
        return new OrderResponseCode();
    }

    /**
     * Create an instance of {@link OrderableUnitFactorRate }
     * 
     */
    public OrderableUnitFactorRate createOrderableUnitFactorRate() {
        return new OrderableUnitFactorRate();
    }

    /**
     * Create an instance of {@link OrganizationDepartment }
     * 
     */
    public OrganizationDepartment createOrganizationDepartment() {
        return new OrganizationDepartment();
    }

    /**
     * Create an instance of {@link OtherInstruction }
     * 
     */
    public OtherInstruction createOtherInstruction() {
        return new OtherInstruction();
    }

    /**
     * Create an instance of {@link OtherName }
     * 
     */
    public OtherName createOtherName() {
        return new OtherName();
    }

    /**
     * Create an instance of {@link OutstandingQuantity }
     * 
     */
    public OutstandingQuantity createOutstandingQuantity() {
        return new OutstandingQuantity();
    }

    /**
     * Create an instance of {@link OutstandingReason }
     * 
     */
    public OutstandingReason createOutstandingReason() {
        return new OutstandingReason();
    }

    /**
     * Create an instance of {@link OversupplyQuantity }
     * 
     */
    public OversupplyQuantity createOversupplyQuantity() {
        return new OversupplyQuantity();
    }

    /**
     * Create an instance of {@link OwnerTypeCode }
     * 
     */
    public OwnerTypeCode createOwnerTypeCode() {
        return new OwnerTypeCode();
    }

    /**
     * Create an instance of {@link PackageLevelCode }
     * 
     */
    public PackageLevelCode createPackageLevelCode() {
        return new PackageLevelCode();
    }

    /**
     * Create an instance of {@link PackagingType }
     * 
     */
    public PackagingType createPackagingType() {
        return new PackagingType();
    }

    /**
     * Create an instance of {@link PackagingTypeCode }
     * 
     */
    public PackagingTypeCode createPackagingTypeCode() {
        return new PackagingTypeCode();
    }

    /**
     * Create an instance of {@link PackagingTypeCodeType }
     * 
     */
    public PackagingTypeCodeType createPackagingTypeCodeType() {
        return new PackagingTypeCodeType();
    }

    /**
     * Create an instance of {@link PackingMaterial }
     * 
     */
    public PackingMaterial createPackingMaterial() {
        return new PackingMaterial();
    }

    /**
     * Create an instance of {@link PaidAmount }
     * 
     */
    public PaidAmount createPaidAmount() {
        return new PaidAmount();
    }

    /**
     * Create an instance of {@link PaidCashAmount }
     * 
     */
    public PaidCashAmount createPaidCashAmount() {
        return new PaidCashAmount();
    }

    /**
     * Create an instance of {@link PaidDate }
     * 
     */
    public PaidDate createPaidDate() {
        return new PaidDate();
    }

    /**
     * Create an instance of {@link PaidTime }
     * 
     */
    public PaidTime createPaidTime() {
        return new PaidTime();
    }

    /**
     * Create an instance of {@link ParentDocumentID }
     * 
     */
    public ParentDocumentID createParentDocumentID() {
        return new ParentDocumentID();
    }

    /**
     * Create an instance of {@link ParentDocumentTypeCode }
     * 
     */
    public ParentDocumentTypeCode createParentDocumentTypeCode() {
        return new ParentDocumentTypeCode();
    }

    /**
     * Create an instance of {@link ParentDocumentVersionID }
     * 
     */
    public ParentDocumentVersionID createParentDocumentVersionID() {
        return new ParentDocumentVersionID();
    }

    /**
     * Create an instance of {@link PartialDeliveryIndicator }
     * 
     */
    public PartialDeliveryIndicator createPartialDeliveryIndicator() {
        return new PartialDeliveryIndicator();
    }

    /**
     * Create an instance of {@link ParticipantID }
     * 
     */
    public ParticipantID createParticipantID() {
        return new ParticipantID();
    }

    /**
     * Create an instance of {@link ParticipationPercent }
     * 
     */
    public ParticipationPercent createParticipationPercent() {
        return new ParticipationPercent();
    }

    /**
     * Create an instance of {@link PassengerQuantity }
     * 
     */
    public PassengerQuantity createPassengerQuantity() {
        return new PassengerQuantity();
    }

    /**
     * Create an instance of {@link PayableAlternativeAmount }
     * 
     */
    public PayableAlternativeAmount createPayableAlternativeAmount() {
        return new PayableAlternativeAmount();
    }

    /**
     * Create an instance of {@link PayableAmount }
     * 
     */
    public PayableAmount createPayableAmount() {
        return new PayableAmount();
    }

    /**
     * Create an instance of {@link PayableRoundingAmount }
     * 
     */
    public PayableRoundingAmount createPayableRoundingAmount() {
        return new PayableRoundingAmount();
    }

    /**
     * Create an instance of {@link PayerReference }
     * 
     */
    public PayerReference createPayerReference() {
        return new PayerReference();
    }

    /**
     * Create an instance of {@link PaymentAlternativeCurrencyCode }
     * 
     */
    public PaymentAlternativeCurrencyCode createPaymentAlternativeCurrencyCode() {
        return new PaymentAlternativeCurrencyCode();
    }

    /**
     * Create an instance of {@link PaymentCurrencyCode }
     * 
     */
    public PaymentCurrencyCode createPaymentCurrencyCode() {
        return new PaymentCurrencyCode();
    }

    /**
     * Create an instance of {@link PaymentMeansID }
     * 
     */
    public PaymentMeansID createPaymentMeansID() {
        return new PaymentMeansID();
    }

    /**
     * Create an instance of {@link PaymentNote }
     * 
     */
    public PaymentNote createPaymentNote() {
        return new PaymentNote();
    }

    /**
     * Create an instance of {@link PaymentOrderReference }
     * 
     */
    public PaymentOrderReference createPaymentOrderReference() {
        return new PaymentOrderReference();
    }

    /**
     * Create an instance of {@link PaymentPercent }
     * 
     */
    public PaymentPercent createPaymentPercent() {
        return new PaymentPercent();
    }

    /**
     * Create an instance of {@link PaymentTerminalID }
     * 
     */
    public PaymentTerminalID createPaymentTerminalID() {
        return new PaymentTerminalID();
    }

    /**
     * Create an instance of {@link PaymentTermsDetailsURI }
     * 
     */
    public PaymentTermsDetailsURI createPaymentTermsDetailsURI() {
        return new PaymentTermsDetailsURI();
    }

    /**
     * Create an instance of {@link PenaltyAmount }
     * 
     */
    public PenaltyAmount createPenaltyAmount() {
        return new PenaltyAmount();
    }

    /**
     * Create an instance of {@link PerformingCarrierAssignedID }
     * 
     */
    public PerformingCarrierAssignedID createPerformingCarrierAssignedID() {
        return new PerformingCarrierAssignedID();
    }

    /**
     * Create an instance of {@link PlannedDate }
     * 
     */
    public PlannedDate createPlannedDate() {
        return new PlannedDate();
    }

    /**
     * Create an instance of {@link PlannedInspectionsDescription }
     * 
     */
    public PlannedInspectionsDescription createPlannedInspectionsDescription() {
        return new PlannedInspectionsDescription();
    }

    /**
     * Create an instance of {@link PlannedOperationsDescription }
     * 
     */
    public PlannedOperationsDescription createPlannedOperationsDescription() {
        return new PlannedOperationsDescription();
    }

    /**
     * Create an instance of {@link PlannedWorksDescription }
     * 
     */
    public PlannedWorksDescription createPlannedWorksDescription() {
        return new PlannedWorksDescription();
    }

    /**
     * Create an instance of {@link PlotIdentification }
     * 
     */
    public PlotIdentification createPlotIdentification() {
        return new PlotIdentification();
    }

    /**
     * Create an instance of {@link PositionInPortID }
     * 
     */
    public PositionInPortID createPositionInPortID() {
        return new PositionInPortID();
    }

    /**
     * Create an instance of {@link PostalZone }
     * 
     */
    public PostalZone createPostalZone() {
        return new PostalZone();
    }

    /**
     * Create an instance of {@link Postbox }
     * 
     */
    public Postbox createPostbox() {
        return new Postbox();
    }

    /**
     * Create an instance of {@link PreCarriageIndicator }
     * 
     */
    public PreCarriageIndicator createPreCarriageIndicator() {
        return new PreCarriageIndicator();
    }

    /**
     * Create an instance of {@link PreferenceCriterionCode }
     * 
     */
    public PreferenceCriterionCode createPreferenceCriterionCode() {
        return new PreferenceCriterionCode();
    }

    /**
     * Create an instance of {@link PreferredLanguageLocaleCode }
     * 
     */
    public PreferredLanguageLocaleCode createPreferredLanguageLocaleCode() {
        return new PreferredLanguageLocaleCode();
    }

    /**
     * Create an instance of {@link PrepaidAmount }
     * 
     */
    public PrepaidAmount createPrepaidAmount() {
        return new PrepaidAmount();
    }

    /**
     * Create an instance of {@link PrepaidIndicator }
     * 
     */
    public PrepaidIndicator createPrepaidIndicator() {
        return new PrepaidIndicator();
    }

    /**
     * Create an instance of {@link PrepaidPaymentReferenceID }
     * 
     */
    public PrepaidPaymentReferenceID createPrepaidPaymentReferenceID() {
        return new PrepaidPaymentReferenceID();
    }

    /**
     * Create an instance of {@link PreviousVersionID }
     * 
     */
    public PreviousVersionID createPreviousVersionID() {
        return new PreviousVersionID();
    }

    /**
     * Create an instance of {@link PriceChangeReason }
     * 
     */
    public PriceChangeReason createPriceChangeReason() {
        return new PriceChangeReason();
    }

    /**
     * Create an instance of {@link PriceType2 }
     * 
     */
    public PriceType2 createPriceType2() {
        return new PriceType2();
    }

    /**
     * Create an instance of {@link PriceTypeCode }
     * 
     */
    public PriceTypeCode createPriceTypeCode() {
        return new PriceTypeCode();
    }

    /**
     * Create an instance of {@link PricingUpdateRequestIndicator }
     * 
     */
    public PricingUpdateRequestIndicator createPricingUpdateRequestIndicator() {
        return new PricingUpdateRequestIndicator();
    }

    /**
     * Create an instance of {@link PrintQualifier }
     * 
     */
    public PrintQualifier createPrintQualifier() {
        return new PrintQualifier();
    }

    /**
     * Create an instance of {@link Priority }
     * 
     */
    public Priority createPriority() {
        return new Priority();
    }

    /**
     * Create an instance of {@link ProfileStatusCode }
     * 
     */
    public ProfileStatusCode createProfileStatusCode() {
        return new ProfileStatusCode();
    }

    /**
     * Create an instance of {@link PropertyGroupTypeCode }
     * 
     */
    public PropertyGroupTypeCode createPropertyGroupTypeCode() {
        return new PropertyGroupTypeCode();
    }

    /**
     * Create an instance of {@link ProtocolID }
     * 
     */
    public ProtocolID createProtocolID() {
        return new ProtocolID();
    }

    /**
     * Create an instance of {@link ProviderTypeCode }
     * 
     */
    public ProviderTypeCode createProviderTypeCode() {
        return new ProviderTypeCode();
    }

    /**
     * Create an instance of {@link PublishAwardIndicator }
     * 
     */
    public PublishAwardIndicator createPublishAwardIndicator() {
        return new PublishAwardIndicator();
    }

    /**
     * Create an instance of {@link PurchaseDate }
     * 
     */
    public PurchaseDate createPurchaseDate() {
        return new PurchaseDate();
    }

    /**
     * Create an instance of {@link PurchaseTime }
     * 
     */
    public PurchaseTime createPurchaseTime() {
        return new PurchaseTime();
    }

    /**
     * Create an instance of {@link Purpose }
     * 
     */
    public Purpose createPurpose() {
        return new Purpose();
    }

    /**
     * Create an instance of {@link PurposeCode }
     * 
     */
    public PurposeCode createPurposeCode() {
        return new PurposeCode();
    }

    /**
     * Create an instance of {@link PurposeType }
     * 
     */
    public PurposeType createPurposeType() {
        return new PurposeType();
    }

    /**
     * Create an instance of {@link PurposeTypeCode }
     * 
     */
    public PurposeTypeCode createPurposeTypeCode() {
        return new PurposeTypeCode();
    }

    /**
     * Create an instance of {@link QualificationApplicationTypeCode }
     * 
     */
    public QualificationApplicationTypeCode createQualificationApplicationTypeCode() {
        return new QualificationApplicationTypeCode();
    }

    /**
     * Create an instance of {@link QuantityDiscrepancyCode }
     * 
     */
    public QuantityDiscrepancyCode createQuantityDiscrepancyCode() {
        return new QuantityDiscrepancyCode();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link ReceiptAdviceTypeCode }
     * 
     */
    public ReceiptAdviceTypeCode createReceiptAdviceTypeCode() {
        return new ReceiptAdviceTypeCode();
    }

    /**
     * Create an instance of {@link ReceiptAdviceTypeCodeType }
     * 
     */
    public ReceiptAdviceTypeCodeType createReceiptAdviceTypeCodeType() {
        return new ReceiptAdviceTypeCodeType();
    }

    /**
     * Create an instance of {@link ReceivedDate }
     * 
     */
    public ReceivedDate createReceivedDate() {
        return new ReceivedDate();
    }

    /**
     * Create an instance of {@link ReceivedQuantity }
     * 
     */
    public ReceivedQuantity createReceivedQuantity() {
        return new ReceivedQuantity();
    }

    /**
     * Create an instance of {@link ReceivedTime }
     * 
     */
    public ReceivedTime createReceivedTime() {
        return new ReceivedTime();
    }

    /**
     * Create an instance of {@link Reference }
     * 
     */
    public Reference createReference() {
        return new Reference();
    }

    /**
     * Create an instance of {@link ReferenceEventCode }
     * 
     */
    public ReferenceEventCode createReferenceEventCode() {
        return new ReferenceEventCode();
    }

    /**
     * Create an instance of {@link ReferencedConsignmentID }
     * 
     */
    public ReferencedConsignmentID createReferencedConsignmentID() {
        return new ReferencedConsignmentID();
    }

    /**
     * Create an instance of {@link ReferencedDocumentInternalAddress }
     * 
     */
    public ReferencedDocumentInternalAddress createReferencedDocumentInternalAddress() {
        return new ReferencedDocumentInternalAddress();
    }

    /**
     * Create an instance of {@link RefrigerationOnIndicator }
     * 
     */
    public RefrigerationOnIndicator createRefrigerationOnIndicator() {
        return new RefrigerationOnIndicator();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link RegisteredDate }
     * 
     */
    public RegisteredDate createRegisteredDate() {
        return new RegisteredDate();
    }

    /**
     * Create an instance of {@link RegisteredTime }
     * 
     */
    public RegisteredTime createRegisteredTime() {
        return new RegisteredTime();
    }

    /**
     * Create an instance of {@link RegistrationNationality }
     * 
     */
    public RegistrationNationality createRegistrationNationality() {
        return new RegistrationNationality();
    }

    /**
     * Create an instance of {@link RegistrationNationalityID }
     * 
     */
    public RegistrationNationalityID createRegistrationNationalityID() {
        return new RegistrationNationalityID();
    }

    /**
     * Create an instance of {@link RegulatoryDomain }
     * 
     */
    public RegulatoryDomain createRegulatoryDomain() {
        return new RegulatoryDomain();
    }

    /**
     * Create an instance of {@link RejectActionCode }
     * 
     */
    public RejectActionCode createRejectActionCode() {
        return new RejectActionCode();
    }

    /**
     * Create an instance of {@link RejectReason }
     * 
     */
    public RejectReason createRejectReason() {
        return new RejectReason();
    }

    /**
     * Create an instance of {@link RejectReasonCode }
     * 
     */
    public RejectReasonCode createRejectReasonCode() {
        return new RejectReasonCode();
    }

    /**
     * Create an instance of {@link RejectedQuantity }
     * 
     */
    public RejectedQuantity createRejectedQuantity() {
        return new RejectedQuantity();
    }

    /**
     * Create an instance of {@link RejectionNote }
     * 
     */
    public RejectionNote createRejectionNote() {
        return new RejectionNote();
    }

    /**
     * Create an instance of {@link ReminderSequenceNumeric }
     * 
     */
    public ReminderSequenceNumeric createReminderSequenceNumeric() {
        return new ReminderSequenceNumeric();
    }

    /**
     * Create an instance of {@link ReminderTypeCode }
     * 
     */
    public ReminderTypeCode createReminderTypeCode() {
        return new ReminderTypeCode();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link ReportTypeCode }
     * 
     */
    public ReportTypeCode createReportTypeCode() {
        return new ReportTypeCode();
    }

    /**
     * Create an instance of {@link RequestedPublicationDate }
     * 
     */
    public RequestedPublicationDate createRequestedPublicationDate() {
        return new RequestedPublicationDate();
    }

    /**
     * Create an instance of {@link RequiredCustomsID }
     * 
     */
    public RequiredCustomsID createRequiredCustomsID() {
        return new RequiredCustomsID();
    }

    /**
     * Create an instance of {@link RequiredDeliveryDate }
     * 
     */
    public RequiredDeliveryDate createRequiredDeliveryDate() {
        return new RequiredDeliveryDate();
    }

    /**
     * Create an instance of {@link RequiredDeliveryTime }
     * 
     */
    public RequiredDeliveryTime createRequiredDeliveryTime() {
        return new RequiredDeliveryTime();
    }

    /**
     * Create an instance of {@link RequiredResponseMessageLevelCode }
     * 
     */
    public RequiredResponseMessageLevelCode createRequiredResponseMessageLevelCode() {
        return new RequiredResponseMessageLevelCode();
    }

    /**
     * Create an instance of {@link RetailEventName }
     * 
     */
    public RetailEventName createRetailEventName() {
        return new RetailEventName();
    }

    /**
     * Create an instance of {@link RetailEventStatusCode }
     * 
     */
    public RetailEventStatusCode createRetailEventStatusCode() {
        return new RetailEventStatusCode();
    }

    /**
     * Create an instance of {@link ReturnabilityIndicator }
     * 
     */
    public ReturnabilityIndicator createReturnabilityIndicator() {
        return new ReturnabilityIndicator();
    }

    /**
     * Create an instance of {@link ReturnableMaterialIndicator }
     * 
     */
    public ReturnableMaterialIndicator createReturnableMaterialIndicator() {
        return new ReturnableMaterialIndicator();
    }

    /**
     * Create an instance of {@link ReturnableQuantity }
     * 
     */
    public ReturnableQuantity createReturnableQuantity() {
        return new ReturnableQuantity();
    }

    /**
     * Create an instance of {@link RevisionDate }
     * 
     */
    public RevisionDate createRevisionDate() {
        return new RevisionDate();
    }

    /**
     * Create an instance of {@link RevisionStatusCode }
     * 
     */
    public RevisionStatusCode createRevisionStatusCode() {
        return new RevisionStatusCode();
    }

    /**
     * Create an instance of {@link RevisionTime }
     * 
     */
    public RevisionTime createRevisionTime() {
        return new RevisionTime();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link RoundingAmount }
     * 
     */
    public RoundingAmount createRoundingAmount() {
        return new RoundingAmount();
    }

    /**
     * Create an instance of {@link SalinityMeasure }
     * 
     */
    public SalinityMeasure createSalinityMeasure() {
        return new SalinityMeasure();
    }

    /**
     * Create an instance of {@link SchemaURI }
     * 
     */
    public SchemaURI createSchemaURI() {
        return new SchemaURI();
    }

    /**
     * Create an instance of {@link SchemeURI }
     * 
     */
    public SchemeURI createSchemeURI() {
        return new SchemeURI();
    }

    /**
     * Create an instance of {@link SeaHeightMeasure }
     * 
     */
    public SeaHeightMeasure createSeaHeightMeasure() {
        return new SeaHeightMeasure();
    }

    /**
     * Create an instance of {@link SellerEventID }
     * 
     */
    public SellerEventID createSellerEventID() {
        return new SellerEventID();
    }

    /**
     * Create an instance of {@link SequenceID }
     * 
     */
    public SequenceID createSequenceID() {
        return new SequenceID();
    }

    /**
     * Create an instance of {@link SequenceNumberID }
     * 
     */
    public SequenceNumberID createSequenceNumberID() {
        return new SequenceNumberID();
    }

    /**
     * Create an instance of {@link ServiceInformationPreferenceCode }
     * 
     */
    public ServiceInformationPreferenceCode createServiceInformationPreferenceCode() {
        return new ServiceInformationPreferenceCode();
    }

    /**
     * Create an instance of {@link ServiceName }
     * 
     */
    public ServiceName createServiceName() {
        return new ServiceName();
    }

    /**
     * Create an instance of {@link SettlementDiscountAmount }
     * 
     */
    public SettlementDiscountAmount createSettlementDiscountAmount() {
        return new SettlementDiscountAmount();
    }

    /**
     * Create an instance of {@link SettlementDiscountPercent }
     * 
     */
    public SettlementDiscountPercent createSettlementDiscountPercent() {
        return new SettlementDiscountPercent();
    }

    /**
     * Create an instance of {@link ShipmentStageType2 }
     * 
     */
    public ShipmentStageType2 createShipmentStageType2() {
        return new ShipmentStageType2();
    }

    /**
     * Create an instance of {@link ShipmentStageTypeCode }
     * 
     */
    public ShipmentStageTypeCode createShipmentStageTypeCode() {
        return new ShipmentStageTypeCode();
    }

    /**
     * Create an instance of {@link ShippingMarks }
     * 
     */
    public ShippingMarks createShippingMarks() {
        return new ShippingMarks();
    }

    /**
     * Create an instance of {@link ShippingOrderID }
     * 
     */
    public ShippingOrderID createShippingOrderID() {
        return new ShippingOrderID();
    }

    /**
     * Create an instance of {@link ShippingPriorityLevelCode }
     * 
     */
    public ShippingPriorityLevelCode createShippingPriorityLevelCode() {
        return new ShippingPriorityLevelCode();
    }

    /**
     * Create an instance of {@link ShortQuantity }
     * 
     */
    public ShortQuantity createShortQuantity() {
        return new ShortQuantity();
    }

    /**
     * Create an instance of {@link ShortageActionCode }
     * 
     */
    public ShortageActionCode createShortageActionCode() {
        return new ShortageActionCode();
    }

    /**
     * Create an instance of {@link SizeTypeCode }
     * 
     */
    public SizeTypeCode createSizeTypeCode() {
        return new SizeTypeCode();
    }

    /**
     * Create an instance of {@link SourceCurrencyBaseRate }
     * 
     */
    public SourceCurrencyBaseRate createSourceCurrencyBaseRate() {
        return new SourceCurrencyBaseRate();
    }

    /**
     * Create an instance of {@link SourceCurrencyCode }
     * 
     */
    public SourceCurrencyCode createSourceCurrencyCode() {
        return new SourceCurrencyCode();
    }

    /**
     * Create an instance of {@link SpecialInstructions }
     * 
     */
    public SpecialInstructions createSpecialInstructions() {
        return new SpecialInstructions();
    }

    /**
     * Create an instance of {@link SpecialSecurityIndicator }
     * 
     */
    public SpecialSecurityIndicator createSpecialSecurityIndicator() {
        return new SpecialSecurityIndicator();
    }

    /**
     * Create an instance of {@link SpecialServiceInstructions }
     * 
     */
    public SpecialServiceInstructions createSpecialServiceInstructions() {
        return new SpecialServiceInstructions();
    }

    /**
     * Create an instance of {@link SpecialTransportRequirements }
     * 
     */
    public SpecialTransportRequirements createSpecialTransportRequirements() {
        return new SpecialTransportRequirements();
    }

    /**
     * Create an instance of {@link SplitConsignmentIndicator }
     * 
     */
    public SplitConsignmentIndicator createSplitConsignmentIndicator() {
        return new SplitConsignmentIndicator();
    }

    /**
     * Create an instance of {@link StartTime }
     * 
     */
    public StartTime createStartTime() {
        return new StartTime();
    }

    /**
     * Create an instance of {@link StatementTypeCode }
     * 
     */
    public StatementTypeCode createStatementTypeCode() {
        return new StatementTypeCode();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link StatusAvailableIndicator }
     * 
     */
    public StatusAvailableIndicator createStatusAvailableIndicator() {
        return new StatusAvailableIndicator();
    }

    /**
     * Create an instance of {@link StatusCode }
     * 
     */
    public StatusCode createStatusCode() {
        return new StatusCode();
    }

    /**
     * Create an instance of {@link StatusReason }
     * 
     */
    public StatusReason createStatusReason() {
        return new StatusReason();
    }

    /**
     * Create an instance of {@link StatusReasonCode }
     * 
     */
    public StatusReasonCode createStatusReasonCode() {
        return new StatusReasonCode();
    }

    /**
     * Create an instance of {@link StreetName }
     * 
     */
    public StreetName createStreetName() {
        return new StreetName();
    }

    /**
     * Create an instance of {@link SubcontractingConditionsCode }
     * 
     */
    public SubcontractingConditionsCode createSubcontractingConditionsCode() {
        return new SubcontractingConditionsCode();
    }

    /**
     * Create an instance of {@link SubmissionDueDate }
     * 
     */
    public SubmissionDueDate createSubmissionDueDate() {
        return new SubmissionDueDate();
    }

    /**
     * Create an instance of {@link SuccessiveSequenceID }
     * 
     */
    public SuccessiveSequenceID createSuccessiveSequenceID() {
        return new SuccessiveSequenceID();
    }

    /**
     * Create an instance of {@link SummaryDescription }
     * 
     */
    public SummaryDescription createSummaryDescription() {
        return new SummaryDescription();
    }

    /**
     * Create an instance of {@link SupplierAssignedAccountID }
     * 
     */
    public SupplierAssignedAccountID createSupplierAssignedAccountID() {
        return new SupplierAssignedAccountID();
    }

    /**
     * Create an instance of {@link TankID }
     * 
     */
    public TankID createTankID() {
        return new TankID();
    }

    /**
     * Create an instance of {@link TankTypeCode }
     * 
     */
    public TankTypeCode createTankTypeCode() {
        return new TankTypeCode();
    }

    /**
     * Create an instance of {@link TareWeightMeasure }
     * 
     */
    public TareWeightMeasure createTareWeightMeasure() {
        return new TareWeightMeasure();
    }

    /**
     * Create an instance of {@link TargetCurrencyBaseRate }
     * 
     */
    public TargetCurrencyBaseRate createTargetCurrencyBaseRate() {
        return new TargetCurrencyBaseRate();
    }

    /**
     * Create an instance of {@link TargetCurrencyCode }
     * 
     */
    public TargetCurrencyCode createTargetCurrencyCode() {
        return new TargetCurrencyCode();
    }

    /**
     * Create an instance of {@link TariffClassCode }
     * 
     */
    public TariffClassCode createTariffClassCode() {
        return new TariffClassCode();
    }

    /**
     * Create an instance of {@link TariffCode }
     * 
     */
    public TariffCode createTariffCode() {
        return new TariffCode();
    }

    /**
     * Create an instance of {@link TariffDescription }
     * 
     */
    public TariffDescription createTariffDescription() {
        return new TariffDescription();
    }

    /**
     * Create an instance of {@link TaxEvidenceIndicator }
     * 
     */
    public TaxEvidenceIndicator createTaxEvidenceIndicator() {
        return new TaxEvidenceIndicator();
    }

    /**
     * Create an instance of {@link TaxExclusiveAmount }
     * 
     */
    public TaxExclusiveAmount createTaxExclusiveAmount() {
        return new TaxExclusiveAmount();
    }

    /**
     * Create an instance of {@link TaxExemptionReason }
     * 
     */
    public TaxExemptionReason createTaxExemptionReason() {
        return new TaxExemptionReason();
    }

    /**
     * Create an instance of {@link TaxExemptionReasonCode }
     * 
     */
    public TaxExemptionReasonCode createTaxExemptionReasonCode() {
        return new TaxExemptionReasonCode();
    }

    /**
     * Create an instance of {@link TaxPointDate }
     * 
     */
    public TaxPointDate createTaxPointDate() {
        return new TaxPointDate();
    }

    /**
     * Create an instance of {@link Telefax }
     * 
     */
    public Telefax createTelefax() {
        return new Telefax();
    }

    /**
     * Create an instance of {@link Telephone }
     * 
     */
    public Telephone createTelephone() {
        return new Telephone();
    }

    /**
     * Create an instance of {@link TenderLanguageLocaleCode }
     * 
     */
    public TenderLanguageLocaleCode createTenderLanguageLocaleCode() {
        return new TenderLanguageLocaleCode();
    }

    /**
     * Create an instance of {@link TenderTypeCode }
     * 
     */
    public TenderTypeCode createTenderTypeCode() {
        return new TenderTypeCode();
    }

    /**
     * Create an instance of {@link TendererRequirementTypeCode }
     * 
     */
    public TendererRequirementTypeCode createTendererRequirementTypeCode() {
        return new TendererRequirementTypeCode();
    }

    /**
     * Create an instance of {@link TendererRoleCode }
     * 
     */
    public TendererRoleCode createTendererRoleCode() {
        return new TendererRoleCode();
    }

    /**
     * Create an instance of {@link TestIndicator }
     * 
     */
    public TestIndicator createTestIndicator() {
        return new TestIndicator();
    }

    /**
     * Create an instance of {@link TestMethod }
     * 
     */
    public TestMethod createTestMethod() {
        return new TestMethod();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link ThirdPartyPayerIndicator }
     * 
     */
    public ThirdPartyPayerIndicator createThirdPartyPayerIndicator() {
        return new ThirdPartyPayerIndicator();
    }

    /**
     * Create an instance of {@link ThresholdAmount }
     * 
     */
    public ThresholdAmount createThresholdAmount() {
        return new ThresholdAmount();
    }

    /**
     * Create an instance of {@link TimezoneOffset }
     * 
     */
    public TimezoneOffset createTimezoneOffset() {
        return new TimezoneOffset();
    }

    /**
     * Create an instance of {@link TimingComplaint }
     * 
     */
    public TimingComplaint createTimingComplaint() {
        return new TimingComplaint();
    }

    /**
     * Create an instance of {@link TimingComplaintCode }
     * 
     */
    public TimingComplaintCode createTimingComplaintCode() {
        return new TimingComplaintCode();
    }

    /**
     * Create an instance of {@link ToOrderIndicator }
     * 
     */
    public ToOrderIndicator createToOrderIndicator() {
        return new ToOrderIndicator();
    }

    /**
     * Create an instance of {@link TotalBalanceAmount }
     * 
     */
    public TotalBalanceAmount createTotalBalanceAmount() {
        return new TotalBalanceAmount();
    }

    /**
     * Create an instance of {@link TotalCreditAmount }
     * 
     */
    public TotalCreditAmount createTotalCreditAmount() {
        return new TotalCreditAmount();
    }

    /**
     * Create an instance of {@link TotalDebitAmount }
     * 
     */
    public TotalDebitAmount createTotalDebitAmount() {
        return new TotalDebitAmount();
    }

    /**
     * Create an instance of {@link TotalDeliveredQuantity }
     * 
     */
    public TotalDeliveredQuantity createTotalDeliveredQuantity() {
        return new TotalDeliveredQuantity();
    }

    /**
     * Create an instance of {@link TotalGoodsItemQuantity }
     * 
     */
    public TotalGoodsItemQuantity createTotalGoodsItemQuantity() {
        return new TotalGoodsItemQuantity();
    }

    /**
     * Create an instance of {@link TotalInvoiceAmount }
     * 
     */
    public TotalInvoiceAmount createTotalInvoiceAmount() {
        return new TotalInvoiceAmount();
    }

    /**
     * Create an instance of {@link TotalPackageQuantity }
     * 
     */
    public TotalPackageQuantity createTotalPackageQuantity() {
        return new TotalPackageQuantity();
    }

    /**
     * Create an instance of {@link TotalPackagesQuantity }
     * 
     */
    public TotalPackagesQuantity createTotalPackagesQuantity() {
        return new TotalPackagesQuantity();
    }

    /**
     * Create an instance of {@link TotalPaymentAmount }
     * 
     */
    public TotalPaymentAmount createTotalPaymentAmount() {
        return new TotalPaymentAmount();
    }

    /**
     * Create an instance of {@link TotalTransportHandlingUnitQuantity }
     * 
     */
    public TotalTransportHandlingUnitQuantity createTotalTransportHandlingUnitQuantity() {
        return new TotalTransportHandlingUnitQuantity();
    }

    /**
     * Create an instance of {@link TraceID }
     * 
     */
    public TraceID createTraceID() {
        return new TraceID();
    }

    /**
     * Create an instance of {@link TrackingDeviceCode }
     * 
     */
    public TrackingDeviceCode createTrackingDeviceCode() {
        return new TrackingDeviceCode();
    }

    /**
     * Create an instance of {@link TrackingID }
     * 
     */
    public TrackingID createTrackingID() {
        return new TrackingID();
    }

    /**
     * Create an instance of {@link TradeServiceCode }
     * 
     */
    public TradeServiceCode createTradeServiceCode() {
        return new TradeServiceCode();
    }

    /**
     * Create an instance of {@link TradingRestrictions }
     * 
     */
    public TradingRestrictions createTradingRestrictions() {
        return new TradingRestrictions();
    }

    /**
     * Create an instance of {@link TransactionDate }
     * 
     */
    public TransactionDate createTransactionDate() {
        return new TransactionDate();
    }

    /**
     * Create an instance of {@link TransactionID }
     * 
     */
    public TransactionID createTransactionID() {
        return new TransactionID();
    }

    /**
     * Create an instance of {@link TransactionTime }
     * 
     */
    public TransactionTime createTransactionTime() {
        return new TransactionTime();
    }

    /**
     * Create an instance of {@link TransitDirectionCode }
     * 
     */
    public TransitDirectionCode createTransitDirectionCode() {
        return new TransitDirectionCode();
    }

    /**
     * Create an instance of {@link TransportEquipmentTypeCode }
     * 
     */
    public TransportEquipmentTypeCode createTransportEquipmentTypeCode() {
        return new TransportEquipmentTypeCode();
    }

    /**
     * Create an instance of {@link TransportEquipmentTypeCodeType }
     * 
     */
    public TransportEquipmentTypeCodeType createTransportEquipmentTypeCodeType() {
        return new TransportEquipmentTypeCodeType();
    }

    /**
     * Create an instance of {@link TransportEventTypeCode }
     * 
     */
    public TransportEventTypeCode createTransportEventTypeCode() {
        return new TransportEventTypeCode();
    }

    /**
     * Create an instance of {@link TransportExecutionStatusCode }
     * 
     */
    public TransportExecutionStatusCode createTransportExecutionStatusCode() {
        return new TransportExecutionStatusCode();
    }

    /**
     * Create an instance of {@link TransportHandlingUnitTypeCode }
     * 
     */
    public TransportHandlingUnitTypeCode createTransportHandlingUnitTypeCode() {
        return new TransportHandlingUnitTypeCode();
    }

    /**
     * Create an instance of {@link TransportMeansTypeCode }
     * 
     */
    public TransportMeansTypeCode createTransportMeansTypeCode() {
        return new TransportMeansTypeCode();
    }

    /**
     * Create an instance of {@link TransportModeCode }
     * 
     */
    public TransportModeCode createTransportModeCode() {
        return new TransportModeCode();
    }

    /**
     * Create an instance of {@link TransportModeCodeType }
     * 
     */
    public TransportModeCodeType createTransportModeCodeType() {
        return new TransportModeCodeType();
    }

    /**
     * Create an instance of {@link TransportServiceCode }
     * 
     */
    public TransportServiceCode createTransportServiceCode() {
        return new TransportServiceCode();
    }

    /**
     * Create an instance of {@link TransportServiceProviderRemarks }
     * 
     */
    public TransportServiceProviderRemarks createTransportServiceProviderRemarks() {
        return new TransportServiceProviderRemarks();
    }

    /**
     * Create an instance of {@link TransportUserRemarks }
     * 
     */
    public TransportUserRemarks createTransportUserRemarks() {
        return new TransportUserRemarks();
    }

    /**
     * Create an instance of {@link TransportationServiceDescription }
     * 
     */
    public TransportationServiceDescription createTransportationServiceDescription() {
        return new TransportationServiceDescription();
    }

    /**
     * Create an instance of {@link TransportationServiceDetailsURI }
     * 
     */
    public TransportationServiceDetailsURI createTransportationServiceDetailsURI() {
        return new TransportationServiceDetailsURI();
    }

    /**
     * Create an instance of {@link TransportationStatusTypeCode }
     * 
     */
    public TransportationStatusTypeCode createTransportationStatusTypeCode() {
        return new TransportationStatusTypeCode();
    }

    /**
     * Create an instance of {@link UnknownPriceIndicator }
     * 
     */
    public UnknownPriceIndicator createUnknownPriceIndicator() {
        return new UnknownPriceIndicator();
    }

    /**
     * Create an instance of {@link VariantID }
     * 
     */
    public VariantID createVariantID() {
        return new VariantID();
    }

    /**
     * Create an instance of {@link VersionID }
     * 
     */
    public VersionID createVersionID() {
        return new VersionID();
    }

    /**
     * Create an instance of {@link VolumeMeasure }
     * 
     */
    public VolumeMeasure createVolumeMeasure() {
        return new VolumeMeasure();
    }

    /**
     * Create an instance of {@link WaybillTypeCode }
     * 
     */
    public WaybillTypeCode createWaybillTypeCode() {
        return new WaybillTypeCode();
    }

    /**
     * Create an instance of {@link WebSiteTypeCode }
     * 
     */
    public WebSiteTypeCode createWebSiteTypeCode() {
        return new WebSiteTypeCode();
    }

    /**
     * Create an instance of {@link WebsiteURI }
     * 
     */
    public WebsiteURI createWebsiteURI() {
        return new WebsiteURI();
    }

    /**
     * Create an instance of {@link WeekDayCode }
     * 
     */
    public WeekDayCode createWeekDayCode() {
        return new WeekDayCode();
    }

    /**
     * Create an instance of {@link WeekDayCodeType }
     * 
     */
    public WeekDayCodeType createWeekDayCodeType() {
        return new WeekDayCodeType();
    }

    /**
     * Create an instance of {@link Weight }
     * 
     */
    public Weight createWeight() {
        return new Weight();
    }

    /**
     * Create an instance of {@link WeightNumeric }
     * 
     */
    public WeightNumeric createWeightNumeric() {
        return new WeightNumeric();
    }

    /**
     * Create an instance of {@link WeightScoringMethodologyNote }
     * 
     */
    public WeightScoringMethodologyNote createWeightScoringMethodologyNote() {
        return new WeightScoringMethodologyNote();
    }

    /**
     * Create an instance of {@link WeightStatementTypeCode }
     * 
     */
    public WeightStatementTypeCode createWeightStatementTypeCode() {
        return new WeightStatementTypeCode();
    }

    /**
     * Create an instance of {@link WeightingConsiderationDescription }
     * 
     */
    public WeightingConsiderationDescription createWeightingConsiderationDescription() {
        return new WeightingConsiderationDescription();
    }

    /**
     * Create an instance of {@link WeightingTypeCode }
     * 
     */
    public WeightingTypeCode createWeightingTypeCode() {
        return new WeightingTypeCode();
    }

    /**
     * Create an instance of {@link WithdrawOfferIndicator }
     * 
     */
    public WithdrawOfferIndicator createWithdrawOfferIndicator() {
        return new WithdrawOfferIndicator();
    }

    /**
     * Create an instance of {@link WithholdingTaxTotalAmount }
     * 
     */
    public WithholdingTaxTotalAmount createWithholdingTaxTotalAmount() {
        return new WithholdingTaxTotalAmount();
    }

    /**
     * Create an instance of {@link XPath }
     * 
     */
    public XPath createXPath() {
        return new XPath();
    }

    /**
     * Create an instance of {@link GraphicType }
     * 
     */
    public GraphicType createGraphicType() {
        return new GraphicType();
    }

    /**
     * Create an instance of {@link PictureType }
     * 
     */
    public PictureType createPictureType() {
        return new PictureType();
    }

    /**
     * Create an instance of {@link SoundType }
     * 
     */
    public SoundType createSoundType() {
        return new SoundType();
    }

    /**
     * Create an instance of {@link VideoType }
     * 
     */
    public VideoType createVideoType() {
        return new VideoType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link ValueType }
     * 
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link DateTimeType2 }
     * 
     */
    public DateTimeType2 createDateTimeType2() {
        return new DateTimeType2();
    }

    /**
     * Create an instance of {@link IndicatorType2 }
     * 
     */
    public IndicatorType2 createIndicatorType2() {
        return new IndicatorType2();
    }

    /**
     * Create an instance of {@link UBLDocumentSignatures }
     * 
     */
    public UBLDocumentSignatures createUBLDocumentSignatures() {
        return new UBLDocumentSignatures();
    }

    /**
     * Create an instance of {@link SignatureInformation }
     * 
     */
    public SignatureInformation createSignatureInformation() {
        return new SignatureInformation();
    }

    /**
     * Create an instance of {@link ReferencedSignatureID }
     * 
     */
    public ReferencedSignatureID createReferencedSignatureID() {
        return new ReferencedSignatureID();
    }

    /**
     * Create an instance of {@link Signature2 }
     * 
     */
    public Signature2 createSignature2() {
        return new Signature2();
    }

    /**
     * Create an instance of {@link SignedInfo }
     * 
     */
    public SignedInfo createSignedInfo() {
        return new SignedInfo();
    }

    /**
     * Create an instance of {@link CanonicalizationMethod2 }
     * 
     */
    public CanonicalizationMethod2 createCanonicalizationMethod2() {
        return new CanonicalizationMethod2();
    }

    /**
     * Create an instance of {@link SignatureMethod2 }
     * 
     */
    public SignatureMethod2 createSignatureMethod2() {
        return new SignatureMethod2();
    }

    /**
     * Create an instance of {@link Reference2 }
     * 
     */
    public Reference2 createReference2() {
        return new Reference2();
    }

    /**
     * Create an instance of {@link Transforms }
     * 
     */
    public Transforms createTransforms() {
        return new Transforms();
    }

    /**
     * Create an instance of {@link Transform }
     * 
     */
    public Transform createTransform() {
        return new Transform();
    }

    /**
     * Create an instance of {@link DigestMethod }
     * 
     */
    public DigestMethod createDigestMethod() {
        return new DigestMethod();
    }

    /**
     * Create an instance of {@link SignatureValue }
     * 
     */
    public SignatureValue createSignatureValue() {
        return new SignatureValue();
    }

    /**
     * Create an instance of {@link KeyInfo }
     * 
     */
    public KeyInfo createKeyInfo() {
        return new KeyInfo();
    }

    /**
     * Create an instance of {@link KeyValue }
     * 
     */
    public KeyValue createKeyValue() {
        return new KeyValue();
    }

    /**
     * Create an instance of {@link DSAKeyValue }
     * 
     */
    public DSAKeyValue createDSAKeyValue() {
        return new DSAKeyValue();
    }

    /**
     * Create an instance of {@link RSAKeyValue }
     * 
     */
    public RSAKeyValue createRSAKeyValue() {
        return new RSAKeyValue();
    }

    /**
     * Create an instance of {@link RetrievalMethod }
     * 
     */
    public RetrievalMethod createRetrievalMethod() {
        return new RetrievalMethod();
    }

    /**
     * Create an instance of {@link X509Data }
     * 
     */
    public X509Data createX509Data() {
        return new X509Data();
    }

    /**
     * Create an instance of {@link X509IssuerSerialType }
     * 
     */
    public X509IssuerSerialType createX509IssuerSerialType() {
        return new X509IssuerSerialType();
    }

    /**
     * Create an instance of {@link PGPData }
     * 
     */
    public PGPData createPGPData() {
        return new PGPData();
    }

    /**
     * Create an instance of {@link SPKIData }
     * 
     */
    public SPKIData createSPKIData() {
        return new SPKIData();
    }

    /**
     * Create an instance of {@link java.lang.Object }
     * 
     */
    public java.lang.Object createObject() {
        return new java.lang.Object();
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link SignatureProperties }
     * 
     */
    public SignatureProperties createSignatureProperties() {
        return new SignatureProperties();
    }

    /**
     * Create an instance of {@link SignatureProperty }
     * 
     */
    public SignatureProperty createSignatureProperty() {
        return new SignatureProperty();
    }

    /**
     * Create an instance of {@link ECKeyValue }
     * 
     */
    public ECKeyValue createECKeyValue() {
        return new ECKeyValue();
    }

    /**
     * Create an instance of {@link NamedCurveType }
     * 
     */
    public NamedCurveType createNamedCurveType() {
        return new NamedCurveType();
    }

    /**
     * Create an instance of {@link ECParametersType }
     * 
     */
    public ECParametersType createECParametersType() {
        return new ECParametersType();
    }

    /**
     * Create an instance of {@link Prime }
     * 
     */
    public Prime createPrime() {
        return new Prime();
    }

    /**
     * Create an instance of {@link CharTwoFieldParamsType }
     * 
     */
    public CharTwoFieldParamsType createCharTwoFieldParamsType() {
        return new CharTwoFieldParamsType();
    }

    /**
     * Create an instance of {@link TnB }
     * 
     */
    public TnB createTnB() {
        return new TnB();
    }

    /**
     * Create an instance of {@link PnB }
     * 
     */
    public PnB createPnB() {
        return new PnB();
    }

    /**
     * Create an instance of {@link DEREncodedKeyValue }
     * 
     */
    public DEREncodedKeyValue createDEREncodedKeyValue() {
        return new DEREncodedKeyValue();
    }

    /**
     * Create an instance of {@link KeyInfoReference }
     * 
     */
    public KeyInfoReference createKeyInfoReference() {
        return new KeyInfoReference();
    }

    /**
     * Create an instance of {@link X509Digest }
     * 
     */
    public X509Digest createX509Digest() {
        return new X509Digest();
    }

    /**
     * Create an instance of {@link FieldIDType }
     * 
     */
    public FieldIDType createFieldIDType() {
        return new FieldIDType();
    }

    /**
     * Create an instance of {@link CurveType }
     * 
     */
    public CurveType createCurveType() {
        return new CurveType();
    }

    /**
     * Create an instance of {@link ECValidationDataType }
     * 
     */
    public ECValidationDataType createECValidationDataType() {
        return new ECValidationDataType();
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link ObjectIdentifierType }
     * 
     */
    public ObjectIdentifierType createObjectIdentifierType() {
        return new ObjectIdentifierType();
    }

    /**
     * Create an instance of {@link EncapsulatedPKIDataType }
     * 
     */
    public EncapsulatedPKIDataType createEncapsulatedPKIDataType() {
        return new EncapsulatedPKIDataType();
    }

    /**
     * Create an instance of {@link Include }
     * 
     */
    public Include createInclude() {
        return new Include();
    }

    /**
     * Create an instance of {@link ReferenceInfo }
     * 
     */
    public ReferenceInfo createReferenceInfo() {
        return new ReferenceInfo();
    }

    /**
     * Create an instance of {@link XAdESTimeStampType }
     * 
     */
    public XAdESTimeStampType createXAdESTimeStampType() {
        return new XAdESTimeStampType();
    }

    /**
     * Create an instance of {@link OtherTimeStamp }
     * 
     */
    public OtherTimeStamp createOtherTimeStamp() {
        return new OtherTimeStamp();
    }

    /**
     * Create an instance of {@link QualifyingProperties }
     * 
     */
    public QualifyingProperties createQualifyingProperties() {
        return new QualifyingProperties();
    }

    /**
     * Create an instance of {@link SignedProperties }
     * 
     */
    public SignedProperties createSignedProperties() {
        return new SignedProperties();
    }

    /**
     * Create an instance of {@link SignedSignatureProperties }
     * 
     */
    public SignedSignatureProperties createSignedSignatureProperties() {
        return new SignedSignatureProperties();
    }

    /**
     * Create an instance of {@link SigningCertificate }
     * 
     */
    public SigningCertificate createSigningCertificate() {
        return new SigningCertificate();
    }

    /**
     * Create an instance of {@link CertIDType }
     * 
     */
    public CertIDType createCertIDType() {
        return new CertIDType();
    }

    /**
     * Create an instance of {@link SigningCertificateV2 }
     * 
     */
    public SigningCertificateV2 createSigningCertificateV2() {
        return new SigningCertificateV2();
    }

    /**
     * Create an instance of {@link CertIDTypeV2 }
     * 
     */
    public CertIDTypeV2 createCertIDTypeV2() {
        return new CertIDTypeV2();
    }

    /**
     * Create an instance of {@link SignaturePolicyIdentifier }
     * 
     */
    public SignaturePolicyIdentifier createSignaturePolicyIdentifier() {
        return new SignaturePolicyIdentifier();
    }

    /**
     * Create an instance of {@link SignaturePolicyIdType }
     * 
     */
    public SignaturePolicyIdType createSignaturePolicyIdType() {
        return new SignaturePolicyIdType();
    }

    /**
     * Create an instance of {@link SignatureProductionPlace }
     * 
     */
    public SignatureProductionPlace createSignatureProductionPlace() {
        return new SignatureProductionPlace();
    }

    /**
     * Create an instance of {@link SignatureProductionPlaceV2 }
     * 
     */
    public SignatureProductionPlaceV2 createSignatureProductionPlaceV2() {
        return new SignatureProductionPlaceV2();
    }

    /**
     * Create an instance of {@link SignerRole }
     * 
     */
    public SignerRole createSignerRole() {
        return new SignerRole();
    }

    /**
     * Create an instance of {@link ClaimedRoles }
     * 
     */
    public ClaimedRoles createClaimedRoles() {
        return new ClaimedRoles();
    }

    /**
     * Create an instance of {@link CertifiedRolesListType }
     * 
     */
    public CertifiedRolesListType createCertifiedRolesListType() {
        return new CertifiedRolesListType();
    }

    /**
     * Create an instance of {@link SignerRoleV2 }
     * 
     */
    public SignerRoleV2 createSignerRoleV2() {
        return new SignerRoleV2();
    }

    /**
     * Create an instance of {@link CertifiedRolesV2 }
     * 
     */
    public CertifiedRolesV2 createCertifiedRolesV2() {
        return new CertifiedRolesV2();
    }

    /**
     * Create an instance of {@link CertifiedRoleTypeV2 }
     * 
     */
    public CertifiedRoleTypeV2 createCertifiedRoleTypeV2() {
        return new CertifiedRoleTypeV2();
    }

    /**
     * Create an instance of {@link SignedAssertions }
     * 
     */
    public SignedAssertions createSignedAssertions() {
        return new SignedAssertions();
    }

    /**
     * Create an instance of {@link SignedDataObjectProperties }
     * 
     */
    public SignedDataObjectProperties createSignedDataObjectProperties() {
        return new SignedDataObjectProperties();
    }

    /**
     * Create an instance of {@link DataObjectFormat }
     * 
     */
    public DataObjectFormat createDataObjectFormat() {
        return new DataObjectFormat();
    }

    /**
     * Create an instance of {@link CommitmentTypeIndication }
     * 
     */
    public CommitmentTypeIndication createCommitmentTypeIndication() {
        return new CommitmentTypeIndication();
    }

    /**
     * Create an instance of {@link CommitmentTypeQualifiersListType }
     * 
     */
    public CommitmentTypeQualifiersListType createCommitmentTypeQualifiersListType() {
        return new CommitmentTypeQualifiersListType();
    }

    /**
     * Create an instance of {@link UnsignedProperties }
     * 
     */
    public UnsignedProperties createUnsignedProperties() {
        return new UnsignedProperties();
    }

    /**
     * Create an instance of {@link UnsignedSignatureProperties }
     * 
     */
    public UnsignedSignatureProperties createUnsignedSignatureProperties() {
        return new UnsignedSignatureProperties();
    }

    /**
     * Create an instance of {@link CounterSignature }
     * 
     */
    public CounterSignature createCounterSignature() {
        return new CounterSignature();
    }

    /**
     * Create an instance of {@link CompleteCertificateRefsType }
     * 
     */
    public CompleteCertificateRefsType createCompleteCertificateRefsType() {
        return new CompleteCertificateRefsType();
    }

    /**
     * Create an instance of {@link CompleteRevocationRefsType }
     * 
     */
    public CompleteRevocationRefsType createCompleteRevocationRefsType() {
        return new CompleteRevocationRefsType();
    }

    /**
     * Create an instance of {@link CertificateValuesType }
     * 
     */
    public CertificateValuesType createCertificateValuesType() {
        return new CertificateValuesType();
    }

    /**
     * Create an instance of {@link RevocationValuesType }
     * 
     */
    public RevocationValuesType createRevocationValuesType() {
        return new RevocationValuesType();
    }

    /**
     * Create an instance of {@link UnsignedDataObjectProperties }
     * 
     */
    public UnsignedDataObjectProperties createUnsignedDataObjectProperties() {
        return new UnsignedDataObjectProperties();
    }

    /**
     * Create an instance of {@link QualifyingPropertiesReference }
     * 
     */
    public QualifyingPropertiesReference createQualifyingPropertiesReference() {
        return new QualifyingPropertiesReference();
    }

    /**
     * Create an instance of {@link SPUserNotice }
     * 
     */
    public SPUserNotice createSPUserNotice() {
        return new SPUserNotice();
    }

    /**
     * Create an instance of {@link NoticeReferenceType }
     * 
     */
    public NoticeReferenceType createNoticeReferenceType() {
        return new NoticeReferenceType();
    }

    /**
     * Create an instance of {@link IdentifierType3 }
     * 
     */
    public IdentifierType3 createIdentifierType3() {
        return new IdentifierType3();
    }

    /**
     * Create an instance of {@link DocumentationReferencesType }
     * 
     */
    public DocumentationReferencesType createDocumentationReferencesType() {
        return new DocumentationReferencesType();
    }

    /**
     * Create an instance of {@link DigestAlgAndValueType }
     * 
     */
    public DigestAlgAndValueType createDigestAlgAndValueType() {
        return new DigestAlgAndValueType();
    }

    /**
     * Create an instance of {@link SigPolicyQualifiersListType }
     * 
     */
    public SigPolicyQualifiersListType createSigPolicyQualifiersListType() {
        return new SigPolicyQualifiersListType();
    }

    /**
     * Create an instance of {@link IntegerListType }
     * 
     */
    public IntegerListType createIntegerListType() {
        return new IntegerListType();
    }

    /**
     * Create an instance of {@link CRLRefsType }
     * 
     */
    public CRLRefsType createCRLRefsType() {
        return new CRLRefsType();
    }

    /**
     * Create an instance of {@link CRLRefType }
     * 
     */
    public CRLRefType createCRLRefType() {
        return new CRLRefType();
    }

    /**
     * Create an instance of {@link CRLIdentifierType }
     * 
     */
    public CRLIdentifierType createCRLIdentifierType() {
        return new CRLIdentifierType();
    }

    /**
     * Create an instance of {@link OCSPRefsType }
     * 
     */
    public OCSPRefsType createOCSPRefsType() {
        return new OCSPRefsType();
    }

    /**
     * Create an instance of {@link OCSPRefType }
     * 
     */
    public OCSPRefType createOCSPRefType() {
        return new OCSPRefType();
    }

    /**
     * Create an instance of {@link ResponderIDType }
     * 
     */
    public ResponderIDType createResponderIDType() {
        return new ResponderIDType();
    }

    /**
     * Create an instance of {@link OCSPIdentifierType }
     * 
     */
    public OCSPIdentifierType createOCSPIdentifierType() {
        return new OCSPIdentifierType();
    }

    /**
     * Create an instance of {@link OtherCertStatusRefsType }
     * 
     */
    public OtherCertStatusRefsType createOtherCertStatusRefsType() {
        return new OtherCertStatusRefsType();
    }

    /**
     * Create an instance of {@link CRLValuesType }
     * 
     */
    public CRLValuesType createCRLValuesType() {
        return new CRLValuesType();
    }

    /**
     * Create an instance of {@link OCSPValuesType }
     * 
     */
    public OCSPValuesType createOCSPValuesType() {
        return new OCSPValuesType();
    }

    /**
     * Create an instance of {@link OtherCertStatusValuesType }
     * 
     */
    public OtherCertStatusValuesType createOtherCertStatusValuesType() {
        return new OtherCertStatusValuesType();
    }

    /**
     * Create an instance of {@link TimeStampValidationData }
     * 
     */
    public TimeStampValidationData createTimeStampValidationData() {
        return new TimeStampValidationData();
    }

    /**
     * Create an instance of {@link SignaturePolicyStore }
     * 
     */
    public SignaturePolicyStore createSignaturePolicyStore() {
        return new SignaturePolicyStore();
    }

    /**
     * Create an instance of {@link RenewedDigests }
     * 
     */
    public RenewedDigests createRenewedDigests() {
        return new RenewedDigests();
    }

    /**
     * Create an instance of {@link RecomputedDigestValue }
     * 
     */
    public RecomputedDigestValue createRecomputedDigestValue() {
        return new RecomputedDigestValue();
    }

    /**
     * Create an instance of {@link CompleteCertificateRefsTypeV2 }
     * 
     */
    public CompleteCertificateRefsTypeV2 createCompleteCertificateRefsTypeV2() {
        return new CompleteCertificateRefsTypeV2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ValidityPeriod")
    public JAXBElement<PeriodType> createValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QuotationDocumentReference")
    public JAXBElement<DocumentReferenceType> createQuotationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_QuotationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OrderDocumentReference")
    public JAXBElement<DocumentReferenceType> createOrderDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_OrderDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginatorDocumentReference")
    public JAXBElement<DocumentReferenceType> createOriginatorDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_OriginatorDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueReference")
    public JAXBElement<CatalogueReferenceType> createCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_CatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalDocumentReference")
    public JAXBElement<DocumentReferenceType> createAdditionalDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_AdditionalDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Contract")
    public JAXBElement<ContractType> createContract(ContractType value) {
        return new JAXBElement<ContractType>(_Contract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WorkOrderDocumentReference")
    public JAXBElement<DocumentReferenceType> createWorkOrderDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_WorkOrderDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SignatoryParty")
    public JAXBElement<PartyType> createSignatoryParty(PartyType value) {
        return new JAXBElement<PartyType>(_SignatoryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DigitalSignatureAttachment")
    public JAXBElement<AttachmentType> createDigitalSignatureAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_DigitalSignatureAttachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalDocumentReference")
    public JAXBElement<DocumentReferenceType> createOriginalDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_OriginalDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BuyerCustomerParty")
    public JAXBElement<CustomerPartyType> createBuyerCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_BuyerCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellerSupplierParty")
    public JAXBElement<SupplierPartyType> createSellerSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_SellerSupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginatorCustomerParty")
    public JAXBElement<CustomerPartyType> createOriginatorCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_OriginatorCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FreightForwarderParty")
    public JAXBElement<PartyType> createFreightForwarderParty(PartyType value) {
        return new JAXBElement<PartyType>(_FreightForwarderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AccountingCustomerParty")
    public JAXBElement<CustomerPartyType> createAccountingCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_AccountingCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Delivery")
    public JAXBElement<DeliveryType> createDelivery(DeliveryType value) {
        return new JAXBElement<DeliveryType>(_Delivery_QNAME, DeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryLocation")
    public JAXBElement<LocationType> createDeliveryLocation(LocationType value) {
        return new JAXBElement<LocationType>(_DeliveryLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AllowanceCharge")
    public JAXBElement<AllowanceChargeType> createAllowanceCharge(AllowanceChargeType value) {
        return new JAXBElement<AllowanceChargeType>(_AllowanceCharge_QNAME, AllowanceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PayerFinancialAccount")
    public JAXBElement<FinancialAccountType> createPayerFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_PayerFinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PayeeFinancialAccount")
    public JAXBElement<FinancialAccountType> createPayeeFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_PayeeFinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PayerParty")
    public JAXBElement<PartyType> createPayerParty(PartyType value) {
        return new JAXBElement<PartyType>(_PayerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PaymentReversalPeriod")
    public JAXBElement<PeriodType> createPaymentReversalPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_PaymentReversalPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClauseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Clause")
    public JAXBElement<ClauseType> createClause(ClauseType value) {
        return new JAXBElement<ClauseType>(_Clause_QNAME, ClauseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractDocumentReference")
    public JAXBElement<DocumentReferenceType> createContractDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ContractDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentReference")
    public JAXBElement<DocumentReferenceType> createDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancingParty")
    public JAXBElement<PartyType> createFinancingParty(PartyType value) {
        return new JAXBElement<PartyType>(_FinancingParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancingFinancialAccount")
    public JAXBElement<FinancialAccountType> createFinancingFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_FinancingFinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDistributionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RemittanceDocumentDistribution")
    public JAXBElement<DocumentDistributionType> createRemittanceDocumentDistribution(DocumentDistributionType value) {
        return new JAXBElement<DocumentDistributionType>(_RemittanceDocumentDistribution_QNAME, DocumentDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PaymentTerms")
    public JAXBElement<PaymentTermsType> createPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_PaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxExchangeRate")
    public JAXBElement<ExchangeRateType> createTaxExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_TaxExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PricingExchangeRate")
    public JAXBElement<ExchangeRateType> createPricingExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_PricingExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PaymentExchangeRate")
    public JAXBElement<ExchangeRateType> createPaymentExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_PaymentExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DestinationCountry")
    public JAXBElement<CountryType> createDestinationCountry(CountryType value) {
        return new JAXBElement<CountryType>(_DestinationCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxTotal")
    public JAXBElement<TaxTotalType> createTaxTotal(TaxTotalType value) {
        return new JAXBElement<TaxTotalType>(_TaxTotal_QNAME, TaxTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AnticipatedMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createAnticipatedMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_AnticipatedMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LineItem")
    public JAXBElement<LineItemType> createLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_LineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellerProposedSubstituteLineItem")
    public JAXBElement<LineItemType> createSellerProposedSubstituteLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_SellerProposedSubstituteLineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellerSubstitutedLineItem")
    public JAXBElement<LineItemType> createSellerSubstitutedLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_SellerSubstitutedLineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BuyerProposedSubstituteLineItem")
    public JAXBElement<LineItemType> createBuyerProposedSubstituteLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_BuyerProposedSubstituteLineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueLineReference")
    public JAXBElement<LineReferenceType> createCatalogueLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_CatalogueLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QuotationLineReference")
    public JAXBElement<LineReferenceType> createQuotationLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_QuotationLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AcceptanceTransportEvent")
    public JAXBElement<TransportEventType> createAcceptanceTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_AcceptanceTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AccessoryRelatedItem")
    public JAXBElement<RelatedItemType> createAccessoryRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_AccessoryRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AccountingContact")
    public JAXBElement<ContactType> createAccountingContact(ContactType value) {
        return new JAXBElement<ContactType>(_AccountingContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AccountingSupplierParty")
    public JAXBElement<SupplierPartyType> createAccountingSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_AccountingSupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityDataLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActivityDataLine")
    public JAXBElement<ActivityDataLineType> createActivityDataLine(ActivityDataLineType value) {
        return new JAXBElement<ActivityDataLineType>(_ActivityDataLine_QNAME, ActivityDataLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActivityFinalLocation")
    public JAXBElement<LocationType> createActivityFinalLocation(LocationType value) {
        return new JAXBElement<LocationType>(_ActivityFinalLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActivityOriginLocation")
    public JAXBElement<LocationType> createActivityOriginLocation(LocationType value) {
        return new JAXBElement<LocationType>(_ActivityOriginLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActivityPeriod")
    public JAXBElement<PeriodType> createActivityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ActivityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActualArrivalTransportEvent")
    public JAXBElement<TransportEventType> createActualArrivalTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_ActualArrivalTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActualDeliveryTransportEvent")
    public JAXBElement<TransportEventType> createActualDeliveryTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_ActualDeliveryTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActualDepartureTransportEvent")
    public JAXBElement<TransportEventType> createActualDepartureTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_ActualDepartureTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActualPackage")
    public JAXBElement<PackageType> createActualPackage(PackageType value) {
        return new JAXBElement<PackageType>(_ActualPackage_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActualPickupTransportEvent")
    public JAXBElement<TransportEventType> createActualPickupTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_ActualPickupTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActualWaypointTransportEvent")
    public JAXBElement<TransportEventType> createActualWaypointTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_ActualWaypointTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalCommodityClassification")
    public JAXBElement<CommodityClassificationType> createAdditionalCommodityClassification(CommodityClassificationType value) {
        return new JAXBElement<CommodityClassificationType>(_AdditionalCommodityClassification_QNAME, CommodityClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalDocumentResponse")
    public JAXBElement<DocumentResponseType> createAdditionalDocumentResponse(DocumentResponseType value) {
        return new JAXBElement<DocumentResponseType>(_AdditionalDocumentResponse_QNAME, DocumentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalFee")
    public JAXBElement<FeeType> createAdditionalFee(FeeType value) {
        return new JAXBElement<FeeType>(_AdditionalFee_QNAME, FeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuelPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalFuelProperty")
    public JAXBElement<FuelPropertyType> createAdditionalFuelProperty(FuelPropertyType value) {
        return new JAXBElement<FuelPropertyType>(_AdditionalFuelProperty_QNAME, FuelPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalInformationParty")
    public JAXBElement<PartyType> createAdditionalInformationParty(PartyType value) {
        return new JAXBElement<PartyType>(_AdditionalInformationParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalInformationRequestPeriod")
    public JAXBElement<PeriodType> createAdditionalInformationRequestPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_AdditionalInformationRequestPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalItemIdentification")
    public JAXBElement<ItemIdentificationType> createAdditionalItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_AdditionalItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalItemProperty")
    public JAXBElement<ItemPropertyType> createAdditionalItemProperty(ItemPropertyType value) {
        return new JAXBElement<ItemPropertyType>(_AdditionalItemProperty_QNAME, ItemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalNoticeLanguage")
    public JAXBElement<LanguageType> createAdditionalNoticeLanguage(LanguageType value) {
        return new JAXBElement<LanguageType>(_AdditionalNoticeLanguage_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortCallPurposeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalPortCallPurpose")
    public JAXBElement<PortCallPurposeType> createAdditionalPortCallPurpose(PortCallPurposeType value) {
        return new JAXBElement<PortCallPurposeType>(_AdditionalPortCallPurpose_QNAME, PortCallPurposeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifyingPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalQualifyingParty")
    public JAXBElement<QualifyingPartyType> createAdditionalQualifyingParty(QualifyingPartyType value) {
        return new JAXBElement<QualifyingPartyType>(_AdditionalQualifyingParty_QNAME, QualifyingPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalSecurityMeasure")
    public JAXBElement<SecurityMeasureType> createAdditionalSecurityMeasure(SecurityMeasureType value) {
        return new JAXBElement<SecurityMeasureType>(_AdditionalSecurityMeasure_QNAME, SecurityMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalTemperature")
    public JAXBElement<TemperatureType> createAdditionalTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_AdditionalTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalTransportationService")
    public JAXBElement<TransportationServiceType> createAdditionalTransportationService(TransportationServiceType value) {
        return new JAXBElement<TransportationServiceType>(_AdditionalTransportationService_QNAME, TransportationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebSiteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalWebSite")
    public JAXBElement<WebSiteType> createAdditionalWebSite(WebSiteType value) {
        return new JAXBElement<WebSiteType>(_AdditionalWebSite_QNAME, WebSiteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdoptionPeriod")
    public JAXBElement<PeriodType> createAdoptionPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_AdoptionPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AgentParty")
    public JAXBElement<PartyType> createAgentParty(PartyType value) {
        return new JAXBElement<PartyType>(_AgentParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AgreementCountry")
    public JAXBElement<CountryType> createAgreementCountry(CountryType value) {
        return new JAXBElement<CountryType>(_AgreementCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubcontractTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AllowedSubcontractTerms")
    public JAXBElement<SubcontractTermsType> createAllowedSubcontractTerms(SubcontractTermsType value) {
        return new JAXBElement<SubcontractTermsType>(_AllowedSubcontractTerms_QNAME, SubcontractTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AlternativeConditionPrice")
    public JAXBElement<PriceType> createAlternativeConditionPrice(PriceType value) {
        return new JAXBElement<PriceType>(_AlternativeConditionPrice_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AlternativeCurrencyPrice")
    public JAXBElement<PriceType> createAlternativeCurrencyPrice(PriceType value) {
        return new JAXBElement<PriceType>(_AlternativeCurrencyPrice_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AlternativeDeliveryLocation")
    public JAXBElement<LocationType> createAlternativeDeliveryLocation(LocationType value) {
        return new JAXBElement<LocationType>(_AlternativeDeliveryLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AlternativeLineItem")
    public JAXBElement<LineItemType> createAlternativeLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_AlternativeLineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AppealInformationParty")
    public JAXBElement<PartyType> createAppealInformationParty(PartyType value) {
        return new JAXBElement<PartyType>(_AppealInformationParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AppealReceiverParty")
    public JAXBElement<PartyType> createAppealReceiverParty(PartyType value) {
        return new JAXBElement<PartyType>(_AppealReceiverParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PresentationPeriod")
    public JAXBElement<PeriodType> createPresentationPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_PresentationPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MediationParty")
    public JAXBElement<PartyType> createMediationParty(PartyType value) {
        return new JAXBElement<PartyType>(_MediationParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableAddress")
    public JAXBElement<AddressType> createApplicableAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ApplicableAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableDeliveryPeriod")
    public JAXBElement<PeriodType> createApplicableDeliveryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ApplicableDeliveryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicablePeriod")
    public JAXBElement<PeriodType> createApplicablePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ApplicablePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegulationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableRegulation")
    public JAXBElement<RegulationType> createApplicableRegulation(RegulationType value) {
        return new JAXBElement<RegulationType>(_ApplicableRegulation_QNAME, RegulationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableTaxCategory")
    public JAXBElement<TaxCategoryType> createApplicableTaxCategory(TaxCategoryType value) {
        return new JAXBElement<TaxCategoryType>(_ApplicableTaxCategory_QNAME, TaxCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableTerritoryAddress")
    public JAXBElement<AddressType> createApplicableTerritoryAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ApplicableTerritoryAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableTransportMeans")
    public JAXBElement<TransportMeansType> createApplicableTransportMeans(TransportMeansType value) {
        return new JAXBElement<TransportMeansType>(_ApplicableTransportMeans_QNAME, TransportMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicantParty")
    public JAXBElement<PartyType> createApplicantParty(PartyType value) {
        return new JAXBElement<PartyType>(_ApplicantParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AppliedSecurityMeasure")
    public JAXBElement<SecurityMeasureType> createAppliedSecurityMeasure(SecurityMeasureType value) {
        return new JAXBElement<SecurityMeasureType>(_AppliedSecurityMeasure_QNAME, SecurityMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AtLocation")
    public JAXBElement<LocationType> createAtLocation(LocationType value) {
        return new JAXBElement<LocationType>(_AtLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AttachedTransportEquipment")
    public JAXBElement<TransportEquipmentType> createAttachedTransportEquipment(TransportEquipmentType value) {
        return new JAXBElement<TransportEquipmentType>(_AttachedTransportEquipment_QNAME, TransportEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Attachment")
    public JAXBElement<AttachmentType> createAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_Attachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "IssuerParty")
    public JAXBElement<PartyType> createIssuerParty(PartyType value) {
        return new JAXBElement<PartyType>(_IssuerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttestationLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AttestationLine")
    public JAXBElement<AttestationLineType> createAttestationLine(AttestationLineType value) {
        return new JAXBElement<AttestationLineType>(_AttestationLine_QNAME, AttestationLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AuthorityParty")
    public JAXBElement<PartyType> createAuthorityParty(PartyType value) {
        return new JAXBElement<PartyType>(_AuthorityParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Authorization")
    public JAXBElement<AuthorizationType> createAuthorization(AuthorizationType value) {
        return new JAXBElement<AuthorizationType>(_Authorization_QNAME, AuthorizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AvailabilityTransportEvent")
    public JAXBElement<TransportEventType> createAvailabilityTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_AvailabilityTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderedProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AwardedTenderedProject")
    public JAXBElement<TenderedProjectType> createAwardedTenderedProject(TenderedProjectType value) {
        return new JAXBElement<TenderedProjectType>(_AwardedTenderedProject_QNAME, TenderedProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardingCriterionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AwardingCriterion")
    public JAXBElement<AwardingCriterionType> createAwardingCriterion(AwardingCriterionType value) {
        return new JAXBElement<AwardingCriterionType>(_AwardingCriterion_QNAME, AwardingCriterionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardingCriterionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AwardingCriterionResponse")
    public JAXBElement<AwardingCriterionResponseType> createAwardingCriterionResponse(AwardingCriterionResponseType value) {
        return new JAXBElement<AwardingCriterionResponseType>(_AwardingCriterionResponse_QNAME, AwardingCriterionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TechnicalCommitteePerson")
    public JAXBElement<PersonType> createTechnicalCommitteePerson(PersonType value) {
        return new JAXBElement<PersonType>(_TechnicalCommitteePerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BallastWaterTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UptakeBallastWaterTransaction")
    public JAXBElement<BallastWaterTransactionType> createUptakeBallastWaterTransaction(BallastWaterTransactionType value) {
        return new JAXBElement<BallastWaterTransactionType>(_UptakeBallastWaterTransaction_QNAME, BallastWaterTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BallastWaterTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExchangeBallastWaterTransaction")
    public JAXBElement<BallastWaterTransactionType> createExchangeBallastWaterTransaction(BallastWaterTransactionType value) {
        return new JAXBElement<BallastWaterTransactionType>(_ExchangeBallastWaterTransaction_QNAME, BallastWaterTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BallastWaterTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DischargeBallastWaterTransaction")
    public JAXBElement<BallastWaterTransactionType> createDischargeBallastWaterTransaction(BallastWaterTransactionType value) {
        return new JAXBElement<BallastWaterTransactionType>(_DischargeBallastWaterTransaction_QNAME, BallastWaterTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ResponsibleOfficerPerson")
    public JAXBElement<PersonType> createResponsibleOfficerPerson(PersonType value) {
        return new JAXBElement<PersonType>(_ResponsibleOfficerPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BallastWaterTemperature")
    public JAXBElement<TemperatureType> createBallastWaterTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_BallastWaterTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BallastWaterTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BallastWaterTransaction")
    public JAXBElement<BallastWaterTransactionType> createBallastWaterTransaction(BallastWaterTransactionType value) {
        return new JAXBElement<BallastWaterTransactionType>(_BallastWaterTransaction_QNAME, BallastWaterTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BeneficiaryParty")
    public JAXBElement<PartyType> createBeneficiaryParty(PartyType value) {
        return new JAXBElement<PartyType>(_BeneficiaryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BillOfLadingHolderParty")
    public JAXBElement<PartyType> createBillOfLadingHolderParty(PartyType value) {
        return new JAXBElement<PartyType>(_BillOfLadingHolderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BillToParty")
    public JAXBElement<PartyType> createBillToParty(PartyType value) {
        return new JAXBElement<PartyType>(_BillToParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InvoiceDocumentReference")
    public JAXBElement<DocumentReferenceType> createInvoiceDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_InvoiceDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SelfBilledInvoiceDocumentReference")
    public JAXBElement<DocumentReferenceType> createSelfBilledInvoiceDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_SelfBilledInvoiceDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CreditNoteDocumentReference")
    public JAXBElement<DocumentReferenceType> createCreditNoteDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_CreditNoteDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SelfBilledCreditNoteDocumentReference")
    public JAXBElement<DocumentReferenceType> createSelfBilledCreditNoteDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_SelfBilledCreditNoteDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DebitNoteDocumentReference")
    public JAXBElement<DocumentReferenceType> createDebitNoteDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DebitNoteDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReminderDocumentReference")
    public JAXBElement<DocumentReferenceType> createReminderDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ReminderDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BirthplaceLocation")
    public JAXBElement<LocationType> createBirthplaceLocation(LocationType value) {
        return new JAXBElement<LocationType>(_BirthplaceLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BondedWarehouseLocation")
    public JAXBElement<LocationType> createBondedWarehouseLocation(LocationType value) {
        return new JAXBElement<LocationType>(_BondedWarehouseLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BonusPaymentTerms")
    public JAXBElement<PaymentTermsType> createBonusPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_BonusPaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Branch")
    public JAXBElement<BranchType> createBranch(BranchType value) {
        return new JAXBElement<BranchType>(_Branch_QNAME, BranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BrochureDocumentReference")
    public JAXBElement<DocumentReferenceType> createBrochureDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_BrochureDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredClassificationScheme")
    public JAXBElement<ClassificationSchemeType> createRequiredClassificationScheme(ClassificationSchemeType value) {
        return new JAXBElement<ClassificationSchemeType>(_RequiredClassificationScheme_QNAME, ClassificationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BusinessCapability")
    public JAXBElement<CapabilityType> createBusinessCapability(CapabilityType value) {
        return new JAXBElement<CapabilityType>(_BusinessCapability_QNAME, CapabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BusinessClassificationScheme")
    public JAXBElement<ClassificationSchemeType> createBusinessClassificationScheme(ClassificationSchemeType value) {
        return new JAXBElement<ClassificationSchemeType>(_BusinessClassificationScheme_QNAME, ClassificationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BusinessParty")
    public JAXBElement<PartyType> createBusinessParty(PartyType value) {
        return new JAXBElement<PartyType>(_BusinessParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BusinessPartyGroup")
    public JAXBElement<PartyGroupType> createBusinessPartyGroup(PartyGroupType value) {
        return new JAXBElement<PartyGroupType>(_BusinessPartyGroup_QNAME, PartyGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BuyerContact")
    public JAXBElement<ContactType> createBuyerContact(ContactType value) {
        return new JAXBElement<ContactType>(_BuyerContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BuyersItemIdentification")
    public JAXBElement<ItemIdentificationType> createBuyersItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_BuyersItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DutyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CallDuty")
    public JAXBElement<DutyType> createCallDuty(DutyType value) {
        return new JAXBElement<DutyType>(_CallDuty_QNAME, DutyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CallForTenderDocumentReference")
    public JAXBElement<DocumentReferenceType> createCallForTenderDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_CallForTenderDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CallForTendersDocumentReference")
    public JAXBElement<DocumentReferenceType> createCallForTendersDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_CallForTendersDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CallForTendersLineReference")
    public JAXBElement<LineReferenceType> createCallForTendersLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_CallForTendersLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Capability")
    public JAXBElement<CapabilityType> createCapability(CapabilityType value) {
        return new JAXBElement<CapabilityType>(_Capability_QNAME, CapabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CarrierParty")
    public JAXBElement<PartyType> createCarrierParty(PartyType value) {
        return new JAXBElement<PartyType>(_CarrierParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CashierContact")
    public JAXBElement<ContactType> createCashierContact(ContactType value) {
        return new JAXBElement<ContactType>(_CashierContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueDocumentReference")
    public JAXBElement<DocumentReferenceType> createCatalogueDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_CatalogueDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueItemIdentification")
    public JAXBElement<ItemIdentificationType> createCatalogueItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_CatalogueItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractorCustomerParty")
    public JAXBElement<CustomerPartyType> createContractorCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_ContractorCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WarrantyParty")
    public JAXBElement<PartyType> createWarrantyParty(PartyType value) {
        return new JAXBElement<PartyType>(_WarrantyParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WarrantyValidityPeriod")
    public JAXBElement<PeriodType> createWarrantyValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_WarrantyValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LineValidityPeriod")
    public JAXBElement<PeriodType> createLineValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_LineValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ComponentRelatedItem")
    public JAXBElement<RelatedItemType> createComponentRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_ComponentRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredRelatedItem")
    public JAXBElement<RelatedItemType> createRequiredRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_RequiredRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReplacementRelatedItem")
    public JAXBElement<RelatedItemType> createReplacementRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_ReplacementRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ComplementaryRelatedItem")
    public JAXBElement<RelatedItemType> createComplementaryRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_ComplementaryRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReplacedRelatedItem")
    public JAXBElement<RelatedItemType> createReplacedRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_ReplacedRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemLocationQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredItemLocationQuantity")
    public JAXBElement<ItemLocationQuantityType> createRequiredItemLocationQuantity(ItemLocationQuantityType value) {
        return new JAXBElement<ItemLocationQuantityType>(_RequiredItemLocationQuantity_QNAME, ItemLocationQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "KeywordItemProperty")
    public JAXBElement<ItemPropertyType> createKeywordItemProperty(ItemPropertyType value) {
        return new JAXBElement<ItemPropertyType>(_KeywordItemProperty_QNAME, ItemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CategorizesClassificationCategory")
    public JAXBElement<ClassificationCategoryType> createCategorizesClassificationCategory(ClassificationCategoryType value) {
        return new JAXBElement<ClassificationCategoryType>(_CategorizesClassificationCategory_QNAME, ClassificationCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Certificate")
    public JAXBElement<CertificateType> createCertificate(CertificateType value) {
        return new JAXBElement<CertificateType>(_Certificate_QNAME, CertificateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Shipment")
    public JAXBElement<ShipmentType> createShipment(ShipmentType value) {
        return new JAXBElement<ShipmentType>(_Shipment_QNAME, ShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Party")
    public JAXBElement<PartyType> createParty(PartyType value) {
        return new JAXBElement<PartyType>(_Party_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SignatoryContact")
    public JAXBElement<ContactType> createSignatoryContact(ContactType value) {
        return new JAXBElement<ContactType>(_SignatoryContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PreparationParty")
    public JAXBElement<PartyType> createPreparationParty(PartyType value) {
        return new JAXBElement<PartyType>(_PreparationParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExporterParty")
    public JAXBElement<PartyType> createExporterParty(PartyType value) {
        return new JAXBElement<PartyType>(_ExporterParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ImporterParty")
    public JAXBElement<PartyType> createImporterParty(PartyType value) {
        return new JAXBElement<PartyType>(_ImporterParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "IssuingCountry")
    public JAXBElement<CountryType> createIssuingCountry(CountryType value) {
        return new JAXBElement<CountryType>(_IssuingCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDistributionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentDistribution")
    public JAXBElement<DocumentDistributionType> createDocumentDistribution(DocumentDistributionType value) {
        return new JAXBElement<DocumentDistributionType>(_DocumentDistribution_QNAME, DocumentDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupportingDocumentReference")
    public JAXBElement<DocumentReferenceType> createSupportingDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_SupportingDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CertificationDocumentReference")
    public JAXBElement<DocumentReferenceType> createCertificationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_CertificationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ChildConsignment")
    public JAXBElement<ConsignmentType> createChildConsignment(ConsignmentType value) {
        return new JAXBElement<ConsignmentType>(_ChildConsignment_QNAME, ConsignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CitizenshipCountry")
    public JAXBElement<CountryType> createCitizenshipCountry(CountryType value) {
        return new JAXBElement<CountryType>(_CitizenshipCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ClassificationCategory")
    public JAXBElement<ClassificationCategoryType> createClassificationCategory(ClassificationCategoryType value) {
        return new JAXBElement<ClassificationCategoryType>(_ClassificationCategory_QNAME, ClassificationCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ClassificationScheme")
    public JAXBElement<ClassificationSchemeType> createClassificationScheme(ClassificationSchemeType value) {
        return new JAXBElement<ClassificationSchemeType>(_ClassificationScheme_QNAME, ClassificationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ClassifiedTaxCategory")
    public JAXBElement<TaxCategoryType> createClassifiedTaxCategory(TaxCategoryType value) {
        return new JAXBElement<TaxCategoryType>(_ClassifiedTaxCategory_QNAME, TaxCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CollectPaymentTerms")
    public JAXBElement<PaymentTermsType> createCollectPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_CollectPaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CollectedPayment")
    public JAXBElement<PaymentType> createCollectedPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_CollectedPayment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CommercialContact")
    public JAXBElement<ContactType> createCommercialContact(ContactType value) {
        return new JAXBElement<ContactType>(_CommercialContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CommissionPaymentTerms")
    public JAXBElement<PaymentTermsType> createCommissionPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_CommissionPaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CommodityClassification")
    public JAXBElement<CommodityClassificationType> createCommodityClassification(CommodityClassificationType value) {
        return new JAXBElement<CommodityClassificationType>(_CommodityClassification_QNAME, CommodityClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Communication")
    public JAXBElement<CommunicationType> createCommunication(CommunicationType value) {
        return new JAXBElement<CommunicationType>(_Communication_QNAME, CommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Period")
    public JAXBElement<PeriodType> createPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_Period_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RecipientCustomerParty")
    public JAXBElement<CustomerPartyType> createRecipientCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_RecipientCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ConsigneeParty")
    public JAXBElement<PartyType> createConsigneeParty(PartyType value) {
        return new JAXBElement<PartyType>(_ConsigneeParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Consignment")
    public JAXBElement<ConsignmentType> createConsignment(ConsignmentType value) {
        return new JAXBElement<ConsignmentType>(_Consignment_QNAME, ConsignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ConsignorParty")
    public JAXBElement<PartyType> createConsignorParty(PartyType value) {
        return new JAXBElement<PartyType>(_ConsignorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ConsolidatedShipment")
    public JAXBElement<ShipmentType> createConsolidatedShipment(ShipmentType value) {
        return new JAXBElement<ShipmentType>(_ConsolidatedShipment_QNAME, ShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ConstitutionPeriod")
    public JAXBElement<PeriodType> createConstitutionPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ConstitutionPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MainPeriod")
    public JAXBElement<PeriodType> createMainPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_MainPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GuidanceDocumentReference")
    public JAXBElement<DocumentReferenceType> createGuidanceDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_GuidanceDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "JurisdictionRegionAddress")
    public JAXBElement<AddressType> createJurisdictionRegionAddress(AddressType value) {
        return new JAXBElement<AddressType>(_JurisdictionRegionAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumptionCorrectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EnergyWaterConsumptionCorrection")
    public JAXBElement<ConsumptionCorrectionType> createEnergyWaterConsumptionCorrection(ConsumptionCorrectionType value) {
        return new JAXBElement<ConsumptionCorrectionType>(_EnergyWaterConsumptionCorrection_QNAME, ConsumptionCorrectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExchangeRate")
    public JAXBElement<ExchangeRateType> createExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_ExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Price")
    public JAXBElement<PriceType> createPrice(PriceType value) {
        return new JAXBElement<PriceType>(_Price_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Country")
    public JAXBElement<CountryType> createCountry(CountryType value) {
        return new JAXBElement<CountryType>(_Country_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DutyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TimeDuty")
    public JAXBElement<DutyType> createTimeDuty(DutyType value) {
        return new JAXBElement<DutyType>(_TimeDuty_QNAME, DutyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LegalMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createLegalMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_LegalMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumptionCorrectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ConsumptionCorrection")
    public JAXBElement<ConsumptionCorrectionType> createConsumptionCorrection(ConsumptionCorrectionType value) {
        return new JAXBElement<ConsumptionCorrectionType>(_ConsumptionCorrection_QNAME, ConsumptionCorrectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCategoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxCategory")
    public JAXBElement<TaxCategoryType> createTaxCategory(TaxCategoryType value) {
        return new JAXBElement<TaxCategoryType>(_TaxCategory_QNAME, TaxCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumptionPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ConsumptionPoint")
    public JAXBElement<ConsumptionPointType> createConsumptionPoint(ConsumptionPointType value) {
        return new JAXBElement<ConsumptionPointType>(_ConsumptionPoint_QNAME, ConsumptionPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Contact")
    public JAXBElement<ContactType> createContact(ContactType value) {
        return new JAXBElement<ContactType>(_Contact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContactParty")
    public JAXBElement<PartyType> createContactParty(PartyType value) {
        return new JAXBElement<PartyType>(_ContactParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContainedGoodsItem")
    public JAXBElement<GoodsItemType> createContainedGoodsItem(GoodsItemType value) {
        return new JAXBElement<GoodsItemType>(_ContainedGoodsItem_QNAME, GoodsItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContainedInTransportEquipment")
    public JAXBElement<TransportEquipmentType> createContainedInTransportEquipment(TransportEquipmentType value) {
        return new JAXBElement<TransportEquipmentType>(_ContainedInTransportEquipment_QNAME, TransportEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContainedPackage")
    public JAXBElement<PackageType> createContainedPackage(PackageType value) {
        return new JAXBElement<PackageType>(_ContainedPackage_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContainingPackage")
    public JAXBElement<PackageType> createContainingPackage(PackageType value) {
        return new JAXBElement<PackageType>(_ContainingPackage_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContainingTransportEquipment")
    public JAXBElement<TransportEquipmentType> createContainingTransportEquipment(TransportEquipmentType value) {
        return new JAXBElement<TransportEquipmentType>(_ContainingTransportEquipment_QNAME, TransportEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractAcceptancePeriod")
    public JAXBElement<PeriodType> createContractAcceptancePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ContractAcceptancePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OptionValidityPeriod")
    public JAXBElement<PeriodType> createOptionValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_OptionValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractFormalizationPeriod")
    public JAXBElement<PeriodType> createContractFormalizationPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ContractFormalizationPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractResponsibleParty")
    public JAXBElement<PartyType> createContractResponsibleParty(PartyType value) {
        return new JAXBElement<PartyType>(_ContractResponsibleParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractualDelivery")
    public JAXBElement<DeliveryType> createContractualDelivery(DeliveryType value) {
        return new JAXBElement<DeliveryType>(_ContractualDelivery_QNAME, DeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractualDocumentReference")
    public JAXBElement<DocumentReferenceType> createContractualDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ContractualDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditNoteLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CreditNoteLine")
    public JAXBElement<CreditNoteLineType> createCreditNoteLine(CreditNoteLineType value) {
        return new JAXBElement<CreditNoteLineType>(_CreditNoteLine_QNAME, CreditNoteLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CrewMemberPerson")
    public JAXBElement<PersonType> createCrewMemberPerson(PersonType value) {
        return new JAXBElement<PersonType>(_CrewMemberPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CrewPerson")
    public JAXBElement<PersonType> createCrewPerson(PersonType value) {
        return new JAXBElement<PersonType>(_CrewPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeclaredPropertyItem")
    public JAXBElement<ItemType> createDeclaredPropertyItem(ItemType value) {
        return new JAXBElement<ItemType>(_DeclaredPropertyItem_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CurrentStatus")
    public JAXBElement<StatusType> createCurrentStatus(StatusType value) {
        return new JAXBElement<StatusType>(_CurrentStatus_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CustomerParty")
    public JAXBElement<CustomerPartyType> createCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_CustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CustomsAgentParty")
    public JAXBElement<PartyType> createCustomsAgentParty(PartyType value) {
        return new JAXBElement<PartyType>(_CustomsAgentParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDeclarationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CustomsDeclaration")
    public JAXBElement<CustomsDeclarationType> createCustomsDeclaration(CustomsDeclarationType value) {
        return new JAXBElement<CustomsDeclarationType>(_CustomsDeclaration_QNAME, CustomsDeclarationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CustomsExitOfficeLocation")
    public JAXBElement<LocationType> createCustomsExitOfficeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_CustomsExitOfficeLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CustomsOfficeLocation")
    public JAXBElement<LocationType> createCustomsOfficeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_CustomsOfficeLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CustomsParty")
    public JAXBElement<PartyType> createCustomsParty(PartyType value) {
        return new JAXBElement<PartyType>(_CustomsParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DamageDocumentationAttachment")
    public JAXBElement<AttachmentType> createDamageDocumentationAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_DamageDocumentationAttachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitNoteLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DebitNoteLine")
    public JAXBElement<DebitNoteLineType> createDebitNoteLine(DebitNoteLineType value) {
        return new JAXBElement<DebitNoteLineType>(_DebitNoteLine_QNAME, DebitNoteLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DefaultLanguage")
    public JAXBElement<LanguageType> createDefaultLanguage(LanguageType value) {
        return new JAXBElement<LanguageType>(_DefaultLanguage_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeletedCatalogueReference")
    public JAXBElement<CatalogueReferenceType> createDeletedCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_DeletedCatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryAddress")
    public JAXBElement<AddressType> createDeliveryAddress(AddressType value) {
        return new JAXBElement<AddressType>(_DeliveryAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryChannelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryChannel")
    public JAXBElement<DeliveryChannelType> createDeliveryChannel(DeliveryChannelType value) {
        return new JAXBElement<DeliveryChannelType>(_DeliveryChannel_QNAME, DeliveryChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryContact")
    public JAXBElement<ContactType> createDeliveryContact(ContactType value) {
        return new JAXBElement<ContactType>(_DeliveryContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryCustomerParty")
    public JAXBElement<CustomerPartyType> createDeliveryCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_DeliveryCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryParty")
    public JAXBElement<PartyType> createDeliveryParty(PartyType value) {
        return new JAXBElement<PartyType>(_DeliveryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryPeriod")
    public JAXBElement<PeriodType> createDeliveryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_DeliveryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryTransportEvent")
    public JAXBElement<TransportEventType> createDeliveryTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_DeliveryTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryUnit")
    public JAXBElement<DeliveryUnitType> createDeliveryUnit(DeliveryUnitType value) {
        return new JAXBElement<DeliveryUnitType>(_DeliveryUnit_QNAME, DeliveryUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DependentLineReference")
    public JAXBElement<LineReferenceType> createDependentLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_DependentLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LocationAddress")
    public JAXBElement<AddressType> createLocationAddress(AddressType value) {
        return new JAXBElement<AddressType>(_LocationAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchAddress")
    public JAXBElement<AddressType> createDespatchAddress(AddressType value) {
        return new JAXBElement<AddressType>(_DespatchAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchLocation")
    public JAXBElement<LocationType> createDespatchLocation(LocationType value) {
        return new JAXBElement<LocationType>(_DespatchLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchParty")
    public JAXBElement<PartyType> createDespatchParty(PartyType value) {
        return new JAXBElement<PartyType>(_DespatchParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "NotifyParty")
    public JAXBElement<PartyType> createNotifyParty(PartyType value) {
        return new JAXBElement<PartyType>(_NotifyParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ResponsibleParty")
    public JAXBElement<PartyType> createResponsibleParty(PartyType value) {
        return new JAXBElement<PartyType>(_ResponsibleParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EstimatedDespatchPeriod")
    public JAXBElement<PeriodType> createEstimatedDespatchPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_EstimatedDespatchPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedDespatchPeriod")
    public JAXBElement<PeriodType> createRequestedDespatchPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_RequestedDespatchPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchContact")
    public JAXBElement<ContactType> createDespatchContact(ContactType value) {
        return new JAXBElement<ContactType>(_DespatchContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchDocumentReference")
    public JAXBElement<DocumentReferenceType> createDespatchDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DespatchDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchLine")
    public JAXBElement<DespatchLineType> createDespatchLine(DespatchLineType value) {
        return new JAXBElement<DespatchLineType>(_DespatchLine_QNAME, DespatchLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchLineReference")
    public JAXBElement<LineReferenceType> createDespatchLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_DespatchLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchSupplierParty")
    public JAXBElement<SupplierPartyType> createDespatchSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_DespatchSupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortCallType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DestinationPortCall")
    public JAXBElement<PortCallType> createDestinationPortCall(PortCallType value) {
        return new JAXBElement<PortCallType>(_DestinationPortCall_QNAME, PortCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DetentionTransportEvent")
    public JAXBElement<TransportEventType> createDetentionTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_DetentionTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ServiceAvailabilityPeriod")
    public JAXBElement<PeriodType> createServiceAvailabilityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ServiceAvailabilityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ServiceMaintenancePeriod")
    public JAXBElement<PeriodType> createServiceMaintenancePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ServiceMaintenancePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DigitalCertificate")
    public JAXBElement<CertificateType> createDigitalCertificate(CertificateType value) {
        return new JAXBElement<CertificateType>(_DigitalCertificate_QNAME, CertificateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigitalServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SendingDigitalService")
    public JAXBElement<DigitalServiceType> createSendingDigitalService(DigitalServiceType value) {
        return new JAXBElement<DigitalServiceType>(_SendingDigitalService_QNAME, DigitalServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigitalServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceivingDigitalService")
    public JAXBElement<DigitalServiceType> createReceivingDigitalService(DigitalServiceType value) {
        return new JAXBElement<DigitalServiceType>(_ReceivingDigitalService_QNAME, DigitalServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryChannelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DigitalDeliveryChannel")
    public JAXBElement<DeliveryChannelType> createDigitalDeliveryChannel(DeliveryChannelType value) {
        return new JAXBElement<DeliveryChannelType>(_DigitalDeliveryChannel_QNAME, DeliveryChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DigitalDocumentMetadata")
    public JAXBElement<DocumentMetadataType> createDigitalDocumentMetadata(DocumentMetadataType value) {
        return new JAXBElement<DocumentMetadataType>(_DigitalDocumentMetadata_QNAME, DocumentMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageDeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DigitalMessageDelivery")
    public JAXBElement<MessageDeliveryType> createDigitalMessageDelivery(MessageDeliveryType value) {
        return new JAXBElement<MessageDeliveryType>(_DigitalMessageDelivery_QNAME, MessageDeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigitalServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DigitalService")
    public JAXBElement<DigitalServiceType> createDigitalService(DigitalServiceType value) {
        return new JAXBElement<DigitalServiceType>(_DigitalService_QNAME, DigitalServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Dimension")
    public JAXBElement<DimensionType> createDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_Dimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DisbursementPaymentTerms")
    public JAXBElement<PaymentTermsType> createDisbursementPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_DisbursementPaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DischargeTransportEvent")
    public JAXBElement<TransportEventType> createDischargeTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_DischargeTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DiscrepancyResponse")
    public JAXBElement<ResponseType> createDiscrepancyResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_DiscrepancyResponse_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentAvailabilityPeriod")
    public JAXBElement<PeriodType> createDocumentAvailabilityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_DocumentAvailabilityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentMetadata")
    public JAXBElement<DocumentMetadataType> createDocumentMetadata(DocumentMetadataType value) {
        return new JAXBElement<DocumentMetadataType>(_DocumentMetadata_QNAME, DocumentMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentProviderParty")
    public JAXBElement<PartyType> createDocumentProviderParty(PartyType value) {
        return new JAXBElement<PartyType>(_DocumentProviderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentResponse")
    public JAXBElement<DocumentResponseType> createDocumentResponse(DocumentResponseType value) {
        return new JAXBElement<DocumentResponseType>(_DocumentResponse_QNAME, DocumentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderRequirementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentTenderRequirement")
    public JAXBElement<TenderRequirementType> createDocumentTenderRequirement(TenderRequirementType value) {
        return new JAXBElement<TenderRequirementType>(_DocumentTenderRequirement_QNAME, TenderRequirementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DriverPerson")
    public JAXBElement<PersonType> createDriverPerson(PersonType value) {
        return new JAXBElement<PersonType>(_DriverPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DropoffTransportEvent")
    public JAXBElement<TransportEventType> createDropoffTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_DropoffTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DurationPeriod")
    public JAXBElement<PeriodType> createDurationPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_DurationPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DutyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Duty")
    public JAXBElement<DutyType> createDuty(DutyType value) {
        return new JAXBElement<DutyType>(_Duty_QNAME, DutyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifyingPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QualifyingParty")
    public JAXBElement<QualifyingPartyType> createQualifyingParty(QualifyingPartyType value) {
        return new JAXBElement<QualifyingPartyType>(_QualifyingParty_QNAME, QualifyingPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PreSelectedParty")
    public JAXBElement<PartyType> createPreSelectedParty(PartyType value) {
        return new JAXBElement<PartyType>(_PreSelectedParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EffectivePeriod")
    public JAXBElement<PeriodType> createEffectivePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_EffectivePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EmbassyEndorsement")
    public JAXBElement<EndorsementType> createEmbassyEndorsement(EndorsementType value) {
        return new JAXBElement<EndorsementType>(_EmbassyEndorsement_QNAME, EndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EmergencyTemperature")
    public JAXBElement<TemperatureType> createEmergencyTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_EmergencyTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MeasurementFromLocation")
    public JAXBElement<LocationType> createMeasurementFromLocation(LocationType value) {
        return new JAXBElement<LocationType>(_MeasurementFromLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MeasurementToLocation")
    public JAXBElement<LocationType> createMeasurementToLocation(LocationType value) {
        return new JAXBElement<LocationType>(_MeasurementToLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EmploymentLegislationDocumentReference")
    public JAXBElement<DocumentReferenceType> createEmploymentLegislationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_EmploymentLegislationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EncryptionCertificateAttachment")
    public JAXBElement<AttachmentType> createEncryptionCertificateAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_EncryptionCertificateAttachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EncryptionData")
    public JAXBElement<EncryptionDataType> createEncryptionData(EncryptionDataType value) {
        return new JAXBElement<EncryptionDataType>(_EncryptionData_QNAME, EncryptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Endorsement")
    public JAXBElement<EndorsementType> createEndorsement(EndorsementType value) {
        return new JAXBElement<EndorsementType>(_Endorsement_QNAME, EndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EnvironmentalLegislationDocumentReference")
    public JAXBElement<DocumentReferenceType> createEnvironmentalLegislationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_EnvironmentalLegislationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EstimatedArrivalTransportEvent")
    public JAXBElement<TransportEventType> createEstimatedArrivalTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_EstimatedArrivalTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EstimatedDeliveryPeriod")
    public JAXBElement<PeriodType> createEstimatedDeliveryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_EstimatedDeliveryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EstimatedDepartureTransportEvent")
    public JAXBElement<TransportEventType> createEstimatedDepartureTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_EstimatedDepartureTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EstimatedDurationPeriod")
    public JAXBElement<PeriodType> createEstimatedDurationPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_EstimatedDurationPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EstimatedTransitPeriod")
    public JAXBElement<PeriodType> createEstimatedTransitPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_EstimatedTransitPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluationCriterionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EvaluationCriterion")
    public JAXBElement<EvaluationCriterionType> createEvaluationCriterion(EvaluationCriterionType value) {
        return new JAXBElement<EvaluationCriterionType>(_EvaluationCriterion_QNAME, EvaluationCriterionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Event")
    public JAXBElement<EventType> createEvent(EventType value) {
        return new JAXBElement<EventType>(_Event_QNAME, EventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ParticipatingLocationsLocation")
    public JAXBElement<LocationType> createParticipatingLocationsLocation(LocationType value) {
        return new JAXBElement<LocationType>(_ParticipatingLocationsLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupplyItem")
    public JAXBElement<ItemType> createSupplyItem(ItemType value) {
        return new JAXBElement<ItemType>(_SupplyItem_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Evidence")
    public JAXBElement<EvidenceType> createEvidence(EvidenceType value) {
        return new JAXBElement<EvidenceType>(_Evidence_QNAME, EvidenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EvidenceDocumentReference")
    public JAXBElement<DocumentReferenceType> createEvidenceDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_EvidenceDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EvidenceIssuingParty")
    public JAXBElement<PartyType> createEvidenceIssuingParty(PartyType value) {
        return new JAXBElement<PartyType>(_EvidenceIssuingParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExaminationTransportEvent")
    public JAXBElement<TransportEventType> createExaminationTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_ExaminationTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExceptionObservationPeriod")
    public JAXBElement<PeriodType> createExceptionObservationPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ExceptionObservationPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExportCountry")
    public JAXBElement<CountryType> createExportCountry(CountryType value) {
        return new JAXBElement<CountryType>(_ExportCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExportCustomsExitOfficeLocation")
    public JAXBElement<LocationType> createExportCustomsExitOfficeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_ExportCustomsExitOfficeLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExportationDocumentReference")
    public JAXBElement<DocumentReferenceType> createExportationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ExportationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExportationTransportEvent")
    public JAXBElement<TransportEventType> createExportationTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_ExportationTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExportingCustomsParty")
    public JAXBElement<PartyType> createExportingCustomsParty(PartyType value) {
        return new JAXBElement<PartyType>(_ExportingCustomsParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExportingGuarantorParty")
    public JAXBElement<PartyType> createExportingGuarantorParty(PartyType value) {
        return new JAXBElement<PartyType>(_ExportingGuarantorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExpressionOfInterestDocumentReference")
    public JAXBElement<DocumentReferenceType> createExpressionOfInterestDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ExpressionOfInterestDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExtraAllowanceCharge")
    public JAXBElement<AllowanceChargeType> createExtraAllowanceCharge(AllowanceChargeType value) {
        return new JAXBElement<AllowanceChargeType>(_ExtraAllowanceCharge_QNAME, AllowanceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Fee")
    public JAXBElement<FeeType> createFee(FeeType value) {
        return new JAXBElement<FeeType>(_Fee_QNAME, FeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinalDeliveryParty")
    public JAXBElement<PartyType> createFinalDeliveryParty(PartyType value) {
        return new JAXBElement<PartyType>(_FinalDeliveryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinalDeliveryTransportationService")
    public JAXBElement<TransportationServiceType> createFinalDeliveryTransportationService(TransportationServiceType value) {
        return new JAXBElement<TransportationServiceType>(_FinalDeliveryTransportationService_QNAME, TransportationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinalDestinationCountry")
    public JAXBElement<CountryType> createFinalDestinationCountry(CountryType value) {
        return new JAXBElement<CountryType>(_FinalDestinationCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialGuaranteeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinalFinancialGuarantee")
    public JAXBElement<FinancialGuaranteeType> createFinalFinancialGuarantee(FinancialGuaranteeType value) {
        return new JAXBElement<FinancialGuaranteeType>(_FinalFinancialGuarantee_QNAME, FinancialGuaranteeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancialAccount")
    public JAXBElement<FinancialAccountType> createFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_FinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancialCapability")
    public JAXBElement<CapabilityType> createFinancialCapability(CapabilityType value) {
        return new JAXBElement<CapabilityType>(_FinancialCapability_QNAME, CapabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluationCriterionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancialEvaluationCriterion")
    public JAXBElement<EvaluationCriterionType> createFinancialEvaluationCriterion(EvaluationCriterionType value) {
        return new JAXBElement<EvaluationCriterionType>(_FinancialEvaluationCriterion_QNAME, EvaluationCriterionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialGuaranteeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancialGuarantee")
    public JAXBElement<FinancialGuaranteeType> createFinancialGuarantee(FinancialGuaranteeType value) {
        return new JAXBElement<FinancialGuaranteeType>(_FinancialGuarantee_QNAME, FinancialGuaranteeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancialInstitutionBranch")
    public JAXBElement<BranchType> createFinancialInstitutionBranch(BranchType value) {
        return new JAXBElement<BranchType>(_FinancialInstitutionBranch_QNAME, BranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FirstArrivalPortLocation")
    public JAXBElement<LocationType> createFirstArrivalPortLocation(LocationType value) {
        return new JAXBElement<LocationType>(_FirstArrivalPortLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FiscalLegislationDocumentReference")
    public JAXBElement<DocumentReferenceType> createFiscalLegislationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_FiscalLegislationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FlashpointTemperature")
    public JAXBElement<TemperatureType> createFlashpointTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_FlashpointTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FloorSpaceMeasurementDimension")
    public JAXBElement<DimensionType> createFloorSpaceMeasurementDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_FloorSpaceMeasurementDimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ForecastPeriod")
    public JAXBElement<PeriodType> createForecastPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ForecastPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxExclusivePrice")
    public JAXBElement<PriceType> createTaxExclusivePrice(PriceType value) {
        return new JAXBElement<PriceType>(_TaxExclusivePrice_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxInclusivePrice")
    public JAXBElement<PriceType> createTaxInclusivePrice(PriceType value) {
        return new JAXBElement<PriceType>(_TaxInclusivePrice_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ForeignExchangeContract")
    public JAXBElement<ContractType> createForeignExchangeContract(ContractType value) {
        return new JAXBElement<ContractType>(_ForeignExchangeContract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderRequirementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubsequentProcessTenderRequirement")
    public JAXBElement<TenderRequirementType> createSubsequentProcessTenderRequirement(TenderRequirementType value) {
        return new JAXBElement<TenderRequirementType>(_SubsequentProcessTenderRequirement_QNAME, TenderRequirementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FreightAllowanceCharge")
    public JAXBElement<AllowanceChargeType> createFreightAllowanceCharge(AllowanceChargeType value) {
        return new JAXBElement<AllowanceChargeType>(_FreightAllowanceCharge_QNAME, AllowanceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FreightChargeLocation")
    public JAXBElement<LocationType> createFreightChargeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_FreightChargeLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FrequencyPeriod")
    public JAXBElement<PeriodType> createFrequencyPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_FrequencyPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FromLocation")
    public JAXBElement<LocationType> createFromLocation(LocationType value) {
        return new JAXBElement<LocationType>(_FromLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FuelProviderParty")
    public JAXBElement<PartyType> createFuelProviderParty(PartyType value) {
        return new JAXBElement<PartyType>(_FuelProviderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FuelPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FuelProperty")
    public JAXBElement<FuelPropertyType> createFuelProperty(FuelPropertyType value) {
        return new JAXBElement<FuelPropertyType>(_FuelProperty_QNAME, FuelPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GoodsItem")
    public JAXBElement<GoodsItemType> createGoodsItem(GoodsItemType value) {
        return new JAXBElement<GoodsItemType>(_GoodsItem_QNAME, GoodsItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportEquipment")
    public JAXBElement<TransportEquipmentType> createTransportEquipment(TransportEquipmentType value) {
        return new JAXBElement<TransportEquipmentType>(_TransportEquipment_QNAME, TransportEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GoodsItemPassportAttachment")
    public JAXBElement<AttachmentType> createGoodsItemPassportAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_GoodsItemPassportAttachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ImportationDocumentReference")
    public JAXBElement<DocumentReferenceType> createImportationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ImportationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReexportationDocumentReference")
    public JAXBElement<DocumentReferenceType> createReexportationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ReexportationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReimportationDocumentReference")
    public JAXBElement<DocumentReferenceType> createReimportationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ReimportationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "VoucherDocumentReference")
    public JAXBElement<DocumentReferenceType> createVoucherDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_VoucherDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsProcessingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GoodsProcessing")
    public JAXBElement<GoodsProcessingType> createGoodsProcessing(GoodsProcessingType value) {
        return new JAXBElement<GoodsProcessingType>(_GoodsProcessing_QNAME, GoodsProcessingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GovernorParty")
    public JAXBElement<PartyType> createGovernorParty(PartyType value) {
        return new JAXBElement<PartyType>(_GovernorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GuaranteeDocumentReference")
    public JAXBElement<DocumentReferenceType> createGuaranteeDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_GuaranteeDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GuarantorParty")
    public JAXBElement<PartyType> createGuarantorParty(PartyType value) {
        return new JAXBElement<PartyType>(_GuarantorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HandlingTransportEvent")
    public JAXBElement<TransportEventType> createHandlingTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_HandlingTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HandlingUnitDespatchLine")
    public JAXBElement<DespatchLineType> createHandlingUnitDespatchLine(DespatchLineType value) {
        return new JAXBElement<DespatchLineType>(_HandlingUnitDespatchLine_QNAME, DespatchLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradingTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HaulageTradingTerms")
    public JAXBElement<TradingTermsType> createHaulageTradingTerms(TradingTermsType value) {
        return new JAXBElement<TradingTermsType>(_HaulageTradingTerms_QNAME, TradingTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MaximumTemperature")
    public JAXBElement<TemperatureType> createMaximumTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_MaximumTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MinimumTemperature")
    public JAXBElement<TemperatureType> createMinimumTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_MinimumTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StowageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PositionOnBoardStowage")
    public JAXBElement<StowageType> createPositionOnBoardStowage(StowageType value) {
        return new JAXBElement<StowageType>(_PositionOnBoardStowage_QNAME, StowageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HazardousItemNotificationParty")
    public JAXBElement<PartyType> createHazardousItemNotificationParty(PartyType value) {
        return new JAXBElement<PartyType>(_HazardousItemNotificationParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HeadOfficeParty")
    public JAXBElement<PartyType> createHeadOfficeParty(PartyType value) {
        return new JAXBElement<PartyType>(_HeadOfficeParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HolderParty")
    public JAXBElement<PartyType> createHolderParty(PartyType value) {
        return new JAXBElement<PartyType>(_HolderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SecurityMeasure")
    public JAXBElement<SecurityMeasureType> createSecurityMeasure(SecurityMeasureType value) {
        return new JAXBElement<SecurityMeasureType>(_SecurityMeasure_QNAME, SecurityMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PortFacilityLocation")
    public JAXBElement<LocationType> createPortFacilityLocation(LocationType value) {
        return new JAXBElement<LocationType>(_PortFacilityLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Location")
    public JAXBElement<LocationType> createLocation(LocationType value) {
        return new JAXBElement<LocationType>(_Location_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReportLocation")
    public JAXBElement<LocationType> createReportLocation(LocationType value) {
        return new JAXBElement<LocationType>(_ReportLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ISSCIssuerParty")
    public JAXBElement<PartyType> createISSCIssuerParty(PartyType value) {
        return new JAXBElement<PartyType>(_ISSCIssuerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SecurityOfficerPerson")
    public JAXBElement<PersonType> createSecurityOfficerPerson(PersonType value) {
        return new JAXBElement<PersonType>(_SecurityOfficerPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "IdentityDocumentReference")
    public JAXBElement<DocumentReferenceType> createIdentityDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_IdentityDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ImportCustomsExitOfficeLocation")
    public JAXBElement<LocationType> createImportCustomsExitOfficeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_ImportCustomsExitOfficeLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ImportingCustomsParty")
    public JAXBElement<PartyType> createImportingCustomsParty(PartyType value) {
        return new JAXBElement<PartyType>(_ImportingCustomsParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ImportingGuarantorParty")
    public JAXBElement<PartyType> createImportingGuarantorParty(PartyType value) {
        return new JAXBElement<PartyType>(_ImportingGuarantorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InformationContentProviderParty")
    public JAXBElement<PartyType> createInformationContentProviderParty(PartyType value) {
        return new JAXBElement<PartyType>(_InformationContentProviderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ManufacturerParty")
    public JAXBElement<PartyType> createManufacturerParty(PartyType value) {
        return new JAXBElement<PartyType>(_ManufacturerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InsuranceEndorsement")
    public JAXBElement<EndorsementType> createInsuranceEndorsement(EndorsementType value) {
        return new JAXBElement<EndorsementType>(_InsuranceEndorsement_QNAME, EndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InsuranceParty")
    public JAXBElement<PartyType> createInsuranceParty(PartyType value) {
        return new JAXBElement<PartyType>(_InsuranceParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InterestedParty")
    public JAXBElement<PartyType> createInterestedParty(PartyType value) {
        return new JAXBElement<PartyType>(_InterestedParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcurementProjectLotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InterestedProcurementProjectLot")
    public JAXBElement<ProcurementProjectLotType> createInterestedProcurementProjectLot(ProcurementProjectLotType value) {
        return new JAXBElement<ProcurementProjectLotType>(_InterestedProcurementProjectLot_QNAME, ProcurementProjectLotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InventoryLocation")
    public JAXBElement<LocationType> createInventoryLocation(LocationType value) {
        return new JAXBElement<LocationType>(_InventoryLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InventoryPeriod")
    public JAXBElement<PeriodType> createInventoryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_InventoryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InventoryReportingParty")
    public JAXBElement<PartyType> createInventoryReportingParty(PartyType value) {
        return new JAXBElement<PartyType>(_InventoryReportingParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InvitationSubmissionPeriod")
    public JAXBElement<PeriodType> createInvitationSubmissionPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_InvitationSubmissionPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InvoiceLine")
    public JAXBElement<InvoiceLineType> createInvoiceLine(InvoiceLineType value) {
        return new JAXBElement<InvoiceLineType>(_InvoiceLine_QNAME, InvoiceLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InvoicePeriod")
    public JAXBElement<PeriodType> createInvoicePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_InvoicePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "IssueLocation")
    public JAXBElement<LocationType> createIssueLocation(LocationType value) {
        return new JAXBElement<LocationType>(_IssueLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "IssuerEndorsement")
    public JAXBElement<EndorsementType> createIssuerEndorsement(EndorsementType value) {
        return new JAXBElement<EndorsementType>(_IssuerEndorsement_QNAME, EndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemIdentification")
    public JAXBElement<ItemIdentificationType> createItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_ItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemLocationQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemLocationQuantity")
    public JAXBElement<ItemLocationQuantityType> createItemLocationQuantity(ItemLocationQuantityType value) {
        return new JAXBElement<ItemLocationQuantityType>(_ItemLocationQuantity_QNAME, ItemLocationQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemPriceExtension")
    public JAXBElement<PriceExtensionType> createItemPriceExtension(PriceExtensionType value) {
        return new JAXBElement<PriceExtensionType>(_ItemPriceExtension_QNAME, PriceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemProperty")
    public JAXBElement<ItemPropertyType> createItemProperty(ItemPropertyType value) {
        return new JAXBElement<ItemPropertyType>(_ItemProperty_QNAME, ItemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemSpecificationDocumentReference")
    public JAXBElement<DocumentReferenceType> createItemSpecificationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ItemSpecificationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Language")
    public JAXBElement<LanguageType> createLanguage(LanguageType value) {
        return new JAXBElement<LanguageType>(_Language_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LastExitPortLocation")
    public JAXBElement<LocationType> createLastExitPortLocation(LocationType value) {
        return new JAXBElement<LocationType>(_LastExitPortLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LegalAuthorityParty")
    public JAXBElement<PartyType> createLegalAuthorityParty(PartyType value) {
        return new JAXBElement<PartyType>(_LegalAuthorityParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LegalContact")
    public JAXBElement<ContactType> createLegalContact(ContactType value) {
        return new JAXBElement<ContactType>(_LegalContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LegalDocumentReference")
    public JAXBElement<DocumentReferenceType> createLegalDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_LegalDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LineReference")
    public JAXBElement<LineReferenceType> createLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_LineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LoadingLocation")
    public JAXBElement<LocationType> createLoadingLocation(LocationType value) {
        return new JAXBElement<LocationType>(_LoadingLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LoadingPortLocation")
    public JAXBElement<LocationType> createLoadingPortLocation(LocationType value) {
        return new JAXBElement<LocationType>(_LoadingPortLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LoadingProofParty")
    public JAXBElement<PartyType> createLoadingProofParty(PartyType value) {
        return new JAXBElement<PartyType>(_LoadingProofParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LoadingTransportEvent")
    public JAXBElement<TransportEventType> createLoadingTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_LoadingTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LogisticsOperatorParty")
    public JAXBElement<PartyType> createLogisticsOperatorParty(PartyType value) {
        return new JAXBElement<PartyType>(_LogisticsOperatorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MainCarriageShipmentStage")
    public JAXBElement<ShipmentStageType> createMainCarriageShipmentStage(ShipmentStageType value) {
        return new JAXBElement<ShipmentStageType>(_MainCarriageShipmentStage_QNAME, ShipmentStageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MainCommodityClassification")
    public JAXBElement<CommodityClassificationType> createMainCommodityClassification(CommodityClassificationType value) {
        return new JAXBElement<CommodityClassificationType>(_MainCommodityClassification_QNAME, CommodityClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnAccountPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MainOnAccountPayment")
    public JAXBElement<OnAccountPaymentType> createMainOnAccountPayment(OnAccountPaymentType value) {
        return new JAXBElement<OnAccountPaymentType>(_MainOnAccountPayment_QNAME, OnAccountPaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifyingPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MainQualifyingParty")
    public JAXBElement<QualifyingPartyType> createMainQualifyingParty(QualifyingPartyType value) {
        return new JAXBElement<QualifyingPartyType>(_MainQualifyingParty_QNAME, QualifyingPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MainTransportationService")
    public JAXBElement<TransportationServiceType> createMainTransportationService(TransportationServiceType value) {
        return new JAXBElement<TransportationServiceType>(_MainTransportationService_QNAME, TransportationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MandateDocumentReference")
    public JAXBElement<DocumentReferenceType> createMandateDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_MandateDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ManufacturersItemIdentification")
    public JAXBElement<ItemIdentificationType> createManufacturersItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_ManufacturersItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WHOAffectedAreaPortLocation")
    public JAXBElement<LocationType> createWHOAffectedAreaPortLocation(LocationType value) {
        return new JAXBElement<LocationType>(_WHOAffectedAreaPortLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PlaceOfReportLocation")
    public JAXBElement<LocationType> createPlaceOfReportLocation(LocationType value) {
        return new JAXBElement<LocationType>(_PlaceOfReportLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MedicalCertificate")
    public JAXBElement<CertificateType> createMedicalCertificate(CertificateType value) {
        return new JAXBElement<CertificateType>(_MedicalCertificate_QNAME, CertificateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ShipSanitationControlCertificate")
    public JAXBElement<CertificateType> createShipSanitationControlCertificate(CertificateType value) {
        return new JAXBElement<CertificateType>(_ShipSanitationControlCertificate_QNAME, CertificateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ShipSanitationControlExemptionDocumentReference")
    public JAXBElement<DocumentReferenceType> createShipSanitationControlExemptionDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ShipSanitationControlExemptionDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RegistryCertificateDocumentReference")
    public JAXBElement<DocumentReferenceType> createRegistryCertificateDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_RegistryCertificateDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RegistryPortLocation")
    public JAXBElement<LocationType> createRegistryPortLocation(LocationType value) {
        return new JAXBElement<LocationType>(_RegistryPortLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RemainingWasteDeliveryPortLocation")
    public JAXBElement<LocationType> createRemainingWasteDeliveryPortLocation(LocationType value) {
        return new JAXBElement<LocationType>(_RemainingWasteDeliveryPortLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MasterPerson")
    public JAXBElement<PersonType> createMasterPerson(PersonType value) {
        return new JAXBElement<PersonType>(_MasterPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MaximumDeliveryUnit")
    public JAXBElement<DeliveryUnitType> createMaximumDeliveryUnit(DeliveryUnitType value) {
        return new JAXBElement<DeliveryUnitType>(_MaximumDeliveryUnit_QNAME, DeliveryUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MeasurementDimension")
    public JAXBElement<DimensionType> createMeasurementDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_MeasurementDimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageDeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MessageDelivery")
    public JAXBElement<MessageDeliveryType> createMessageDelivery(MessageDeliveryType value) {
        return new JAXBElement<MessageDeliveryType>(_MessageDelivery_QNAME, MessageDeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Meter")
    public JAXBElement<MeterType> createMeter(MeterType value) {
        return new JAXBElement<MeterType>(_Meter_QNAME, MeterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MinimumDeliveryUnit")
    public JAXBElement<DeliveryUnitType> createMinimumDeliveryUnit(DeliveryUnitType value) {
        return new JAXBElement<DeliveryUnitType>(_MinimumDeliveryUnit_QNAME, DeliveryUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MinutesDocumentReference")
    public JAXBElement<DocumentReferenceType> createMinutesDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_MinutesDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MonetaryTotal")
    public JAXBElement<MonetaryTotalType> createMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_MonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MortgageHolderParty")
    public JAXBElement<PartyType> createMortgageHolderParty(PartyType value) {
        return new JAXBElement<PartyType>(_MortgageHolderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "NominationPeriod")
    public JAXBElement<PeriodType> createNominationPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_NominationPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "NotaryParty")
    public JAXBElement<PartyType> createNotaryParty(PartyType value) {
        return new JAXBElement<PartyType>(_NotaryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "NoticeDocumentReference")
    public JAXBElement<DocumentReferenceType> createNoticeDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_NoticeDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "NotificationLocation")
    public JAXBElement<LocationType> createNotificationLocation(LocationType value) {
        return new JAXBElement<LocationType>(_NotificationLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "NotificationPeriod")
    public JAXBElement<PeriodType> createNotificationPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_NotificationPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "NotifierParty")
    public JAXBElement<PartyType> createNotifierParty(PartyType value) {
        return new JAXBElement<PartyType>(_NotifierParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OccurenceLocation")
    public JAXBElement<LocationType> createOccurenceLocation(LocationType value) {
        return new JAXBElement<LocationType>(_OccurenceLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemLocationQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OfferedItemLocationQuantity")
    public JAXBElement<ItemLocationQuantityType> createOfferedItemLocationQuantity(ItemLocationQuantityType value) {
        return new JAXBElement<ItemLocationQuantityType>(_OfferedItemLocationQuantity_QNAME, ItemLocationQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OfficeOfDepartureLocation")
    public JAXBElement<LocationType> createOfficeOfDepartureLocation(LocationType value) {
        return new JAXBElement<LocationType>(_OfficeOfDepartureLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OfficeOfDestinationLocation")
    public JAXBElement<LocationType> createOfficeOfDestinationLocation(LocationType value) {
        return new JAXBElement<LocationType>(_OfficeOfDestinationLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OfficeOfEntryLocation")
    public JAXBElement<LocationType> createOfficeOfEntryLocation(LocationType value) {
        return new JAXBElement<LocationType>(_OfficeOfEntryLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OfficeOfExitLocation")
    public JAXBElement<LocationType> createOfficeOfExitLocation(LocationType value) {
        return new JAXBElement<LocationType>(_OfficeOfExitLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OfficeOfExportLocation")
    public JAXBElement<LocationType> createOfficeOfExportLocation(LocationType value) {
        return new JAXBElement<LocationType>(_OfficeOfExportLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OfficeOfImportLocation")
    public JAXBElement<LocationType> createOfficeOfImportLocation(LocationType value) {
        return new JAXBElement<LocationType>(_OfficeOfImportLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OfficeOfSubSequentiallyEntryLocation")
    public JAXBElement<LocationType> createOfficeOfSubSequentiallyEntryLocation(LocationType value) {
        return new JAXBElement<LocationType>(_OfficeOfSubSequentiallyEntryLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnAccountPaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OnAccountPayment")
    public JAXBElement<OnAccountPaymentType> createOnAccountPayment(OnAccountPaymentType value) {
        return new JAXBElement<OnAccountPaymentType>(_OnAccountPayment_QNAME, OnAccountPaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OnCarriageShipmentStage")
    public JAXBElement<ShipmentStageType> createOnCarriageShipmentStage(ShipmentStageType value) {
        return new JAXBElement<ShipmentStageType>(_OnCarriageShipmentStage_QNAME, ShipmentStageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OpenTenderEvent")
    public JAXBElement<EventType> createOpenTenderEvent(EventType value) {
        return new JAXBElement<EventType>(_OpenTenderEvent_QNAME, EventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OperatingParty")
    public JAXBElement<PartyType> createOperatingParty(PartyType value) {
        return new JAXBElement<PartyType>(_OperatingParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OptionalTakeoverTransportEvent")
    public JAXBElement<TransportEventType> createOptionalTakeoverTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_OptionalTakeoverTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OrderChangeDocumentReference")
    public JAXBElement<DocumentReferenceType> createOrderChangeDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_OrderChangeDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Package")
    public JAXBElement<PackageType> createPackage(PackageType value) {
        return new JAXBElement<PackageType>(_Package_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginAddress")
    public JAXBElement<AddressType> createOriginAddress(AddressType value) {
        return new JAXBElement<AddressType>(_OriginAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginCountry")
    public JAXBElement<CountryType> createOriginCountry(CountryType value) {
        return new JAXBElement<CountryType>(_OriginCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalDepartureCountry")
    public JAXBElement<CountryType> createOriginalDepartureCountry(CountryType value) {
        return new JAXBElement<CountryType>(_OriginalDepartureCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalDespatchParty")
    public JAXBElement<PartyType> createOriginalDespatchParty(PartyType value) {
        return new JAXBElement<PartyType>(_OriginalDespatchParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalDespatchTransportationService")
    public JAXBElement<TransportationServiceType> createOriginalDespatchTransportationService(TransportationServiceType value) {
        return new JAXBElement<TransportationServiceType>(_OriginalDespatchTransportationService_QNAME, TransportationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemLocationQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalItemLocationQuantity")
    public JAXBElement<ItemLocationQuantityType> createOriginalItemLocationQuantity(ItemLocationQuantityType value) {
        return new JAXBElement<ItemLocationQuantityType>(_OriginalItemLocationQuantity_QNAME, ItemLocationQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginatorParty")
    public JAXBElement<PartyType> createOriginatorParty(PartyType value) {
        return new JAXBElement<PartyType>(_OriginatorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OtherCommunication")
    public JAXBElement<CommunicationType> createOtherCommunication(CommunicationType value) {
        return new JAXBElement<CommunicationType>(_OtherCommunication_QNAME, CommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OwnerParty")
    public JAXBElement<PartyType> createOwnerParty(PartyType value) {
        return new JAXBElement<PartyType>(_OwnerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportHandlingUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PackagedTransportHandlingUnit")
    public JAXBElement<TransportHandlingUnitType> createPackagedTransportHandlingUnit(TransportHandlingUnitType value) {
        return new JAXBElement<TransportHandlingUnitType>(_PackagedTransportHandlingUnit_QNAME, TransportHandlingUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PalletSpaceMeasurementDimension")
    public JAXBElement<DimensionType> createPalletSpaceMeasurementDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_PalletSpaceMeasurementDimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ParentDocumentLineReference")
    public JAXBElement<LineReferenceType> createParentDocumentLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_ParentDocumentLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ParentDocumentReference")
    public JAXBElement<DocumentReferenceType> createParentDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ParentDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TechnicalContact")
    public JAXBElement<ContactType> createTechnicalContact(ContactType value) {
        return new JAXBElement<ContactType>(_TechnicalContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupportContact")
    public JAXBElement<ContactType> createSupportContact(ContactType value) {
        return new JAXBElement<ContactType>(_SupportContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ParticipationInvitationPeriod")
    public JAXBElement<PeriodType> createParticipationInvitationPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ParticipationInvitationPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ParticipationRequestReceptionPeriod")
    public JAXBElement<PeriodType> createParticipationRequestReceptionPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ParticipationRequestReceptionPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PartyAuthorization")
    public JAXBElement<AuthorizationType> createPartyAuthorization(AuthorizationType value) {
        return new JAXBElement<AuthorizationType>(_PartyAuthorization_QNAME, AuthorizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PartyGroup")
    public JAXBElement<PartyGroupType> createPartyGroup(PartyGroupType value) {
        return new JAXBElement<PartyGroupType>(_PartyGroup_QNAME, PartyGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RegistrationAddress")
    public JAXBElement<AddressType> createRegistrationAddress(AddressType value) {
        return new JAXBElement<AddressType>(_RegistrationAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PassengerPerson")
    public JAXBElement<PersonType> createPassengerPerson(PersonType value) {
        return new JAXBElement<PersonType>(_PassengerPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PayeeParty")
    public JAXBElement<PartyType> createPayeeParty(PartyType value) {
        return new JAXBElement<PartyType>(_PayeeParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Payment")
    public JAXBElement<PaymentType> createPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_Payment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PaymentAlternativeExchangeRate")
    public JAXBElement<ExchangeRateType> createPaymentAlternativeExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_PaymentAlternativeExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClauseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PenaltyClause")
    public JAXBElement<ClauseType> createPenaltyClause(ClauseType value) {
        return new JAXBElement<ClauseType>(_PenaltyClause_QNAME, ClauseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PenaltyPaymentTerms")
    public JAXBElement<PaymentTermsType> createPenaltyPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_PenaltyPaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PenaltyPeriod")
    public JAXBElement<PeriodType> createPenaltyPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_PenaltyPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PerformingCarrierParty")
    public JAXBElement<PartyType> createPerformingCarrierParty(PartyType value) {
        return new JAXBElement<PartyType>(_PerformingCarrierParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PhysicalLocation")
    public JAXBElement<LocationType> createPhysicalLocation(LocationType value) {
        return new JAXBElement<LocationType>(_PhysicalLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PickupLocation")
    public JAXBElement<LocationType> createPickupLocation(LocationType value) {
        return new JAXBElement<LocationType>(_PickupLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PickupParty")
    public JAXBElement<PartyType> createPickupParty(PartyType value) {
        return new JAXBElement<PartyType>(_PickupParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PickupTransportEvent")
    public JAXBElement<TransportEventType> createPickupTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_PickupTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PlannedArrivalTransportEvent")
    public JAXBElement<TransportEventType> createPlannedArrivalTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_PlannedArrivalTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PlannedDeliveryTransportEvent")
    public JAXBElement<TransportEventType> createPlannedDeliveryTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_PlannedDeliveryTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PlannedDepartureTransportEvent")
    public JAXBElement<TransportEventType> createPlannedDepartureTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_PlannedDepartureTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PlannedPeriod")
    public JAXBElement<PeriodType> createPlannedPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_PlannedPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PlannedPickupTransportEvent")
    public JAXBElement<TransportEventType> createPlannedPickupTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_PlannedPickupTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PlannedWaypointTransportEvent")
    public JAXBElement<TransportEventType> createPlannedWaypointTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_PlannedWaypointTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PointOfSaleContact")
    public JAXBElement<ContactType> createPointOfSaleContact(ContactType value) {
        return new JAXBElement<ContactType>(_PointOfSaleContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PointOfSaleLocation")
    public JAXBElement<LocationType> createPointOfSaleLocation(LocationType value) {
        return new JAXBElement<LocationType>(_PointOfSaleLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortCallType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PortCall")
    public JAXBElement<PortCallType> createPortCall(PortCallType value) {
        return new JAXBElement<PortCallType>(_PortCall_QNAME, PortCallType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortCallPurposeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PortCallPurpose")
    public JAXBElement<PortCallPurposeType> createPortCallPurpose(PortCallPurposeType value) {
        return new JAXBElement<PortCallPurposeType>(_PortCallPurpose_QNAME, PortCallPurposeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PositioningTransportEvent")
    public JAXBElement<TransportEventType> createPositioningTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_PositioningTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PostalAddress")
    public JAXBElement<AddressType> createPostalAddress(AddressType value) {
        return new JAXBElement<AddressType>(_PostalAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WitnessParty")
    public JAXBElement<PartyType> createWitnessParty(PartyType value) {
        return new JAXBElement<PartyType>(_WitnessParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PreCarriageShipmentStage")
    public JAXBElement<ShipmentStageType> createPreCarriageShipmentStage(ShipmentStageType value) {
        return new JAXBElement<ShipmentStageType>(_PreCarriageShipmentStage_QNAME, ShipmentStageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PrepaidPayment")
    public JAXBElement<PaymentType> createPrepaidPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_PrepaidPayment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PrepaidPaymentTerms")
    public JAXBElement<PaymentTermsType> createPrepaidPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_PrepaidPaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDeclarationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PreviousCustomsDeclaration")
    public JAXBElement<CustomsDeclarationType> createPreviousCustomsDeclaration(CustomsDeclarationType value) {
        return new JAXBElement<CustomsDeclarationType>(_PreviousCustomsDeclaration_QNAME, CustomsDeclarationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PreviousDocumentReference")
    public JAXBElement<DocumentReferenceType> createPreviousDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_PreviousDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PreviousPriceList")
    public JAXBElement<PriceListType> createPreviousPriceList(PriceListType value) {
        return new JAXBElement<PriceListType>(_PreviousPriceList_QNAME, PriceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PriceExtension")
    public JAXBElement<PriceExtensionType> createPriceExtension(PriceExtensionType value) {
        return new JAXBElement<PriceExtensionType>(_PriceExtension_QNAME, PriceExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PriceList")
    public JAXBElement<PriceListType> createPriceList(PriceListType value) {
        return new JAXBElement<PriceListType>(_PriceList_QNAME, PriceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortCallPurposeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PrimaryPortCallPurpose")
    public JAXBElement<PortCallPurposeType> createPrimaryPortCallPurpose(PortCallPurposeType value) {
        return new JAXBElement<PortCallPurposeType>(_PrimaryPortCallPurpose_QNAME, PortCallPurposeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ProcessingParty")
    public JAXBElement<PartyType> createProcessingParty(PartyType value) {
        return new JAXBElement<PartyType>(_ProcessingParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ProcurementLegislationDocumentReference")
    public JAXBElement<DocumentReferenceType> createProcurementLegislationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ProcurementLegislationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RealizedLocation")
    public JAXBElement<LocationType> createRealizedLocation(LocationType value) {
        return new JAXBElement<LocationType>(_RealizedLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForTenderLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestForTenderLine")
    public JAXBElement<RequestForTenderLineType> createRequestForTenderLine(RequestForTenderLineType value) {
        return new JAXBElement<RequestForTenderLineType>(_RequestForTenderLine_QNAME, RequestForTenderLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcurementProjectLotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ProcurementProjectLot")
    public JAXBElement<ProcurementProjectLotType> createProcurementProjectLot(ProcurementProjectLotType value) {
        return new JAXBElement<ProcurementProjectLotType>(_ProcurementProjectLot_QNAME, ProcurementProjectLotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PromisedDeliveryPeriod")
    public JAXBElement<PeriodType> createPromisedDeliveryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_PromisedDeliveryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ProofOfReexportationRequestDocumentReference")
    public JAXBElement<DocumentReferenceType> createProofOfReexportationRequestDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ProofOfReexportationRequestDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PropertyIdentification")
    public JAXBElement<PropertyIdentificationType> createPropertyIdentification(PropertyIdentificationType value) {
        return new JAXBElement<PropertyIdentificationType>(_PropertyIdentification_QNAME, PropertyIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ProvidedDocumentReference")
    public JAXBElement<DocumentReferenceType> createProvidedDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ProvidedDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ProviderParty")
    public JAXBElement<PartyType> createProviderParty(PartyType value) {
        return new JAXBElement<PartyType>(_ProviderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PurchaseLinePeriod")
    public JAXBElement<PeriodType> createPurchaseLinePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_PurchaseLinePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QualificationRequestRecipientParty")
    public JAXBElement<PartyType> createQualificationRequestRecipientParty(PartyType value) {
        return new JAXBElement<PartyType>(_QualificationRequestRecipientParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QuarantineTransportEvent")
    public JAXBElement<TransportEventType> createQuarantineTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_QuarantineTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestLineReference")
    public JAXBElement<LineReferenceType> createRequestLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_RequestLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QuotedMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createQuotedMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_QuotedMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RangeDimension")
    public JAXBElement<DimensionType> createRangeDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_RangeDimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiptDocumentReference")
    public JAXBElement<DocumentReferenceType> createReceiptDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ReceiptDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiptLine")
    public JAXBElement<ReceiptLineType> createReceiptLine(ReceiptLineType value) {
        return new JAXBElement<ReceiptLineType>(_ReceiptLine_QNAME, ReceiptLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiptLineReference")
    public JAXBElement<LineReferenceType> createReceiptLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_ReceiptLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiptTransportEvent")
    public JAXBElement<TransportEventType> createReceiptTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_ReceiptTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceivedHandlingUnitReceiptLine")
    public JAXBElement<ReceiptLineType> createReceivedHandlingUnitReceiptLine(ReceiptLineType value) {
        return new JAXBElement<ReceiptLineType>(_ReceivedHandlingUnitReceiptLine_QNAME, ReceiptLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiverParty")
    public JAXBElement<PartyType> createReceiverParty(PartyType value) {
        return new JAXBElement<PartyType>(_ReceiverParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RecipientParty")
    public JAXBElement<PartyType> createRecipientParty(PartyType value) {
        return new JAXBElement<PartyType>(_RecipientParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReexportationEvidence")
    public JAXBElement<EvidenceType> createReexportationEvidence(EvidenceType value) {
        return new JAXBElement<EvidenceType>(_ReexportationEvidence_QNAME, EvidenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReferencedConsignment")
    public JAXBElement<ConsignmentType> createReferencedConsignment(ConsignmentType value) {
        return new JAXBElement<ConsignmentType>(_ReferencedConsignment_QNAME, ConsignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReferencedContract")
    public JAXBElement<ContractType> createReferencedContract(ContractType value) {
        return new JAXBElement<ContractType>(_ReferencedContract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReferencedGoodsItem")
    public JAXBElement<GoodsItemType> createReferencedGoodsItem(GoodsItemType value) {
        return new JAXBElement<GoodsItemType>(_ReferencedGoodsItem_QNAME, GoodsItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReferencedPackage")
    public JAXBElement<PackageType> createReferencedPackage(PackageType value) {
        return new JAXBElement<PackageType>(_ReferencedPackage_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReferencedShipment")
    public JAXBElement<ShipmentType> createReferencedShipment(ShipmentType value) {
        return new JAXBElement<ShipmentType>(_ReferencedShipment_QNAME, ShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReferencedTransportEquipment")
    public JAXBElement<TransportEquipmentType> createReferencedTransportEquipment(TransportEquipmentType value) {
        return new JAXBElement<TransportEquipmentType>(_ReferencedTransportEquipment_QNAME, TransportEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegulationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Regulation")
    public JAXBElement<RegulationType> createRegulation(RegulationType value) {
        return new JAXBElement<RegulationType>(_Regulation_QNAME, RegulationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RelatedCatalogueReference")
    public JAXBElement<CatalogueReferenceType> createRelatedCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_RelatedCatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RelatedItem")
    public JAXBElement<RelatedItemType> createRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_RelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReminderPeriod")
    public JAXBElement<PeriodType> createReminderPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ReminderPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReplacedNoticeDocumentReference")
    public JAXBElement<DocumentReferenceType> createReplacedNoticeDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ReplacedNoticeDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReportedShipment")
    public JAXBElement<ShipmentType> createReportedShipment(ShipmentType value) {
        return new JAXBElement<ShipmentType>(_ReportedShipment_QNAME, ShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReporterParty")
    public JAXBElement<PartyType> createReporterParty(PartyType value) {
        return new JAXBElement<PartyType>(_ReporterParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReportingLocation")
    public JAXBElement<LocationType> createReportingLocation(LocationType value) {
        return new JAXBElement<LocationType>(_ReportingLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReportingPerson")
    public JAXBElement<PersonType> createReportingPerson(PersonType value) {
        return new JAXBElement<PersonType>(_ReportingPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RepresentativeParty")
    public JAXBElement<PartyType> createRepresentativeParty(PartyType value) {
        return new JAXBElement<PartyType>(_RepresentativeParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestForQuotationDocumentReference")
    public JAXBElement<DocumentReferenceType> createRequestForQuotationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_RequestForQuotationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedArrivalEvent")
    public JAXBElement<EventType> createRequestedArrivalEvent(EventType value) {
        return new JAXBElement<EventType>(_RequestedArrivalEvent_QNAME, EventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedArrivalTransportEvent")
    public JAXBElement<TransportEventType> createRequestedArrivalTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_RequestedArrivalTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedCatalogueReference")
    public JAXBElement<CatalogueReferenceType> createRequestedCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_RequestedCatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedClassificationScheme")
    public JAXBElement<ClassificationSchemeType> createRequestedClassificationScheme(ClassificationSchemeType value) {
        return new JAXBElement<ClassificationSchemeType>(_RequestedClassificationScheme_QNAME, ClassificationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedDeliveryPeriod")
    public JAXBElement<PeriodType> createRequestedDeliveryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_RequestedDeliveryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedDeliveryTransportEvent")
    public JAXBElement<TransportEventType> createRequestedDeliveryTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_RequestedDeliveryTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedDepartureTransportEvent")
    public JAXBElement<TransportEventType> createRequestedDepartureTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_RequestedDepartureTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedDocumentReference")
    public JAXBElement<DocumentReferenceType> createRequestedDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_RequestedDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedLanguage")
    public JAXBElement<LanguageType> createRequestedLanguage(LanguageType value) {
        return new JAXBElement<LanguageType>(_RequestedLanguage_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createRequestedMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_RequestedMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedPickupTransportEvent")
    public JAXBElement<TransportEventType> createRequestedPickupTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_RequestedPickupTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedStatusLocation")
    public JAXBElement<LocationType> createRequestedStatusLocation(LocationType value) {
        return new JAXBElement<LocationType>(_RequestedStatusLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedStatusPeriod")
    public JAXBElement<PeriodType> createRequestedStatusPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_RequestedStatusPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedValidityPeriod")
    public JAXBElement<PeriodType> createRequestedValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_RequestedValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedWaypointTransportEvent")
    public JAXBElement<TransportEventType> createRequestedWaypointTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_RequestedWaypointTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestorParty")
    public JAXBElement<PartyType> createRequestorParty(PartyType value) {
        return new JAXBElement<PartyType>(_RequestorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredBusinessClassificationScheme")
    public JAXBElement<ClassificationSchemeType> createRequiredBusinessClassificationScheme(ClassificationSchemeType value) {
        return new JAXBElement<ClassificationSchemeType>(_RequiredBusinessClassificationScheme_QNAME, ClassificationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredCertificationDocumentReference")
    public JAXBElement<DocumentReferenceType> createRequiredCertificationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_RequiredCertificationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredDocumentReference")
    public JAXBElement<DocumentReferenceType> createRequiredDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_RequiredDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialGuaranteeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredFinancialGuarantee")
    public JAXBElement<FinancialGuaranteeType> createRequiredFinancialGuarantee(FinancialGuaranteeType value) {
        return new JAXBElement<FinancialGuaranteeType>(_RequiredFinancialGuarantee_QNAME, FinancialGuaranteeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ResidenceAddress")
    public JAXBElement<AddressType> createResidenceAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ResidenceAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ResolutionDocumentReference")
    public JAXBElement<DocumentReferenceType> createResolutionDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ResolutionDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ResponderParty")
    public JAXBElement<PartyType> createResponderParty(PartyType value) {
        return new JAXBElement<PartyType>(_ResponderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ResponsibleTransportServiceProviderParty")
    public JAXBElement<PartyType> createResponsibleTransportServiceProviderParty(PartyType value) {
        return new JAXBElement<PartyType>(_ResponsibleTransportServiceProviderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RetailerCustomerParty")
    public JAXBElement<CustomerPartyType> createRetailerCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_RetailerCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReturnAddress")
    public JAXBElement<AddressType> createReturnAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ReturnAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SalesDocumentReference")
    public JAXBElement<DocumentReferenceType> createSalesDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_SalesDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFrequencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ScheduledServiceFrequency")
    public JAXBElement<ServiceFrequencyType> createScheduledServiceFrequency(ServiceFrequencyType value) {
        return new JAXBElement<ServiceFrequencyType>(_ScheduledServiceFrequency_QNAME, ServiceFrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellerContact")
    public JAXBElement<ContactType> createSellerContact(ContactType value) {
        return new JAXBElement<ContactType>(_SellerContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellersItemIdentification")
    public JAXBElement<ItemIdentificationType> createSellersItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_SellersItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SenderParty")
    public JAXBElement<PartyType> createSenderParty(PartyType value) {
        return new JAXBElement<PartyType>(_SenderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SendingLogisticsOperatorParty")
    public JAXBElement<PartyType> createSendingLogisticsOperatorParty(PartyType value) {
        return new JAXBElement<PartyType>(_SendingLogisticsOperatorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ServiceAllowanceCharge")
    public JAXBElement<AllowanceChargeType> createServiceAllowanceCharge(AllowanceChargeType value) {
        return new JAXBElement<AllowanceChargeType>(_ServiceAllowanceCharge_QNAME, AllowanceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ServiceChargePaymentTerms")
    public JAXBElement<PaymentTermsType> createServiceChargePaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_ServiceChargePaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ServiceEndTimePeriod")
    public JAXBElement<PeriodType> createServiceEndTimePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ServiceEndTimePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFrequencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ServiceFrequency")
    public JAXBElement<ServiceFrequencyType> createServiceFrequency(ServiceFrequencyType value) {
        return new JAXBElement<ServiceFrequencyType>(_ServiceFrequency_QNAME, ServiceFrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ServiceStartTimePeriod")
    public JAXBElement<PeriodType> createServiceStartTimePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ServiceStartTimePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SettlementPeriod")
    public JAXBElement<PeriodType> createSettlementPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_SettlementPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StowageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Stowage")
    public JAXBElement<StowageType> createStowage(StowageType value) {
        return new JAXBElement<StowageType>(_Stowage_QNAME, StowageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ShipmentDocumentReference")
    public JAXBElement<DocumentReferenceType> createShipmentDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ShipmentDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ShipmentStage")
    public JAXBElement<ShipmentStageType> createShipmentStage(ShipmentStageType value) {
        return new JAXBElement<ShipmentStageType>(_ShipmentStage_QNAME, ShipmentStageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ShipperParty")
    public JAXBElement<PartyType> createShipperParty(PartyType value) {
        return new JAXBElement<PartyType>(_ShipperParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ShipsSurgeonPerson")
    public JAXBElement<PersonType> createShipsSurgeonPerson(PersonType value) {
        return new JAXBElement<PersonType>(_ShipsSurgeonPerson_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SourceCatalogueReference")
    public JAXBElement<CatalogueReferenceType> createSourceCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_SourceCatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SourceIssuerParty")
    public JAXBElement<PartyType> createSourceIssuerParty(PartyType value) {
        return new JAXBElement<PartyType>(_SourceIssuerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TendererRequirementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SpecificTendererRequirement")
    public JAXBElement<TendererRequirementType> createSpecificTendererRequirement(TendererRequirementType value) {
        return new JAXBElement<TendererRequirementType>(_SpecificTendererRequirement_QNAME, TendererRequirementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StandardItemIdentification")
    public JAXBElement<ItemIdentificationType> createStandardItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_StandardItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StandardPropertyIdentification")
    public JAXBElement<PropertyIdentificationType> createStandardPropertyIdentification(PropertyIdentificationType value) {
        return new JAXBElement<PropertyIdentificationType>(_StandardPropertyIdentification_QNAME, PropertyIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StatementDocumentReference")
    public JAXBElement<DocumentReferenceType> createStatementDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_StatementDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StatementPeriod")
    public JAXBElement<PeriodType> createStatementPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_StatementPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StatusLocation")
    public JAXBElement<LocationType> createStatusLocation(LocationType value) {
        return new JAXBElement<LocationType>(_StatusLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StatusPeriod")
    public JAXBElement<PeriodType> createStatusPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_StatusPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StorageLocation")
    public JAXBElement<LocationType> createStorageLocation(LocationType value) {
        return new JAXBElement<LocationType>(_StorageLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StorageTransportEvent")
    public JAXBElement<TransportEventType> createStorageTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_StorageTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttestationLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubAttestationLine")
    public JAXBElement<AttestationLineType> createSubAttestationLine(AttestationLineType value) {
        return new JAXBElement<AttestationLineType>(_SubAttestationLine_QNAME, AttestationLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditNoteLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubCreditNoteLine")
    public JAXBElement<CreditNoteLineType> createSubCreditNoteLine(CreditNoteLineType value) {
        return new JAXBElement<CreditNoteLineType>(_SubCreditNoteLine_QNAME, CreditNoteLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitNoteLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubDebitNoteLine")
    public JAXBElement<DebitNoteLineType> createSubDebitNoteLine(DebitNoteLineType value) {
        return new JAXBElement<DebitNoteLineType>(_SubDebitNoteLine_QNAME, DebitNoteLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubDespatchLine")
    public JAXBElement<DespatchLineType> createSubDespatchLine(DespatchLineType value) {
        return new JAXBElement<DespatchLineType>(_SubDespatchLine_QNAME, DespatchLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsProcessingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubGoodsProcessing")
    public JAXBElement<GoodsProcessingType> createSubGoodsProcessing(GoodsProcessingType value) {
        return new JAXBElement<GoodsProcessingType>(_SubGoodsProcessing_QNAME, GoodsProcessingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubInvoiceLine")
    public JAXBElement<InvoiceLineType> createSubInvoiceLine(InvoiceLineType value) {
        return new JAXBElement<InvoiceLineType>(_SubInvoiceLine_QNAME, InvoiceLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubItemProperty")
    public JAXBElement<ItemPropertyType> createSubItemProperty(ItemPropertyType value) {
        return new JAXBElement<ItemPropertyType>(_SubItemProperty_QNAME, ItemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubLineItem")
    public JAXBElement<LineItemType> createSubLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_SubLineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForTenderLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubRequestForTenderLine")
    public JAXBElement<RequestForTenderLineType> createSubRequestForTenderLine(RequestForTenderLineType value) {
        return new JAXBElement<RequestForTenderLineType>(_SubRequestForTenderLine_QNAME, RequestForTenderLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubStatus")
    public JAXBElement<StatusType> createSubStatus(StatusType value) {
        return new JAXBElement<StatusType>(_SubStatus_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubTenderLine")
    public JAXBElement<TenderLineType> createSubTenderLine(TenderLineType value) {
        return new JAXBElement<TenderLineType>(_SubTenderLine_QNAME, TenderLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderingCriterionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubTenderingCriterion")
    public JAXBElement<TenderingCriterionType> createSubTenderingCriterion(TenderingCriterionType value) {
        return new JAXBElement<TenderingCriterionType>(_SubTenderingCriterion_QNAME, TenderingCriterionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubcontractTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubcontractTerms")
    public JAXBElement<SubcontractTermsType> createSubcontractTerms(SubcontractTermsType value) {
        return new JAXBElement<SubcontractTermsType>(_SubcontractTerms_QNAME, SubcontractTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubcontractorParty")
    public JAXBElement<PartyType> createSubcontractorParty(PartyType value) {
        return new JAXBElement<PartyType>(_SubcontractorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardingCriterionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubordinateAwardingCriterion")
    public JAXBElement<AwardingCriterionType> createSubordinateAwardingCriterion(AwardingCriterionType value) {
        return new JAXBElement<AwardingCriterionType>(_SubordinateAwardingCriterion_QNAME, AwardingCriterionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardingCriterionResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubordinateAwardingCriterionResponse")
    public JAXBElement<AwardingCriterionResponseType> createSubordinateAwardingCriterionResponse(AwardingCriterionResponseType value) {
        return new JAXBElement<AwardingCriterionResponseType>(_SubordinateAwardingCriterionResponse_QNAME, AwardingCriterionResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubscriberParty")
    public JAXBElement<PartyType> createSubscriberParty(PartyType value) {
        return new JAXBElement<PartyType>(_SubscriberParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumptionPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UtilityConsumptionPoint")
    public JAXBElement<ConsumptionPointType> createUtilityConsumptionPoint(ConsumptionPointType value) {
        return new JAXBElement<ConsumptionPointType>(_UtilityConsumptionPoint_QNAME, ConsumptionPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UtilitySupplierParty")
    public JAXBElement<PartyType> createUtilitySupplierParty(PartyType value) {
        return new JAXBElement<PartyType>(_UtilitySupplierParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UtilityCustomerParty")
    public JAXBElement<PartyType> createUtilityCustomerParty(PartyType value) {
        return new JAXBElement<PartyType>(_UtilityCustomerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubsidiaryLocation")
    public JAXBElement<LocationType> createSubsidiaryLocation(LocationType value) {
        return new JAXBElement<LocationType>(_SubsidiaryLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderingCriterionPropertyGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubsidiaryTenderingCriterionPropertyGroup")
    public JAXBElement<TenderingCriterionPropertyGroupType> createSubsidiaryTenderingCriterionPropertyGroup(TenderingCriterionPropertyGroupType value) {
        return new JAXBElement<TenderingCriterionPropertyGroupType>(_SubsidiaryTenderingCriterionPropertyGroup_QNAME, TenderingCriterionPropertyGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SubstituteCarrierParty")
    public JAXBElement<PartyType> createSubstituteCarrierParty(PartyType value) {
        return new JAXBElement<PartyType>(_SubstituteCarrierParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SuggestedEvidence")
    public JAXBElement<EvidenceType> createSuggestedEvidence(EvidenceType value) {
        return new JAXBElement<EvidenceType>(_SuggestedEvidence_QNAME, EvidenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupplierParty")
    public JAXBElement<SupplierPartyType> createSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_SupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityDataLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupplyChainActivityDataLine")
    public JAXBElement<ActivityDataLineType> createSupplyChainActivityDataLine(ActivityDataLineType value) {
        return new JAXBElement<ActivityDataLineType>(_SupplyChainActivityDataLine_QNAME, ActivityDataLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupportedCommodityClassification")
    public JAXBElement<CommodityClassificationType> createSupportedCommodityClassification(CommodityClassificationType value) {
        return new JAXBElement<CommodityClassificationType>(_SupportedCommodityClassification_QNAME, CommodityClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupportedTransportEquipment")
    public JAXBElement<TransportEquipmentType> createSupportedTransportEquipment(TransportEquipmentType value) {
        return new JAXBElement<TransportEquipmentType>(_SupportedTransportEquipment_QNAME, TransportEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TakeoverTransportEvent")
    public JAXBElement<TransportEventType> createTakeoverTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_TakeoverTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxDueCountry")
    public JAXBElement<CountryType> createTaxDueCountry(CountryType value) {
        return new JAXBElement<CountryType>(_TaxDueCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxRepresentativeParty")
    public JAXBElement<PartyType> createTaxRepresentativeParty(PartyType value) {
        return new JAXBElement<PartyType>(_TaxRepresentativeParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TechnicalCapability")
    public JAXBElement<CapabilityType> createTechnicalCapability(CapabilityType value) {
        return new JAXBElement<CapabilityType>(_TechnicalCapability_QNAME, CapabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TechnicalDocumentReference")
    public JAXBElement<DocumentReferenceType> createTechnicalDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TechnicalDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluationCriterionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TechnicalEvaluationCriterion")
    public JAXBElement<EvaluationCriterionType> createTechnicalEvaluationCriterion(EvaluationCriterionType value) {
        return new JAXBElement<EvaluationCriterionType>(_TechnicalEvaluationCriterion_QNAME, EvaluationCriterionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Temperature")
    public JAXBElement<TemperatureType> createTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_Temperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TemplateDocumentReference")
    public JAXBElement<DocumentReferenceType> createTemplateDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TemplateDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvidenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TemplateEvidence")
    public JAXBElement<EvidenceType> createTemplateEvidence(EvidenceType value) {
        return new JAXBElement<EvidenceType>(_TemplateEvidence_QNAME, EvidenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderDocumentReference")
    public JAXBElement<DocumentReferenceType> createTenderDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TenderDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptionDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderEncryptionData")
    public JAXBElement<EncryptionDataType> createTenderEncryptionData(EncryptionDataType value) {
        return new JAXBElement<EncryptionDataType>(_TenderEncryptionData_QNAME, EncryptionDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderEvaluationParty")
    public JAXBElement<PartyType> createTenderEvaluationParty(PartyType value) {
        return new JAXBElement<PartyType>(_TenderEvaluationParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderLine")
    public JAXBElement<TenderLineType> createTenderLine(TenderLineType value) {
        return new JAXBElement<TenderLineType>(_TenderLine_QNAME, TenderLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderNotificationDocumentReference")
    public JAXBElement<DocumentReferenceType> createTenderNotificationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TenderNotificationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderRecipientParty")
    public JAXBElement<PartyType> createTenderRecipientParty(PartyType value) {
        return new JAXBElement<PartyType>(_TenderRecipientParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderRequirementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderRequirement")
    public JAXBElement<TenderRequirementType> createTenderRequirement(TenderRequirementType value) {
        return new JAXBElement<TenderRequirementType>(_TenderRequirement_QNAME, TenderRequirementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderStatusInquiryDocumentReference")
    public JAXBElement<DocumentReferenceType> createTenderStatusInquiryDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TenderStatusInquiryDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderSubmissionDeadlinePeriod")
    public JAXBElement<PeriodType> createTenderSubmissionDeadlinePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_TenderSubmissionDeadlinePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderValidityPeriod")
    public JAXBElement<PeriodType> createTenderValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_TenderValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderedProjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderedProject")
    public JAXBElement<TenderedProjectType> createTenderedProject(TenderedProjectType value) {
        return new JAXBElement<TenderedProjectType>(_TenderedProject_QNAME, TenderedProjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TendererParty")
    public JAXBElement<PartyType> createTendererParty(PartyType value) {
        return new JAXBElement<PartyType>(_TendererParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TendererQualificationDocumentReference")
    public JAXBElement<DocumentReferenceType> createTendererQualificationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TendererQualificationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TendererRequirementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TendererRequirement")
    public JAXBElement<TendererRequirementType> createTendererRequirement(TendererRequirementType value) {
        return new JAXBElement<TendererRequirementType>(_TendererRequirement_QNAME, TendererRequirementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderingCriterionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderingCriterion")
    public JAXBElement<TenderingCriterionType> createTenderingCriterion(TenderingCriterionType value) {
        return new JAXBElement<TenderingCriterionType>(_TenderingCriterion_QNAME, TenderingCriterionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TenderingCriterionPropertyGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TenderingCriterionPropertyGroup")
    public JAXBElement<TenderingCriterionPropertyGroupType> createTenderingCriterionPropertyGroup(TenderingCriterionPropertyGroupType value) {
        return new JAXBElement<TenderingCriterionPropertyGroupType>(_TenderingCriterionPropertyGroup_QNAME, TenderingCriterionPropertyGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TerminalOperatorParty")
    public JAXBElement<PartyType> createTerminalOperatorParty(PartyType value) {
        return new JAXBElement<PartyType>(_TerminalOperatorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ToLocation")
    public JAXBElement<LocationType> createToLocation(LocationType value) {
        return new JAXBElement<LocationType>(_ToLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TotalCapacityDimension")
    public JAXBElement<DimensionType> createTotalCapacityDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_TotalCapacityDimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradingTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TradingTerms")
    public JAXBElement<TradingTermsType> createTradingTerms(TradingTermsType value) {
        return new JAXBElement<TradingTermsType>(_TradingTerms_QNAME, TradingTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransitCountry")
    public JAXBElement<CountryType> createTransitCountry(CountryType value) {
        return new JAXBElement<CountryType>(_TransitCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransitCustomsExitOfficeLocation")
    public JAXBElement<LocationType> createTransitCustomsExitOfficeLocation(LocationType value) {
        return new JAXBElement<LocationType>(_TransitCustomsExitOfficeLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransitExporterParty")
    public JAXBElement<PartyType> createTransitExporterParty(PartyType value) {
        return new JAXBElement<PartyType>(_TransitExporterParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransitPeriod")
    public JAXBElement<PeriodType> createTransitPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_TransitPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportAdvisorParty")
    public JAXBElement<PartyType> createTransportAdvisorParty(PartyType value) {
        return new JAXBElement<PartyType>(_TransportAdvisorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportContract")
    public JAXBElement<ContractType> createTransportContract(ContractType value) {
        return new JAXBElement<ContractType>(_TransportContract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportEvent")
    public JAXBElement<TransportEventType> createTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_TransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportExecutionPlanDocumentReference")
    public JAXBElement<DocumentReferenceType> createTransportExecutionPlanDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TransportExecutionPlanDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportExecutionPlanRequestDocumentReference")
    public JAXBElement<DocumentReferenceType> createTransportExecutionPlanRequestDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TransportExecutionPlanRequestDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportHandlingUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportHandlingUnit")
    public JAXBElement<TransportHandlingUnitType> createTransportHandlingUnit(TransportHandlingUnitType value) {
        return new JAXBElement<TransportHandlingUnitType>(_TransportHandlingUnit_QNAME, TransportHandlingUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportMeans")
    public JAXBElement<TransportMeansType> createTransportMeans(TransportMeansType value) {
        return new JAXBElement<TransportMeansType>(_TransportMeans_QNAME, TransportMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportProgressStatusRequestDocumentReference")
    public JAXBElement<DocumentReferenceType> createTransportProgressStatusRequestDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TransportProgressStatusRequestDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportServiceDescriptionDocumentReference")
    public JAXBElement<DocumentReferenceType> createTransportServiceDescriptionDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TransportServiceDescriptionDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportServiceDescriptionRequestDocumentReference")
    public JAXBElement<DocumentReferenceType> createTransportServiceDescriptionRequestDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TransportServiceDescriptionRequestDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportServiceProviderParty")
    public JAXBElement<PartyType> createTransportServiceProviderParty(PartyType value) {
        return new JAXBElement<PartyType>(_TransportServiceProviderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportServiceProviderResponseDeadlinePeriod")
    public JAXBElement<PeriodType> createTransportServiceProviderResponseDeadlinePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_TransportServiceProviderResponseDeadlinePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportServiceProviderResponseRequiredPeriod")
    public JAXBElement<PeriodType> createTransportServiceProviderResponseRequiredPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_TransportServiceProviderResponseRequiredPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportUserParty")
    public JAXBElement<PartyType> createTransportUserParty(PartyType value) {
        return new JAXBElement<PartyType>(_TransportUserParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportUserResponseRequiredPeriod")
    public JAXBElement<PeriodType> createTransportUserResponseRequiredPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_TransportUserResponseRequiredPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportationService")
    public JAXBElement<TransportationServiceType> createTransportationService(TransportationServiceType value) {
        return new JAXBElement<TransportationServiceType>(_TransportationService_QNAME, TransportationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportationStatusRequestDocumentReference")
    public JAXBElement<DocumentReferenceType> createTransportationStatusRequestDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_TransportationStatusRequestDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransshipPortLocation")
    public JAXBElement<LocationType> createTransshipPortLocation(LocationType value) {
        return new JAXBElement<LocationType>(_TransshipPortLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UnloadingLocation")
    public JAXBElement<LocationType> createUnloadingLocation(LocationType value) {
        return new JAXBElement<LocationType>(_UnloadingLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UnloadingPortLocation")
    public JAXBElement<LocationType> createUnloadingPortLocation(LocationType value) {
        return new JAXBElement<LocationType>(_UnloadingPortLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UnsubscribeToProcedureDocumentReference")
    public JAXBElement<DocumentReferenceType> createUnsubscribeToProcedureDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_UnsubscribeToProcedureDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityClassificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UnsupportedCommodityClassification")
    public JAXBElement<CommodityClassificationType> createUnsupportedCommodityClassification(CommodityClassificationType value) {
        return new JAXBElement<CommodityClassificationType>(_UnsupportedCommodityClassification_QNAME, CommodityClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UnsupportedTransportEquipment")
    public JAXBElement<TransportEquipmentType> createUnsupportedTransportEquipment(TransportEquipmentType value) {
        return new JAXBElement<TransportEquipmentType>(_UnsupportedTransportEquipment_QNAME, TransportEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UpdatedDeliveryTransportEvent")
    public JAXBElement<TransportEventType> createUpdatedDeliveryTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_UpdatedDeliveryTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UpdatedPickupTransportEvent")
    public JAXBElement<TransportEventType> createUpdatedPickupTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_UpdatedPickupTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UsabilityPeriod")
    public JAXBElement<PeriodType> createUsabilityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_UsabilityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UtilityMeter")
    public JAXBElement<MeterType> createUtilityMeter(MeterType value) {
        return new JAXBElement<MeterType>(_UtilityMeter_QNAME, MeterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WeighingParty")
    public JAXBElement<PartyType> createWeighingParty(PartyType value) {
        return new JAXBElement<PartyType>(_WeighingParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WarehouseParty")
    public JAXBElement<PartyType> createWarehouseParty(PartyType value) {
        return new JAXBElement<PartyType>(_WarehouseParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WarehousingTransportEvent")
    public JAXBElement<TransportEventType> createWarehousingTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_WarehousingTransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebSiteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WebSite")
    public JAXBElement<WebSiteType> createWebSite(WebSiteType value) {
        return new JAXBElement<WebSiteType>(_WebSite_QNAME, WebSiteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WithholdingTaxTotal")
    public JAXBElement<TaxTotalType> createWithholdingTaxTotal(TaxTotalType value) {
        return new JAXBElement<TaxTotalType>(_WithholdingTaxTotal_QNAME, TaxTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "DigestValue")
    public JAXBElement<byte[]> createDigestValue(byte[] value) {
        return new JAXBElement<byte[]>(_DigestValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "KeyName")
    public JAXBElement<String> createKeyName(String value) {
        return new JAXBElement<String>(_KeyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "MgmtData")
    public JAXBElement<String> createMgmtData(String value) {
        return new JAXBElement<String>(_MgmtData_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CharTwoFieldParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2009/xmldsig11#", name = "GnB")
    public JAXBElement<CharTwoFieldParamsType> createGnB(CharTwoFieldParamsType value) {
        return new JAXBElement<CharTwoFieldParamsType>(_GnB_QNAME, CharTwoFieldParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "Any")
    public JAXBElement<AnyType> createAny(AnyType value) {
        return new JAXBElement<AnyType>(_Any_QNAME, AnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "ObjectIdentifier")
    public JAXBElement<ObjectIdentifierType> createObjectIdentifier(ObjectIdentifierType value) {
        return new JAXBElement<ObjectIdentifierType>(_ObjectIdentifier_QNAME, ObjectIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncapsulatedPKIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "EncapsulatedPKIData")
    public JAXBElement<EncapsulatedPKIDataType> createEncapsulatedPKIData(EncapsulatedPKIDataType value) {
        return new JAXBElement<EncapsulatedPKIDataType>(_EncapsulatedPKIData_QNAME, EncapsulatedPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "XAdESTimeStamp")
    public JAXBElement<XAdESTimeStampType> createXAdESTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_XAdESTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffsetDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigningTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<OffsetDateTime> createSigningTime(OffsetDateTime value) {
        return new JAXBElement<OffsetDateTime>(_SigningTime_QNAME, OffsetDateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignedAssertion")
    public JAXBElement<AnyType> createSignedAssertion(AnyType value) {
        return new JAXBElement<AnyType>(_SignedAssertion_QNAME, AnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AllDataObjectsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createAllDataObjectsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_AllDataObjectsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "IndividualDataObjectsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createIndividualDataObjectsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_IndividualDataObjectsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SignatureTimeStamp")
    public JAXBElement<XAdESTimeStampType> createSignatureTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SignatureTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteCertificateRefs")
    public JAXBElement<CompleteCertificateRefsType> createCompleteCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_CompleteCertificateRefs_QNAME, CompleteCertificateRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CompleteRevocationRefs")
    public JAXBElement<CompleteRevocationRefsType> createCompleteRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_CompleteRevocationRefs_QNAME, CompleteRevocationRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeCertificateRefs")
    public JAXBElement<CompleteCertificateRefsType> createAttributeCertificateRefs(CompleteCertificateRefsType value) {
        return new JAXBElement<CompleteCertificateRefsType>(_AttributeCertificateRefs_QNAME, CompleteCertificateRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationRefs")
    public JAXBElement<CompleteRevocationRefsType> createAttributeRevocationRefs(CompleteRevocationRefsType value) {
        return new JAXBElement<CompleteRevocationRefsType>(_AttributeRevocationRefs_QNAME, CompleteRevocationRefsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SigAndRefsTimeStamp")
    public JAXBElement<XAdESTimeStampType> createSigAndRefsTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SigAndRefsTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RefsOnlyTimeStamp")
    public JAXBElement<XAdESTimeStampType> createRefsOnlyTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_RefsOnlyTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "CertificateValues")
    public JAXBElement<CertificateValuesType> createCertificateValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_CertificateValues_QNAME, CertificateValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "RevocationValues")
    public JAXBElement<RevocationValuesType> createRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_RevocationValues_QNAME, RevocationValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttrAuthoritiesCertValues")
    public JAXBElement<CertificateValuesType> createAttrAuthoritiesCertValues(CertificateValuesType value) {
        return new JAXBElement<CertificateValuesType>(_AttrAuthoritiesCertValues_QNAME, CertificateValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "AttributeRevocationValues")
    public JAXBElement<RevocationValuesType> createAttributeRevocationValues(RevocationValuesType value) {
        return new JAXBElement<RevocationValuesType>(_AttributeRevocationValues_QNAME, RevocationValuesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "ArchiveTimeStamp")
    public JAXBElement<XAdESTimeStampType> createArchiveTimeStamp(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_ArchiveTimeStamp_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "SPURI")
    public JAXBElement<String> createSPURI(String value) {
        return new JAXBElement<String>(_SPURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncapsulatedPKIDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "X509AttributeCertificate")
    public JAXBElement<EncapsulatedPKIDataType> createX509AttributeCertificate(EncapsulatedPKIDataType value) {
        return new JAXBElement<EncapsulatedPKIDataType>(_X509AttributeCertificate_QNAME, EncapsulatedPKIDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.3.2#", name = "OtherAttributeCertificate")
    public JAXBElement<AnyType> createOtherAttributeCertificate(AnyType value) {
        return new JAXBElement<AnyType>(_OtherAttributeCertificate_QNAME, AnyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObjectIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "SPDocSpecification")
    public JAXBElement<ObjectIdentifierType> createSPDocSpecification(ObjectIdentifierType value) {
        return new JAXBElement<ObjectIdentifierType>(_SPDocSpecification_QNAME, ObjectIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "ArchiveTimeStampV2")
    public JAXBElement<XAdESTimeStampType> createArchiveTimeStampV2(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_ArchiveTimeStampV2_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsTypeV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "CompleteCertificateRefsV2")
    public JAXBElement<CompleteCertificateRefsTypeV2> createCompleteCertificateRefsV2(CompleteCertificateRefsTypeV2 value) {
        return new JAXBElement<CompleteCertificateRefsTypeV2>(_CompleteCertificateRefsV2_QNAME, CompleteCertificateRefsTypeV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteCertificateRefsTypeV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "AttributeCertificateRefsV2")
    public JAXBElement<CompleteCertificateRefsTypeV2> createAttributeCertificateRefsV2(CompleteCertificateRefsTypeV2 value) {
        return new JAXBElement<CompleteCertificateRefsTypeV2>(_AttributeCertificateRefsV2_QNAME, CompleteCertificateRefsTypeV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "SigAndRefsTimeStampV2")
    public JAXBElement<XAdESTimeStampType> createSigAndRefsTimeStampV2(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_SigAndRefsTimeStampV2_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uri.etsi.org/01903/v1.4.1#", name = "RefsOnlyTimeStampV2")
    public JAXBElement<XAdESTimeStampType> createRefsOnlyTimeStampV2(XAdESTimeStampType value) {
        return new JAXBElement<XAdESTimeStampType>(_RefsOnlyTimeStampV2_QNAME, XAdESTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "HMACOutputLength", scope = SignatureMethod2 .class)
    public JAXBElement<BigInteger> createSignatureMethod2HMACOutputLength(BigInteger value) {
        return new JAXBElement<BigInteger>(_SignatureMethod2HMACOutputLength_QNAME, BigInteger.class, SignatureMethod2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "XPath", scope = Transform.class)
    public JAXBElement<String> createTransformXPath(String value) {
        return new JAXBElement<String>(_TransformXPath_QNAME, String.class, Transform.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link X509IssuerSerialType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509IssuerSerial", scope = X509Data.class)
    public JAXBElement<X509IssuerSerialType> createX509DataX509IssuerSerial(X509IssuerSerialType value) {
        return new JAXBElement<X509IssuerSerialType>(_X509DataX509IssuerSerial_QNAME, X509IssuerSerialType.class, X509Data.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SKI", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataX509SKI(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataX509SKI_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509SubjectName", scope = X509Data.class)
    public JAXBElement<String> createX509DataX509SubjectName(String value) {
        return new JAXBElement<String>(_X509DataX509SubjectName_QNAME, String.class, X509Data.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509Certificate", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataX509Certificate(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataX509Certificate_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "X509CRL", scope = X509Data.class)
    public JAXBElement<byte[]> createX509DataX509CRL(byte[] value) {
        return new JAXBElement<byte[]>(_X509DataX509CRL_QNAME, byte[].class, X509Data.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "SPKISexp", scope = SPKIData.class)
    public JAXBElement<byte[]> createSPKIDataSPKISexp(byte[] value) {
        return new JAXBElement<byte[]>(_SPKIDataSPKISexp_QNAME, byte[].class, SPKIData.class, ((byte[]) value));
    }

}
