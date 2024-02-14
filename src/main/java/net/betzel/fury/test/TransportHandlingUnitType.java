
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
 * <p>Java class for TransportHandlingUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportHandlingUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransportHandlingUnitTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalGoodsItemQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalPackageQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DamageRemarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShippingMarks" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HandlingUnitDespatchLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ActualPackage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReceivedHandlingUnitReceiptLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportEquipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousGoodsTransit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MeasurementDimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MinimumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}MaximumTemperature" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FloorSpaceMeasurementDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PalletSpaceMeasurementDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CustomsDeclaration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReferencedShipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Package" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DamageDocumentationAttachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportHandlingUnitType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "transportHandlingUnitTypeCode",
    "handlingCode",
    "handlingInstructions",
    "hazardousRiskIndicator",
    "totalGoodsItemQuantity",
    "totalPackageQuantity",
    "damageRemarks",
    "shippingMarks",
    "traceID",
    "handlingUnitDespatchLines",
    "actualPackages",
    "receivedHandlingUnitReceiptLines",
    "transportEquipments",
    "transportMeans",
    "hazardousGoodsTransits",
    "measurementDimensions",
    "minimumTemperature",
    "maximumTemperature",
    "goodsItems",
    "floorSpaceMeasurementDimension",
    "palletSpaceMeasurementDimension",
    "shipmentDocumentReferences",
    "statuses",
    "customsDeclarations",
    "referencedShipments",
    "packages",
    "damageDocumentationAttachments"
})
public class TransportHandlingUnitType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "TransportHandlingUnitTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TransportHandlingUnitTypeCode transportHandlingUnitTypeCode;
    @XmlElement(name = "HandlingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HandlingCode handlingCode;
    @XmlElement(name = "HandlingInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<HandlingInstructions> handlingInstructions;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HazardousRiskIndicator hazardousRiskIndicator;
    @XmlElement(name = "TotalGoodsItemQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalGoodsItemQuantity totalGoodsItemQuantity;
    @XmlElement(name = "TotalPackageQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalPackageQuantity totalPackageQuantity;
    @XmlElement(name = "DamageRemarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<DamageRemarks> damageRemarks;
    @XmlElement(name = "ShippingMarks", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ShippingMarks> shippingMarks;
    @XmlElement(name = "TraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TraceID traceID;
    @XmlElement(name = "HandlingUnitDespatchLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DespatchLineType> handlingUnitDespatchLines;
    @XmlElement(name = "ActualPackage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PackageType> actualPackages;
    @XmlElement(name = "ReceivedHandlingUnitReceiptLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ReceiptLineType> receivedHandlingUnitReceiptLines;
    @XmlElement(name = "TransportEquipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportEquipmentType> transportEquipments;
    @XmlElement(name = "TransportMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportMeansType> transportMeans;
    @XmlElement(name = "HazardousGoodsTransit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<HazardousGoodsTransit> hazardousGoodsTransits;
    @XmlElement(name = "MeasurementDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DimensionType> measurementDimensions;
    @XmlElement(name = "MinimumTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType minimumTemperature;
    @XmlElement(name = "MaximumTemperature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TemperatureType maximumTemperature;
    @XmlElement(name = "GoodsItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<GoodsItemType> goodsItems;
    @XmlElement(name = "FloorSpaceMeasurementDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DimensionType floorSpaceMeasurementDimension;
    @XmlElement(name = "PalletSpaceMeasurementDimension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DimensionType palletSpaceMeasurementDimension;
    @XmlElement(name = "ShipmentDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> shipmentDocumentReferences;
    @XmlElement(name = "Status", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<StatusType> statuses;
    @XmlElement(name = "CustomsDeclaration", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<CustomsDeclarationType> customsDeclarations;
    @XmlElement(name = "ReferencedShipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentType> referencedShipments;
    @XmlElement(name = "Package", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PackageType> packages;
    @XmlElement(name = "DamageDocumentationAttachment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AttachmentType> damageDocumentationAttachments;

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
     * Gets the value of the transportHandlingUnitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportHandlingUnitTypeCode }
     *     
     */
    public TransportHandlingUnitTypeCode getTransportHandlingUnitTypeCode() {
        return transportHandlingUnitTypeCode;
    }

    /**
     * Sets the value of the transportHandlingUnitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportHandlingUnitTypeCode }
     *     
     */
    public void setTransportHandlingUnitTypeCode(TransportHandlingUnitTypeCode value) {
        this.transportHandlingUnitTypeCode = value;
    }

    /**
     * Gets the value of the handlingCode property.
     * 
     * @return
     *     possible object is
     *     {@link HandlingCode }
     *     
     */
    public HandlingCode getHandlingCode() {
        return handlingCode;
    }

    /**
     * Sets the value of the handlingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandlingCode }
     *     
     */
    public void setHandlingCode(HandlingCode value) {
        this.handlingCode = value;
    }

    /**
     * Gets the value of the handlingInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HandlingInstructions }
     * 
     * 
     */
    public List<HandlingInstructions> getHandlingInstructions() {
        if (handlingInstructions == null) {
            handlingInstructions = new ArrayList<HandlingInstructions>();
        }
        return this.handlingInstructions;
    }

    /**
     * Gets the value of the hazardousRiskIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public HazardousRiskIndicator getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Sets the value of the hazardousRiskIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousRiskIndicator }
     *     
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicator value) {
        this.hazardousRiskIndicator = value;
    }

    /**
     * Gets the value of the totalGoodsItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalGoodsItemQuantity }
     *     
     */
    public TotalGoodsItemQuantity getTotalGoodsItemQuantity() {
        return totalGoodsItemQuantity;
    }

    /**
     * Sets the value of the totalGoodsItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalGoodsItemQuantity }
     *     
     */
    public void setTotalGoodsItemQuantity(TotalGoodsItemQuantity value) {
        this.totalGoodsItemQuantity = value;
    }

    /**
     * Gets the value of the totalPackageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPackageQuantity }
     *     
     */
    public TotalPackageQuantity getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    /**
     * Sets the value of the totalPackageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPackageQuantity }
     *     
     */
    public void setTotalPackageQuantity(TotalPackageQuantity value) {
        this.totalPackageQuantity = value;
    }

    /**
     * Gets the value of the damageRemarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the damageRemarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDamageRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DamageRemarks }
     * 
     * 
     */
    public List<DamageRemarks> getDamageRemarks() {
        if (damageRemarks == null) {
            damageRemarks = new ArrayList<DamageRemarks>();
        }
        return this.damageRemarks;
    }

    /**
     * Gets the value of the shippingMarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingMarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingMarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingMarks }
     * 
     * 
     */
    public List<ShippingMarks> getShippingMarks() {
        if (shippingMarks == null) {
            shippingMarks = new ArrayList<ShippingMarks>();
        }
        return this.shippingMarks;
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
     * Gets the value of the handlingUnitDespatchLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handlingUnitDespatchLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandlingUnitDespatchLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DespatchLineType }
     * 
     * 
     */
    public List<DespatchLineType> getHandlingUnitDespatchLines() {
        if (handlingUnitDespatchLines == null) {
            handlingUnitDespatchLines = new ArrayList<DespatchLineType>();
        }
        return this.handlingUnitDespatchLines;
    }

    /**
     * Gets the value of the actualPackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualPackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getActualPackages() {
        if (actualPackages == null) {
            actualPackages = new ArrayList<PackageType>();
        }
        return this.actualPackages;
    }

    /**
     * Gets the value of the receivedHandlingUnitReceiptLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivedHandlingUnitReceiptLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivedHandlingUnitReceiptLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiptLineType }
     * 
     * 
     */
    public List<ReceiptLineType> getReceivedHandlingUnitReceiptLines() {
        if (receivedHandlingUnitReceiptLines == null) {
            receivedHandlingUnitReceiptLines = new ArrayList<ReceiptLineType>();
        }
        return this.receivedHandlingUnitReceiptLines;
    }

    /**
     * Gets the value of the transportEquipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportEquipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportEquipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportEquipmentType }
     * 
     * 
     */
    public List<TransportEquipmentType> getTransportEquipments() {
        if (transportEquipments == null) {
            transportEquipments = new ArrayList<TransportEquipmentType>();
        }
        return this.transportEquipments;
    }

    /**
     * Gets the value of the transportMeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportMeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportMeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMeansType }
     * 
     * 
     */
    public List<TransportMeansType> getTransportMeans() {
        if (transportMeans == null) {
            transportMeans = new ArrayList<TransportMeansType>();
        }
        return this.transportMeans;
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
     * Gets the value of the minimumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Sets the value of the minimumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMinimumTemperature(TemperatureType value) {
        this.minimumTemperature = value;
    }

    /**
     * Gets the value of the maximumTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TemperatureType }
     *     
     */
    public TemperatureType getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Sets the value of the maximumTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperatureType }
     *     
     */
    public void setMaximumTemperature(TemperatureType value) {
        this.maximumTemperature = value;
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
     * Gets the value of the floorSpaceMeasurementDimension property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getFloorSpaceMeasurementDimension() {
        return floorSpaceMeasurementDimension;
    }

    /**
     * Sets the value of the floorSpaceMeasurementDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setFloorSpaceMeasurementDimension(DimensionType value) {
        this.floorSpaceMeasurementDimension = value;
    }

    /**
     * Gets the value of the palletSpaceMeasurementDimension property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionType }
     *     
     */
    public DimensionType getPalletSpaceMeasurementDimension() {
        return palletSpaceMeasurementDimension;
    }

    /**
     * Sets the value of the palletSpaceMeasurementDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionType }
     *     
     */
    public void setPalletSpaceMeasurementDimension(DimensionType value) {
        this.palletSpaceMeasurementDimension = value;
    }

    /**
     * Gets the value of the shipmentDocumentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDocumentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getShipmentDocumentReferences() {
        if (shipmentDocumentReferences == null) {
            shipmentDocumentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.shipmentDocumentReferences;
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

    /**
     * Gets the value of the customsDeclarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsDeclarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsDeclarationType }
     * 
     * 
     */
    public List<CustomsDeclarationType> getCustomsDeclarations() {
        if (customsDeclarations == null) {
            customsDeclarations = new ArrayList<CustomsDeclarationType>();
        }
        return this.customsDeclarations;
    }

    /**
     * Gets the value of the referencedShipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedShipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getReferencedShipments() {
        if (referencedShipments == null) {
            referencedShipments = new ArrayList<ShipmentType>();
        }
        return this.referencedShipments;
    }

    /**
     * Gets the value of the packages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackages() {
        if (packages == null) {
            packages = new ArrayList<PackageType>();
        }
        return this.packages;
    }

    /**
     * Gets the value of the damageDocumentationAttachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the damageDocumentationAttachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDamageDocumentationAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getDamageDocumentationAttachments() {
        if (damageDocumentationAttachments == null) {
            damageDocumentationAttachments = new ArrayList<AttachmentType>();
        }
        return this.damageDocumentationAttachments;
    }

}
