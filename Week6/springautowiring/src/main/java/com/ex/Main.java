package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private License license;

    public Main(License license){
        this.license = license;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Main m = context.getBean("main", Main.class);
        System.out.println(m.license);

        ((AbstractApplicationContext)context).close();

    }
        public void setLicense(License license){
            System.out.println("Change license");
            this.license = license;
        }

}
