package com.aroo.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AttiToyBox implements ToyBox{

    private List<Toy> toys = new ArrayList<>();


    public Toy addToy(Toy toy){
        toys.add(toy);
        return toy;
    }

    public List<Toy> getToys() {
        return toys;
    }

    @Override
    public Iterator<Toy> createIterator() {
        return toys.iterator();
    }
}
