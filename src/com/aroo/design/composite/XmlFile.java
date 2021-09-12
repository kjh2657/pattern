package com.aroo.design.composite;

public class XmlFile extends Node{
    private int size;

    public XmlFile(String name , int size) {
        super(name);
        this.size = size;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("XmlFile = " + getName());
    }
}
