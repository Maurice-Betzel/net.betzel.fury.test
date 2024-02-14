
package net.betzel.fury.test;

import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OCSPIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCSPIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponderID" type="{http://uri.etsi.org/01903/v1.3.2#}ResponderIDType"/&gt;
 *         &lt;element name="ProducedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCSPIdentifierType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "responderID",
    "producedAt"
})
public class OCSPIdentifierType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "ResponderID", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    @Valid
    protected ResponderIDType responderID;
    @XmlElement(name = "ProducedAt", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    @NotNull
    protected OffsetDateTime producedAt;
    @XmlAttribute(name = "URI")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * Gets the value of the responderID property.
     * 
     * @return
     *     possible object is
     *     {@link ResponderIDType }
     *     
     */
    public ResponderIDType getResponderID() {
        return responderID;
    }

    /**
     * Sets the value of the responderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponderIDType }
     *     
     */
    public void setResponderID(ResponderIDType value) {
        this.responderID = value;
    }

    /**
     * Gets the value of the producedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getProducedAt() {
        return producedAt;
    }

    /**
     * Sets the value of the producedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducedAt(OffsetDateTime value) {
        this.producedAt = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

}
