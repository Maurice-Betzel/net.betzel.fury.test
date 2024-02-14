
package net.betzel.fury.test.model;

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
 * <p>Java class for ContractingPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractingPartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuyerProfileURI" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingPartyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingActivity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractingRepresentationType" minOccurs="0"/&gt;
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
@XmlType(name = "ContractingPartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "buyerProfileURI",
    "contractingPartyTypes",
    "contractingActivities",
    "contractingRepresentationType",
    "party"
})
@XmlRootElement(name = "ContractingParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ContractingParty
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "BuyerProfileURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected BuyerProfileURI buyerProfileURI;
    @XmlElement(name = "ContractingPartyType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ContractingPartyType> contractingPartyTypes;
    @XmlElement(name = "ContractingActivity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ContractingActivity> contractingActivities;
    @XmlElement(name = "ContractingRepresentationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContractingRepresentationType contractingRepresentationType;
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
     * Gets the value of the buyerProfileURI property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerProfileURI }
     *     
     */
    public BuyerProfileURI getBuyerProfileURI() {
        return buyerProfileURI;
    }

    /**
     * Sets the value of the buyerProfileURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerProfileURI }
     *     
     */
    public void setBuyerProfileURI(BuyerProfileURI value) {
        this.buyerProfileURI = value;
    }

    /**
     * Gets the value of the contractingPartyTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingPartyTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingPartyTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingPartyType }
     * 
     * 
     */
    public List<ContractingPartyType> getContractingPartyTypes() {
        if (contractingPartyTypes == null) {
            contractingPartyTypes = new ArrayList<ContractingPartyType>();
        }
        return this.contractingPartyTypes;
    }

    /**
     * Gets the value of the contractingActivities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractingActivities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractingActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractingActivity }
     * 
     * 
     */
    public List<ContractingActivity> getContractingActivities() {
        if (contractingActivities == null) {
            contractingActivities = new ArrayList<ContractingActivity>();
        }
        return this.contractingActivities;
    }

    /**
     * Gets the value of the contractingRepresentationType property.
     * 
     * @return
     *     possible object is
     *     {@link ContractingRepresentationType }
     *     
     */
    public ContractingRepresentationType getContractingRepresentationType() {
        return contractingRepresentationType;
    }

    /**
     * Sets the value of the contractingRepresentationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractingRepresentationType }
     *     
     */
    public void setContractingRepresentationType(ContractingRepresentationType value) {
        this.contractingRepresentationType = value;
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
