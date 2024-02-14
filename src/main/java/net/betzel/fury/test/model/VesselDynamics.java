
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VesselDynamicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselDynamicsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NavigationStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AtAnchorageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CourseOverGroundDirection" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpeedOverGroundMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RateOfTurnMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselDynamicsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "navigationStatusCode",
    "atAnchorageIndicator",
    "courseOverGroundDirection",
    "speedOverGroundMeasure",
    "rateOfTurnMeasure"
})
@XmlRootElement(name = "VesselDynamics", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class VesselDynamics
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "NavigationStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NavigationStatusCode navigationStatusCode;
    @XmlElement(name = "AtAnchorageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AtAnchorageIndicator atAnchorageIndicator;
    @XmlElement(name = "CourseOverGroundDirection", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CourseOverGroundDirection courseOverGroundDirection;
    @XmlElement(name = "SpeedOverGroundMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SpeedOverGroundMeasure speedOverGroundMeasure;
    @XmlElement(name = "RateOfTurnMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RateOfTurnMeasure rateOfTurnMeasure;

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
     * Gets the value of the navigationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link NavigationStatusCode }
     *     
     */
    public NavigationStatusCode getNavigationStatusCode() {
        return navigationStatusCode;
    }

    /**
     * Sets the value of the navigationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationStatusCode }
     *     
     */
    public void setNavigationStatusCode(NavigationStatusCode value) {
        this.navigationStatusCode = value;
    }

    /**
     * Gets the value of the atAnchorageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link AtAnchorageIndicator }
     *     
     */
    public AtAnchorageIndicator getAtAnchorageIndicator() {
        return atAnchorageIndicator;
    }

    /**
     * Sets the value of the atAnchorageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtAnchorageIndicator }
     *     
     */
    public void setAtAnchorageIndicator(AtAnchorageIndicator value) {
        this.atAnchorageIndicator = value;
    }

    /**
     * Gets the value of the courseOverGroundDirection property.
     * 
     * @return
     *     possible object is
     *     {@link CourseOverGroundDirection }
     *     
     */
    public CourseOverGroundDirection getCourseOverGroundDirection() {
        return courseOverGroundDirection;
    }

    /**
     * Sets the value of the courseOverGroundDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOverGroundDirection }
     *     
     */
    public void setCourseOverGroundDirection(CourseOverGroundDirection value) {
        this.courseOverGroundDirection = value;
    }

    /**
     * Gets the value of the speedOverGroundMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedOverGroundMeasure }
     *     
     */
    public SpeedOverGroundMeasure getSpeedOverGroundMeasure() {
        return speedOverGroundMeasure;
    }

    /**
     * Sets the value of the speedOverGroundMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedOverGroundMeasure }
     *     
     */
    public void setSpeedOverGroundMeasure(SpeedOverGroundMeasure value) {
        this.speedOverGroundMeasure = value;
    }

    /**
     * Gets the value of the rateOfTurnMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link RateOfTurnMeasure }
     *     
     */
    public RateOfTurnMeasure getRateOfTurnMeasure() {
        return rateOfTurnMeasure;
    }

    /**
     * Sets the value of the rateOfTurnMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOfTurnMeasure }
     *     
     */
    public void setRateOfTurnMeasure(RateOfTurnMeasure value) {
        this.rateOfTurnMeasure = value;
    }

}
