
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultOfVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultOfVerificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidatorID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationResultCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidationTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateProcess" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateTool" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ValidateToolVersion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SignatoryParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultOfVerificationType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "validatorID",
    "validationResultCode",
    "validationDate",
    "validationTime",
    "validateProcess",
    "validateTool",
    "validateToolVersion",
    "signatoryParty"
})
@XmlRootElement(name = "ResultOfVerification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ResultOfVerification
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ValidatorID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidatorID validatorID;
    @XmlElement(name = "ValidationResultCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidationResultCode validationResultCode;
    @XmlElement(name = "ValidationDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidationDate validationDate;
    @XmlElement(name = "ValidationTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidationTime validationTime;
    @XmlElement(name = "ValidateProcess", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidateProcess validateProcess;
    @XmlElement(name = "ValidateTool", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidateTool validateTool;
    @XmlElement(name = "ValidateToolVersion", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ValidateToolVersion validateToolVersion;
    @XmlElement(name = "SignatoryParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected PartyType signatoryParty;

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
     * Gets the value of the validatorID property.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorID }
     *     
     */
    public ValidatorID getValidatorID() {
        return validatorID;
    }

    /**
     * Sets the value of the validatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorID }
     *     
     */
    public void setValidatorID(ValidatorID value) {
        this.validatorID = value;
    }

    /**
     * Gets the value of the validationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationResultCode }
     *     
     */
    public ValidationResultCode getValidationResultCode() {
        return validationResultCode;
    }

    /**
     * Sets the value of the validationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationResultCode }
     *     
     */
    public void setValidationResultCode(ValidationResultCode value) {
        this.validationResultCode = value;
    }

    /**
     * Gets the value of the validationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDate }
     *     
     */
    public ValidationDate getValidationDate() {
        return validationDate;
    }

    /**
     * Sets the value of the validationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDate }
     *     
     */
    public void setValidationDate(ValidationDate value) {
        this.validationDate = value;
    }

    /**
     * Gets the value of the validationTime property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationTime }
     *     
     */
    public ValidationTime getValidationTime() {
        return validationTime;
    }

    /**
     * Sets the value of the validationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationTime }
     *     
     */
    public void setValidationTime(ValidationTime value) {
        this.validationTime = value;
    }

    /**
     * Gets the value of the validateProcess property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateProcess }
     *     
     */
    public ValidateProcess getValidateProcess() {
        return validateProcess;
    }

    /**
     * Sets the value of the validateProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateProcess }
     *     
     */
    public void setValidateProcess(ValidateProcess value) {
        this.validateProcess = value;
    }

    /**
     * Gets the value of the validateTool property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateTool }
     *     
     */
    public ValidateTool getValidateTool() {
        return validateTool;
    }

    /**
     * Sets the value of the validateTool property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateTool }
     *     
     */
    public void setValidateTool(ValidateTool value) {
        this.validateTool = value;
    }

    /**
     * Gets the value of the validateToolVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ValidateToolVersion }
     *     
     */
    public ValidateToolVersion getValidateToolVersion() {
        return validateToolVersion;
    }

    /**
     * Sets the value of the validateToolVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidateToolVersion }
     *     
     */
    public void setValidateToolVersion(ValidateToolVersion value) {
        this.validateToolVersion = value;
    }

    /**
     * Gets the value of the signatoryParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getSignatoryParty() {
        return signatoryParty;
    }

    /**
     * Sets the value of the signatoryParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setSignatoryParty(PartyType value) {
        this.signatoryParty = value;
    }

}
