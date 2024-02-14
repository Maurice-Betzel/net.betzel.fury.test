
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherCertStatusRefsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherCertStatusRefsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherRef" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCertStatusRefsType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "otherReves"
})
public class OtherCertStatusRefsType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "OtherRef", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<AnyType> otherReves;

    /**
     * Gets the value of the otherReves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherReves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherReves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * 
     * 
     */
    public List<AnyType> getOtherReves() {
        if (otherReves == null) {
            otherReves = new ArrayList<AnyType>();
        }
        return this.otherReves;
    }

}
