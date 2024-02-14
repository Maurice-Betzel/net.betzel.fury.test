
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
 * <p>Java class for TnBFieldParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TnBFieldParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2009/xmldsig11#}CharTwoFieldParamsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="K" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TnBFieldParamsType", namespace = "http://www.w3.org/2009/xmldsig11#", propOrder = {
    "k"
})
@XmlRootElement(name = "TnB", namespace = "http://www.w3.org/2009/xmldsig11#")
public class TnB
    extends CharTwoFieldParamsType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "K", namespace = "http://www.w3.org/2009/xmldsig11#", required = true)
    @XmlSchemaType(name = "positiveInteger")
    @NotNull
    @DecimalMin("1")
    protected BigInteger k;

    /**
     * Gets the value of the k property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK(BigInteger value) {
        this.k = value;
    }

}
