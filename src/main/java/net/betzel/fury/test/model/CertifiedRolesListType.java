
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertifiedRolesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertifiedRolesListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertifiedRole" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertifiedRolesListType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "certifiedRoles"
})
public class CertifiedRolesListType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "CertifiedRole", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<EncapsulatedPKIDataType> certifiedRoles;

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
     * {@link EncapsulatedPKIDataType }
     * 
     * 
     */
    public List<EncapsulatedPKIDataType> getCertifiedRoles() {
        if (certifiedRoles == null) {
            certifiedRoles = new ArrayList<EncapsulatedPKIDataType>();
        }
        return this.certifiedRoles;
    }

}
