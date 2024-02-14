
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertifiedRoleTypeV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertifiedRoleTypeV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}X509AttributeCertificate"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}OtherAttributeCertificate"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedRoleTypeV2", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "otherAttributeCertificate",
    "x509AttributeCertificate"
})
public class CertifiedRoleTypeV2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "OtherAttributeCertificate", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected AnyType otherAttributeCertificate;
    @XmlElement(name = "X509AttributeCertificate", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected EncapsulatedPKIDataType x509AttributeCertificate;

    /**
     * Gets the value of the otherAttributeCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link AnyType }
     *     
     */
    public AnyType getOtherAttributeCertificate() {
        return otherAttributeCertificate;
    }

    /**
     * Sets the value of the otherAttributeCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyType }
     *     
     */
    public void setOtherAttributeCertificate(AnyType value) {
        this.otherAttributeCertificate = value;
    }

    /**
     * Gets the value of the x509AttributeCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedPKIDataType }
     *     
     */
    public EncapsulatedPKIDataType getX509AttributeCertificate() {
        return x509AttributeCertificate;
    }

    /**
     * Sets the value of the x509AttributeCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedPKIDataType }
     *     
     */
    public void setX509AttributeCertificate(EncapsulatedPKIDataType value) {
        this.x509AttributeCertificate = value;
    }

}
