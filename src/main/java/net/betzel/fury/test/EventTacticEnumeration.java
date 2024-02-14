
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventTacticEnumerationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTacticEnumerationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumerIncentiveTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DisplayTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FeatureTacticTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TradeItemPackingLabelingTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTacticEnumerationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "consumerIncentiveTacticTypeCode",
    "displayTacticTypeCode",
    "featureTacticTypeCode",
    "tradeItemPackingLabelingTypeCode"
})
@XmlRootElement(name = "EventTacticEnumeration", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class EventTacticEnumeration
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ConsumerIncentiveTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumerIncentiveTacticTypeCode consumerIncentiveTacticTypeCode;
    @XmlElement(name = "DisplayTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DisplayTacticTypeCode displayTacticTypeCode;
    @XmlElement(name = "FeatureTacticTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FeatureTacticTypeCode featureTacticTypeCode;
    @XmlElement(name = "TradeItemPackingLabelingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TradeItemPackingLabelingTypeCode tradeItemPackingLabelingTypeCode;

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
     * Gets the value of the consumerIncentiveTacticTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerIncentiveTacticTypeCode }
     *     
     */
    public ConsumerIncentiveTacticTypeCode getConsumerIncentiveTacticTypeCode() {
        return consumerIncentiveTacticTypeCode;
    }

    /**
     * Sets the value of the consumerIncentiveTacticTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerIncentiveTacticTypeCode }
     *     
     */
    public void setConsumerIncentiveTacticTypeCode(ConsumerIncentiveTacticTypeCode value) {
        this.consumerIncentiveTacticTypeCode = value;
    }

    /**
     * Gets the value of the displayTacticTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayTacticTypeCode }
     *     
     */
    public DisplayTacticTypeCode getDisplayTacticTypeCode() {
        return displayTacticTypeCode;
    }

    /**
     * Sets the value of the displayTacticTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayTacticTypeCode }
     *     
     */
    public void setDisplayTacticTypeCode(DisplayTacticTypeCode value) {
        this.displayTacticTypeCode = value;
    }

    /**
     * Gets the value of the featureTacticTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureTacticTypeCode }
     *     
     */
    public FeatureTacticTypeCode getFeatureTacticTypeCode() {
        return featureTacticTypeCode;
    }

    /**
     * Sets the value of the featureTacticTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTacticTypeCode }
     *     
     */
    public void setFeatureTacticTypeCode(FeatureTacticTypeCode value) {
        this.featureTacticTypeCode = value;
    }

    /**
     * Gets the value of the tradeItemPackingLabelingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TradeItemPackingLabelingTypeCode }
     *     
     */
    public TradeItemPackingLabelingTypeCode getTradeItemPackingLabelingTypeCode() {
        return tradeItemPackingLabelingTypeCode;
    }

    /**
     * Sets the value of the tradeItemPackingLabelingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeItemPackingLabelingTypeCode }
     *     
     */
    public void setTradeItemPackingLabelingTypeCode(TradeItemPackingLabelingTypeCode value) {
        this.tradeItemPackingLabelingTypeCode = value;
    }

}
