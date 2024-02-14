
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitmentTypeIndicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentTypeIndicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommitmentTypeId" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ObjectReference" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/&gt;
 *           &lt;element name="AllSignedDataObjects" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CommitmentTypeQualifiers" type="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeQualifiersListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentTypeIndicationType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "commitmentTypeId",
    "allSignedDataObjects",
    "objectReferences",
    "commitmentTypeQualifiers"
})
@XmlRootElement(name = "CommitmentTypeIndication", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class CommitmentTypeIndication
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "CommitmentTypeId", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    @Valid
    protected ObjectIdentifierType commitmentTypeId;
    @XmlElement(name = "AllSignedDataObjects", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected java.lang.Object allSignedDataObjects;
    @XmlElement(name = "ObjectReference", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @XmlSchemaType(name = "anyURI")
    @Size(min = 1)
    protected List<String> objectReferences;
    @XmlElement(name = "CommitmentTypeQualifiers", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected CommitmentTypeQualifiersListType commitmentTypeQualifiers;

    /**
     * Gets the value of the commitmentTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public ObjectIdentifierType getCommitmentTypeId() {
        return commitmentTypeId;
    }

    /**
     * Sets the value of the commitmentTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectIdentifierType }
     *     
     */
    public void setCommitmentTypeId(ObjectIdentifierType value) {
        this.commitmentTypeId = value;
    }

    /**
     * Gets the value of the allSignedDataObjects property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getAllSignedDataObjects() {
        return allSignedDataObjects;
    }

    /**
     * Sets the value of the allSignedDataObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setAllSignedDataObjects(java.lang.Object value) {
        this.allSignedDataObjects = value;
    }

    /**
     * Gets the value of the objectReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getObjectReferences() {
        if (objectReferences == null) {
            objectReferences = new ArrayList<String>();
        }
        return this.objectReferences;
    }

    /**
     * Gets the value of the commitmentTypeQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentTypeQualifiersListType }
     *     
     */
    public CommitmentTypeQualifiersListType getCommitmentTypeQualifiers() {
        return commitmentTypeQualifiers;
    }

    /**
     * Sets the value of the commitmentTypeQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentTypeQualifiersListType }
     *     
     */
    public void setCommitmentTypeQualifiers(CommitmentTypeQualifiersListType value) {
        this.commitmentTypeQualifiers = value;
    }

}
