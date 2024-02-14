
package net.betzel.fury.test;

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
 * <p>Java class for DespatchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DespatchType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ActualDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteedDespatchDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteedDespatchTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReleaseID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Instructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CarrierParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResponsibleParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contact" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EstimatedDespatchPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedDespatchPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespatchType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "requestedDespatchDate",
    "requestedDespatchTime",
    "estimatedDespatchDate",
    "estimatedDespatchTime",
    "actualDespatchDate",
    "actualDespatchTime",
    "guaranteedDespatchDate",
    "guaranteedDespatchTime",
    "releaseID",
    "instructions",
    "despatchAddress",
    "despatchLocation",
    "despatchParty",
    "carrierParty",
    "notifyParties",
    "responsibleParty",
    "contact",
    "estimatedDespatchPeriod",
    "requestedDespatchPeriod"
})
@XmlRootElement(name = "Despatch", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class Despatch
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "RequestedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequestedDespatchDate requestedDespatchDate;
    @XmlElement(name = "RequestedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequestedDespatchTime requestedDespatchTime;
    @XmlElement(name = "EstimatedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedDespatchDate estimatedDespatchDate;
    @XmlElement(name = "EstimatedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedDespatchTime estimatedDespatchTime;
    @XmlElement(name = "ActualDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ActualDespatchDate actualDespatchDate;
    @XmlElement(name = "ActualDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ActualDespatchTime actualDespatchTime;
    @XmlElement(name = "GuaranteedDespatchDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GuaranteedDespatchDate guaranteedDespatchDate;
    @XmlElement(name = "GuaranteedDespatchTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GuaranteedDespatchTime guaranteedDespatchTime;
    @XmlElement(name = "ReleaseID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReleaseID releaseID;
    @XmlElement(name = "Instructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Instructions> instructions;
    @XmlElement(name = "DespatchAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AddressType despatchAddress;
    @XmlElement(name = "DespatchLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType despatchLocation;
    @XmlElement(name = "DespatchParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType despatchParty;
    @XmlElement(name = "CarrierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType carrierParty;
    @XmlElement(name = "NotifyParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyType> notifyParties;
    @XmlElement(name = "ResponsibleParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType responsibleParty;
    @XmlElement(name = "Contact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContactType contact;
    @XmlElement(name = "EstimatedDespatchPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType estimatedDespatchPeriod;
    @XmlElement(name = "RequestedDespatchPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType requestedDespatchPeriod;

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
     * Gets the value of the requestedDespatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDespatchDate }
     *     
     */
    public RequestedDespatchDate getRequestedDespatchDate() {
        return requestedDespatchDate;
    }

    /**
     * Sets the value of the requestedDespatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDespatchDate }
     *     
     */
    public void setRequestedDespatchDate(RequestedDespatchDate value) {
        this.requestedDespatchDate = value;
    }

    /**
     * Gets the value of the requestedDespatchTime property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDespatchTime }
     *     
     */
    public RequestedDespatchTime getRequestedDespatchTime() {
        return requestedDespatchTime;
    }

    /**
     * Sets the value of the requestedDespatchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDespatchTime }
     *     
     */
    public void setRequestedDespatchTime(RequestedDespatchTime value) {
        this.requestedDespatchTime = value;
    }

    /**
     * Gets the value of the estimatedDespatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDespatchDate }
     *     
     */
    public EstimatedDespatchDate getEstimatedDespatchDate() {
        return estimatedDespatchDate;
    }

    /**
     * Sets the value of the estimatedDespatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDespatchDate }
     *     
     */
    public void setEstimatedDespatchDate(EstimatedDespatchDate value) {
        this.estimatedDespatchDate = value;
    }

    /**
     * Gets the value of the estimatedDespatchTime property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedDespatchTime }
     *     
     */
    public EstimatedDespatchTime getEstimatedDespatchTime() {
        return estimatedDespatchTime;
    }

    /**
     * Sets the value of the estimatedDespatchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedDespatchTime }
     *     
     */
    public void setEstimatedDespatchTime(EstimatedDespatchTime value) {
        this.estimatedDespatchTime = value;
    }

    /**
     * Gets the value of the actualDespatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link ActualDespatchDate }
     *     
     */
    public ActualDespatchDate getActualDespatchDate() {
        return actualDespatchDate;
    }

    /**
     * Sets the value of the actualDespatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDespatchDate }
     *     
     */
    public void setActualDespatchDate(ActualDespatchDate value) {
        this.actualDespatchDate = value;
    }

    /**
     * Gets the value of the actualDespatchTime property.
     * 
     * @return
     *     possible object is
     *     {@link ActualDespatchTime }
     *     
     */
    public ActualDespatchTime getActualDespatchTime() {
        return actualDespatchTime;
    }

    /**
     * Sets the value of the actualDespatchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualDespatchTime }
     *     
     */
    public void setActualDespatchTime(ActualDespatchTime value) {
        this.actualDespatchTime = value;
    }

    /**
     * Gets the value of the guaranteedDespatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedDespatchDate }
     *     
     */
    public GuaranteedDespatchDate getGuaranteedDespatchDate() {
        return guaranteedDespatchDate;
    }

    /**
     * Sets the value of the guaranteedDespatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedDespatchDate }
     *     
     */
    public void setGuaranteedDespatchDate(GuaranteedDespatchDate value) {
        this.guaranteedDespatchDate = value;
    }

    /**
     * Gets the value of the guaranteedDespatchTime property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteedDespatchTime }
     *     
     */
    public GuaranteedDespatchTime getGuaranteedDespatchTime() {
        return guaranteedDespatchTime;
    }

    /**
     * Sets the value of the guaranteedDespatchTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteedDespatchTime }
     *     
     */
    public void setGuaranteedDespatchTime(GuaranteedDespatchTime value) {
        this.guaranteedDespatchTime = value;
    }

    /**
     * Gets the value of the releaseID property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseID }
     *     
     */
    public ReleaseID getReleaseID() {
        return releaseID;
    }

    /**
     * Sets the value of the releaseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseID }
     *     
     */
    public void setReleaseID(ReleaseID value) {
        this.releaseID = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instructions }
     * 
     * 
     */
    public List<Instructions> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<Instructions>();
        }
        return this.instructions;
    }

    /**
     * Gets the value of the despatchAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDespatchAddress() {
        return despatchAddress;
    }

    /**
     * Sets the value of the despatchAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDespatchAddress(AddressType value) {
        this.despatchAddress = value;
    }

    /**
     * Gets the value of the despatchLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDespatchLocation() {
        return despatchLocation;
    }

    /**
     * Sets the value of the despatchLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDespatchLocation(LocationType value) {
        this.despatchLocation = value;
    }

    /**
     * Gets the value of the despatchParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDespatchParty() {
        return despatchParty;
    }

    /**
     * Sets the value of the despatchParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDespatchParty(PartyType value) {
        this.despatchParty = value;
    }

    /**
     * Gets the value of the carrierParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getCarrierParty() {
        return carrierParty;
    }

    /**
     * Sets the value of the carrierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setCarrierParty(PartyType value) {
        this.carrierParty = value;
    }

    /**
     * Gets the value of the notifyParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getNotifyParties() {
        if (notifyParties == null) {
            notifyParties = new ArrayList<PartyType>();
        }
        return this.notifyParties;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setResponsibleParty(PartyType value) {
        this.responsibleParty = value;
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
     * Gets the value of the estimatedDespatchPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getEstimatedDespatchPeriod() {
        return estimatedDespatchPeriod;
    }

    /**
     * Sets the value of the estimatedDespatchPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setEstimatedDespatchPeriod(PeriodType value) {
        this.estimatedDespatchPeriod = value;
    }

    /**
     * Gets the value of the requestedDespatchPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getRequestedDespatchPeriod() {
        return requestedDespatchPeriod;
    }

    /**
     * Sets the value of the requestedDespatchPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setRequestedDespatchPeriod(PeriodType value) {
        this.requestedDespatchPeriod = value;
    }

}
