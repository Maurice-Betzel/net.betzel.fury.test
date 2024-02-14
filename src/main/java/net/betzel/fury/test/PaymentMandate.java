
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
 * <p>Java class for PaymentMandateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMandateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MandateTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumPaymentInstructionsNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumPaidAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SignatureID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PayerFinancialAccount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentReversalPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Clause" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMandateType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "mandateTypeCode",
    "maximumPaymentInstructionsNumeric",
    "maximumPaidAmount",
    "signatureID",
    "payerParty",
    "payerFinancialAccount",
    "validityPeriod",
    "paymentReversalPeriod",
    "clauses"
})
@XmlRootElement(name = "PaymentMandate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class PaymentMandate
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "MandateTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MandateTypeCode mandateTypeCode;
    @XmlElement(name = "MaximumPaymentInstructionsNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumPaymentInstructionsNumeric maximumPaymentInstructionsNumeric;
    @XmlElement(name = "MaximumPaidAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumPaidAmount maximumPaidAmount;
    @XmlElement(name = "SignatureID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SignatureID signatureID;
    @XmlElement(name = "PayerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType payerParty;
    @XmlElement(name = "PayerFinancialAccount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected FinancialAccountType payerFinancialAccount;
    @XmlElement(name = "ValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType validityPeriod;
    @XmlElement(name = "PaymentReversalPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType paymentReversalPeriod;
    @XmlElement(name = "Clause", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ClauseType> clauses;

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
     * Gets the value of the mandateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MandateTypeCode }
     *     
     */
    public MandateTypeCode getMandateTypeCode() {
        return mandateTypeCode;
    }

    /**
     * Sets the value of the mandateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateTypeCode }
     *     
     */
    public void setMandateTypeCode(MandateTypeCode value) {
        this.mandateTypeCode = value;
    }

    /**
     * Gets the value of the maximumPaymentInstructionsNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumPaymentInstructionsNumeric }
     *     
     */
    public MaximumPaymentInstructionsNumeric getMaximumPaymentInstructionsNumeric() {
        return maximumPaymentInstructionsNumeric;
    }

    /**
     * Sets the value of the maximumPaymentInstructionsNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumPaymentInstructionsNumeric }
     *     
     */
    public void setMaximumPaymentInstructionsNumeric(MaximumPaymentInstructionsNumeric value) {
        this.maximumPaymentInstructionsNumeric = value;
    }

    /**
     * Gets the value of the maximumPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumPaidAmount }
     *     
     */
    public MaximumPaidAmount getMaximumPaidAmount() {
        return maximumPaidAmount;
    }

    /**
     * Sets the value of the maximumPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumPaidAmount }
     *     
     */
    public void setMaximumPaidAmount(MaximumPaidAmount value) {
        this.maximumPaidAmount = value;
    }

    /**
     * Gets the value of the signatureID property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureID }
     *     
     */
    public SignatureID getSignatureID() {
        return signatureID;
    }

    /**
     * Sets the value of the signatureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureID }
     *     
     */
    public void setSignatureID(SignatureID value) {
        this.signatureID = value;
    }

    /**
     * Gets the value of the payerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPayerParty() {
        return payerParty;
    }

    /**
     * Sets the value of the payerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPayerParty(PartyType value) {
        this.payerParty = value;
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

    /**
     * Gets the value of the paymentReversalPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPaymentReversalPeriod() {
        return paymentReversalPeriod;
    }

    /**
     * Sets the value of the paymentReversalPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPaymentReversalPeriod(PeriodType value) {
        this.paymentReversalPeriod = value;
    }

    /**
     * Gets the value of the clauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClauseType }
     * 
     * 
     */
    public List<ClauseType> getClauses() {
        if (clauses == null) {
            clauses = new ArrayList<ClauseType>();
        }
        return this.clauses;
    }

}
