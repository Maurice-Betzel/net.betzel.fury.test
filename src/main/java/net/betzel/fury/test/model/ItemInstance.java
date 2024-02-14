
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
 * <p>Java class for ItemInstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemInstanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ProductTraceID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ManufactureDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ManufactureTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BestBeforeDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SerialID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LotIdentification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemInstanceType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "productTraceID",
    "manufactureDate",
    "manufactureTime",
    "bestBeforeDate",
    "registrationID",
    "serialID",
    "additionalItemProperties",
    "lotIdentification"
})
@XmlRootElement(name = "ItemInstance", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ItemInstance
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ProductTraceID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ProductTraceID productTraceID;
    @XmlElement(name = "ManufactureDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ManufactureDate manufactureDate;
    @XmlElement(name = "ManufactureTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ManufactureTime manufactureTime;
    @XmlElement(name = "BestBeforeDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BestBeforeDate bestBeforeDate;
    @XmlElement(name = "RegistrationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RegistrationID registrationID;
    @XmlElement(name = "SerialID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected SerialID serialID;
    @XmlElement(name = "AdditionalItemProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ItemPropertyType> additionalItemProperties;
    @XmlElement(name = "LotIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected LotIdentification lotIdentification;

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
     * Gets the value of the productTraceID property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTraceID }
     *     
     */
    public ProductTraceID getProductTraceID() {
        return productTraceID;
    }

    /**
     * Sets the value of the productTraceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTraceID }
     *     
     */
    public void setProductTraceID(ProductTraceID value) {
        this.productTraceID = value;
    }

    /**
     * Gets the value of the manufactureDate property.
     * 
     * @return
     *     possible object is
     *     {@link ManufactureDate }
     *     
     */
    public ManufactureDate getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufactureDate }
     *     
     */
    public void setManufactureDate(ManufactureDate value) {
        this.manufactureDate = value;
    }

    /**
     * Gets the value of the manufactureTime property.
     * 
     * @return
     *     possible object is
     *     {@link ManufactureTime }
     *     
     */
    public ManufactureTime getManufactureTime() {
        return manufactureTime;
    }

    /**
     * Sets the value of the manufactureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufactureTime }
     *     
     */
    public void setManufactureTime(ManufactureTime value) {
        this.manufactureTime = value;
    }

    /**
     * Gets the value of the bestBeforeDate property.
     * 
     * @return
     *     possible object is
     *     {@link BestBeforeDate }
     *     
     */
    public BestBeforeDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    /**
     * Sets the value of the bestBeforeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestBeforeDate }
     *     
     */
    public void setBestBeforeDate(BestBeforeDate value) {
        this.bestBeforeDate = value;
    }

    /**
     * Gets the value of the registrationID property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationID }
     *     
     */
    public RegistrationID getRegistrationID() {
        return registrationID;
    }

    /**
     * Sets the value of the registrationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationID }
     *     
     */
    public void setRegistrationID(RegistrationID value) {
        this.registrationID = value;
    }

    /**
     * Gets the value of the serialID property.
     * 
     * @return
     *     possible object is
     *     {@link SerialID }
     *     
     */
    public SerialID getSerialID() {
        return serialID;
    }

    /**
     * Sets the value of the serialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerialID }
     *     
     */
    public void setSerialID(SerialID value) {
        this.serialID = value;
    }

    /**
     * Gets the value of the additionalItemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     * 
     * 
     */
    public List<ItemPropertyType> getAdditionalItemProperties() {
        if (additionalItemProperties == null) {
            additionalItemProperties = new ArrayList<ItemPropertyType>();
        }
        return this.additionalItemProperties;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
    }

}
