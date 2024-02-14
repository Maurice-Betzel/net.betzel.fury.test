
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipantPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InitiatingPartyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrivatePartyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PublicPartyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceProviderPartyIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LegalContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupportContact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommercialContact" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantPartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "initiatingPartyIndicator",
    "privatePartyIndicator",
    "publicPartyIndicator",
    "serviceProviderPartyIndicator",
    "party",
    "legalContact",
    "technicalContact",
    "supportContact",
    "commercialContact"
})
@XmlRootElement(name = "ParticipantParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ParticipantParty
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "InitiatingPartyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InitiatingPartyIndicator initiatingPartyIndicator;
    @XmlElement(name = "PrivatePartyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PrivatePartyIndicator privatePartyIndicator;
    @XmlElement(name = "PublicPartyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PublicPartyIndicator publicPartyIndicator;
    @XmlElement(name = "ServiceProviderPartyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ServiceProviderPartyIndicator serviceProviderPartyIndicator;
    @XmlElement(name = "Party", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected PartyType party;
    @XmlElement(name = "LegalContact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContactType legalContact;
    @XmlElement(name = "TechnicalContact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContactType technicalContact;
    @XmlElement(name = "SupportContact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContactType supportContact;
    @XmlElement(name = "CommercialContact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContactType commercialContact;

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
     * Gets the value of the initiatingPartyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link InitiatingPartyIndicator }
     *     
     */
    public InitiatingPartyIndicator getInitiatingPartyIndicator() {
        return initiatingPartyIndicator;
    }

    /**
     * Sets the value of the initiatingPartyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiatingPartyIndicator }
     *     
     */
    public void setInitiatingPartyIndicator(InitiatingPartyIndicator value) {
        this.initiatingPartyIndicator = value;
    }

    /**
     * Gets the value of the privatePartyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PrivatePartyIndicator }
     *     
     */
    public PrivatePartyIndicator getPrivatePartyIndicator() {
        return privatePartyIndicator;
    }

    /**
     * Sets the value of the privatePartyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivatePartyIndicator }
     *     
     */
    public void setPrivatePartyIndicator(PrivatePartyIndicator value) {
        this.privatePartyIndicator = value;
    }

    /**
     * Gets the value of the publicPartyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PublicPartyIndicator }
     *     
     */
    public PublicPartyIndicator getPublicPartyIndicator() {
        return publicPartyIndicator;
    }

    /**
     * Sets the value of the publicPartyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicPartyIndicator }
     *     
     */
    public void setPublicPartyIndicator(PublicPartyIndicator value) {
        this.publicPartyIndicator = value;
    }

    /**
     * Gets the value of the serviceProviderPartyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderPartyIndicator }
     *     
     */
    public ServiceProviderPartyIndicator getServiceProviderPartyIndicator() {
        return serviceProviderPartyIndicator;
    }

    /**
     * Sets the value of the serviceProviderPartyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderPartyIndicator }
     *     
     */
    public void setServiceProviderPartyIndicator(ServiceProviderPartyIndicator value) {
        this.serviceProviderPartyIndicator = value;
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
     * Gets the value of the legalContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getLegalContact() {
        return legalContact;
    }

    /**
     * Sets the value of the legalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setLegalContact(ContactType value) {
        this.legalContact = value;
    }

    /**
     * Gets the value of the technicalContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getTechnicalContact() {
        return technicalContact;
    }

    /**
     * Sets the value of the technicalContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setTechnicalContact(ContactType value) {
        this.technicalContact = value;
    }

    /**
     * Gets the value of the supportContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSupportContact() {
        return supportContact;
    }

    /**
     * Sets the value of the supportContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSupportContact(ContactType value) {
        this.supportContact = value;
    }

    /**
     * Gets the value of the commercialContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getCommercialContact() {
        return commercialContact;
    }

    /**
     * Sets the value of the commercialContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setCommercialContact(ContactType value) {
        this.commercialContact = value;
    }

}
