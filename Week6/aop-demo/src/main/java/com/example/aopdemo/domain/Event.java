package com.example.aopdemo.domain;

public abstract class Event {

    protected String name;

    public void doEvent() throws Exception{
        throw new Exception("This is not doable apparently.");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
