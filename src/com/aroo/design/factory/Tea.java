package com.aroo.design.factory;

public class Tea implements Beverage{
    @Override
    public void makeBeverage() {
        System.out.println("make Tea");
    }
}
