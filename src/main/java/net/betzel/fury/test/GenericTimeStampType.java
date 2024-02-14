
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for GenericTimeStampType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericTimeStampType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}Include" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}ReferenceInfo" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}CanonicalizationMethod" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="EncapsulatedTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}EncapsulatedPKIDataType"/&gt;
 *           &lt;element name="XMLTimeStamp" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericTimeStampType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "referenceInfos",
    "includes",
    "canonicalizationMethod",
    "encapsulatedTimeStampsAndXMLTimeStamps"
})
@XmlSeeAlso({
    XAdESTimeStampType.class,
    OtherTimeStamp.class
})
public abstract class GenericTimeStampType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "ReferenceInfo", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Size(min = 1)
    @Valid
    protected List<ReferenceInfo> referenceInfos;
    @XmlElement(name = "Include", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected List<Include> includes;
    @XmlElement(name = "CanonicalizationMethod", namespace = "http://www.w3.org/2000/09/xmldsig#")
    @Valid
    protected CanonicalizationMethod2 canonicalizationMethod;
    @XmlElements({
        @XmlElement(name = "EncapsulatedTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = EncapsulatedPKIDataType.class),
        @XmlElement(name = "XMLTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#", type = AnyType.class)
    })
    @Valid
    protected List<Serializable> encapsulatedTimeStampsAndXMLTimeStamps;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the referenceInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInfo }
     * 
     * 
     */
    public List<ReferenceInfo> getReferenceInfos() {
        if (referenceInfos == null) {
            referenceInfos = new ArrayList<ReferenceInfo>();
        }
        return this.referenceInfos;
    }

    /**
     * Gets the value of the includes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * 
     * 
     */
    public List<Include> getIncludes() {
        if (includes == null) {
            includes = new ArrayList<Include>();
        }
        return this.includes;
    }

    /**
     * Gets the value of the canonicalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CanonicalizationMethod2 }
     *     
     */
    public CanonicalizationMethod2 getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Sets the value of the canonicalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanonicalizationMethod2 }
     *     
     */
    public void setCanonicalizationMethod(CanonicalizationMethod2 value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Gets the value of the encapsulatedTimeStampsAndXMLTimeStamps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encapsulatedTimeStampsAndXMLTimeStamps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncapsulatedTimeStampsAndXMLTimeStamps().add(newItem);
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
    public List<Serializable> getEncapsulatedTimeStampsAndXMLTimeStamps() {
        if (encapsulatedTimeStampsAndXMLTimeStamps == null) {
            encapsulatedTimeStampsAndXMLTimeStamps = new ArrayList<Serializable>();
        }
        return this.encapsulatedTimeStampsAndXMLTimeStamps;
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
