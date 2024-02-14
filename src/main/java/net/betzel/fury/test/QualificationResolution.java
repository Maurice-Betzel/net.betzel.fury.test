
package net.betzel.fury.test;

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
 * <p>Java class for QualificationResolutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualificationResolutionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdmissionCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExclusionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Resolution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResolutionTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualificationResolutionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "admissionCode",
    "exclusionReasons",
    "resolutions",
    "resolutionDate",
    "resolutionTime",
    "procurementProjectLot"
})
@XmlRootElement(name = "QualificationResolution", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class QualificationResolution
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "AdmissionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected AdmissionCode admissionCode;
    @XmlElement(name = "ExclusionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ExclusionReason> exclusionReasons;
    @XmlElement(name = "Resolution", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Resolution> resolutions;
    @XmlElement(name = "ResolutionDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ResolutionDate resolutionDate;
    @XmlElement(name = "ResolutionTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResolutionTime resolutionTime;
    @XmlElement(name = "ProcurementProjectLot", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ProcurementProjectLotType procurementProjectLot;

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
     * Gets the value of the admissionCode property.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionCode }
     *     
     */
    public AdmissionCode getAdmissionCode() {
        return admissionCode;
    }

    /**
     * Sets the value of the admissionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionCode }
     *     
     */
    public void setAdmissionCode(AdmissionCode value) {
        this.admissionCode = value;
    }

    /**
     * Gets the value of the exclusionReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExclusionReason }
     * 
     * 
     */
    public List<ExclusionReason> getExclusionReasons() {
        if (exclusionReasons == null) {
            exclusionReasons = new ArrayList<ExclusionReason>();
        }
        return this.exclusionReasons;
    }

    /**
     * Gets the value of the resolutions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resolutions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResolutions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resolution }
     * 
     * 
     */
    public List<Resolution> getResolutions() {
        if (resolutions == null) {
            resolutions = new ArrayList<Resolution>();
        }
        return this.resolutions;
    }

    /**
     * Gets the value of the resolutionDate property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionDate }
     *     
     */
    public ResolutionDate getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Sets the value of the resolutionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionDate }
     *     
     */
    public void setResolutionDate(ResolutionDate value) {
        this.resolutionDate = value;
    }

    /**
     * Gets the value of the resolutionTime property.
     * 
     * @return
     *     possible object is
     *     {@link ResolutionTime }
     *     
     */
    public ResolutionTime getResolutionTime() {
        return resolutionTime;
    }

    /**
     * Sets the value of the resolutionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionTime }
     *     
     */
    public void setResolutionTime(ResolutionTime value) {
        this.resolutionTime = value;
    }

    /**
     * Gets the value of the procurementProjectLot property.
     * 
     * @return
     *     possible object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public ProcurementProjectLotType getProcurementProjectLot() {
        return procurementProjectLot;
    }

    /**
     * Sets the value of the procurementProjectLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcurementProjectLotType }
     *     
     */
    public void setProcurementProjectLot(ProcurementProjectLotType value) {
        this.procurementProjectLot = value;
    }

}
