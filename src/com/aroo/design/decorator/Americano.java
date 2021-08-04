package com.aroo.design.decorator;

public class Americano extends Espresso{

    public Americano() {
        super();
        desc = "아메리카노";
    }

    @Override
    int cost() {
        return 2000;
    }
}
