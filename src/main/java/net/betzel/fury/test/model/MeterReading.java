
package net.betzel.fury.test.model;

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
 * <p>Java class for MeterReadingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterReadingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PreviousMeterReadingMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestMeterReadingMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterReadingComments" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveredQuantity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadingType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "meterReadingType",
    "meterReadingTypeCode",
    "previousMeterReadingDate",
    "previousMeterQuantity",
    "latestMeterReadingDate",
    "latestMeterQuantity",
    "previousMeterReadingMethod",
    "previousMeterReadingMethodCode",
    "latestMeterReadingMethod",
    "latestMeterReadingMethodCode",
    "meterReadingComments",
    "deliveredQuantity"
})
@XmlRootElement(name = "MeterReading", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class MeterReading
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "MeterReadingType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MeterReadingType meterReadingType;
    @XmlElement(name = "MeterReadingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MeterReadingTypeCode meterReadingTypeCode;
    @XmlElement(name = "PreviousMeterReadingDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected PreviousMeterReadingDate previousMeterReadingDate;
    @XmlElement(name = "PreviousMeterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected PreviousMeterQuantity previousMeterQuantity;
    @XmlElement(name = "LatestMeterReadingDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected LatestMeterReadingDate latestMeterReadingDate;
    @XmlElement(name = "LatestMeterQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected LatestMeterQuantity latestMeterQuantity;
    @XmlElement(name = "PreviousMeterReadingMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PreviousMeterReadingMethod previousMeterReadingMethod;
    @XmlElement(name = "PreviousMeterReadingMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PreviousMeterReadingMethodCode previousMeterReadingMethodCode;
    @XmlElement(name = "LatestMeterReadingMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatestMeterReadingMethod latestMeterReadingMethod;
    @XmlElement(name = "LatestMeterReadingMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatestMeterReadingMethodCode latestMeterReadingMethodCode;
    @XmlElement(name = "MeterReadingComments", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<MeterReadingComments> meterReadingComments;
    @XmlElement(name = "DeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected DeliveredQuantity deliveredQuantity;

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
     * Gets the value of the meterReadingType property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingType }
     *     
     */
    public MeterReadingType getMeterReadingType() {
        return meterReadingType;
    }

    /**
     * Sets the value of the meterReadingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingType }
     *     
     */
    public void setMeterReadingType(MeterReadingType value) {
        this.meterReadingType = value;
    }

    /**
     * Gets the value of the meterReadingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingTypeCode }
     *     
     */
    public MeterReadingTypeCode getMeterReadingTypeCode() {
        return meterReadingTypeCode;
    }

    /**
     * Sets the value of the meterReadingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingTypeCode }
     *     
     */
    public void setMeterReadingTypeCode(MeterReadingTypeCode value) {
        this.meterReadingTypeCode = value;
    }

    /**
     * Gets the value of the previousMeterReadingDate property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingDate }
     *     
     */
    public PreviousMeterReadingDate getPreviousMeterReadingDate() {
        return previousMeterReadingDate;
    }

    /**
     * Sets the value of the previousMeterReadingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingDate }
     *     
     */
    public void setPreviousMeterReadingDate(PreviousMeterReadingDate value) {
        this.previousMeterReadingDate = value;
    }

    /**
     * Gets the value of the previousMeterQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterQuantity }
     *     
     */
    public PreviousMeterQuantity getPreviousMeterQuantity() {
        return previousMeterQuantity;
    }

    /**
     * Sets the value of the previousMeterQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterQuantity }
     *     
     */
    public void setPreviousMeterQuantity(PreviousMeterQuantity value) {
        this.previousMeterQuantity = value;
    }

    /**
     * Gets the value of the latestMeterReadingDate property.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingDate }
     *     
     */
    public LatestMeterReadingDate getLatestMeterReadingDate() {
        return latestMeterReadingDate;
    }

    /**
     * Sets the value of the latestMeterReadingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingDate }
     *     
     */
    public void setLatestMeterReadingDate(LatestMeterReadingDate value) {
        this.latestMeterReadingDate = value;
    }

    /**
     * Gets the value of the latestMeterQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterQuantity }
     *     
     */
    public LatestMeterQuantity getLatestMeterQuantity() {
        return latestMeterQuantity;
    }

    /**
     * Sets the value of the latestMeterQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterQuantity }
     *     
     */
    public void setLatestMeterQuantity(LatestMeterQuantity value) {
        this.latestMeterQuantity = value;
    }

    /**
     * Gets the value of the previousMeterReadingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingMethod }
     *     
     */
    public PreviousMeterReadingMethod getPreviousMeterReadingMethod() {
        return previousMeterReadingMethod;
    }

    /**
     * Sets the value of the previousMeterReadingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingMethod }
     *     
     */
    public void setPreviousMeterReadingMethod(PreviousMeterReadingMethod value) {
        this.previousMeterReadingMethod = value;
    }

    /**
     * Gets the value of the previousMeterReadingMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousMeterReadingMethodCode }
     *     
     */
    public PreviousMeterReadingMethodCode getPreviousMeterReadingMethodCode() {
        return previousMeterReadingMethodCode;
    }

    /**
     * Sets the value of the previousMeterReadingMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousMeterReadingMethodCode }
     *     
     */
    public void setPreviousMeterReadingMethodCode(PreviousMeterReadingMethodCode value) {
        this.previousMeterReadingMethodCode = value;
    }

    /**
     * Gets the value of the latestMeterReadingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingMethod }
     *     
     */
    public LatestMeterReadingMethod getLatestMeterReadingMethod() {
        return latestMeterReadingMethod;
    }

    /**
     * Sets the value of the latestMeterReadingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingMethod }
     *     
     */
    public void setLatestMeterReadingMethod(LatestMeterReadingMethod value) {
        this.latestMeterReadingMethod = value;
    }

    /**
     * Gets the value of the latestMeterReadingMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link LatestMeterReadingMethodCode }
     *     
     */
    public LatestMeterReadingMethodCode getLatestMeterReadingMethodCode() {
        return latestMeterReadingMethodCode;
    }

    /**
     * Sets the value of the latestMeterReadingMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestMeterReadingMethodCode }
     *     
     */
    public void setLatestMeterReadingMethodCode(LatestMeterReadingMethodCode value) {
        this.latestMeterReadingMethodCode = value;
    }

    /**
     * Gets the value of the meterReadingComments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterReadingComments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterReadingComments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterReadingComments }
     * 
     * 
     */
    public List<MeterReadingComments> getMeterReadingComments() {
        if (meterReadingComments == null) {
            meterReadingComments = new ArrayList<MeterReadingComments>();
        }
        return this.meterReadingComments;
    }

    /**
     * Gets the value of the deliveredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveredQuantity }
     *     
     */
    public DeliveredQuantity getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Sets the value of the deliveredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveredQuantity }
     *     
     */
    public void setDeliveredQuantity(DeliveredQuantity value) {
        this.deliveredQuantity = value;
    }

}
