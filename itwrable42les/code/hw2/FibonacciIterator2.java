package hw2;

import java.util.Iterator;

public class FibonacciIterator2 implements Iterator<Integer> {
    private int current = 0;
    private int next = 1;
    private int count = 0;
    private int quantity;

    public FibonacciIterator2(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean hasNext() {
        return count < quantity;
    }

    @Override
    public Integer next() {
        int nextFib = current + next;
        current = next;
        next = nextFib;
        count++;
        return current;
    }
}