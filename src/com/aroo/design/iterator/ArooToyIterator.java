package com.aroo.design.iterator;

import java.util.Iterator;

public class ArooToyIterator implements Iterator<Toy> {

    private Toy[] toys;
    int pos = 0;

    public ArooToyIterator(Toy[] toys) {
        this.toys = toys;
    }

    @Override
    public boolean hasNext() {
        if (pos >= toys.length || toys[pos] == null)
            return false;
        else
            return true;
    }

    @Override
    public Toy next() {
        Toy toy = toys[pos];
        pos++;
        return toy;
    }
}
