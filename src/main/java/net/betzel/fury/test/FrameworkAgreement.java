
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
 * <p>Java class for FrameworkAgreementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrameworkAgreementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedOperatorQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumOperatorQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Justification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Frequency" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedMaximumValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DurationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubsequentProcessTenderRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameworkAgreementType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "expectedOperatorQuantity",
    "maximumOperatorQuantity",
    "justifications",
    "frequencies",
    "estimatedMaximumValueAmount",
    "maximumValueAmount",
    "durationPeriod",
    "subsequentProcessTenderRequirements"
})
@XmlRootElement(name = "FrameworkAgreement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class FrameworkAgreement
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ExpectedOperatorQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedOperatorQuantity expectedOperatorQuantity;
    @XmlElement(name = "MaximumOperatorQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumOperatorQuantity maximumOperatorQuantity;
    @XmlElement(name = "Justification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Justification> justifications;
    @XmlElement(name = "Frequency", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Frequency> frequencies;
    @XmlElement(name = "EstimatedMaximumValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedMaximumValueAmount estimatedMaximumValueAmount;
    @XmlElement(name = "MaximumValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumValueAmount maximumValueAmount;
    @XmlElement(name = "DurationPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType durationPeriod;
    @XmlElement(name = "SubsequentProcessTenderRequirement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TenderRequirementType> subsequentProcessTenderRequirements;

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
     * Gets the value of the expectedOperatorQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedOperatorQuantity }
     *     
     */
    public ExpectedOperatorQuantity getExpectedOperatorQuantity() {
        return expectedOperatorQuantity;
    }

    /**
     * Sets the value of the expectedOperatorQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedOperatorQuantity }
     *     
     */
    public void setExpectedOperatorQuantity(ExpectedOperatorQuantity value) {
        this.expectedOperatorQuantity = value;
    }

    /**
     * Gets the value of the maximumOperatorQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumOperatorQuantity }
     *     
     */
    public MaximumOperatorQuantity getMaximumOperatorQuantity() {
        return maximumOperatorQuantity;
    }

    /**
     * Sets the value of the maximumOperatorQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumOperatorQuantity }
     *     
     */
    public void setMaximumOperatorQuantity(MaximumOperatorQuantity value) {
        this.maximumOperatorQuantity = value;
    }

    /**
     * Gets the value of the justifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Justification }
     * 
     * 
     */
    public List<Justification> getJustifications() {
        if (justifications == null) {
            justifications = new ArrayList<Justification>();
        }
        return this.justifications;
    }

    /**
     * Gets the value of the frequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Frequency }
     * 
     * 
     */
    public List<Frequency> getFrequencies() {
        if (frequencies == null) {
            frequencies = new ArrayList<Frequency>();
        }
        return this.frequencies;
    }

    /**
     * Gets the value of the estimatedMaximumValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedMaximumValueAmount }
     *     
     */
    public EstimatedMaximumValueAmount getEstimatedMaximumValueAmount() {
        return estimatedMaximumValueAmount;
    }

    /**
     * Sets the value of the estimatedMaximumValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedMaximumValueAmount }
     *     
     */
    public void setEstimatedMaximumValueAmount(EstimatedMaximumValueAmount value) {
        this.estimatedMaximumValueAmount = value;
    }

    /**
     * Gets the value of the maximumValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumValueAmount }
     *     
     */
    public MaximumValueAmount getMaximumValueAmount() {
        return maximumValueAmount;
    }

    /**
     * Sets the value of the maximumValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumValueAmount }
     *     
     */
    public void setMaximumValueAmount(MaximumValueAmount value) {
        this.maximumValueAmount = value;
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
     * Gets the value of the subsequentProcessTenderRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsequentProcessTenderRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsequentProcessTenderRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderRequirementType }
     * 
     * 
     */
    public List<TenderRequirementType> getSubsequentProcessTenderRequirements() {
        if (subsequentProcessTenderRequirements == null) {
            subsequentProcessTenderRequirements = new ArrayList<TenderRequirementType>();
        }
        return this.subsequentProcessTenderRequirements;
    }

}
