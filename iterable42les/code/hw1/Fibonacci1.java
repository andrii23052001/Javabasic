package hw1;

import java.util.Iterator;

public class Fibonacci1 implements  Iterable <Integer>{

    private int quantity;

    public Fibonacci1(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonaciIterator1(quantity);
    }
}
