
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
 * <p>Java class for EventLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineNumberNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ParticipatingLocationsLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RetailPlannedImpact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SupplyItem"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventLineItemType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "lineNumberNumeric",
    "participatingLocationsLocation",
    "retailPlannedImpacts",
    "supplyItem"
})
@XmlRootElement(name = "EventLineItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class EventLineItem
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "LineNumberNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LineNumberNumeric lineNumberNumeric;
    @XmlElement(name = "ParticipatingLocationsLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType participatingLocationsLocation;
    @XmlElement(name = "RetailPlannedImpact", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<RetailPlannedImpact> retailPlannedImpacts;
    @XmlElement(name = "SupplyItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected ItemType supplyItem;

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
     * Gets the value of the lineNumberNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link LineNumberNumeric }
     *     
     */
    public LineNumberNumeric getLineNumberNumeric() {
        return lineNumberNumeric;
    }

    /**
     * Sets the value of the lineNumberNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineNumberNumeric }
     *     
     */
    public void setLineNumberNumeric(LineNumberNumeric value) {
        this.lineNumberNumeric = value;
    }

    /**
     * Gets the value of the participatingLocationsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getParticipatingLocationsLocation() {
        return participatingLocationsLocation;
    }

    /**
     * Sets the value of the participatingLocationsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setParticipatingLocationsLocation(LocationType value) {
        this.participatingLocationsLocation = value;
    }

    /**
     * Gets the value of the retailPlannedImpacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPlannedImpacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailPlannedImpacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPlannedImpact }
     * 
     * 
     */
    public List<RetailPlannedImpact> getRetailPlannedImpacts() {
        if (retailPlannedImpacts == null) {
            retailPlannedImpacts = new ArrayList<RetailPlannedImpact>();
        }
        return this.retailPlannedImpacts;
    }

    /**
     * Gets the value of the supplyItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getSupplyItem() {
        return supplyItem;
    }

    /**
     * Sets the value of the supplyItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setSupplyItem(ItemType value) {
        this.supplyItem = value;
    }

}
