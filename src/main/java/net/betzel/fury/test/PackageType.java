
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Quantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReturnableMaterialIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackageLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackagingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackagingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackingMaterial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainedPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContainingTransportEquipment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Pickup" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Despatch" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "quantity",
    "returnableMaterialIndicator",
    "packageLevelCode",
    "packagingTypeCode",
    "packagingTypes",
    "packingMaterials",
    "traceID",
    "containedPackages",
    "containingTransportEquipment",
    "goodsItems",
    "measurementDimensions",
    "deliveryUnits",
    "delivery",
    "pickup",
    "despatch",
    "statuses"
})
public class PackageType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "Quantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected Quantity quantity;
    @XmlElement(name = "ReturnableMaterialIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReturnableMaterialIndicator returnableMaterialIndicator;
    @XmlElement(name = "PackageLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PackageLevelCode packageLevelCode;
    @XmlElement(name = "PackagingTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected PackagingTypeCode packagingTypeCode;
    @XmlElement(name = "PackagingType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PackagingType> packagingTypes;
    @XmlElement(name = "PackingMaterial", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<PackingMaterial> packingMaterials;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TraceID traceID;
    @XmlElement(name = "ContainedPackage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PackageType> containedPackages;
    @XmlElement(name = "ContainingTransportEquipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TransportEquipmentType containingTransportEquipment;
    @XmlElement(name = "GoodsItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<GoodsItemType> goodsItems;
    @XmlElement(name = "MeasurementDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DimensionType> measurementDimensions;
    @XmlElement(name = "DeliveryUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DeliveryUnitType> deliveryUnits;
    @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DeliveryType delivery;
    @XmlElement(name = "Pickup", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected Pickup pickup;
    @XmlElement(name = "Despatch", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected Despatch despatch;
    @XmlElement(name = "Status", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<StatusType> statuses;

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
     * Gets the value of the returnableMaterialIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnableMaterialIndicator }
     *     
     */
    public ReturnableMaterialIndicator getReturnableMaterialIndicator() {
        return returnableMaterialIndicator;
    }

    /**
     * Sets the value of the returnableMaterialIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnableMaterialIndicator }
     *     
     */
    public void setReturnableMaterialIndicator(ReturnableMaterialIndicator value) {
        this.returnableMaterialIndicator = value;
    }

    /**
     * Gets the value of the packageLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackageLevelCode }
     *     
     */
    public PackageLevelCode getPackageLevelCode() {
        return packageLevelCode;
    }

    /**
     * Sets the value of the packageLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageLevelCode }
     *     
     */
    public void setPackageLevelCode(PackageLevelCode value) {
        this.packageLevelCode = value;
    }

    /**
     * Gets the value of the packagingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingTypeCode }
     *     
     */
    public PackagingTypeCode getPackagingTypeCode() {
        return packagingTypeCode;
    }

    /**
     * Sets the value of the packagingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingTypeCode }
     *     
     */
    public void setPackagingTypeCode(PackagingTypeCode value) {
        this.packagingTypeCode = value;
    }

    /**
     * Gets the value of the packagingTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packagingTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagingTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagingType }
     * 
     * 
     */
    public List<PackagingType> getPackagingTypes() {
        if (packagingTypes == null) {
            packagingTypes = new ArrayList<PackagingType>();
        }
        return this.packagingTypes;
    }

    /**
     * Gets the value of the packingMaterials property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packingMaterials property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackingMaterials().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackingMaterial }
     * 
     * 
     */
    public List<PackingMaterial> getPackingMaterials() {
        if (packingMaterials == null) {
            packingMaterials = new ArrayList<PackingMaterial>();
        }
        return this.packingMaterials;
    }

    /**
     * Gets the value of the traceID property.
     * 
     * @return
     *     possible object is
     *     {@link TraceID }
     *     
     */
    public TraceID getTraceID() {
        return traceID;
    }

    /**
     * Sets the value of the traceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraceID }
     *     
     */
    public void setTraceID(TraceID value) {
        this.traceID = value;
    }

    /**
     * Gets the value of the containedPackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containedPackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainedPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getContainedPackages() {
        if (containedPackages == null) {
            containedPackages = new ArrayList<PackageType>();
        }
        return this.containedPackages;
    }

    /**
     * Gets the value of the containingTransportEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEquipmentType }
     *     
     */
    public TransportEquipmentType getContainingTransportEquipment() {
        return containingTransportEquipment;
    }

    /**
     * Sets the value of the containingTransportEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEquipmentType }
     *     
     */
    public void setContainingTransportEquipment(TransportEquipmentType value) {
        this.containingTransportEquipment = value;
    }

    /**
     * Gets the value of the goodsItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemType }
     * 
     * 
     */
    public List<GoodsItemType> getGoodsItems() {
        if (goodsItems == null) {
            goodsItems = new ArrayList<GoodsItemType>();
        }
        return this.goodsItems;
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
     * Gets the value of the deliveryUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryUnitType }
     * 
     * 
     */
    public List<DeliveryUnitType> getDeliveryUnits() {
        if (deliveryUnits == null) {
            deliveryUnits = new ArrayList<DeliveryUnitType>();
        }
        return this.deliveryUnits;
    }

    /**
     * Gets the value of the delivery property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDelivery() {
        return delivery;
    }

    /**
     * Sets the value of the delivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDelivery(DeliveryType value) {
        this.delivery = value;
    }

    /**
     * Gets the value of the pickup property.
     * 
     * @return
     *     possible object is
     *     {@link Pickup }
     *     
     */
    public Pickup getPickup() {
        return pickup;
    }

    /**
     * Sets the value of the pickup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pickup }
     *     
     */
    public void setPickup(Pickup value) {
        this.pickup = value;
    }

    /**
     * Gets the value of the despatch property.
     * 
     * @return
     *     possible object is
     *     {@link Despatch }
     *     
     */
    public Despatch getDespatch() {
        return despatch;
    }

    /**
     * Sets the value of the despatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Despatch }
     *     
     */
    public void setDespatch(Despatch value) {
        this.despatch = value;
    }

    /**
     * Gets the value of the statuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusType }
     * 
     * 
     */
    public List<StatusType> getStatuses() {
        if (statuses == null) {
            statuses = new ArrayList<StatusType>();
        }
        return this.statuses;
    }

}
