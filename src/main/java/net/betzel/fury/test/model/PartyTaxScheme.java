
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
 * <p>Java class for PartyTaxSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyTaxSchemeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}RegistrationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CompanyID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExemptionReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ExemptionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}RegistrationAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxScheme"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTaxSchemeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "registrationName",
    "companyID",
    "taxLevelCode",
    "exemptionReasonCode",
    "exemptionReasons",
    "registrationAddress",
    "taxScheme"
})
@XmlRootElement(name = "PartyTaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class PartyTaxScheme
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "RegistrationName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected RegistrationName registrationName;
    @XmlElement(name = "CompanyID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected CompanyID companyID;
    @XmlElement(name = "TaxLevelCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TaxLevelCode taxLevelCode;
    @XmlElement(name = "ExemptionReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ExemptionReasonCode exemptionReasonCode;
    @XmlElement(name = "ExemptionReason", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<ExemptionReason> exemptionReasons;
    @XmlElement(name = "RegistrationAddress", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AddressType registrationAddress;
    @XmlElement(name = "TaxScheme", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
    @NotNull
    @Valid
    protected TaxScheme taxScheme;

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
     * Gets the value of the registrationName property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationName }
     *     
     */
    public RegistrationName getRegistrationName() {
        return registrationName;
    }

    /**
     * Sets the value of the registrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationName }
     *     
     */
    public void setRegistrationName(RegistrationName value) {
        this.registrationName = value;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyID }
     *     
     */
    public CompanyID getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyID }
     *     
     */
    public void setCompanyID(CompanyID value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the taxLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxLevelCode }
     *     
     */
    public TaxLevelCode getTaxLevelCode() {
        return taxLevelCode;
    }

    /**
     * Sets the value of the taxLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxLevelCode }
     *     
     */
    public void setTaxLevelCode(TaxLevelCode value) {
        this.taxLevelCode = value;
    }

    /**
     * Gets the value of the exemptionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptionReasonCode }
     *     
     */
    public ExemptionReasonCode getExemptionReasonCode() {
        return exemptionReasonCode;
    }

    /**
     * Sets the value of the exemptionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptionReasonCode }
     *     
     */
    public void setExemptionReasonCode(ExemptionReasonCode value) {
        this.exemptionReasonCode = value;
    }

    /**
     * Gets the value of the exemptionReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptionReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptionReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptionReason }
     * 
     * 
     */
    public List<ExemptionReason> getExemptionReasons() {
        if (exemptionReasons == null) {
            exemptionReasons = new ArrayList<ExemptionReason>();
        }
        return this.exemptionReasons;
    }

    /**
     * Gets the value of the registrationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Sets the value of the registrationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setRegistrationAddress(AddressType value) {
        this.registrationAddress = value;
    }

    /**
     * Gets the value of the taxScheme property.
     * 
     * @return
     *     possible object is
     *     {@link TaxScheme }
     *     
     */
    public TaxScheme getTaxScheme() {
        return taxScheme;
    }

    /**
     * Sets the value of the taxScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxScheme }
     *     
     */
    public void setTaxScheme(TaxScheme value) {
        this.taxScheme = value;
    }

}
