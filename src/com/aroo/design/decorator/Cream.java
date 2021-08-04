package com.aroo.design.decorator;

public class Cream extends OptionDecorator{

    Espresso espresso;

    public Cream(Espresso espresso) {
        super();
        this.espresso = espresso;
    }

    @Override
    int cost() {
        return espresso.cost() + 2000;
    }

    @Override
    public String getDesc() {
        return espresso.getDesc() + " 크림 추가";
    }
}
