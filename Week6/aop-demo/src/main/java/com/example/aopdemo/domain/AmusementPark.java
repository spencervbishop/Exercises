package com.example.aopdemo.domain;

public class AmusementPark extends Event {

    public AmusementPark(){}

    public AmusementPark(String name){
        this.name=name;
    }

    @Override
    public void doEvent() throws Exception {
        System.out.println("Running amusement park " + name);
    }
}
