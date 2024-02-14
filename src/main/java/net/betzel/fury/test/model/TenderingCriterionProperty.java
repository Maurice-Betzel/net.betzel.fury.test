
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
 * <p>Java class for TenderingCriterionPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderingCriterionPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueDataTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueUnitCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValueCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedValueNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumValueNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumValueNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TranslationTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CertificationLevelDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CopyQualityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicablePeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TemplateEvidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingCriterionPropertyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "name",
    "descriptions",
    "typeCode",
    "valueDataTypeCode",
    "valueUnitCode",
    "valueCurrencyCode",
    "expectedAmount",
    "expectedID",
    "expectedIndicator",
    "expectedCode",
    "expectedValueNumeric",
    "expectedDescription",
    "expectedURI",
    "maximumAmount",
    "minimumAmount",
    "maximumValueNumeric",
    "minimumValueNumeric",
    "maximumQuantity",
    "minimumQuantity",
    "translationTypeCode",
    "certificationLevelDescriptions",
    "copyQualityTypeCode",
    "applicablePeriods",
    "templateEvidences"
})
@XmlRootElement(name = "TenderingCriterionProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TenderingCriterionProperty
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
    protected Name name;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "TypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TypeCode typeCode;
    @XmlElement(name = "ValueDataTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValueDataTypeCode valueDataTypeCode;
    @XmlElement(name = "ValueUnitCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValueUnitCode valueUnitCode;
    @XmlElement(name = "ValueCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValueCurrencyCode valueCurrencyCode;
    @XmlElement(name = "ExpectedAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedAmount expectedAmount;
    @XmlElement(name = "ExpectedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedID expectedID;
    @XmlElement(name = "ExpectedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedIndicator expectedIndicator;
    @XmlElement(name = "ExpectedCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedCode expectedCode;
    @XmlElement(name = "ExpectedValueNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedValueNumeric expectedValueNumeric;
    @XmlElement(name = "ExpectedDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedDescription expectedDescription;
    @XmlElement(name = "ExpectedURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedURI expectedURI;
    @XmlElement(name = "MaximumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumAmount maximumAmount;
    @XmlElement(name = "MinimumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumAmount minimumAmount;
    @XmlElement(name = "MaximumValueNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumValueNumeric maximumValueNumeric;
    @XmlElement(name = "MinimumValueNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumValueNumeric minimumValueNumeric;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumQuantity maximumQuantity;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumQuantity minimumQuantity;
    @XmlElement(name = "TranslationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TranslationTypeCode translationTypeCode;
    @XmlElement(name = "CertificationLevelDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<CertificationLevelDescription> certificationLevelDescriptions;
    @XmlElement(name = "CopyQualityTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CopyQualityTypeCode copyQualityTypeCode;
    @XmlElement(name = "ApplicablePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PeriodType> applicablePeriods;
    @XmlElement(name = "TemplateEvidence", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EvidenceType> templateEvidences;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
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
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCode }
     *     
     */
    public TypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCode }
     *     
     */
    public void setTypeCode(TypeCode value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the valueDataTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ValueDataTypeCode }
     *     
     */
    public ValueDataTypeCode getValueDataTypeCode() {
        return valueDataTypeCode;
    }

    /**
     * Sets the value of the valueDataTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueDataTypeCode }
     *     
     */
    public void setValueDataTypeCode(ValueDataTypeCode value) {
        this.valueDataTypeCode = value;
    }

    /**
     * Gets the value of the valueUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link ValueUnitCode }
     *     
     */
    public ValueUnitCode getValueUnitCode() {
        return valueUnitCode;
    }

    /**
     * Sets the value of the valueUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueUnitCode }
     *     
     */
    public void setValueUnitCode(ValueUnitCode value) {
        this.valueUnitCode = value;
    }

    /**
     * Gets the value of the valueCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link ValueCurrencyCode }
     *     
     */
    public ValueCurrencyCode getValueCurrencyCode() {
        return valueCurrencyCode;
    }

    /**
     * Sets the value of the valueCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueCurrencyCode }
     *     
     */
    public void setValueCurrencyCode(ValueCurrencyCode value) {
        this.valueCurrencyCode = value;
    }

    /**
     * Gets the value of the expectedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedAmount }
     *     
     */
    public ExpectedAmount getExpectedAmount() {
        return expectedAmount;
    }

    /**
     * Sets the value of the expectedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedAmount }
     *     
     */
    public void setExpectedAmount(ExpectedAmount value) {
        this.expectedAmount = value;
    }

    /**
     * Gets the value of the expectedID property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedID }
     *     
     */
    public ExpectedID getExpectedID() {
        return expectedID;
    }

    /**
     * Sets the value of the expectedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedID }
     *     
     */
    public void setExpectedID(ExpectedID value) {
        this.expectedID = value;
    }

    /**
     * Gets the value of the expectedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedIndicator }
     *     
     */
    public ExpectedIndicator getExpectedIndicator() {
        return expectedIndicator;
    }

    /**
     * Sets the value of the expectedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedIndicator }
     *     
     */
    public void setExpectedIndicator(ExpectedIndicator value) {
        this.expectedIndicator = value;
    }

    /**
     * Gets the value of the expectedCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCode }
     *     
     */
    public ExpectedCode getExpectedCode() {
        return expectedCode;
    }

    /**
     * Sets the value of the expectedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCode }
     *     
     */
    public void setExpectedCode(ExpectedCode value) {
        this.expectedCode = value;
    }

    /**
     * Gets the value of the expectedValueNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedValueNumeric }
     *     
     */
    public ExpectedValueNumeric getExpectedValueNumeric() {
        return expectedValueNumeric;
    }

    /**
     * Sets the value of the expectedValueNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedValueNumeric }
     *     
     */
    public void setExpectedValueNumeric(ExpectedValueNumeric value) {
        this.expectedValueNumeric = value;
    }

    /**
     * Gets the value of the expectedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedDescription }
     *     
     */
    public ExpectedDescription getExpectedDescription() {
        return expectedDescription;
    }

    /**
     * Sets the value of the expectedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedDescription }
     *     
     */
    public void setExpectedDescription(ExpectedDescription value) {
        this.expectedDescription = value;
    }

    /**
     * Gets the value of the expectedURI property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedURI }
     *     
     */
    public ExpectedURI getExpectedURI() {
        return expectedURI;
    }

    /**
     * Sets the value of the expectedURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedURI }
     *     
     */
    public void setExpectedURI(ExpectedURI value) {
        this.expectedURI = value;
    }

    /**
     * Gets the value of the maximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAmount }
     *     
     */
    public MaximumAmount getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAmount }
     *     
     */
    public void setMaximumAmount(MaximumAmount value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the minimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAmount }
     *     
     */
    public MinimumAmount getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAmount }
     *     
     */
    public void setMinimumAmount(MinimumAmount value) {
        this.minimumAmount = value;
    }

    /**
     * Gets the value of the maximumValueNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumValueNumeric }
     *     
     */
    public MaximumValueNumeric getMaximumValueNumeric() {
        return maximumValueNumeric;
    }

    /**
     * Sets the value of the maximumValueNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumValueNumeric }
     *     
     */
    public void setMaximumValueNumeric(MaximumValueNumeric value) {
        this.maximumValueNumeric = value;
    }

    /**
     * Gets the value of the minimumValueNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumValueNumeric }
     *     
     */
    public MinimumValueNumeric getMinimumValueNumeric() {
        return minimumValueNumeric;
    }

    /**
     * Sets the value of the minimumValueNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumValueNumeric }
     *     
     */
    public void setMinimumValueNumeric(MinimumValueNumeric value) {
        this.minimumValueNumeric = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumQuantity }
     *     
     */
    public MaximumQuantity getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumQuantity }
     *     
     */
    public void setMaximumQuantity(MaximumQuantity value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumQuantity }
     *     
     */
    public MinimumQuantity getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumQuantity }
     *     
     */
    public void setMinimumQuantity(MinimumQuantity value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the translationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TranslationTypeCode }
     *     
     */
    public TranslationTypeCode getTranslationTypeCode() {
        return translationTypeCode;
    }

    /**
     * Sets the value of the translationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranslationTypeCode }
     *     
     */
    public void setTranslationTypeCode(TranslationTypeCode value) {
        this.translationTypeCode = value;
    }

    /**
     * Gets the value of the certificationLevelDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificationLevelDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificationLevelDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificationLevelDescription }
     * 
     * 
     */
    public List<CertificationLevelDescription> getCertificationLevelDescriptions() {
        if (certificationLevelDescriptions == null) {
            certificationLevelDescriptions = new ArrayList<CertificationLevelDescription>();
        }
        return this.certificationLevelDescriptions;
    }

    /**
     * Gets the value of the copyQualityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CopyQualityTypeCode }
     *     
     */
    public CopyQualityTypeCode getCopyQualityTypeCode() {
        return copyQualityTypeCode;
    }

    /**
     * Sets the value of the copyQualityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyQualityTypeCode }
     *     
     */
    public void setCopyQualityTypeCode(CopyQualityTypeCode value) {
        this.copyQualityTypeCode = value;
    }

    /**
     * Gets the value of the applicablePeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicablePeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicablePeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getApplicablePeriods() {
        if (applicablePeriods == null) {
            applicablePeriods = new ArrayList<PeriodType>();
        }
        return this.applicablePeriods;
    }

    /**
     * Gets the value of the templateEvidences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateEvidences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateEvidences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceType }
     * 
     * 
     */
    public List<EvidenceType> getTemplateEvidences() {
        if (templateEvidences == null) {
            templateEvidences = new ArrayList<EvidenceType>();
        }
        return this.templateEvidences;
    }

}
