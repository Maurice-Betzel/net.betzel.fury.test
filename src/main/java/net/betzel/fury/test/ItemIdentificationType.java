
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExtendedID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BarcodeSymbologyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssuerScopeID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PhysicalAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}IssuerParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemIdentificationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "extendedID",
    "barcodeSymbologyID",
    "issuerScopeID",
    "physicalAttributes",
    "measurementDimensions",
    "issuerParty"
})
public class ItemIdentificationType
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
    @XmlElement(name = "ExtendedID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExtendedID extendedID;
    @XmlElement(name = "BarcodeSymbologyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BarcodeSymbologyID barcodeSymbologyID;
    @XmlElement(name = "IssuerScopeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IssuerScopeID issuerScopeID;
    @XmlElement(name = "PhysicalAttribute", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PhysicalAttribute> physicalAttributes;
    @XmlElement(name = "MeasurementDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DimensionType> measurementDimensions;
    @XmlElement(name = "IssuerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType issuerParty;

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
     * Gets the value of the extendedID property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedID }
     *     
     */
    public ExtendedID getExtendedID() {
        return extendedID;
    }

    /**
     * Sets the value of the extendedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedID }
     *     
     */
    public void setExtendedID(ExtendedID value) {
        this.extendedID = value;
    }

    /**
     * Gets the value of the barcodeSymbologyID property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeSymbologyID }
     *     
     */
    public BarcodeSymbologyID getBarcodeSymbologyID() {
        return barcodeSymbologyID;
    }

    /**
     * Sets the value of the barcodeSymbologyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeSymbologyID }
     *     
     */
    public void setBarcodeSymbologyID(BarcodeSymbologyID value) {
        this.barcodeSymbologyID = value;
    }

    /**
     * Gets the value of the issuerScopeID property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerScopeID }
     *     
     */
    public IssuerScopeID getIssuerScopeID() {
        return issuerScopeID;
    }

    /**
     * Sets the value of the issuerScopeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerScopeID }
     *     
     */
    public void setIssuerScopeID(IssuerScopeID value) {
        this.issuerScopeID = value;
    }

    /**
     * Gets the value of the physicalAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAttribute }
     * 
     * 
     */
    public List<PhysicalAttribute> getPhysicalAttributes() {
        if (physicalAttributes == null) {
            physicalAttributes = new ArrayList<PhysicalAttribute>();
        }
        return this.physicalAttributes;
    }

    /**
     * Gets the value of the measurementDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionType }
     * 
     * 
     */
    public List<DimensionType> getMeasurementDimensions() {
        if (measurementDimensions == null) {
            measurementDimensions = new ArrayList<DimensionType>();
        }
        return this.measurementDimensions;
    }

    /**
     * Gets the value of the issuerParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getIssuerParty() {
        return issuerParty;
    }

    /**
     * Sets the value of the issuerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setIssuerParty(PartyType value) {
        this.issuerParty = value;
    }

}
