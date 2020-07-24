package com.ex.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

    @Id
    private int id;
    private String brand;
    private int ram;
    private double cpu;
    private double hdd;

    public Laptop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getHdd() {
        return hdd;
    }

    public void setHdd(double hdd) {
        this.hdd = hdd;
    }
}
