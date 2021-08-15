package com.aroo.design.facade;

public class FacadeMain {
    public static void main(String[] args) {

        Product ice = new Product("ice", 1);
        Product water = new Product("water", 0);

        OrderProd orderIce = new OrderProd(ice, 1, "suwon");

        orderIce.orderAllProcess();

        OrderProd orderWater = new OrderProd(water, 1, "seoul");
        orderWater.orderAllProcess();

    }
}
