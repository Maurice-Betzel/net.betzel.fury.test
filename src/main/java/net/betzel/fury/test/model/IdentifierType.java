
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDNDRUDT0000011&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A character string to identify and uniquely distinguish one instance of an object in an identification scheme from all other objects in the same scheme, together with relevant
 *                     supplementary information.
 *                 &lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Identifier&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UsageRule xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Other supplementary components in the CCT are captured as part of the token and name for the schema module containing the identifier list and thus, are not declared as attributes.
 *                 &lt;/ccts:UsageRule&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;IdentifierType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", namespace = "urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1")
@XmlSeeAlso({
    ReferencedSignatureID.class,
    WebsiteURI.class,
    VersionID.class,
    VariantID.class,
    TransportationServiceDetailsURI.class,
    TransactionID.class,
    TrackingID.class,
    TraceID.class,
    TankID.class,
    SupplierAssignedAccountID.class,
    SuccessiveSequenceID.class,
    ShippingOrderID.class,
    SequenceNumberID.class,
    SequenceID.class,
    SellerEventID.class,
    SchemeURI.class,
    SchemaURI.class,
    RequiredCustomsID.class,
    RegistrationNationalityID.class,
    ReferencedConsignmentID.class,
    ProtocolID.class,
    PreviousVersionID.class,
    PrepaidPaymentReferenceID.class,
    PositionInPortID.class,
    PerformingCarrierAssignedID.class,
    PaymentTermsDetailsURI.class,
    PaymentTerminalID.class,
    PaymentMeansID.class,
    ParticipantID.class,
    ParentDocumentVersionID.class,
    ParentDocumentID.class,
    OntologyURI.class,
    NationalityID.class,
    MerchantID.class,
    LogoReferenceID.class,
    LocationID.class,
    LoadingSequenceID.class,
    LanguageID.class,
    JourneyID.class,
    IssuerScopeID.class,
    InformationURI.class,
    IdentificationID.class,
    GoodsItemPassportCounterfoilID.class,
    FreightForwarderAssignedID.class,
    FormatID.class,
    ExtendedID.class,
    ExchangeMarketID.class,
    EndpointURI.class,
    EndpointID.class,
    DocumentID.class,
    CustomerAssignedAccountID.class,
    ContractedCarrierAssignedID.class,
    ContractFolderID.class,
    ConsignorAssignedID.class,
    ConsigneeAssignedID.class,
    CarrierAssignedID.class,
    BuyerEventID.class,
    BusinessIdentityEvidenceID.class,
    BusinessClassificationEvidenceID.class,
    BrokerAssignedID.class,
    BarcodeSymbologyID.class,
    AwardingCriterionID.class,
    AuthorizationID.class,
    AgencyID.class,
    AdditionalAccountID.class,
    WeighingDeviceID.class,
    TransportExecutionPlanReferenceID.class,
    EconomicOperatorRegistryURI.class,
    AccessToolsURI.class,
    OriginalContractingSystemID.class,
    ValidatedCriterionPropertyID.class,
    ExpectedURI.class,
    ExpectedID.class,
    AwardID.class,
    OpenTenderID.class,
    TenderEnvelopeID.class,
    ConsumptionID.class,
    GateID.class,
    LicensePlateID.class,
    ResponseURI.class,
    ResponseID.class,
    RailCarID.class,
    TrainID.class,
    RequestForQuotationLineID.class,
    SpecificationID.class,
    CompanyID.class,
    MMSIRegistrationID.class,
    RadioCallSignID.class,
    VesselID.class,
    LotsGroupID.class,
    LotNumberID.class,
    SerialID.class,
    RegistrationID.class,
    ProductTraceID.class,
    SecurityID.class,
    ImmobilizationCertificateID.class,
    HazardClassID.class,
    MarkingID.class,
    LowerOrangeHazardPlacardID.class,
    UpperOrangeHazardPlacardID.class,
    GoodsItemPassportID.class,
    TypeID.class,
    RevisedForecastLineID.class,
    OID.class,
    URI.class,
    ReleaseID.class,
    BuyerProfileURI.class,
    SubscriberID.class,
    ParentDocumentLineReferenceID.class,
    ConsumptionReportID.class,
    AttributeID.class,
    PreviousJobID.class,
    OriginalJobID.class,
    ReferenceID.class,
    SerialNumberID.class,
    AuctionURI.class,
    AircraftID.class,
    SalesOrderLineID.class,
    LineID.class,
    SignatureID.class,
    AccountID.class,
    ChipApplicationID.class,
    CV2ID.class,
    IssueNumberID.class,
    IssuerID.class,
    NetworkID.class,
    PrimaryAccountNumberID.class,
    PaymentID.class,
    InstructionID.class,
    ValidatorID.class,
    UUID.class,
    SalesOrderID.class,
    ProfileExecutionID.class,
    ProfileID.class,
    CustomizationID.class,
    UBLVersionID.class,
    ExtensionURI.class,
    ExtensionAgencyURI.class,
    ExtensionVersionID.class,
    ExtensionAgencyID.class,
    ID.class
})
public class IdentifierType
    extends IdentifierType2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
