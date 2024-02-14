
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
 * <p>Java class for MaritimeWasteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaritimeWasteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}WasteTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ToBeDeliveredMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RetainedOnBoardMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaxDedicatedStorageCapacityMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}EstimatedGeneratedUntilNextPortMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RemainingWasteDeliveryPortLocation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaritimeWasteType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "descriptions",
    "wasteTypeCode",
    "toBeDeliveredMeasure",
    "retainedOnBoardMeasure",
    "maxDedicatedStorageCapacityMeasure",
    "estimatedGeneratedUntilNextPortMeasure",
    "remainingWasteDeliveryPortLocations"
})
@XmlRootElement(name = "MaritimeWaste", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class MaritimeWaste
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "WasteTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected WasteTypeCode wasteTypeCode;
    @XmlElement(name = "ToBeDeliveredMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ToBeDeliveredMeasure toBeDeliveredMeasure;
    @XmlElement(name = "RetainedOnBoardMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RetainedOnBoardMeasure retainedOnBoardMeasure;
    @XmlElement(name = "MaxDedicatedStorageCapacityMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaxDedicatedStorageCapacityMeasure maxDedicatedStorageCapacityMeasure;
    @XmlElement(name = "EstimatedGeneratedUntilNextPortMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected EstimatedGeneratedUntilNextPortMeasure estimatedGeneratedUntilNextPortMeasure;
    @XmlElement(name = "RemainingWasteDeliveryPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LocationType> remainingWasteDeliveryPortLocations;

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
     * Gets the value of the wasteTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link WasteTypeCode }
     *     
     */
    public WasteTypeCode getWasteTypeCode() {
        return wasteTypeCode;
    }

    /**
     * Sets the value of the wasteTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WasteTypeCode }
     *     
     */
    public void setWasteTypeCode(WasteTypeCode value) {
        this.wasteTypeCode = value;
    }

    /**
     * Gets the value of the toBeDeliveredMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ToBeDeliveredMeasure }
     *     
     */
    public ToBeDeliveredMeasure getToBeDeliveredMeasure() {
        return toBeDeliveredMeasure;
    }

    /**
     * Sets the value of the toBeDeliveredMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToBeDeliveredMeasure }
     *     
     */
    public void setToBeDeliveredMeasure(ToBeDeliveredMeasure value) {
        this.toBeDeliveredMeasure = value;
    }

    /**
     * Gets the value of the retainedOnBoardMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link RetainedOnBoardMeasure }
     *     
     */
    public RetainedOnBoardMeasure getRetainedOnBoardMeasure() {
        return retainedOnBoardMeasure;
    }

    /**
     * Sets the value of the retainedOnBoardMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetainedOnBoardMeasure }
     *     
     */
    public void setRetainedOnBoardMeasure(RetainedOnBoardMeasure value) {
        this.retainedOnBoardMeasure = value;
    }

    /**
     * Gets the value of the maxDedicatedStorageCapacityMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MaxDedicatedStorageCapacityMeasure }
     *     
     */
    public MaxDedicatedStorageCapacityMeasure getMaxDedicatedStorageCapacityMeasure() {
        return maxDedicatedStorageCapacityMeasure;
    }

    /**
     * Sets the value of the maxDedicatedStorageCapacityMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxDedicatedStorageCapacityMeasure }
     *     
     */
    public void setMaxDedicatedStorageCapacityMeasure(MaxDedicatedStorageCapacityMeasure value) {
        this.maxDedicatedStorageCapacityMeasure = value;
    }

    /**
     * Gets the value of the estimatedGeneratedUntilNextPortMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedGeneratedUntilNextPortMeasure }
     *     
     */
    public EstimatedGeneratedUntilNextPortMeasure getEstimatedGeneratedUntilNextPortMeasure() {
        return estimatedGeneratedUntilNextPortMeasure;
    }

    /**
     * Sets the value of the estimatedGeneratedUntilNextPortMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedGeneratedUntilNextPortMeasure }
     *     
     */
    public void setEstimatedGeneratedUntilNextPortMeasure(EstimatedGeneratedUntilNextPortMeasure value) {
        this.estimatedGeneratedUntilNextPortMeasure = value;
    }

    /**
     * Gets the value of the remainingWasteDeliveryPortLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remainingWasteDeliveryPortLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemainingWasteDeliveryPortLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getRemainingWasteDeliveryPortLocations() {
        if (remainingWasteDeliveryPortLocations == null) {
            remainingWasteDeliveryPortLocations = new ArrayList<LocationType>();
        }
        return this.remainingWasteDeliveryPortLocations;
    }

}
