
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
 * <p>Java class for PaymentMeansType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMeansType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentMeansCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentMeansDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentChannelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InstructionNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChargeBearerCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CardAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayerFinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayeeFinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CreditAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentMandate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TradeFinancing" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RemittanceDocumentDistribution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMeansType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "paymentMeansCode",
    "paymentMeansDescriptions",
    "paymentDueDate",
    "paymentChannelCode",
    "instructionID",
    "instructionNotes",
    "paymentIDs",
    "chargeBearerCode",
    "serviceLevelCode",
    "cardAccounts",
    "payerFinancialAccount",
    "payeeFinancialAccount",
    "creditAccount",
    "paymentMandate",
    "tradeFinancing",
    "remittanceDocumentDistributions"
})
@XmlRootElement(name = "PaymentMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class PaymentMeans
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "PaymentMeansCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected PaymentMeansCode paymentMeansCode;
    @XmlElement(name = "PaymentMeansDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PaymentMeansDescription> paymentMeansDescriptions;
    @XmlElement(name = "PaymentDueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaymentDueDate paymentDueDate;
    @XmlElement(name = "PaymentChannelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PaymentChannelCode paymentChannelCode;
    @XmlElement(name = "InstructionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InstructionID instructionID;
    @XmlElement(name = "InstructionNote", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<InstructionNote> instructionNotes;
    @XmlElement(name = "PaymentID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PaymentID> paymentIDs;
    @XmlElement(name = "ChargeBearerCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ChargeBearerCode chargeBearerCode;
    @XmlElement(name = "ServiceLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ServiceLevelCode serviceLevelCode;
    @XmlElement(name = "CardAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CardAccount> cardAccounts;
    @XmlElement(name = "PayerFinancialAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected FinancialAccountType payerFinancialAccount;
    @XmlElement(name = "PayeeFinancialAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected FinancialAccountType payeeFinancialAccount;
    @XmlElement(name = "CreditAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CreditAccount creditAccount;
    @XmlElement(name = "PaymentMandate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentMandate paymentMandate;
    @XmlElement(name = "TradeFinancing", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TradeFinancing tradeFinancing;
    @XmlElement(name = "RemittanceDocumentDistribution", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentDistributionType> remittanceDocumentDistributions;

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
     * Gets the value of the paymentMeansCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeansCode }
     *     
     */
    public PaymentMeansCode getPaymentMeansCode() {
        return paymentMeansCode;
    }

    /**
     * Sets the value of the paymentMeansCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeansCode }
     *     
     */
    public void setPaymentMeansCode(PaymentMeansCode value) {
        this.paymentMeansCode = value;
    }

    /**
     * Gets the value of the paymentMeansDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMeansDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMeansDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMeansDescription }
     * 
     * 
     */
    public List<PaymentMeansDescription> getPaymentMeansDescriptions() {
        if (paymentMeansDescriptions == null) {
            paymentMeansDescriptions = new ArrayList<PaymentMeansDescription>();
        }
        return this.paymentMeansDescriptions;
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
     * Gets the value of the paymentChannelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentChannelCode }
     *     
     */
    public PaymentChannelCode getPaymentChannelCode() {
        return paymentChannelCode;
    }

    /**
     * Sets the value of the paymentChannelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentChannelCode }
     *     
     */
    public void setPaymentChannelCode(PaymentChannelCode value) {
        this.paymentChannelCode = value;
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
     * Gets the value of the instructionNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructionNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructionNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionNote }
     * 
     * 
     */
    public List<InstructionNote> getInstructionNotes() {
        if (instructionNotes == null) {
            instructionNotes = new ArrayList<InstructionNote>();
        }
        return this.instructionNotes;
    }

    /**
     * Gets the value of the paymentIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentID }
     * 
     * 
     */
    public List<PaymentID> getPaymentIDs() {
        if (paymentIDs == null) {
            paymentIDs = new ArrayList<PaymentID>();
        }
        return this.paymentIDs;
    }

    /**
     * Gets the value of the chargeBearerCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerCode }
     *     
     */
    public ChargeBearerCode getChargeBearerCode() {
        return chargeBearerCode;
    }

    /**
     * Sets the value of the chargeBearerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerCode }
     *     
     */
    public void setChargeBearerCode(ChargeBearerCode value) {
        this.chargeBearerCode = value;
    }

    /**
     * Gets the value of the serviceLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevelCode }
     *     
     */
    public ServiceLevelCode getServiceLevelCode() {
        return serviceLevelCode;
    }

    /**
     * Sets the value of the serviceLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevelCode }
     *     
     */
    public void setServiceLevelCode(ServiceLevelCode value) {
        this.serviceLevelCode = value;
    }

    /**
     * Gets the value of the cardAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAccount }
     * 
     * 
     */
    public List<CardAccount> getCardAccounts() {
        if (cardAccounts == null) {
            cardAccounts = new ArrayList<CardAccount>();
        }
        return this.cardAccounts;
    }

    /**
     * Gets the value of the payerFinancialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getPayerFinancialAccount() {
        return payerFinancialAccount;
    }

    /**
     * Sets the value of the payerFinancialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setPayerFinancialAccount(FinancialAccountType value) {
        this.payerFinancialAccount = value;
    }

    /**
     * Gets the value of the payeeFinancialAccount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAccountType }
     *     
     */
    public FinancialAccountType getPayeeFinancialAccount() {
        return payeeFinancialAccount;
    }

    /**
     * Sets the value of the payeeFinancialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAccountType }
     *     
     */
    public void setPayeeFinancialAccount(FinancialAccountType value) {
        this.payeeFinancialAccount = value;
    }

    /**
     * Gets the value of the creditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CreditAccount }
     *     
     */
    public CreditAccount getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets the value of the creditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditAccount }
     *     
     */
    public void setCreditAccount(CreditAccount value) {
        this.creditAccount = value;
    }

    /**
     * Gets the value of the paymentMandate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMandate }
     *     
     */
    public PaymentMandate getPaymentMandate() {
        return paymentMandate;
    }

    /**
     * Sets the value of the paymentMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMandate }
     *     
     */
    public void setPaymentMandate(PaymentMandate value) {
        this.paymentMandate = value;
    }

    /**
     * Gets the value of the tradeFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link TradeFinancing }
     *     
     */
    public TradeFinancing getTradeFinancing() {
        return tradeFinancing;
    }

    /**
     * Sets the value of the tradeFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeFinancing }
     *     
     */
    public void setTradeFinancing(TradeFinancing value) {
        this.tradeFinancing = value;
    }

    /**
     * Gets the value of the remittanceDocumentDistributions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remittanceDocumentDistributions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemittanceDocumentDistributions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentDistributionType }
     * 
     * 
     */
    public List<DocumentDistributionType> getRemittanceDocumentDistributions() {
        if (remittanceDocumentDistributions == null) {
            remittanceDocumentDistributions = new ArrayList<DocumentDistributionType>();
        }
        return this.remittanceDocumentDistributions;
    }

}
