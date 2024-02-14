
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for FieldIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}Prime"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}TnB"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}PnB"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}GnB"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldIDType", namespace = "http://www.w3.org/2009/xmldsig11#", propOrder = {
    "any",
    "gnB",
    "pnB",
    "tnB",
    "prime"
})
public class FieldIDType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlAnyElement
    protected Element any;
    @XmlElement(name = "GnB", namespace = "http://www.w3.org/2009/xmldsig11#")
    @Valid
    protected CharTwoFieldParamsType gnB;
    @XmlElement(name = "PnB", namespace = "http://www.w3.org/2009/xmldsig11#")
    @Valid
    protected PnB pnB;
    @XmlElement(name = "TnB", namespace = "http://www.w3.org/2009/xmldsig11#")
    @Valid
    protected TnB tnB;
    @XmlElement(name = "Prime", namespace = "http://www.w3.org/2009/xmldsig11#")
    @Valid
    protected Prime prime;

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

    /**
     * Gets the value of the gnB property.
     * 
     * @return
     *     possible object is
     *     {@link CharTwoFieldParamsType }
     *     
     */
    public CharTwoFieldParamsType getGnB() {
        return gnB;
    }

    /**
     * Sets the value of the gnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharTwoFieldParamsType }
     *     
     */
    public void setGnB(CharTwoFieldParamsType value) {
        this.gnB = value;
    }

    /**
     * Gets the value of the pnB property.
     * 
     * @return
     *     possible object is
     *     {@link PnB }
     *     
     */
    public PnB getPnB() {
        return pnB;
    }

    /**
     * Sets the value of the pnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnB }
     *     
     */
    public void setPnB(PnB value) {
        this.pnB = value;
    }

    /**
     * Gets the value of the tnB property.
     * 
     * @return
     *     possible object is
     *     {@link TnB }
     *     
     */
    public TnB getTnB() {
        return tnB;
    }

    /**
     * Sets the value of the tnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link TnB }
     *     
     */
    public void setTnB(TnB value) {
        this.tnB = value;
    }

    /**
     * Gets the value of the prime property.
     * 
     * @return
     *     possible object is
     *     {@link Prime }
     *     
     */
    public Prime getPrime() {
        return prime;
    }

    /**
     * Sets the value of the prime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prime }
     *     
     */
    public void setPrime(Prime value) {
        this.prime = value;
    }

}
