
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
 * <p>Java class for PersonnelHealthIncidentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonnelHealthIncidentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}JoinedShipDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NatureOfIllnessDescription" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OnsetDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReportedToMedicalOfficerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GivenTreatmentDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StillIllIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DiedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StillOnBoardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EvacuatedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuriedAtSeaIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Person" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonnelHealthIncidentType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "joinedShipDate",
    "natureOfIllnessDescriptions",
    "onsetDate",
    "reportedToMedicalOfficerIndicator",
    "givenTreatmentDescriptions",
    "stillIllIndicator",
    "diedIndicator",
    "stillOnBoardIndicator",
    "evacuatedIndicator",
    "buriedAtSeaIndicator",
    "notes",
    "person"
})
@XmlRootElement(name = "PersonnelHealthIncident", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class PersonnelHealthIncident
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ID id;
    @XmlElement(name = "JoinedShipDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected JoinedShipDate joinedShipDate;
    @XmlElement(name = "NatureOfIllnessDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<NatureOfIllnessDescription> natureOfIllnessDescriptions;
    @XmlElement(name = "OnsetDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OnsetDate onsetDate;
    @XmlElement(name = "ReportedToMedicalOfficerIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReportedToMedicalOfficerIndicator reportedToMedicalOfficerIndicator;
    @XmlElement(name = "GivenTreatmentDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<GivenTreatmentDescription> givenTreatmentDescriptions;
    @XmlElement(name = "StillIllIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected StillIllIndicator stillIllIndicator;
    @XmlElement(name = "DiedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DiedIndicator diedIndicator;
    @XmlElement(name = "StillOnBoardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected StillOnBoardIndicator stillOnBoardIndicator;
    @XmlElement(name = "EvacuatedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EvacuatedIndicator evacuatedIndicator;
    @XmlElement(name = "BuriedAtSeaIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BuriedAtSeaIndicator buriedAtSeaIndicator;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "Person", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PersonType person;

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
     * Gets the value of the joinedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link JoinedShipDate }
     *     
     */
    public JoinedShipDate getJoinedShipDate() {
        return joinedShipDate;
    }

    /**
     * Sets the value of the joinedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JoinedShipDate }
     *     
     */
    public void setJoinedShipDate(JoinedShipDate value) {
        this.joinedShipDate = value;
    }

    /**
     * Gets the value of the natureOfIllnessDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the natureOfIllnessDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNatureOfIllnessDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NatureOfIllnessDescription }
     * 
     * 
     */
    public List<NatureOfIllnessDescription> getNatureOfIllnessDescriptions() {
        if (natureOfIllnessDescriptions == null) {
            natureOfIllnessDescriptions = new ArrayList<NatureOfIllnessDescription>();
        }
        return this.natureOfIllnessDescriptions;
    }

    /**
     * Gets the value of the onsetDate property.
     * 
     * @return
     *     possible object is
     *     {@link OnsetDate }
     *     
     */
    public OnsetDate getOnsetDate() {
        return onsetDate;
    }

    /**
     * Sets the value of the onsetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnsetDate }
     *     
     */
    public void setOnsetDate(OnsetDate value) {
        this.onsetDate = value;
    }

    /**
     * Gets the value of the reportedToMedicalOfficerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedToMedicalOfficerIndicator }
     *     
     */
    public ReportedToMedicalOfficerIndicator getReportedToMedicalOfficerIndicator() {
        return reportedToMedicalOfficerIndicator;
    }

    /**
     * Sets the value of the reportedToMedicalOfficerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedToMedicalOfficerIndicator }
     *     
     */
    public void setReportedToMedicalOfficerIndicator(ReportedToMedicalOfficerIndicator value) {
        this.reportedToMedicalOfficerIndicator = value;
    }

    /**
     * Gets the value of the givenTreatmentDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenTreatmentDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenTreatmentDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GivenTreatmentDescription }
     * 
     * 
     */
    public List<GivenTreatmentDescription> getGivenTreatmentDescriptions() {
        if (givenTreatmentDescriptions == null) {
            givenTreatmentDescriptions = new ArrayList<GivenTreatmentDescription>();
        }
        return this.givenTreatmentDescriptions;
    }

    /**
     * Gets the value of the stillIllIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StillIllIndicator }
     *     
     */
    public StillIllIndicator getStillIllIndicator() {
        return stillIllIndicator;
    }

    /**
     * Sets the value of the stillIllIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StillIllIndicator }
     *     
     */
    public void setStillIllIndicator(StillIllIndicator value) {
        this.stillIllIndicator = value;
    }

    /**
     * Gets the value of the diedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link DiedIndicator }
     *     
     */
    public DiedIndicator getDiedIndicator() {
        return diedIndicator;
    }

    /**
     * Sets the value of the diedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiedIndicator }
     *     
     */
    public void setDiedIndicator(DiedIndicator value) {
        this.diedIndicator = value;
    }

    /**
     * Gets the value of the stillOnBoardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StillOnBoardIndicator }
     *     
     */
    public StillOnBoardIndicator getStillOnBoardIndicator() {
        return stillOnBoardIndicator;
    }

    /**
     * Sets the value of the stillOnBoardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StillOnBoardIndicator }
     *     
     */
    public void setStillOnBoardIndicator(StillOnBoardIndicator value) {
        this.stillOnBoardIndicator = value;
    }

    /**
     * Gets the value of the evacuatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link EvacuatedIndicator }
     *     
     */
    public EvacuatedIndicator getEvacuatedIndicator() {
        return evacuatedIndicator;
    }

    /**
     * Sets the value of the evacuatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvacuatedIndicator }
     *     
     */
    public void setEvacuatedIndicator(EvacuatedIndicator value) {
        this.evacuatedIndicator = value;
    }

    /**
     * Gets the value of the buriedAtSeaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BuriedAtSeaIndicator }
     *     
     */
    public BuriedAtSeaIndicator getBuriedAtSeaIndicator() {
        return buriedAtSeaIndicator;
    }

    /**
     * Sets the value of the buriedAtSeaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuriedAtSeaIndicator }
     *     
     */
    public void setBuriedAtSeaIndicator(BuriedAtSeaIndicator value) {
        this.buriedAtSeaIndicator = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPerson(PersonType value) {
        this.person = value;
    }

}
