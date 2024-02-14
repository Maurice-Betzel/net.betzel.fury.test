
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
 * <p>Java class for PostAwardProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostAwardProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicCatalogueUsageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicInvoiceAcceptedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicOrderUsageIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ElectronicPaymentUsageIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostAwardProcessType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "electronicCatalogueUsageIndicator",
    "electronicInvoiceAcceptedIndicator",
    "electronicOrderUsageIndicator",
    "electronicPaymentUsageIndicators"
})
@XmlRootElement(name = "PostAwardProcess", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class PostAwardProcess
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ElectronicCatalogueUsageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ElectronicCatalogueUsageIndicator electronicCatalogueUsageIndicator;
    @XmlElement(name = "ElectronicInvoiceAcceptedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ElectronicInvoiceAcceptedIndicator electronicInvoiceAcceptedIndicator;
    @XmlElement(name = "ElectronicOrderUsageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ElectronicOrderUsageIndicator electronicOrderUsageIndicator;
    @XmlElement(name = "ElectronicPaymentUsageIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ElectronicPaymentUsageIndicator> electronicPaymentUsageIndicators;

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
     * Gets the value of the electronicCatalogueUsageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicCatalogueUsageIndicator }
     *     
     */
    public ElectronicCatalogueUsageIndicator getElectronicCatalogueUsageIndicator() {
        return electronicCatalogueUsageIndicator;
    }

    /**
     * Sets the value of the electronicCatalogueUsageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicCatalogueUsageIndicator }
     *     
     */
    public void setElectronicCatalogueUsageIndicator(ElectronicCatalogueUsageIndicator value) {
        this.electronicCatalogueUsageIndicator = value;
    }

    /**
     * Gets the value of the electronicInvoiceAcceptedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicInvoiceAcceptedIndicator }
     *     
     */
    public ElectronicInvoiceAcceptedIndicator getElectronicInvoiceAcceptedIndicator() {
        return electronicInvoiceAcceptedIndicator;
    }

    /**
     * Sets the value of the electronicInvoiceAcceptedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicInvoiceAcceptedIndicator }
     *     
     */
    public void setElectronicInvoiceAcceptedIndicator(ElectronicInvoiceAcceptedIndicator value) {
        this.electronicInvoiceAcceptedIndicator = value;
    }

    /**
     * Gets the value of the electronicOrderUsageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicOrderUsageIndicator }
     *     
     */
    public ElectronicOrderUsageIndicator getElectronicOrderUsageIndicator() {
        return electronicOrderUsageIndicator;
    }

    /**
     * Sets the value of the electronicOrderUsageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicOrderUsageIndicator }
     *     
     */
    public void setElectronicOrderUsageIndicator(ElectronicOrderUsageIndicator value) {
        this.electronicOrderUsageIndicator = value;
    }

    /**
     * Gets the value of the electronicPaymentUsageIndicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicPaymentUsageIndicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicPaymentUsageIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicPaymentUsageIndicator }
     * 
     * 
     */
    public List<ElectronicPaymentUsageIndicator> getElectronicPaymentUsageIndicators() {
        if (electronicPaymentUsageIndicators == null) {
            electronicPaymentUsageIndicators = new ArrayList<ElectronicPaymentUsageIndicator>();
        }
        return this.electronicPaymentUsageIndicators;
    }

}
