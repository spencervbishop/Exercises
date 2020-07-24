package com.ex;

public class PrinterService {
    private String message = "Default message";

    public void printMessage(){
        System.out.println(this.message);
    }

    public void setMessage(String message){
        this.message = message;
    }
}
