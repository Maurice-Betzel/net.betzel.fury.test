
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CertificateValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="EncapsulatedX509Certificate" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType"/&gt;
 *         &lt;element name="OtherCertificate" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateValuesType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "encapsulatedX509CertificatesAndOtherCertificates"
})
public class CertificateValuesType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElements({
        @XmlElement(name = "EncapsulatedX509Certificate", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = EncapsulatedPKIDataType.class),
        @XmlElement(name = "OtherCertificate", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = AnyType.class)
    })
    @Valid
    protected List<Serializable> encapsulatedX509CertificatesAndOtherCertificates;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the encapsulatedX509CertificatesAndOtherCertificates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encapsulatedX509CertificatesAndOtherCertificates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncapsulatedX509CertificatesAndOtherCertificates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedPKIDataType }
     * {@link AnyType }
     * 
     * 
     */
    public List<Serializable> getEncapsulatedX509CertificatesAndOtherCertificates() {
        if (encapsulatedX509CertificatesAndOtherCertificates == null) {
            encapsulatedX509CertificatesAndOtherCertificates = new ArrayList<Serializable>();
        }
        return this.encapsulatedX509CertificatesAndOtherCertificates;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
