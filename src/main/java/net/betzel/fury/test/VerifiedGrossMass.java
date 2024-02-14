
package net.betzel.fury.test;

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
 * <p>Java class for VerifiedGrossMassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerifiedGrossMassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingMethodCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingDeviceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WeighingDeviceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossMassMeasure"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WeighingParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipperParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResponsibleParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerifiedGrossMassType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "weighingDate",
    "weighingTime",
    "weighingMethodCode",
    "weighingDeviceID",
    "weighingDeviceType",
    "grossMassMeasure",
    "weighingParty",
    "shipperParty",
    "responsibleParty",
    "documentReferences"
})
@XmlRootElement(name = "VerifiedGrossMass", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class VerifiedGrossMass
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "WeighingDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WeighingDate weighingDate;
    @XmlElement(name = "WeighingTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WeighingTime weighingTime;
    @XmlElement(name = "WeighingMethodCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected WeighingMethodCode weighingMethodCode;
    @XmlElement(name = "WeighingDeviceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WeighingDeviceID weighingDeviceID;
    @XmlElement(name = "WeighingDeviceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WeighingDeviceType weighingDeviceType;
    @XmlElement(name = "GrossMassMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected GrossMassMeasure grossMassMeasure;
    @XmlElement(name = "WeighingParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType weighingParty;
    @XmlElement(name = "ShipperParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType shipperParty;
    @XmlElement(name = "ResponsibleParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType responsibleParty;
    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<DocumentReferenceType> documentReferences;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the weighingDate property.
     * 
     * @return
     *     possible object is
     *     {@link WeighingDate }
     *     
     */
    public WeighingDate getWeighingDate() {
        return weighingDate;
    }

    /**
     * Sets the value of the weighingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingDate }
     *     
     */
    public void setWeighingDate(WeighingDate value) {
        this.weighingDate = value;
    }

    /**
     * Gets the value of the weighingTime property.
     * 
     * @return
     *     possible object is
     *     {@link WeighingTime }
     *     
     */
    public WeighingTime getWeighingTime() {
        return weighingTime;
    }

    /**
     * Sets the value of the weighingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingTime }
     *     
     */
    public void setWeighingTime(WeighingTime value) {
        this.weighingTime = value;
    }

    /**
     * Gets the value of the weighingMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link WeighingMethodCode }
     *     
     */
    public WeighingMethodCode getWeighingMethodCode() {
        return weighingMethodCode;
    }

    /**
     * Sets the value of the weighingMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingMethodCode }
     *     
     */
    public void setWeighingMethodCode(WeighingMethodCode value) {
        this.weighingMethodCode = value;
    }

    /**
     * Gets the value of the weighingDeviceID property.
     * 
     * @return
     *     possible object is
     *     {@link WeighingDeviceID }
     *     
     */
    public WeighingDeviceID getWeighingDeviceID() {
        return weighingDeviceID;
    }

    /**
     * Sets the value of the weighingDeviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingDeviceID }
     *     
     */
    public void setWeighingDeviceID(WeighingDeviceID value) {
        this.weighingDeviceID = value;
    }

    /**
     * Gets the value of the weighingDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link WeighingDeviceType }
     *     
     */
    public WeighingDeviceType getWeighingDeviceType() {
        return weighingDeviceType;
    }

    /**
     * Sets the value of the weighingDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeighingDeviceType }
     *     
     */
    public void setWeighingDeviceType(WeighingDeviceType value) {
        this.weighingDeviceType = value;
    }

    /**
     * Gets the value of the grossMassMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GrossMassMeasure }
     *     
     */
    public GrossMassMeasure getGrossMassMeasure() {
        return grossMassMeasure;
    }

    /**
     * Sets the value of the grossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossMassMeasure }
     *     
     */
    public void setGrossMassMeasure(GrossMassMeasure value) {
        this.grossMassMeasure = value;
    }

    /**
     * Gets the value of the weighingParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getWeighingParty() {
        return weighingParty;
    }

    /**
     * Sets the value of the weighingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setWeighingParty(PartyType value) {
        this.weighingParty = value;
    }

    /**
     * Gets the value of the shipperParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getShipperParty() {
        return shipperParty;
    }

    /**
     * Sets the value of the shipperParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setShipperParty(PartyType value) {
        this.shipperParty = value;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setResponsibleParty(PartyType value) {
        this.responsibleParty = value;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReferences;
    }

}
