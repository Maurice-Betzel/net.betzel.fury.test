
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECValidationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECValidationDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seed" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="hashAlgorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECValidationDataType", namespace = "http://www.w3.org/2009/xmldsig11#", propOrder = {
    "seed"
})
public class ECValidationDataType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(namespace = "http://www.w3.org/2009/xmldsig11#", required = true)
    @NotNull
    protected byte[] seed;
    @XmlAttribute(name = "hashAlgorithm", required = true)
    @XmlSchemaType(name = "anyURI")
    @NotNull
    protected String hashAlgorithm;

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSeed(byte[] value) {
        this.seed = value;
    }

    /**
     * Gets the value of the hashAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Sets the value of the hashAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashAlgorithm(String value) {
        this.hashAlgorithm = value;
    }

}
