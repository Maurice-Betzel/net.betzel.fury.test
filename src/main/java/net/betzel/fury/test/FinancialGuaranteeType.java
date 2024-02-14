
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialGuaranteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialGuaranteeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GuaranteeTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LiabilityAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AmountRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ConstitutionPeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialGuaranteeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "guaranteeTypeCode",
    "descriptions",
    "liabilityAmount",
    "amountRate",
    "constitutionPeriod"
})
public class FinancialGuaranteeType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "GuaranteeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected GuaranteeTypeCode guaranteeTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "LiabilityAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LiabilityAmount liabilityAmount;
    @XmlElement(name = "AmountRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AmountRate amountRate;
    @XmlElement(name = "ConstitutionPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType constitutionPeriod;

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
     * Gets the value of the guaranteeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeTypeCode }
     *     
     */
    public GuaranteeTypeCode getGuaranteeTypeCode() {
        return guaranteeTypeCode;
    }

    /**
     * Sets the value of the guaranteeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeTypeCode }
     *     
     */
    public void setGuaranteeTypeCode(GuaranteeTypeCode value) {
        this.guaranteeTypeCode = value;
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
     * Gets the value of the liabilityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LiabilityAmount }
     *     
     */
    public LiabilityAmount getLiabilityAmount() {
        return liabilityAmount;
    }

    /**
     * Sets the value of the liabilityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabilityAmount }
     *     
     */
    public void setLiabilityAmount(LiabilityAmount value) {
        this.liabilityAmount = value;
    }

    /**
     * Gets the value of the amountRate property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRate }
     *     
     */
    public AmountRate getAmountRate() {
        return amountRate;
    }

    /**
     * Sets the value of the amountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRate }
     *     
     */
    public void setAmountRate(AmountRate value) {
        this.amountRate = value;
    }

    /**
     * Gets the value of the constitutionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getConstitutionPeriod() {
        return constitutionPeriod;
    }

    /**
     * Sets the value of the constitutionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setConstitutionPeriod(PeriodType value) {
        this.constitutionPeriod = value;
    }

}
