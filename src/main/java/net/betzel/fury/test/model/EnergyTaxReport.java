
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyTaxReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyTaxReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyOnAccountAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxEnergyBalanceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyTaxReportType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "taxEnergyAmount",
    "taxEnergyOnAccountAmount",
    "taxEnergyBalanceAmount",
    "taxScheme"
})
@XmlRootElement(name = "EnergyTaxReport", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class EnergyTaxReport
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TaxEnergyAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxEnergyAmount taxEnergyAmount;
    @XmlElement(name = "TaxEnergyOnAccountAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxEnergyOnAccountAmount taxEnergyOnAccountAmount;
    @XmlElement(name = "TaxEnergyBalanceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxEnergyBalanceAmount taxEnergyBalanceAmount;
    @XmlElement(name = "TaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected TaxScheme taxScheme;

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
     * Gets the value of the taxEnergyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyAmount }
     *     
     */
    public TaxEnergyAmount getTaxEnergyAmount() {
        return taxEnergyAmount;
    }

    /**
     * Sets the value of the taxEnergyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyAmount }
     *     
     */
    public void setTaxEnergyAmount(TaxEnergyAmount value) {
        this.taxEnergyAmount = value;
    }

    /**
     * Gets the value of the taxEnergyOnAccountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyOnAccountAmount }
     *     
     */
    public TaxEnergyOnAccountAmount getTaxEnergyOnAccountAmount() {
        return taxEnergyOnAccountAmount;
    }

    /**
     * Sets the value of the taxEnergyOnAccountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyOnAccountAmount }
     *     
     */
    public void setTaxEnergyOnAccountAmount(TaxEnergyOnAccountAmount value) {
        this.taxEnergyOnAccountAmount = value;
    }

    /**
     * Gets the value of the taxEnergyBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxEnergyBalanceAmount }
     *     
     */
    public TaxEnergyBalanceAmount getTaxEnergyBalanceAmount() {
        return taxEnergyBalanceAmount;
    }

    /**
     * Sets the value of the taxEnergyBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxEnergyBalanceAmount }
     *     
     */
    public void setTaxEnergyBalanceAmount(TaxEnergyBalanceAmount value) {
        this.taxEnergyBalanceAmount = value;
    }

    /**
     * Gets the value of the taxScheme property.
     * 
     * @return
     *     possible object is
     *     {@link TaxScheme }
     *     
     */
    public TaxScheme getTaxScheme() {
        return taxScheme;
    }

    /**
     * Sets the value of the taxScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxScheme }
     *     
     */
    public void setTaxScheme(TaxScheme value) {
        this.taxScheme = value;
    }

}
