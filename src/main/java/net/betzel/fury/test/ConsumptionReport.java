
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
 * <p>Java class for ConsumptionReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalConsumedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BasicConsumedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidentOccupantsNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumersEnergyLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumersEnergyLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResidenceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HeatingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HeatingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GuidanceDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionReportReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConsumptionHistory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionReportType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "consumptionType",
    "consumptionTypeCode",
    "descriptions",
    "totalConsumedQuantity",
    "basicConsumedQuantity",
    "residentOccupantsNumeric",
    "consumersEnergyLevelCode",
    "consumersEnergyLevel",
    "residenceType",
    "residenceTypeCode",
    "heatingType",
    "heatingTypeCode",
    "period",
    "guidanceDocumentReference",
    "documentReference",
    "consumptionReportReferences",
    "consumptionHistories"
})
@XmlRootElement(name = "ConsumptionReport", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ConsumptionReport
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
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionTypeCode consumptionTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "TotalConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalConsumedQuantity totalConsumedQuantity;
    @XmlElement(name = "BasicConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BasicConsumedQuantity basicConsumedQuantity;
    @XmlElement(name = "ResidentOccupantsNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResidentOccupantsNumeric residentOccupantsNumeric;
    @XmlElement(name = "ConsumersEnergyLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumersEnergyLevelCode consumersEnergyLevelCode;
    @XmlElement(name = "ConsumersEnergyLevel", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumersEnergyLevel consumersEnergyLevel;
    @XmlElement(name = "ResidenceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResidenceType residenceType;
    @XmlElement(name = "ResidenceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResidenceTypeCode residenceTypeCode;
    @XmlElement(name = "HeatingType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HeatingType heatingType;
    @XmlElement(name = "HeatingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HeatingTypeCode heatingTypeCode;
    @XmlElement(name = "Period", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType period;
    @XmlElement(name = "GuidanceDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType guidanceDocumentReference;
    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType documentReference;
    @XmlElement(name = "ConsumptionReportReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ConsumptionReportReference> consumptionReportReferences;
    @XmlElement(name = "ConsumptionHistory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ConsumptionHistory> consumptionHistories;

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
     * Gets the value of the consumptionType property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionType }
     *     
     */
    public ConsumptionType getConsumptionType() {
        return consumptionType;
    }

    /**
     * Sets the value of the consumptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionType }
     *     
     */
    public void setConsumptionType(ConsumptionType value) {
        this.consumptionType = value;
    }

    /**
     * Gets the value of the consumptionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionTypeCode }
     *     
     */
    public ConsumptionTypeCode getConsumptionTypeCode() {
        return consumptionTypeCode;
    }

    /**
     * Sets the value of the consumptionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionTypeCode }
     *     
     */
    public void setConsumptionTypeCode(ConsumptionTypeCode value) {
        this.consumptionTypeCode = value;
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
     * Gets the value of the totalConsumedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalConsumedQuantity }
     *     
     */
    public TotalConsumedQuantity getTotalConsumedQuantity() {
        return totalConsumedQuantity;
    }

    /**
     * Sets the value of the totalConsumedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalConsumedQuantity }
     *     
     */
    public void setTotalConsumedQuantity(TotalConsumedQuantity value) {
        this.totalConsumedQuantity = value;
    }

    /**
     * Gets the value of the basicConsumedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BasicConsumedQuantity }
     *     
     */
    public BasicConsumedQuantity getBasicConsumedQuantity() {
        return basicConsumedQuantity;
    }

    /**
     * Sets the value of the basicConsumedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicConsumedQuantity }
     *     
     */
    public void setBasicConsumedQuantity(BasicConsumedQuantity value) {
        this.basicConsumedQuantity = value;
    }

    /**
     * Gets the value of the residentOccupantsNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link ResidentOccupantsNumeric }
     *     
     */
    public ResidentOccupantsNumeric getResidentOccupantsNumeric() {
        return residentOccupantsNumeric;
    }

    /**
     * Sets the value of the residentOccupantsNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidentOccupantsNumeric }
     *     
     */
    public void setResidentOccupantsNumeric(ResidentOccupantsNumeric value) {
        this.residentOccupantsNumeric = value;
    }

    /**
     * Gets the value of the consumersEnergyLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumersEnergyLevelCode }
     *     
     */
    public ConsumersEnergyLevelCode getConsumersEnergyLevelCode() {
        return consumersEnergyLevelCode;
    }

    /**
     * Sets the value of the consumersEnergyLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumersEnergyLevelCode }
     *     
     */
    public void setConsumersEnergyLevelCode(ConsumersEnergyLevelCode value) {
        this.consumersEnergyLevelCode = value;
    }

    /**
     * Gets the value of the consumersEnergyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumersEnergyLevel }
     *     
     */
    public ConsumersEnergyLevel getConsumersEnergyLevel() {
        return consumersEnergyLevel;
    }

    /**
     * Sets the value of the consumersEnergyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumersEnergyLevel }
     *     
     */
    public void setConsumersEnergyLevel(ConsumersEnergyLevel value) {
        this.consumersEnergyLevel = value;
    }

    /**
     * Gets the value of the residenceType property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceType }
     *     
     */
    public ResidenceType getResidenceType() {
        return residenceType;
    }

    /**
     * Sets the value of the residenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceType }
     *     
     */
    public void setResidenceType(ResidenceType value) {
        this.residenceType = value;
    }

    /**
     * Gets the value of the residenceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceTypeCode }
     *     
     */
    public ResidenceTypeCode getResidenceTypeCode() {
        return residenceTypeCode;
    }

    /**
     * Sets the value of the residenceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceTypeCode }
     *     
     */
    public void setResidenceTypeCode(ResidenceTypeCode value) {
        this.residenceTypeCode = value;
    }

    /**
     * Gets the value of the heatingType property.
     * 
     * @return
     *     possible object is
     *     {@link HeatingType }
     *     
     */
    public HeatingType getHeatingType() {
        return heatingType;
    }

    /**
     * Sets the value of the heatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingType }
     *     
     */
    public void setHeatingType(HeatingType value) {
        this.heatingType = value;
    }

    /**
     * Gets the value of the heatingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link HeatingTypeCode }
     *     
     */
    public HeatingTypeCode getHeatingTypeCode() {
        return heatingTypeCode;
    }

    /**
     * Sets the value of the heatingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingTypeCode }
     *     
     */
    public void setHeatingTypeCode(HeatingTypeCode value) {
        this.heatingTypeCode = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    /**
     * Gets the value of the guidanceDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getGuidanceDocumentReference() {
        return guidanceDocumentReference;
    }

    /**
     * Sets the value of the guidanceDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setGuidanceDocumentReference(DocumentReferenceType value) {
        this.guidanceDocumentReference = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setDocumentReference(DocumentReferenceType value) {
        this.documentReference = value;
    }

    /**
     * Gets the value of the consumptionReportReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionReportReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionReportReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionReportReference }
     * 
     * 
     */
    public List<ConsumptionReportReference> getConsumptionReportReferences() {
        if (consumptionReportReferences == null) {
            consumptionReportReferences = new ArrayList<ConsumptionReportReference>();
        }
        return this.consumptionReportReferences;
    }

    /**
     * Gets the value of the consumptionHistories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionHistories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionHistories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionHistory }
     * 
     * 
     */
    public List<ConsumptionHistory> getConsumptionHistories() {
        if (consumptionHistories == null) {
            consumptionHistories = new ArrayList<ConsumptionHistory>();
        }
        return this.consumptionHistories;
    }

}
