package com.aroo.design.decorator;

public class CaffeLatte extends Espresso{

    public CaffeLatte() {
        super();
        desc = "카페라떼";
    }

    @Override
    int cost() {
        return 2500;
    }
}
