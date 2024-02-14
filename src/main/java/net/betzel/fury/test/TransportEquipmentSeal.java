
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportEquipmentSealType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportEquipmentSealType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SealIssuerTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Condition" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SealStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SealingPartyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportEquipmentSealType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "sealIssuerTypeCode",
    "condition",
    "sealStatusCode",
    "sealingPartyType"
})
@XmlRootElement(name = "TransportEquipmentSeal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TransportEquipmentSeal
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ID id;
    @XmlElement(name = "SealIssuerTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SealIssuerTypeCode sealIssuerTypeCode;
    @XmlElement(name = "Condition", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Condition2 condition;
    @XmlElement(name = "SealStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SealStatusCode sealStatusCode;
    @XmlElement(name = "SealingPartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SealingPartyType sealingPartyType;

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
     * Gets the value of the sealIssuerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SealIssuerTypeCode }
     *     
     */
    public SealIssuerTypeCode getSealIssuerTypeCode() {
        return sealIssuerTypeCode;
    }

    /**
     * Sets the value of the sealIssuerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SealIssuerTypeCode }
     *     
     */
    public void setSealIssuerTypeCode(SealIssuerTypeCode value) {
        this.sealIssuerTypeCode = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link Condition2 }
     *     
     */
    public Condition2 getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Condition2 }
     *     
     */
    public void setCondition(Condition2 value) {
        this.condition = value;
    }

    /**
     * Gets the value of the sealStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link SealStatusCode }
     *     
     */
    public SealStatusCode getSealStatusCode() {
        return sealStatusCode;
    }

    /**
     * Sets the value of the sealStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SealStatusCode }
     *     
     */
    public void setSealStatusCode(SealStatusCode value) {
        this.sealStatusCode = value;
    }

    /**
     * Gets the value of the sealingPartyType property.
     * 
     * @return
     *     possible object is
     *     {@link SealingPartyType }
     *     
     */
    public SealingPartyType getSealingPartyType() {
        return sealingPartyType;
    }

    /**
     * Sets the value of the sealingPartyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SealingPartyType }
     *     
     */
    public void setSealingPartyType(SealingPartyType value) {
        this.sealingPartyType = value;
    }

}
