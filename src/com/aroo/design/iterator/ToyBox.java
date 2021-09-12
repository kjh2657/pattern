package com.aroo.design.iterator;

import java.util.Iterator;

public interface ToyBox {
    Iterator<Toy> createIterator();
    Toy addToy(Toy toy);
}
