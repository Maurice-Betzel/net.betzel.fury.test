
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
 * <p>Java class for HazardousItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardousItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardNotation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlacardEndorsement" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UNDGCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UNPackingGroupCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UNPackingGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EmergencyProceduresCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MedicalFirstAidGuideCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TunnelRestrictionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaritimePollutantCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TechnicalName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CategoryName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousCategoryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UpperOrangeHazardPlacardID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LowerOrangeHazardPlacardID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkingID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardClassID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContactParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SecondaryHazard" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousGoodsTransit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EmergencyTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FlashpointTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalTemperature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PositionOnBoardStowage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousItemType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "placardNotation",
    "placardEndorsement",
    "additionalInformations",
    "undgCode",
    "unPackingGroupCode",
    "unPackingGroups",
    "emergencyProceduresCode",
    "medicalFirstAidGuideCode",
    "tunnelRestrictionCode",
    "maritimePollutantCode",
    "technicalName",
    "categoryName",
    "hazardousCategoryCode",
    "upperOrangeHazardPlacardID",
    "lowerOrangeHazardPlacardID",
    "markingID",
    "hazardClassID",
    "netWeightMeasure",
    "netVolumeMeasure",
    "quantity",
    "contactParty",
    "secondaryHazards",
    "hazardousGoodsTransits",
    "emergencyTemperature",
    "flashpointTemperature",
    "additionalTemperatures",
    "positionOnBoardStowage"
})
@XmlRootElement(name = "HazardousItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class HazardousItem
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "PlacardNotation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PlacardNotation placardNotation;
    @XmlElement(name = "PlacardEndorsement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PlacardEndorsement placardEndorsement;
    @XmlElement(name = "AdditionalInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<AdditionalInformation> additionalInformations;
    @XmlElement(name = "UNDGCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UNDGCode undgCode;
    @XmlElement(name = "UNPackingGroupCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UNPackingGroupCode unPackingGroupCode;
    @XmlElement(name = "UNPackingGroup", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<UNPackingGroup> unPackingGroups;
    @XmlElement(name = "EmergencyProceduresCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EmergencyProceduresCode emergencyProceduresCode;
    @XmlElement(name = "MedicalFirstAidGuideCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MedicalFirstAidGuideCode medicalFirstAidGuideCode;
    @XmlElement(name = "TunnelRestrictionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TunnelRestrictionCode tunnelRestrictionCode;
    @XmlElement(name = "MaritimePollutantCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaritimePollutantCode maritimePollutantCode;
    @XmlElement(name = "TechnicalName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TechnicalName technicalName;
    @XmlElement(name = "CategoryName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CategoryName categoryName;
    @XmlElement(name = "HazardousCategoryCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HazardousCategoryCode hazardousCategoryCode;
    @XmlElement(name = "UpperOrangeHazardPlacardID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UpperOrangeHazardPlacardID upperOrangeHazardPlacardID;
    @XmlElement(name = "LowerOrangeHazardPlacardID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LowerOrangeHazardPlacardID lowerOrangeHazardPlacardID;
    @XmlElement(name = "MarkingID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MarkingID markingID;
    @XmlElement(name = "HazardClassID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HazardClassID hazardClassID;
    @XmlElement(name = "NetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetWeightMeasure netWeightMeasure;
    @XmlElement(name = "NetVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetVolumeMeasure netVolumeMeasure;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Quantity quantity;
    @XmlElement(name = "ContactParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType contactParty;
    @XmlElement(name = "SecondaryHazard", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<SecondaryHazard> secondaryHazards;
    @XmlElement(name = "HazardousGoodsTransit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<HazardousGoodsTransit> hazardousGoodsTransits;
    @XmlElement(name = "EmergencyTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType emergencyTemperature;
    @XmlElement(name = "FlashpointTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType flashpointTemperature;
    @XmlElement(name = "AdditionalTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TemperatureType> additionalTemperatures;
    @XmlElement(name = "PositionOnBoardStowage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected StowageType positionOnBoardStowage;

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
     * Gets the value of the placardNotation property.
     * 
     * @return
     *     possible object is
     *     {@link PlacardNotation }
     *     
     */
    public PlacardNotation getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Sets the value of the placardNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardNotation }
     *     
     */
    public void setPlacardNotation(PlacardNotation value) {
        this.placardNotation = value;
    }

    /**
     * Gets the value of the placardEndorsement property.
     * 
     * @return
     *     possible object is
     *     {@link PlacardEndorsement }
     *     
     */
    public PlacardEndorsement getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Sets the value of the placardEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacardEndorsement }
     *     
     */
    public void setPlacardEndorsement(PlacardEndorsement value) {
        this.placardEndorsement = value;
    }

    /**
     * Gets the value of the additionalInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation }
     * 
     * 
     */
    public List<AdditionalInformation> getAdditionalInformations() {
        if (additionalInformations == null) {
            additionalInformations = new ArrayList<AdditionalInformation>();
        }
        return this.additionalInformations;
    }

    /**
     * Gets the value of the undgCode property.
     * 
     * @return
     *     possible object is
     *     {@link UNDGCode }
     *     
     */
    public UNDGCode getUNDGCode() {
        return undgCode;
    }

    /**
     * Sets the value of the undgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNDGCode }
     *     
     */
    public void setUNDGCode(UNDGCode value) {
        this.undgCode = value;
    }

    /**
     * Gets the value of the unPackingGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link UNPackingGroupCode }
     *     
     */
    public UNPackingGroupCode getUNPackingGroupCode() {
        return unPackingGroupCode;
    }

    /**
     * Sets the value of the unPackingGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNPackingGroupCode }
     *     
     */
    public void setUNPackingGroupCode(UNPackingGroupCode value) {
        this.unPackingGroupCode = value;
    }

    /**
     * Gets the value of the unPackingGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unPackingGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUNPackingGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UNPackingGroup }
     * 
     * 
     */
    public List<UNPackingGroup> getUNPackingGroups() {
        if (unPackingGroups == null) {
            unPackingGroups = new ArrayList<UNPackingGroup>();
        }
        return this.unPackingGroups;
    }

    /**
     * Gets the value of the emergencyProceduresCode property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyProceduresCode }
     *     
     */
    public EmergencyProceduresCode getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * Sets the value of the emergencyProceduresCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyProceduresCode }
     *     
     */
    public void setEmergencyProceduresCode(EmergencyProceduresCode value) {
        this.emergencyProceduresCode = value;
    }

    /**
     * Gets the value of the medicalFirstAidGuideCode property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalFirstAidGuideCode }
     *     
     */
    public MedicalFirstAidGuideCode getMedicalFirstAidGuideCode() {
        return medicalFirstAidGuideCode;
    }

    /**
     * Sets the value of the medicalFirstAidGuideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalFirstAidGuideCode }
     *     
     */
    public void setMedicalFirstAidGuideCode(MedicalFirstAidGuideCode value) {
        this.medicalFirstAidGuideCode = value;
    }

    /**
     * Gets the value of the tunnelRestrictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TunnelRestrictionCode }
     *     
     */
    public TunnelRestrictionCode getTunnelRestrictionCode() {
        return tunnelRestrictionCode;
    }

    /**
     * Sets the value of the tunnelRestrictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TunnelRestrictionCode }
     *     
     */
    public void setTunnelRestrictionCode(TunnelRestrictionCode value) {
        this.tunnelRestrictionCode = value;
    }

    /**
     * Gets the value of the maritimePollutantCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaritimePollutantCode }
     *     
     */
    public MaritimePollutantCode getMaritimePollutantCode() {
        return maritimePollutantCode;
    }

    /**
     * Sets the value of the maritimePollutantCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritimePollutantCode }
     *     
     */
    public void setMaritimePollutantCode(MaritimePollutantCode value) {
        this.maritimePollutantCode = value;
    }

    /**
     * Gets the value of the technicalName property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalName }
     *     
     */
    public TechnicalName getTechnicalName() {
        return technicalName;
    }

    /**
     * Sets the value of the technicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalName }
     *     
     */
    public void setTechnicalName(TechnicalName value) {
        this.technicalName = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryName }
     *     
     */
    public CategoryName getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryName }
     *     
     */
    public void setCategoryName(CategoryName value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the hazardousCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousCategoryCode }
     *     
     */
    public HazardousCategoryCode getHazardousCategoryCode() {
        return hazardousCategoryCode;
    }

    /**
     * Sets the value of the hazardousCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousCategoryCode }
     *     
     */
    public void setHazardousCategoryCode(HazardousCategoryCode value) {
        this.hazardousCategoryCode = value;
    }

    /**
     * Gets the value of the upperOrangeHazardPlacardID property.
     * 
     * @return
     *     possible object is
     *     {@link UpperOrangeHazardPlacardID }
     *     
     */
    public UpperOrangeHazardPlacardID getUpperOrangeHazardPlacardID() {
        return upperOrangeHazardPlacardID;
    }

    /**
     * Sets the value of the upperOrangeHazardPlacardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpperOrangeHazardPlacardID }
     *     
     */
    public void setUpperOrangeHazardPlacardID(UpperOrangeHazardPlacardID value) {
        this.upperOrangeHazardPlacardID = value;
    }

    /**
     * Gets the value of the lowerOrangeHazardPlacardID property.
     * 
     * @return
     *     possible object is
     *     {@link LowerOrangeHazardPlacardID }
     *     
     */
    public LowerOrangeHazardPlacardID getLowerOrangeHazardPlacardID() {
        return lowerOrangeHazardPlacardID;
    }

    /**
     * Sets the value of the lowerOrangeHazardPlacardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerOrangeHazardPlacardID }
     *     
     */
    public void setLowerOrangeHazardPlacardID(LowerOrangeHazardPlacardID value) {
        this.lowerOrangeHazardPlacardID = value;
    }

    /**
     * Gets the value of the markingID property.
     * 
     * @return
     *     possible object is
     *     {@link MarkingID }
     *     
     */
    public MarkingID getMarkingID() {
        return markingID;
    }

    /**
     * Sets the value of the markingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingID }
     *     
     */
    public void setMarkingID(MarkingID value) {
        this.markingID = value;
    }

    /**
     * Gets the value of the hazardClassID property.
     * 
     * @return
     *     possible object is
     *     {@link HazardClassID }
     *     
     */
    public HazardClassID getHazardClassID() {
        return hazardClassID;
    }

    /**
     * Sets the value of the hazardClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardClassID }
     *     
     */
    public void setHazardClassID(HazardClassID value) {
        this.hazardClassID = value;
    }

    /**
     * Gets the value of the netWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link NetWeightMeasure }
     *     
     */
    public NetWeightMeasure getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Sets the value of the netWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetWeightMeasure }
     *     
     */
    public void setNetWeightMeasure(NetWeightMeasure value) {
        this.netWeightMeasure = value;
    }

    /**
     * Gets the value of the netVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link NetVolumeMeasure }
     *     
     */
    public NetVolumeMeasure getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Sets the value of the netVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetVolumeMeasure }
     *     
     */
    public void setNetVolumeMeasure(NetVolumeMeasure value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the contactParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getContactParty() {
        return contactParty;
    }

    /**
     * Sets the value of the contactParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setContactParty(PartyType value) {
        this.contactParty = value;
    }

    /**
     * Gets the value of the secondaryHazards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryHazards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryHazards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryHazard }
     * 
     * 
     */
    public List<SecondaryHazard> getSecondaryHazards() {
        if (secondaryHazards == null) {
            secondaryHazards = new ArrayList<SecondaryHazard>();
        }
        return this.secondaryHazards;
    }

    /**
     * Gets the value of the hazardousGoodsTransits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousGoodsTransits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousGoodsTransits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousGoodsTransit }
     * 
     * 
     */
    public List<HazardousGoodsTransit> getHazardousGoodsTransits() {
        if (hazardousGoodsTransits == null) {
            hazardousGoodsTransits = new ArrayList<HazardousGoodsTransit>();
        }
        return this.hazardousGoodsTransits;
    }

    /**
     * Gets the value of the emergencyTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getEmergencyTemperature() {
        return emergencyTemperature;
    }

    /**
     * Sets the value of the emergencyTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setEmergencyTemperature(TemperatureType value) {
        this.emergencyTemperature = value;
    }

    /**
     * Gets the value of the flashpointTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getFlashpointTemperature() {
        return flashpointTemperature;
    }

    /**
     * Sets the value of the flashpointTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setFlashpointTemperature(TemperatureType value) {
        this.flashpointTemperature = value;
    }

    /**
     * Gets the value of the additionalTemperatures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTemperatures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTemperatures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemperatureType }
     * 
     * 
     */
    public List<TemperatureType> getAdditionalTemperatures() {
        if (additionalTemperatures == null) {
            additionalTemperatures = new ArrayList<TemperatureType>();
        }
        return this.additionalTemperatures;
    }

    /**
     * Gets the value of the positionOnBoardStowage property.
     * 
     * @return
     *     possible object is
     *     {@link StowageType }
     *     
     */
    public StowageType getPositionOnBoardStowage() {
        return positionOnBoardStowage;
    }

    /**
     * Sets the value of the positionOnBoardStowage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StowageType }
     *     
     */
    public void setPositionOnBoardStowage(StowageType value) {
        this.positionOnBoardStowage = value;
    }

}
