package com.aroo.design.factory;

public class BeverageFactory implements Factory{
    @Override
    public Beverage create(BeverageType type) {
        switch (type){
            case COFFEE :
                return new Coffee();
            case TEA:
                return new Tea();
            case BEER:
                return new Beer();
            default:
                throw new RuntimeException("not supported");
        }
    }
}
