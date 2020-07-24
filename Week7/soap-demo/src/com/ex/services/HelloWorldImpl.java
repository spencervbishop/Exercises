package com.ex.services;

import javax.jws.WebService;

@WebService(endpointInterface="com.ex.services.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello from JAX-WS, " + name;
    }
}
