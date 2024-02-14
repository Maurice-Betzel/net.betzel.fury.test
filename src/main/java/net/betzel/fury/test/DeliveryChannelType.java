
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryChannelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryChannelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetworkID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ParticipantID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TestIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalCertificate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DigitalMessageDelivery" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryChannelType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "networkID",
    "participantID",
    "testIndicator",
    "digitalCertificate",
    "digitalMessageDelivery"
})
public class DeliveryChannelType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "NetworkID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetworkID networkID;
    @XmlElement(name = "ParticipantID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ParticipantID participantID;
    @XmlElement(name = "TestIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TestIndicator testIndicator;
    @XmlElement(name = "DigitalCertificate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CertificateType digitalCertificate;
    @XmlElement(name = "DigitalMessageDelivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected MessageDeliveryType digitalMessageDelivery;

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
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkID }
     *     
     */
    public NetworkID getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkID }
     *     
     */
    public void setNetworkID(NetworkID value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the participantID property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantID }
     *     
     */
    public ParticipantID getParticipantID() {
        return participantID;
    }

    /**
     * Sets the value of the participantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantID }
     *     
     */
    public void setParticipantID(ParticipantID value) {
        this.participantID = value;
    }

    /**
     * Gets the value of the testIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TestIndicator }
     *     
     */
    public TestIndicator getTestIndicator() {
        return testIndicator;
    }

    /**
     * Sets the value of the testIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestIndicator }
     *     
     */
    public void setTestIndicator(TestIndicator value) {
        this.testIndicator = value;
    }

    /**
     * Gets the value of the digitalCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType }
     *     
     */
    public CertificateType getDigitalCertificate() {
        return digitalCertificate;
    }

    /**
     * Sets the value of the digitalCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType }
     *     
     */
    public void setDigitalCertificate(CertificateType value) {
        this.digitalCertificate = value;
    }

    /**
     * Gets the value of the digitalMessageDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDeliveryType }
     *     
     */
    public MessageDeliveryType getDigitalMessageDelivery() {
        return digitalMessageDelivery;
    }

    /**
     * Sets the value of the digitalMessageDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDeliveryType }
     *     
     */
    public void setDigitalMessageDelivery(MessageDeliveryType value) {
        this.digitalMessageDelivery = value;
    }

}
