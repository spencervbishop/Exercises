package com.ex.Pojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private String message;

    public void printMessage(){
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

