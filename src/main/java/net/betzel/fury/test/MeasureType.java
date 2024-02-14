
package net.betzel.fury.test;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDNDRUDT0000013&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A numeric value determined by measuring an object using a specified unit of measure.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Measure&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PropertyTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Type&lt;/ccts:PropertyTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;MeasureType"&gt;
 *       &lt;attribute name="unitCode" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", namespace = "urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1")
@XmlSeeAlso({
    VolumeMeasure.class,
    TareWeightMeasure.class,
    SeaHeightMeasure.class,
    SalinityMeasure.class,
    NetNetWeightMeasure.class,
    LoadingLengthMeasure.class,
    LeadTimeMeasure.class,
    GrossWeightMeasure.class,
    GrossVolumeMeasure.class,
    DurationMeasure.class,
    ChargeableWeightMeasure.class,
    GrossMassMeasure.class,
    BaseUnitMeasure.class,
    ResponseMeasure.class,
    PreEventNotificationDurationMeasure.class,
    PostEventNotificationDurationMeasure.class,
    EstimatedGeneratedUntilNextPortMeasure.class,
    MaxDedicatedStorageCapacityMeasure.class,
    RetainedOnBoardMeasure.class,
    ToBeDeliveredMeasure.class,
    RateOfTurnMeasure.class,
    SpeedOverGroundMeasure.class,
    SegregatedBallastMeasure.class,
    NetTonnageMeasure.class,
    GrossTonnageMeasure.class,
    AltitudeMeasure.class,
    LongitudeMinutesMeasure.class,
    LongitudeDegreesMeasure.class,
    LatitudeMinutesMeasure.class,
    LatitudeDegreesMeasure.class,
    NetVolumeMeasure.class,
    NetWeightMeasure.class,
    FuelConsumptionMeasure.class,
    SourceValueMeasure.class,
    ComparedValueMeasure.class,
    ValueMeasure.class,
    MeanTimeToRecoverDurationMeasure.class,
    MaximumDataLossDurationMeasure.class,
    MaximumIncidentNotificationDurationMeasure.class,
    MinimumDownTimeScheduleDurationMeasure.class,
    MinimumResponseTimeDurationMeasure.class,
    MaximumMeasure.class,
    MinimumMeasure.class,
    Measure.class,
    TotalBallastWaterCapacityMeasure.class,
    TotalBallastWaterOnBoardMeasure.class
})
public class MeasureType
    extends MeasureType2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
