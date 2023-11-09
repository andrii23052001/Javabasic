package mystring.model;

import java.util.Iterator;

public class MyStringIterator implements Iterator<Character> {
    //поля
    private StringBuilder str;

    private int size;

    private int currPosition;
    // конструктор


    public MyStringIterator(StringBuilder str) {
        this.str = str;
        this.size = str.length();
        //this.currPosition = currPosition;
    }
    // проверка есть ли следующий элемент
    @Override
    public boolean hasNext() {
        return currPosition<size; //это логическое выражение, true еще есть элементы множества
    }
    //этот метод должнен найти элемент множества
    @Override
    public Character next() {
        Character curCharacter= str.charAt(currPosition);
        currPosition++;
        return curCharacter;
    }
    //метод для удаления элемента строки
    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }
}
