
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelecommunicationsSupplyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelecommunicationsSupplyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsSupplyType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TelecommunicationsSupplyTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrivacyCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TelecommunicationsSupplyLine" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecommunicationsSupplyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "telecommunicationsSupplyType",
    "telecommunicationsSupplyTypeCode",
    "privacyCode",
    "descriptions",
    "totalAmount",
    "telecommunicationsSupplyLines"
})
@XmlRootElement(name = "TelecommunicationsSupply", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TelecommunicationsSupply
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TelecommunicationsSupplyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TelecommunicationsSupplyType telecommunicationsSupplyType;
    @XmlElement(name = "TelecommunicationsSupplyTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TelecommunicationsSupplyTypeCode telecommunicationsSupplyTypeCode;
    @XmlElement(name = "PrivacyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected PrivacyCode privacyCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "TotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalAmount totalAmount;
    @XmlElement(name = "TelecommunicationsSupplyLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<TelecommunicationsSupplyLine> telecommunicationsSupplyLines;

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
     * Gets the value of the telecommunicationsSupplyType property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsSupplyType }
     *     
     */
    public TelecommunicationsSupplyType getTelecommunicationsSupplyType() {
        return telecommunicationsSupplyType;
    }

    /**
     * Sets the value of the telecommunicationsSupplyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsSupplyType }
     *     
     */
    public void setTelecommunicationsSupplyType(TelecommunicationsSupplyType value) {
        this.telecommunicationsSupplyType = value;
    }

    /**
     * Gets the value of the telecommunicationsSupplyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TelecommunicationsSupplyTypeCode }
     *     
     */
    public TelecommunicationsSupplyTypeCode getTelecommunicationsSupplyTypeCode() {
        return telecommunicationsSupplyTypeCode;
    }

    /**
     * Sets the value of the telecommunicationsSupplyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecommunicationsSupplyTypeCode }
     *     
     */
    public void setTelecommunicationsSupplyTypeCode(TelecommunicationsSupplyTypeCode value) {
        this.telecommunicationsSupplyTypeCode = value;
    }

    /**
     * Gets the value of the privacyCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrivacyCode }
     *     
     */
    public PrivacyCode getPrivacyCode() {
        return privacyCode;
    }

    /**
     * Sets the value of the privacyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivacyCode }
     *     
     */
    public void setPrivacyCode(PrivacyCode value) {
        this.privacyCode = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalAmount }
     *     
     */
    public TotalAmount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalAmount }
     *     
     */
    public void setTotalAmount(TotalAmount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the telecommunicationsSupplyLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecommunicationsSupplyLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecommunicationsSupplyLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecommunicationsSupplyLine }
     * 
     * 
     */
    public List<TelecommunicationsSupplyLine> getTelecommunicationsSupplyLines() {
        if (telecommunicationsSupplyLines == null) {
            telecommunicationsSupplyLines = new ArrayList<TelecommunicationsSupplyLine>();
        }
        return this.telecommunicationsSupplyLines;
    }

}
