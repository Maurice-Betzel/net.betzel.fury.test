
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignerRoleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClaimedRoles" type="{http://uri.etsi.org/01903/v1.3.2#}ClaimedRolesListType" minOccurs="0"/&gt;
 *         &lt;element name="CertifiedRoles" type="{http://uri.etsi.org/01903/v1.3.2#}CertifiedRolesListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerRoleType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "claimedRoles",
    "certifiedRoles"
})
@XmlRootElement(name = "SignerRole", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class SignerRole
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "ClaimedRoles", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected ClaimedRoles claimedRoles;
    @XmlElement(name = "CertifiedRoles", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected CertifiedRolesListType certifiedRoles;

    /**
     * Gets the value of the claimedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimedRoles }
     *     
     */
    public ClaimedRoles getClaimedRoles() {
        return claimedRoles;
    }

    /**
     * Sets the value of the claimedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimedRoles }
     *     
     */
    public void setClaimedRoles(ClaimedRoles value) {
        this.claimedRoles = value;
    }

    /**
     * Gets the value of the certifiedRoles property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedRolesListType }
     *     
     */
    public CertifiedRolesListType getCertifiedRoles() {
        return certifiedRoles;
    }

    /**
     * Sets the value of the certifiedRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedRolesListType }
     *     
     */
    public void setCertifiedRoles(CertifiedRolesListType value) {
        this.certifiedRoles = value;
    }

}
