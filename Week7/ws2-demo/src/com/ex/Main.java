package com.ex;

import com.ex.domain.Employee;
import com.ex.domain.EmployeeNotFound;
import com.ex.services.EmployeeService;
import com.ex.services.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
//        URL url = new URL("http://localhost:8080/ws/hello?wsdl");
//
//        QName qName = new QName("http://services.ex.com/", "HelloWorldImplService"); //comes from targetNamespace in the wsdl
//                                                                                                        //comes from service name
//        Service service = Service.create(url, qName);
//
//        HelloWorld hello = service.getPort(HelloWorld.class);
//        System.out.println(hello.getHelloWorldAsString("Spencer Saunders"));

        URL url = new URL("http://localhost:8080/ws/employee?wsdl");

        QName qName = new QName("http://services.ex.com/", "EmployeeServiceImplService"); //comes from targetNamespace in the wsdl
                                                                                                        //comes from service name
        Service service = Service.create(url, qName);

        EmployeeService employeeService = service.getPort(EmployeeService.class);
        try{
            Employee e = employeeService.findEmployee("1234");
            System.out.println(e);
        }catch(EmployeeNotFound e){
            e.printStackTrace();
        }

    }
}
