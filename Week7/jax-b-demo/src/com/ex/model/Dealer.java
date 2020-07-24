package com.ex.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(namespace="com.ex.dealerships")
public class Dealer {

    private ArrayList<Car> stock;
    private String name;

    public Dealer() {
    }

    public Dealer(ArrayList<Car> stock, String name) {
        this.stock = stock;
        this.name = name;
    }

    @XmlElementWrapper(name="stock")
    @XmlElement(name="car")
    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
