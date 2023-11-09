package hw2;

import java.util.Iterator;

public class Fibinacci2 implements Iterable<Integer>{
    private int quantity;

    public Fibinacci2(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator2(quantity);
    }
}
