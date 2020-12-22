package com.company;

public class Meat {             // Main meat class from which the different meat types extend.

    private String name;
    private double price;

    public Meat(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
