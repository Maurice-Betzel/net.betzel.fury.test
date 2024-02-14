
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastExceptionCriterionLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastExceptionCriterionLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtensions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastPurposeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ForecastTypeCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ComparisonDataSourceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}DataSourceCode"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimeDeltaDaysQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastExceptionCriterionLineType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
    "ublExtensions",
    "forecastPurposeCode",
    "forecastTypeCode",
    "comparisonDataSourceCode",
    "dataSourceCode",
    "timeDeltaDaysQuantity"
})
@XmlRootElement(name = "ForecastExceptionCriterionLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
public class ForecastExceptionCriterionLine
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
    @XmlElement(name = "ComparisonDataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected ComparisonDataSourceCode comparisonDataSourceCode;
    @XmlElement(name = "DataSourceCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    @NotNull
    @Valid
    protected DataSourceCode dataSourceCode;
    @XmlElement(name = "TimeDeltaDaysQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    @Valid
    protected TimeDeltaDaysQuantity timeDeltaDaysQuantity;

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
     * Gets the value of the comparisonDataSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonDataSourceCode }
     *     
     */
    public ComparisonDataSourceCode getComparisonDataSourceCode() {
        return comparisonDataSourceCode;
    }

    /**
     * Sets the value of the comparisonDataSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonDataSourceCode }
     *     
     */
    public void setComparisonDataSourceCode(ComparisonDataSourceCode value) {
        this.comparisonDataSourceCode = value;
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
     * Gets the value of the timeDeltaDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDeltaDaysQuantity }
     *     
     */
    public TimeDeltaDaysQuantity getTimeDeltaDaysQuantity() {
        return timeDeltaDaysQuantity;
    }

    /**
     * Sets the value of the timeDeltaDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDeltaDaysQuantity }
     *     
     */
    public void setTimeDeltaDaysQuantity(TimeDeltaDaysQuantity value) {
        this.timeDeltaDaysQuantity = value;
    }

}
