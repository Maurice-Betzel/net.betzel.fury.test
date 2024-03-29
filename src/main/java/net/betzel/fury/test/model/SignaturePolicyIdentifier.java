
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignaturePolicyIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignaturePolicyIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="SignaturePolicyId" type="{http://uri.etsi.org/01903/v1.3.2#}SignaturePolicyIdType"/&gt;
 *         &lt;element name="SignaturePolicyImplied" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignaturePolicyIdentifierType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "signaturePolicyImplied",
    "signaturePolicyId"
})
@XmlRootElement(name = "SignaturePolicyIdentifier", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class SignaturePolicyIdentifier
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "SignaturePolicyImplied", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected java.lang.Object signaturePolicyImplied;
    @XmlElement(name = "SignaturePolicyId", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignaturePolicyIdType signaturePolicyId;

    /**
     * Gets the value of the signaturePolicyImplied property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getSignaturePolicyImplied() {
        return signaturePolicyImplied;
    }

    /**
     * Sets the value of the signaturePolicyImplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setSignaturePolicyImplied(java.lang.Object value) {
        this.signaturePolicyImplied = value;
    }

    /**
     * Gets the value of the signaturePolicyId property.
     * 
     * @return
     *     possible object is
     *     {@link SignaturePolicyIdType }
     *     
     */
    public SignaturePolicyIdType getSignaturePolicyId() {
        return signaturePolicyId;
    }

    /**
     * Sets the value of the signaturePolicyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignaturePolicyIdType }
     *     
     */
    public void setSignaturePolicyId(SignaturePolicyIdType value) {
        this.signaturePolicyId = value;
    }

}
