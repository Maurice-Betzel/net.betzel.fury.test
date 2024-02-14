
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
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShippingPriorityLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HandlingInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Information" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetNetWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GrossVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NetVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalGoodsItemQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalTransportHandlingUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InsuranceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredCustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredForCarriageValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeclaredStatisticsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}FreeOnBoardValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveryInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SplitConsignmentIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ConsignmentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Consignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}GoodsItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ShipmentStage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Delivery" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransportHandlingUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ReturnAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FirstArrivalPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LastExitPortLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExportCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}FreightAllowanceCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "shippingPriorityLevelCode",
    "handlingCode",
    "handlingInstructions",
    "informations",
    "grossWeightMeasure",
    "netWeightMeasure",
    "netNetWeightMeasure",
    "grossVolumeMeasure",
    "netVolumeMeasure",
    "totalGoodsItemQuantity",
    "totalTransportHandlingUnitQuantity",
    "insuranceValueAmount",
    "declaredCustomsValueAmount",
    "declaredForCarriageValueAmount",
    "declaredStatisticsValueAmount",
    "freeOnBoardValueAmount",
    "specialInstructions",
    "deliveryInstructions",
    "splitConsignmentIndicator",
    "consignmentQuantity",
    "consignments",
    "goodsItems",
    "shipmentStages",
    "delivery",
    "transportHandlingUnits",
    "returnAddress",
    "originAddress",
    "firstArrivalPortLocation",
    "lastExitPortLocation",
    "exportCountry",
    "freightAllowanceCharges"
})
public class ShipmentType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "ShippingPriorityLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ShippingPriorityLevelCode shippingPriorityLevelCode;
    @XmlElement(name = "HandlingCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HandlingCode handlingCode;
    @XmlElement(name = "HandlingInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<HandlingInstructions> handlingInstructions;
    @XmlElement(name = "Information", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Information> informations;
    @XmlElement(name = "GrossWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GrossWeightMeasure grossWeightMeasure;
    @XmlElement(name = "NetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetWeightMeasure netWeightMeasure;
    @XmlElement(name = "NetNetWeightMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetNetWeightMeasure netNetWeightMeasure;
    @XmlElement(name = "GrossVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected GrossVolumeMeasure grossVolumeMeasure;
    @XmlElement(name = "NetVolumeMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NetVolumeMeasure netVolumeMeasure;
    @XmlElement(name = "TotalGoodsItemQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalGoodsItemQuantity totalGoodsItemQuantity;
    @XmlElement(name = "TotalTransportHandlingUnitQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalTransportHandlingUnitQuantity totalTransportHandlingUnitQuantity;
    @XmlElement(name = "InsuranceValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected InsuranceValueAmount insuranceValueAmount;
    @XmlElement(name = "DeclaredCustomsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DeclaredCustomsValueAmount declaredCustomsValueAmount;
    @XmlElement(name = "DeclaredForCarriageValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DeclaredForCarriageValueAmount declaredForCarriageValueAmount;
    @XmlElement(name = "DeclaredStatisticsValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DeclaredStatisticsValueAmount declaredStatisticsValueAmount;
    @XmlElement(name = "FreeOnBoardValueAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected FreeOnBoardValueAmount freeOnBoardValueAmount;
    @XmlElement(name = "SpecialInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<SpecialInstructions> specialInstructions;
    @XmlElement(name = "DeliveryInstructions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<DeliveryInstructions> deliveryInstructions;
    @XmlElement(name = "SplitConsignmentIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SplitConsignmentIndicator splitConsignmentIndicator;
    @XmlElement(name = "ConsignmentQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ConsignmentQuantity consignmentQuantity;
    @XmlElement(name = "Consignment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ConsignmentType> consignments;
    @XmlElement(name = "GoodsItem", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<GoodsItemType> goodsItems;
    @XmlElement(name = "ShipmentStage", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentStageType> shipmentStages;
    @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected DeliveryType delivery;
    @XmlElement(name = "TransportHandlingUnit", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TransportHandlingUnitType> transportHandlingUnits;
    @XmlElement(name = "ReturnAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AddressType returnAddress;
    @XmlElement(name = "OriginAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AddressType originAddress;
    @XmlElement(name = "FirstArrivalPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType firstArrivalPortLocation;
    @XmlElement(name = "LastExitPortLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LocationType lastExitPortLocation;
    @XmlElement(name = "ExportCountry", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected CountryType exportCountry;
    @XmlElement(name = "FreightAllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<AllowanceChargeType> freightAllowanceCharges;

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
     * Gets the value of the shippingPriorityLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingPriorityLevelCode }
     *     
     */
    public ShippingPriorityLevelCode getShippingPriorityLevelCode() {
        return shippingPriorityLevelCode;
    }

    /**
     * Sets the value of the shippingPriorityLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingPriorityLevelCode }
     *     
     */
    public void setShippingPriorityLevelCode(ShippingPriorityLevelCode value) {
        this.shippingPriorityLevelCode = value;
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
     * Gets the value of the informations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Information }
     * 
     * 
     */
    public List<Information> getInformations() {
        if (informations == null) {
            informations = new ArrayList<Information>();
        }
        return this.informations;
    }

    /**
     * Gets the value of the grossWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GrossWeightMeasure }
     *     
     */
    public GrossWeightMeasure getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Sets the value of the grossWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossWeightMeasure }
     *     
     */
    public void setGrossWeightMeasure(GrossWeightMeasure value) {
        this.grossWeightMeasure = value;
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
     * Gets the value of the netNetWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link NetNetWeightMeasure }
     *     
     */
    public NetNetWeightMeasure getNetNetWeightMeasure() {
        return netNetWeightMeasure;
    }

    /**
     * Sets the value of the netNetWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetNetWeightMeasure }
     *     
     */
    public void setNetNetWeightMeasure(NetNetWeightMeasure value) {
        this.netNetWeightMeasure = value;
    }

    /**
     * Gets the value of the grossVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link GrossVolumeMeasure }
     *     
     */
    public GrossVolumeMeasure getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Sets the value of the grossVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossVolumeMeasure }
     *     
     */
    public void setGrossVolumeMeasure(GrossVolumeMeasure value) {
        this.grossVolumeMeasure = value;
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
     * Gets the value of the totalTransportHandlingUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransportHandlingUnitQuantity }
     *     
     */
    public TotalTransportHandlingUnitQuantity getTotalTransportHandlingUnitQuantity() {
        return totalTransportHandlingUnitQuantity;
    }

    /**
     * Sets the value of the totalTransportHandlingUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransportHandlingUnitQuantity }
     *     
     */
    public void setTotalTransportHandlingUnitQuantity(TotalTransportHandlingUnitQuantity value) {
        this.totalTransportHandlingUnitQuantity = value;
    }

    /**
     * Gets the value of the insuranceValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceValueAmount }
     *     
     */
    public InsuranceValueAmount getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Sets the value of the insuranceValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceValueAmount }
     *     
     */
    public void setInsuranceValueAmount(InsuranceValueAmount value) {
        this.insuranceValueAmount = value;
    }

    /**
     * Gets the value of the declaredCustomsValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredCustomsValueAmount }
     *     
     */
    public DeclaredCustomsValueAmount getDeclaredCustomsValueAmount() {
        return declaredCustomsValueAmount;
    }

    /**
     * Sets the value of the declaredCustomsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredCustomsValueAmount }
     *     
     */
    public void setDeclaredCustomsValueAmount(DeclaredCustomsValueAmount value) {
        this.declaredCustomsValueAmount = value;
    }

    /**
     * Gets the value of the declaredForCarriageValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredForCarriageValueAmount }
     *     
     */
    public DeclaredForCarriageValueAmount getDeclaredForCarriageValueAmount() {
        return declaredForCarriageValueAmount;
    }

    /**
     * Sets the value of the declaredForCarriageValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredForCarriageValueAmount }
     *     
     */
    public void setDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmount value) {
        this.declaredForCarriageValueAmount = value;
    }

    /**
     * Gets the value of the declaredStatisticsValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DeclaredStatisticsValueAmount }
     *     
     */
    public DeclaredStatisticsValueAmount getDeclaredStatisticsValueAmount() {
        return declaredStatisticsValueAmount;
    }

    /**
     * Sets the value of the declaredStatisticsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclaredStatisticsValueAmount }
     *     
     */
    public void setDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmount value) {
        this.declaredStatisticsValueAmount = value;
    }

    /**
     * Gets the value of the freeOnBoardValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoardValueAmount }
     *     
     */
    public FreeOnBoardValueAmount getFreeOnBoardValueAmount() {
        return freeOnBoardValueAmount;
    }

    /**
     * Sets the value of the freeOnBoardValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoardValueAmount }
     *     
     */
    public void setFreeOnBoardValueAmount(FreeOnBoardValueAmount value) {
        this.freeOnBoardValueAmount = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInstructions }
     * 
     * 
     */
    public List<SpecialInstructions> getSpecialInstructions() {
        if (specialInstructions == null) {
            specialInstructions = new ArrayList<SpecialInstructions>();
        }
        return this.specialInstructions;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInstructions }
     * 
     * 
     */
    public List<DeliveryInstructions> getDeliveryInstructions() {
        if (deliveryInstructions == null) {
            deliveryInstructions = new ArrayList<DeliveryInstructions>();
        }
        return this.deliveryInstructions;
    }

    /**
     * Gets the value of the splitConsignmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SplitConsignmentIndicator }
     *     
     */
    public SplitConsignmentIndicator getSplitConsignmentIndicator() {
        return splitConsignmentIndicator;
    }

    /**
     * Sets the value of the splitConsignmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitConsignmentIndicator }
     *     
     */
    public void setSplitConsignmentIndicator(SplitConsignmentIndicator value) {
        this.splitConsignmentIndicator = value;
    }

    /**
     * Gets the value of the consignmentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ConsignmentQuantity }
     *     
     */
    public ConsignmentQuantity getConsignmentQuantity() {
        return consignmentQuantity;
    }

    /**
     * Sets the value of the consignmentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsignmentQuantity }
     *     
     */
    public void setConsignmentQuantity(ConsignmentQuantity value) {
        this.consignmentQuantity = value;
    }

    /**
     * Gets the value of the consignments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consignments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsignmentType }
     * 
     * 
     */
    public List<ConsignmentType> getConsignments() {
        if (consignments == null) {
            consignments = new ArrayList<ConsignmentType>();
        }
        return this.consignments;
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
     * Gets the value of the shipmentStages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStageType }
     * 
     * 
     */
    public List<ShipmentStageType> getShipmentStages() {
        if (shipmentStages == null) {
            shipmentStages = new ArrayList<ShipmentStageType>();
        }
        return this.shipmentStages;
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
     * Gets the value of the transportHandlingUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportHandlingUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportHandlingUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportHandlingUnitType }
     * 
     * 
     */
    public List<TransportHandlingUnitType> getTransportHandlingUnits() {
        if (transportHandlingUnits == null) {
            transportHandlingUnits = new ArrayList<TransportHandlingUnitType>();
        }
        return this.transportHandlingUnits;
    }

    /**
     * Gets the value of the returnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getReturnAddress() {
        return returnAddress;
    }

    /**
     * Sets the value of the returnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setReturnAddress(AddressType value) {
        this.returnAddress = value;
    }

    /**
     * Gets the value of the originAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getOriginAddress() {
        return originAddress;
    }

    /**
     * Sets the value of the originAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setOriginAddress(AddressType value) {
        this.originAddress = value;
    }

    /**
     * Gets the value of the firstArrivalPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getFirstArrivalPortLocation() {
        return firstArrivalPortLocation;
    }

    /**
     * Sets the value of the firstArrivalPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setFirstArrivalPortLocation(LocationType value) {
        this.firstArrivalPortLocation = value;
    }

    /**
     * Gets the value of the lastExitPortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLastExitPortLocation() {
        return lastExitPortLocation;
    }

    /**
     * Sets the value of the lastExitPortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLastExitPortLocation(LocationType value) {
        this.lastExitPortLocation = value;
    }

    /**
     * Gets the value of the exportCountry property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getExportCountry() {
        return exportCountry;
    }

    /**
     * Sets the value of the exportCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setExportCountry(CountryType value) {
        this.exportCountry = value;
    }

    /**
     * Gets the value of the freightAllowanceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freightAllowanceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreightAllowanceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowanceChargeType }
     * 
     * 
     */
    public List<AllowanceChargeType> getFreightAllowanceCharges() {
        if (freightAllowanceCharges == null) {
            freightAllowanceCharges = new ArrayList<AllowanceChargeType>();
        }
        return this.freightAllowanceCharges;
    }

}
