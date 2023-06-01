package org.example;

import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;

    public Randoms() {
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new RandomIterator<Integer>();
    }

    private class RandomIterator<Integer> implements Iterator {
        int x = new Randoms().random.nextInt(90, 101);

        @Override
        public boolean hasNext() {
            return x < 100;
        }


        @Override
        public Object next() {
            return x;
        }
    }
}