
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmissionCalculationMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmissionCalculationMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FullnessIndicationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementFromLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementToLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmissionCalculationMethodType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "calculationMethodCode",
    "fullnessIndicationCode",
    "measurementFromLocation",
    "measurementToLocation"
})
@XmlRootElement(name = "EmissionCalculationMethod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class EmissionCalculationMethod
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "CalculationMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CalculationMethodCode calculationMethodCode;
    @XmlElement(name = "FullnessIndicationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FullnessIndicationCode fullnessIndicationCode;
    @XmlElement(name = "MeasurementFromLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType measurementFromLocation;
    @XmlElement(name = "MeasurementToLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType measurementToLocation;

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
     * Gets the value of the calculationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationMethodCode }
     *     
     */
    public CalculationMethodCode getCalculationMethodCode() {
        return calculationMethodCode;
    }

    /**
     * Sets the value of the calculationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationMethodCode }
     *     
     */
    public void setCalculationMethodCode(CalculationMethodCode value) {
        this.calculationMethodCode = value;
    }

    /**
     * Gets the value of the fullnessIndicationCode property.
     * 
     * @return
     *     possible object is
     *     {@link FullnessIndicationCode }
     *     
     */
    public FullnessIndicationCode getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    /**
     * Sets the value of the fullnessIndicationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullnessIndicationCode }
     *     
     */
    public void setFullnessIndicationCode(FullnessIndicationCode value) {
        this.fullnessIndicationCode = value;
    }

    /**
     * Gets the value of the measurementFromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getMeasurementFromLocation() {
        return measurementFromLocation;
    }

    /**
     * Sets the value of the measurementFromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setMeasurementFromLocation(LocationType value) {
        this.measurementFromLocation = value;
    }

    /**
     * Gets the value of the measurementToLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getMeasurementToLocation() {
        return measurementToLocation;
    }

    /**
     * Sets the value of the measurementToLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setMeasurementToLocation(LocationType value) {
        this.measurementToLocation = value;
    }

}
