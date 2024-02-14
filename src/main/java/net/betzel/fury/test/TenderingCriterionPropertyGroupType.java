
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TenderingCriterionPropertyGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderingCriterionPropertyGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PropertyGroupTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FulfilmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FulfilmentIndicatorTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderingCriterionProperty" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubsidiaryTenderingCriterionPropertyGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderingCriterionPropertyGroupType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "name",
    "descriptions",
    "propertyGroupTypeCode",
    "fulfilmentIndicator",
    "fulfilmentIndicatorTypeCode",
    "tenderingCriterionProperties",
    "subsidiaryTenderingCriterionPropertyGroups"
})
public class TenderingCriterionPropertyGroupType
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
    @XmlElement(name = "PropertyGroupTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PropertyGroupTypeCode propertyGroupTypeCode;
    @XmlElement(name = "FulfilmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FulfilmentIndicator fulfilmentIndicator;
    @XmlElement(name = "FulfilmentIndicatorTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FulfilmentIndicatorTypeCode fulfilmentIndicatorTypeCode;
    @XmlElement(name = "TenderingCriterionProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<TenderingCriterionProperty> tenderingCriterionProperties;
    @XmlElement(name = "SubsidiaryTenderingCriterionPropertyGroup", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TenderingCriterionPropertyGroupType> subsidiaryTenderingCriterionPropertyGroups;

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
     * Gets the value of the propertyGroupTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyGroupTypeCode }
     *     
     */
    public PropertyGroupTypeCode getPropertyGroupTypeCode() {
        return propertyGroupTypeCode;
    }

    /**
     * Sets the value of the propertyGroupTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyGroupTypeCode }
     *     
     */
    public void setPropertyGroupTypeCode(PropertyGroupTypeCode value) {
        this.propertyGroupTypeCode = value;
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
     * Gets the value of the tenderingCriterionProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderingCriterionProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderingCriterionProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionProperty }
     * 
     * 
     */
    public List<TenderingCriterionProperty> getTenderingCriterionProperties() {
        if (tenderingCriterionProperties == null) {
            tenderingCriterionProperties = new ArrayList<TenderingCriterionProperty>();
        }
        return this.tenderingCriterionProperties;
    }

    /**
     * Gets the value of the subsidiaryTenderingCriterionPropertyGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiaryTenderingCriterionPropertyGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiaryTenderingCriterionPropertyGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderingCriterionPropertyGroupType }
     * 
     * 
     */
    public List<TenderingCriterionPropertyGroupType> getSubsidiaryTenderingCriterionPropertyGroups() {
        if (subsidiaryTenderingCriterionPropertyGroups == null) {
            subsidiaryTenderingCriterionPropertyGroups = new ArrayList<TenderingCriterionPropertyGroupType>();
        }
        return this.subsidiaryTenderingCriterionPropertyGroups;
    }

}
