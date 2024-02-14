
package net.betzel.fury.test.model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionReasonCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionReasonCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:oasis:names:specification:bdndr:schema:xsd:UnqualifiedDataTypes-1&gt;CodeType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionReasonCodeType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
@XmlRootElement(name = "ExtensionReasonCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
public class ExtensionReasonCode
    extends CodeType
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;

}
