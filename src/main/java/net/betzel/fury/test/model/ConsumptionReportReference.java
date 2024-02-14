
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsumptionReportReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionReportReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionReportID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumptionTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalConsumedQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionReportReferenceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "consumptionReportID",
    "consumptionType",
    "consumptionTypeCode",
    "totalConsumedQuantity",
    "period"
})
@XmlRootElement(name = "ConsumptionReportReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ConsumptionReportReference
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ConsumptionReportID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ConsumptionReportID consumptionReportID;
    @XmlElement(name = "ConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionType consumptionType;
    @XmlElement(name = "ConsumptionTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumptionTypeCode consumptionTypeCode;
    @XmlElement(name = "TotalConsumedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected TotalConsumedQuantity totalConsumedQuantity;
    @XmlElement(name = "Period", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected PeriodType period;

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
     * Gets the value of the consumptionReportID property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionReportID }
     *     
     */
    public ConsumptionReportID getConsumptionReportID() {
        return consumptionReportID;
    }

    /**
     * Sets the value of the consumptionReportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionReportID }
     *     
     */
    public void setConsumptionReportID(ConsumptionReportID value) {
        this.consumptionReportID = value;
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

}
