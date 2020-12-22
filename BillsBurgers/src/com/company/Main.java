package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // The goal of the challenge was to create a simple application for a burger stand with the following options:
        // - choose between 3 types of burgers: Normal, Healthy, Deluxe
        // - Normal burger has 4 additions, Healthy burgers has fixed bread type and 6 additions
        //   Deluxe burger has no additions, but has chips and a drink with it
        // - you should be able to choose the bread, the meat and the additions
        // - when finished picking the application should display the total cost of the burger and its contents
        //
        // I've created this project at the start of the course with available knowledge of:
        // - control flow statements
        // - OOP principles
        // The goal was to work around with classes, class inheritance, constructors, etc.

        boolean isHealthy = false;
        int numberAdd = 1;
        int maxAdd;
        int burgerType;
        Burger burger;
        Bread bread = new Bread ("",0);
        Meat meat = new Meat ("", 0);
        Additions add1 = new Additions("", 0, false);
        Additions add2 = new Additions("", 0, false);
        Additions add3 = new Additions("", 0, false);
        Additions add4 = new Additions("", 0, false);
        Additions add5 = new Additions("", 0, false);
        Additions add6 = new Additions("", 0, false);


        System.out.println("Please pick your type of burger:\n1. Normal burger (bread, meat, 4 additions)" +
                "\n2. Healthy burger (brown rye bread, meat, 6 additions)" +
                "\n3. Deluxe burger (bread, meat, chips, drink)");

        burgerType = selection(1,3);

        switch (burgerType) {               // The "Start" menu, where you can choose the type of burger.
            case 1:
                System.out.println("You've selected Normal burger, now pick your bread type:");
                break;
            case 2:
                System.out.println("You've selected Healthy burger, it has brown rye bread, now pick your meat type:");
                isHealthy = true;
                bread = new BrownRye();
                break;
            case 3:
                System.out.println("You've selected Deluxe burger, now pick your bread type:");
                break;
        }

        if (!isHealthy) {               // The bread type menu that is not accessible for the Healthy burger.
            System.out.println("\n1. White bread\n2. Whole grain bread\n3. Brown rye bread");
            switch (selection(1,3)) {
                case 1:
                    bread = new WhiteBread();
                    break;
                case 2:
                    bread = new WholeGrain();
                    break;
                case 3:
                    bread = new BrownRye();
                    break;
            }
        }
        System.out.println("Pick your meat type:");     // The meat type menu.
        System.out.println("\n1. Ham\n2. Veal\n3. Chicken");
        switch (selection(1,3)) {
            case 1:
                meat = new Ham();
                break;
            case 2:
                meat = new Veal();
                break;
            case 3:
                meat = new Chicken();
                break;
        }

        switch (burgerType) {       // A switch statement for the available additions depending on the burger type.
            case 1:
                System.out.println("Now pick 4 additions");
                break;
            case 2:
                System.out.println("Now pick 6 additions");
                break;
            case 3:
                burger = new DeluxeBurger(bread, meat);
                System.out.println("You've picked Deluxe burger with chips and a drink with a total price of "
                        + String.format("%.2f", burger.getTotalPrice()) + "$");
                break;

        }
        if (burgerType != 3) {                          // The additions are preset, my main idea back then was to be
            maxAdd = (isHealthy) ? 6 : 4;               // able to build a comprehensive menu, and the prices to be hardcoded without using Arrays or Lists.
            System.out.println("\n1. Tomato\n2. Cucumber\n3. Onion\n4. Lettuce\n5. Maize\n6. Jalapeno\n7. Cheese" +
                    "\n8. Double meat\n9. Carrot\n10. Cabbage\n11. Show current selection price" +
                    "\n12. That's all");

            while (numberAdd <= (maxAdd)) {
                switch (selection(1, 12)) {
                    case 1:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Tomato();
                                break;
                            case 2:
                                add2 = new Tomato();
                                break;
                            case 3:
                                add3 = new Tomato();
                                break;
                            case 4:
                                add4 = new Tomato();
                                break;
                            case 5:
                                add5 = new Tomato();
                                break;
                            case 6:
                                add6 = new Tomato();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Tomato" +
                                " with a price of " + String.format("%.2f", new Tomato().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 2:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Cucumber();
                                break;
                            case 2:
                                add2 = new Cucumber();
                                break;
                            case 3:
                                add3 = new Cucumber();
                                break;
                            case 4:
                                add4 = new Cucumber();
                                break;
                            case 5:
                                add5 = new Cucumber();
                                break;
                            case 6:
                                add6 = new Cucumber();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Cucumber" +
                                " with a price of " + String.format("%.2f", new Cucumber().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 3:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Onion();
                                break;
                            case 2:
                                add2 = new Onion();
                                break;
                            case 3:
                                add3 = new Onion();
                                break;
                            case 4:
                                add4 = new Onion();
                                break;
                            case 5:
                                add5 = new Onion();
                                break;
                            case 6:
                                add6 = new Onion();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Onion" +
                                " with a price of " + String.format("%.2f", new Onion().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 4:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Lettuce();
                                break;
                            case 2:
                                add2 = new Lettuce();
                                break;
                            case 3:
                                add3 = new Lettuce();
                                break;
                            case 4:
                                add4 = new Lettuce();
                                break;
                            case 5:
                                add5 = new Lettuce();
                                break;
                            case 6:
                                add6 = new Lettuce();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Lettuce" +
                                " with a price of " + String.format("%.2f", new Lettuce().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 5:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Maize();
                                break;
                            case 2:
                                add2 = new Maize();
                                break;
                            case 3:
                                add3 = new Maize();
                                break;
                            case 4:
                                add4 = new Maize();
                                break;
                            case 5:
                                add5 = new Maize();
                                break;
                            case 6:
                                add6 = new Maize();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Maize" +
                                " with a price of " + String.format("%.2f", new Maize().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 6:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Jalapeno();
                                break;
                            case 2:
                                add2 = new Jalapeno();
                                break;
                            case 3:
                                add3 = new Jalapeno();
                                break;
                            case 4:
                                add4 = new Jalapeno();
                                break;
                            case 5:
                                add5 = new Jalapeno();
                                break;
                            case 6:
                                add6 = new Jalapeno();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Jalapeno" +
                                " with a price of " + String.format("%.2f", new Jalapeno().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 7:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Cheese();
                                break;
                            case 2:
                                add2 = new Cheese();
                                break;
                            case 3:
                                add3 = new Cheese();
                                break;
                            case 4:
                                add4 = new Cheese();
                                break;
                            case 5:
                                add5 = new Cheese();
                                break;
                            case 6:
                                add6 = new Cheese();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Cheese" +
                                " with a price of " + String.format("%.2f", new Cheese().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 8:
                        switch (numberAdd) {
                            case 1:
                                add1 = new DoubleMeat(meat);
                                break;
                            case 2:
                                add2 = new DoubleMeat(meat);
                                break;
                            case 3:
                                add3 = new DoubleMeat(meat);
                                break;
                            case 4:
                                add4 = new DoubleMeat(meat);
                                break;
                            case 5:
                                add5 = new DoubleMeat(meat);
                                break;
                            case 6:
                                add6 = new DoubleMeat(meat);
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Double meat" +
                                " with a price of " + String.format("%.2f", new DoubleMeat(meat).getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 9:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Carrot();
                                break;
                            case 2:
                                add2 = new Carrot();
                                break;
                            case 3:
                                add3 = new Carrot();
                                break;
                            case 4:
                                add4 = new Carrot();
                                break;
                            case 5:
                                add5 = new Carrot();
                                break;
                            case 6:
                                add6 = new Cabbage();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Carrot" +
                                " with a price of " + String.format("%.2f", new Carrot().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 10:
                        switch (numberAdd) {
                            case 1:
                                add1 = new Cabbage();
                                break;
                            case 2:
                                add2 = new Cabbage();
                                break;
                            case 3:
                                add3 = new Cabbage();
                                break;
                            case 4:
                                add4 = new Cabbage();
                                break;
                            case 5:
                                add5 = new Cabbage();
                                break;
                            case 6:
                                add6 = new Cabbage();
                                break;
                        }
                        System.out.println("You've picked addition #" + numberAdd + " - Cabbage" +
                                " with a price of " + String.format("%.2f", new Cabbage().getPrice()) + "$");
                        numberAdd++;
                        break;
                    case 11:
                        burger = new Burger(bread, meat, add1, add2, add3, add4);
                        System.out.println("The price of your current selection is: " + String.format("%.2f", burger.getBreadAndMeatPrice())
                                + "$ for the bread and meat and " + String.format("%.2f", burger.getAdditionsPrice()) + "$ for the additions, " +
                                "total - " + String.format("%.2f", burger.getTotalPrice()) + "$");
                        break;
                    case 12:
                        numberAdd = 10;
                        break;


                }
            }
            if (burgerType==2) {                                                                        // Compiling a Healthy burger contents and price
                burger = new HealthyBurger(meat,add1,add2,add3,add4,add5,add6);
                System.out.println("Your final selection is: Healthy burger with brown rye bread and " +
                        meat.getName() + " type of meat and with the following additions:\n" + add1.getName() +
                        "\n" + add2.getName() + "\n" + add3.getName() + "\n" + add4.getName() + "\n" +
                        add5.getName() + "\n" + add6.getName() + "\n" + "The price of your selection is: " + String.format("%.2f", burger.getBreadAndMeatPrice())
                        + "$ for the bread and the meat, and " + String.format("%.2f", burger.getAdditionsPrice()) + "$ for the additions. Total price: " +
                        String.format("%.2f", burger.getTotalPrice()) + "$");
            } else {
                burger = new Burger(bread, meat, add1, add2, add3, add4);                               // Compliling a Normal burger contents and price
                System.out.println("Your final selection is: Normal burger with " + bread.getName() + " and " +
                        meat.getName() + " type of meat and with the following additions:\n" + add1.getName() +
                        "\n" + add2.getName() + "\n" + add3.getName() + "\n" + add4.getName() + "\n" +
                        "The price of your selection is: " + String.format("%.2f", burger.getBreadAndMeatPrice()) +
                        "$ for the bread and the meat, and " + String.format("%.2f", burger.getAdditionsPrice()) +
                        "$ for the additions. Total price: " + String.format("%.2f", burger.getTotalPrice()) + "$");
            }
        }
    }



    public static int selection (int start, int end) {                      // A method used for selecting an option from a given menu.
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                if (x >= start && x <= end) {
                    return x;
                } else {
                    System.out.println("Invalid choice");
                    if (scanner.hasNextLine()) {
                        scanner.nextLine();
                    }
                }
            } else {
                System.out.println("Invalid choice");
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }

            }
        }
    }
}
