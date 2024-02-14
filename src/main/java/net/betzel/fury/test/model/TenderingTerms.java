
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TenderingTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderingTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardingMethodTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceEvaluationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumVariantQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VariantConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AcceptedVariantsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VariantConstraintCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceRevisionFormulaDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FundingProgramCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FundingProgram" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAdvertisementAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentFrequencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EconomicOperatorRegistryURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredCurriculaIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredCurriculaCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OtherConditionsIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RecurringProcurementIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RecurringProcurementDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedTimingFurtherPublication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestSecurityClearanceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DocumentationFeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MultipleTendersCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyClause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredFinancialGuarantee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementLegislationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FiscalLegislationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalLegislationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EmploymentLegislationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractualDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallForTendersDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WarrantyValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TendererQualificationRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowedSubcontractTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderPreparation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractExecutionRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardingTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalInformationParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderRecipientParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractResponsibleParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderEvaluationParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}QualificationRequestRecipientParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractAcceptancePeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AppealTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Language" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BudgetAccountLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReplacedNoticeDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LotDistribution" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PostAwardProcess" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorShortList" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SecurityClearanceTerm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingTermsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "awardingMethodTypeCode",
    "priceEvaluationCode",
    "maximumVariantQuantity",
    "variantConstraintIndicator",
    "acceptedVariantsDescriptions",
    "variantConstraintCode",
    "priceRevisionFormulaDescriptions",
    "fundingProgramCode",
    "fundingPrograms",
    "maximumAdvertisementAmount",
    "notes",
    "paymentFrequencyCode",
    "economicOperatorRegistryURI",
    "requiredCurriculaIndicator",
    "requiredCurriculaCode",
    "otherConditionsIndicator",
    "recurringProcurementIndicator",
    "recurringProcurementDescriptions",
    "estimatedTimingFurtherPublications",
    "additionalConditions",
    "latestSecurityClearanceDate",
    "documentationFeeAmount",
    "multipleTendersCode",
    "penaltyClauses",
    "requiredFinancialGuarantees",
    "procurementLegislationDocumentReferences",
    "fiscalLegislationDocumentReferences",
    "environmentalLegislationDocumentReferences",
    "employmentLegislationDocumentReferences",
    "contractualDocumentReferences",
    "callForTendersDocumentReferences",
    "warrantyValidityPeriod",
    "paymentTerms",
    "tendererQualificationRequests",
    "allowedSubcontractTerms",
    "tenderPreparations",
    "contractExecutionRequirements",
    "awardingTerms",
    "additionalInformationParty",
    "documentProviderParty",
    "tenderRecipientParty",
    "contractResponsibleParty",
    "tenderEvaluationParties",
    "qualificationRequestRecipientParty",
    "tenderValidityPeriod",
    "contractAcceptancePeriod",
    "appealTerms",
    "languages",
    "budgetAccountLines",
    "replacedNoticeDocumentReference",
    "lotDistribution",
    "postAwardProcess",
    "economicOperatorShortList",
    "securityClearanceTerms"
})
@XmlRootElement(name = "TenderingTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TenderingTerms
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "AwardingMethodTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AwardingMethodTypeCode awardingMethodTypeCode;
    @XmlElement(name = "PriceEvaluationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PriceEvaluationCode priceEvaluationCode;
    @XmlElement(name = "MaximumVariantQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumVariantQuantity maximumVariantQuantity;
    @XmlElement(name = "VariantConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected VariantConstraintIndicator variantConstraintIndicator;
    @XmlElement(name = "AcceptedVariantsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<AcceptedVariantsDescription> acceptedVariantsDescriptions;
    @XmlElement(name = "VariantConstraintCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected VariantConstraintCode variantConstraintCode;
    @XmlElement(name = "PriceRevisionFormulaDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PriceRevisionFormulaDescription> priceRevisionFormulaDescriptions;
    @XmlElement(name = "FundingProgramCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FundingProgramCode fundingProgramCode;
    @XmlElement(name = "FundingProgram", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<FundingProgram> fundingPrograms;
    @XmlElement(name = "MaximumAdvertisementAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumAdvertisementAmount maximumAdvertisementAmount;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "PaymentFrequencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaymentFrequencyCode paymentFrequencyCode;
    @XmlElement(name = "EconomicOperatorRegistryURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EconomicOperatorRegistryURI economicOperatorRegistryURI;
    @XmlElement(name = "RequiredCurriculaIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequiredCurriculaIndicator requiredCurriculaIndicator;
    @XmlElement(name = "RequiredCurriculaCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequiredCurriculaCode requiredCurriculaCode;
    @XmlElement(name = "OtherConditionsIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OtherConditionsIndicator otherConditionsIndicator;
    @XmlElement(name = "RecurringProcurementIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RecurringProcurementIndicator recurringProcurementIndicator;
    @XmlElement(name = "RecurringProcurementDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<RecurringProcurementDescription> recurringProcurementDescriptions;
    @XmlElement(name = "EstimatedTimingFurtherPublication", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<EstimatedTimingFurtherPublication> estimatedTimingFurtherPublications;
    @XmlElement(name = "AdditionalConditions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<AdditionalConditions> additionalConditions;
    @XmlElement(name = "LatestSecurityClearanceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatestSecurityClearanceDate latestSecurityClearanceDate;
    @XmlElement(name = "DocumentationFeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DocumentationFeeAmount documentationFeeAmount;
    @XmlElement(name = "MultipleTendersCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MultipleTendersCode multipleTendersCode;
    @XmlElement(name = "PenaltyClause", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ClauseType> penaltyClauses;
    @XmlElement(name = "RequiredFinancialGuarantee", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<FinancialGuaranteeType> requiredFinancialGuarantees;
    @XmlElement(name = "ProcurementLegislationDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> procurementLegislationDocumentReferences;
    @XmlElement(name = "FiscalLegislationDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> fiscalLegislationDocumentReferences;
    @XmlElement(name = "EnvironmentalLegislationDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> environmentalLegislationDocumentReferences;
    @XmlElement(name = "EmploymentLegislationDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> employmentLegislationDocumentReferences;
    @XmlElement(name = "ContractualDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> contractualDocumentReferences;
    @XmlElement(name = "CallForTendersDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> callForTendersDocumentReferences;
    @XmlElement(name = "WarrantyValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType warrantyValidityPeriod;
    @XmlElement(name = "PaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "TendererQualificationRequest", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TendererQualificationRequest> tendererQualificationRequests;
    @XmlElement(name = "AllowedSubcontractTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<SubcontractTermsType> allowedSubcontractTerms;
    @XmlElement(name = "TenderPreparation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TenderPreparation> tenderPreparations;
    @XmlElement(name = "ContractExecutionRequirement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ContractExecutionRequirement> contractExecutionRequirements;
    @XmlElement(name = "AwardingTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AwardingTerms awardingTerms;
    @XmlElement(name = "AdditionalInformationParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType additionalInformationParty;
    @XmlElement(name = "DocumentProviderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType documentProviderParty;
    @XmlElement(name = "TenderRecipientParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType tenderRecipientParty;
    @XmlElement(name = "ContractResponsibleParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType contractResponsibleParty;
    @XmlElement(name = "TenderEvaluationParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyType> tenderEvaluationParties;
    @XmlElement(name = "QualificationRequestRecipientParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType qualificationRequestRecipientParty;
    @XmlElement(name = "TenderValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType tenderValidityPeriod;
    @XmlElement(name = "ContractAcceptancePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType contractAcceptancePeriod;
    @XmlElement(name = "AppealTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AppealTerms appealTerms;
    @XmlElement(name = "Language", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LanguageType> languages;
    @XmlElement(name = "BudgetAccountLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<BudgetAccountLine> budgetAccountLines;
    @XmlElement(name = "ReplacedNoticeDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType replacedNoticeDocumentReference;
    @XmlElement(name = "LotDistribution", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LotDistribution lotDistribution;
    @XmlElement(name = "PostAwardProcess", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PostAwardProcess postAwardProcess;
    @XmlElement(name = "EconomicOperatorShortList", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected EconomicOperatorShortList economicOperatorShortList;
    @XmlElement(name = "SecurityClearanceTerm", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<SecurityClearanceTerm> securityClearanceTerms;

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
     * Gets the value of the awardingMethodTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AwardingMethodTypeCode }
     *     
     */
    public AwardingMethodTypeCode getAwardingMethodTypeCode() {
        return awardingMethodTypeCode;
    }

    /**
     * Sets the value of the awardingMethodTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingMethodTypeCode }
     *     
     */
    public void setAwardingMethodTypeCode(AwardingMethodTypeCode value) {
        this.awardingMethodTypeCode = value;
    }

    /**
     * Gets the value of the priceEvaluationCode property.
     * 
     * @return
     *     possible object is
     *     {@link PriceEvaluationCode }
     *     
     */
    public PriceEvaluationCode getPriceEvaluationCode() {
        return priceEvaluationCode;
    }

    /**
     * Sets the value of the priceEvaluationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceEvaluationCode }
     *     
     */
    public void setPriceEvaluationCode(PriceEvaluationCode value) {
        this.priceEvaluationCode = value;
    }

    /**
     * Gets the value of the maximumVariantQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumVariantQuantity }
     *     
     */
    public MaximumVariantQuantity getMaximumVariantQuantity() {
        return maximumVariantQuantity;
    }

    /**
     * Sets the value of the maximumVariantQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumVariantQuantity }
     *     
     */
    public void setMaximumVariantQuantity(MaximumVariantQuantity value) {
        this.maximumVariantQuantity = value;
    }

    /**
     * Gets the value of the variantConstraintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link VariantConstraintIndicator }
     *     
     */
    public VariantConstraintIndicator getVariantConstraintIndicator() {
        return variantConstraintIndicator;
    }

    /**
     * Sets the value of the variantConstraintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantConstraintIndicator }
     *     
     */
    public void setVariantConstraintIndicator(VariantConstraintIndicator value) {
        this.variantConstraintIndicator = value;
    }

    /**
     * Gets the value of the acceptedVariantsDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedVariantsDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedVariantsDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptedVariantsDescription }
     * 
     * 
     */
    public List<AcceptedVariantsDescription> getAcceptedVariantsDescriptions() {
        if (acceptedVariantsDescriptions == null) {
            acceptedVariantsDescriptions = new ArrayList<AcceptedVariantsDescription>();
        }
        return this.acceptedVariantsDescriptions;
    }

    /**
     * Gets the value of the variantConstraintCode property.
     * 
     * @return
     *     possible object is
     *     {@link VariantConstraintCode }
     *     
     */
    public VariantConstraintCode getVariantConstraintCode() {
        return variantConstraintCode;
    }

    /**
     * Sets the value of the variantConstraintCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantConstraintCode }
     *     
     */
    public void setVariantConstraintCode(VariantConstraintCode value) {
        this.variantConstraintCode = value;
    }

    /**
     * Gets the value of the priceRevisionFormulaDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRevisionFormulaDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRevisionFormulaDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRevisionFormulaDescription }
     * 
     * 
     */
    public List<PriceRevisionFormulaDescription> getPriceRevisionFormulaDescriptions() {
        if (priceRevisionFormulaDescriptions == null) {
            priceRevisionFormulaDescriptions = new ArrayList<PriceRevisionFormulaDescription>();
        }
        return this.priceRevisionFormulaDescriptions;
    }

    /**
     * Gets the value of the fundingProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link FundingProgramCode }
     *     
     */
    public FundingProgramCode getFundingProgramCode() {
        return fundingProgramCode;
    }

    /**
     * Sets the value of the fundingProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingProgramCode }
     *     
     */
    public void setFundingProgramCode(FundingProgramCode value) {
        this.fundingProgramCode = value;
    }

    /**
     * Gets the value of the fundingPrograms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingPrograms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingPrograms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingProgram }
     * 
     * 
     */
    public List<FundingProgram> getFundingPrograms() {
        if (fundingPrograms == null) {
            fundingPrograms = new ArrayList<FundingProgram>();
        }
        return this.fundingPrograms;
    }

    /**
     * Gets the value of the maximumAdvertisementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAdvertisementAmount }
     *     
     */
    public MaximumAdvertisementAmount getMaximumAdvertisementAmount() {
        return maximumAdvertisementAmount;
    }

    /**
     * Sets the value of the maximumAdvertisementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAdvertisementAmount }
     *     
     */
    public void setMaximumAdvertisementAmount(MaximumAdvertisementAmount value) {
        this.maximumAdvertisementAmount = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the paymentFrequencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFrequencyCode }
     *     
     */
    public PaymentFrequencyCode getPaymentFrequencyCode() {
        return paymentFrequencyCode;
    }

    /**
     * Sets the value of the paymentFrequencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFrequencyCode }
     *     
     */
    public void setPaymentFrequencyCode(PaymentFrequencyCode value) {
        this.paymentFrequencyCode = value;
    }

    /**
     * Gets the value of the economicOperatorRegistryURI property.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorRegistryURI }
     *     
     */
    public EconomicOperatorRegistryURI getEconomicOperatorRegistryURI() {
        return economicOperatorRegistryURI;
    }

    /**
     * Sets the value of the economicOperatorRegistryURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorRegistryURI }
     *     
     */
    public void setEconomicOperatorRegistryURI(EconomicOperatorRegistryURI value) {
        this.economicOperatorRegistryURI = value;
    }

    /**
     * Gets the value of the requiredCurriculaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCurriculaIndicator }
     *     
     */
    public RequiredCurriculaIndicator getRequiredCurriculaIndicator() {
        return requiredCurriculaIndicator;
    }

    /**
     * Sets the value of the requiredCurriculaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCurriculaIndicator }
     *     
     */
    public void setRequiredCurriculaIndicator(RequiredCurriculaIndicator value) {
        this.requiredCurriculaIndicator = value;
    }

    /**
     * Gets the value of the requiredCurriculaCode property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredCurriculaCode }
     *     
     */
    public RequiredCurriculaCode getRequiredCurriculaCode() {
        return requiredCurriculaCode;
    }

    /**
     * Sets the value of the requiredCurriculaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredCurriculaCode }
     *     
     */
    public void setRequiredCurriculaCode(RequiredCurriculaCode value) {
        this.requiredCurriculaCode = value;
    }

    /**
     * Gets the value of the otherConditionsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link OtherConditionsIndicator }
     *     
     */
    public OtherConditionsIndicator getOtherConditionsIndicator() {
        return otherConditionsIndicator;
    }

    /**
     * Sets the value of the otherConditionsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherConditionsIndicator }
     *     
     */
    public void setOtherConditionsIndicator(OtherConditionsIndicator value) {
        this.otherConditionsIndicator = value;
    }

    /**
     * Gets the value of the recurringProcurementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringProcurementIndicator }
     *     
     */
    public RecurringProcurementIndicator getRecurringProcurementIndicator() {
        return recurringProcurementIndicator;
    }

    /**
     * Sets the value of the recurringProcurementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringProcurementIndicator }
     *     
     */
    public void setRecurringProcurementIndicator(RecurringProcurementIndicator value) {
        this.recurringProcurementIndicator = value;
    }

    /**
     * Gets the value of the recurringProcurementDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringProcurementDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringProcurementDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurringProcurementDescription }
     * 
     * 
     */
    public List<RecurringProcurementDescription> getRecurringProcurementDescriptions() {
        if (recurringProcurementDescriptions == null) {
            recurringProcurementDescriptions = new ArrayList<RecurringProcurementDescription>();
        }
        return this.recurringProcurementDescriptions;
    }

    /**
     * Gets the value of the estimatedTimingFurtherPublications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedTimingFurtherPublications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedTimingFurtherPublications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedTimingFurtherPublication }
     * 
     * 
     */
    public List<EstimatedTimingFurtherPublication> getEstimatedTimingFurtherPublications() {
        if (estimatedTimingFurtherPublications == null) {
            estimatedTimingFurtherPublications = new ArrayList<EstimatedTimingFurtherPublication>();
        }
        return this.estimatedTimingFurtherPublications;
    }

    /**
     * Gets the value of the additionalConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalConditions }
     * 
     * 
     */
    public List<AdditionalConditions> getAdditionalConditions() {
        if (additionalConditions == null) {
            additionalConditions = new ArrayList<AdditionalConditions>();
        }
        return this.additionalConditions;
    }

    /**
     * Gets the value of the latestSecurityClearanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link LatestSecurityClearanceDate }
     *     
     */
    public LatestSecurityClearanceDate getLatestSecurityClearanceDate() {
        return latestSecurityClearanceDate;
    }

    /**
     * Sets the value of the latestSecurityClearanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestSecurityClearanceDate }
     *     
     */
    public void setLatestSecurityClearanceDate(LatestSecurityClearanceDate value) {
        this.latestSecurityClearanceDate = value;
    }

    /**
     * Gets the value of the documentationFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentationFeeAmount }
     *     
     */
    public DocumentationFeeAmount getDocumentationFeeAmount() {
        return documentationFeeAmount;
    }

    /**
     * Sets the value of the documentationFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentationFeeAmount }
     *     
     */
    public void setDocumentationFeeAmount(DocumentationFeeAmount value) {
        this.documentationFeeAmount = value;
    }

    /**
     * Gets the value of the multipleTendersCode property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleTendersCode }
     *     
     */
    public MultipleTendersCode getMultipleTendersCode() {
        return multipleTendersCode;
    }

    /**
     * Sets the value of the multipleTendersCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleTendersCode }
     *     
     */
    public void setMultipleTendersCode(MultipleTendersCode value) {
        this.multipleTendersCode = value;
    }

    /**
     * Gets the value of the penaltyClauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyClauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClauseType }
     * 
     * 
     */
    public List<ClauseType> getPenaltyClauses() {
        if (penaltyClauses == null) {
            penaltyClauses = new ArrayList<ClauseType>();
        }
        return this.penaltyClauses;
    }

    /**
     * Gets the value of the requiredFinancialGuarantees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredFinancialGuarantees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredFinancialGuarantees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialGuaranteeType }
     * 
     * 
     */
    public List<FinancialGuaranteeType> getRequiredFinancialGuarantees() {
        if (requiredFinancialGuarantees == null) {
            requiredFinancialGuarantees = new ArrayList<FinancialGuaranteeType>();
        }
        return this.requiredFinancialGuarantees;
    }

    /**
     * Gets the value of the procurementLegislationDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementLegislationDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementLegislationDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getProcurementLegislationDocumentReferences() {
        if (procurementLegislationDocumentReferences == null) {
            procurementLegislationDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.procurementLegislationDocumentReferences;
    }

    /**
     * Gets the value of the fiscalLegislationDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiscalLegislationDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiscalLegislationDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getFiscalLegislationDocumentReferences() {
        if (fiscalLegislationDocumentReferences == null) {
            fiscalLegislationDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.fiscalLegislationDocumentReferences;
    }

    /**
     * Gets the value of the environmentalLegislationDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalLegislationDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalLegislationDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getEnvironmentalLegislationDocumentReferences() {
        if (environmentalLegislationDocumentReferences == null) {
            environmentalLegislationDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.environmentalLegislationDocumentReferences;
    }

    /**
     * Gets the value of the employmentLegislationDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentLegislationDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentLegislationDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getEmploymentLegislationDocumentReferences() {
        if (employmentLegislationDocumentReferences == null) {
            employmentLegislationDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.employmentLegislationDocumentReferences;
    }

    /**
     * Gets the value of the contractualDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getContractualDocumentReferences() {
        if (contractualDocumentReferences == null) {
            contractualDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.contractualDocumentReferences;
    }

    /**
     * Gets the value of the callForTendersDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callForTendersDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallForTendersDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getCallForTendersDocumentReferences() {
        if (callForTendersDocumentReferences == null) {
            callForTendersDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.callForTendersDocumentReferences;
    }

    /**
     * Gets the value of the warrantyValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getWarrantyValidityPeriod() {
        return warrantyValidityPeriod;
    }

    /**
     * Sets the value of the warrantyValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setWarrantyValidityPeriod(PeriodType value) {
        this.warrantyValidityPeriod = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the tendererQualificationRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tendererQualificationRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTendererQualificationRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TendererQualificationRequest }
     * 
     * 
     */
    public List<TendererQualificationRequest> getTendererQualificationRequests() {
        if (tendererQualificationRequests == null) {
            tendererQualificationRequests = new ArrayList<TendererQualificationRequest>();
        }
        return this.tendererQualificationRequests;
    }

    /**
     * Gets the value of the allowedSubcontractTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedSubcontractTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedSubcontractTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubcontractTermsType }
     * 
     * 
     */
    public List<SubcontractTermsType> getAllowedSubcontractTerms() {
        if (allowedSubcontractTerms == null) {
            allowedSubcontractTerms = new ArrayList<SubcontractTermsType>();
        }
        return this.allowedSubcontractTerms;
    }

    /**
     * Gets the value of the tenderPreparations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderPreparations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderPreparations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderPreparation }
     * 
     * 
     */
    public List<TenderPreparation> getTenderPreparations() {
        if (tenderPreparations == null) {
            tenderPreparations = new ArrayList<TenderPreparation>();
        }
        return this.tenderPreparations;
    }

    /**
     * Gets the value of the contractExecutionRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractExecutionRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractExecutionRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractExecutionRequirement }
     * 
     * 
     */
    public List<ContractExecutionRequirement> getContractExecutionRequirements() {
        if (contractExecutionRequirements == null) {
            contractExecutionRequirements = new ArrayList<ContractExecutionRequirement>();
        }
        return this.contractExecutionRequirements;
    }

    /**
     * Gets the value of the awardingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link AwardingTerms }
     *     
     */
    public AwardingTerms getAwardingTerms() {
        return awardingTerms;
    }

    /**
     * Sets the value of the awardingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardingTerms }
     *     
     */
    public void setAwardingTerms(AwardingTerms value) {
        this.awardingTerms = value;
    }

    /**
     * Gets the value of the additionalInformationParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAdditionalInformationParty() {
        return additionalInformationParty;
    }

    /**
     * Sets the value of the additionalInformationParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAdditionalInformationParty(PartyType value) {
        this.additionalInformationParty = value;
    }

    /**
     * Gets the value of the documentProviderParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDocumentProviderParty() {
        return documentProviderParty;
    }

    /**
     * Sets the value of the documentProviderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDocumentProviderParty(PartyType value) {
        this.documentProviderParty = value;
    }

    /**
     * Gets the value of the tenderRecipientParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getTenderRecipientParty() {
        return tenderRecipientParty;
    }

    /**
     * Sets the value of the tenderRecipientParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setTenderRecipientParty(PartyType value) {
        this.tenderRecipientParty = value;
    }

    /**
     * Gets the value of the contractResponsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getContractResponsibleParty() {
        return contractResponsibleParty;
    }

    /**
     * Sets the value of the contractResponsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setContractResponsibleParty(PartyType value) {
        this.contractResponsibleParty = value;
    }

    /**
     * Gets the value of the tenderEvaluationParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderEvaluationParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderEvaluationParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getTenderEvaluationParties() {
        if (tenderEvaluationParties == null) {
            tenderEvaluationParties = new ArrayList<PartyType>();
        }
        return this.tenderEvaluationParties;
    }

    /**
     * Gets the value of the qualificationRequestRecipientParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getQualificationRequestRecipientParty() {
        return qualificationRequestRecipientParty;
    }

    /**
     * Sets the value of the qualificationRequestRecipientParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setQualificationRequestRecipientParty(PartyType value) {
        this.qualificationRequestRecipientParty = value;
    }

    /**
     * Gets the value of the tenderValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTenderValidityPeriod() {
        return tenderValidityPeriod;
    }

    /**
     * Sets the value of the tenderValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTenderValidityPeriod(PeriodType value) {
        this.tenderValidityPeriod = value;
    }

    /**
     * Gets the value of the contractAcceptancePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getContractAcceptancePeriod() {
        return contractAcceptancePeriod;
    }

    /**
     * Sets the value of the contractAcceptancePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setContractAcceptancePeriod(PeriodType value) {
        this.contractAcceptancePeriod = value;
    }

    /**
     * Gets the value of the appealTerms property.
     * 
     * @return
     *     possible object is
     *     {@link AppealTerms }
     *     
     */
    public AppealTerms getAppealTerms() {
        return appealTerms;
    }

    /**
     * Sets the value of the appealTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealTerms }
     *     
     */
    public void setAppealTerms(AppealTerms value) {
        this.appealTerms = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<LanguageType>();
        }
        return this.languages;
    }

    /**
     * Gets the value of the budgetAccountLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetAccountLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetAccountLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetAccountLine }
     * 
     * 
     */
    public List<BudgetAccountLine> getBudgetAccountLines() {
        if (budgetAccountLines == null) {
            budgetAccountLines = new ArrayList<BudgetAccountLine>();
        }
        return this.budgetAccountLines;
    }

    /**
     * Gets the value of the replacedNoticeDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getReplacedNoticeDocumentReference() {
        return replacedNoticeDocumentReference;
    }

    /**
     * Sets the value of the replacedNoticeDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setReplacedNoticeDocumentReference(DocumentReferenceType value) {
        this.replacedNoticeDocumentReference = value;
    }

    /**
     * Gets the value of the lotDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link LotDistribution }
     *     
     */
    public LotDistribution getLotDistribution() {
        return lotDistribution;
    }

    /**
     * Sets the value of the lotDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotDistribution }
     *     
     */
    public void setLotDistribution(LotDistribution value) {
        this.lotDistribution = value;
    }

    /**
     * Gets the value of the postAwardProcess property.
     * 
     * @return
     *     possible object is
     *     {@link PostAwardProcess }
     *     
     */
    public PostAwardProcess getPostAwardProcess() {
        return postAwardProcess;
    }

    /**
     * Sets the value of the postAwardProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAwardProcess }
     *     
     */
    public void setPostAwardProcess(PostAwardProcess value) {
        this.postAwardProcess = value;
    }

    /**
     * Gets the value of the economicOperatorShortList property.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorShortList }
     *     
     */
    public EconomicOperatorShortList getEconomicOperatorShortList() {
        return economicOperatorShortList;
    }

    /**
     * Sets the value of the economicOperatorShortList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorShortList }
     *     
     */
    public void setEconomicOperatorShortList(EconomicOperatorShortList value) {
        this.economicOperatorShortList = value;
    }

    /**
     * Gets the value of the securityClearanceTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityClearanceTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityClearanceTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityClearanceTerm }
     * 
     * 
     */
    public List<SecurityClearanceTerm> getSecurityClearanceTerms() {
        if (securityClearanceTerms == null) {
            securityClearanceTerms = new ArrayList<SecurityClearanceTerm>();
        }
        return this.securityClearanceTerms;
    }

}
