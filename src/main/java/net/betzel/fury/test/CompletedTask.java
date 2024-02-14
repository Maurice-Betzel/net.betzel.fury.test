
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletedTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletedTaskType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AnnualAverageAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTaskAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PartyCapacityAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EvidenceSupplied" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Period" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RecipientCustomerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedTaskType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "annualAverageAmount",
    "totalTaskAmount",
    "partyCapacityAmount",
    "descriptions",
    "evidenceSupplieds",
    "period",
    "recipientCustomerParty"
})
@XmlRootElement(name = "CompletedTask", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class CompletedTask
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "AnnualAverageAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AnnualAverageAmount annualAverageAmount;
    @XmlElement(name = "TotalTaskAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalTaskAmount totalTaskAmount;
    @XmlElement(name = "PartyCapacityAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PartyCapacityAmount partyCapacityAmount;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "EvidenceSupplied", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EvidenceSupplied> evidenceSupplieds;
    @XmlElement(name = "Period", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType period;
    @XmlElement(name = "RecipientCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CustomerPartyType recipientCustomerParty;

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
     * Gets the value of the annualAverageAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AnnualAverageAmount }
     *     
     */
    public AnnualAverageAmount getAnnualAverageAmount() {
        return annualAverageAmount;
    }

    /**
     * Sets the value of the annualAverageAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnualAverageAmount }
     *     
     */
    public void setAnnualAverageAmount(AnnualAverageAmount value) {
        this.annualAverageAmount = value;
    }

    /**
     * Gets the value of the totalTaskAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTaskAmount }
     *     
     */
    public TotalTaskAmount getTotalTaskAmount() {
        return totalTaskAmount;
    }

    /**
     * Sets the value of the totalTaskAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTaskAmount }
     *     
     */
    public void setTotalTaskAmount(TotalTaskAmount value) {
        this.totalTaskAmount = value;
    }

    /**
     * Gets the value of the partyCapacityAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCapacityAmount }
     *     
     */
    public PartyCapacityAmount getPartyCapacityAmount() {
        return partyCapacityAmount;
    }

    /**
     * Sets the value of the partyCapacityAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCapacityAmount }
     *     
     */
    public void setPartyCapacityAmount(PartyCapacityAmount value) {
        this.partyCapacityAmount = value;
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
     * Gets the value of the evidenceSupplieds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidenceSupplieds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidenceSupplieds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidenceSupplied }
     * 
     * 
     */
    public List<EvidenceSupplied> getEvidenceSupplieds() {
        if (evidenceSupplieds == null) {
            evidenceSupplieds = new ArrayList<EvidenceSupplied>();
        }
        return this.evidenceSupplieds;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

    /**
     * Gets the value of the recipientCustomerParty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPartyType }
     *     
     */
    public CustomerPartyType getRecipientCustomerParty() {
        return recipientCustomerParty;
    }

    /**
     * Sets the value of the recipientCustomerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPartyType }
     *     
     */
    public void setRecipientCustomerParty(CustomerPartyType value) {
        this.recipientCustomerParty = value;
    }

}
