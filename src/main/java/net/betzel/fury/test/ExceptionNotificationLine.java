
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
 * <p>Java class for ExceptionNotificationLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExceptionNotificationLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExceptionStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CollaborationPriorityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparedValueMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceValueMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VarianceQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SupplyChainActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerformanceMetricTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExceptionObservationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastException" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExceptionNotificationLineType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "notes",
    "descriptions",
    "exceptionStatusCode",
    "collaborationPriorityCode",
    "resolutionCode",
    "comparedValueMeasure",
    "sourceValueMeasure",
    "varianceQuantity",
    "supplyChainActivityTypeCode",
    "performanceMetricTypeCode",
    "exceptionObservationPeriod",
    "documentReferences",
    "forecastException",
    "supplyItem"
})
@XmlRootElement(name = "ExceptionNotificationLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ExceptionNotificationLine
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ID id;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "ExceptionStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExceptionStatusCode exceptionStatusCode;
    @XmlElement(name = "CollaborationPriorityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CollaborationPriorityCode collaborationPriorityCode;
    @XmlElement(name = "ResolutionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResolutionCode resolutionCode;
    @XmlElement(name = "ComparedValueMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ComparedValueMeasure comparedValueMeasure;
    @XmlElement(name = "SourceValueMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected SourceValueMeasure sourceValueMeasure;
    @XmlElement(name = "VarianceQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected VarianceQuantity varianceQuantity;
    @XmlElement(name = "SupplyChainActivityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SupplyChainActivityTypeCode supplyChainActivityTypeCode;
    @XmlElement(name = "PerformanceMetricTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PerformanceMetricTypeCode performanceMetricTypeCode;
    @XmlElement(name = "ExceptionObservationPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType exceptionObservationPeriod;
    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "ForecastException", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ForecastException forecastException;
    @XmlElement(name = "SupplyItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected ItemType supplyItem;

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
     * Gets the value of the exceptionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionStatusCode }
     *     
     */
    public ExceptionStatusCode getExceptionStatusCode() {
        return exceptionStatusCode;
    }

    /**
     * Sets the value of the exceptionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionStatusCode }
     *     
     */
    public void setExceptionStatusCode(ExceptionStatusCode value) {
        this.exceptionStatusCode = value;
    }

    /**
     * Gets the value of the collaborationPriorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborationPriorityCode }
     *     
     */
    public CollaborationPriorityCode getCollaborationPriorityCode() {
        return collaborationPriorityCode;
    }

    /**
     * Sets the value of the collaborationPriorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborationPriorityCode }
     *     
     */
    public void setCollaborationPriorityCode(CollaborationPriorityCode value) {
        this.collaborationPriorityCode = value;
    }

    /**
     * Gets the value of the resolutionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionCode }
     *     
     */
    public ResolutionCode getResolutionCode() {
        return resolutionCode;
    }

    /**
     * Sets the value of the resolutionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionCode }
     *     
     */
    public void setResolutionCode(ResolutionCode value) {
        this.resolutionCode = value;
    }

    /**
     * Gets the value of the comparedValueMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ComparedValueMeasure }
     *     
     */
    public ComparedValueMeasure getComparedValueMeasure() {
        return comparedValueMeasure;
    }

    /**
     * Sets the value of the comparedValueMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparedValueMeasure }
     *     
     */
    public void setComparedValueMeasure(ComparedValueMeasure value) {
        this.comparedValueMeasure = value;
    }

    /**
     * Gets the value of the sourceValueMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link SourceValueMeasure }
     *     
     */
    public SourceValueMeasure getSourceValueMeasure() {
        return sourceValueMeasure;
    }

    /**
     * Sets the value of the sourceValueMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceValueMeasure }
     *     
     */
    public void setSourceValueMeasure(SourceValueMeasure value) {
        this.sourceValueMeasure = value;
    }

    /**
     * Gets the value of the varianceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link VarianceQuantity }
     *     
     */
    public VarianceQuantity getVarianceQuantity() {
        return varianceQuantity;
    }

    /**
     * Sets the value of the varianceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceQuantity }
     *     
     */
    public void setVarianceQuantity(VarianceQuantity value) {
        this.varianceQuantity = value;
    }

    /**
     * Gets the value of the supplyChainActivityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyChainActivityTypeCode }
     *     
     */
    public SupplyChainActivityTypeCode getSupplyChainActivityTypeCode() {
        return supplyChainActivityTypeCode;
    }

    /**
     * Sets the value of the supplyChainActivityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyChainActivityTypeCode }
     *     
     */
    public void setSupplyChainActivityTypeCode(SupplyChainActivityTypeCode value) {
        this.supplyChainActivityTypeCode = value;
    }

    /**
     * Gets the value of the performanceMetricTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceMetricTypeCode }
     *     
     */
    public PerformanceMetricTypeCode getPerformanceMetricTypeCode() {
        return performanceMetricTypeCode;
    }

    /**
     * Sets the value of the performanceMetricTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceMetricTypeCode }
     *     
     */
    public void setPerformanceMetricTypeCode(PerformanceMetricTypeCode value) {
        this.performanceMetricTypeCode = value;
    }

    /**
     * Gets the value of the exceptionObservationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getExceptionObservationPeriod() {
        return exceptionObservationPeriod;
    }

    /**
     * Sets the value of the exceptionObservationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setExceptionObservationPeriod(PeriodType value) {
        this.exceptionObservationPeriod = value;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReferences;
    }

    /**
     * Gets the value of the forecastException property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastException }
     *     
     */
    public ForecastException getForecastException() {
        return forecastException;
    }

    /**
     * Sets the value of the forecastException property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastException }
     *     
     */
    public void setForecastException(ForecastException value) {
        this.forecastException = value;
    }

    /**
     * Gets the value of the supplyItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getSupplyItem() {
        return supplyItem;
    }

    /**
     * Sets the value of the supplyItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setSupplyItem(ItemType value) {
        this.supplyItem = value;
    }

}
