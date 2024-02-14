
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
 * <p>Java class for MaritimeHealthDeclarationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaritimeHealthDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InfectiousDiseaseCaseOnBoardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MoreIllThanExpectedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MedicalPractitionerConsultedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StowawaysFoundOnBoardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SickAnimalOnBoardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FumigatedCargoTransportIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SanitaryMeasuresAppliedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidSanitationCertificateOnBoardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReinspectionRequiredIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalDeadPersonQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalIllPersonQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SickAnimalDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StowawayDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LastDrinkingWaterAnalysisDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WHOAffectedAreaVisit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PersonnelHealthIncident" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SanitaryMeasure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PlaceOfReportLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MedicalCertificate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipSanitationControlCertificate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipSanitationControlExemptionDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaritimeHealthDeclarationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "infectiousDiseaseCaseOnBoardIndicator",
    "moreIllThanExpectedIndicator",
    "medicalPractitionerConsultedIndicator",
    "stowawaysFoundOnBoardIndicator",
    "sickAnimalOnBoardIndicator",
    "fumigatedCargoTransportIndicator",
    "sanitaryMeasuresAppliedIndicator",
    "validSanitationCertificateOnBoardIndicator",
    "reinspectionRequiredIndicator",
    "totalDeadPersonQuantity",
    "totalIllPersonQuantity",
    "sickAnimalDescriptions",
    "stowawayDescriptions",
    "lastDrinkingWaterAnalysisDate",
    "whoAffectedAreaVisits",
    "personnelHealthIncidents",
    "sanitaryMeasures",
    "placeOfReportLocation",
    "medicalCertificate",
    "shipSanitationControlCertificate",
    "shipSanitationControlExemptionDocumentReferences"
})
@XmlRootElement(name = "MaritimeHealthDeclaration", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class MaritimeHealthDeclaration
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "InfectiousDiseaseCaseOnBoardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InfectiousDiseaseCaseOnBoardIndicator infectiousDiseaseCaseOnBoardIndicator;
    @XmlElement(name = "MoreIllThanExpectedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MoreIllThanExpectedIndicator moreIllThanExpectedIndicator;
    @XmlElement(name = "MedicalPractitionerConsultedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MedicalPractitionerConsultedIndicator medicalPractitionerConsultedIndicator;
    @XmlElement(name = "StowawaysFoundOnBoardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected StowawaysFoundOnBoardIndicator stowawaysFoundOnBoardIndicator;
    @XmlElement(name = "SickAnimalOnBoardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SickAnimalOnBoardIndicator sickAnimalOnBoardIndicator;
    @XmlElement(name = "FumigatedCargoTransportIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FumigatedCargoTransportIndicator fumigatedCargoTransportIndicator;
    @XmlElement(name = "SanitaryMeasuresAppliedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SanitaryMeasuresAppliedIndicator sanitaryMeasuresAppliedIndicator;
    @XmlElement(name = "ValidSanitationCertificateOnBoardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidSanitationCertificateOnBoardIndicator validSanitationCertificateOnBoardIndicator;
    @XmlElement(name = "ReinspectionRequiredIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReinspectionRequiredIndicator reinspectionRequiredIndicator;
    @XmlElement(name = "TotalDeadPersonQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalDeadPersonQuantity totalDeadPersonQuantity;
    @XmlElement(name = "TotalIllPersonQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalIllPersonQuantity totalIllPersonQuantity;
    @XmlElement(name = "SickAnimalDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<SickAnimalDescription> sickAnimalDescriptions;
    @XmlElement(name = "StowawayDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<StowawayDescription> stowawayDescriptions;
    @XmlElement(name = "LastDrinkingWaterAnalysisDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LastDrinkingWaterAnalysisDate lastDrinkingWaterAnalysisDate;
    @XmlElement(name = "WHOAffectedAreaVisit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<WHOAffectedAreaVisit> whoAffectedAreaVisits;
    @XmlElement(name = "PersonnelHealthIncident", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PersonnelHealthIncident> personnelHealthIncidents;
    @XmlElement(name = "SanitaryMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<SanitaryMeasure> sanitaryMeasures;
    @XmlElement(name = "PlaceOfReportLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType placeOfReportLocation;
    @XmlElement(name = "MedicalCertificate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CertificateType medicalCertificate;
    @XmlElement(name = "ShipSanitationControlCertificate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CertificateType shipSanitationControlCertificate;
    @XmlElement(name = "ShipSanitationControlExemptionDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> shipSanitationControlExemptionDocumentReferences;

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
     * Gets the value of the infectiousDiseaseCaseOnBoardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link InfectiousDiseaseCaseOnBoardIndicator }
     *     
     */
    public InfectiousDiseaseCaseOnBoardIndicator getInfectiousDiseaseCaseOnBoardIndicator() {
        return infectiousDiseaseCaseOnBoardIndicator;
    }

    /**
     * Sets the value of the infectiousDiseaseCaseOnBoardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfectiousDiseaseCaseOnBoardIndicator }
     *     
     */
    public void setInfectiousDiseaseCaseOnBoardIndicator(InfectiousDiseaseCaseOnBoardIndicator value) {
        this.infectiousDiseaseCaseOnBoardIndicator = value;
    }

    /**
     * Gets the value of the moreIllThanExpectedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MoreIllThanExpectedIndicator }
     *     
     */
    public MoreIllThanExpectedIndicator getMoreIllThanExpectedIndicator() {
        return moreIllThanExpectedIndicator;
    }

    /**
     * Sets the value of the moreIllThanExpectedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoreIllThanExpectedIndicator }
     *     
     */
    public void setMoreIllThanExpectedIndicator(MoreIllThanExpectedIndicator value) {
        this.moreIllThanExpectedIndicator = value;
    }

    /**
     * Gets the value of the medicalPractitionerConsultedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalPractitionerConsultedIndicator }
     *     
     */
    public MedicalPractitionerConsultedIndicator getMedicalPractitionerConsultedIndicator() {
        return medicalPractitionerConsultedIndicator;
    }

    /**
     * Sets the value of the medicalPractitionerConsultedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalPractitionerConsultedIndicator }
     *     
     */
    public void setMedicalPractitionerConsultedIndicator(MedicalPractitionerConsultedIndicator value) {
        this.medicalPractitionerConsultedIndicator = value;
    }

    /**
     * Gets the value of the stowawaysFoundOnBoardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StowawaysFoundOnBoardIndicator }
     *     
     */
    public StowawaysFoundOnBoardIndicator getStowawaysFoundOnBoardIndicator() {
        return stowawaysFoundOnBoardIndicator;
    }

    /**
     * Sets the value of the stowawaysFoundOnBoardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StowawaysFoundOnBoardIndicator }
     *     
     */
    public void setStowawaysFoundOnBoardIndicator(StowawaysFoundOnBoardIndicator value) {
        this.stowawaysFoundOnBoardIndicator = value;
    }

    /**
     * Gets the value of the sickAnimalOnBoardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SickAnimalOnBoardIndicator }
     *     
     */
    public SickAnimalOnBoardIndicator getSickAnimalOnBoardIndicator() {
        return sickAnimalOnBoardIndicator;
    }

    /**
     * Sets the value of the sickAnimalOnBoardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SickAnimalOnBoardIndicator }
     *     
     */
    public void setSickAnimalOnBoardIndicator(SickAnimalOnBoardIndicator value) {
        this.sickAnimalOnBoardIndicator = value;
    }

    /**
     * Gets the value of the fumigatedCargoTransportIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link FumigatedCargoTransportIndicator }
     *     
     */
    public FumigatedCargoTransportIndicator getFumigatedCargoTransportIndicator() {
        return fumigatedCargoTransportIndicator;
    }

    /**
     * Sets the value of the fumigatedCargoTransportIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FumigatedCargoTransportIndicator }
     *     
     */
    public void setFumigatedCargoTransportIndicator(FumigatedCargoTransportIndicator value) {
        this.fumigatedCargoTransportIndicator = value;
    }

    /**
     * Gets the value of the sanitaryMeasuresAppliedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryMeasuresAppliedIndicator }
     *     
     */
    public SanitaryMeasuresAppliedIndicator getSanitaryMeasuresAppliedIndicator() {
        return sanitaryMeasuresAppliedIndicator;
    }

    /**
     * Sets the value of the sanitaryMeasuresAppliedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryMeasuresAppliedIndicator }
     *     
     */
    public void setSanitaryMeasuresAppliedIndicator(SanitaryMeasuresAppliedIndicator value) {
        this.sanitaryMeasuresAppliedIndicator = value;
    }

    /**
     * Gets the value of the validSanitationCertificateOnBoardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ValidSanitationCertificateOnBoardIndicator }
     *     
     */
    public ValidSanitationCertificateOnBoardIndicator getValidSanitationCertificateOnBoardIndicator() {
        return validSanitationCertificateOnBoardIndicator;
    }

    /**
     * Sets the value of the validSanitationCertificateOnBoardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidSanitationCertificateOnBoardIndicator }
     *     
     */
    public void setValidSanitationCertificateOnBoardIndicator(ValidSanitationCertificateOnBoardIndicator value) {
        this.validSanitationCertificateOnBoardIndicator = value;
    }

    /**
     * Gets the value of the reinspectionRequiredIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ReinspectionRequiredIndicator }
     *     
     */
    public ReinspectionRequiredIndicator getReinspectionRequiredIndicator() {
        return reinspectionRequiredIndicator;
    }

    /**
     * Sets the value of the reinspectionRequiredIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinspectionRequiredIndicator }
     *     
     */
    public void setReinspectionRequiredIndicator(ReinspectionRequiredIndicator value) {
        this.reinspectionRequiredIndicator = value;
    }

    /**
     * Gets the value of the totalDeadPersonQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalDeadPersonQuantity }
     *     
     */
    public TotalDeadPersonQuantity getTotalDeadPersonQuantity() {
        return totalDeadPersonQuantity;
    }

    /**
     * Sets the value of the totalDeadPersonQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalDeadPersonQuantity }
     *     
     */
    public void setTotalDeadPersonQuantity(TotalDeadPersonQuantity value) {
        this.totalDeadPersonQuantity = value;
    }

    /**
     * Gets the value of the totalIllPersonQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalIllPersonQuantity }
     *     
     */
    public TotalIllPersonQuantity getTotalIllPersonQuantity() {
        return totalIllPersonQuantity;
    }

    /**
     * Sets the value of the totalIllPersonQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalIllPersonQuantity }
     *     
     */
    public void setTotalIllPersonQuantity(TotalIllPersonQuantity value) {
        this.totalIllPersonQuantity = value;
    }

    /**
     * Gets the value of the sickAnimalDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sickAnimalDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSickAnimalDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SickAnimalDescription }
     * 
     * 
     */
    public List<SickAnimalDescription> getSickAnimalDescriptions() {
        if (sickAnimalDescriptions == null) {
            sickAnimalDescriptions = new ArrayList<SickAnimalDescription>();
        }
        return this.sickAnimalDescriptions;
    }

    /**
     * Gets the value of the stowawayDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stowawayDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStowawayDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StowawayDescription }
     * 
     * 
     */
    public List<StowawayDescription> getStowawayDescriptions() {
        if (stowawayDescriptions == null) {
            stowawayDescriptions = new ArrayList<StowawayDescription>();
        }
        return this.stowawayDescriptions;
    }

    /**
     * Gets the value of the lastDrinkingWaterAnalysisDate property.
     * 
     * @return
     *     possible object is
     *     {@link LastDrinkingWaterAnalysisDate }
     *     
     */
    public LastDrinkingWaterAnalysisDate getLastDrinkingWaterAnalysisDate() {
        return lastDrinkingWaterAnalysisDate;
    }

    /**
     * Sets the value of the lastDrinkingWaterAnalysisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastDrinkingWaterAnalysisDate }
     *     
     */
    public void setLastDrinkingWaterAnalysisDate(LastDrinkingWaterAnalysisDate value) {
        this.lastDrinkingWaterAnalysisDate = value;
    }

    /**
     * Gets the value of the whoAffectedAreaVisits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whoAffectedAreaVisits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWHOAffectedAreaVisits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WHOAffectedAreaVisit }
     * 
     * 
     */
    public List<WHOAffectedAreaVisit> getWHOAffectedAreaVisits() {
        if (whoAffectedAreaVisits == null) {
            whoAffectedAreaVisits = new ArrayList<WHOAffectedAreaVisit>();
        }
        return this.whoAffectedAreaVisits;
    }

    /**
     * Gets the value of the personnelHealthIncidents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personnelHealthIncidents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonnelHealthIncidents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonnelHealthIncident }
     * 
     * 
     */
    public List<PersonnelHealthIncident> getPersonnelHealthIncidents() {
        if (personnelHealthIncidents == null) {
            personnelHealthIncidents = new ArrayList<PersonnelHealthIncident>();
        }
        return this.personnelHealthIncidents;
    }

    /**
     * Gets the value of the sanitaryMeasures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sanitaryMeasures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanitaryMeasures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanitaryMeasure }
     * 
     * 
     */
    public List<SanitaryMeasure> getSanitaryMeasures() {
        if (sanitaryMeasures == null) {
            sanitaryMeasures = new ArrayList<SanitaryMeasure>();
        }
        return this.sanitaryMeasures;
    }

    /**
     * Gets the value of the placeOfReportLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getPlaceOfReportLocation() {
        return placeOfReportLocation;
    }

    /**
     * Sets the value of the placeOfReportLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setPlaceOfReportLocation(LocationType value) {
        this.placeOfReportLocation = value;
    }

    /**
     * Gets the value of the medicalCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType }
     *     
     */
    public CertificateType getMedicalCertificate() {
        return medicalCertificate;
    }

    /**
     * Sets the value of the medicalCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType }
     *     
     */
    public void setMedicalCertificate(CertificateType value) {
        this.medicalCertificate = value;
    }

    /**
     * Gets the value of the shipSanitationControlCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType }
     *     
     */
    public CertificateType getShipSanitationControlCertificate() {
        return shipSanitationControlCertificate;
    }

    /**
     * Sets the value of the shipSanitationControlCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType }
     *     
     */
    public void setShipSanitationControlCertificate(CertificateType value) {
        this.shipSanitationControlCertificate = value;
    }

    /**
     * Gets the value of the shipSanitationControlExemptionDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipSanitationControlExemptionDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipSanitationControlExemptionDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getShipSanitationControlExemptionDocumentReferences() {
        if (shipSanitationControlExemptionDocumentReferences == null) {
            shipSanitationControlExemptionDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.shipSanitationControlExemptionDocumentReferences;
    }

}
