
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
 * 
 *                 A container for all extensions present in the document.
 *             
 * 
 * <p>Java class for UBLExtensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UBLExtensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtension" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLExtensionsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", propOrder = {
    "ublExtensions"
})
@XmlRootElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
public class UBLExtensions
    implements Serializable
{

    private final static long serialVersionUID = 98920151419382773L;
    @XmlElement(name = "UBLExtension", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<UBLExtension> ublExtensions;

    /**
     * 
     *                         A single extension for private use.
     *                     Gets the value of the ublExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ublExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUBLExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UBLExtension }
     * 
     * 
     */
    public List<UBLExtension> getUBLExtensions() {
        if (ublExtensions == null) {
            ublExtensions = new ArrayList<UBLExtension>();
        }
        return this.ublExtensions;
    }

}
