
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
 * <p>Java class for ISPSRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ISPSRequirementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidISSCIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ISSCAbsenceReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ISSCExpiryDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SSPOnBoardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SSPSecurityMeasuresAppliedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CurrentOperatingSecurityLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalMattersDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalSecurityMeasure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PortCallRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipToShipActivityRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReportLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ISSCIssuerParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SecurityOfficerPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISPSRequirementsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "validISSCIndicator",
    "isscAbsenceReasons",
    "isscExpiryDate",
    "sspOnBoardIndicator",
    "sspSecurityMeasuresAppliedIndicator",
    "currentOperatingSecurityLevelCode",
    "additionalMattersDescriptions",
    "additionalSecurityMeasures",
    "portCallRecords",
    "shipToShipActivityRecords",
    "reportLocation",
    "isscIssuerParty",
    "securityOfficerPerson"
})
@XmlRootElement(name = "ISPSRequirements", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ISPSRequirements
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
    @XmlElement(name = "ValidISSCIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidISSCIndicator validISSCIndicator;
    @XmlElement(name = "ISSCAbsenceReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ISSCAbsenceReason> isscAbsenceReasons;
    @XmlElement(name = "ISSCExpiryDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ISSCExpiryDate isscExpiryDate;
    @XmlElement(name = "SSPOnBoardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SSPOnBoardIndicator sspOnBoardIndicator;
    @XmlElement(name = "SSPSecurityMeasuresAppliedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SSPSecurityMeasuresAppliedIndicator sspSecurityMeasuresAppliedIndicator;
    @XmlElement(name = "CurrentOperatingSecurityLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CurrentOperatingSecurityLevelCode currentOperatingSecurityLevelCode;
    @XmlElement(name = "AdditionalMattersDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<AdditionalMattersDescription> additionalMattersDescriptions;
    @XmlElement(name = "AdditionalSecurityMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<SecurityMeasureType> additionalSecurityMeasures;
    @XmlElement(name = "PortCallRecord", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PortCallRecord> portCallRecords;
    @XmlElement(name = "ShipToShipActivityRecord", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipToShipActivityRecord> shipToShipActivityRecords;
    @XmlElement(name = "ReportLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType reportLocation;
    @XmlElement(name = "ISSCIssuerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType isscIssuerParty;
    @XmlElement(name = "SecurityOfficerPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PersonType securityOfficerPerson;

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
     * Gets the value of the validISSCIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ValidISSCIndicator }
     *     
     */
    public ValidISSCIndicator getValidISSCIndicator() {
        return validISSCIndicator;
    }

    /**
     * Sets the value of the validISSCIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidISSCIndicator }
     *     
     */
    public void setValidISSCIndicator(ValidISSCIndicator value) {
        this.validISSCIndicator = value;
    }

    /**
     * Gets the value of the isscAbsenceReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isscAbsenceReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISSCAbsenceReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ISSCAbsenceReason }
     * 
     * 
     */
    public List<ISSCAbsenceReason> getISSCAbsenceReasons() {
        if (isscAbsenceReasons == null) {
            isscAbsenceReasons = new ArrayList<ISSCAbsenceReason>();
        }
        return this.isscAbsenceReasons;
    }

    /**
     * Gets the value of the isscExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link ISSCExpiryDate }
     *     
     */
    public ISSCExpiryDate getISSCExpiryDate() {
        return isscExpiryDate;
    }

    /**
     * Sets the value of the isscExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISSCExpiryDate }
     *     
     */
    public void setISSCExpiryDate(ISSCExpiryDate value) {
        this.isscExpiryDate = value;
    }

    /**
     * Gets the value of the sspOnBoardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SSPOnBoardIndicator }
     *     
     */
    public SSPOnBoardIndicator getSSPOnBoardIndicator() {
        return sspOnBoardIndicator;
    }

    /**
     * Sets the value of the sspOnBoardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPOnBoardIndicator }
     *     
     */
    public void setSSPOnBoardIndicator(SSPOnBoardIndicator value) {
        this.sspOnBoardIndicator = value;
    }

    /**
     * Gets the value of the sspSecurityMeasuresAppliedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SSPSecurityMeasuresAppliedIndicator }
     *     
     */
    public SSPSecurityMeasuresAppliedIndicator getSSPSecurityMeasuresAppliedIndicator() {
        return sspSecurityMeasuresAppliedIndicator;
    }

    /**
     * Sets the value of the sspSecurityMeasuresAppliedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSPSecurityMeasuresAppliedIndicator }
     *     
     */
    public void setSSPSecurityMeasuresAppliedIndicator(SSPSecurityMeasuresAppliedIndicator value) {
        this.sspSecurityMeasuresAppliedIndicator = value;
    }

    /**
     * Gets the value of the currentOperatingSecurityLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentOperatingSecurityLevelCode }
     *     
     */
    public CurrentOperatingSecurityLevelCode getCurrentOperatingSecurityLevelCode() {
        return currentOperatingSecurityLevelCode;
    }

    /**
     * Sets the value of the currentOperatingSecurityLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentOperatingSecurityLevelCode }
     *     
     */
    public void setCurrentOperatingSecurityLevelCode(CurrentOperatingSecurityLevelCode value) {
        this.currentOperatingSecurityLevelCode = value;
    }

    /**
     * Gets the value of the additionalMattersDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalMattersDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalMattersDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalMattersDescription }
     * 
     * 
     */
    public List<AdditionalMattersDescription> getAdditionalMattersDescriptions() {
        if (additionalMattersDescriptions == null) {
            additionalMattersDescriptions = new ArrayList<AdditionalMattersDescription>();
        }
        return this.additionalMattersDescriptions;
    }

    /**
     * Gets the value of the additionalSecurityMeasures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalSecurityMeasures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalSecurityMeasures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityMeasureType }
     * 
     * 
     */
    public List<SecurityMeasureType> getAdditionalSecurityMeasures() {
        if (additionalSecurityMeasures == null) {
            additionalSecurityMeasures = new ArrayList<SecurityMeasureType>();
        }
        return this.additionalSecurityMeasures;
    }

    /**
     * Gets the value of the portCallRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portCallRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortCallRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortCallRecord }
     * 
     * 
     */
    public List<PortCallRecord> getPortCallRecords() {
        if (portCallRecords == null) {
            portCallRecords = new ArrayList<PortCallRecord>();
        }
        return this.portCallRecords;
    }

    /**
     * Gets the value of the shipToShipActivityRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToShipActivityRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToShipActivityRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipToShipActivityRecord }
     * 
     * 
     */
    public List<ShipToShipActivityRecord> getShipToShipActivityRecords() {
        if (shipToShipActivityRecords == null) {
            shipToShipActivityRecords = new ArrayList<ShipToShipActivityRecord>();
        }
        return this.shipToShipActivityRecords;
    }

    /**
     * Gets the value of the reportLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getReportLocation() {
        return reportLocation;
    }

    /**
     * Sets the value of the reportLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setReportLocation(LocationType value) {
        this.reportLocation = value;
    }

    /**
     * Gets the value of the isscIssuerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getISSCIssuerParty() {
        return isscIssuerParty;
    }

    /**
     * Sets the value of the isscIssuerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setISSCIssuerParty(PartyType value) {
        this.isscIssuerParty = value;
    }

    /**
     * Gets the value of the securityOfficerPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getSecurityOfficerPerson() {
        return securityOfficerPerson;
    }

    /**
     * Sets the value of the securityOfficerPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setSecurityOfficerPerson(PersonType value) {
        this.securityOfficerPerson = value;
    }

}
