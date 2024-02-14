
package net.betzel.fury.test;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponderIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponderIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ByName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ByKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponderIDType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "byKey",
    "byName"
})
public class ResponderIDType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "ByKey", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected byte[] byKey;
    @XmlElement(name = "ByName", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    protected String byName;

    /**
     * Gets the value of the byKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getByKey() {
        return byKey;
    }

    /**
     * Sets the value of the byKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setByKey(byte[] value) {
        this.byKey = value;
    }

    /**
     * Gets the value of the byName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByName() {
        return byName;
    }

    /**
     * Sets the value of the byName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByName(String value) {
        this.byName = value;
    }

}
