
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionalEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionalEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PromotionalEventTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SubmissionDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FirstShipmentAvailibilityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LatestProposalAcceptanceDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PromotionalSpecification" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalEventType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "promotionalEventTypeCode",
    "submissionDate",
    "firstShipmentAvailibilityDate",
    "latestProposalAcceptanceDate",
    "promotionalSpecifications"
})
@XmlRootElement(name = "PromotionalEvent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class PromotionalEvent
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "PromotionalEventTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected PromotionalEventTypeCode promotionalEventTypeCode;
    @XmlElement(name = "SubmissionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SubmissionDate submissionDate;
    @XmlElement(name = "FirstShipmentAvailibilityDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FirstShipmentAvailibilityDate firstShipmentAvailibilityDate;
    @XmlElement(name = "LatestProposalAcceptanceDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LatestProposalAcceptanceDate latestProposalAcceptanceDate;
    @XmlElement(name = "PromotionalSpecification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<PromotionalSpecification> promotionalSpecifications;

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
     * Gets the value of the promotionalEventTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalEventTypeCode }
     *     
     */
    public PromotionalEventTypeCode getPromotionalEventTypeCode() {
        return promotionalEventTypeCode;
    }

    /**
     * Sets the value of the promotionalEventTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalEventTypeCode }
     *     
     */
    public void setPromotionalEventTypeCode(PromotionalEventTypeCode value) {
        this.promotionalEventTypeCode = value;
    }

    /**
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionDate }
     *     
     */
    public SubmissionDate getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionDate }
     *     
     */
    public void setSubmissionDate(SubmissionDate value) {
        this.submissionDate = value;
    }

    /**
     * Gets the value of the firstShipmentAvailibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link FirstShipmentAvailibilityDate }
     *     
     */
    public FirstShipmentAvailibilityDate getFirstShipmentAvailibilityDate() {
        return firstShipmentAvailibilityDate;
    }

    /**
     * Sets the value of the firstShipmentAvailibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstShipmentAvailibilityDate }
     *     
     */
    public void setFirstShipmentAvailibilityDate(FirstShipmentAvailibilityDate value) {
        this.firstShipmentAvailibilityDate = value;
    }

    /**
     * Gets the value of the latestProposalAcceptanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link LatestProposalAcceptanceDate }
     *     
     */
    public LatestProposalAcceptanceDate getLatestProposalAcceptanceDate() {
        return latestProposalAcceptanceDate;
    }

    /**
     * Sets the value of the latestProposalAcceptanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatestProposalAcceptanceDate }
     *     
     */
    public void setLatestProposalAcceptanceDate(LatestProposalAcceptanceDate value) {
        this.latestProposalAcceptanceDate = value;
    }

    /**
     * Gets the value of the promotionalSpecifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionalSpecifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionalSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionalSpecification }
     * 
     * 
     */
    public List<PromotionalSpecification> getPromotionalSpecifications() {
        if (promotionalSpecifications == null) {
            promotionalSpecifications = new ArrayList<PromotionalSpecification>();
        }
        return this.promotionalSpecifications;
    }

}
