
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
 * <p>Java class for LotDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumLotsAwardedNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MaximumLotsSubmittedNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}GroupingLots" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LotsGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LotDistributionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "maximumLotsAwardedNumeric",
    "maximumLotsSubmittedNumeric",
    "groupingLots",
    "lotsGroups"
})
@XmlRootElement(name = "LotDistribution", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class LotDistribution
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "MaximumLotsAwardedNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumLotsAwardedNumeric maximumLotsAwardedNumeric;
    @XmlElement(name = "MaximumLotsSubmittedNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected MaximumLotsSubmittedNumeric maximumLotsSubmittedNumeric;
    @XmlElement(name = "GroupingLots", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<GroupingLots> groupingLots;
    @XmlElement(name = "LotsGroup", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<LotsGroup> lotsGroups;

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
     * Gets the value of the maximumLotsAwardedNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumLotsAwardedNumeric }
     *     
     */
    public MaximumLotsAwardedNumeric getMaximumLotsAwardedNumeric() {
        return maximumLotsAwardedNumeric;
    }

    /**
     * Sets the value of the maximumLotsAwardedNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumLotsAwardedNumeric }
     *     
     */
    public void setMaximumLotsAwardedNumeric(MaximumLotsAwardedNumeric value) {
        this.maximumLotsAwardedNumeric = value;
    }

    /**
     * Gets the value of the maximumLotsSubmittedNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link MaximumLotsSubmittedNumeric }
     *     
     */
    public MaximumLotsSubmittedNumeric getMaximumLotsSubmittedNumeric() {
        return maximumLotsSubmittedNumeric;
    }

    /**
     * Sets the value of the maximumLotsSubmittedNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaximumLotsSubmittedNumeric }
     *     
     */
    public void setMaximumLotsSubmittedNumeric(MaximumLotsSubmittedNumeric value) {
        this.maximumLotsSubmittedNumeric = value;
    }

    /**
     * Gets the value of the groupingLots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupingLots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupingLots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupingLots }
     * 
     * 
     */
    public List<GroupingLots> getGroupingLots() {
        if (groupingLots == null) {
            groupingLots = new ArrayList<GroupingLots>();
        }
        return this.groupingLots;
    }

    /**
     * Gets the value of the lotsGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotsGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotsGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotsGroup }
     * 
     * 
     */
    public List<LotsGroup> getLotsGroups() {
        if (lotsGroups == null) {
            lotsGroups = new ArrayList<LotsGroup>();
        }
        return this.lotsGroups;
    }

}
