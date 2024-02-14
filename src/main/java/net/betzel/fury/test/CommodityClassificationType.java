
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CargoTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ItemClassificationCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityClassificationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "natureCode",
    "cargoTypeCode",
    "commodityCode",
    "itemClassificationCode"
})
public class CommodityClassificationType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "NatureCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected NatureCode natureCode;
    @XmlElement(name = "CargoTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CargoTypeCode cargoTypeCode;
    @XmlElement(name = "CommodityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CommodityCode commodityCode;
    @XmlElement(name = "ItemClassificationCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ItemClassificationCode itemClassificationCode;

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
     * Gets the value of the natureCode property.
     * 
     * @return
     *     possible object is
     *     {@link NatureCode }
     *     
     */
    public NatureCode getNatureCode() {
        return natureCode;
    }

    /**
     * Sets the value of the natureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NatureCode }
     *     
     */
    public void setNatureCode(NatureCode value) {
        this.natureCode = value;
    }

    /**
     * Gets the value of the cargoTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CargoTypeCode }
     *     
     */
    public CargoTypeCode getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * Sets the value of the cargoTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoTypeCode }
     *     
     */
    public void setCargoTypeCode(CargoTypeCode value) {
        this.cargoTypeCode = value;
    }

    /**
     * Gets the value of the commodityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityCode }
     *     
     */
    public CommodityCode getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityCode }
     *     
     */
    public void setCommodityCode(CommodityCode value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the itemClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link ItemClassificationCode }
     *     
     */
    public ItemClassificationCode getItemClassificationCode() {
        return itemClassificationCode;
    }

    /**
     * Sets the value of the itemClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemClassificationCode }
     *     
     */
    public void setItemClassificationCode(ItemClassificationCode value) {
        this.itemClassificationCode = value;
    }

}
