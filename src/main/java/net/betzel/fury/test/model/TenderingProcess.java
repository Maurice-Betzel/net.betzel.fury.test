
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
 * <p>Java class for TenderingProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderingProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OriginalContractingSystemID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NegotiationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcedureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UrgencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpenseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartPresentationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ContractingSystemCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubmissionMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CandidateReductionConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GovernmentAgreementConstraintIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccessToolsURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TerminatedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentAvailabilityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderSubmissionDeadlinePeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvitationSubmissionPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipationInvitationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipationRequestReceptionPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalInformationRequestPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NoticeDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcessJustification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorShortList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OpenTenderEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AuctionTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FrameworkAgreement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingSystem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingProcessType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "originalContractingSystemID",
    "descriptions",
    "negotiationDescriptions",
    "procedureCode",
    "urgencyCode",
    "expenseCode",
    "partPresentationCode",
    "contractingSystemCode",
    "submissionMethodCode",
    "candidateReductionConstraintIndicator",
    "governmentAgreementConstraintIndicator",
    "accessToolsURI",
    "terminatedIndicator",
    "documentAvailabilityPeriod",
    "tenderSubmissionDeadlinePeriod",
    "invitationSubmissionPeriod",
    "participationInvitationPeriod",
    "participationRequestReceptionPeriod",
    "additionalInformationRequestPeriod",
    "noticeDocumentReferences",
    "additionalDocumentReferences",
    "processJustifications",
    "economicOperatorShortLists",
    "openTenderEvents",
    "auctionTerms",
    "frameworkAgreement",
    "contractingSystems"
})
@XmlRootElement(name = "TenderingProcess", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TenderingProcess
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "OriginalContractingSystemID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OriginalContractingSystemID originalContractingSystemID;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "NegotiationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<NegotiationDescription> negotiationDescriptions;
    @XmlElement(name = "ProcedureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ProcedureCode procedureCode;
    @XmlElement(name = "UrgencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UrgencyCode urgencyCode;
    @XmlElement(name = "ExpenseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpenseCode expenseCode;
    @XmlElement(name = "PartPresentationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PartPresentationCode partPresentationCode;
    @XmlElement(name = "ContractingSystemCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ContractingSystemCode contractingSystemCode;
    @XmlElement(name = "SubmissionMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SubmissionMethodCode submissionMethodCode;
    @XmlElement(name = "CandidateReductionConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CandidateReductionConstraintIndicator candidateReductionConstraintIndicator;
    @XmlElement(name = "GovernmentAgreementConstraintIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GovernmentAgreementConstraintIndicator governmentAgreementConstraintIndicator;
    @XmlElement(name = "AccessToolsURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccessToolsURI accessToolsURI;
    @XmlElement(name = "TerminatedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TerminatedIndicator terminatedIndicator;
    @XmlElement(name = "DocumentAvailabilityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType documentAvailabilityPeriod;
    @XmlElement(name = "TenderSubmissionDeadlinePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType tenderSubmissionDeadlinePeriod;
    @XmlElement(name = "InvitationSubmissionPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType invitationSubmissionPeriod;
    @XmlElement(name = "ParticipationInvitationPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType participationInvitationPeriod;
    @XmlElement(name = "ParticipationRequestReceptionPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType participationRequestReceptionPeriod;
    @XmlElement(name = "AdditionalInformationRequestPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType additionalInformationRequestPeriod;
    @XmlElement(name = "NoticeDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> noticeDocumentReferences;
    @XmlElement(name = "AdditionalDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> additionalDocumentReferences;
    @XmlElement(name = "ProcessJustification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ProcessJustification> processJustifications;
    @XmlElement(name = "EconomicOperatorShortList", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EconomicOperatorShortList> economicOperatorShortLists;
    @XmlElement(name = "OpenTenderEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EventType> openTenderEvents;
    @XmlElement(name = "AuctionTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AuctionTerms auctionTerms;
    @XmlElement(name = "FrameworkAgreement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected FrameworkAgreement frameworkAgreement;
    @XmlElement(name = "ContractingSystem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ContractingSystem> contractingSystems;

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
     * Gets the value of the originalContractingSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalContractingSystemID }
     *     
     */
    public OriginalContractingSystemID getOriginalContractingSystemID() {
        return originalContractingSystemID;
    }

    /**
     * Sets the value of the originalContractingSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalContractingSystemID }
     *     
     */
    public void setOriginalContractingSystemID(OriginalContractingSystemID value) {
        this.originalContractingSystemID = value;
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
     * Gets the value of the negotiationDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotiationDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiationDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegotiationDescription }
     * 
     * 
     */
    public List<NegotiationDescription> getNegotiationDescriptions() {
        if (negotiationDescriptions == null) {
            negotiationDescriptions = new ArrayList<NegotiationDescription>();
        }
        return this.negotiationDescriptions;
    }

    /**
     * Gets the value of the procedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCode }
     *     
     */
    public ProcedureCode getProcedureCode() {
        return procedureCode;
    }

    /**
     * Sets the value of the procedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCode }
     *     
     */
    public void setProcedureCode(ProcedureCode value) {
        this.procedureCode = value;
    }

    /**
     * Gets the value of the urgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link UrgencyCode }
     *     
     */
    public UrgencyCode getUrgencyCode() {
        return urgencyCode;
    }

    /**
     * Sets the value of the urgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrgencyCode }
     *     
     */
    public void setUrgencyCode(UrgencyCode value) {
        this.urgencyCode = value;
    }

    /**
     * Gets the value of the expenseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCode }
     *     
     */
    public ExpenseCode getExpenseCode() {
        return expenseCode;
    }

    /**
     * Sets the value of the expenseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCode }
     *     
     */
    public void setExpenseCode(ExpenseCode value) {
        this.expenseCode = value;
    }

    /**
     * Gets the value of the partPresentationCode property.
     * 
     * @return
     *     possible object is
     *     {@link PartPresentationCode }
     *     
     */
    public PartPresentationCode getPartPresentationCode() {
        return partPresentationCode;
    }

    /**
     * Sets the value of the partPresentationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPresentationCode }
     *     
     */
    public void setPartPresentationCode(PartPresentationCode value) {
        this.partPresentationCode = value;
    }

    /**
     * Gets the value of the contractingSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ContractingSystemCode }
     *     
     */
    public ContractingSystemCode getContractingSystemCode() {
        return contractingSystemCode;
    }

    /**
     * Sets the value of the contractingSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractingSystemCode }
     *     
     */
    public void setContractingSystemCode(ContractingSystemCode value) {
        this.contractingSystemCode = value;
    }

    /**
     * Gets the value of the submissionMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionMethodCode }
     *     
     */
    public SubmissionMethodCode getSubmissionMethodCode() {
        return submissionMethodCode;
    }

    /**
     * Sets the value of the submissionMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionMethodCode }
     *     
     */
    public void setSubmissionMethodCode(SubmissionMethodCode value) {
        this.submissionMethodCode = value;
    }

    /**
     * Gets the value of the candidateReductionConstraintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateReductionConstraintIndicator }
     *     
     */
    public CandidateReductionConstraintIndicator getCandidateReductionConstraintIndicator() {
        return candidateReductionConstraintIndicator;
    }

    /**
     * Sets the value of the candidateReductionConstraintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateReductionConstraintIndicator }
     *     
     */
    public void setCandidateReductionConstraintIndicator(CandidateReductionConstraintIndicator value) {
        this.candidateReductionConstraintIndicator = value;
    }

    /**
     * Gets the value of the governmentAgreementConstraintIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentAgreementConstraintIndicator }
     *     
     */
    public GovernmentAgreementConstraintIndicator getGovernmentAgreementConstraintIndicator() {
        return governmentAgreementConstraintIndicator;
    }

    /**
     * Sets the value of the governmentAgreementConstraintIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentAgreementConstraintIndicator }
     *     
     */
    public void setGovernmentAgreementConstraintIndicator(GovernmentAgreementConstraintIndicator value) {
        this.governmentAgreementConstraintIndicator = value;
    }

    /**
     * Gets the value of the accessToolsURI property.
     * 
     * @return
     *     possible object is
     *     {@link AccessToolsURI }
     *     
     */
    public AccessToolsURI getAccessToolsURI() {
        return accessToolsURI;
    }

    /**
     * Sets the value of the accessToolsURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessToolsURI }
     *     
     */
    public void setAccessToolsURI(AccessToolsURI value) {
        this.accessToolsURI = value;
    }

    /**
     * Gets the value of the terminatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TerminatedIndicator }
     *     
     */
    public TerminatedIndicator getTerminatedIndicator() {
        return terminatedIndicator;
    }

    /**
     * Sets the value of the terminatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminatedIndicator }
     *     
     */
    public void setTerminatedIndicator(TerminatedIndicator value) {
        this.terminatedIndicator = value;
    }

    /**
     * Gets the value of the documentAvailabilityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getDocumentAvailabilityPeriod() {
        return documentAvailabilityPeriod;
    }

    /**
     * Sets the value of the documentAvailabilityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setDocumentAvailabilityPeriod(PeriodType value) {
        this.documentAvailabilityPeriod = value;
    }

    /**
     * Gets the value of the tenderSubmissionDeadlinePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getTenderSubmissionDeadlinePeriod() {
        return tenderSubmissionDeadlinePeriod;
    }

    /**
     * Sets the value of the tenderSubmissionDeadlinePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setTenderSubmissionDeadlinePeriod(PeriodType value) {
        this.tenderSubmissionDeadlinePeriod = value;
    }

    /**
     * Gets the value of the invitationSubmissionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getInvitationSubmissionPeriod() {
        return invitationSubmissionPeriod;
    }

    /**
     * Sets the value of the invitationSubmissionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setInvitationSubmissionPeriod(PeriodType value) {
        this.invitationSubmissionPeriod = value;
    }

    /**
     * Gets the value of the participationInvitationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getParticipationInvitationPeriod() {
        return participationInvitationPeriod;
    }

    /**
     * Sets the value of the participationInvitationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setParticipationInvitationPeriod(PeriodType value) {
        this.participationInvitationPeriod = value;
    }

    /**
     * Gets the value of the participationRequestReceptionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getParticipationRequestReceptionPeriod() {
        return participationRequestReceptionPeriod;
    }

    /**
     * Sets the value of the participationRequestReceptionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setParticipationRequestReceptionPeriod(PeriodType value) {
        this.participationRequestReceptionPeriod = value;
    }

    /**
     * Gets the value of the additionalInformationRequestPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getAdditionalInformationRequestPeriod() {
        return additionalInformationRequestPeriod;
    }

    /**
     * Sets the value of the additionalInformationRequestPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setAdditionalInformationRequestPeriod(PeriodType value) {
        this.additionalInformationRequestPeriod = value;
    }

    /**
     * Gets the value of the noticeDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noticeDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoticeDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getNoticeDocumentReferences() {
        if (noticeDocumentReferences == null) {
            noticeDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.noticeDocumentReferences;
    }

    /**
     * Gets the value of the additionalDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getAdditionalDocumentReferences() {
        if (additionalDocumentReferences == null) {
            additionalDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.additionalDocumentReferences;
    }

    /**
     * Gets the value of the processJustifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processJustifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessJustifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessJustification }
     * 
     * 
     */
    public List<ProcessJustification> getProcessJustifications() {
        if (processJustifications == null) {
            processJustifications = new ArrayList<ProcessJustification>();
        }
        return this.processJustifications;
    }

    /**
     * Gets the value of the economicOperatorShortLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the economicOperatorShortLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEconomicOperatorShortLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicOperatorShortList }
     * 
     * 
     */
    public List<EconomicOperatorShortList> getEconomicOperatorShortLists() {
        if (economicOperatorShortLists == null) {
            economicOperatorShortLists = new ArrayList<EconomicOperatorShortList>();
        }
        return this.economicOperatorShortLists;
    }

    /**
     * Gets the value of the openTenderEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openTenderEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenTenderEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     * 
     * 
     */
    public List<EventType> getOpenTenderEvents() {
        if (openTenderEvents == null) {
            openTenderEvents = new ArrayList<EventType>();
        }
        return this.openTenderEvents;
    }

    /**
     * Gets the value of the auctionTerms property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionTerms }
     *     
     */
    public AuctionTerms getAuctionTerms() {
        return auctionTerms;
    }

    /**
     * Sets the value of the auctionTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionTerms }
     *     
     */
    public void setAuctionTerms(AuctionTerms value) {
        this.auctionTerms = value;
    }

    /**
     * Gets the value of the frameworkAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link FrameworkAgreement }
     *     
     */
    public FrameworkAgreement getFrameworkAgreement() {
        return frameworkAgreement;
    }

    /**
     * Sets the value of the frameworkAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameworkAgreement }
     *     
     */
    public void setFrameworkAgreement(FrameworkAgreement value) {
        this.frameworkAgreement = value;
    }

    /**
     * Gets the value of the contractingSystems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingSystems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingSystems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingSystem }
     * 
     * 
     */
    public List<ContractingSystem> getContractingSystems() {
        if (contractingSystems == null) {
            contractingSystems = new ArrayList<ContractingSystem>();
        }
        return this.contractingSystems;
    }

}
