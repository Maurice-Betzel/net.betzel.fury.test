
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaidAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaidCashAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CashChangeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaidDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaidTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MerchantID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AuthorizationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransactionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentTerminalID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "paidAmount",
    "paidCashAmount",
    "cashChangeAmount",
    "receivedDate",
    "paidDate",
    "paidTime",
    "instructionID",
    "merchantID",
    "authorizationID",
    "transactionID",
    "paymentTerminalID",
    "exchangeRate"
})
public class PaymentType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "PaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaidAmount paidAmount;
    @XmlElement(name = "PaidCashAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaidCashAmount paidCashAmount;
    @XmlElement(name = "CashChangeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CashChangeAmount cashChangeAmount;
    @XmlElement(name = "ReceivedDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReceivedDate receivedDate;
    @XmlElement(name = "PaidDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaidDate paidDate;
    @XmlElement(name = "PaidTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaidTime paidTime;
    @XmlElement(name = "InstructionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InstructionID instructionID;
    @XmlElement(name = "MerchantID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MerchantID merchantID;
    @XmlElement(name = "AuthorizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AuthorizationID authorizationID;
    @XmlElement(name = "TransactionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransactionID transactionID;
    @XmlElement(name = "PaymentTerminalID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaymentTerminalID paymentTerminalID;
    @XmlElement(name = "ExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ExchangeRateType exchangeRate;

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
     * Gets the value of the paidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaidAmount }
     *     
     */
    public PaidAmount getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidAmount }
     *     
     */
    public void setPaidAmount(PaidAmount value) {
        this.paidAmount = value;
    }

    /**
     * Gets the value of the paidCashAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaidCashAmount }
     *     
     */
    public PaidCashAmount getPaidCashAmount() {
        return paidCashAmount;
    }

    /**
     * Sets the value of the paidCashAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidCashAmount }
     *     
     */
    public void setPaidCashAmount(PaidCashAmount value) {
        this.paidCashAmount = value;
    }

    /**
     * Gets the value of the cashChangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CashChangeAmount }
     *     
     */
    public CashChangeAmount getCashChangeAmount() {
        return cashChangeAmount;
    }

    /**
     * Sets the value of the cashChangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashChangeAmount }
     *     
     */
    public void setCashChangeAmount(CashChangeAmount value) {
        this.cashChangeAmount = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedDate }
     *     
     */
    public ReceivedDate getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedDate }
     *     
     */
    public void setReceivedDate(ReceivedDate value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the paidDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaidDate }
     *     
     */
    public PaidDate getPaidDate() {
        return paidDate;
    }

    /**
     * Sets the value of the paidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidDate }
     *     
     */
    public void setPaidDate(PaidDate value) {
        this.paidDate = value;
    }

    /**
     * Gets the value of the paidTime property.
     * 
     * @return
     *     possible object is
     *     {@link PaidTime }
     *     
     */
    public PaidTime getPaidTime() {
        return paidTime;
    }

    /**
     * Sets the value of the paidTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaidTime }
     *     
     */
    public void setPaidTime(PaidTime value) {
        this.paidTime = value;
    }

    /**
     * Gets the value of the instructionID property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionID }
     *     
     */
    public InstructionID getInstructionID() {
        return instructionID;
    }

    /**
     * Sets the value of the instructionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionID }
     *     
     */
    public void setInstructionID(InstructionID value) {
        this.instructionID = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantID }
     *     
     */
    public MerchantID getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantID }
     *     
     */
    public void setMerchantID(MerchantID value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the authorizationID property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationID }
     *     
     */
    public AuthorizationID getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Sets the value of the authorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationID }
     *     
     */
    public void setAuthorizationID(AuthorizationID value) {
        this.authorizationID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionID }
     *     
     */
    public TransactionID getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionID }
     *     
     */
    public void setTransactionID(TransactionID value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the paymentTerminalID property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerminalID }
     *     
     */
    public PaymentTerminalID getPaymentTerminalID() {
        return paymentTerminalID;
    }

    /**
     * Sets the value of the paymentTerminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerminalID }
     *     
     */
    public void setPaymentTerminalID(PaymentTerminalID value) {
        this.paymentTerminalID = value;
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

}
