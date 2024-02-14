
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertifiedRolesListTypeV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertifiedRolesListTypeV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertifiedRole" type="{http://uri.etsi.org/01903/v1.3.2#}CertifiedRoleTypeV2" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedRolesListTypeV2", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "certifiedRoles"
})
@XmlRootElement(name = "CertifiedRolesV2", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class CertifiedRolesV2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "CertifiedRole", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<CertifiedRoleTypeV2> certifiedRoles;

    /**
     * Gets the value of the certifiedRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certifiedRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertifiedRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertifiedRoleTypeV2 }
     * 
     * 
     */
    public List<CertifiedRoleTypeV2> getCertifiedRoles() {
        if (certifiedRoles == null) {
            certifiedRoles = new ArrayList<CertifiedRoleTypeV2>();
        }
        return this.certifiedRoles;
    }

}
