
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
 * <p>Java class for TenderingCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderingCriterionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CriterionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FulfilmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FulfilmentIndicatorTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EvaluationMethodTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightingConsiderationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLotReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubTenderingCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Legislation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingCriterionPropertyGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingCriterionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "criterionTypeCode",
    "names",
    "descriptions",
    "weightNumeric",
    "fulfilmentIndicator",
    "fulfilmentIndicatorTypeCode",
    "evaluationMethodTypeCode",
    "weightingConsiderationDescriptions",
    "procurementProjectLotReferences",
    "commodityClassifications",
    "subTenderingCriterions",
    "legislations",
    "tenderingCriterionPropertyGroups"
})
public class TenderingCriterionType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "CriterionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CriterionTypeCode criterionTypeCode;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Name> names;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "WeightNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WeightNumeric weightNumeric;
    @XmlElement(name = "FulfilmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FulfilmentIndicator fulfilmentIndicator;
    @XmlElement(name = "FulfilmentIndicatorTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FulfilmentIndicatorTypeCode fulfilmentIndicatorTypeCode;
    @XmlElement(name = "EvaluationMethodTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EvaluationMethodTypeCode evaluationMethodTypeCode;
    @XmlElement(name = "WeightingConsiderationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<WeightingConsiderationDescription> weightingConsiderationDescriptions;
    @XmlElement(name = "ProcurementProjectLotReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ProcurementProjectLotReference> procurementProjectLotReferences;
    @XmlElement(name = "CommodityClassification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CommodityClassificationType> commodityClassifications;
    @XmlElement(name = "SubTenderingCriterion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TenderingCriterionType> subTenderingCriterions;
    @XmlElement(name = "Legislation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<Legislation> legislations;
    @XmlElement(name = "TenderingCriterionPropertyGroup", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TenderingCriterionPropertyGroupType> tenderingCriterionPropertyGroups;

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
     * Gets the value of the criterionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionTypeCode }
     *     
     */
    public CriterionTypeCode getCriterionTypeCode() {
        return criterionTypeCode;
    }

    /**
     * Sets the value of the criterionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionTypeCode }
     *     
     */
    public void setCriterionTypeCode(CriterionTypeCode value) {
        this.criterionTypeCode = value;
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
     * Gets the value of the weightNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link WeightNumeric }
     *     
     */
    public WeightNumeric getWeightNumeric() {
        return weightNumeric;
    }

    /**
     * Sets the value of the weightNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightNumeric }
     *     
     */
    public void setWeightNumeric(WeightNumeric value) {
        this.weightNumeric = value;
    }

    /**
     * Gets the value of the fulfilmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentIndicator }
     *     
     */
    public FulfilmentIndicator getFulfilmentIndicator() {
        return fulfilmentIndicator;
    }

    /**
     * Sets the value of the fulfilmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentIndicator }
     *     
     */
    public void setFulfilmentIndicator(FulfilmentIndicator value) {
        this.fulfilmentIndicator = value;
    }

    /**
     * Gets the value of the fulfilmentIndicatorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FulfilmentIndicatorTypeCode }
     *     
     */
    public FulfilmentIndicatorTypeCode getFulfilmentIndicatorTypeCode() {
        return fulfilmentIndicatorTypeCode;
    }

    /**
     * Sets the value of the fulfilmentIndicatorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfilmentIndicatorTypeCode }
     *     
     */
    public void setFulfilmentIndicatorTypeCode(FulfilmentIndicatorTypeCode value) {
        this.fulfilmentIndicatorTypeCode = value;
    }

    /**
     * Gets the value of the evaluationMethodTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationMethodTypeCode }
     *     
     */
    public EvaluationMethodTypeCode getEvaluationMethodTypeCode() {
        return evaluationMethodTypeCode;
    }

    /**
     * Sets the value of the evaluationMethodTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationMethodTypeCode }
     *     
     */
    public void setEvaluationMethodTypeCode(EvaluationMethodTypeCode value) {
        this.evaluationMethodTypeCode = value;
    }

    /**
     * Gets the value of the weightingConsiderationDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightingConsiderationDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightingConsiderationDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightingConsiderationDescription }
     * 
     * 
     */
    public List<WeightingConsiderationDescription> getWeightingConsiderationDescriptions() {
        if (weightingConsiderationDescriptions == null) {
            weightingConsiderationDescriptions = new ArrayList<WeightingConsiderationDescription>();
        }
        return this.weightingConsiderationDescriptions;
    }

    /**
     * Gets the value of the procurementProjectLotReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementProjectLotReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementProjectLotReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementProjectLotReference }
     * 
     * 
     */
    public List<ProcurementProjectLotReference> getProcurementProjectLotReferences() {
        if (procurementProjectLotReferences == null) {
            procurementProjectLotReferences = new ArrayList<ProcurementProjectLotReference>();
        }
        return this.procurementProjectLotReferences;
    }

    /**
     * Gets the value of the commodityClassifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityClassifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     * 
     * 
     */
    public List<CommodityClassificationType> getCommodityClassifications() {
        if (commodityClassifications == null) {
            commodityClassifications = new ArrayList<CommodityClassificationType>();
        }
        return this.commodityClassifications;
    }

    /**
     * Gets the value of the subTenderingCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subTenderingCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTenderingCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionType }
     * 
     * 
     */
    public List<TenderingCriterionType> getSubTenderingCriterions() {
        if (subTenderingCriterions == null) {
            subTenderingCriterions = new ArrayList<TenderingCriterionType>();
        }
        return this.subTenderingCriterions;
    }

    /**
     * Gets the value of the legislations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Legislation }
     * 
     * 
     */
    public List<Legislation> getLegislations() {
        if (legislations == null) {
            legislations = new ArrayList<Legislation>();
        }
        return this.legislations;
    }

    /**
     * Gets the value of the tenderingCriterionPropertyGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderingCriterionPropertyGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderingCriterionPropertyGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionPropertyGroupType }
     * 
     * 
     */
    public List<TenderingCriterionPropertyGroupType> getTenderingCriterionPropertyGroups() {
        if (tenderingCriterionPropertyGroups == null) {
            tenderingCriterionPropertyGroups = new ArrayList<TenderingCriterionPropertyGroupType>();
        }
        return this.tenderingCriterionPropertyGroups;
    }

}
