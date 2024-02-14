
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Response" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseBinaryObject" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ResponseURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseValueType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "id",
    "descriptions",
    "responses",
    "responseAmount",
    "responseBinaryObject",
    "responseCode",
    "responseDate",
    "responseID",
    "responseIndicator",
    "responseMeasure",
    "responseNumeric",
    "responseQuantity",
    "responseTime",
    "responseURI"
})
@XmlRootElement(name = "ResponseValue", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ResponseValue
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ID id;
    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Description> descriptions;
    @XmlElement(name = "Response", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected List<Response> responses;
    @XmlElement(name = "ResponseAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseAmount responseAmount;
    @XmlElement(name = "ResponseBinaryObject", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseBinaryObject responseBinaryObject;
    @XmlElement(name = "ResponseCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseCode responseCode;
    @XmlElement(name = "ResponseDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseDate responseDate;
    @XmlElement(name = "ResponseID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseID responseID;
    @XmlElement(name = "ResponseIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseIndicator responseIndicator;
    @XmlElement(name = "ResponseMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseMeasure responseMeasure;
    @XmlElement(name = "ResponseNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseNumeric responseNumeric;
    @XmlElement(name = "ResponseQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseQuantity responseQuantity;
    @XmlElement(name = "ResponseTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseTime responseTime;
    @XmlElement(name = "ResponseURI", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ResponseURI responseURI;

    /**
     * Gets the value of the ublExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link UBLExtensions }
     *     
     */
    public UBLExtensions getUBLExtensions() {
        return ublExtensions;
    }

    /**
     * Sets the value of the ublExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UBLExtensions }
     *     
     */
    public void setUBLExtensions(UBLExtensions value) {
        this.ublExtensions = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the responses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Response }
     * 
     * 
     */
    public List<Response> getResponses() {
        if (responses == null) {
            responses = new ArrayList<Response>();
        }
        return this.responses;
    }

    /**
     * Gets the value of the responseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAmount }
     *     
     */
    public ResponseAmount getResponseAmount() {
        return responseAmount;
    }

    /**
     * Sets the value of the responseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAmount }
     *     
     */
    public void setResponseAmount(ResponseAmount value) {
        this.responseAmount = value;
    }

    /**
     * Gets the value of the responseBinaryObject property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBinaryObject }
     *     
     */
    public ResponseBinaryObject getResponseBinaryObject() {
        return responseBinaryObject;
    }

    /**
     * Sets the value of the responseBinaryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBinaryObject }
     *     
     */
    public void setResponseBinaryObject(ResponseBinaryObject value) {
        this.responseBinaryObject = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCode }
     *     
     */
    public ResponseCode getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCode }
     *     
     */
    public void setResponseCode(ResponseCode value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseDate property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseDate }
     *     
     */
    public ResponseDate getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseDate }
     *     
     */
    public void setResponseDate(ResponseDate value) {
        this.responseDate = value;
    }

    /**
     * Gets the value of the responseID property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseID }
     *     
     */
    public ResponseID getResponseID() {
        return responseID;
    }

    /**
     * Sets the value of the responseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseID }
     *     
     */
    public void setResponseID(ResponseID value) {
        this.responseID = value;
    }

    /**
     * Gets the value of the responseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseIndicator }
     *     
     */
    public ResponseIndicator getResponseIndicator() {
        return responseIndicator;
    }

    /**
     * Sets the value of the responseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseIndicator }
     *     
     */
    public void setResponseIndicator(ResponseIndicator value) {
        this.responseIndicator = value;
    }

    /**
     * Gets the value of the responseMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMeasure }
     *     
     */
    public ResponseMeasure getResponseMeasure() {
        return responseMeasure;
    }

    /**
     * Sets the value of the responseMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMeasure }
     *     
     */
    public void setResponseMeasure(ResponseMeasure value) {
        this.responseMeasure = value;
    }

    /**
     * Gets the value of the responseNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseNumeric }
     *     
     */
    public ResponseNumeric getResponseNumeric() {
        return responseNumeric;
    }

    /**
     * Sets the value of the responseNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseNumeric }
     *     
     */
    public void setResponseNumeric(ResponseNumeric value) {
        this.responseNumeric = value;
    }

    /**
     * Gets the value of the responseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseQuantity }
     *     
     */
    public ResponseQuantity getResponseQuantity() {
        return responseQuantity;
    }

    /**
     * Sets the value of the responseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseQuantity }
     *     
     */
    public void setResponseQuantity(ResponseQuantity value) {
        this.responseQuantity = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTime }
     *     
     */
    public ResponseTime getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTime }
     *     
     */
    public void setResponseTime(ResponseTime value) {
        this.responseTime = value;
    }

    /**
     * Gets the value of the responseURI property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseURI }
     *     
     */
    public ResponseURI getResponseURI() {
        return responseURI;
    }

    /**
     * Sets the value of the responseURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseURI }
     *     
     */
    public void setResponseURI(ResponseURI value) {
        this.responseURI = value;
    }

}
