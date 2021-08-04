package com.aroo.design.decorator;

public abstract class Espresso {

    String desc = "Aroo Cafe";

    abstract int cost();

    public String getDesc(){
        return desc;
    }
}
