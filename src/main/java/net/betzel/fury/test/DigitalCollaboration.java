
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigitalCollaborationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalCollaborationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SendingDigitalService" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceivingDigitalService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalCollaborationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "sendingDigitalService",
    "receivingDigitalService"
})
@XmlRootElement(name = "DigitalCollaboration", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class DigitalCollaboration
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "SendingDigitalService", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DigitalServiceType sendingDigitalService;
    @XmlElement(name = "ReceivingDigitalService", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DigitalServiceType receivingDigitalService;

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
     * Gets the value of the sendingDigitalService property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalServiceType }
     *     
     */
    public DigitalServiceType getSendingDigitalService() {
        return sendingDigitalService;
    }

    /**
     * Sets the value of the sendingDigitalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalServiceType }
     *     
     */
    public void setSendingDigitalService(DigitalServiceType value) {
        this.sendingDigitalService = value;
    }

    /**
     * Gets the value of the receivingDigitalService property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalServiceType }
     *     
     */
    public DigitalServiceType getReceivingDigitalService() {
        return receivingDigitalService;
    }

    /**
     * Sets the value of the receivingDigitalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalServiceType }
     *     
     */
    public void setReceivingDigitalService(DigitalServiceType value) {
        this.receivingDigitalService = value;
    }

}
