
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignerRoleV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignerRoleV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ClaimedRoles" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CertifiedRolesV2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignedAssertions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignerRoleV2Type", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "claimedRoles",
    "certifiedRolesV2",
    "signedAssertions"
})
@XmlRootElement(name = "SignerRoleV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class SignerRoleV2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "ClaimedRoles", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected ClaimedRoles claimedRoles;
    @XmlElement(name = "CertifiedRolesV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected CertifiedRolesV2 certifiedRolesV2;
    @XmlElement(name = "SignedAssertions", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected SignedAssertions signedAssertions;

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
     * Gets the value of the certifiedRolesV2 property.
     * 
     * @return
     *     possible object is
     *     {@link CertifiedRolesV2 }
     *     
     */
    public CertifiedRolesV2 getCertifiedRolesV2() {
        return certifiedRolesV2;
    }

    /**
     * Sets the value of the certifiedRolesV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertifiedRolesV2 }
     *     
     */
    public void setCertifiedRolesV2(CertifiedRolesV2 value) {
        this.certifiedRolesV2 = value;
    }

    /**
     * Gets the value of the signedAssertions property.
     * 
     * @return
     *     possible object is
     *     {@link SignedAssertions }
     *     
     */
    public SignedAssertions getSignedAssertions() {
        return signedAssertions;
    }

    /**
     * Sets the value of the signedAssertions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedAssertions }
     *     
     */
    public void setSignedAssertions(SignedAssertions value) {
        this.signedAssertions = value;
    }

}
