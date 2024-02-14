
package net.betzel.fury.test;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastPurposeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueDate"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}IssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DataSourceCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonDataCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonForecastIssueTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonForecastIssueDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastExceptionType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "forecastPurposeCode",
    "forecastTypeCode",
    "issueDate",
    "issueTime",
    "dataSourceCode",
    "comparisonDataCode",
    "comparisonForecastIssueTime",
    "comparisonForecastIssueDate"
})
@XmlRootElement(name = "ForecastException", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ForecastException
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
    @Valid
    protected UBLExtensions ublExtensions;
    @XmlElement(name = "ForecastPurposeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ForecastPurposeCode forecastPurposeCode;
    @XmlElement(name = "ForecastTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected ForecastTypeCode forecastTypeCode;
    @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected IssueDate issueDate;
    @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected IssueTime issueTime;
    @XmlElement(name = "DataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected DataSourceCode dataSourceCode;
    @XmlElement(name = "ComparisonDataCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ComparisonDataCode comparisonDataCode;
    @XmlElement(name = "ComparisonForecastIssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ComparisonForecastIssueTime comparisonForecastIssueTime;
    @XmlElement(name = "ComparisonForecastIssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ComparisonForecastIssueDate comparisonForecastIssueDate;

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
     * Gets the value of the forecastPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastPurposeCode }
     *     
     */
    public ForecastPurposeCode getForecastPurposeCode() {
        return forecastPurposeCode;
    }

    /**
     * Sets the value of the forecastPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastPurposeCode }
     *     
     */
    public void setForecastPurposeCode(ForecastPurposeCode value) {
        this.forecastPurposeCode = value;
    }

    /**
     * Gets the value of the forecastTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastTypeCode }
     *     
     */
    public ForecastTypeCode getForecastTypeCode() {
        return forecastTypeCode;
    }

    /**
     * Sets the value of the forecastTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastTypeCode }
     *     
     */
    public void setForecastTypeCode(ForecastTypeCode value) {
        this.forecastTypeCode = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link IssueDate }
     *     
     */
    public IssueDate getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueDate }
     *     
     */
    public void setIssueDate(IssueDate value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issueTime property.
     * 
     * @return
     *     possible object is
     *     {@link IssueTime }
     *     
     */
    public IssueTime getIssueTime() {
        return issueTime;
    }

    /**
     * Sets the value of the issueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueTime }
     *     
     */
    public void setIssueTime(IssueTime value) {
        this.issueTime = value;
    }

    /**
     * Gets the value of the dataSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceCode }
     *     
     */
    public DataSourceCode getDataSourceCode() {
        return dataSourceCode;
    }

    /**
     * Sets the value of the dataSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceCode }
     *     
     */
    public void setDataSourceCode(DataSourceCode value) {
        this.dataSourceCode = value;
    }

    /**
     * Gets the value of the comparisonDataCode property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDataCode }
     *     
     */
    public ComparisonDataCode getComparisonDataCode() {
        return comparisonDataCode;
    }

    /**
     * Sets the value of the comparisonDataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDataCode }
     *     
     */
    public void setComparisonDataCode(ComparisonDataCode value) {
        this.comparisonDataCode = value;
    }

    /**
     * Gets the value of the comparisonForecastIssueTime property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonForecastIssueTime }
     *     
     */
    public ComparisonForecastIssueTime getComparisonForecastIssueTime() {
        return comparisonForecastIssueTime;
    }

    /**
     * Sets the value of the comparisonForecastIssueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonForecastIssueTime }
     *     
     */
    public void setComparisonForecastIssueTime(ComparisonForecastIssueTime value) {
        this.comparisonForecastIssueTime = value;
    }

    /**
     * Gets the value of the comparisonForecastIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonForecastIssueDate }
     *     
     */
    public ComparisonForecastIssueDate getComparisonForecastIssueDate() {
        return comparisonForecastIssueDate;
    }

    /**
     * Sets the value of the comparisonForecastIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonForecastIssueDate }
     *     
     */
    public void setComparisonForecastIssueDate(ComparisonForecastIssueDate value) {
        this.comparisonForecastIssueDate = value;
    }

}
