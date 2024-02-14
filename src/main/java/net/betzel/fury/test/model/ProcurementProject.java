
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
 * <p>Java class for ProcurementProjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcurementProjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcurementTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProcurementSubTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}QualityControlCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequiredFeeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RequestedDeliveryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedOverallContractQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SMESuitableIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementAdditionalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestedTenderTotal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalCommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RealizedLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlannedPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractExtension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RequestForTenderLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcurementProjectType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "names",
    "descriptions",
    "procurementTypeCode",
    "procurementSubTypeCode",
    "qualityControlCode",
    "requiredFeeAmount",
    "feeDescriptions",
    "requestedDeliveryDate",
    "estimatedOverallContractQuantity",
    "notes",
    "smeSuitableIndicator",
    "procurementAdditionalTypes",
    "requestedTenderTotal",
    "mainCommodityClassifications",
    "additionalCommodityClassifications",
    "realizedLocations",
    "plannedPeriod",
    "contractExtension",
    "requestForTenderLines"
})
@XmlRootElement(name = "ProcurementProject", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ProcurementProject
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Name> names;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "ProcurementTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ProcurementTypeCode procurementTypeCode;
    @XmlElement(name = "ProcurementSubTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ProcurementSubTypeCode procurementSubTypeCode;
    @XmlElement(name = "QualityControlCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected QualityControlCode qualityControlCode;
    @XmlElement(name = "RequiredFeeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequiredFeeAmount requiredFeeAmount;
    @XmlElement(name = "FeeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<FeeDescription> feeDescriptions;
    @XmlElement(name = "RequestedDeliveryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RequestedDeliveryDate requestedDeliveryDate;
    @XmlElement(name = "EstimatedOverallContractQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedOverallContractQuantity estimatedOverallContractQuantity;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "SMESuitableIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SMESuitableIndicator smeSuitableIndicator;
    @XmlElement(name = "ProcurementAdditionalType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ProcurementAdditionalType> procurementAdditionalTypes;
    @XmlElement(name = "RequestedTenderTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected RequestedTenderTotal requestedTenderTotal;
    @XmlElement(name = "MainCommodityClassification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CommodityClassificationType> mainCommodityClassifications;
    @XmlElement(name = "AdditionalCommodityClassification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CommodityClassificationType> additionalCommodityClassifications;
    @XmlElement(name = "RealizedLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LocationType> realizedLocations;
    @XmlElement(name = "PlannedPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType plannedPeriod;
    @XmlElement(name = "ContractExtension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContractExtension contractExtension;
    @XmlElement(name = "RequestForTenderLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<RequestForTenderLineType> requestForTenderLines;

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
     * Gets the value of the names property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the names property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Name }
     * 
     * 
     */
    public List<Name> getNames() {
        if (names == null) {
            names = new ArrayList<Name>();
        }
        return this.names;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the procurementTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementTypeCode }
     *     
     */
    public ProcurementTypeCode getProcurementTypeCode() {
        return procurementTypeCode;
    }

    /**
     * Sets the value of the procurementTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementTypeCode }
     *     
     */
    public void setProcurementTypeCode(ProcurementTypeCode value) {
        this.procurementTypeCode = value;
    }

    /**
     * Gets the value of the procurementSubTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementSubTypeCode }
     *     
     */
    public ProcurementSubTypeCode getProcurementSubTypeCode() {
        return procurementSubTypeCode;
    }

    /**
     * Sets the value of the procurementSubTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementSubTypeCode }
     *     
     */
    public void setProcurementSubTypeCode(ProcurementSubTypeCode value) {
        this.procurementSubTypeCode = value;
    }

    /**
     * Gets the value of the qualityControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link QualityControlCode }
     *     
     */
    public QualityControlCode getQualityControlCode() {
        return qualityControlCode;
    }

    /**
     * Sets the value of the qualityControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityControlCode }
     *     
     */
    public void setQualityControlCode(QualityControlCode value) {
        this.qualityControlCode = value;
    }

    /**
     * Gets the value of the requiredFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredFeeAmount }
     *     
     */
    public RequiredFeeAmount getRequiredFeeAmount() {
        return requiredFeeAmount;
    }

    /**
     * Sets the value of the requiredFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredFeeAmount }
     *     
     */
    public void setRequiredFeeAmount(RequiredFeeAmount value) {
        this.requiredFeeAmount = value;
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
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedDeliveryDate }
     *     
     */
    public RequestedDeliveryDate getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedDeliveryDate }
     *     
     */
    public void setRequestedDeliveryDate(RequestedDeliveryDate value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Gets the value of the estimatedOverallContractQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedOverallContractQuantity }
     *     
     */
    public EstimatedOverallContractQuantity getEstimatedOverallContractQuantity() {
        return estimatedOverallContractQuantity;
    }

    /**
     * Sets the value of the estimatedOverallContractQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedOverallContractQuantity }
     *     
     */
    public void setEstimatedOverallContractQuantity(EstimatedOverallContractQuantity value) {
        this.estimatedOverallContractQuantity = value;
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
     * Gets the value of the smeSuitableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SMESuitableIndicator }
     *     
     */
    public SMESuitableIndicator getSMESuitableIndicator() {
        return smeSuitableIndicator;
    }

    /**
     * Sets the value of the smeSuitableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMESuitableIndicator }
     *     
     */
    public void setSMESuitableIndicator(SMESuitableIndicator value) {
        this.smeSuitableIndicator = value;
    }

    /**
     * Gets the value of the procurementAdditionalTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementAdditionalTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementAdditionalTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementAdditionalType }
     * 
     * 
     */
    public List<ProcurementAdditionalType> getProcurementAdditionalTypes() {
        if (procurementAdditionalTypes == null) {
            procurementAdditionalTypes = new ArrayList<ProcurementAdditionalType>();
        }
        return this.procurementAdditionalTypes;
    }

    /**
     * Gets the value of the requestedTenderTotal property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedTenderTotal }
     *     
     */
    public RequestedTenderTotal getRequestedTenderTotal() {
        return requestedTenderTotal;
    }

    /**
     * Sets the value of the requestedTenderTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedTenderTotal }
     *     
     */
    public void setRequestedTenderTotal(RequestedTenderTotal value) {
        this.requestedTenderTotal = value;
    }

    /**
     * Gets the value of the mainCommodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainCommodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getMainCommodityClassifications() {
        if (mainCommodityClassifications == null) {
            mainCommodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.mainCommodityClassifications;
    }

    /**
     * Gets the value of the additionalCommodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCommodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getAdditionalCommodityClassifications() {
        if (additionalCommodityClassifications == null) {
            additionalCommodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.additionalCommodityClassifications;
    }

    /**
     * Gets the value of the realizedLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realizedLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealizedLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getRealizedLocations() {
        if (realizedLocations == null) {
            realizedLocations = new ArrayList<LocationType>();
        }
        return this.realizedLocations;
    }

    /**
     * Gets the value of the plannedPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPlannedPeriod() {
        return plannedPeriod;
    }

    /**
     * Sets the value of the plannedPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPlannedPeriod(PeriodType value) {
        this.plannedPeriod = value;
    }

    /**
     * Gets the value of the contractExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ContractExtension }
     *     
     */
    public ContractExtension getContractExtension() {
        return contractExtension;
    }

    /**
     * Sets the value of the contractExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractExtension }
     *     
     */
    public void setContractExtension(ContractExtension value) {
        this.contractExtension = value;
    }

    /**
     * Gets the value of the requestForTenderLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestForTenderLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestForTenderLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestForTenderLineType }
     * 
     * 
     */
    public List<RequestForTenderLineType> getRequestForTenderLines() {
        if (requestForTenderLines == null) {
            requestForTenderLines = new ArrayList<RequestForTenderLineType>();
        }
        return this.requestForTenderLines;
    }

}
