package com.aroo.design.composite;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Node {

    private String name;
    public Node(String name) {
        this.name = name;
    }
    public abstract int getSize();
    public abstract void print();
}
