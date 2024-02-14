
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AddressTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AddressFormatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Postbox" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Floor" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Room" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StreetName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalStreetName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BlockName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuildingName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuildingNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InhouseMail" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Department" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkAttention" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkCare" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CitySubdivisionName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PostalZone" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Region" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}District" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimezoneOffset" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AddressLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LocationCoordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "addressTypeCode",
    "addressFormatCode",
    "postbox",
    "floor",
    "room",
    "streetName",
    "additionalStreetName",
    "blockName",
    "buildingName",
    "buildingNumber",
    "descriptions",
    "inhouseMail",
    "department",
    "markAttention",
    "markCare",
    "plotIdentification",
    "citySubdivisionName",
    "cityName",
    "postalZone",
    "countrySubentity",
    "countrySubentityCode",
    "region",
    "district",
    "timezoneOffset",
    "addressLines",
    "country",
    "locationCoordinates"
})
public class AddressType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "AddressTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AddressTypeCode addressTypeCode;
    @XmlElement(name = "AddressFormatCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AddressFormatCode addressFormatCode;
    @XmlElement(name = "Postbox", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Postbox postbox;
    @XmlElement(name = "Floor", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Floor floor;
    @XmlElement(name = "Room", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Room room;
    @XmlElement(name = "StreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected StreetName streetName;
    @XmlElement(name = "AdditionalStreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AdditionalStreetName additionalStreetName;
    @XmlElement(name = "BlockName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BlockName blockName;
    @XmlElement(name = "BuildingName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BuildingName buildingName;
    @XmlElement(name = "BuildingNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BuildingNumber buildingNumber;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "InhouseMail", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InhouseMail inhouseMail;
    @XmlElement(name = "Department", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Department department;
    @XmlElement(name = "MarkAttention", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MarkAttention markAttention;
    @XmlElement(name = "MarkCare", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MarkCare markCare;
    @XmlElement(name = "PlotIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PlotIdentification plotIdentification;
    @XmlElement(name = "CitySubdivisionName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CitySubdivisionName citySubdivisionName;
    @XmlElement(name = "CityName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CityName cityName;
    @XmlElement(name = "PostalZone", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PostalZone postalZone;
    @XmlElement(name = "CountrySubentity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CountrySubentity countrySubentity;
    @XmlElement(name = "CountrySubentityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CountrySubentityCode countrySubentityCode;
    @XmlElement(name = "Region", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Region region;
    @XmlElement(name = "District", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected District district;
    @XmlElement(name = "TimezoneOffset", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TimezoneOffset timezoneOffset;
    @XmlElement(name = "AddressLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AddressLine> addressLines;
    @XmlElement(name = "Country", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CountryType country;
    @XmlElement(name = "LocationCoordinate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LocationCoordinate> locationCoordinates;

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
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link AddressTypeCode }
     *     
     */
    public AddressTypeCode getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressTypeCode }
     *     
     */
    public void setAddressTypeCode(AddressTypeCode value) {
        this.addressTypeCode = value;
    }

    /**
     * Gets the value of the addressFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link AddressFormatCode }
     *     
     */
    public AddressFormatCode getAddressFormatCode() {
        return addressFormatCode;
    }

    /**
     * Sets the value of the addressFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressFormatCode }
     *     
     */
    public void setAddressFormatCode(AddressFormatCode value) {
        this.addressFormatCode = value;
    }

    /**
     * Gets the value of the postbox property.
     * 
     * @return
     *     possible object is
     *     {@link Postbox }
     *     
     */
    public Postbox getPostbox() {
        return postbox;
    }

    /**
     * Sets the value of the postbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link Postbox }
     *     
     */
    public void setPostbox(Postbox value) {
        this.postbox = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link Floor }
     *     
     */
    public Floor getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Floor }
     *     
     */
    public void setFloor(Floor value) {
        this.floor = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link Room }
     *     
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link Room }
     *     
     */
    public void setRoom(Room value) {
        this.room = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link StreetName }
     *     
     */
    public StreetName getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreetName }
     *     
     */
    public void setStreetName(StreetName value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the additionalStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalStreetName }
     *     
     */
    public AdditionalStreetName getAdditionalStreetName() {
        return additionalStreetName;
    }

    /**
     * Sets the value of the additionalStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalStreetName }
     *     
     */
    public void setAdditionalStreetName(AdditionalStreetName value) {
        this.additionalStreetName = value;
    }

    /**
     * Gets the value of the blockName property.
     * 
     * @return
     *     possible object is
     *     {@link BlockName }
     *     
     */
    public BlockName getBlockName() {
        return blockName;
    }

    /**
     * Sets the value of the blockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockName }
     *     
     */
    public void setBlockName(BlockName value) {
        this.blockName = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingName }
     *     
     */
    public BuildingName getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingName }
     *     
     */
    public void setBuildingName(BuildingName value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BuildingNumber }
     *     
     */
    public BuildingNumber getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingNumber }
     *     
     */
    public void setBuildingNumber(BuildingNumber value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the inhouseMail property.
     * 
     * @return
     *     possible object is
     *     {@link InhouseMail }
     *     
     */
    public InhouseMail getInhouseMail() {
        return inhouseMail;
    }

    /**
     * Sets the value of the inhouseMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InhouseMail }
     *     
     */
    public void setInhouseMail(InhouseMail value) {
        this.inhouseMail = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    /**
     * Gets the value of the markAttention property.
     * 
     * @return
     *     possible object is
     *     {@link MarkAttention }
     *     
     */
    public MarkAttention getMarkAttention() {
        return markAttention;
    }

    /**
     * Sets the value of the markAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkAttention }
     *     
     */
    public void setMarkAttention(MarkAttention value) {
        this.markAttention = value;
    }

    /**
     * Gets the value of the markCare property.
     * 
     * @return
     *     possible object is
     *     {@link MarkCare }
     *     
     */
    public MarkCare getMarkCare() {
        return markCare;
    }

    /**
     * Sets the value of the markCare property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkCare }
     *     
     */
    public void setMarkCare(MarkCare value) {
        this.markCare = value;
    }

    /**
     * Gets the value of the plotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PlotIdentification }
     *     
     */
    public PlotIdentification getPlotIdentification() {
        return plotIdentification;
    }

    /**
     * Sets the value of the plotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlotIdentification }
     *     
     */
    public void setPlotIdentification(PlotIdentification value) {
        this.plotIdentification = value;
    }

    /**
     * Gets the value of the citySubdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link CitySubdivisionName }
     *     
     */
    public CitySubdivisionName getCitySubdivisionName() {
        return citySubdivisionName;
    }

    /**
     * Sets the value of the citySubdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitySubdivisionName }
     *     
     */
    public void setCitySubdivisionName(CitySubdivisionName value) {
        this.citySubdivisionName = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link CityName }
     *     
     */
    public CityName getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityName }
     *     
     */
    public void setCityName(CityName value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the postalZone property.
     * 
     * @return
     *     possible object is
     *     {@link PostalZone }
     *     
     */
    public PostalZone getPostalZone() {
        return postalZone;
    }

    /**
     * Sets the value of the postalZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalZone }
     *     
     */
    public void setPostalZone(PostalZone value) {
        this.postalZone = value;
    }

    /**
     * Gets the value of the countrySubentity property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubentity }
     *     
     */
    public CountrySubentity getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * Sets the value of the countrySubentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubentity }
     *     
     */
    public void setCountrySubentity(CountrySubentity value) {
        this.countrySubentity = value;
    }

    /**
     * Gets the value of the countrySubentityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubentityCode }
     *     
     */
    public CountrySubentityCode getCountrySubentityCode() {
        return countrySubentityCode;
    }

    /**
     * Sets the value of the countrySubentityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubentityCode }
     *     
     */
    public void setCountrySubentityCode(CountrySubentityCode value) {
        this.countrySubentityCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     */
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link District }
     *     
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link District }
     *     
     */
    public void setDistrict(District value) {
        this.district = value;
    }

    /**
     * Gets the value of the timezoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link TimezoneOffset }
     *     
     */
    public TimezoneOffset getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Sets the value of the timezoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimezoneOffset }
     *     
     */
    public void setTimezoneOffset(TimezoneOffset value) {
        this.timezoneOffset = value;
    }

    /**
     * Gets the value of the addressLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLine }
     * 
     * 
     */
    public List<AddressLine> getAddressLines() {
        if (addressLines == null) {
            addressLines = new ArrayList<AddressLine>();
        }
        return this.addressLines;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the locationCoordinates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCoordinates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCoordinates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationCoordinate }
     * 
     * 
     */
    public List<LocationCoordinate> getLocationCoordinates() {
        if (locationCoordinates == null) {
            locationCoordinates = new ArrayList<LocationCoordinate>();
        }
        return this.locationCoordinates;
    }

}
