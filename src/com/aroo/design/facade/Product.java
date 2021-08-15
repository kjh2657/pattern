package com.aroo.design.facade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String name;
    private int qty;

    public Product(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public boolean isEnable(int orderQty){
        return qty >= orderQty;
    }

    public void moveStock(int orderQty){
        System.out.println("move name : " + name);
        System.out.println("move qty : " + orderQty);
    }

}
