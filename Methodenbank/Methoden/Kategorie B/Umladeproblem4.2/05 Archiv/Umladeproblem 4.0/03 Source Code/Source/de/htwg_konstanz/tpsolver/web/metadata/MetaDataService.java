
package de.htwg_konstanz.tpsolver.web.metadata;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MetaDataService", targetNamespace = "http://metadata.web.tpsolver.htwg_konstanz.de/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MetaDataService {


    /**
     * 
     * @param inputRequirements
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "adequateSolvers", partName = "adequateSolvers")
    public String getAdequateSolvers(
        @WebParam(name = "inputRequirements", partName = "inputRequirements")
        String inputRequirements);

}
