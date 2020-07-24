package com.ex;

import com.ex.services.EmployeeServiceImpl;
import com.ex.services.HelloWorld;
import com.ex.services.HelloWorldImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/ws/hello", new HelloWorldImpl());
        Endpoint.publish("http://localhost:8080/ws/employee", new EmployeeServiceImpl());

    }
}
