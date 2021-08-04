package com.aroo.design.decorator;

public class CaffeMocha extends Espresso{
    public CaffeMocha() {
        super();
        desc = "카페모카";
    }

    @Override
    int cost() {
        return 3500;
    }
}
