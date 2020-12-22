package com.company;

public class Additions {                // Main additions class from which the different addition types extend.

    private String name = "No addition";
    private double price = 0.0;
    private boolean isDoubleMeat;

    public Additions(String name, double price, boolean isDoubleMeat) {
        this.name = name;
        this.price = price;
        this.isDoubleMeat = isDoubleMeat;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDoubleMeat() {
        return isDoubleMeat;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
