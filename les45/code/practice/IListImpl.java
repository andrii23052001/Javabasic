package practice;

import java.util.Iterator;

public class IListImpl implements IList {

    //fields
    private Object[] elements;//массив для списка обьектов
    private int size;// его размер

    // конструктор
    public IListImpl(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal capacity =" + initialCapacity);//выбросили исключения
        }
        elements = new Object[initialCapacity];
    }

    public IListImpl() {
        this(10);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean add(Object element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity() {
        if (size == Integer.MAX_VALUE) ;
        throw new OutOfMemoryError();// большего по размеру массива создавать не можем
    }

    int newCapacity = elements.length + elements.length / 2;//вырастили длину массива в 1.5 раза

    @Override
    public boolean add(int index, Object element) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
