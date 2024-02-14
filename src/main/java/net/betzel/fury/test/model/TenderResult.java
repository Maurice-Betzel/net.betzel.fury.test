
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
 * <p>Java class for TenderResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderResultCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdvertisementAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AwardTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LowerTenderAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HigherTenderAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedElectronicTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ReceivedForeignTenderQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Contract" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AwardedTenderedProject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ContractFormalizationPeriod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SubcontractTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}WinningParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderResultType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "awardID",
    "tenderResultCode",
    "descriptions",
    "advertisementAmount",
    "awardDate",
    "awardTime",
    "receivedTenderQuantity",
    "lowerTenderAmount",
    "higherTenderAmount",
    "startDate",
    "receivedElectronicTenderQuantity",
    "receivedForeignTenderQuantity",
    "contract",
    "awardedTenderedProject",
    "contractFormalizationPeriod",
    "subcontractTerms",
    "winningParties"
})
@XmlRootElement(name = "TenderResult", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TenderResult
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "AwardID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AwardID awardID;
    @XmlElement(name = "TenderResultCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TenderResultCode tenderResultCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "AdvertisementAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AdvertisementAmount advertisementAmount;
    @XmlElement(name = "AwardDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected AwardDate awardDate;
    @XmlElement(name = "AwardTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected AwardTime awardTime;
    @XmlElement(name = "ReceivedTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReceivedTenderQuantity receivedTenderQuantity;
    @XmlElement(name = "LowerTenderAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected LowerTenderAmount lowerTenderAmount;
    @XmlElement(name = "HigherTenderAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected HigherTenderAmount higherTenderAmount;
    @XmlElement(name = "StartDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected StartDate startDate;
    @XmlElement(name = "ReceivedElectronicTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReceivedElectronicTenderQuantity receivedElectronicTenderQuantity;
    @XmlElement(name = "ReceivedForeignTenderQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ReceivedForeignTenderQuantity receivedForeignTenderQuantity;
    @XmlElement(name = "Contract", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected ContractType contract;
    @XmlElement(name = "AwardedTenderedProject", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected TenderedProjectType awardedTenderedProject;
    @XmlElement(name = "ContractFormalizationPeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PeriodType contractFormalizationPeriod;
    @XmlElement(name = "SubcontractTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<SubcontractTermsType> subcontractTerms;
    @XmlElement(name = "WinningParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<WinningParty> winningParties;

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
     * Gets the value of the awardID property.
     * 
     * @return
     *     possible object is
     *     {@link AwardID }
     *     
     */
    public AwardID getAwardID() {
        return awardID;
    }

    /**
     * Sets the value of the awardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardID }
     *     
     */
    public void setAwardID(AwardID value) {
        this.awardID = value;
    }

    /**
     * Gets the value of the tenderResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link TenderResultCode }
     *     
     */
    public TenderResultCode getTenderResultCode() {
        return tenderResultCode;
    }

    /**
     * Sets the value of the tenderResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderResultCode }
     *     
     */
    public void setTenderResultCode(TenderResultCode value) {
        this.tenderResultCode = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the advertisementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisementAmount }
     *     
     */
    public AdvertisementAmount getAdvertisementAmount() {
        return advertisementAmount;
    }

    /**
     * Sets the value of the advertisementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisementAmount }
     *     
     */
    public void setAdvertisementAmount(AdvertisementAmount value) {
        this.advertisementAmount = value;
    }

    /**
     * Gets the value of the awardDate property.
     * 
     * @return
     *     possible object is
     *     {@link AwardDate }
     *     
     */
    public AwardDate getAwardDate() {
        return awardDate;
    }

    /**
     * Sets the value of the awardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardDate }
     *     
     */
    public void setAwardDate(AwardDate value) {
        this.awardDate = value;
    }

    /**
     * Gets the value of the awardTime property.
     * 
     * @return
     *     possible object is
     *     {@link AwardTime }
     *     
     */
    public AwardTime getAwardTime() {
        return awardTime;
    }

    /**
     * Sets the value of the awardTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardTime }
     *     
     */
    public void setAwardTime(AwardTime value) {
        this.awardTime = value;
    }

    /**
     * Gets the value of the receivedTenderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedTenderQuantity }
     *     
     */
    public ReceivedTenderQuantity getReceivedTenderQuantity() {
        return receivedTenderQuantity;
    }

    /**
     * Sets the value of the receivedTenderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedTenderQuantity }
     *     
     */
    public void setReceivedTenderQuantity(ReceivedTenderQuantity value) {
        this.receivedTenderQuantity = value;
    }

    /**
     * Gets the value of the lowerTenderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link LowerTenderAmount }
     *     
     */
    public LowerTenderAmount getLowerTenderAmount() {
        return lowerTenderAmount;
    }

    /**
     * Sets the value of the lowerTenderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowerTenderAmount }
     *     
     */
    public void setLowerTenderAmount(LowerTenderAmount value) {
        this.lowerTenderAmount = value;
    }

    /**
     * Gets the value of the higherTenderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link HigherTenderAmount }
     *     
     */
    public HigherTenderAmount getHigherTenderAmount() {
        return higherTenderAmount;
    }

    /**
     * Sets the value of the higherTenderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link HigherTenderAmount }
     *     
     */
    public void setHigherTenderAmount(HigherTenderAmount value) {
        this.higherTenderAmount = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link StartDate }
     *     
     */
    public StartDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDate }
     *     
     */
    public void setStartDate(StartDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the receivedElectronicTenderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedElectronicTenderQuantity }
     *     
     */
    public ReceivedElectronicTenderQuantity getReceivedElectronicTenderQuantity() {
        return receivedElectronicTenderQuantity;
    }

    /**
     * Sets the value of the receivedElectronicTenderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedElectronicTenderQuantity }
     *     
     */
    public void setReceivedElectronicTenderQuantity(ReceivedElectronicTenderQuantity value) {
        this.receivedElectronicTenderQuantity = value;
    }

    /**
     * Gets the value of the receivedForeignTenderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedForeignTenderQuantity }
     *     
     */
    public ReceivedForeignTenderQuantity getReceivedForeignTenderQuantity() {
        return receivedForeignTenderQuantity;
    }

    /**
     * Sets the value of the receivedForeignTenderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedForeignTenderQuantity }
     *     
     */
    public void setReceivedForeignTenderQuantity(ReceivedForeignTenderQuantity value) {
        this.receivedForeignTenderQuantity = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link ContractType }
     *     
     */
    public ContractType getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType }
     *     
     */
    public void setContract(ContractType value) {
        this.contract = value;
    }

    /**
     * Gets the value of the awardedTenderedProject property.
     * 
     * @return
     *     possible object is
     *     {@link TenderedProjectType }
     *     
     */
    public TenderedProjectType getAwardedTenderedProject() {
        return awardedTenderedProject;
    }

    /**
     * Sets the value of the awardedTenderedProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderedProjectType }
     *     
     */
    public void setAwardedTenderedProject(TenderedProjectType value) {
        this.awardedTenderedProject = value;
    }

    /**
     * Gets the value of the contractFormalizationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getContractFormalizationPeriod() {
        return contractFormalizationPeriod;
    }

    /**
     * Sets the value of the contractFormalizationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setContractFormalizationPeriod(PeriodType value) {
        this.contractFormalizationPeriod = value;
    }

    /**
     * Gets the value of the subcontractTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subcontractTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubcontractTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubcontractTermsType }
     * 
     * 
     */
    public List<SubcontractTermsType> getSubcontractTerms() {
        if (subcontractTerms == null) {
            subcontractTerms = new ArrayList<SubcontractTermsType>();
        }
        return this.subcontractTerms;
    }

    /**
     * Gets the value of the winningParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the winningParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWinningParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WinningParty }
     * 
     * 
     */
    public List<WinningParty> getWinningParties() {
        if (winningParties == null) {
            winningParties = new ArrayList<WinningParty>();
        }
        return this.winningParties;
    }

}
