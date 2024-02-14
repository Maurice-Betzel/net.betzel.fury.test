
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
 * <p>Java class for BallastWaterSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BallastWaterSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ManagementPlanOnBoardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ManagementPlanImplementedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IMOGuidelinesOnBoardIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalBallastTanksOnBoardQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TanksInBallastQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TanksExchangedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TanksNotExchangedQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalBallastWaterOnBoardMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TotalBallastWaterCapacityMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OtherControlActions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}NoControlActionsReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}UptakeBallastWaterTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ExchangeBallastWaterTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DischargeBallastWaterTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ResponsibleOfficerPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BallastWaterSummaryType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "managementPlanOnBoardIndicator",
    "managementPlanImplementedIndicator",
    "imoGuidelinesOnBoardIndicator",
    "totalBallastTanksOnBoardQuantity",
    "tanksInBallastQuantity",
    "tanksExchangedQuantity",
    "tanksNotExchangedQuantity",
    "totalBallastWaterOnBoardMeasure",
    "totalBallastWaterCapacityMeasure",
    "otherControlActions",
    "noControlActionsReasons",
    "uptakeBallastWaterTransactions",
    "exchangeBallastWaterTransactions",
    "dischargeBallastWaterTransactions",
    "responsibleOfficerPerson"
})
@XmlRootElement(name = "BallastWaterSummary", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class BallastWaterSummary
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "ManagementPlanOnBoardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ManagementPlanOnBoardIndicator managementPlanOnBoardIndicator;
    @XmlElement(name = "ManagementPlanImplementedIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ManagementPlanImplementedIndicator managementPlanImplementedIndicator;
    @XmlElement(name = "IMOGuidelinesOnBoardIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IMOGuidelinesOnBoardIndicator imoGuidelinesOnBoardIndicator;
    @XmlElement(name = "TotalBallastTanksOnBoardQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalBallastTanksOnBoardQuantity totalBallastTanksOnBoardQuantity;
    @XmlElement(name = "TanksInBallastQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TanksInBallastQuantity tanksInBallastQuantity;
    @XmlElement(name = "TanksExchangedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TanksExchangedQuantity tanksExchangedQuantity;
    @XmlElement(name = "TanksNotExchangedQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TanksNotExchangedQuantity tanksNotExchangedQuantity;
    @XmlElement(name = "TotalBallastWaterOnBoardMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalBallastWaterOnBoardMeasure totalBallastWaterOnBoardMeasure;
    @XmlElement(name = "TotalBallastWaterCapacityMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TotalBallastWaterCapacityMeasure totalBallastWaterCapacityMeasure;
    @XmlElement(name = "OtherControlActions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<OtherControlActions> otherControlActions;
    @XmlElement(name = "NoControlActionsReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<NoControlActionsReason> noControlActionsReasons;
    @XmlElement(name = "UptakeBallastWaterTransaction", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<BallastWaterTransactionType> uptakeBallastWaterTransactions;
    @XmlElement(name = "ExchangeBallastWaterTransaction", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<BallastWaterTransactionType> exchangeBallastWaterTransactions;
    @XmlElement(name = "DischargeBallastWaterTransaction", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<BallastWaterTransactionType> dischargeBallastWaterTransactions;
    @XmlElement(name = "ResponsibleOfficerPerson", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PersonType responsibleOfficerPerson;

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
     * Gets the value of the managementPlanOnBoardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlanOnBoardIndicator }
     *     
     */
    public ManagementPlanOnBoardIndicator getManagementPlanOnBoardIndicator() {
        return managementPlanOnBoardIndicator;
    }

    /**
     * Sets the value of the managementPlanOnBoardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlanOnBoardIndicator }
     *     
     */
    public void setManagementPlanOnBoardIndicator(ManagementPlanOnBoardIndicator value) {
        this.managementPlanOnBoardIndicator = value;
    }

    /**
     * Gets the value of the managementPlanImplementedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlanImplementedIndicator }
     *     
     */
    public ManagementPlanImplementedIndicator getManagementPlanImplementedIndicator() {
        return managementPlanImplementedIndicator;
    }

    /**
     * Sets the value of the managementPlanImplementedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlanImplementedIndicator }
     *     
     */
    public void setManagementPlanImplementedIndicator(ManagementPlanImplementedIndicator value) {
        this.managementPlanImplementedIndicator = value;
    }

    /**
     * Gets the value of the imoGuidelinesOnBoardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IMOGuidelinesOnBoardIndicator }
     *     
     */
    public IMOGuidelinesOnBoardIndicator getIMOGuidelinesOnBoardIndicator() {
        return imoGuidelinesOnBoardIndicator;
    }

    /**
     * Sets the value of the imoGuidelinesOnBoardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMOGuidelinesOnBoardIndicator }
     *     
     */
    public void setIMOGuidelinesOnBoardIndicator(IMOGuidelinesOnBoardIndicator value) {
        this.imoGuidelinesOnBoardIndicator = value;
    }

    /**
     * Gets the value of the totalBallastTanksOnBoardQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TotalBallastTanksOnBoardQuantity }
     *     
     */
    public TotalBallastTanksOnBoardQuantity getTotalBallastTanksOnBoardQuantity() {
        return totalBallastTanksOnBoardQuantity;
    }

    /**
     * Sets the value of the totalBallastTanksOnBoardQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalBallastTanksOnBoardQuantity }
     *     
     */
    public void setTotalBallastTanksOnBoardQuantity(TotalBallastTanksOnBoardQuantity value) {
        this.totalBallastTanksOnBoardQuantity = value;
    }

    /**
     * Gets the value of the tanksInBallastQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TanksInBallastQuantity }
     *     
     */
    public TanksInBallastQuantity getTanksInBallastQuantity() {
        return tanksInBallastQuantity;
    }

    /**
     * Sets the value of the tanksInBallastQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TanksInBallastQuantity }
     *     
     */
    public void setTanksInBallastQuantity(TanksInBallastQuantity value) {
        this.tanksInBallastQuantity = value;
    }

    /**
     * Gets the value of the tanksExchangedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TanksExchangedQuantity }
     *     
     */
    public TanksExchangedQuantity getTanksExchangedQuantity() {
        return tanksExchangedQuantity;
    }

    /**
     * Sets the value of the tanksExchangedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TanksExchangedQuantity }
     *     
     */
    public void setTanksExchangedQuantity(TanksExchangedQuantity value) {
        this.tanksExchangedQuantity = value;
    }

    /**
     * Gets the value of the tanksNotExchangedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TanksNotExchangedQuantity }
     *     
     */
    public TanksNotExchangedQuantity getTanksNotExchangedQuantity() {
        return tanksNotExchangedQuantity;
    }

    /**
     * Sets the value of the tanksNotExchangedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TanksNotExchangedQuantity }
     *     
     */
    public void setTanksNotExchangedQuantity(TanksNotExchangedQuantity value) {
        this.tanksNotExchangedQuantity = value;
    }

    /**
     * Gets the value of the totalBallastWaterOnBoardMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link TotalBallastWaterOnBoardMeasure }
     *     
     */
    public TotalBallastWaterOnBoardMeasure getTotalBallastWaterOnBoardMeasure() {
        return totalBallastWaterOnBoardMeasure;
    }

    /**
     * Sets the value of the totalBallastWaterOnBoardMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalBallastWaterOnBoardMeasure }
     *     
     */
    public void setTotalBallastWaterOnBoardMeasure(TotalBallastWaterOnBoardMeasure value) {
        this.totalBallastWaterOnBoardMeasure = value;
    }

    /**
     * Gets the value of the totalBallastWaterCapacityMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link TotalBallastWaterCapacityMeasure }
     *     
     */
    public TotalBallastWaterCapacityMeasure getTotalBallastWaterCapacityMeasure() {
        return totalBallastWaterCapacityMeasure;
    }

    /**
     * Sets the value of the totalBallastWaterCapacityMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalBallastWaterCapacityMeasure }
     *     
     */
    public void setTotalBallastWaterCapacityMeasure(TotalBallastWaterCapacityMeasure value) {
        this.totalBallastWaterCapacityMeasure = value;
    }

    /**
     * Gets the value of the otherControlActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherControlActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherControlActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherControlActions }
     * 
     * 
     */
    public List<OtherControlActions> getOtherControlActions() {
        if (otherControlActions == null) {
            otherControlActions = new ArrayList<OtherControlActions>();
        }
        return this.otherControlActions;
    }

    /**
     * Gets the value of the noControlActionsReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noControlActionsReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoControlActionsReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoControlActionsReason }
     * 
     * 
     */
    public List<NoControlActionsReason> getNoControlActionsReasons() {
        if (noControlActionsReasons == null) {
            noControlActionsReasons = new ArrayList<NoControlActionsReason>();
        }
        return this.noControlActionsReasons;
    }

    /**
     * Gets the value of the uptakeBallastWaterTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uptakeBallastWaterTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUptakeBallastWaterTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BallastWaterTransactionType }
     * 
     * 
     */
    public List<BallastWaterTransactionType> getUptakeBallastWaterTransactions() {
        if (uptakeBallastWaterTransactions == null) {
            uptakeBallastWaterTransactions = new ArrayList<BallastWaterTransactionType>();
        }
        return this.uptakeBallastWaterTransactions;
    }

    /**
     * Gets the value of the exchangeBallastWaterTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeBallastWaterTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeBallastWaterTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BallastWaterTransactionType }
     * 
     * 
     */
    public List<BallastWaterTransactionType> getExchangeBallastWaterTransactions() {
        if (exchangeBallastWaterTransactions == null) {
            exchangeBallastWaterTransactions = new ArrayList<BallastWaterTransactionType>();
        }
        return this.exchangeBallastWaterTransactions;
    }

    /**
     * Gets the value of the dischargeBallastWaterTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dischargeBallastWaterTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDischargeBallastWaterTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BallastWaterTransactionType }
     * 
     * 
     */
    public List<BallastWaterTransactionType> getDischargeBallastWaterTransactions() {
        if (dischargeBallastWaterTransactions == null) {
            dischargeBallastWaterTransactions = new ArrayList<BallastWaterTransactionType>();
        }
        return this.dischargeBallastWaterTransactions;
    }

    /**
     * Gets the value of the responsibleOfficerPerson property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getResponsibleOfficerPerson() {
        return responsibleOfficerPerson;
    }

    /**
     * Sets the value of the responsibleOfficerPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setResponsibleOfficerPerson(PersonType value) {
        this.responsibleOfficerPerson = value;
    }

}
