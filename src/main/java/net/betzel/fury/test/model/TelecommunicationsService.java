
package net.betzel.fury.test.model;

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
 * <p>Java class for TelecommunicationsServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelecommunicationsServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallTime"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceNumberCalled"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCategory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCategoryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MovieTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RoamingPartnerName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PayPerView" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCall" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsServiceCallCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallBaseAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CallExtensionAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Price" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CallDuty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TimeDuty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecommunicationsServiceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "callDate",
    "callTime",
    "serviceNumberCalled",
    "telecommunicationsServiceCategory",
    "telecommunicationsServiceCategoryCode",
    "movieTitle",
    "roamingPartnerName",
    "payPerView",
    "quantity",
    "telecommunicationsServiceCall",
    "telecommunicationsServiceCallCode",
    "callBaseAmount",
    "callExtensionAmount",
    "price",
    "country",
    "exchangeRates",
    "allowanceCharges",
    "taxTotals",
    "callDuties",
    "timeDuties"
})
@XmlRootElement(name = "TelecommunicationsService", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TelecommunicationsService
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "CallDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected CallDate callDate;
    @XmlElement(name = "CallTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected CallTime callTime;
    @XmlElement(name = "ServiceNumberCalled", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ServiceNumberCalled serviceNumberCalled;
    @XmlElement(name = "TelecommunicationsServiceCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TelecommunicationsServiceCategory telecommunicationsServiceCategory;
    @XmlElement(name = "TelecommunicationsServiceCategoryCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TelecommunicationsServiceCategoryCode telecommunicationsServiceCategoryCode;
    @XmlElement(name = "MovieTitle", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MovieTitle movieTitle;
    @XmlElement(name = "RoamingPartnerName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RoamingPartnerName roamingPartnerName;
    @XmlElement(name = "PayPerView", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PayPerView payPerView;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Quantity quantity;
    @XmlElement(name = "TelecommunicationsServiceCall", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TelecommunicationsServiceCall telecommunicationsServiceCall;
    @XmlElement(name = "TelecommunicationsServiceCallCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TelecommunicationsServiceCallCode telecommunicationsServiceCallCode;
    @XmlElement(name = "CallBaseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CallBaseAmount callBaseAmount;
    @XmlElement(name = "CallExtensionAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CallExtensionAmount callExtensionAmount;
    @XmlElement(name = "Price", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PriceType price;
    @XmlElement(name = "Country", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CountryType country;
    @XmlElement(name = "ExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ExchangeRateType> exchangeRates;
    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> allowanceCharges;
    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "CallDuty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DutyType> callDuties;
    @XmlElement(name = "TimeDuty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DutyType> timeDuties;

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
     * Gets the value of the callDate property.
     * 
     * @return
     *     possible object is
     *     {@link CallDate }
     *     
     */
    public CallDate getCallDate() {
        return callDate;
    }

    /**
     * Sets the value of the callDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallDate }
     *     
     */
    public void setCallDate(CallDate value) {
        this.callDate = value;
    }

    /**
     * Gets the value of the callTime property.
     * 
     * @return
     *     possible object is
     *     {@link CallTime }
     *     
     */
    public CallTime getCallTime() {
        return callTime;
    }

    /**
     * Sets the value of the callTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallTime }
     *     
     */
    public void setCallTime(CallTime value) {
        this.callTime = value;
    }

    /**
     * Gets the value of the serviceNumberCalled property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNumberCalled }
     *     
     */
    public ServiceNumberCalled getServiceNumberCalled() {
        return serviceNumberCalled;
    }

    /**
     * Sets the value of the serviceNumberCalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNumberCalled }
     *     
     */
    public void setServiceNumberCalled(ServiceNumberCalled value) {
        this.serviceNumberCalled = value;
    }

    /**
     * Gets the value of the telecommunicationsServiceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCategory }
     *     
     */
    public TelecommunicationsServiceCategory getTelecommunicationsServiceCategory() {
        return telecommunicationsServiceCategory;
    }

    /**
     * Sets the value of the telecommunicationsServiceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCategory }
     *     
     */
    public void setTelecommunicationsServiceCategory(TelecommunicationsServiceCategory value) {
        this.telecommunicationsServiceCategory = value;
    }

    /**
     * Gets the value of the telecommunicationsServiceCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCategoryCode }
     *     
     */
    public TelecommunicationsServiceCategoryCode getTelecommunicationsServiceCategoryCode() {
        return telecommunicationsServiceCategoryCode;
    }

    /**
     * Sets the value of the telecommunicationsServiceCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCategoryCode }
     *     
     */
    public void setTelecommunicationsServiceCategoryCode(TelecommunicationsServiceCategoryCode value) {
        this.telecommunicationsServiceCategoryCode = value;
    }

    /**
     * Gets the value of the movieTitle property.
     * 
     * @return
     *     possible object is
     *     {@link MovieTitle }
     *     
     */
    public MovieTitle getMovieTitle() {
        return movieTitle;
    }

    /**
     * Sets the value of the movieTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovieTitle }
     *     
     */
    public void setMovieTitle(MovieTitle value) {
        this.movieTitle = value;
    }

    /**
     * Gets the value of the roamingPartnerName property.
     * 
     * @return
     *     possible object is
     *     {@link RoamingPartnerName }
     *     
     */
    public RoamingPartnerName getRoamingPartnerName() {
        return roamingPartnerName;
    }

    /**
     * Sets the value of the roamingPartnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoamingPartnerName }
     *     
     */
    public void setRoamingPartnerName(RoamingPartnerName value) {
        this.roamingPartnerName = value;
    }

    /**
     * Gets the value of the payPerView property.
     * 
     * @return
     *     possible object is
     *     {@link PayPerView }
     *     
     */
    public PayPerView getPayPerView() {
        return payPerView;
    }

    /**
     * Sets the value of the payPerView property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayPerView }
     *     
     */
    public void setPayPerView(PayPerView value) {
        this.payPerView = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the telecommunicationsServiceCall property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCall }
     *     
     */
    public TelecommunicationsServiceCall getTelecommunicationsServiceCall() {
        return telecommunicationsServiceCall;
    }

    /**
     * Sets the value of the telecommunicationsServiceCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCall }
     *     
     */
    public void setTelecommunicationsServiceCall(TelecommunicationsServiceCall value) {
        this.telecommunicationsServiceCall = value;
    }

    /**
     * Gets the value of the telecommunicationsServiceCallCode property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsServiceCallCode }
     *     
     */
    public TelecommunicationsServiceCallCode getTelecommunicationsServiceCallCode() {
        return telecommunicationsServiceCallCode;
    }

    /**
     * Sets the value of the telecommunicationsServiceCallCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsServiceCallCode }
     *     
     */
    public void setTelecommunicationsServiceCallCode(TelecommunicationsServiceCallCode value) {
        this.telecommunicationsServiceCallCode = value;
    }

    /**
     * Gets the value of the callBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CallBaseAmount }
     *     
     */
    public CallBaseAmount getCallBaseAmount() {
        return callBaseAmount;
    }

    /**
     * Sets the value of the callBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallBaseAmount }
     *     
     */
    public void setCallBaseAmount(CallBaseAmount value) {
        this.callBaseAmount = value;
    }

    /**
     * Gets the value of the callExtensionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CallExtensionAmount }
     *     
     */
    public CallExtensionAmount getCallExtensionAmount() {
        return callExtensionAmount;
    }

    /**
     * Sets the value of the callExtensionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallExtensionAmount }
     *     
     */
    public void setCallExtensionAmount(CallExtensionAmount value) {
        this.callExtensionAmount = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the exchangeRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeRateType }
     * 
     * 
     */
    public List<ExchangeRateType> getExchangeRates() {
        if (exchangeRates == null) {
            exchangeRates = new ArrayList<ExchangeRateType>();
        }
        return this.exchangeRates;
    }

    /**
     * Gets the value of the allowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getAllowanceCharges() {
        if (allowanceCharges == null) {
            allowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharges;
    }

    /**
     * Gets the value of the taxTotals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxTotals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTotals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTotalType }
     * 
     * 
     */
    public List<TaxTotalType> getTaxTotals() {
        if (taxTotals == null) {
            taxTotals = new ArrayList<TaxTotalType>();
        }
        return this.taxTotals;
    }

    /**
     * Gets the value of the callDuties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callDuties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallDuties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyType }
     * 
     * 
     */
    public List<DutyType> getCallDuties() {
        if (callDuties == null) {
            callDuties = new ArrayList<DutyType>();
        }
        return this.callDuties;
    }

    /**
     * Gets the value of the timeDuties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeDuties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeDuties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyType }
     * 
     * 
     */
    public List<DutyType> getTimeDuties() {
        if (timeDuties == null) {
            timeDuties = new ArrayList<DutyType>();
        }
        return this.timeDuties;
    }

}
