//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.17 at 01:41:25 PM CEST 
//


package webService;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}rhs" maxOccurs="unbounded"/>
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
    "rhs"
})
@XmlRootElement(name = "rightHandSides")
public class RightHandSides {
	
    public RightHandSides(){
    	
    }
    
    public RightHandSides(List<Rhs> rhs){
    	if(rhs != null){
    		this.rhs = new ArrayList<Rhs>();
    		this.rhs.addAll(rhs);
    	}
    		
    }

    @XmlElement(required = true)
    public List<Rhs> rhs;

    /**
     * Gets the value of the rhs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rhs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRhs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rhs }
     * 
     * 
     */
    public List<Rhs> getRhs() {
        if (rhs == null) {
            rhs = new ArrayList<Rhs>();
        }
        return this.rhs;
    }
    
    public List<Rhs> getRhsList(){
    	return rhs;
    }
    
    public static RightHandSides mergeRHS(List<Rhs> anbieterRhs, List<Rhs> nachfragerRhs){
    	
    	ArrayList<Rhs> mergeResult = new ArrayList<Rhs>();
    	mergeResult.addAll(anbieterRhs);
    	mergeResult.addAll(nachfragerRhs);
    	
    	return new RightHandSides(mergeResult);
    	
    }

}
