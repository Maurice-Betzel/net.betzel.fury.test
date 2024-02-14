
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EconomicOperatorPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EconomicOperatorPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}QualifyingParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EconomicOperatorRole" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Party"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicOperatorPartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "qualifyingParties",
    "economicOperatorRole",
    "party"
})
@XmlRootElement(name = "EconomicOperatorParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class EconomicOperatorParty
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "QualifyingParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<QualifyingPartyType> qualifyingParties;
    @XmlElement(name = "EconomicOperatorRole", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected EconomicOperatorRole economicOperatorRole;
    @XmlElement(name = "Party", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected PartyType party;

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
     * Gets the value of the qualifyingParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifyingParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifyingParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifyingPartyType }
     * 
     * 
     */
    public List<QualifyingPartyType> getQualifyingParties() {
        if (qualifyingParties == null) {
            qualifyingParties = new ArrayList<QualifyingPartyType>();
        }
        return this.qualifyingParties;
    }

    /**
     * Gets the value of the economicOperatorRole property.
     * 
     * @return
     *     possible object is
     *     {@link EconomicOperatorRole }
     *     
     */
    public EconomicOperatorRole getEconomicOperatorRole() {
        return economicOperatorRole;
    }

    /**
     * Sets the value of the economicOperatorRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EconomicOperatorRole }
     *     
     */
    public void setEconomicOperatorRole(EconomicOperatorRole value) {
        this.economicOperatorRole = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
    }

}
