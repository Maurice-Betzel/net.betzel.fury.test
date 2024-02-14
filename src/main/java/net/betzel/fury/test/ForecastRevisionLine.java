
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
 * <p>Java class for ForecastRevisionLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastRevisionLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RevisedForecastLineID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceForecastIssueDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SourceForecastIssueTime"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdjustmentReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ForecastPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SalesItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastRevisionLineType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "notes",
    "descriptions",
    "revisedForecastLineID",
    "sourceForecastIssueDate",
    "sourceForecastIssueTime",
    "adjustmentReasonCode",
    "forecastPeriod",
    "salesItem"
})
@XmlRootElement(name = "ForecastRevisionLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ForecastRevisionLine
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
    @XmlElement(name = "RevisedForecastLineID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected RevisedForecastLineID revisedForecastLineID;
    @XmlElement(name = "SourceForecastIssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected SourceForecastIssueDate sourceForecastIssueDate;
    @XmlElement(name = "SourceForecastIssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected SourceForecastIssueTime sourceForecastIssueTime;
    @XmlElement(name = "AdjustmentReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AdjustmentReasonCode adjustmentReasonCode;
    @XmlElement(name = "ForecastPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType forecastPeriod;
    @XmlElement(name = "SalesItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected SalesItem salesItem;

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
     * Gets the value of the revisedForecastLineID property.
     * 
     * @return
     *     possible object is
     *     {@link RevisedForecastLineID }
     *     
     */
    public RevisedForecastLineID getRevisedForecastLineID() {
        return revisedForecastLineID;
    }

    /**
     * Sets the value of the revisedForecastLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevisedForecastLineID }
     *     
     */
    public void setRevisedForecastLineID(RevisedForecastLineID value) {
        this.revisedForecastLineID = value;
    }

    /**
     * Gets the value of the sourceForecastIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link SourceForecastIssueDate }
     *     
     */
    public SourceForecastIssueDate getSourceForecastIssueDate() {
        return sourceForecastIssueDate;
    }

    /**
     * Sets the value of the sourceForecastIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceForecastIssueDate }
     *     
     */
    public void setSourceForecastIssueDate(SourceForecastIssueDate value) {
        this.sourceForecastIssueDate = value;
    }

    /**
     * Gets the value of the sourceForecastIssueTime property.
     * 
     * @return
     *     possible object is
     *     {@link SourceForecastIssueTime }
     *     
     */
    public SourceForecastIssueTime getSourceForecastIssueTime() {
        return sourceForecastIssueTime;
    }

    /**
     * Sets the value of the sourceForecastIssueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceForecastIssueTime }
     *     
     */
    public void setSourceForecastIssueTime(SourceForecastIssueTime value) {
        this.sourceForecastIssueTime = value;
    }

    /**
     * Gets the value of the adjustmentReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentReasonCode }
     *     
     */
    public AdjustmentReasonCode getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Sets the value of the adjustmentReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentReasonCode }
     *     
     */
    public void setAdjustmentReasonCode(AdjustmentReasonCode value) {
        this.adjustmentReasonCode = value;
    }

    /**
     * Gets the value of the forecastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getForecastPeriod() {
        return forecastPeriod;
    }

    /**
     * Sets the value of the forecastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setForecastPeriod(PeriodType value) {
        this.forecastPeriod = value;
    }

    /**
     * Gets the value of the salesItem property.
     * 
     * @return
     *     possible object is
     *     {@link SalesItem }
     *     
     */
    public SalesItem getSalesItem() {
        return salesItem;
    }

    /**
     * Sets the value of the salesItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesItem }
     *     
     */
    public void setSalesItem(SalesItem value) {
        this.salesItem = value;
    }

}
