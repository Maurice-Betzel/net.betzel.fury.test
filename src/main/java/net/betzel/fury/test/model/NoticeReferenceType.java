
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoticeReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoticeNumbers" type="{http://uri.etsi.org/01903/v1.3.2#}IntegerListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeReferenceType", namespace = "http://uri.etsi.org/01903/v1.3.2#", propOrder = {
    "organization",
    "noticeNumbers"
})
public class NoticeReferenceType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "Organization", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    protected String organization;
    @XmlElement(name = "NoticeNumbers", namespace = "http://uri.etsi.org/01903/v1.3.2#", required = true)
    @NotNull
    @Valid
    protected IntegerListType noticeNumbers;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the noticeNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerListType }
     *     
     */
    public IntegerListType getNoticeNumbers() {
        return noticeNumbers;
    }

    /**
     * Sets the value of the noticeNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerListType }
     *     
     */
    public void setNoticeNumbers(IntegerListType value) {
        this.noticeNumbers = value;
    }

}
