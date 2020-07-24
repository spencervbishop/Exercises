package com.ex;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class License implements BeanNameAware, InitializingBean, DisposableBean{

    private String state;
    private String name;

    public License() {
        System.out.println("1. constuctor called");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("2. set state called");
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("3. set name called");
        this.name = name;
    }

    @Override
    public String toString() {
        return "License{" +
                "state='" + state + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("4. my bean name is " + name);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("5. All My properties have been set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Adios!");
    }
}
