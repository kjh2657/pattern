package com.aroo.design.decorator;

public class DecoMain {

    public static void main(String[] args) {

        Espresso coffee1 = new Americano();
        coffee1 = new Shot(coffee1);
        coffee1 = new Syrup(coffee1);

        System.out.println("cost = " + coffee1.cost());
        System.out.println("desc = " + coffee1.getDesc());
        System.out.println();
        Espresso coffee2 = new Cream(new Syrup(new CaffeLatte()));

        System.out.println("cost = " + coffee2.cost());
        System.out.println("desc = " + coffee2.getDesc());
        System.out.println();
        Espresso coffee3 = new Cream(new Syrup( new Shot(new CaffeMocha())));

        System.out.println("cost = " + coffee3.cost());
        System.out.println("desc = " + coffee3.getDesc());
        System.out.println();
    }
}
