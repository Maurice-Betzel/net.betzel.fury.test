
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CompleteRevocationRefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompleteRevocationRefsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRLRefs" type="{http://uri.etsi.org/01903/v1.3.2#}CRLRefsType" minOccurs="0"/&gt;
 *         &lt;element name="OCSPRefs" type="{http://uri.etsi.org/01903/v1.3.2#}OCSPRefsType" minOccurs="0"/&gt;
 *         &lt;element name="OtherRefs" type="{http://uri.etsi.org/01903/v1.3.2#}OtherCertStatusRefsType" minOccurs="0"/&gt;
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
@XmlType(name = "CompleteRevocationRefsType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "crlRefs",
    "ocspRefs",
    "otherRefs"
})
public class CompleteRevocationRefsType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "CRLRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected CRLRefsType crlRefs;
    @XmlElement(name = "OCSPRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected OCSPRefsType ocspRefs;
    @XmlElement(name = "OtherRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected OtherCertStatusRefsType otherRefs;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the crlRefs property.
     * 
     * @return
     *     possible object is
     *     {@link CRLRefsType }
     *     
     */
    public CRLRefsType getCRLRefs() {
        return crlRefs;
    }

    /**
     * Sets the value of the crlRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRLRefsType }
     *     
     */
    public void setCRLRefs(CRLRefsType value) {
        this.crlRefs = value;
    }

    /**
     * Gets the value of the ocspRefs property.
     * 
     * @return
     *     possible object is
     *     {@link OCSPRefsType }
     *     
     */
    public OCSPRefsType getOCSPRefs() {
        return ocspRefs;
    }

    /**
     * Sets the value of the ocspRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCSPRefsType }
     *     
     */
    public void setOCSPRefs(OCSPRefsType value) {
        this.ocspRefs = value;
    }

    /**
     * Gets the value of the otherRefs property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCertStatusRefsType }
     *     
     */
    public OtherCertStatusRefsType getOtherRefs() {
        return otherRefs;
    }

    /**
     * Sets the value of the otherRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCertStatusRefsType }
     *     
     */
    public void setOtherRefs(OtherCertStatusRefsType value) {
        this.otherRefs = value;
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
