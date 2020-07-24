package com.example.aopdemo.domain;

import org.springframework.stereotype.Service;

@Service
public class Maths {

    public void doShortMethod(String name){
        int pisum = 3+1+4;
        System.out.println(name);
        System.out.println(pisum);
    }

    public void doMediumMethod(int number){
        int pisum=1;
        for(int i=0; i<number; i++){
            pisum+=1;
        }
        System.out.println(number);
        System.out.println(pisum);
    }

    public void doLongMethod(int number){
        int pisum=1;
        for(int i=0; i<number*1000; i++){
            pisum+=1;
        }
        System.out.println(number);
        System.out.println(pisum);
    }
}
