
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
 * <p>Java class for PaymentTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentMeansID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrepaidPaymentReferenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceEventCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SettlementDiscountPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PenaltySurchargePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SettlementDiscountAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PenaltyAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentTermsDetailsURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstallmentDueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InvoicingPartyReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SettlementPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTermsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "paymentMeansIDs",
    "prepaidPaymentReferenceID",
    "notes",
    "referenceEventCode",
    "settlementDiscountPercent",
    "penaltySurchargePercent",
    "paymentPercent",
    "amount",
    "settlementDiscountAmount",
    "penaltyAmount",
    "paymentTermsDetailsURI",
    "paymentDueDate",
    "installmentDueDate",
    "invoicingPartyReference",
    "settlementPeriod",
    "penaltyPeriod",
    "exchangeRate",
    "validityPeriod"
})
public class PaymentTermsType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "PaymentMeansID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PaymentMeansID> paymentMeansIDs;
    @XmlElement(name = "PrepaidPaymentReferenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PrepaidPaymentReferenceID prepaidPaymentReferenceID;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "ReferenceEventCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReferenceEventCode referenceEventCode;
    @XmlElement(name = "SettlementDiscountPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SettlementDiscountPercent settlementDiscountPercent;
    @XmlElement(name = "PenaltySurchargePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PenaltySurchargePercent penaltySurchargePercent;
    @XmlElement(name = "PaymentPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaymentPercent paymentPercent;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Amount amount;
    @XmlElement(name = "SettlementDiscountAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SettlementDiscountAmount settlementDiscountAmount;
    @XmlElement(name = "PenaltyAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PenaltyAmount penaltyAmount;
    @XmlElement(name = "PaymentTermsDetailsURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaymentTermsDetailsURI paymentTermsDetailsURI;
    @XmlElement(name = "PaymentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaymentDueDate paymentDueDate;
    @XmlElement(name = "InstallmentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InstallmentDueDate installmentDueDate;
    @XmlElement(name = "InvoicingPartyReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InvoicingPartyReference invoicingPartyReference;
    @XmlElement(name = "SettlementPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType settlementPeriod;
    @XmlElement(name = "PenaltyPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType penaltyPeriod;
    @XmlElement(name = "ExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ExchangeRateType exchangeRate;
    @XmlElement(name = "ValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType validityPeriod;

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
     * Gets the value of the paymentMeansIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeansIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeansIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeansID }
     * 
     * 
     */
    public List<PaymentMeansID> getPaymentMeansIDs() {
        if (paymentMeansIDs == null) {
            paymentMeansIDs = new ArrayList<PaymentMeansID>();
        }
        return this.paymentMeansIDs;
    }

    /**
     * Gets the value of the prepaidPaymentReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link PrepaidPaymentReferenceID }
     *     
     */
    public PrepaidPaymentReferenceID getPrepaidPaymentReferenceID() {
        return prepaidPaymentReferenceID;
    }

    /**
     * Sets the value of the prepaidPaymentReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepaidPaymentReferenceID }
     *     
     */
    public void setPrepaidPaymentReferenceID(PrepaidPaymentReferenceID value) {
        this.prepaidPaymentReferenceID = value;
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
     * Gets the value of the referenceEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceEventCode }
     *     
     */
    public ReferenceEventCode getReferenceEventCode() {
        return referenceEventCode;
    }

    /**
     * Sets the value of the referenceEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceEventCode }
     *     
     */
    public void setReferenceEventCode(ReferenceEventCode value) {
        this.referenceEventCode = value;
    }

    /**
     * Gets the value of the settlementDiscountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDiscountPercent }
     *     
     */
    public SettlementDiscountPercent getSettlementDiscountPercent() {
        return settlementDiscountPercent;
    }

    /**
     * Sets the value of the settlementDiscountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDiscountPercent }
     *     
     */
    public void setSettlementDiscountPercent(SettlementDiscountPercent value) {
        this.settlementDiscountPercent = value;
    }

    /**
     * Gets the value of the penaltySurchargePercent property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltySurchargePercent }
     *     
     */
    public PenaltySurchargePercent getPenaltySurchargePercent() {
        return penaltySurchargePercent;
    }

    /**
     * Sets the value of the penaltySurchargePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltySurchargePercent }
     *     
     */
    public void setPenaltySurchargePercent(PenaltySurchargePercent value) {
        this.penaltySurchargePercent = value;
    }

    /**
     * Gets the value of the paymentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentPercent }
     *     
     */
    public PaymentPercent getPaymentPercent() {
        return paymentPercent;
    }

    /**
     * Sets the value of the paymentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentPercent }
     *     
     */
    public void setPaymentPercent(PaymentPercent value) {
        this.paymentPercent = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the settlementDiscountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDiscountAmount }
     *     
     */
    public SettlementDiscountAmount getSettlementDiscountAmount() {
        return settlementDiscountAmount;
    }

    /**
     * Sets the value of the settlementDiscountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDiscountAmount }
     *     
     */
    public void setSettlementDiscountAmount(SettlementDiscountAmount value) {
        this.settlementDiscountAmount = value;
    }

    /**
     * Gets the value of the penaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyAmount }
     *     
     */
    public PenaltyAmount getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Sets the value of the penaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyAmount }
     *     
     */
    public void setPenaltyAmount(PenaltyAmount value) {
        this.penaltyAmount = value;
    }

    /**
     * Gets the value of the paymentTermsDetailsURI property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsDetailsURI }
     *     
     */
    public PaymentTermsDetailsURI getPaymentTermsDetailsURI() {
        return paymentTermsDetailsURI;
    }

    /**
     * Sets the value of the paymentTermsDetailsURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsDetailsURI }
     *     
     */
    public void setPaymentTermsDetailsURI(PaymentTermsDetailsURI value) {
        this.paymentTermsDetailsURI = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDueDate }
     *     
     */
    public PaymentDueDate getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDueDate }
     *     
     */
    public void setPaymentDueDate(PaymentDueDate value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the installmentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentDueDate }
     *     
     */
    public InstallmentDueDate getInstallmentDueDate() {
        return installmentDueDate;
    }

    /**
     * Sets the value of the installmentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentDueDate }
     *     
     */
    public void setInstallmentDueDate(InstallmentDueDate value) {
        this.installmentDueDate = value;
    }

    /**
     * Gets the value of the invoicingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link InvoicingPartyReference }
     *     
     */
    public InvoicingPartyReference getInvoicingPartyReference() {
        return invoicingPartyReference;
    }

    /**
     * Sets the value of the invoicingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicingPartyReference }
     *     
     */
    public void setInvoicingPartyReference(InvoicingPartyReference value) {
        this.invoicingPartyReference = value;
    }

    /**
     * Gets the value of the settlementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getSettlementPeriod() {
        return settlementPeriod;
    }

    /**
     * Sets the value of the settlementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setSettlementPeriod(PeriodType value) {
        this.settlementPeriod = value;
    }

    /**
     * Gets the value of the penaltyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPenaltyPeriod() {
        return penaltyPeriod;
    }

    /**
     * Sets the value of the penaltyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPenaltyPeriod(PeriodType value) {
        this.penaltyPeriod = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setExchangeRate(ExchangeRateType value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setValidityPeriod(PeriodType value) {
        this.validityPeriod = value;
    }

}
