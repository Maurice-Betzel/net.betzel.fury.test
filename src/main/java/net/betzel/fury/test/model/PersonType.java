
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
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FirstName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FamilyName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Title" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MiddleName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OtherName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NameSuffix" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JobTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NationalityID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GenderCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BirthDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BirthplaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OrganizationDepartment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoleCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BirthplaceLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CitizenshipCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IdentityDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResidenceAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "firstName",
    "familyName",
    "title",
    "middleName",
    "otherName",
    "nameSuffix",
    "jobTitle",
    "nationalityID",
    "genderCode",
    "birthDate",
    "birthplaceName",
    "organizationDepartment",
    "roleCode",
    "birthplaceLocation",
    "citizenshipCountry",
    "contact",
    "financialAccount",
    "identityDocumentReferences",
    "residenceAddress"
})
public class PersonType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "FirstName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FirstName firstName;
    @XmlElement(name = "FamilyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FamilyName familyName;
    @XmlElement(name = "Title", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Title title;
    @XmlElement(name = "MiddleName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MiddleName middleName;
    @XmlElement(name = "OtherName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OtherName otherName;
    @XmlElement(name = "NameSuffix", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NameSuffix nameSuffix;
    @XmlElement(name = "JobTitle", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected JobTitle jobTitle;
    @XmlElement(name = "NationalityID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NationalityID nationalityID;
    @XmlElement(name = "GenderCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GenderCode genderCode;
    @XmlElement(name = "BirthDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BirthDate birthDate;
    @XmlElement(name = "BirthplaceName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BirthplaceName birthplaceName;
    @XmlElement(name = "OrganizationDepartment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OrganizationDepartment organizationDepartment;
    @XmlElement(name = "RoleCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RoleCode roleCode;
    @XmlElement(name = "BirthplaceLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType birthplaceLocation;
    @XmlElement(name = "CitizenshipCountry", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CountryType citizenshipCountry;
    @XmlElement(name = "Contact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContactType contact;
    @XmlElement(name = "FinancialAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected FinancialAccountType financialAccount;
    @XmlElement(name = "IdentityDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> identityDocumentReferences;
    @XmlElement(name = "ResidenceAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AddressType residenceAddress;

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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link FirstName }
     *     
     */
    public FirstName getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstName }
     *     
     */
    public void setFirstName(FirstName value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyName }
     *     
     */
    public FamilyName getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyName }
     *     
     */
    public void setFamilyName(FamilyName value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link MiddleName }
     *     
     */
    public MiddleName getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiddleName }
     *     
     */
    public void setMiddleName(MiddleName value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the otherName property.
     * 
     * @return
     *     possible object is
     *     {@link OtherName }
     *     
     */
    public OtherName getOtherName() {
        return otherName;
    }

    /**
     * Sets the value of the otherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherName }
     *     
     */
    public void setOtherName(OtherName value) {
        this.otherName = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffix }
     *     
     */
    public NameSuffix getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffix }
     *     
     */
    public void setNameSuffix(NameSuffix value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JobTitle }
     *     
     */
    public JobTitle getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobTitle }
     *     
     */
    public void setJobTitle(JobTitle value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the nationalityID property.
     * 
     * @return
     *     possible object is
     *     {@link NationalityID }
     *     
     */
    public NationalityID getNationalityID() {
        return nationalityID;
    }

    /**
     * Sets the value of the nationalityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalityID }
     *     
     */
    public void setNationalityID(NationalityID value) {
        this.nationalityID = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCode }
     *     
     */
    public GenderCode getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCode }
     *     
     */
    public void setGenderCode(GenderCode value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDate }
     *     
     */
    public BirthDate getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDate }
     *     
     */
    public void setBirthDate(BirthDate value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthplaceName property.
     * 
     * @return
     *     possible object is
     *     {@link BirthplaceName }
     *     
     */
    public BirthplaceName getBirthplaceName() {
        return birthplaceName;
    }

    /**
     * Sets the value of the birthplaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthplaceName }
     *     
     */
    public void setBirthplaceName(BirthplaceName value) {
        this.birthplaceName = value;
    }

    /**
     * Gets the value of the organizationDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDepartment }
     *     
     */
    public OrganizationDepartment getOrganizationDepartment() {
        return organizationDepartment;
    }

    /**
     * Sets the value of the organizationDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDepartment }
     *     
     */
    public void setOrganizationDepartment(OrganizationDepartment value) {
        this.organizationDepartment = value;
    }

    /**
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link RoleCode }
     *     
     */
    public RoleCode getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleCode }
     *     
     */
    public void setRoleCode(RoleCode value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the birthplaceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getBirthplaceLocation() {
        return birthplaceLocation;
    }

    /**
     * Sets the value of the birthplaceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setBirthplaceLocation(LocationType value) {
        this.birthplaceLocation = value;
    }

    /**
     * Gets the value of the citizenshipCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCitizenshipCountry() {
        return citizenshipCountry;
    }

    /**
     * Sets the value of the citizenshipCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCitizenshipCountry(CountryType value) {
        this.citizenshipCountry = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the financialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getFinancialAccount() {
        return financialAccount;
    }

    /**
     * Sets the value of the financialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setFinancialAccount(FinancialAccountType value) {
        this.financialAccount = value;
    }

    /**
     * Gets the value of the identityDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getIdentityDocumentReferences() {
        if (identityDocumentReferences == null) {
            identityDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.identityDocumentReferences;
    }

    /**
     * Gets the value of the residenceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getResidenceAddress() {
        return residenceAddress;
    }

    /**
     * Sets the value of the residenceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setResidenceAddress(AddressType value) {
        this.residenceAddress = value;
    }

}
