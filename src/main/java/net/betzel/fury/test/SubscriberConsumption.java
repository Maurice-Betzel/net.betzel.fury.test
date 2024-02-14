
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberConsumptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberConsumptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecificationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalMeteredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubscriberParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UtilityConsumptionPoint"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OnAccountPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Consumption" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplierConsumption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "consumptionID",
    "specificationTypeCode",
    "notes",
    "totalMeteredQuantity",
    "subscriberParty",
    "utilityConsumptionPoint",
    "onAccountPayments",
    "consumption",
    "supplierConsumptions"
})
@XmlRootElement(name = "SubscriberConsumption", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class SubscriberConsumption
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ConsumptionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionID consumptionID;
    @XmlElement(name = "SpecificationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SpecificationTypeCode specificationTypeCode;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "TotalMeteredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalMeteredQuantity totalMeteredQuantity;
    @XmlElement(name = "SubscriberParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType subscriberParty;
    @XmlElement(name = "UtilityConsumptionPoint", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected ConsumptionPointType utilityConsumptionPoint;
    @XmlElement(name = "OnAccountPayment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<OnAccountPaymentType> onAccountPayments;
    @XmlElement(name = "Consumption", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected Consumption consumption;
    @XmlElement(name = "SupplierConsumption", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<SupplierConsumption> supplierConsumptions;

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
     * Gets the value of the consumptionID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionID }
     *     
     */
    public ConsumptionID getConsumptionID() {
        return consumptionID;
    }

    /**
     * Sets the value of the consumptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionID }
     *     
     */
    public void setConsumptionID(ConsumptionID value) {
        this.consumptionID = value;
    }

    /**
     * Gets the value of the specificationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationTypeCode }
     *     
     */
    public SpecificationTypeCode getSpecificationTypeCode() {
        return specificationTypeCode;
    }

    /**
     * Sets the value of the specificationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationTypeCode }
     *     
     */
    public void setSpecificationTypeCode(SpecificationTypeCode value) {
        this.specificationTypeCode = value;
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
     * Gets the value of the totalMeteredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalMeteredQuantity }
     *     
     */
    public TotalMeteredQuantity getTotalMeteredQuantity() {
        return totalMeteredQuantity;
    }

    /**
     * Sets the value of the totalMeteredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalMeteredQuantity }
     *     
     */
    public void setTotalMeteredQuantity(TotalMeteredQuantity value) {
        this.totalMeteredQuantity = value;
    }

    /**
     * Gets the value of the subscriberParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSubscriberParty() {
        return subscriberParty;
    }

    /**
     * Sets the value of the subscriberParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSubscriberParty(PartyType value) {
        this.subscriberParty = value;
    }

    /**
     * Gets the value of the utilityConsumptionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionPointType }
     *     
     */
    public ConsumptionPointType getUtilityConsumptionPoint() {
        return utilityConsumptionPoint;
    }

    /**
     * Sets the value of the utilityConsumptionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionPointType }
     *     
     */
    public void setUtilityConsumptionPoint(ConsumptionPointType value) {
        this.utilityConsumptionPoint = value;
    }

    /**
     * Gets the value of the onAccountPayments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onAccountPayments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnAccountPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnAccountPaymentType }
     * 
     * 
     */
    public List<OnAccountPaymentType> getOnAccountPayments() {
        if (onAccountPayments == null) {
            onAccountPayments = new ArrayList<OnAccountPaymentType>();
        }
        return this.onAccountPayments;
    }

    /**
     * Gets the value of the consumption property.
     * 
     * @return
     *     possible object is
     *     {@link Consumption }
     *     
     */
    public Consumption getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consumption }
     *     
     */
    public void setConsumption(Consumption value) {
        this.consumption = value;
    }

    /**
     * Gets the value of the supplierConsumptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierConsumptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierConsumptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierConsumption }
     * 
     * 
     */
    public List<SupplierConsumption> getSupplierConsumptions() {
        if (supplierConsumptions == null) {
            supplierConsumptions = new ArrayList<SupplierConsumption>();
        }
        return this.supplierConsumptions;
    }

}
