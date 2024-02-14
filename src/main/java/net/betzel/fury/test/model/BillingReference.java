
package net.betzel.fury.test.model;

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
 * <p>Java class for BillingReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InvoiceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SelfBilledInvoiceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CreditNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SelfBilledCreditNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DebitNoteDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReminderDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BillingReferenceLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingReferenceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "invoiceDocumentReference",
    "selfBilledInvoiceDocumentReference",
    "creditNoteDocumentReference",
    "selfBilledCreditNoteDocumentReference",
    "debitNoteDocumentReference",
    "reminderDocumentReference",
    "additionalDocumentReference",
    "billingReferenceLines"
})
@XmlRootElement(name = "BillingReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class BillingReference
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "InvoiceDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType invoiceDocumentReference;
    @XmlElement(name = "SelfBilledInvoiceDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType selfBilledInvoiceDocumentReference;
    @XmlElement(name = "CreditNoteDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType creditNoteDocumentReference;
    @XmlElement(name = "SelfBilledCreditNoteDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType selfBilledCreditNoteDocumentReference;
    @XmlElement(name = "DebitNoteDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType debitNoteDocumentReference;
    @XmlElement(name = "ReminderDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType reminderDocumentReference;
    @XmlElement(name = "AdditionalDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType additionalDocumentReference;
    @XmlElement(name = "BillingReferenceLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<BillingReferenceLine> billingReferenceLines;

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
     * Gets the value of the invoiceDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getInvoiceDocumentReference() {
        return invoiceDocumentReference;
    }

    /**
     * Sets the value of the invoiceDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setInvoiceDocumentReference(DocumentReferenceType value) {
        this.invoiceDocumentReference = value;
    }

    /**
     * Gets the value of the selfBilledInvoiceDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getSelfBilledInvoiceDocumentReference() {
        return selfBilledInvoiceDocumentReference;
    }

    /**
     * Sets the value of the selfBilledInvoiceDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setSelfBilledInvoiceDocumentReference(DocumentReferenceType value) {
        this.selfBilledInvoiceDocumentReference = value;
    }

    /**
     * Gets the value of the creditNoteDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getCreditNoteDocumentReference() {
        return creditNoteDocumentReference;
    }

    /**
     * Sets the value of the creditNoteDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setCreditNoteDocumentReference(DocumentReferenceType value) {
        this.creditNoteDocumentReference = value;
    }

    /**
     * Gets the value of the selfBilledCreditNoteDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getSelfBilledCreditNoteDocumentReference() {
        return selfBilledCreditNoteDocumentReference;
    }

    /**
     * Sets the value of the selfBilledCreditNoteDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setSelfBilledCreditNoteDocumentReference(DocumentReferenceType value) {
        this.selfBilledCreditNoteDocumentReference = value;
    }

    /**
     * Gets the value of the debitNoteDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDebitNoteDocumentReference() {
        return debitNoteDocumentReference;
    }

    /**
     * Sets the value of the debitNoteDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDebitNoteDocumentReference(DocumentReferenceType value) {
        this.debitNoteDocumentReference = value;
    }

    /**
     * Gets the value of the reminderDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getReminderDocumentReference() {
        return reminderDocumentReference;
    }

    /**
     * Sets the value of the reminderDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setReminderDocumentReference(DocumentReferenceType value) {
        this.reminderDocumentReference = value;
    }

    /**
     * Gets the value of the additionalDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getAdditionalDocumentReference() {
        return additionalDocumentReference;
    }

    /**
     * Sets the value of the additionalDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setAdditionalDocumentReference(DocumentReferenceType value) {
        this.additionalDocumentReference = value;
    }

    /**
     * Gets the value of the billingReferenceLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billingReferenceLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillingReferenceLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingReferenceLine }
     * 
     * 
     */
    public List<BillingReferenceLine> getBillingReferenceLines() {
        if (billingReferenceLines == null) {
            billingReferenceLines = new ArrayList<BillingReferenceLine>();
        }
        return this.billingReferenceLines;
    }

}
