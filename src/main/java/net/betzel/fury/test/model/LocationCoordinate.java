
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCoordinateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationCoordinateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CoordinateSystemCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeDegreesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeMinutesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatitudeDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeDegreesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeMinutesMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LongitudeDirectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AltitudeMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCoordinateType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "coordinateSystemCode",
    "latitudeDegreesMeasure",
    "latitudeMinutesMeasure",
    "latitudeDirectionCode",
    "longitudeDegreesMeasure",
    "longitudeMinutesMeasure",
    "longitudeDirectionCode",
    "altitudeMeasure"
})
@XmlRootElement(name = "LocationCoordinate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class LocationCoordinate
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "CoordinateSystemCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CoordinateSystemCode coordinateSystemCode;
    @XmlElement(name = "LatitudeDegreesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatitudeDegreesMeasure latitudeDegreesMeasure;
    @XmlElement(name = "LatitudeMinutesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatitudeMinutesMeasure latitudeMinutesMeasure;
    @XmlElement(name = "LatitudeDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatitudeDirectionCode latitudeDirectionCode;
    @XmlElement(name = "LongitudeDegreesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LongitudeDegreesMeasure longitudeDegreesMeasure;
    @XmlElement(name = "LongitudeMinutesMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LongitudeMinutesMeasure longitudeMinutesMeasure;
    @XmlElement(name = "LongitudeDirectionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LongitudeDirectionCode longitudeDirectionCode;
    @XmlElement(name = "AltitudeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AltitudeMeasure altitudeMeasure;

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
     * Gets the value of the coordinateSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateSystemCode }
     *     
     */
    public CoordinateSystemCode getCoordinateSystemCode() {
        return coordinateSystemCode;
    }

    /**
     * Sets the value of the coordinateSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateSystemCode }
     *     
     */
    public void setCoordinateSystemCode(CoordinateSystemCode value) {
        this.coordinateSystemCode = value;
    }

    /**
     * Gets the value of the latitudeDegreesMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeDegreesMeasure }
     *     
     */
    public LatitudeDegreesMeasure getLatitudeDegreesMeasure() {
        return latitudeDegreesMeasure;
    }

    /**
     * Sets the value of the latitudeDegreesMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeDegreesMeasure }
     *     
     */
    public void setLatitudeDegreesMeasure(LatitudeDegreesMeasure value) {
        this.latitudeDegreesMeasure = value;
    }

    /**
     * Gets the value of the latitudeMinutesMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeMinutesMeasure }
     *     
     */
    public LatitudeMinutesMeasure getLatitudeMinutesMeasure() {
        return latitudeMinutesMeasure;
    }

    /**
     * Sets the value of the latitudeMinutesMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeMinutesMeasure }
     *     
     */
    public void setLatitudeMinutesMeasure(LatitudeMinutesMeasure value) {
        this.latitudeMinutesMeasure = value;
    }

    /**
     * Gets the value of the latitudeDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeDirectionCode }
     *     
     */
    public LatitudeDirectionCode getLatitudeDirectionCode() {
        return latitudeDirectionCode;
    }

    /**
     * Sets the value of the latitudeDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeDirectionCode }
     *     
     */
    public void setLatitudeDirectionCode(LatitudeDirectionCode value) {
        this.latitudeDirectionCode = value;
    }

    /**
     * Gets the value of the longitudeDegreesMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeDegreesMeasure }
     *     
     */
    public LongitudeDegreesMeasure getLongitudeDegreesMeasure() {
        return longitudeDegreesMeasure;
    }

    /**
     * Sets the value of the longitudeDegreesMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeDegreesMeasure }
     *     
     */
    public void setLongitudeDegreesMeasure(LongitudeDegreesMeasure value) {
        this.longitudeDegreesMeasure = value;
    }

    /**
     * Gets the value of the longitudeMinutesMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeMinutesMeasure }
     *     
     */
    public LongitudeMinutesMeasure getLongitudeMinutesMeasure() {
        return longitudeMinutesMeasure;
    }

    /**
     * Sets the value of the longitudeMinutesMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeMinutesMeasure }
     *     
     */
    public void setLongitudeMinutesMeasure(LongitudeMinutesMeasure value) {
        this.longitudeMinutesMeasure = value;
    }

    /**
     * Gets the value of the longitudeDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeDirectionCode }
     *     
     */
    public LongitudeDirectionCode getLongitudeDirectionCode() {
        return longitudeDirectionCode;
    }

    /**
     * Sets the value of the longitudeDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeDirectionCode }
     *     
     */
    public void setLongitudeDirectionCode(LongitudeDirectionCode value) {
        this.longitudeDirectionCode = value;
    }

    /**
     * Gets the value of the altitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeMeasure }
     *     
     */
    public AltitudeMeasure getAltitudeMeasure() {
        return altitudeMeasure;
    }

    /**
     * Sets the value of the altitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeMeasure }
     *     
     */
    public void setAltitudeMeasure(AltitudeMeasure value) {
        this.altitudeMeasure = value;
    }

}
