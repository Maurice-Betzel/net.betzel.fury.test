
package net.betzel.fury.test;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BDNDRUDT000001&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Amount. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A number of monetary units specified using a given unit of currency.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Amount&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;AmountType"&gt;
 *       &lt;attribute name="currencyID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountType", namespace = "urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1")
@XmlSeeAlso({
    WithholdingTaxTotalAmount.class,
    TotalPaymentAmount.class,
    TotalInvoiceAmount.class,
    TotalDebitAmount.class,
    TotalCreditAmount.class,
    TotalBalanceAmount.class,
    ThresholdAmount.class,
    TaxExclusiveAmount.class,
    SettlementDiscountAmount.class,
    RoundingAmount.class,
    PrepaidAmount.class,
    PenaltyAmount.class,
    PayableRoundingAmount.class,
    PayableAmount.class,
    PayableAlternativeAmount.class,
    PaidCashAmount.class,
    PaidAmount.class,
    LiabilityAmount.class,
    InsuranceValueAmount.class,
    InsurancePremiumAmount.class,
    FreeOnBoardValueAmount.class,
    FeeAmount.class,
    EstimatedAmount.class,
    DeclaredStatisticsValueAmount.class,
    DeclaredForCarriageValueAmount.class,
    DeclaredCustomsValueAmount.class,
    DeclaredCarriageValueAmount.class,
    CorrectionUnitAmount.class,
    CorrectionAmount.class,
    ChargeTotalTaxInclusiveAmount.class,
    ChargeTotalAmount.class,
    CashChangeAmount.class,
    BaseAmount.class,
    AllowanceTotalTaxInclusiveAmount.class,
    AllowanceTotalAmount.class,
    DocumentationFeeAmount.class,
    MaximumAdvertisementAmount.class,
    ExpectedAmount.class,
    HigherTenderAmount.class,
    LowerTenderAmount.class,
    AdvertisementAmount.class,
    PerUnitAmount.class,
    TransactionCurrencyTaxAmount.class,
    TaxInclusiveAmount.class,
    TaxAmount.class,
    TaxableAmount.class,
    ResponseAmount.class,
    BalanceAmount.class,
    CreditLineAmount.class,
    DebitLineAmount.class,
    TotalTaxAmount.class,
    AverageSubsequentContractAmount.class,
    MaximumAmount.class,
    MinimumAmount.class,
    EstimatedOverallFrameworkContractsAmount.class,
    EstimatedOverallContractAmount.class,
    RequiredFeeAmount.class,
    CorporateStockAmount.class,
    InventoryValueAmount.class,
    MarketValueAmount.class,
    FaceValueAmount.class,
    MaximumValueAmount.class,
    EstimatedMaximumValueAmount.class,
    TaxInclusivePriceAmount.class,
    CallExtensionAmount.class,
    CallBaseAmount.class,
    TaxInclusiveLineExtensionAmount.class,
    LineExtensionAmount.class,
    AverageAmount.class,
    TaxEnergyBalanceAmount.class,
    TaxEnergyOnAccountAmount.class,
    TaxEnergyAmount.class,
    PartyCapacityAmount.class,
    TotalTaskAmount.class,
    AnnualAverageAmount.class,
    PriceAmount.class,
    TotalAmount.class,
    ValueAmount.class,
    MaximumPaidAmount.class,
    Amount.class
})
public class AmountType
    extends AmountType2
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
