
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
 * <p>Java class for NotificationRequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationRequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NotificationTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PostEventNotificationDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreEventNotificationDurationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotifyParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationPeriod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationRequirementType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "notificationTypeCode",
    "postEventNotificationDurationMeasure",
    "preEventNotificationDurationMeasure",
    "notifyParties",
    "notificationPeriods",
    "notificationLocations"
})
@XmlRootElement(name = "NotificationRequirement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class NotificationRequirement
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "NotificationTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected NotificationTypeCode notificationTypeCode;
    @XmlElement(name = "PostEventNotificationDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PostEventNotificationDurationMeasure postEventNotificationDurationMeasure;
    @XmlElement(name = "PreEventNotificationDurationMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PreEventNotificationDurationMeasure preEventNotificationDurationMeasure;
    @XmlElement(name = "NotifyParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyType> notifyParties;
    @XmlElement(name = "NotificationPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PeriodType> notificationPeriods;
    @XmlElement(name = "NotificationLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LocationType> notificationLocations;

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
     * Gets the value of the notificationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationTypeCode }
     *     
     */
    public NotificationTypeCode getNotificationTypeCode() {
        return notificationTypeCode;
    }

    /**
     * Sets the value of the notificationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationTypeCode }
     *     
     */
    public void setNotificationTypeCode(NotificationTypeCode value) {
        this.notificationTypeCode = value;
    }

    /**
     * Gets the value of the postEventNotificationDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link PostEventNotificationDurationMeasure }
     *     
     */
    public PostEventNotificationDurationMeasure getPostEventNotificationDurationMeasure() {
        return postEventNotificationDurationMeasure;
    }

    /**
     * Sets the value of the postEventNotificationDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostEventNotificationDurationMeasure }
     *     
     */
    public void setPostEventNotificationDurationMeasure(PostEventNotificationDurationMeasure value) {
        this.postEventNotificationDurationMeasure = value;
    }

    /**
     * Gets the value of the preEventNotificationDurationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link PreEventNotificationDurationMeasure }
     *     
     */
    public PreEventNotificationDurationMeasure getPreEventNotificationDurationMeasure() {
        return preEventNotificationDurationMeasure;
    }

    /**
     * Sets the value of the preEventNotificationDurationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreEventNotificationDurationMeasure }
     *     
     */
    public void setPreEventNotificationDurationMeasure(PreEventNotificationDurationMeasure value) {
        this.preEventNotificationDurationMeasure = value;
    }

    /**
     * Gets the value of the notifyParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifyParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifyParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getNotifyParties() {
        if (notifyParties == null) {
            notifyParties = new ArrayList<PartyType>();
        }
        return this.notifyParties;
    }

    /**
     * Gets the value of the notificationPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodType }
     * 
     * 
     */
    public List<PeriodType> getNotificationPeriods() {
        if (notificationPeriods == null) {
            notificationPeriods = new ArrayList<PeriodType>();
        }
        return this.notificationPeriods;
    }

    /**
     * Gets the value of the notificationLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getNotificationLocations() {
        if (notificationLocations == null) {
            notificationLocations = new ArrayList<LocationType>();
        }
        return this.notificationLocations;
    }

}
