package com.ex.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {

    @WebMethod
    String getHelloWorldAsString(String name);
}
