package com.ex.model;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="car", namespace = "com.ex.dealerships")
@XmlType(propOrder = {"manufacturer", "model", "mileage", "year", "price"})
public class Car {

    private String manufacturer;
    private String model;
    private String year;
    private int mileage;
    private double price;

    public Car(){}

    @XmlElement(name="make")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
