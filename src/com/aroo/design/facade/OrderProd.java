package com.aroo.design.facade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProd {

    private Product product;
    private Order order;
    private Delivery delivery;
    private int orderQty;

    public OrderProd(Product product, int orderQty, String address) {
        this.product = product;
        this.order = new Order();
        this.delivery = new Delivery(address);
        this.orderQty = orderQty;
    }

    public void orderAllProcess(){
        if(product.isEnable(orderQty)){
            product.moveStock(orderQty);
        } else{
            throw new RuntimeException("no enough stock");
        }

        order.order(product);

        delivery.deliveryProd(product);
    }
}
