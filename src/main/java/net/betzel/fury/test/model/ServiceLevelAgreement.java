
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
 * <p>Java class for ServiceLevelAgreementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLevelAgreementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AvailabilityTimePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MondayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TuesdayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WednesdayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ThursdayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FridayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SaturdayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SundayAvailabilityIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumResponseTimeDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumDownTimeScheduleDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumIncidentNotificationDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumDataLossDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeanTimeToRecoverDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceAvailabilityPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceMaintenancePeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLevelAgreementType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "serviceTypeCode",
    "serviceTypes",
    "availabilityTimePercent",
    "mondayAvailabilityIndicator",
    "tuesdayAvailabilityIndicator",
    "wednesdayAvailabilityIndicator",
    "thursdayAvailabilityIndicator",
    "fridayAvailabilityIndicator",
    "saturdayAvailabilityIndicator",
    "sundayAvailabilityIndicator",
    "minimumResponseTimeDurationMeasure",
    "minimumDownTimeScheduleDurationMeasure",
    "maximumIncidentNotificationDurationMeasure",
    "maximumDataLossDurationMeasure",
    "meanTimeToRecoverDurationMeasure",
    "serviceAvailabilityPeriods",
    "serviceMaintenancePeriods"
})
@XmlRootElement(name = "ServiceLevelAgreement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ServiceLevelAgreement
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "ServiceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ServiceTypeCode serviceTypeCode;
    @XmlElement(name = "ServiceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ServiceType> serviceTypes;
    @XmlElement(name = "AvailabilityTimePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AvailabilityTimePercent availabilityTimePercent;
    @XmlElement(name = "MondayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MondayAvailabilityIndicator mondayAvailabilityIndicator;
    @XmlElement(name = "TuesdayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TuesdayAvailabilityIndicator tuesdayAvailabilityIndicator;
    @XmlElement(name = "WednesdayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WednesdayAvailabilityIndicator wednesdayAvailabilityIndicator;
    @XmlElement(name = "ThursdayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ThursdayAvailabilityIndicator thursdayAvailabilityIndicator;
    @XmlElement(name = "FridayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FridayAvailabilityIndicator fridayAvailabilityIndicator;
    @XmlElement(name = "SaturdayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SaturdayAvailabilityIndicator saturdayAvailabilityIndicator;
    @XmlElement(name = "SundayAvailabilityIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SundayAvailabilityIndicator sundayAvailabilityIndicator;
    @XmlElement(name = "MinimumResponseTimeDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumResponseTimeDurationMeasure minimumResponseTimeDurationMeasure;
    @XmlElement(name = "MinimumDownTimeScheduleDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumDownTimeScheduleDurationMeasure minimumDownTimeScheduleDurationMeasure;
    @XmlElement(name = "MaximumIncidentNotificationDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumIncidentNotificationDurationMeasure maximumIncidentNotificationDurationMeasure;
    @XmlElement(name = "MaximumDataLossDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumDataLossDurationMeasure maximumDataLossDurationMeasure;
    @XmlElement(name = "MeanTimeToRecoverDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MeanTimeToRecoverDurationMeasure meanTimeToRecoverDurationMeasure;
    @XmlElement(name = "ServiceAvailabilityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PeriodType> serviceAvailabilityPeriods;
    @XmlElement(name = "ServiceMaintenancePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PeriodType> serviceMaintenancePeriods;

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
     * Gets the value of the serviceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTypeCode }
     *     
     */
    public ServiceTypeCode getServiceTypeCode() {
        return serviceTypeCode;
    }

    /**
     * Sets the value of the serviceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTypeCode }
     *     
     */
    public void setServiceTypeCode(ServiceTypeCode value) {
        this.serviceTypeCode = value;
    }

    /**
     * Gets the value of the serviceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getServiceTypes() {
        if (serviceTypes == null) {
            serviceTypes = new ArrayList<ServiceType>();
        }
        return this.serviceTypes;
    }

    /**
     * Gets the value of the availabilityTimePercent property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityTimePercent }
     *     
     */
    public AvailabilityTimePercent getAvailabilityTimePercent() {
        return availabilityTimePercent;
    }

    /**
     * Sets the value of the availabilityTimePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityTimePercent }
     *     
     */
    public void setAvailabilityTimePercent(AvailabilityTimePercent value) {
        this.availabilityTimePercent = value;
    }

    /**
     * Gets the value of the mondayAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MondayAvailabilityIndicator }
     *     
     */
    public MondayAvailabilityIndicator getMondayAvailabilityIndicator() {
        return mondayAvailabilityIndicator;
    }

    /**
     * Sets the value of the mondayAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MondayAvailabilityIndicator }
     *     
     */
    public void setMondayAvailabilityIndicator(MondayAvailabilityIndicator value) {
        this.mondayAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the tuesdayAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TuesdayAvailabilityIndicator }
     *     
     */
    public TuesdayAvailabilityIndicator getTuesdayAvailabilityIndicator() {
        return tuesdayAvailabilityIndicator;
    }

    /**
     * Sets the value of the tuesdayAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TuesdayAvailabilityIndicator }
     *     
     */
    public void setTuesdayAvailabilityIndicator(TuesdayAvailabilityIndicator value) {
        this.tuesdayAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the wednesdayAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link WednesdayAvailabilityIndicator }
     *     
     */
    public WednesdayAvailabilityIndicator getWednesdayAvailabilityIndicator() {
        return wednesdayAvailabilityIndicator;
    }

    /**
     * Sets the value of the wednesdayAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link WednesdayAvailabilityIndicator }
     *     
     */
    public void setWednesdayAvailabilityIndicator(WednesdayAvailabilityIndicator value) {
        this.wednesdayAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the thursdayAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ThursdayAvailabilityIndicator }
     *     
     */
    public ThursdayAvailabilityIndicator getThursdayAvailabilityIndicator() {
        return thursdayAvailabilityIndicator;
    }

    /**
     * Sets the value of the thursdayAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThursdayAvailabilityIndicator }
     *     
     */
    public void setThursdayAvailabilityIndicator(ThursdayAvailabilityIndicator value) {
        this.thursdayAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the fridayAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link FridayAvailabilityIndicator }
     *     
     */
    public FridayAvailabilityIndicator getFridayAvailabilityIndicator() {
        return fridayAvailabilityIndicator;
    }

    /**
     * Sets the value of the fridayAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FridayAvailabilityIndicator }
     *     
     */
    public void setFridayAvailabilityIndicator(FridayAvailabilityIndicator value) {
        this.fridayAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the saturdayAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SaturdayAvailabilityIndicator }
     *     
     */
    public SaturdayAvailabilityIndicator getSaturdayAvailabilityIndicator() {
        return saturdayAvailabilityIndicator;
    }

    /**
     * Sets the value of the saturdayAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaturdayAvailabilityIndicator }
     *     
     */
    public void setSaturdayAvailabilityIndicator(SaturdayAvailabilityIndicator value) {
        this.saturdayAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the sundayAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SundayAvailabilityIndicator }
     *     
     */
    public SundayAvailabilityIndicator getSundayAvailabilityIndicator() {
        return sundayAvailabilityIndicator;
    }

    /**
     * Sets the value of the sundayAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SundayAvailabilityIndicator }
     *     
     */
    public void setSundayAvailabilityIndicator(SundayAvailabilityIndicator value) {
        this.sundayAvailabilityIndicator = value;
    }

    /**
     * Gets the value of the minimumResponseTimeDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumResponseTimeDurationMeasure }
     *     
     */
    public MinimumResponseTimeDurationMeasure getMinimumResponseTimeDurationMeasure() {
        return minimumResponseTimeDurationMeasure;
    }

    /**
     * Sets the value of the minimumResponseTimeDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumResponseTimeDurationMeasure }
     *     
     */
    public void setMinimumResponseTimeDurationMeasure(MinimumResponseTimeDurationMeasure value) {
        this.minimumResponseTimeDurationMeasure = value;
    }

    /**
     * Gets the value of the minimumDownTimeScheduleDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumDownTimeScheduleDurationMeasure }
     *     
     */
    public MinimumDownTimeScheduleDurationMeasure getMinimumDownTimeScheduleDurationMeasure() {
        return minimumDownTimeScheduleDurationMeasure;
    }

    /**
     * Sets the value of the minimumDownTimeScheduleDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumDownTimeScheduleDurationMeasure }
     *     
     */
    public void setMinimumDownTimeScheduleDurationMeasure(MinimumDownTimeScheduleDurationMeasure value) {
        this.minimumDownTimeScheduleDurationMeasure = value;
    }

    /**
     * Gets the value of the maximumIncidentNotificationDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumIncidentNotificationDurationMeasure }
     *     
     */
    public MaximumIncidentNotificationDurationMeasure getMaximumIncidentNotificationDurationMeasure() {
        return maximumIncidentNotificationDurationMeasure;
    }

    /**
     * Sets the value of the maximumIncidentNotificationDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumIncidentNotificationDurationMeasure }
     *     
     */
    public void setMaximumIncidentNotificationDurationMeasure(MaximumIncidentNotificationDurationMeasure value) {
        this.maximumIncidentNotificationDurationMeasure = value;
    }

    /**
     * Gets the value of the maximumDataLossDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumDataLossDurationMeasure }
     *     
     */
    public MaximumDataLossDurationMeasure getMaximumDataLossDurationMeasure() {
        return maximumDataLossDurationMeasure;
    }

    /**
     * Sets the value of the maximumDataLossDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumDataLossDurationMeasure }
     *     
     */
    public void setMaximumDataLossDurationMeasure(MaximumDataLossDurationMeasure value) {
        this.maximumDataLossDurationMeasure = value;
    }

    /**
     * Gets the value of the meanTimeToRecoverDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeanTimeToRecoverDurationMeasure }
     *     
     */
    public MeanTimeToRecoverDurationMeasure getMeanTimeToRecoverDurationMeasure() {
        return meanTimeToRecoverDurationMeasure;
    }

    /**
     * Sets the value of the meanTimeToRecoverDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanTimeToRecoverDurationMeasure }
     *     
     */
    public void setMeanTimeToRecoverDurationMeasure(MeanTimeToRecoverDurationMeasure value) {
        this.meanTimeToRecoverDurationMeasure = value;
    }

    /**
     * Gets the value of the serviceAvailabilityPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAvailabilityPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAvailabilityPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getServiceAvailabilityPeriods() {
        if (serviceAvailabilityPeriods == null) {
            serviceAvailabilityPeriods = new ArrayList<PeriodType>();
        }
        return this.serviceAvailabilityPeriods;
    }

    /**
     * Gets the value of the serviceMaintenancePeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMaintenancePeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMaintenancePeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getServiceMaintenancePeriods() {
        if (serviceMaintenancePeriods == null) {
            serviceMaintenancePeriods = new ArrayList<PeriodType>();
        }
        return this.serviceMaintenancePeriods;
    }

}
