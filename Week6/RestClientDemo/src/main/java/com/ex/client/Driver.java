package com.ex.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Driver {


    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

    SurferClient sc = (SurferClient) context.getBean("surferClient");

    sc.postSurfer();
    //sc.getSurfer();
    }
}
