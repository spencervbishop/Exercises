package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private String appTitle;
    private PrinterService ps;

    public Main(PrinterService ps){
        this.ps = ps;
    }
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Main m = (Main)context.getBean("mainBean");
        Main m2 = (Main)context.getBean("main");
        Main m3 = (Main)context.getBean("main");
        //System.out.println(m.appTitle);
        //m.ps.setMessage(m.appTitle);
        //m.ps.printMessage();
        m3.appTitle = "Not your known bean";
        System.out.println(m.appTitle);
        System.out.println(m2.appTitle);
        System.out.println(m3.appTitle);
    }

    public void setAppTitle(String title){
        this.appTitle = title;
    }
}

