
package ru.tn.wsTest.generateService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWS", targetNamespace = "http://wsTest.tn.ru/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWS {


    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://wsTest.tn.ru/", className = "ru.tn.wsTest.generateService.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://wsTest.tn.ru/", className = "ru.tn.wsTest.generateService.AddResponse")
    @Action(input = "http://wsTest.tn.ru/CalculatorWS/addRequest", output = "http://wsTest.tn.ru/CalculatorWS/addResponse")
    public int add(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

}
