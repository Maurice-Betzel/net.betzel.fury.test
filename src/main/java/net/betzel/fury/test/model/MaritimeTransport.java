
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
 * <p>Java class for MaritimeTransportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaritimeTransportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VesselID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}VesselName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RadioCallSignID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MMSIRegistrationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShipsRequirements" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossTonnageMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetTonnageMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SegregatedBallastMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShipConfigurationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}INFShipClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AntennaLocus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistryCertificateDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistryPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}VesselDynamics" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaritimeTransportType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "vesselID",
    "vesselName",
    "radioCallSignID",
    "mmsiRegistrationID",
    "shipsRequirements",
    "grossTonnageMeasure",
    "netTonnageMeasure",
    "segregatedBallastMeasure",
    "shipConfigurationCode",
    "infShipClassCode",
    "antennaLocus",
    "registryCertificateDocumentReference",
    "registryPortLocation",
    "vesselDynamics"
})
@XmlRootElement(name = "MaritimeTransport", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class MaritimeTransport
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "VesselID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected VesselID vesselID;
    @XmlElement(name = "VesselName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected VesselName vesselName;
    @XmlElement(name = "RadioCallSignID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RadioCallSignID radioCallSignID;
    @XmlElement(name = "MMSIRegistrationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MMSIRegistrationID mmsiRegistrationID;
    @XmlElement(name = "ShipsRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ShipsRequirements> shipsRequirements;
    @XmlElement(name = "GrossTonnageMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GrossTonnageMeasure grossTonnageMeasure;
    @XmlElement(name = "NetTonnageMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetTonnageMeasure netTonnageMeasure;
    @XmlElement(name = "SegregatedBallastMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SegregatedBallastMeasure segregatedBallastMeasure;
    @XmlElement(name = "ShipConfigurationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ShipConfigurationCode shipConfigurationCode;
    @XmlElement(name = "INFShipClassCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected INFShipClassCode infShipClassCode;
    @XmlElement(name = "AntennaLocus", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AntennaLocus antennaLocus;
    @XmlElement(name = "RegistryCertificateDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DocumentReferenceType registryCertificateDocumentReference;
    @XmlElement(name = "RegistryPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType registryPortLocation;
    @XmlElement(name = "VesselDynamics", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected VesselDynamics vesselDynamics;

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
     * Gets the value of the vesselID property.
     * 
     * @return
     *     possible object is
     *     {@link VesselID }
     *     
     */
    public VesselID getVesselID() {
        return vesselID;
    }

    /**
     * Sets the value of the vesselID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselID }
     *     
     */
    public void setVesselID(VesselID value) {
        this.vesselID = value;
    }

    /**
     * Gets the value of the vesselName property.
     * 
     * @return
     *     possible object is
     *     {@link VesselName }
     *     
     */
    public VesselName getVesselName() {
        return vesselName;
    }

    /**
     * Sets the value of the vesselName property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselName }
     *     
     */
    public void setVesselName(VesselName value) {
        this.vesselName = value;
    }

    /**
     * Gets the value of the radioCallSignID property.
     * 
     * @return
     *     possible object is
     *     {@link RadioCallSignID }
     *     
     */
    public RadioCallSignID getRadioCallSignID() {
        return radioCallSignID;
    }

    /**
     * Sets the value of the radioCallSignID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioCallSignID }
     *     
     */
    public void setRadioCallSignID(RadioCallSignID value) {
        this.radioCallSignID = value;
    }

    /**
     * Gets the value of the mmsiRegistrationID property.
     * 
     * @return
     *     possible object is
     *     {@link MMSIRegistrationID }
     *     
     */
    public MMSIRegistrationID getMMSIRegistrationID() {
        return mmsiRegistrationID;
    }

    /**
     * Sets the value of the mmsiRegistrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMSIRegistrationID }
     *     
     */
    public void setMMSIRegistrationID(MMSIRegistrationID value) {
        this.mmsiRegistrationID = value;
    }

    /**
     * Gets the value of the shipsRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipsRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipsRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipsRequirements }
     * 
     * 
     */
    public List<ShipsRequirements> getShipsRequirements() {
        if (shipsRequirements == null) {
            shipsRequirements = new ArrayList<ShipsRequirements>();
        }
        return this.shipsRequirements;
    }

    /**
     * Gets the value of the grossTonnageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GrossTonnageMeasure }
     *     
     */
    public GrossTonnageMeasure getGrossTonnageMeasure() {
        return grossTonnageMeasure;
    }

    /**
     * Sets the value of the grossTonnageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossTonnageMeasure }
     *     
     */
    public void setGrossTonnageMeasure(GrossTonnageMeasure value) {
        this.grossTonnageMeasure = value;
    }

    /**
     * Gets the value of the netTonnageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link NetTonnageMeasure }
     *     
     */
    public NetTonnageMeasure getNetTonnageMeasure() {
        return netTonnageMeasure;
    }

    /**
     * Sets the value of the netTonnageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetTonnageMeasure }
     *     
     */
    public void setNetTonnageMeasure(NetTonnageMeasure value) {
        this.netTonnageMeasure = value;
    }

    /**
     * Gets the value of the segregatedBallastMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedBallastMeasure }
     *     
     */
    public SegregatedBallastMeasure getSegregatedBallastMeasure() {
        return segregatedBallastMeasure;
    }

    /**
     * Sets the value of the segregatedBallastMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedBallastMeasure }
     *     
     */
    public void setSegregatedBallastMeasure(SegregatedBallastMeasure value) {
        this.segregatedBallastMeasure = value;
    }

    /**
     * Gets the value of the shipConfigurationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipConfigurationCode }
     *     
     */
    public ShipConfigurationCode getShipConfigurationCode() {
        return shipConfigurationCode;
    }

    /**
     * Sets the value of the shipConfigurationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipConfigurationCode }
     *     
     */
    public void setShipConfigurationCode(ShipConfigurationCode value) {
        this.shipConfigurationCode = value;
    }

    /**
     * Gets the value of the infShipClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link INFShipClassCode }
     *     
     */
    public INFShipClassCode getINFShipClassCode() {
        return infShipClassCode;
    }

    /**
     * Sets the value of the infShipClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link INFShipClassCode }
     *     
     */
    public void setINFShipClassCode(INFShipClassCode value) {
        this.infShipClassCode = value;
    }

    /**
     * Gets the value of the antennaLocus property.
     * 
     * @return
     *     possible object is
     *     {@link AntennaLocus }
     *     
     */
    public AntennaLocus getAntennaLocus() {
        return antennaLocus;
    }

    /**
     * Sets the value of the antennaLocus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntennaLocus }
     *     
     */
    public void setAntennaLocus(AntennaLocus value) {
        this.antennaLocus = value;
    }

    /**
     * Gets the value of the registryCertificateDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getRegistryCertificateDocumentReference() {
        return registryCertificateDocumentReference;
    }

    /**
     * Sets the value of the registryCertificateDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setRegistryCertificateDocumentReference(DocumentReferenceType value) {
        this.registryCertificateDocumentReference = value;
    }

    /**
     * Gets the value of the registryPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getRegistryPortLocation() {
        return registryPortLocation;
    }

    /**
     * Sets the value of the registryPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setRegistryPortLocation(LocationType value) {
        this.registryPortLocation = value;
    }

    /**
     * Gets the value of the vesselDynamics property.
     * 
     * @return
     *     possible object is
     *     {@link VesselDynamics }
     *     
     */
    public VesselDynamics getVesselDynamics() {
        return vesselDynamics;
    }

    /**
     * Sets the value of the vesselDynamics property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselDynamics }
     *     
     */
    public void setVesselDynamics(VesselDynamics value) {
        this.vesselDynamics = value;
    }

}
