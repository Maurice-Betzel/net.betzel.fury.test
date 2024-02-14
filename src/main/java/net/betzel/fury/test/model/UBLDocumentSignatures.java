
package net.betzel.fury.test.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UBLDocumentSignaturesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UBLDocumentSignaturesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2}SignatureInformation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLDocumentSignaturesType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonSignatureComponents-2", propOrder = {
    "signatureInformations"
})
@XmlRootElement(name = "UBLDocumentSignatures", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonSignatureComponents-2")
public class UBLDocumentSignatures
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "SignatureInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:SignatureAggregateComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<SignatureInformation> signatureInformations;

    /**
     * Gets the value of the signatureInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureInformation }
     * 
     * 
     */
    public List<SignatureInformation> getSignatureInformations() {
        if (signatureInformations == null) {
            signatureInformations = new ArrayList<SignatureInformation>();
        }
        return this.signatureInformations;
    }

}
