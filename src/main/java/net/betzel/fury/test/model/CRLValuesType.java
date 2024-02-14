
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
 * <p>Java class for CRLValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRLValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EncapsulatedCRLValue" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRLValuesType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "encapsulatedCRLValues"
})
public class CRLValuesType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "EncapsulatedCRLValue", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<EncapsulatedPKIDataType> encapsulatedCRLValues;

    /**
     * Gets the value of the encapsulatedCRLValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encapsulatedCRLValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncapsulatedCRLValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedPKIDataType }
     * 
     * 
     */
    public List<EncapsulatedPKIDataType> getEncapsulatedCRLValues() {
        if (encapsulatedCRLValues == null) {
            encapsulatedCRLValues = new ArrayList<EncapsulatedPKIDataType>();
        }
        return this.encapsulatedCRLValues;
    }

}
