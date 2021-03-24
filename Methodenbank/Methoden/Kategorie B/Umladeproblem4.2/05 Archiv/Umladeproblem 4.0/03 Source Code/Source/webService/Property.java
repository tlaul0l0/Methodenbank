//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.17 at 01:41:25 PM CEST 
//


package webService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{}boundLow" minOccurs="0"/>
 *         &lt;element ref="{}boundHigh" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="integrity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "boundLow",
    "boundHigh"
})
@XmlRootElement(name = "property")
public class Property {

    @XmlElement(required = true)
    protected String variable;
    protected Double boundLow;
    protected Double boundHigh;
    @XmlAttribute(name = "integrity")
    protected Boolean integrity;

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
     * Gets the value of the boundLow property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBoundLow() {
        return boundLow;
    }

    /**
     * Sets the value of the boundLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBoundLow(Double value) {
        this.boundLow = value;
    }

    /**
     * Gets the value of the boundHigh property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBoundHigh() {
        return boundHigh;
    }

    /**
     * Sets the value of the boundHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBoundHigh(Double value) {
        this.boundHigh = value;
    }

    /**
     * Gets the value of the integrity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIntegrity() {
        if (integrity == null) {
            return false;
        } else {
            return integrity;
        }
    }

    /**
     * Sets the value of the integrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrity(Boolean value) {
        this.integrity = value;
    }

}
