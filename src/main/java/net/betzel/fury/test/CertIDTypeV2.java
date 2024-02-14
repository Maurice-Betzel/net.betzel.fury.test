
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertIDTypeV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertIDTypeV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertDigest" type="{http://uri.etsi.org/01903/v1.3.2#}DigestAlgAndValueType"/&gt;
 *         &lt;element name="IssuerSerialV2" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertIDTypeV2", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "certDigest",
    "issuerSerialV2"
})
public class CertIDTypeV2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "CertDigest", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    @Valid
    protected DigestAlgAndValueType certDigest;
    @XmlElement(name = "IssuerSerialV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected byte[] issuerSerialV2;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Gets the value of the certDigest property.
     * 
     * @return
     *     possible object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public DigestAlgAndValueType getCertDigest() {
        return certDigest;
    }

    /**
     * Sets the value of the certDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestAlgAndValueType }
     *     
     */
    public void setCertDigest(DigestAlgAndValueType value) {
        this.certDigest = value;
    }

    /**
     * Gets the value of the issuerSerialV2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIssuerSerialV2() {
        return issuerSerialV2;
    }

    /**
     * Sets the value of the issuerSerialV2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIssuerSerialV2(byte[] value) {
        this.issuerSerialV2 = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
