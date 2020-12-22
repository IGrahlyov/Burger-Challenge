package com.company;

public class DeluxeBurger extends Burger {

    public DeluxeBurger (Bread bread, Meat meat) {
        super (bread, meat, new NoAdd(), new NoAdd(), new NoAdd(), new NoAdd());
    }

    @Override
    public double getTotalPrice() {
        return super.getBreadAndMeatPrice()+2.25;
    }
}
