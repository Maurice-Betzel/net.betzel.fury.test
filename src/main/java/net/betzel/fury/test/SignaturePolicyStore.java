
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SignaturePolicyStoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicyStoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.4.1#}SPDocSpecification"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SignaturePolicyDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="SigPolDocLocalURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "SignaturePolicyStoreType", namespace = "http://uri.etsi.org/01903/v1.4.1#", propOrder = {
    "spDocSpecification",
    "sigPolDocLocalURI",
    "signaturePolicyDocument"
})
@XmlRootElement(name = "SignaturePolicyStore", namespace = "http://uri.etsi.org/01903/v1.4.1#")
public class SignaturePolicyStore
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "SPDocSpecification", namespace = "http://uri.etsi.org/01903/v1.4.1#", required = true)
    @NotNull
    @Valid
    protected ObjectIdentifierType spDocSpecification;
    @XmlElement(name = "SigPolDocLocalURI", namespace = "http://uri.etsi.org/01903/v1.4.1#")
    @XmlSchemaType(name = "anyURI")
    protected String sigPolDocLocalURI;
    @XmlElement(name = "SignaturePolicyDocument", namespace = "http://uri.etsi.org/01903/v1.4.1#")
    protected byte[] signaturePolicyDocument;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the spDocSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getSPDocSpecification() {
        return spDocSpecification;
    }

    /**
     * Sets the value of the spDocSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setSPDocSpecification(ObjectIdentifierType value) {
        this.spDocSpecification = value;
    }

    /**
     * Gets the value of the sigPolDocLocalURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigPolDocLocalURI() {
        return sigPolDocLocalURI;
    }

    /**
     * Sets the value of the sigPolDocLocalURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigPolDocLocalURI(String value) {
        this.sigPolDocLocalURI = value;
    }

    /**
     * Gets the value of the signaturePolicyDocument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignaturePolicyDocument() {
        return signaturePolicyDocument;
    }

    /**
     * Sets the value of the signaturePolicyDocument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignaturePolicyDocument(byte[] value) {
        this.signaturePolicyDocument = value;
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
