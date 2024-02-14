
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DespatchLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DespatchLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LineStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DeliveredQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BackorderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BackorderReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OutstandingQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OutstandingReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OversupplyQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCostCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AccountingCost" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderLineReference" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Shipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubDespatchLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DespatchLineType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "uuid",
    "notes",
    "lineStatusCode",
    "deliveredQuantity",
    "backorderQuantity",
    "backorderReasons",
    "outstandingQuantity",
    "outstandingReasons",
    "oversupplyQuantity",
    "accountingCostCode",
    "accountingCost",
    "orderLineReferences",
    "documentReferences",
    "item",
    "shipments",
    "subDespatchLines"
})
public class DespatchLineType
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
    @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected UUID uuid;
    @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Note> notes;
    @XmlElement(name = "LineStatusCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LineStatusCode lineStatusCode;
    @XmlElement(name = "DeliveredQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected DeliveredQuantity deliveredQuantity;
    @XmlElement(name = "BackorderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BackorderQuantity backorderQuantity;
    @XmlElement(name = "BackorderReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<BackorderReason> backorderReasons;
    @XmlElement(name = "OutstandingQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OutstandingQuantity outstandingQuantity;
    @XmlElement(name = "OutstandingReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<OutstandingReason> outstandingReasons;
    @XmlElement(name = "OversupplyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OversupplyQuantity oversupplyQuantity;
    @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCostCode accountingCostCode;
    @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AccountingCost accountingCost;
    @XmlElement(name = "OrderLineReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<OrderLineReference> orderLineReferences;
    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "Item", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected ItemType item;
    @XmlElement(name = "Shipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentType> shipments;
    @XmlElement(name = "SubDespatchLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DespatchLineType> subDespatchLines;

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
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the lineStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link LineStatusCode }
     *     
     */
    public LineStatusCode getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Sets the value of the lineStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStatusCode }
     *     
     */
    public void setLineStatusCode(LineStatusCode value) {
        this.lineStatusCode = value;
    }

    /**
     * Gets the value of the deliveredQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveredQuantity }
     *     
     */
    public DeliveredQuantity getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Sets the value of the deliveredQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveredQuantity }
     *     
     */
    public void setDeliveredQuantity(DeliveredQuantity value) {
        this.deliveredQuantity = value;
    }

    /**
     * Gets the value of the backorderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BackorderQuantity }
     *     
     */
    public BackorderQuantity getBackorderQuantity() {
        return backorderQuantity;
    }

    /**
     * Sets the value of the backorderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackorderQuantity }
     *     
     */
    public void setBackorderQuantity(BackorderQuantity value) {
        this.backorderQuantity = value;
    }

    /**
     * Gets the value of the backorderReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backorderReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackorderReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BackorderReason }
     * 
     * 
     */
    public List<BackorderReason> getBackorderReasons() {
        if (backorderReasons == null) {
            backorderReasons = new ArrayList<BackorderReason>();
        }
        return this.backorderReasons;
    }

    /**
     * Gets the value of the outstandingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OutstandingQuantity }
     *     
     */
    public OutstandingQuantity getOutstandingQuantity() {
        return outstandingQuantity;
    }

    /**
     * Sets the value of the outstandingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutstandingQuantity }
     *     
     */
    public void setOutstandingQuantity(OutstandingQuantity value) {
        this.outstandingQuantity = value;
    }

    /**
     * Gets the value of the outstandingReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outstandingReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutstandingReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutstandingReason }
     * 
     * 
     */
    public List<OutstandingReason> getOutstandingReasons() {
        if (outstandingReasons == null) {
            outstandingReasons = new ArrayList<OutstandingReason>();
        }
        return this.outstandingReasons;
    }

    /**
     * Gets the value of the oversupplyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OversupplyQuantity }
     *     
     */
    public OversupplyQuantity getOversupplyQuantity() {
        return oversupplyQuantity;
    }

    /**
     * Sets the value of the oversupplyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OversupplyQuantity }
     *     
     */
    public void setOversupplyQuantity(OversupplyQuantity value) {
        this.oversupplyQuantity = value;
    }

    /**
     * Gets the value of the accountingCostCode property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingCostCode }
     *     
     */
    public AccountingCostCode getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * Sets the value of the accountingCostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCostCode }
     *     
     */
    public void setAccountingCostCode(AccountingCostCode value) {
        this.accountingCostCode = value;
    }

    /**
     * Gets the value of the accountingCost property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingCost }
     *     
     */
    public AccountingCost getAccountingCost() {
        return accountingCost;
    }

    /**
     * Sets the value of the accountingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingCost }
     *     
     */
    public void setAccountingCost(AccountingCost value) {
        this.accountingCost = value;
    }

    /**
     * Gets the value of the orderLineReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLineReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLineReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLineReference }
     * 
     * 
     */
    public List<OrderLineReference> getOrderLineReferences() {
        if (orderLineReferences == null) {
            orderLineReferences = new ArrayList<OrderLineReference>();
        }
        return this.orderLineReferences;
    }

    /**
     * Gets the value of the documentReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReferences() {
        if (documentReferences == null) {
            documentReferences = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReferences;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * Gets the value of the shipments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentType }
     * 
     * 
     */
    public List<ShipmentType> getShipments() {
        if (shipments == null) {
            shipments = new ArrayList<ShipmentType>();
        }
        return this.shipments;
    }

    /**
     * Gets the value of the subDespatchLines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDespatchLines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDespatchLines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DespatchLineType }
     * 
     * 
     */
    public List<DespatchLineType> getSubDespatchLines() {
        if (subDespatchLines == null) {
            subDespatchLines = new ArrayList<DespatchLineType>();
        }
        return this.subDespatchLines;
    }

}
