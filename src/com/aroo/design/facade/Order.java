package com.aroo.design.facade;

public class Order {


    public void order(Product product){

        System.out.println("Order PROD  : " + product.getName() + "  qty : " + product.getQty());

    }

}
