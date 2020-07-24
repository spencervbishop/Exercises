package com.ex.Pojos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Counter {
    private int value =0;
    private int step =1;

    public int increment(){
        return value += step;
    }

    public void setStep(int step){
        this.step = step;
    }

    public int getValue(){
        return this.value;
    }
}
