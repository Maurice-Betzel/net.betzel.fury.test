
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
 * <p>Java class for MeterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterConstant" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MeterConstantCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalDeliveredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeterReading" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeterProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "meterNumber",
    "meterName",
    "meterConstant",
    "meterConstantCode",
    "totalDeliveredQuantity",
    "meterReadings",
    "meterProperties"
})
public class MeterType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "MeterNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MeterNumber meterNumber;
    @XmlElement(name = "MeterName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MeterName meterName;
    @XmlElement(name = "MeterConstant", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MeterConstant meterConstant;
    @XmlElement(name = "MeterConstantCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MeterConstantCode meterConstantCode;
    @XmlElement(name = "TotalDeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalDeliveredQuantity totalDeliveredQuantity;
    @XmlElement(name = "MeterReading", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<MeterReading> meterReadings;
    @XmlElement(name = "MeterProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<MeterProperty> meterProperties;

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
     * Gets the value of the meterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MeterNumber }
     *     
     */
    public MeterNumber getMeterNumber() {
        return meterNumber;
    }

    /**
     * Sets the value of the meterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterNumber }
     *     
     */
    public void setMeterNumber(MeterNumber value) {
        this.meterNumber = value;
    }

    /**
     * Gets the value of the meterName property.
     * 
     * @return
     *     possible object is
     *     {@link MeterName }
     *     
     */
    public MeterName getMeterName() {
        return meterName;
    }

    /**
     * Sets the value of the meterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterName }
     *     
     */
    public void setMeterName(MeterName value) {
        this.meterName = value;
    }

    /**
     * Gets the value of the meterConstant property.
     * 
     * @return
     *     possible object is
     *     {@link MeterConstant }
     *     
     */
    public MeterConstant getMeterConstant() {
        return meterConstant;
    }

    /**
     * Sets the value of the meterConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConstant }
     *     
     */
    public void setMeterConstant(MeterConstant value) {
        this.meterConstant = value;
    }

    /**
     * Gets the value of the meterConstantCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeterConstantCode }
     *     
     */
    public MeterConstantCode getMeterConstantCode() {
        return meterConstantCode;
    }

    /**
     * Sets the value of the meterConstantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterConstantCode }
     *     
     */
    public void setMeterConstantCode(MeterConstantCode value) {
        this.meterConstantCode = value;
    }

    /**
     * Gets the value of the totalDeliveredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalDeliveredQuantity }
     *     
     */
    public TotalDeliveredQuantity getTotalDeliveredQuantity() {
        return totalDeliveredQuantity;
    }

    /**
     * Sets the value of the totalDeliveredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDeliveredQuantity }
     *     
     */
    public void setTotalDeliveredQuantity(TotalDeliveredQuantity value) {
        this.totalDeliveredQuantity = value;
    }

    /**
     * Gets the value of the meterReadings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterReadings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterReadings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterReading }
     * 
     * 
     */
    public List<MeterReading> getMeterReadings() {
        if (meterReadings == null) {
            meterReadings = new ArrayList<MeterReading>();
        }
        return this.meterReadings;
    }

    /**
     * Gets the value of the meterProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meterProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeterProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeterProperty }
     * 
     * 
     */
    public List<MeterProperty> getMeterProperties() {
        if (meterProperties == null) {
            meterProperties = new ArrayList<MeterProperty>();
        }
        return this.meterProperties;
    }

}
