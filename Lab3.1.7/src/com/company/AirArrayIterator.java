package com.company;

import java.util.Iterator;

public class AirArrayIterator<E> implements Iterator<E> {
    private int index = 0;
    E[] values;

    public AirArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
