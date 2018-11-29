package ru.tn.rsTest;

import ru.tn.rsTest.beans.HelloBean;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloWorld")
public class HelloWorld {

    @EJB
    private HelloBean bean;

    @GET
    @Produces("text/plain")
    public String hello() {
        String message = bean.getMessage();
        return message;
    }
}
