
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubcontractTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubcontractTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Rate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UnknownPriceIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Amount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubcontractingConditionsCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumPercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumPercent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubcontractTermsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "rate",
    "unknownPriceIndicator",
    "descriptions",
    "amount",
    "subcontractingConditionsCode",
    "maximumPercent",
    "minimumPercent"
})
public class SubcontractTermsType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "Rate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Rate rate;
    @XmlElement(name = "UnknownPriceIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UnknownPriceIndicator unknownPriceIndicator;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "Amount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Amount amount;
    @XmlElement(name = "SubcontractingConditionsCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SubcontractingConditionsCode subcontractingConditionsCode;
    @XmlElement(name = "MaximumPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumPercent maximumPercent;
    @XmlElement(name = "MinimumPercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumPercent minimumPercent;

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
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * Gets the value of the unknownPriceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link UnknownPriceIndicator }
     *     
     */
    public UnknownPriceIndicator getUnknownPriceIndicator() {
        return unknownPriceIndicator;
    }

    /**
     * Sets the value of the unknownPriceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownPriceIndicator }
     *     
     */
    public void setUnknownPriceIndicator(UnknownPriceIndicator value) {
        this.unknownPriceIndicator = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the subcontractingConditionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubcontractingConditionsCode }
     *     
     */
    public SubcontractingConditionsCode getSubcontractingConditionsCode() {
        return subcontractingConditionsCode;
    }

    /**
     * Sets the value of the subcontractingConditionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcontractingConditionsCode }
     *     
     */
    public void setSubcontractingConditionsCode(SubcontractingConditionsCode value) {
        this.subcontractingConditionsCode = value;
    }

    /**
     * Gets the value of the maximumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumPercent }
     *     
     */
    public MaximumPercent getMaximumPercent() {
        return maximumPercent;
    }

    /**
     * Sets the value of the maximumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumPercent }
     *     
     */
    public void setMaximumPercent(MaximumPercent value) {
        this.maximumPercent = value;
    }

    /**
     * Gets the value of the minimumPercent property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumPercent }
     *     
     */
    public MinimumPercent getMinimumPercent() {
        return minimumPercent;
    }

    /**
     * Sets the value of the minimumPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumPercent }
     *     
     */
    public void setMinimumPercent(MinimumPercent value) {
        this.minimumPercent = value;
    }

}
