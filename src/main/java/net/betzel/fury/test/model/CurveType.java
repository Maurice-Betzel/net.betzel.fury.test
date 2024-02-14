
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="A" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;element name="B" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurveType", namespace = "http://www.w3.org/2009/xmldsig11#", propOrder = {
    "a",
    "b"
})
public class CurveType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "A", namespace = "http://www.w3.org/2009/xmldsig11#", required = true)
    @NotNull
    protected byte[] a;
    @XmlElement(name = "B", namespace = "http://www.w3.org/2009/xmldsig11#", required = true)
    @NotNull
    protected byte[] b;

    /**
     * Gets the value of the a property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setA(byte[] value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setB(byte[] value) {
        this.b = value;
    }

}
