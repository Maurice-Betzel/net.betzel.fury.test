
package net.betzel.fury.test;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1&gt;CodeType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyCodeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:QualifiedDataTypes-2")
@XmlSeeAlso({
    TargetCurrencyCode.class,
    SourceCurrencyCode.class,
    PaymentCurrencyCode.class,
    PaymentAlternativeCurrencyCode.class,
    ValueCurrencyCode.class,
    CurrencyCode.class,
    TaxCurrencyCode.class,
    PricingCurrencyCode.class,
    DocumentCurrencyCode.class,
    RequestedInvoiceCurrencyCode.class
})
public class CurrencyCodeType
    extends CodeType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
