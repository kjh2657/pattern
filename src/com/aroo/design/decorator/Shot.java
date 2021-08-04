package com.aroo.design.decorator;

public class Shot extends OptionDecorator{

    Espresso espresso;

    public Shot(Espresso espresso) {
        super();
        this.espresso = espresso;
    }

    @Override
    public String getDesc(){
        return espresso.getDesc() + " 샷 추가";
    }

    @Override
    int cost() {
        return espresso.cost() + 1000;
    }
}
