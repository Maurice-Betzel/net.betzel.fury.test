
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDNDRUDT000009&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Date. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;One calendar day according the Gregorian calendar.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Date&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;string&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateType", namespace = "urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1", propOrder = {
    "value"
})
@XmlSeeAlso({
    TransactionDate.class,
    TaxPointDate.class,
    SubmissionDueDate.class,
    RevisionDate.class,
    RequiredDeliveryDate.class,
    RequestedPublicationDate.class,
    RegisteredDate.class,
    ReceivedDate.class,
    PurchaseDate.class,
    PlannedDate.class,
    PaidDate.class,
    OccurrenceDate.class,
    NominationDate.class,
    LatestReplyDate.class,
    LatestDeliveryDate.class,
    LastRevisionDate.class,
    InstallmentDueDate.class,
    EstimatedDeliveryDate.class,
    EffectiveDate.class,
    DueDate.class,
    Date.class,
    BirthDate.class,
    ApprovalDate.class,
    ActualDeliveryDate.class,
    WeighingDate.class,
    ReferenceDate.class,
    LatestSecurityClearanceDate.class,
    AwardDate.class,
    ResponseDate.class,
    ResolutionDate.class,
    LatestProposalAcceptanceDate.class,
    FirstShipmentAvailibilityDate.class,
    SubmissionDate.class,
    RequestedDeliveryDate.class,
    LatestPickupDate.class,
    EarliestPickupDate.class,
    ActualPickupDate.class,
    RegistrationExpirationDate.class,
    RegistrationDate.class,
    LatestMeterReadingDate.class,
    PreviousMeterReadingDate.class,
    ApplicationDate.class,
    OnsetDate.class,
    JoinedShipDate.class,
    VisitDate.class,
    LastDrinkingWaterAnalysisDate.class,
    BestBeforeDate.class,
    ManufactureDate.class,
    AvailabilityDate.class,
    ISSCExpiryDate.class,
    FinalReexportationDate.class,
    SourceForecastIssueDate.class,
    ComparisonForecastIssueDate.class,
    GuaranteedDespatchDate.class,
    ActualDespatchDate.class,
    EstimatedDespatchDate.class,
    RequestedDespatchDate.class,
    CallDate.class,
    ExpiryDate.class,
    ValidityStartDate.class,
    PaymentDueDate.class,
    ValidationDate.class,
    EndDate.class,
    StartDate.class,
    IssueDate.class
})
public class DateType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlValue
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected OffsetDateTime value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(OffsetDateTime value) {
        this.value = value;
    }

}
