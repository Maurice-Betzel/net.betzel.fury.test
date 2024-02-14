
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Pattern;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UnsignedSignaturePropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsignedSignaturePropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CounterSignature"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SignatureTimeStamp"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CompleteCertificateRefs"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CompleteRevocationRefs"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AttributeCertificateRefs"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AttributeRevocationRefs"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}SigAndRefsTimeStamp"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}RefsOnlyTimeStamp"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CertificateValues"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}RevocationValues"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AttrAuthoritiesCertValues"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AttributeRevocationValues"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ArchiveTimeStamp"/&gt;
 *         &lt;any namespace='##other'/&gt;
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
@XmlType(name = "UnsignedSignaturePropertiesType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "counterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs"
})
@XmlRootElement(name = "UnsignedSignatureProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class UnsignedSignatureProperties
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElementRefs({
        @XmlElementRef(name = "RevocationValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttrAuthoritiesCertValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeCertificateRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CompleteRevocationRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeRevocationRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CompleteCertificateRefs", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CounterSignature", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = CounterSignature.class, required = false),
        @XmlElementRef(name = "RefsOnlyTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CertificateValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SigAndRefsTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SignatureTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ArchiveTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttributeRevocationValues", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> counterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the counterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteRevocationRefsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompleteCertificateRefsType }{@code >}
     * {@link CounterSignature }
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link java.lang.Object }
     * {@link JAXBElement }{@code <}{@link CertificateValuesType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link XAdESTimeStampType }{@code >}
     * {@link JAXBElement }{@code <}{@link RevocationValuesType }{@code >}
     * 
     * 
     */
    public List<java.lang.Object> getCounterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs() {
        if (counterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs == null) {
            counterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs = new ArrayList<java.lang.Object>();
        }
        return this.counterSignaturesAndSignatureTimeStampsAndCompleteCertificateRefs;
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
