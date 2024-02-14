
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
 * <p>Java class for TenderedProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderedProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VariantID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalFee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxTotal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LegalMonetaryTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardingCriterionResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderedProjectType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "variantID",
    "feeAmount",
    "feeDescriptions",
    "tenderEnvelopeID",
    "tenderEnvelopeTypeCode",
    "additionalFees",
    "procurementProjectLots",
    "evidenceDocumentReferences",
    "taxTotals",
    "legalMonetaryTotal",
    "tenderLines",
    "awardingCriterionResponses"
})
public class TenderedProjectType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "VariantID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected VariantID variantID;
    @XmlElement(name = "FeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FeeAmount feeAmount;
    @XmlElement(name = "FeeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<FeeDescription> feeDescriptions;
    @XmlElement(name = "TenderEnvelopeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TenderEnvelopeID tenderEnvelopeID;
    @XmlElement(name = "TenderEnvelopeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TenderEnvelopeTypeCode tenderEnvelopeTypeCode;
    @XmlElement(name = "AdditionalFee", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<FeeType> additionalFees;
    @XmlElement(name = "ProcurementProjectLot", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ProcurementProjectLotType> procurementProjectLots;
    @XmlElement(name = "EvidenceDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> evidenceDocumentReferences;
    @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxTotalType> taxTotals;
    @XmlElement(name = "LegalMonetaryTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected MonetaryTotalType legalMonetaryTotal;
    @XmlElement(name = "TenderLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TenderLineType> tenderLines;
    @XmlElement(name = "AwardingCriterionResponse", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AwardingCriterionResponseType> awardingCriterionResponses;

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
     * Gets the value of the variantID property.
     * 
     * @return
     *     possible object is
     *     {@link VariantID }
     *     
     */
    public VariantID getVariantID() {
        return variantID;
    }

    /**
     * Sets the value of the variantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantID }
     *     
     */
    public void setVariantID(VariantID value) {
        this.variantID = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount }
     *     
     */
    public FeeAmount getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount }
     *     
     */
    public void setFeeAmount(FeeAmount value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeDescription }
     * 
     * 
     */
    public List<FeeDescription> getFeeDescriptions() {
        if (feeDescriptions == null) {
            feeDescriptions = new ArrayList<FeeDescription>();
        }
        return this.feeDescriptions;
    }

    /**
     * Gets the value of the tenderEnvelopeID property.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeID }
     *     
     */
    public TenderEnvelopeID getTenderEnvelopeID() {
        return tenderEnvelopeID;
    }

    /**
     * Sets the value of the tenderEnvelopeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeID }
     *     
     */
    public void setTenderEnvelopeID(TenderEnvelopeID value) {
        this.tenderEnvelopeID = value;
    }

    /**
     * Gets the value of the tenderEnvelopeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeTypeCode }
     *     
     */
    public TenderEnvelopeTypeCode getTenderEnvelopeTypeCode() {
        return tenderEnvelopeTypeCode;
    }

    /**
     * Sets the value of the tenderEnvelopeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeTypeCode }
     *     
     */
    public void setTenderEnvelopeTypeCode(TenderEnvelopeTypeCode value) {
        this.tenderEnvelopeTypeCode = value;
    }

    /**
     * Gets the value of the additionalFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeType }
     * 
     * 
     */
    public List<FeeType> getAdditionalFees() {
        if (additionalFees == null) {
            additionalFees = new ArrayList<FeeType>();
        }
        return this.additionalFees;
    }

    /**
     * Gets the value of the procurementProjectLots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementProjectLots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementProjectLots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementProjectLotType }
     * 
     * 
     */
    public List<ProcurementProjectLotType> getProcurementProjectLots() {
        if (procurementProjectLots == null) {
            procurementProjectLots = new ArrayList<ProcurementProjectLotType>();
        }
        return this.procurementProjectLots;
    }

    /**
     * Gets the value of the evidenceDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidenceDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidenceDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getEvidenceDocumentReferences() {
        if (evidenceDocumentReferences == null) {
            evidenceDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.evidenceDocumentReferences;
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
     * Gets the value of the legalMonetaryTotal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryTotalType }
     *     
     */
    public MonetaryTotalType getLegalMonetaryTotal() {
        return legalMonetaryTotal;
    }

    /**
     * Sets the value of the legalMonetaryTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryTotalType }
     *     
     */
    public void setLegalMonetaryTotal(MonetaryTotalType value) {
        this.legalMonetaryTotal = value;
    }

    /**
     * Gets the value of the tenderLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderLineType }
     * 
     * 
     */
    public List<TenderLineType> getTenderLines() {
        if (tenderLines == null) {
            tenderLines = new ArrayList<TenderLineType>();
        }
        return this.tenderLines;
    }

    /**
     * Gets the value of the awardingCriterionResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardingCriterionResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardingCriterionResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionResponseType }
     * 
     * 
     */
    public List<AwardingCriterionResponseType> getAwardingCriterionResponses() {
        if (awardingCriterionResponses == null) {
            awardingCriterionResponses = new ArrayList<AwardingCriterionResponseType>();
        }
        return this.awardingCriterionResponses;
    }

}
