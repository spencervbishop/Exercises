package com.example.aopdemo.domain;

public class Play extends Event {

    public Play(){}

    public Play(String name){
        this.name=name;
    }

    @Override
    public void doEvent() throws Exception {
        System.out.println("Starting play " + name);
    }
}
