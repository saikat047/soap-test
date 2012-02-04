package org.fun.test.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_02-b08-fcs
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "person-manager", targetNamespace = "http://test.fun.org/", wsdlLocation = "http://localhost:8080/web-services-webapp/person-manager?wsdl")
public class PersonManager_Service
    extends Service
{

    private final static URL PERSONMANAGER_WSDL_LOCATION;

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/web-services-webapp/person-manager?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        PERSONMANAGER_WSDL_LOCATION = url;
    }

    public PersonManager_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonManager_Service() {
        super(PERSONMANAGER_WSDL_LOCATION, new QName("http://test.fun.org/", "person-manager"));
    }

    /**
     * 
     * @return
     *     returns PersonManager
     */
    @WebEndpoint(name = "PersonManagerPort")
    public org.fun.test.generated.PersonManager getPersonManagerPort() {
        return (org.fun.test.generated.PersonManager)super.getPort(new QName("http://test.fun.org/", "PersonManagerPort"), org.fun.test.generated.PersonManager.class);
    }

}