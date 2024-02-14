
package net.betzel.fury.test;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SignedSignaturePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignedSignaturePropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningCertificate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigningCertificateV2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignaturePolicyIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignatureProductionPlace" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignatureProductionPlaceV2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignerRole" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignerRoleV2" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedSignaturePropertiesType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "signingTime",
    "signingCertificate",
    "signingCertificateV2",
    "signaturePolicyIdentifier",
    "signatureProductionPlace",
    "signatureProductionPlaceV2",
    "signerRole",
    "signerRoleV2",
    "anies"
})
@XmlRootElement(name = "SignedSignatureProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class SignedSignatureProperties
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "SigningTime", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime signingTime;
    @XmlElement(name = "SigningCertificate", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SigningCertificate signingCertificate;
    @XmlElement(name = "SigningCertificateV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SigningCertificateV2 signingCertificateV2;
    @XmlElement(name = "SignaturePolicyIdentifier", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignaturePolicyIdentifier signaturePolicyIdentifier;
    @XmlElement(name = "SignatureProductionPlace", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignatureProductionPlace signatureProductionPlace;
    @XmlElement(name = "SignatureProductionPlaceV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignatureProductionPlaceV2 signatureProductionPlaceV2;
    @XmlElement(name = "SignerRole", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignerRole signerRole;
    @XmlElement(name = "SignerRoleV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignerRoleV2 signerRoleV2;
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> anies;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the signingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getSigningTime() {
        return signingTime;
    }

    /**
     * Sets the value of the signingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningTime(OffsetDateTime value) {
        this.signingTime = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link SigningCertificate }
     *     
     */
    public SigningCertificate getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningCertificate }
     *     
     */
    public void setSigningCertificate(SigningCertificate value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the signingCertificateV2 property.
     * 
     * @return
     *     possible object is
     *     {@link SigningCertificateV2 }
     *     
     */
    public SigningCertificateV2 getSigningCertificateV2() {
        return signingCertificateV2;
    }

    /**
     * Sets the value of the signingCertificateV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningCertificateV2 }
     *     
     */
    public void setSigningCertificateV2(SigningCertificateV2 value) {
        this.signingCertificateV2 = value;
    }

    /**
     * Gets the value of the signaturePolicyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyIdentifier }
     *     
     */
    public SignaturePolicyIdentifier getSignaturePolicyIdentifier() {
        return signaturePolicyIdentifier;
    }

    /**
     * Sets the value of the signaturePolicyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyIdentifier }
     *     
     */
    public void setSignaturePolicyIdentifier(SignaturePolicyIdentifier value) {
        this.signaturePolicyIdentifier = value;
    }

    /**
     * Gets the value of the signatureProductionPlace property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProductionPlace }
     *     
     */
    public SignatureProductionPlace getSignatureProductionPlace() {
        return signatureProductionPlace;
    }

    /**
     * Sets the value of the signatureProductionPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProductionPlace }
     *     
     */
    public void setSignatureProductionPlace(SignatureProductionPlace value) {
        this.signatureProductionPlace = value;
    }

    /**
     * Gets the value of the signatureProductionPlaceV2 property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureProductionPlaceV2 }
     *     
     */
    public SignatureProductionPlaceV2 getSignatureProductionPlaceV2() {
        return signatureProductionPlaceV2;
    }

    /**
     * Sets the value of the signatureProductionPlaceV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureProductionPlaceV2 }
     *     
     */
    public void setSignatureProductionPlaceV2(SignatureProductionPlaceV2 value) {
        this.signatureProductionPlaceV2 = value;
    }

    /**
     * Gets the value of the signerRole property.
     * 
     * @return
     *     possible object is
     *     {@link SignerRole }
     *     
     */
    public SignerRole getSignerRole() {
        return signerRole;
    }

    /**
     * Sets the value of the signerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRole }
     *     
     */
    public void setSignerRole(SignerRole value) {
        this.signerRole = value;
    }

    /**
     * Gets the value of the signerRoleV2 property.
     * 
     * @return
     *     possible object is
     *     {@link SignerRoleV2 }
     *     
     */
    public SignerRoleV2 getSignerRoleV2() {
        return signerRoleV2;
    }

    /**
     * Sets the value of the signerRoleV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignerRoleV2 }
     *     
     */
    public void setSignerRoleV2(SignerRoleV2 value) {
        this.signerRoleV2 = value;
    }

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object }
     * 
     * 
     */
    public List<java.lang.Object> getAnies() {
        if (anies == null) {
            anies = new ArrayList<java.lang.Object>();
        }
        return this.anies;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
