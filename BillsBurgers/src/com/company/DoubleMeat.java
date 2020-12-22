package com.company;

public class DoubleMeat extends Additions {

    public DoubleMeat(Meat meat) {          // The price of the double meat depends on the type of meat chosen.
        super ("Double Meat", meat.getPrice()*0.8,true);
    }
}
