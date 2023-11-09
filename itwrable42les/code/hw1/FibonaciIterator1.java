package hw1;

import java.util.Iterator;

public class FibonaciIterator1 implements Iterator<Integer> {
    private int current = 1;
    private int next = 1;

    private  int count = 0;

    private int quantity;

    public FibonaciIterator1(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean hasNext() {
        return count<quantity;
    }

    @Override
    public Integer next() {
        int result = current;
        int temp = current + next;
        current=next;
        next=temp;
        count++;
    return result;
    }

}
