
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TendererPartyQualificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TendererPartyQualificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InterestedProcurementProjectLot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MainQualifyingParty"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalQualifyingParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TendererPartyQualificationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "interestedProcurementProjectLots",
    "mainQualifyingParty",
    "additionalQualifyingParties"
})
@XmlRootElement(name = "TendererPartyQualification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TendererPartyQualification
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "InterestedProcurementProjectLot", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ProcurementProjectLotType> interestedProcurementProjectLots;
    @XmlElement(name = "MainQualifyingParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected QualifyingPartyType mainQualifyingParty;
    @XmlElement(name = "AdditionalQualifyingParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<QualifyingPartyType> additionalQualifyingParties;

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
     * Gets the value of the interestedProcurementProjectLots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interestedProcurementProjectLots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterestedProcurementProjectLots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementProjectLotType }
     * 
     * 
     */
    public List<ProcurementProjectLotType> getInterestedProcurementProjectLots() {
        if (interestedProcurementProjectLots == null) {
            interestedProcurementProjectLots = new ArrayList<ProcurementProjectLotType>();
        }
        return this.interestedProcurementProjectLots;
    }

    /**
     * Gets the value of the mainQualifyingParty property.
     * 
     * @return
     *     possible object is
     *     {@link QualifyingPartyType }
     *     
     */
    public QualifyingPartyType getMainQualifyingParty() {
        return mainQualifyingParty;
    }

    /**
     * Sets the value of the mainQualifyingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifyingPartyType }
     *     
     */
    public void setMainQualifyingParty(QualifyingPartyType value) {
        this.mainQualifyingParty = value;
    }

    /**
     * Gets the value of the additionalQualifyingParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalQualifyingParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalQualifyingParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifyingPartyType }
     * 
     * 
     */
    public List<QualifyingPartyType> getAdditionalQualifyingParties() {
        if (additionalQualifyingParties == null) {
            additionalQualifyingParties = new ArrayList<QualifyingPartyType>();
        }
        return this.additionalQualifyingParties;
    }

}
