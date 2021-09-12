package com.aroo.design.iterator;

import java.util.Iterator;

public class ArooToyBox implements ToyBox{

    private int MAX_TOY = 5;

    private Toy[] toys = new Toy[MAX_TOY];
    private int cur = 0;


    public Toy addToy(Toy toy){
        if(cur >= MAX_TOY){
            System.out.println("MAX");
            throw new RuntimeException();
        } else {
            toys[cur] = toy;
            cur++;
        }
        return toy;
    }

    public Toy[] getToys() {
        return toys;
    }

    @Override
    public Iterator<Toy> createIterator() {
        return new ArooToyIterator(toys);
    }
}
