
package net.betzel.fury.test.model;

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
 * <p>Java class for QualifyingPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifyingPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedProperties" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}UnsignedProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Target" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifyingPropertiesType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "signedProperties",
    "unsignedProperties"
})
@XmlRootElement(name = "QualifyingProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class QualifyingProperties
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "SignedProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignedProperties signedProperties;
    @XmlElement(name = "UnsignedProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected UnsignedProperties unsignedProperties;
    @XmlAttribute(name = "Target", required = true)
    @XmlSchemaType(name = "anyURI")
    @NotNull
    protected String target;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the signedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link SignedProperties }
     *     
     */
    public SignedProperties getSignedProperties() {
        return signedProperties;
    }

    /**
     * Sets the value of the signedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedProperties }
     *     
     */
    public void setSignedProperties(SignedProperties value) {
        this.signedProperties = value;
    }

    /**
     * Gets the value of the unsignedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link UnsignedProperties }
     *     
     */
    public UnsignedProperties getUnsignedProperties() {
        return unsignedProperties;
    }

    /**
     * Sets the value of the unsignedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsignedProperties }
     *     
     */
    public void setUnsignedProperties(UnsignedProperties value) {
        this.unsignedProperties = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
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
