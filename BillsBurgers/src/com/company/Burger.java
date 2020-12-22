package com.company;

public class Burger {                       // The main burger class, also used for Normal burger. The other 2
                                            // burger types extend from this class.
    private Bread bread;
    private Meat meat;
    private Additions addition1;
    private Additions addition2;
    private Additions addition3;
    private Additions addition4;

   public Burger (Bread bread, Meat meat) {
        this (bread, meat, new NoAdd(), new NoAdd(), new NoAdd(), new NoAdd());
   }

    public Burger(Bread bread, Meat meat, Additions addition1, Additions addition2,
                  Additions addition3, Additions addition4) {
        this.bread = bread;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
    }

    public void doubleTheMeat (Additions meatAdd) {
        if (meatAdd.isDoubleMeat()) {
            meatAdd.setPrice(meat.getPrice() * 0.8);
        }
    }

    public double getAdditionsPrice () {
        doubleTheMeat(this.addition1);
        doubleTheMeat(this.addition2);
        doubleTheMeat(this.addition3);
        doubleTheMeat(this.addition4);
        return addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice();
    }

    public double getBreadAndMeatPrice () {
        return bread.getPrice()+meat.getPrice();
    }

    public double getTotalPrice () {
        return getAdditionsPrice()+getBreadAndMeatPrice();
    }
}
