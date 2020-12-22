package com.company;

public class HealthyBurger extends Burger {

    private Additions addition5;
    private Additions addition6;

    public HealthyBurger (Meat meat, Additions addition1, Additions addition2, Additions addition3,
                          Additions addition4, Additions addition5, Additions addition6) {
        super (new BrownRye(), meat, addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
        this.addition6 = addition6;
    }

    @Override
    public double getAdditionsPrice() {
        return super.getAdditionsPrice()+addition5.getPrice()+addition6.getPrice();
    }
}
