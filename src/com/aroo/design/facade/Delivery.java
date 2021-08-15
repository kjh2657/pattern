package com.aroo.design.facade;


import lombok.Data;

@Data
public class Delivery {

    private String address;
    private String phone;

    public Delivery(String address) {
        this.address = address;
    }

    public void deliveryProd(Product product){

        System.out.println("delivery product = " + product.getName() + "(" + product.getQty() + ")  to " + address);
    }
}
