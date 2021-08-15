package com.aroo.design.factory;

public class Beer implements Beverage{
    @Override
    public void makeBeverage() {
        System.out.println("make Beer");
    }
}
