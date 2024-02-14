
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BatchQuantity"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsumerUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryUnitType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "batchQuantity",
    "consumerUnitQuantity",
    "hazardousRiskIndicator"
})
public class DeliveryUnitType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "BatchQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected BatchQuantity batchQuantity;
    @XmlElement(name = "ConsumerUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsumerUnitQuantity consumerUnitQuantity;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HazardousRiskIndicator hazardousRiskIndicator;

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
     * Gets the value of the batchQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BatchQuantity }
     *     
     */
    public BatchQuantity getBatchQuantity() {
        return batchQuantity;
    }

    /**
     * Sets the value of the batchQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchQuantity }
     *     
     */
    public void setBatchQuantity(BatchQuantity value) {
        this.batchQuantity = value;
    }

    /**
     * Gets the value of the consumerUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerUnitQuantity }
     *     
     */
    public ConsumerUnitQuantity getConsumerUnitQuantity() {
        return consumerUnitQuantity;
    }

    /**
     * Sets the value of the consumerUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerUnitQuantity }
     *     
     */
    public void setConsumerUnitQuantity(ConsumerUnitQuantity value) {
        this.consumerUnitQuantity = value;
    }

    /**
     * Gets the value of the hazardousRiskIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public HazardousRiskIndicator getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Sets the value of the hazardousRiskIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicator value) {
        this.hazardousRiskIndicator = value;
    }

}
