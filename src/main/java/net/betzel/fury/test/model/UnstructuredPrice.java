
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnstructuredPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PriceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxInclusivePriceAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimeAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnstructuredPriceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "priceAmount",
    "taxInclusivePriceAmount",
    "timeAmount"
})
@XmlRootElement(name = "UnstructuredPrice", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class UnstructuredPrice
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "PriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PriceAmount priceAmount;
    @XmlElement(name = "TaxInclusivePriceAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxInclusivePriceAmount taxInclusivePriceAmount;
    @XmlElement(name = "TimeAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TimeAmount timeAmount;

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
     * Gets the value of the priceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PriceAmount }
     *     
     */
    public PriceAmount getPriceAmount() {
        return priceAmount;
    }

    /**
     * Sets the value of the priceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAmount }
     *     
     */
    public void setPriceAmount(PriceAmount value) {
        this.priceAmount = value;
    }

    /**
     * Gets the value of the taxInclusivePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInclusivePriceAmount }
     *     
     */
    public TaxInclusivePriceAmount getTaxInclusivePriceAmount() {
        return taxInclusivePriceAmount;
    }

    /**
     * Sets the value of the taxInclusivePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInclusivePriceAmount }
     *     
     */
    public void setTaxInclusivePriceAmount(TaxInclusivePriceAmount value) {
        this.taxInclusivePriceAmount = value;
    }

    /**
     * Gets the value of the timeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TimeAmount }
     *     
     */
    public TimeAmount getTimeAmount() {
        return timeAmount;
    }

    /**
     * Sets the value of the timeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeAmount }
     *     
     */
    public void setTimeAmount(TimeAmount value) {
        this.timeAmount = value;
    }

}
