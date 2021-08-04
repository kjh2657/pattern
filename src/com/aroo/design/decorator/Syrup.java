package com.aroo.design.decorator;

public class Syrup extends OptionDecorator{

    Espresso espresso;


    public Syrup(Espresso espresso) {
        super();
        this.espresso = espresso;
    }

    @Override
    int cost() {
        return espresso.cost() + 1000;
    }

    @Override
    public String getDesc() {
        return espresso.getDesc() + " 시럽추가";
    }
}
