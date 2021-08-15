package com.aroo.design.factory;

public class Coffee implements Beverage{
    @Override
    public void makeBeverage() {
        System.out.println("make Coffee");
    }
}
