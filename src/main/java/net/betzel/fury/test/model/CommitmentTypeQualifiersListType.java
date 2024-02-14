
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommitmentTypeQualifiersListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitmentTypeQualifiersListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommitmentTypeQualifier" type="{http://uri.etsi.org/01903/v1.3.2#}AnyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitmentTypeQualifiersListType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "commitmentTypeQualifiers"
})
public class CommitmentTypeQualifiersListType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "CommitmentTypeQualifier", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected List<AnyType> commitmentTypeQualifiers;

    /**
     * Gets the value of the commitmentTypeQualifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitmentTypeQualifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitmentTypeQualifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnyType }
     * 
     * 
     */
    public List<AnyType> getCommitmentTypeQualifiers() {
        if (commitmentTypeQualifiers == null) {
            commitmentTypeQualifiers = new ArrayList<AnyType>();
        }
        return this.commitmentTypeQualifiers;
    }

}
