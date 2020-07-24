package com.ex.restservicedemo.beans;

public class Surfer {

    private String name;
    private int numOfBoards;

    public Surfer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfBoards() {
        return numOfBoards;
    }

    public void setNumOfBoards(int numOfBoards) {
        this.numOfBoards = numOfBoards;
    }

    @Override
    public String toString() {
        return "Surfer{" +
                "name='" + name + '\'' +
                ", numOfBoards=" + numOfBoards +
                '}';
    }
}
