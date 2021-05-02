//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.17 at 01:41:25 PM CEST 
//


package webService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}variable"/>
 *         &lt;element name="upper" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lower" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="reducedCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "variable",
    "upper",
    "lower",
    "reducedCost"
})
@XmlRootElement(name = "objectiveFunctionVariation")
public class ObjectiveFunctionVariation {

    @XmlElement(required = true)
    protected String variable;
    protected double upper;
    protected double lower;
    protected double reducedCost;

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariable(String value) {
        this.variable = value;
    }

    /**
     * Gets the value of the upper property.
     * 
     */
    public double getUpper() {
        return upper;
    }

    /**
     * Sets the value of the upper property.
     * 
     */
    public void setUpper(double value) {
        this.upper = value;
    }

    /**
     * Gets the value of the lower property.
     * 
     */
    public double getLower() {
        return lower;
    }

    /**
     * Sets the value of the lower property.
     * 
     */
    public void setLower(double value) {
        this.lower = value;
    }

    /**
     * Gets the value of the reducedCost property.
     * 
     */
    public double getReducedCost() {
        return reducedCost;
    }

    /**
     * Sets the value of the reducedCost property.
     * 
     */
    public void setReducedCost(double value) {
        this.reducedCost = value;
    }

}
