package com.aroo.design.iterator;

import java.util.Iterator;

public class ToyMain {
    public static void main(String[] args) {

        Toy doll = new Toy("doll", "cute", 1000);
        Toy ball = new Toy("ball", "fast", 2000);
        Toy vegitable = new Toy("vegitable", "no taste", 1500);
        Toy sweety = new Toy("sweety", "circular", 3000);
        Toy dong = new Toy("dong", "dirty", 500);

        ToyBox arooToyBox = new ArooToyBox();
        ToyBox attiToyBox = new AttiToyBox();

        arooToyBox.addToy(doll);
        arooToyBox.addToy(ball);
        arooToyBox.addToy(vegitable);

        attiToyBox.addToy(vegitable);
        attiToyBox.addToy(dong);
        attiToyBox.addToy(sweety);

        Iterator<Toy> arooIter = arooToyBox.createIterator();
        Iterator<Toy> attiIter = attiToyBox.createIterator();

        while(arooIter.hasNext()){
            System.out.println(arooIter.next().toString());
        }

        System.out.println();

        while(attiIter.hasNext()){
            System.out.println(attiIter.next().toString());
        }
    }
}
