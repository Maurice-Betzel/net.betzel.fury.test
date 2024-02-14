
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkCareIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkAttentionIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WebsiteURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LogoReferenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EndpointID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IndustryClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Language" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PostalAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PhysicalLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyTaxScheme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyLegalEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Person" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AgentParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceProviderParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PowerOfAttorney" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PartyAuthorization" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalWebSite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SocialMediaProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "markCareIndicator",
    "markAttentionIndicator",
    "websiteURI",
    "logoReferenceID",
    "endpointID",
    "industryClassificationCode",
    "partyIdentifications",
    "partyNames",
    "language",
    "postalAddress",
    "physicalLocation",
    "partyTaxSchemes",
    "partyLegalEntities",
    "contact",
    "persons",
    "agentParty",
    "serviceProviderParties",
    "powerOfAttorneies",
    "partyAuthorizations",
    "financialAccount",
    "additionalWebSites",
    "socialMediaProfiles"
})
public class PartyType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "MarkCareIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MarkCareIndicator markCareIndicator;
    @XmlElement(name = "MarkAttentionIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MarkAttentionIndicator markAttentionIndicator;
    @XmlElement(name = "WebsiteURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WebsiteURI websiteURI;
    @XmlElement(name = "LogoReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LogoReferenceID logoReferenceID;
    @XmlElement(name = "EndpointID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EndpointID endpointID;
    @XmlElement(name = "IndustryClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IndustryClassificationCode industryClassificationCode;
    @XmlElement(name = "PartyIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyIdentification> partyIdentifications;
    @XmlElement(name = "PartyName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyName> partyNames;
    @XmlElement(name = "Language", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LanguageType language;
    @XmlElement(name = "PostalAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AddressType postalAddress;
    @XmlElement(name = "PhysicalLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType physicalLocation;
    @XmlElement(name = "PartyTaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyTaxScheme> partyTaxSchemes;
    @XmlElement(name = "PartyLegalEntity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyLegalEntity> partyLegalEntities;
    @XmlElement(name = "Contact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContactType contact;
    @XmlElement(name = "Person", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PersonType> persons;
    @XmlElement(name = "AgentParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType agentParty;
    @XmlElement(name = "ServiceProviderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ServiceProviderParty> serviceProviderParties;
    @XmlElement(name = "PowerOfAttorney", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PowerOfAttorney> powerOfAttorneies;
    @XmlElement(name = "PartyAuthorization", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AuthorizationType> partyAuthorizations;
    @XmlElement(name = "FinancialAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected FinancialAccountType financialAccount;
    @XmlElement(name = "AdditionalWebSite", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<WebSiteType> additionalWebSites;
    @XmlElement(name = "SocialMediaProfile", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<SocialMediaProfile> socialMediaProfiles;

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
     * Gets the value of the markCareIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MarkCareIndicator }
     *     
     */
    public MarkCareIndicator getMarkCareIndicator() {
        return markCareIndicator;
    }

    /**
     * Sets the value of the markCareIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkCareIndicator }
     *     
     */
    public void setMarkCareIndicator(MarkCareIndicator value) {
        this.markCareIndicator = value;
    }

    /**
     * Gets the value of the markAttentionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MarkAttentionIndicator }
     *     
     */
    public MarkAttentionIndicator getMarkAttentionIndicator() {
        return markAttentionIndicator;
    }

    /**
     * Sets the value of the markAttentionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkAttentionIndicator }
     *     
     */
    public void setMarkAttentionIndicator(MarkAttentionIndicator value) {
        this.markAttentionIndicator = value;
    }

    /**
     * Gets the value of the websiteURI property.
     * 
     * @return
     *     possible object is
     *     {@link WebsiteURI }
     *     
     */
    public WebsiteURI getWebsiteURI() {
        return websiteURI;
    }

    /**
     * Sets the value of the websiteURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebsiteURI }
     *     
     */
    public void setWebsiteURI(WebsiteURI value) {
        this.websiteURI = value;
    }

    /**
     * Gets the value of the logoReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link LogoReferenceID }
     *     
     */
    public LogoReferenceID getLogoReferenceID() {
        return logoReferenceID;
    }

    /**
     * Sets the value of the logoReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoReferenceID }
     *     
     */
    public void setLogoReferenceID(LogoReferenceID value) {
        this.logoReferenceID = value;
    }

    /**
     * Gets the value of the endpointID property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointID }
     *     
     */
    public EndpointID getEndpointID() {
        return endpointID;
    }

    /**
     * Sets the value of the endpointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointID }
     *     
     */
    public void setEndpointID(EndpointID value) {
        this.endpointID = value;
    }

    /**
     * Gets the value of the industryClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryClassificationCode }
     *     
     */
    public IndustryClassificationCode getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    /**
     * Sets the value of the industryClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryClassificationCode }
     *     
     */
    public void setIndustryClassificationCode(IndustryClassificationCode value) {
        this.industryClassificationCode = value;
    }

    /**
     * Gets the value of the partyIdentifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyIdentifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyIdentifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification }
     * 
     * 
     */
    public List<PartyIdentification> getPartyIdentifications() {
        if (partyIdentifications == null) {
            partyIdentifications = new ArrayList<PartyIdentification>();
        }
        return this.partyIdentifications;
    }

    /**
     * Gets the value of the partyNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyName }
     * 
     * 
     */
    public List<PartyName> getPartyNames() {
        if (partyNames == null) {
            partyNames = new ArrayList<PartyName>();
        }
        return this.partyNames;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * Sets the value of the postalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPostalAddress(AddressType value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the physicalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Sets the value of the physicalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPhysicalLocation(LocationType value) {
        this.physicalLocation = value;
    }

    /**
     * Gets the value of the partyTaxSchemes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTaxSchemes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTaxSchemes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTaxScheme }
     * 
     * 
     */
    public List<PartyTaxScheme> getPartyTaxSchemes() {
        if (partyTaxSchemes == null) {
            partyTaxSchemes = new ArrayList<PartyTaxScheme>();
        }
        return this.partyTaxSchemes;
    }

    /**
     * Gets the value of the partyLegalEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyLegalEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyLegalEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyLegalEntity }
     * 
     * 
     */
    public List<PartyLegalEntity> getPartyLegalEntities() {
        if (partyLegalEntities == null) {
            partyLegalEntities = new ArrayList<PartyLegalEntity>();
        }
        return this.partyLegalEntities;
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
     * Gets the value of the persons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the persons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getPersons() {
        if (persons == null) {
            persons = new ArrayList<PersonType>();
        }
        return this.persons;
    }

    /**
     * Gets the value of the agentParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getAgentParty() {
        return agentParty;
    }

    /**
     * Sets the value of the agentParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setAgentParty(PartyType value) {
        this.agentParty = value;
    }

    /**
     * Gets the value of the serviceProviderParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProviderParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProviderParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProviderParty }
     * 
     * 
     */
    public List<ServiceProviderParty> getServiceProviderParties() {
        if (serviceProviderParties == null) {
            serviceProviderParties = new ArrayList<ServiceProviderParty>();
        }
        return this.serviceProviderParties;
    }

    /**
     * Gets the value of the powerOfAttorneies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerOfAttorneies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPowerOfAttorneies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PowerOfAttorney }
     * 
     * 
     */
    public List<PowerOfAttorney> getPowerOfAttorneies() {
        if (powerOfAttorneies == null) {
            powerOfAttorneies = new ArrayList<PowerOfAttorney>();
        }
        return this.powerOfAttorneies;
    }

    /**
     * Gets the value of the partyAuthorizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAuthorizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAuthorizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizationType }
     * 
     * 
     */
    public List<AuthorizationType> getPartyAuthorizations() {
        if (partyAuthorizations == null) {
            partyAuthorizations = new ArrayList<AuthorizationType>();
        }
        return this.partyAuthorizations;
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
     * Gets the value of the additionalWebSites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalWebSites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalWebSites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WebSiteType }
     * 
     * 
     */
    public List<WebSiteType> getAdditionalWebSites() {
        if (additionalWebSites == null) {
            additionalWebSites = new ArrayList<WebSiteType>();
        }
        return this.additionalWebSites;
    }

    /**
     * Gets the value of the socialMediaProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialMediaProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialMediaProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialMediaProfile }
     * 
     * 
     */
    public List<SocialMediaProfile> getSocialMediaProfiles() {
        if (socialMediaProfiles == null) {
            socialMediaProfiles = new ArrayList<SocialMediaProfile>();
        }
        return this.socialMediaProfiles;
    }

}
