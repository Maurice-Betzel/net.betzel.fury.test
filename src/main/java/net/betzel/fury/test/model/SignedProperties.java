
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
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
 * <p>Java class for SignedPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignedPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedSignatureProperties" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedDataObjectProperties" minOccurs="0"/&gt;
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
@XmlType(name = "SignedPropertiesType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "signedSignatureProperties",
    "signedDataObjectProperties"
})
@XmlRootElement(name = "SignedProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class SignedProperties
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "SignedSignatureProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignedSignatureProperties signedSignatureProperties;
    @XmlElement(name = "SignedDataObjectProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignedDataObjectProperties signedDataObjectProperties;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the signedSignatureProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SignedSignatureProperties }
     *     
     */
    public SignedSignatureProperties getSignedSignatureProperties() {
        return signedSignatureProperties;
    }

    /**
     * Sets the value of the signedSignatureProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedSignatureProperties }
     *     
     */
    public void setSignedSignatureProperties(SignedSignatureProperties value) {
        this.signedSignatureProperties = value;
    }

    /**
     * Gets the value of the signedDataObjectProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SignedDataObjectProperties }
     *     
     */
    public SignedDataObjectProperties getSignedDataObjectProperties() {
        return signedDataObjectProperties;
    }

    /**
     * Sets the value of the signedDataObjectProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedDataObjectProperties }
     *     
     */
    public void setSignedDataObjectProperties(SignedDataObjectProperties value) {
        this.signedDataObjectProperties = value;
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
