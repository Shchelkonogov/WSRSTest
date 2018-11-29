package ru.tn.rsTest.beans;

import javax.ejb.Stateless;

@Stateless
public class HelloBean {

    public String getMessage() {
        return "Hello World!";
    }
}
