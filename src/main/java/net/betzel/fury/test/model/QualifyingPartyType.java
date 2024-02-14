
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
 * <p>Java class for QualifyingPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifyingPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ParticipationPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PersonalSituation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OperatingYearsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmployeeQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BusinessClassificationEvidenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BusinessIdentityEvidenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TendererRoleCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BusinessClassificationScheme" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CompletedTask" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Declaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorRole" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingPartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "participationPercent",
    "personalSituations",
    "operatingYearsQuantity",
    "employeeQuantity",
    "businessClassificationEvidenceID",
    "businessIdentityEvidenceID",
    "tendererRoleCode",
    "businessClassificationScheme",
    "technicalCapabilities",
    "financialCapabilities",
    "completedTasks",
    "declarations",
    "party",
    "economicOperatorRole"
})
public class QualifyingPartyType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ParticipationPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ParticipationPercent participationPercent;
    @XmlElement(name = "PersonalSituation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PersonalSituation> personalSituations;
    @XmlElement(name = "OperatingYearsQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OperatingYearsQuantity operatingYearsQuantity;
    @XmlElement(name = "EmployeeQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EmployeeQuantity employeeQuantity;
    @XmlElement(name = "BusinessClassificationEvidenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BusinessClassificationEvidenceID businessClassificationEvidenceID;
    @XmlElement(name = "BusinessIdentityEvidenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BusinessIdentityEvidenceID businessIdentityEvidenceID;
    @XmlElement(name = "TendererRoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TendererRoleCode tendererRoleCode;
    @XmlElement(name = "BusinessClassificationScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ClassificationSchemeType businessClassificationScheme;
    @XmlElement(name = "TechnicalCapability", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CapabilityType> technicalCapabilities;
    @XmlElement(name = "FinancialCapability", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CapabilityType> financialCapabilities;
    @XmlElement(name = "CompletedTask", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CompletedTask> completedTasks;
    @XmlElement(name = "Declaration", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<Declaration> declarations;
    @XmlElement(name = "Party", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType party;
    @XmlElement(name = "EconomicOperatorRole", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected EconomicOperatorRole economicOperatorRole;

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
     * Gets the value of the participationPercent property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationPercent }
     *     
     */
    public ParticipationPercent getParticipationPercent() {
        return participationPercent;
    }

    /**
     * Sets the value of the participationPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationPercent }
     *     
     */
    public void setParticipationPercent(ParticipationPercent value) {
        this.participationPercent = value;
    }

    /**
     * Gets the value of the personalSituations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalSituations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalSituations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalSituation }
     * 
     * 
     */
    public List<PersonalSituation> getPersonalSituations() {
        if (personalSituations == null) {
            personalSituations = new ArrayList<PersonalSituation>();
        }
        return this.personalSituations;
    }

    /**
     * Gets the value of the operatingYearsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingYearsQuantity }
     *     
     */
    public OperatingYearsQuantity getOperatingYearsQuantity() {
        return operatingYearsQuantity;
    }

    /**
     * Sets the value of the operatingYearsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingYearsQuantity }
     *     
     */
    public void setOperatingYearsQuantity(OperatingYearsQuantity value) {
        this.operatingYearsQuantity = value;
    }

    /**
     * Gets the value of the employeeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeQuantity }
     *     
     */
    public EmployeeQuantity getEmployeeQuantity() {
        return employeeQuantity;
    }

    /**
     * Sets the value of the employeeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeQuantity }
     *     
     */
    public void setEmployeeQuantity(EmployeeQuantity value) {
        this.employeeQuantity = value;
    }

    /**
     * Gets the value of the businessClassificationEvidenceID property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessClassificationEvidenceID }
     *     
     */
    public BusinessClassificationEvidenceID getBusinessClassificationEvidenceID() {
        return businessClassificationEvidenceID;
    }

    /**
     * Sets the value of the businessClassificationEvidenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessClassificationEvidenceID }
     *     
     */
    public void setBusinessClassificationEvidenceID(BusinessClassificationEvidenceID value) {
        this.businessClassificationEvidenceID = value;
    }

    /**
     * Gets the value of the businessIdentityEvidenceID property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessIdentityEvidenceID }
     *     
     */
    public BusinessIdentityEvidenceID getBusinessIdentityEvidenceID() {
        return businessIdentityEvidenceID;
    }

    /**
     * Sets the value of the businessIdentityEvidenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessIdentityEvidenceID }
     *     
     */
    public void setBusinessIdentityEvidenceID(BusinessIdentityEvidenceID value) {
        this.businessIdentityEvidenceID = value;
    }

    /**
     * Gets the value of the tendererRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link TendererRoleCode }
     *     
     */
    public TendererRoleCode getTendererRoleCode() {
        return tendererRoleCode;
    }

    /**
     * Sets the value of the tendererRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TendererRoleCode }
     *     
     */
    public void setTendererRoleCode(TendererRoleCode value) {
        this.tendererRoleCode = value;
    }

    /**
     * Gets the value of the businessClassificationScheme property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public ClassificationSchemeType getBusinessClassificationScheme() {
        return businessClassificationScheme;
    }

    /**
     * Sets the value of the businessClassificationScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSchemeType }
     *     
     */
    public void setBusinessClassificationScheme(ClassificationSchemeType value) {
        this.businessClassificationScheme = value;
    }

    /**
     * Gets the value of the technicalCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityType }
     * 
     * 
     */
    public List<CapabilityType> getTechnicalCapabilities() {
        if (technicalCapabilities == null) {
            technicalCapabilities = new ArrayList<CapabilityType>();
        }
        return this.technicalCapabilities;
    }

    /**
     * Gets the value of the financialCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapabilityType }
     * 
     * 
     */
    public List<CapabilityType> getFinancialCapabilities() {
        if (financialCapabilities == null) {
            financialCapabilities = new ArrayList<CapabilityType>();
        }
        return this.financialCapabilities;
    }

    /**
     * Gets the value of the completedTasks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completedTasks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompletedTasks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompletedTask }
     * 
     * 
     */
    public List<CompletedTask> getCompletedTasks() {
        if (completedTasks == null) {
            completedTasks = new ArrayList<CompletedTask>();
        }
        return this.completedTasks;
    }

    /**
     * Gets the value of the declarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Declaration }
     * 
     * 
     */
    public List<Declaration> getDeclarations() {
        if (declarations == null) {
            declarations = new ArrayList<Declaration>();
        }
        return this.declarations;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

    /**
     * Gets the value of the economicOperatorRole property.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorRole }
     *     
     */
    public EconomicOperatorRole getEconomicOperatorRole() {
        return economicOperatorRole;
    }

    /**
     * Sets the value of the economicOperatorRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorRole }
     *     
     */
    public void setEconomicOperatorRole(EconomicOperatorRole value) {
        this.economicOperatorRole = value;
    }

}
