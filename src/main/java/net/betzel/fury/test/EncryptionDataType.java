
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MessageFormat"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EncryptionCertificateAttachment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EncryptionCertificatePathChain" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}EncryptionSymmetricAlgorithm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionDataType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "messageFormat",
    "encryptionCertificateAttachment",
    "encryptionCertificatePathChains",
    "encryptionSymmetricAlgorithms"
})
public class EncryptionDataType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "MessageFormat", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected MessageFormat messageFormat;
    @XmlElement(name = "EncryptionCertificateAttachment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected AttachmentType encryptionCertificateAttachment;
    @XmlElement(name = "EncryptionCertificatePathChain", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EncryptionCertificatePathChain> encryptionCertificatePathChains;
    @XmlElement(name = "EncryptionSymmetricAlgorithm", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    @Valid
    protected List<EncryptionSymmetricAlgorithm> encryptionSymmetricAlgorithms;

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
     * Gets the value of the messageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFormat }
     *     
     */
    public MessageFormat getMessageFormat() {
        return messageFormat;
    }

    /**
     * Sets the value of the messageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFormat }
     *     
     */
    public void setMessageFormat(MessageFormat value) {
        this.messageFormat = value;
    }

    /**
     * Gets the value of the encryptionCertificateAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getEncryptionCertificateAttachment() {
        return encryptionCertificateAttachment;
    }

    /**
     * Sets the value of the encryptionCertificateAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setEncryptionCertificateAttachment(AttachmentType value) {
        this.encryptionCertificateAttachment = value;
    }

    /**
     * Gets the value of the encryptionCertificatePathChains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionCertificatePathChains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptionCertificatePathChains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionCertificatePathChain }
     * 
     * 
     */
    public List<EncryptionCertificatePathChain> getEncryptionCertificatePathChains() {
        if (encryptionCertificatePathChains == null) {
            encryptionCertificatePathChains = new ArrayList<EncryptionCertificatePathChain>();
        }
        return this.encryptionCertificatePathChains;
    }

    /**
     * Gets the value of the encryptionSymmetricAlgorithms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptionSymmetricAlgorithms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptionSymmetricAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionSymmetricAlgorithm }
     * 
     * 
     */
    public List<EncryptionSymmetricAlgorithm> getEncryptionSymmetricAlgorithms() {
        if (encryptionSymmetricAlgorithms == null) {
            encryptionSymmetricAlgorithms = new ArrayList<EncryptionSymmetricAlgorithm>();
        }
        return this.encryptionSymmetricAlgorithms;
    }

}
