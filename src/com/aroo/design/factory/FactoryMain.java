package com.aroo.design.factory;

import static com.aroo.design.factory.BeverageType.*;

public class FactoryMain {
    public static void main(String[] args) {

        Factory factory = new BeverageFactory();

        Beverage coffee = factory.create(COFFEE);
        Beverage tea = factory.create(TEA);
        Beverage beer = factory.create(BEER);

        coffee.makeBeverage();
        tea.makeBeverage();
        beer.makeBeverage();

    }
}
