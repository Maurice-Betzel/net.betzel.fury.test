
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkAttentionIndicatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkAttentionIndicatorType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1&gt;IndicatorType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkAttentionIndicatorType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
@XmlRootElement(name = "MarkAttentionIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
public class MarkAttentionIndicator
    extends IndicatorType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
