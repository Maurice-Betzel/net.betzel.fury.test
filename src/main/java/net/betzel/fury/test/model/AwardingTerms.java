
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
 * <p>Java class for AwardingTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardingTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeightingAlgorithmCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TechnicalCommitteeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LowTendersDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrizeIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PrizeDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PaymentDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FollowupContractIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BindingOnBuyerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NoFurtherNegotiationIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardingCriterion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TechnicalCommitteePerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Prize" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardingTermsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "weightingAlgorithmCode",
    "descriptions",
    "technicalCommitteeDescriptions",
    "lowTendersDescriptions",
    "prizeIndicator",
    "prizeDescriptions",
    "paymentDescriptions",
    "followupContractIndicator",
    "bindingOnBuyerIndicator",
    "noFurtherNegotiationIndicator",
    "awardingCriterions",
    "technicalCommitteePersons",
    "prizes"
})
@XmlRootElement(name = "AwardingTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class AwardingTerms
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "WeightingAlgorithmCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WeightingAlgorithmCode weightingAlgorithmCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "TechnicalCommitteeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<TechnicalCommitteeDescription> technicalCommitteeDescriptions;
    @XmlElement(name = "LowTendersDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<LowTendersDescription> lowTendersDescriptions;
    @XmlElement(name = "PrizeIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PrizeIndicator prizeIndicator;
    @XmlElement(name = "PrizeDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PrizeDescription> prizeDescriptions;
    @XmlElement(name = "PaymentDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PaymentDescription> paymentDescriptions;
    @XmlElement(name = "FollowupContractIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FollowupContractIndicator followupContractIndicator;
    @XmlElement(name = "BindingOnBuyerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BindingOnBuyerIndicator bindingOnBuyerIndicator;
    @XmlElement(name = "NoFurtherNegotiationIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NoFurtherNegotiationIndicator noFurtherNegotiationIndicator;
    @XmlElement(name = "AwardingCriterion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AwardingCriterionType> awardingCriterions;
    @XmlElement(name = "TechnicalCommitteePerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PersonType> technicalCommitteePersons;
    @XmlElement(name = "Prize", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<Prize> prizes;

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
     * Gets the value of the weightingAlgorithmCode property.
     * 
     * @return
     *     possible object is
     *     {@link WeightingAlgorithmCode }
     *     
     */
    public WeightingAlgorithmCode getWeightingAlgorithmCode() {
        return weightingAlgorithmCode;
    }

    /**
     * Sets the value of the weightingAlgorithmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightingAlgorithmCode }
     *     
     */
    public void setWeightingAlgorithmCode(WeightingAlgorithmCode value) {
        this.weightingAlgorithmCode = value;
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
     * Gets the value of the technicalCommitteeDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalCommitteeDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalCommitteeDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalCommitteeDescription }
     * 
     * 
     */
    public List<TechnicalCommitteeDescription> getTechnicalCommitteeDescriptions() {
        if (technicalCommitteeDescriptions == null) {
            technicalCommitteeDescriptions = new ArrayList<TechnicalCommitteeDescription>();
        }
        return this.technicalCommitteeDescriptions;
    }

    /**
     * Gets the value of the lowTendersDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowTendersDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowTendersDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LowTendersDescription }
     * 
     * 
     */
    public List<LowTendersDescription> getLowTendersDescriptions() {
        if (lowTendersDescriptions == null) {
            lowTendersDescriptions = new ArrayList<LowTendersDescription>();
        }
        return this.lowTendersDescriptions;
    }

    /**
     * Gets the value of the prizeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PrizeIndicator }
     *     
     */
    public PrizeIndicator getPrizeIndicator() {
        return prizeIndicator;
    }

    /**
     * Sets the value of the prizeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrizeIndicator }
     *     
     */
    public void setPrizeIndicator(PrizeIndicator value) {
        this.prizeIndicator = value;
    }

    /**
     * Gets the value of the prizeDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prizeDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizeDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrizeDescription }
     * 
     * 
     */
    public List<PrizeDescription> getPrizeDescriptions() {
        if (prizeDescriptions == null) {
            prizeDescriptions = new ArrayList<PrizeDescription>();
        }
        return this.prizeDescriptions;
    }

    /**
     * Gets the value of the paymentDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDescription }
     * 
     * 
     */
    public List<PaymentDescription> getPaymentDescriptions() {
        if (paymentDescriptions == null) {
            paymentDescriptions = new ArrayList<PaymentDescription>();
        }
        return this.paymentDescriptions;
    }

    /**
     * Gets the value of the followupContractIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link FollowupContractIndicator }
     *     
     */
    public FollowupContractIndicator getFollowupContractIndicator() {
        return followupContractIndicator;
    }

    /**
     * Sets the value of the followupContractIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FollowupContractIndicator }
     *     
     */
    public void setFollowupContractIndicator(FollowupContractIndicator value) {
        this.followupContractIndicator = value;
    }

    /**
     * Gets the value of the bindingOnBuyerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BindingOnBuyerIndicator }
     *     
     */
    public BindingOnBuyerIndicator getBindingOnBuyerIndicator() {
        return bindingOnBuyerIndicator;
    }

    /**
     * Sets the value of the bindingOnBuyerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingOnBuyerIndicator }
     *     
     */
    public void setBindingOnBuyerIndicator(BindingOnBuyerIndicator value) {
        this.bindingOnBuyerIndicator = value;
    }

    /**
     * Gets the value of the noFurtherNegotiationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link NoFurtherNegotiationIndicator }
     *     
     */
    public NoFurtherNegotiationIndicator getNoFurtherNegotiationIndicator() {
        return noFurtherNegotiationIndicator;
    }

    /**
     * Sets the value of the noFurtherNegotiationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoFurtherNegotiationIndicator }
     *     
     */
    public void setNoFurtherNegotiationIndicator(NoFurtherNegotiationIndicator value) {
        this.noFurtherNegotiationIndicator = value;
    }

    /**
     * Gets the value of the awardingCriterions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the awardingCriterions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAwardingCriterions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AwardingCriterionType }
     * 
     * 
     */
    public List<AwardingCriterionType> getAwardingCriterions() {
        if (awardingCriterions == null) {
            awardingCriterions = new ArrayList<AwardingCriterionType>();
        }
        return this.awardingCriterions;
    }

    /**
     * Gets the value of the technicalCommitteePersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalCommitteePersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalCommitteePersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonType }
     * 
     * 
     */
    public List<PersonType> getTechnicalCommitteePersons() {
        if (technicalCommitteePersons == null) {
            technicalCommitteePersons = new ArrayList<PersonType>();
        }
        return this.technicalCommitteePersons;
    }

    /**
     * Gets the value of the prizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Prize }
     * 
     * 
     */
    public List<Prize> getPrizes() {
        if (prizes == null) {
            prizes = new ArrayList<Prize>();
        }
        return this.prizes;
    }

}
