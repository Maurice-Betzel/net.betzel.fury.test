
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProtocolID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EnvelopeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EndpointURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDeliveryType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "protocolID",
    "envelopeTypeCode",
    "endpointURI"
})
public class MessageDeliveryType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ProtocolID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ProtocolID protocolID;
    @XmlElement(name = "EnvelopeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EnvelopeTypeCode envelopeTypeCode;
    @XmlElement(name = "EndpointURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EndpointURI endpointURI;

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
     * Gets the value of the protocolID property.
     * 
     * @return
     *     possible object is
     *     {@link ProtocolID }
     *     
     */
    public ProtocolID getProtocolID() {
        return protocolID;
    }

    /**
     * Sets the value of the protocolID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolID }
     *     
     */
    public void setProtocolID(ProtocolID value) {
        this.protocolID = value;
    }

    /**
     * Gets the value of the envelopeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopeTypeCode }
     *     
     */
    public EnvelopeTypeCode getEnvelopeTypeCode() {
        return envelopeTypeCode;
    }

    /**
     * Sets the value of the envelopeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopeTypeCode }
     *     
     */
    public void setEnvelopeTypeCode(EnvelopeTypeCode value) {
        this.envelopeTypeCode = value;
    }

    /**
     * Gets the value of the endpointURI property.
     * 
     * @return
     *     possible object is
     *     {@link EndpointURI }
     *     
     */
    public EndpointURI getEndpointURI() {
        return endpointURI;
    }

    /**
     * Sets the value of the endpointURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointURI }
     *     
     */
    public void setEndpointURI(EndpointURI value) {
        this.endpointURI = value;
    }

}
