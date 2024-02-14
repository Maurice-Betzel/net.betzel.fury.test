
package net.betzel.fury.test;

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
 * <p>Java class for EconomicOperatorShortListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EconomicOperatorShortListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LimitationDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExpectedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MinimumQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}PreSelectedParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicOperatorShortListType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "limitationDescriptions",
    "expectedQuantity",
    "maximumQuantity",
    "minimumQuantity",
    "preSelectedParties"
})
@XmlRootElement(name = "EconomicOperatorShortList", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class EconomicOperatorShortList
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "LimitationDescription", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<LimitationDescription> limitationDescriptions;
    @XmlElement(name = "ExpectedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExpectedQuantity expectedQuantity;
    @XmlElement(name = "MaximumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumQuantity maximumQuantity;
    @XmlElement(name = "MinimumQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MinimumQuantity minimumQuantity;
    @XmlElement(name = "PreSelectedParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<PartyType> preSelectedParties;

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
     * Gets the value of the limitationDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitationDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitationDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitationDescription }
     * 
     * 
     */
    public List<LimitationDescription> getLimitationDescriptions() {
        if (limitationDescriptions == null) {
            limitationDescriptions = new ArrayList<LimitationDescription>();
        }
        return this.limitationDescriptions;
    }

    /**
     * Gets the value of the expectedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedQuantity }
     *     
     */
    public ExpectedQuantity getExpectedQuantity() {
        return expectedQuantity;
    }

    /**
     * Sets the value of the expectedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedQuantity }
     *     
     */
    public void setExpectedQuantity(ExpectedQuantity value) {
        this.expectedQuantity = value;
    }

    /**
     * Gets the value of the maximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumQuantity }
     *     
     */
    public MaximumQuantity getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Sets the value of the maximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumQuantity }
     *     
     */
    public void setMaximumQuantity(MaximumQuantity value) {
        this.maximumQuantity = value;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumQuantity }
     *     
     */
    public MinimumQuantity getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Sets the value of the minimumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumQuantity }
     *     
     */
    public void setMinimumQuantity(MinimumQuantity value) {
        this.minimumQuantity = value;
    }

    /**
     * Gets the value of the preSelectedParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preSelectedParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreSelectedParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getPreSelectedParties() {
        if (preSelectedParties == null) {
            preSelectedParties = new ArrayList<PartyType>();
        }
        return this.preSelectedParties;
    }

}
