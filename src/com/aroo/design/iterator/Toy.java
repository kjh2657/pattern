package com.aroo.design.iterator;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Toy {

    private String name;
    private String desc;
    private int price;

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                '}';
    }
}
