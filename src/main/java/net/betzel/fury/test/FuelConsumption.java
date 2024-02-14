
package net.betzel.fury.test;

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
 * <p>Java class for FuelConsumptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FuelConsumptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FuelTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FuelType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FuelConsumptionMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalFuelProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FuelMetering" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EnvironmentalEmission" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FuelProviderParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FuelConsumptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "fuelTypeCode",
    "fuelTypes",
    "fuelConsumptionMeasure",
    "additionalFuelProperties",
    "fuelMeterings",
    "environmentalEmissions",
    "fuelProviderParty"
})
@XmlRootElement(name = "FuelConsumption", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class FuelConsumption
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "FuelTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FuelTypeCode fuelTypeCode;
    @XmlElement(name = "FuelType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<FuelType> fuelTypes;
    @XmlElement(name = "FuelConsumptionMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FuelConsumptionMeasure fuelConsumptionMeasure;
    @XmlElement(name = "AdditionalFuelProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<FuelPropertyType> additionalFuelProperties;
    @XmlElement(name = "FuelMetering", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<FuelMetering> fuelMeterings;
    @XmlElement(name = "EnvironmentalEmission", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EnvironmentalEmission> environmentalEmissions;
    @XmlElement(name = "FuelProviderParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType fuelProviderParty;

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
     * Gets the value of the fuelTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeCode }
     *     
     */
    public FuelTypeCode getFuelTypeCode() {
        return fuelTypeCode;
    }

    /**
     * Sets the value of the fuelTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeCode }
     *     
     */
    public void setFuelTypeCode(FuelTypeCode value) {
        this.fuelTypeCode = value;
    }

    /**
     * Gets the value of the fuelTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuelTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuelTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuelType }
     * 
     * 
     */
    public List<FuelType> getFuelTypes() {
        if (fuelTypes == null) {
            fuelTypes = new ArrayList<FuelType>();
        }
        return this.fuelTypes;
    }

    /**
     * Gets the value of the fuelConsumptionMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link FuelConsumptionMeasure }
     *     
     */
    public FuelConsumptionMeasure getFuelConsumptionMeasure() {
        return fuelConsumptionMeasure;
    }

    /**
     * Sets the value of the fuelConsumptionMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelConsumptionMeasure }
     *     
     */
    public void setFuelConsumptionMeasure(FuelConsumptionMeasure value) {
        this.fuelConsumptionMeasure = value;
    }

    /**
     * Gets the value of the additionalFuelProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalFuelProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalFuelProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuelPropertyType }
     * 
     * 
     */
    public List<FuelPropertyType> getAdditionalFuelProperties() {
        if (additionalFuelProperties == null) {
            additionalFuelProperties = new ArrayList<FuelPropertyType>();
        }
        return this.additionalFuelProperties;
    }

    /**
     * Gets the value of the fuelMeterings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fuelMeterings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFuelMeterings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FuelMetering }
     * 
     * 
     */
    public List<FuelMetering> getFuelMeterings() {
        if (fuelMeterings == null) {
            fuelMeterings = new ArrayList<FuelMetering>();
        }
        return this.fuelMeterings;
    }

    /**
     * Gets the value of the environmentalEmissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalEmissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalEmissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentalEmission }
     * 
     * 
     */
    public List<EnvironmentalEmission> getEnvironmentalEmissions() {
        if (environmentalEmissions == null) {
            environmentalEmissions = new ArrayList<EnvironmentalEmission>();
        }
        return this.environmentalEmissions;
    }

    /**
     * Gets the value of the fuelProviderParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getFuelProviderParty() {
        return fuelProviderParty;
    }

    /**
     * Sets the value of the fuelProviderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setFuelProviderParty(PartyType value) {
        this.fuelProviderParty = value;
    }

}
