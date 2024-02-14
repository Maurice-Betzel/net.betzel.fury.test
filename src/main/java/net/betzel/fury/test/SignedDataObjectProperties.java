
package net.betzel.fury.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SignedDataObjectPropertiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignedDataObjectPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}DataObjectFormat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}CommitmentTypeIndication" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}AllDataObjectsTimeStamp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/01903/v1.3.2#}IndividualDataObjectsTimeStamp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SignedDataObjectPropertiesType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "dataObjectFormats",
    "commitmentTypeIndications",
    "allDataObjectsTimeStamps",
    "individualDataObjectsTimeStamps",
    "anies"
})
@XmlRootElement(name = "SignedDataObjectProperties", namespace = "http://uri.etsi.org/01903/v1.3.2#")
public class SignedDataObjectProperties
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "DataObjectFormat", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected List<DataObjectFormat> dataObjectFormats;
    @XmlElement(name = "CommitmentTypeIndication", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected List<CommitmentTypeIndication> commitmentTypeIndications;
    @XmlElement(name = "AllDataObjectsTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected List<XAdESTimeStampType> allDataObjectsTimeStamps;
    @XmlElement(name = "IndividualDataObjectsTimeStamp", namespace = "http://uri.etsi.org/01903/v1.3.2#")
    @Valid
    protected List<XAdESTimeStampType> individualDataObjectsTimeStamps;
    @XmlAnyElement(lax = true)
    protected List<Object> anies;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    @Pattern(regexp = "[[_:A-Za-z]-[:]][[-._:A-Za-z0-9]-[:]]*")
    protected String id;

    /**
     * Gets the value of the dataObjectFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataObjectFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataObjectFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataObjectFormat }
     * 
     * 
     */
    public List<DataObjectFormat> getDataObjectFormats() {
        if (dataObjectFormats == null) {
            dataObjectFormats = new ArrayList<DataObjectFormat>();
        }
        return this.dataObjectFormats;
    }

    /**
     * Gets the value of the commitmentTypeIndications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commitmentTypeIndications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommitmentTypeIndications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommitmentTypeIndication }
     * 
     * 
     */
    public List<CommitmentTypeIndication> getCommitmentTypeIndications() {
        if (commitmentTypeIndications == null) {
            commitmentTypeIndications = new ArrayList<CommitmentTypeIndication>();
        }
        return this.commitmentTypeIndications;
    }

    /**
     * Gets the value of the allDataObjectsTimeStamps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allDataObjectsTimeStamps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllDataObjectsTimeStamps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getAllDataObjectsTimeStamps() {
        if (allDataObjectsTimeStamps == null) {
            allDataObjectsTimeStamps = new ArrayList<XAdESTimeStampType>();
        }
        return this.allDataObjectsTimeStamps;
    }

    /**
     * Gets the value of the individualDataObjectsTimeStamps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualDataObjectsTimeStamps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualDataObjectsTimeStamps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XAdESTimeStampType }
     * 
     * 
     */
    public List<XAdESTimeStampType> getIndividualDataObjectsTimeStamps() {
        if (individualDataObjectsTimeStamps == null) {
            individualDataObjectsTimeStamps = new ArrayList<XAdESTimeStampType>();
        }
        return this.individualDataObjectsTimeStamps;
    }

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Object>();
        }
        return this.anies;
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
