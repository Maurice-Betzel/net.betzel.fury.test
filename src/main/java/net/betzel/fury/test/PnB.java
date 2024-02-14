
package net.betzel.fury.test;

import java.io.Serializable;
import java.math.BigInteger;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnBFieldParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnBFieldParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2009/xmldsig11#}CharTwoFieldParamsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="K1" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="K2" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="K3" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnBFieldParamsType", namespace = "http://www.w3.org/2009/xmldsig11#", propOrder = {
    "k1",
    "k2",
    "k3"
})
@XmlRootElement(name = "PnB", namespace = "http://www.w3.org/2009/xmldsig11#")
public class PnB
    extends CharTwoFieldParamsType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "K1", namespace = "http://www.w3.org/2009/xmldsig11#", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @NotNull
    @DecimalMin("1")
    protected BigInteger k1;
    @XmlElement(name = "K2", namespace = "http://www.w3.org/2009/xmldsig11#", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @NotNull
    @DecimalMin("1")
    protected BigInteger k2;
    @XmlElement(name = "K3", namespace = "http://www.w3.org/2009/xmldsig11#", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @NotNull
    @DecimalMin("1")
    protected BigInteger k3;

    /**
     * Gets the value of the k1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK1() {
        return k1;
    }

    /**
     * Sets the value of the k1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK1(BigInteger value) {
        this.k1 = value;
    }

    /**
     * Gets the value of the k2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK2() {
        return k2;
    }

    /**
     * Sets the value of the k2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK2(BigInteger value) {
        this.k2 = value;
    }

    /**
     * Gets the value of the k3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK3() {
        return k3;
    }

    /**
     * Sets the value of the k3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK3(BigInteger value) {
        this.k3 = value;
    }

}
