
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
 * <p>Java class for RequestedTenderTotalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedTenderTotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedOverallContractAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedOverallFrameworkContractsAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxIncludedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MonetaryScope" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AverageSubsequentContractAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ApplicableTaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedTenderTotalType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "estimatedOverallContractAmount",
    "estimatedOverallFrameworkContractsAmount",
    "totalAmount",
    "taxIncludedIndicator",
    "minimumAmount",
    "maximumAmount",
    "monetaryScopes",
    "averageSubsequentContractAmount",
    "applicableTaxCategories"
})
@XmlRootElement(name = "RequestedTenderTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class RequestedTenderTotal
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "EstimatedOverallContractAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedOverallContractAmount estimatedOverallContractAmount;
    @XmlElement(name = "EstimatedOverallFrameworkContractsAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedOverallFrameworkContractsAmount estimatedOverallFrameworkContractsAmount;
    @XmlElement(name = "TotalAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalAmount totalAmount;
    @XmlElement(name = "TaxIncludedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxIncludedIndicator taxIncludedIndicator;
    @XmlElement(name = "MinimumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumAmount minimumAmount;
    @XmlElement(name = "MaximumAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumAmount maximumAmount;
    @XmlElement(name = "MonetaryScope", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<MonetaryScope> monetaryScopes;
    @XmlElement(name = "AverageSubsequentContractAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AverageSubsequentContractAmount averageSubsequentContractAmount;
    @XmlElement(name = "ApplicableTaxCategory", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TaxCategoryType> applicableTaxCategories;

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
     * Gets the value of the estimatedOverallContractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedOverallContractAmount }
     *     
     */
    public EstimatedOverallContractAmount getEstimatedOverallContractAmount() {
        return estimatedOverallContractAmount;
    }

    /**
     * Sets the value of the estimatedOverallContractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedOverallContractAmount }
     *     
     */
    public void setEstimatedOverallContractAmount(EstimatedOverallContractAmount value) {
        this.estimatedOverallContractAmount = value;
    }

    /**
     * Gets the value of the estimatedOverallFrameworkContractsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedOverallFrameworkContractsAmount }
     *     
     */
    public EstimatedOverallFrameworkContractsAmount getEstimatedOverallFrameworkContractsAmount() {
        return estimatedOverallFrameworkContractsAmount;
    }

    /**
     * Sets the value of the estimatedOverallFrameworkContractsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedOverallFrameworkContractsAmount }
     *     
     */
    public void setEstimatedOverallFrameworkContractsAmount(EstimatedOverallFrameworkContractsAmount value) {
        this.estimatedOverallFrameworkContractsAmount = value;
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
     * Gets the value of the taxIncludedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncludedIndicator }
     *     
     */
    public TaxIncludedIndicator getTaxIncludedIndicator() {
        return taxIncludedIndicator;
    }

    /**
     * Sets the value of the taxIncludedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncludedIndicator }
     *     
     */
    public void setTaxIncludedIndicator(TaxIncludedIndicator value) {
        this.taxIncludedIndicator = value;
    }

    /**
     * Gets the value of the minimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumAmount }
     *     
     */
    public MinimumAmount getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAmount }
     *     
     */
    public void setMinimumAmount(MinimumAmount value) {
        this.minimumAmount = value;
    }

    /**
     * Gets the value of the maximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumAmount }
     *     
     */
    public MaximumAmount getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumAmount }
     *     
     */
    public void setMaximumAmount(MaximumAmount value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the monetaryScopes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryScopes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryScopes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryScope }
     * 
     * 
     */
    public List<MonetaryScope> getMonetaryScopes() {
        if (monetaryScopes == null) {
            monetaryScopes = new ArrayList<MonetaryScope>();
        }
        return this.monetaryScopes;
    }

    /**
     * Gets the value of the averageSubsequentContractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AverageSubsequentContractAmount }
     *     
     */
    public AverageSubsequentContractAmount getAverageSubsequentContractAmount() {
        return averageSubsequentContractAmount;
    }

    /**
     * Sets the value of the averageSubsequentContractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageSubsequentContractAmount }
     *     
     */
    public void setAverageSubsequentContractAmount(AverageSubsequentContractAmount value) {
        this.averageSubsequentContractAmount = value;
    }

    /**
     * Gets the value of the applicableTaxCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableTaxCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableTaxCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     * 
     * 
     */
    public List<TaxCategoryType> getApplicableTaxCategories() {
        if (applicableTaxCategories == null) {
            applicableTaxCategories = new ArrayList<TaxCategoryType>();
        }
        return this.applicableTaxCategories;
    }

}
