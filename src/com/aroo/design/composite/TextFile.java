package com.aroo.design.composite;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TextFile extends Node{

    private int size;

    public TextFile(String name , int size) {
        super(name);
        this.size = size;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("TextFile = " + getName());
    }
}
