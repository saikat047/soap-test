package org.fun.test.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAXWS SI.
 * JAX-WS RI 2.0_02-b08-fcs
 * Generated source version: 2.0
 * 
 */
@WebService(name = "PersonManager", targetNamespace = "http://test.fun.org/")
public interface PersonManager {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.fun.test.generated.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://test.fun.org/", className = "org.fun.test.generated.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://test.fun.org/", className = "org.fun.test.generated.GetPersonResponse")
    public Person getPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}