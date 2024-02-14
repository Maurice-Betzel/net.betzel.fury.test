
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
 * <p>Java class for TenderPreparationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenderPreparationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeID"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TenderEnvelopeTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}OpenTenderID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ProcurementProjectLot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DocumentTenderRequirement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TenderEncryptionData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TenderPreparationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "tenderEnvelopeID",
    "tenderEnvelopeTypeCode",
    "descriptions",
    "openTenderID",
    "procurementProjectLots",
    "documentTenderRequirements",
    "tenderEncryptionDatas"
})
@XmlRootElement(name = "TenderPreparation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class TenderPreparation
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "TenderEnvelopeID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected TenderEnvelopeID tenderEnvelopeID;
    @XmlElement(name = "TenderEnvelopeTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TenderEnvelopeTypeCode tenderEnvelopeTypeCode;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "OpenTenderID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected OpenTenderID openTenderID;
    @XmlElement(name = "ProcurementProjectLot", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<ProcurementProjectLotType> procurementProjectLots;
    @XmlElement(name = "DocumentTenderRequirement", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<TenderRequirementType> documentTenderRequirements;
    @XmlElement(name = "TenderEncryptionData", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EncryptionDataType> tenderEncryptionDatas;

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
     * Gets the value of the tenderEnvelopeID property.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeID }
     *     
     */
    public TenderEnvelopeID getTenderEnvelopeID() {
        return tenderEnvelopeID;
    }

    /**
     * Sets the value of the tenderEnvelopeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeID }
     *     
     */
    public void setTenderEnvelopeID(TenderEnvelopeID value) {
        this.tenderEnvelopeID = value;
    }

    /**
     * Gets the value of the tenderEnvelopeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TenderEnvelopeTypeCode }
     *     
     */
    public TenderEnvelopeTypeCode getTenderEnvelopeTypeCode() {
        return tenderEnvelopeTypeCode;
    }

    /**
     * Sets the value of the tenderEnvelopeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TenderEnvelopeTypeCode }
     *     
     */
    public void setTenderEnvelopeTypeCode(TenderEnvelopeTypeCode value) {
        this.tenderEnvelopeTypeCode = value;
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
     * Gets the value of the openTenderID property.
     * 
     * @return
     *     possible object is
     *     {@link OpenTenderID }
     *     
     */
    public OpenTenderID getOpenTenderID() {
        return openTenderID;
    }

    /**
     * Sets the value of the openTenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenTenderID }
     *     
     */
    public void setOpenTenderID(OpenTenderID value) {
        this.openTenderID = value;
    }

    /**
     * Gets the value of the procurementProjectLots property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procurementProjectLots property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcurementProjectLots().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcurementProjectLotType }
     * 
     * 
     */
    public List<ProcurementProjectLotType> getProcurementProjectLots() {
        if (procurementProjectLots == null) {
            procurementProjectLots = new ArrayList<ProcurementProjectLotType>();
        }
        return this.procurementProjectLots;
    }

    /**
     * Gets the value of the documentTenderRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentTenderRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentTenderRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TenderRequirementType }
     * 
     * 
     */
    public List<TenderRequirementType> getDocumentTenderRequirements() {
        if (documentTenderRequirements == null) {
            documentTenderRequirements = new ArrayList<TenderRequirementType>();
        }
        return this.documentTenderRequirements;
    }

    /**
     * Gets the value of the tenderEncryptionDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tenderEncryptionDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTenderEncryptionDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionDataType }
     * 
     * 
     */
    public List<EncryptionDataType> getTenderEncryptionDatas() {
        if (tenderEncryptionDatas == null) {
            tenderEncryptionDatas = new ArrayList<EncryptionDataType>();
        }
        return this.tenderEncryptionDatas;
    }

}
