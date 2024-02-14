
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
 * <p>Java class for EvaluationCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvaluationCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EvaluationCriterionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThresholdQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpressionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Expression" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SuggestedEvidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluationCriterionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "evaluationCriterionTypeCode",
    "descriptions",
    "thresholdAmount",
    "thresholdQuantity",
    "expressionCode",
    "expressions",
    "durationPeriod",
    "suggestedEvidences"
})
public class EvaluationCriterionType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "EvaluationCriterionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EvaluationCriterionTypeCode evaluationCriterionTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "ThresholdAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ThresholdAmount thresholdAmount;
    @XmlElement(name = "ThresholdQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ThresholdQuantity thresholdQuantity;
    @XmlElement(name = "ExpressionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpressionCode expressionCode;
    @XmlElement(name = "Expression", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Expression> expressions;
    @XmlElement(name = "DurationPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType durationPeriod;
    @XmlElement(name = "SuggestedEvidence", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EvidenceType> suggestedEvidences;

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
     * Gets the value of the evaluationCriterionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationCriterionTypeCode }
     *     
     */
    public EvaluationCriterionTypeCode getEvaluationCriterionTypeCode() {
        return evaluationCriterionTypeCode;
    }

    /**
     * Sets the value of the evaluationCriterionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationCriterionTypeCode }
     *     
     */
    public void setEvaluationCriterionTypeCode(EvaluationCriterionTypeCode value) {
        this.evaluationCriterionTypeCode = value;
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
     * Gets the value of the thresholdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdAmount }
     *     
     */
    public ThresholdAmount getThresholdAmount() {
        return thresholdAmount;
    }

    /**
     * Sets the value of the thresholdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdAmount }
     *     
     */
    public void setThresholdAmount(ThresholdAmount value) {
        this.thresholdAmount = value;
    }

    /**
     * Gets the value of the thresholdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ThresholdQuantity }
     *     
     */
    public ThresholdQuantity getThresholdQuantity() {
        return thresholdQuantity;
    }

    /**
     * Sets the value of the thresholdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThresholdQuantity }
     *     
     */
    public void setThresholdQuantity(ThresholdQuantity value) {
        this.thresholdQuantity = value;
    }

    /**
     * Gets the value of the expressionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionCode }
     *     
     */
    public ExpressionCode getExpressionCode() {
        return expressionCode;
    }

    /**
     * Sets the value of the expressionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionCode }
     *     
     */
    public void setExpressionCode(ExpressionCode value) {
        this.expressionCode = value;
    }

    /**
     * Gets the value of the expressions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expressions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpressions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getExpressions() {
        if (expressions == null) {
            expressions = new ArrayList<Expression>();
        }
        return this.expressions;
    }

    /**
     * Gets the value of the durationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getDurationPeriod() {
        return durationPeriod;
    }

    /**
     * Sets the value of the durationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setDurationPeriod(PeriodType value) {
        this.durationPeriod = value;
    }

    /**
     * Gets the value of the suggestedEvidences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestedEvidences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestedEvidences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceType }
     * 
     * 
     */
    public List<EvidenceType> getSuggestedEvidences() {
        if (suggestedEvidences == null) {
            suggestedEvidences = new ArrayList<EvidenceType>();
        }
        return this.suggestedEvidences;
    }

}
