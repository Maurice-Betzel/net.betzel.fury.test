
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
 * <p>Java class for ReceiptLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiptLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}UUID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Note" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShortQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ShortageActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RejectActionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}QuantityDiscrepancyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OversupplyQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimingComplaintCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimingComplaint" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OrderLineReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DespatchLineReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Shipment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptLineType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "uuid",
    "notes",
    "receivedQuantity",
    "shortQuantity",
    "shortageActionCode",
    "rejectedQuantity",
    "rejectReasonCode",
    "rejectReasons",
    "rejectActionCode",
    "quantityDiscrepancyCode",
    "oversupplyQuantity",
    "receivedDate",
    "receivedTime",
    "timingComplaintCode",
    "timingComplaint",
    "orderLineReference",
    "despatchLineReferences",
    "documentReferences",
    "items",
    "shipments"
})
public class ReceiptLineType
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
    @XmlElement(name = "ReceivedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReceivedQuantity receivedQuantity;
    @XmlElement(name = "ShortQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ShortQuantity shortQuantity;
    @XmlElement(name = "ShortageActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ShortageActionCode shortageActionCode;
    @XmlElement(name = "RejectedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RejectedQuantity rejectedQuantity;
    @XmlElement(name = "RejectReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RejectReasonCode rejectReasonCode;
    @XmlElement(name = "RejectReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<RejectReason> rejectReasons;
    @XmlElement(name = "RejectActionCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RejectActionCode rejectActionCode;
    @XmlElement(name = "QuantityDiscrepancyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected QuantityDiscrepancyCode quantityDiscrepancyCode;
    @XmlElement(name = "OversupplyQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OversupplyQuantity oversupplyQuantity;
    @XmlElement(name = "ReceivedDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReceivedDate receivedDate;
    @XmlElement(name = "ReceivedTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReceivedTime receivedTime;
    @XmlElement(name = "TimingComplaintCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TimingComplaintCode timingComplaintCode;
    @XmlElement(name = "TimingComplaint", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TimingComplaint timingComplaint;
    @XmlElement(name = "OrderLineReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected OrderLineReference orderLineReference;
    @XmlElement(name = "DespatchLineReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LineReferenceType> despatchLineReferences;
    @XmlElement(name = "DocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<DocumentReferenceType> documentReferences;
    @XmlElement(name = "Item", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ItemType> items;
    @XmlElement(name = "Shipment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ShipmentType> shipments;

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
     * Gets the value of the receivedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedQuantity }
     *     
     */
    public ReceivedQuantity getReceivedQuantity() {
        return receivedQuantity;
    }

    /**
     * Sets the value of the receivedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedQuantity }
     *     
     */
    public void setReceivedQuantity(ReceivedQuantity value) {
        this.receivedQuantity = value;
    }

    /**
     * Gets the value of the shortQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ShortQuantity }
     *     
     */
    public ShortQuantity getShortQuantity() {
        return shortQuantity;
    }

    /**
     * Sets the value of the shortQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortQuantity }
     *     
     */
    public void setShortQuantity(ShortQuantity value) {
        this.shortQuantity = value;
    }

    /**
     * Gets the value of the shortageActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShortageActionCode }
     *     
     */
    public ShortageActionCode getShortageActionCode() {
        return shortageActionCode;
    }

    /**
     * Sets the value of the shortageActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortageActionCode }
     *     
     */
    public void setShortageActionCode(ShortageActionCode value) {
        this.shortageActionCode = value;
    }

    /**
     * Gets the value of the rejectedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link RejectedQuantity }
     *     
     */
    public RejectedQuantity getRejectedQuantity() {
        return rejectedQuantity;
    }

    /**
     * Sets the value of the rejectedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedQuantity }
     *     
     */
    public void setRejectedQuantity(RejectedQuantity value) {
        this.rejectedQuantity = value;
    }

    /**
     * Gets the value of the rejectReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link RejectReasonCode }
     *     
     */
    public RejectReasonCode getRejectReasonCode() {
        return rejectReasonCode;
    }

    /**
     * Sets the value of the rejectReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectReasonCode }
     *     
     */
    public void setRejectReasonCode(RejectReasonCode value) {
        this.rejectReasonCode = value;
    }

    /**
     * Gets the value of the rejectReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectReason }
     * 
     * 
     */
    public List<RejectReason> getRejectReasons() {
        if (rejectReasons == null) {
            rejectReasons = new ArrayList<RejectReason>();
        }
        return this.rejectReasons;
    }

    /**
     * Gets the value of the rejectActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link RejectActionCode }
     *     
     */
    public RejectActionCode getRejectActionCode() {
        return rejectActionCode;
    }

    /**
     * Sets the value of the rejectActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectActionCode }
     *     
     */
    public void setRejectActionCode(RejectActionCode value) {
        this.rejectActionCode = value;
    }

    /**
     * Gets the value of the quantityDiscrepancyCode property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDiscrepancyCode }
     *     
     */
    public QuantityDiscrepancyCode getQuantityDiscrepancyCode() {
        return quantityDiscrepancyCode;
    }

    /**
     * Sets the value of the quantityDiscrepancyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDiscrepancyCode }
     *     
     */
    public void setQuantityDiscrepancyCode(QuantityDiscrepancyCode value) {
        this.quantityDiscrepancyCode = value;
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
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedDate }
     *     
     */
    public ReceivedDate getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedDate }
     *     
     */
    public void setReceivedDate(ReceivedDate value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the receivedTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedTime }
     *     
     */
    public ReceivedTime getReceivedTime() {
        return receivedTime;
    }

    /**
     * Sets the value of the receivedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedTime }
     *     
     */
    public void setReceivedTime(ReceivedTime value) {
        this.receivedTime = value;
    }

    /**
     * Gets the value of the timingComplaintCode property.
     * 
     * @return
     *     possible object is
     *     {@link TimingComplaintCode }
     *     
     */
    public TimingComplaintCode getTimingComplaintCode() {
        return timingComplaintCode;
    }

    /**
     * Sets the value of the timingComplaintCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingComplaintCode }
     *     
     */
    public void setTimingComplaintCode(TimingComplaintCode value) {
        this.timingComplaintCode = value;
    }

    /**
     * Gets the value of the timingComplaint property.
     * 
     * @return
     *     possible object is
     *     {@link TimingComplaint }
     *     
     */
    public TimingComplaint getTimingComplaint() {
        return timingComplaint;
    }

    /**
     * Sets the value of the timingComplaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimingComplaint }
     *     
     */
    public void setTimingComplaint(TimingComplaint value) {
        this.timingComplaint = value;
    }

    /**
     * Gets the value of the orderLineReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineReference }
     *     
     */
    public OrderLineReference getOrderLineReference() {
        return orderLineReference;
    }

    /**
     * Sets the value of the orderLineReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineReference }
     *     
     */
    public void setOrderLineReference(OrderLineReference value) {
        this.orderLineReference = value;
    }

    /**
     * Gets the value of the despatchLineReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despatchLineReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespatchLineReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineReferenceType }
     * 
     * 
     */
    public List<LineReferenceType> getDespatchLineReferences() {
        if (despatchLineReferences == null) {
            despatchLineReferences = new ArrayList<LineReferenceType>();
        }
        return this.despatchLineReferences;
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
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getItems() {
        if (items == null) {
            items = new ArrayList<ItemType>();
        }
        return this.items;
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

}
