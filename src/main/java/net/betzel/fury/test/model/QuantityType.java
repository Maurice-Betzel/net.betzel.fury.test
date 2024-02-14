
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDNDRUDT0000018&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A counted number of non-monetary units, possibly including a fractional part.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for QuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;QuantityType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType", namespace = "urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1")
@XmlSeeAlso({
    TotalTransportHandlingUnitQuantity.class,
    TotalPackagesQuantity.class,
    TotalPackageQuantity.class,
    TotalGoodsItemQuantity.class,
    TotalDeliveredQuantity.class,
    ShortQuantity.class,
    ReturnableQuantity.class,
    RejectedQuantity.class,
    ReceivedQuantity.class,
    PassengerQuantity.class,
    OversupplyQuantity.class,
    OutstandingQuantity.class,
    NormalTemperatureReductionQuantity.class,
    MinimumBackorderQuantity.class,
    MaximumBackorderQuantity.class,
    GasPressureQuantity.class,
    EstimatedConsumedQuantity.class,
    DifferenceTemperatureReductionQuantity.class,
    DebitedQuantity.class,
    CustomsTariffQuantity.class,
    CrewQuantity.class,
    CreditedQuantity.class,
    ConsumptionWaterQuantity.class,
    ConsumptionEnergyQuantity.class,
    ConsumerUnitQuantity.class,
    ConsignmentQuantity.class,
    ChildConsignmentQuantity.class,
    ChargeableQuantity.class,
    BatchQuantity.class,
    BaseQuantity.class,
    BackorderQuantity.class,
    ActualTemperatureReductionQuantity.class,
    MaximumVariantQuantity.class,
    EmployeeQuantity.class,
    OperatingYearsQuantity.class,
    ReceivedForeignTenderQuantity.class,
    ReceivedElectronicTenderQuantity.class,
    ReceivedTenderQuantity.class,
    TotalMeteredQuantity.class,
    ResponseQuantity.class,
    EstimatedOverallContractQuantity.class,
    PerformanceValueQuantity.class,
    DeliveredQuantity.class,
    LatestMeterQuantity.class,
    PreviousMeterQuantity.class,
    ValueQuantity.class,
    TotalIllPersonQuantity.class,
    TotalDeadPersonQuantity.class,
    TargetInventoryQuantity.class,
    MultipleOrderQuantity.class,
    MinimumInventoryQuantity.class,
    SharesNumberQuantity.class,
    MaximumOperatorQuantity.class,
    ExpectedOperatorQuantity.class,
    VarianceQuantity.class,
    TimeDeltaDaysQuantity.class,
    ThresholdQuantity.class,
    MinimumQuantity.class,
    MaximumQuantity.class,
    ExpectedQuantity.class,
    PackQuantity.class,
    InvoicedQuantity.class,
    BasicConsumedQuantity.class,
    TotalConsumedQuantity.class,
    Quantity.class,
    MaximumOrderQuantity.class,
    MinimumOrderQuantity.class,
    ContentUnitQuantity.class,
    TanksNotExchangedQuantity.class,
    TanksExchangedQuantity.class,
    TanksInBallastQuantity.class,
    TotalBallastTanksOnBoardQuantity.class
})
public class QuantityType
    extends QuantityType2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
