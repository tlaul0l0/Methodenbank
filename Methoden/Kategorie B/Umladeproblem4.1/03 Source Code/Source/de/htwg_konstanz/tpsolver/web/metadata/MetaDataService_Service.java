
package de.htwg_konstanz.tpsolver.web.metadata;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MetaDataService", targetNamespace = "http://metadata.web.tpsolver.htwg_konstanz.de/", wsdlLocation = "http://141.37.122.42:8180/SolverWebService/services/MetaDataService/?wsdl")
public class MetaDataService_Service
    extends Service
{

    private final static URL METADATASERVICE_WSDL_LOCATION;
    private final static WebServiceException METADATASERVICE_EXCEPTION;
    private final static QName METADATASERVICE_QNAME = new QName("http://metadata.web.tpsolver.htwg_konstanz.de/", "MetaDataService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://141.37.122.42:8180/SolverWebService/services/MetaDataService/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        METADATASERVICE_WSDL_LOCATION = url;
        METADATASERVICE_EXCEPTION = e;
    }

    public MetaDataService_Service() {
        super(__getWsdlLocation(), METADATASERVICE_QNAME);
    }

    public MetaDataService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), METADATASERVICE_QNAME, features);
    }

    public MetaDataService_Service(URL wsdlLocation) {
        super(wsdlLocation, METADATASERVICE_QNAME);
    }

    public MetaDataService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, METADATASERVICE_QNAME, features);
    }

    public MetaDataService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MetaDataService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MetaDataService
     */
    @WebEndpoint(name = "MetaDataServicePort")
    public MetaDataService getMetaDataServicePort() {
        return super.getPort(new QName("http://metadata.web.tpsolver.htwg_konstanz.de/", "MetaDataServicePort"), MetaDataService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MetaDataService
     */
    @WebEndpoint(name = "MetaDataServicePort")
    public MetaDataService getMetaDataServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://metadata.web.tpsolver.htwg_konstanz.de/", "MetaDataServicePort"), MetaDataService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (METADATASERVICE_EXCEPTION!= null) {
            throw METADATASERVICE_EXCEPTION;
        }
        return METADATASERVICE_WSDL_LOCATION;
    }

}
