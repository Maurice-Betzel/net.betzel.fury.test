
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
 * <p>Java class for TransportExecutionTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportExecutionTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportUserSpecialTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportServiceProviderSpecialTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ChangeConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BonusPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommissionPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PenaltyPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalEmission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}NotificationRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ServiceChargePaymentTerms" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportExecutionTermsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "transportUserSpecialTerms",
    "transportServiceProviderSpecialTerms",
    "changeConditions",
    "paymentTerms",
    "deliveryTerms",
    "bonusPaymentTerms",
    "commissionPaymentTerms",
    "penaltyPaymentTerms",
    "environmentalEmissions",
    "notificationRequirements",
    "serviceChargePaymentTerms"
})
@XmlRootElement(name = "TransportExecutionTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TransportExecutionTerms
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TransportUserSpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<TransportUserSpecialTerms> transportUserSpecialTerms;
    @XmlElement(name = "TransportServiceProviderSpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<TransportServiceProviderSpecialTerms> transportServiceProviderSpecialTerms;
    @XmlElement(name = "ChangeConditions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ChangeConditions> changeConditions;
    @XmlElement(name = "PaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PaymentTermsType> paymentTerms;
    @XmlElement(name = "DeliveryTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DeliveryTerms> deliveryTerms;
    @XmlElement(name = "BonusPaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentTermsType bonusPaymentTerms;
    @XmlElement(name = "CommissionPaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentTermsType commissionPaymentTerms;
    @XmlElement(name = "PenaltyPaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentTermsType penaltyPaymentTerms;
    @XmlElement(name = "EnvironmentalEmission", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EnvironmentalEmission> environmentalEmissions;
    @XmlElement(name = "NotificationRequirement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<NotificationRequirement> notificationRequirements;
    @XmlElement(name = "ServiceChargePaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PaymentTermsType serviceChargePaymentTerms;

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
     * Gets the value of the transportUserSpecialTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportUserSpecialTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportUserSpecialTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportUserSpecialTerms }
     * 
     * 
     */
    public List<TransportUserSpecialTerms> getTransportUserSpecialTerms() {
        if (transportUserSpecialTerms == null) {
            transportUserSpecialTerms = new ArrayList<TransportUserSpecialTerms>();
        }
        return this.transportUserSpecialTerms;
    }

    /**
     * Gets the value of the transportServiceProviderSpecialTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportServiceProviderSpecialTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportServiceProviderSpecialTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportServiceProviderSpecialTerms }
     * 
     * 
     */
    public List<TransportServiceProviderSpecialTerms> getTransportServiceProviderSpecialTerms() {
        if (transportServiceProviderSpecialTerms == null) {
            transportServiceProviderSpecialTerms = new ArrayList<TransportServiceProviderSpecialTerms>();
        }
        return this.transportServiceProviderSpecialTerms;
    }

    /**
     * Gets the value of the changeConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeConditions }
     * 
     * 
     */
    public List<ChangeConditions> getChangeConditions() {
        if (changeConditions == null) {
            changeConditions = new ArrayList<ChangeConditions>();
        }
        return this.changeConditions;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTermsType }
     * 
     * 
     */
    public List<PaymentTermsType> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTermsType>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the deliveryTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryTerms }
     * 
     * 
     */
    public List<DeliveryTerms> getDeliveryTerms() {
        if (deliveryTerms == null) {
            deliveryTerms = new ArrayList<DeliveryTerms>();
        }
        return this.deliveryTerms;
    }

    /**
     * Gets the value of the bonusPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getBonusPaymentTerms() {
        return bonusPaymentTerms;
    }

    /**
     * Sets the value of the bonusPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setBonusPaymentTerms(PaymentTermsType value) {
        this.bonusPaymentTerms = value;
    }

    /**
     * Gets the value of the commissionPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getCommissionPaymentTerms() {
        return commissionPaymentTerms;
    }

    /**
     * Sets the value of the commissionPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setCommissionPaymentTerms(PaymentTermsType value) {
        this.commissionPaymentTerms = value;
    }

    /**
     * Gets the value of the penaltyPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getPenaltyPaymentTerms() {
        return penaltyPaymentTerms;
    }

    /**
     * Sets the value of the penaltyPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setPenaltyPaymentTerms(PaymentTermsType value) {
        this.penaltyPaymentTerms = value;
    }

    /**
     * Gets the value of the environmentalEmissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalEmissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalEmissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentalEmission }
     * 
     * 
     */
    public List<EnvironmentalEmission> getEnvironmentalEmissions() {
        if (environmentalEmissions == null) {
            environmentalEmissions = new ArrayList<EnvironmentalEmission>();
        }
        return this.environmentalEmissions;
    }

    /**
     * Gets the value of the notificationRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationRequirement }
     * 
     * 
     */
    public List<NotificationRequirement> getNotificationRequirements() {
        if (notificationRequirements == null) {
            notificationRequirements = new ArrayList<NotificationRequirement>();
        }
        return this.notificationRequirements;
    }

    /**
     * Gets the value of the serviceChargePaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermsType }
     *     
     */
    public PaymentTermsType getServiceChargePaymentTerms() {
        return serviceChargePaymentTerms;
    }

    /**
     * Sets the value of the serviceChargePaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermsType }
     *     
     */
    public void setServiceChargePaymentTerms(PaymentTermsType value) {
        this.serviceChargePaymentTerms = value;
    }

}
