package ru.tn.wsTest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Тест WS сервиса
 */
@WebService(serviceName = "CalculatorWS")
public class CalculatorWS {

    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        return i + j;
    }
}
