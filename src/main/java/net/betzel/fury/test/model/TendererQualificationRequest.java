
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
 * <p>Java class for TendererQualificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TendererQualificationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyLegalForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PersonalSituation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OperatingYearsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmployeeQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequiredBusinessClassificationScheme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalEvaluationCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialEvaluationCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SpecificTendererRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorRole" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TendererQualificationRequestType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "companyLegalFormCode",
    "companyLegalForms",
    "personalSituations",
    "operatingYearsQuantity",
    "employeeQuantity",
    "descriptions",
    "requiredBusinessClassificationSchemes",
    "technicalEvaluationCriterions",
    "financialEvaluationCriterions",
    "specificTendererRequirements",
    "economicOperatorRoles"
})
@XmlRootElement(name = "TendererQualificationRequest", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TendererQualificationRequest
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "CompanyLegalFormCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CompanyLegalFormCode companyLegalFormCode;
    @XmlElement(name = "CompanyLegalForm", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<CompanyLegalForm> companyLegalForms;
    @XmlElement(name = "PersonalSituation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PersonalSituation> personalSituations;
    @XmlElement(name = "OperatingYearsQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OperatingYearsQuantity operatingYearsQuantity;
    @XmlElement(name = "EmployeeQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EmployeeQuantity employeeQuantity;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "RequiredBusinessClassificationScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ClassificationSchemeType> requiredBusinessClassificationSchemes;
    @XmlElement(name = "TechnicalEvaluationCriterion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EvaluationCriterionType> technicalEvaluationCriterions;
    @XmlElement(name = "FinancialEvaluationCriterion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EvaluationCriterionType> financialEvaluationCriterions;
    @XmlElement(name = "SpecificTendererRequirement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TendererRequirementType> specificTendererRequirements;
    @XmlElement(name = "EconomicOperatorRole", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EconomicOperatorRole> economicOperatorRoles;

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
     * Gets the value of the companyLegalFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public CompanyLegalFormCode getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * Sets the value of the companyLegalFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public void setCompanyLegalFormCode(CompanyLegalFormCode value) {
        this.companyLegalFormCode = value;
    }

    /**
     * Gets the value of the companyLegalForms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyLegalForms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyLegalForms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyLegalForm }
     * 
     * 
     */
    public List<CompanyLegalForm> getCompanyLegalForms() {
        if (companyLegalForms == null) {
            companyLegalForms = new ArrayList<CompanyLegalForm>();
        }
        return this.companyLegalForms;
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
     * Gets the value of the requiredBusinessClassificationSchemes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredBusinessClassificationSchemes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredBusinessClassificationSchemes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationSchemeType }
     * 
     * 
     */
    public List<ClassificationSchemeType> getRequiredBusinessClassificationSchemes() {
        if (requiredBusinessClassificationSchemes == null) {
            requiredBusinessClassificationSchemes = new ArrayList<ClassificationSchemeType>();
        }
        return this.requiredBusinessClassificationSchemes;
    }

    /**
     * Gets the value of the technicalEvaluationCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalEvaluationCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalEvaluationCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvaluationCriterionType }
     * 
     * 
     */
    public List<EvaluationCriterionType> getTechnicalEvaluationCriterions() {
        if (technicalEvaluationCriterions == null) {
            technicalEvaluationCriterions = new ArrayList<EvaluationCriterionType>();
        }
        return this.technicalEvaluationCriterions;
    }

    /**
     * Gets the value of the financialEvaluationCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialEvaluationCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialEvaluationCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvaluationCriterionType }
     * 
     * 
     */
    public List<EvaluationCriterionType> getFinancialEvaluationCriterions() {
        if (financialEvaluationCriterions == null) {
            financialEvaluationCriterions = new ArrayList<EvaluationCriterionType>();
        }
        return this.financialEvaluationCriterions;
    }

    /**
     * Gets the value of the specificTendererRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificTendererRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificTendererRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TendererRequirementType }
     * 
     * 
     */
    public List<TendererRequirementType> getSpecificTendererRequirements() {
        if (specificTendererRequirements == null) {
            specificTendererRequirements = new ArrayList<TendererRequirementType>();
        }
        return this.specificTendererRequirements;
    }

    /**
     * Gets the value of the economicOperatorRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the economicOperatorRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEconomicOperatorRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EconomicOperatorRole }
     * 
     * 
     */
    public List<EconomicOperatorRole> getEconomicOperatorRoles() {
        if (economicOperatorRoles == null) {
            economicOperatorRoles = new ArrayList<EconomicOperatorRole>();
        }
        return this.economicOperatorRoles;
    }

}
