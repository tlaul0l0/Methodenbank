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
 *         &lt;element ref="{}metaData"/>
 *         &lt;element ref="{}lpba"/>
 *         &lt;element ref="{}lpResults"/>
 *         &lt;element ref="{}methodApi"/>
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
    "metaData",
    "lpba",
    "lpResults",
    "methodApi"
})
@XmlRootElement(name = "dataTransport")
public class DataTransport {

    @XmlElement(required = true)
    protected Object metaData;
    @XmlElement(required = true)
    protected Lpba lpba;
    @XmlElement(required = true)
    protected LpResults lpResults;
    @XmlElement(required = true)
    protected MethodApi methodApi;

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMetaData(Object value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the lpba property.
     * 
     * @return
     *     possible object is
     *     {@link Lpba }
     *     
     */
    public Lpba getLpba() {
        return lpba;
    }

    /**
     * Sets the value of the lpba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lpba }
     *     
     */
    public void setLpba(Lpba value) {
        this.lpba = value;
    }

    /**
     * Gets the value of the lpResults property.
     * 
     * @return
     *     possible object is
     *     {@link LpResults }
     *     
     */
    public LpResults getLpResults() {
        return lpResults;
    }

    /**
     * Sets the value of the lpResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link LpResults }
     *     
     */
    public void setLpResults(LpResults value) {
        this.lpResults = value;
    }

    /**
     * Gets the value of the methodApi property.
     * 
     * @return
     *     possible object is
     *     {@link MethodApi }
     *     
     */
    public MethodApi getMethodApi() {
        return methodApi;
    }

    /**
     * Sets the value of the methodApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodApi }
     *     
     */
    public void setMethodApi(MethodApi value) {
        this.methodApi = value;
    }

}