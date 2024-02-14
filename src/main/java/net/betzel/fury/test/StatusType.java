
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
 * <p>Java class for StatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConditionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReferenceTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StatusReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StatusReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SequenceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IndicationIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReliabilityPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Condition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "conditionCode",
    "referenceDate",
    "referenceTime",
    "descriptions",
    "statusReasonCode",
    "statusReasons",
    "sequenceID",
    "texts",
    "indicationIndicator",
    "percent",
    "reliabilityPercent",
    "subStatuses",
    "conditions"
})
public class StatusType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ConditionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConditionCode conditionCode;
    @XmlElement(name = "ReferenceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReferenceDate referenceDate;
    @XmlElement(name = "ReferenceTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReferenceTime referenceTime;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "StatusReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected StatusReasonCode statusReasonCode;
    @XmlElement(name = "StatusReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<StatusReason> statusReasons;
    @XmlElement(name = "SequenceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SequenceID sequenceID;
    @XmlElement(name = "Text", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Text> texts;
    @XmlElement(name = "IndicationIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IndicationIndicator indicationIndicator;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Percent percent;
    @XmlElement(name = "ReliabilityPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReliabilityPercent reliabilityPercent;
    @XmlElement(name = "SubStatus", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<StatusType> subStatuses;
    @XmlElement(name = "Condition", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<Condition> conditions;

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
     * Gets the value of the conditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionCode }
     *     
     */
    public ConditionCode getConditionCode() {
        return conditionCode;
    }

    /**
     * Sets the value of the conditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionCode }
     *     
     */
    public void setConditionCode(ConditionCode value) {
        this.conditionCode = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceDate }
     *     
     */
    public ReferenceDate getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceDate }
     *     
     */
    public void setReferenceDate(ReferenceDate value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the referenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTime }
     *     
     */
    public ReferenceTime getReferenceTime() {
        return referenceTime;
    }

    /**
     * Sets the value of the referenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTime }
     *     
     */
    public void setReferenceTime(ReferenceTime value) {
        this.referenceTime = value;
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
     * Gets the value of the statusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonCode }
     *     
     */
    public StatusReasonCode getStatusReasonCode() {
        return statusReasonCode;
    }

    /**
     * Sets the value of the statusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonCode }
     *     
     */
    public void setStatusReasonCode(StatusReasonCode value) {
        this.statusReasonCode = value;
    }

    /**
     * Gets the value of the statusReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReason }
     * 
     * 
     */
    public List<StatusReason> getStatusReasons() {
        if (statusReasons == null) {
            statusReasons = new ArrayList<StatusReason>();
        }
        return this.statusReasons;
    }

    /**
     * Gets the value of the sequenceID property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceID }
     *     
     */
    public SequenceID getSequenceID() {
        return sequenceID;
    }

    /**
     * Sets the value of the sequenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceID }
     *     
     */
    public void setSequenceID(SequenceID value) {
        this.sequenceID = value;
    }

    /**
     * Gets the value of the texts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the texts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Text }
     * 
     * 
     */
    public List<Text> getTexts() {
        if (texts == null) {
            texts = new ArrayList<Text>();
        }
        return this.texts;
    }

    /**
     * Gets the value of the indicationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicationIndicator }
     *     
     */
    public IndicationIndicator getIndicationIndicator() {
        return indicationIndicator;
    }

    /**
     * Sets the value of the indicationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationIndicator }
     *     
     */
    public void setIndicationIndicator(IndicationIndicator value) {
        this.indicationIndicator = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Percent }
     *     
     */
    public Percent getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Percent }
     *     
     */
    public void setPercent(Percent value) {
        this.percent = value;
    }

    /**
     * Gets the value of the reliabilityPercent property.
     * 
     * @return
     *     possible object is
     *     {@link ReliabilityPercent }
     *     
     */
    public ReliabilityPercent getReliabilityPercent() {
        return reliabilityPercent;
    }

    /**
     * Sets the value of the reliabilityPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliabilityPercent }
     *     
     */
    public void setReliabilityPercent(ReliabilityPercent value) {
        this.reliabilityPercent = value;
    }

    /**
     * Gets the value of the subStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getSubStatuses() {
        if (subStatuses == null) {
            subStatuses = new ArrayList<StatusType>();
        }
        return this.subStatuses;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Condition }
     * 
     * 
     */
    public List<Condition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<Condition>();
        }
        return this.conditions;
    }

}
