
package net.betzel.fury.test.model;

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
 * <p>Java class for ContractExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OptionsDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RenewalsIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OptionValidityPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Renewal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractExtensionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "optionsDescriptions",
    "minimumNumberNumeric",
    "maximumNumberNumeric",
    "renewalsIndicator",
    "optionValidityPeriod",
    "renewals"
})
@XmlRootElement(name = "ContractExtension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ContractExtension
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "OptionsDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<OptionsDescription> optionsDescriptions;
    @XmlElement(name = "MinimumNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumNumberNumeric minimumNumberNumeric;
    @XmlElement(name = "MaximumNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumNumberNumeric maximumNumberNumeric;
    @XmlElement(name = "RenewalsIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RenewalsIndicator renewalsIndicator;
    @XmlElement(name = "OptionValidityPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType optionValidityPeriod;
    @XmlElement(name = "Renewal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<Renewal> renewals;

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
     * Gets the value of the optionsDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionsDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionsDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionsDescription }
     * 
     * 
     */
    public List<OptionsDescription> getOptionsDescriptions() {
        if (optionsDescriptions == null) {
            optionsDescriptions = new ArrayList<OptionsDescription>();
        }
        return this.optionsDescriptions;
    }

    /**
     * Gets the value of the minimumNumberNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumNumberNumeric }
     *     
     */
    public MinimumNumberNumeric getMinimumNumberNumeric() {
        return minimumNumberNumeric;
    }

    /**
     * Sets the value of the minimumNumberNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumNumberNumeric }
     *     
     */
    public void setMinimumNumberNumeric(MinimumNumberNumeric value) {
        this.minimumNumberNumeric = value;
    }

    /**
     * Gets the value of the maximumNumberNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumNumberNumeric }
     *     
     */
    public MaximumNumberNumeric getMaximumNumberNumeric() {
        return maximumNumberNumeric;
    }

    /**
     * Sets the value of the maximumNumberNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumNumberNumeric }
     *     
     */
    public void setMaximumNumberNumeric(MaximumNumberNumeric value) {
        this.maximumNumberNumeric = value;
    }

    /**
     * Gets the value of the renewalsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link RenewalsIndicator }
     *     
     */
    public RenewalsIndicator getRenewalsIndicator() {
        return renewalsIndicator;
    }

    /**
     * Sets the value of the renewalsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenewalsIndicator }
     *     
     */
    public void setRenewalsIndicator(RenewalsIndicator value) {
        this.renewalsIndicator = value;
    }

    /**
     * Gets the value of the optionValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getOptionValidityPeriod() {
        return optionValidityPeriod;
    }

    /**
     * Sets the value of the optionValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setOptionValidityPeriod(PeriodType value) {
        this.optionValidityPeriod = value;
    }

    /**
     * Gets the value of the renewals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the renewals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRenewals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Renewal }
     * 
     * 
     */
    public List<Renewal> getRenewals() {
        if (renewals == null) {
            renewals = new ArrayList<Renewal>();
        }
        return this.renewals;
    }

}
