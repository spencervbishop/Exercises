package com.example.webdemo.domain;

public class Suit {

    private String color;
    private int numButtons;
    private String fabric;
    private String size;

    public Suit() {
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumButtons() {
        return numButtons;
    }

    public void setNumButtons(int numButtons) {
        this.numButtons = numButtons;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "color='" + color + '\'' +
                ", numButtons=" + numButtons +
                ", fabric='" + fabric + '\'' +
                ", size=" + size +
                '}';
    }
}
