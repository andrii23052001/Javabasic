package practice.mystring;

import java.util.Iterator;

public class MyStringIterator implements Iterator {
    // поля
    private StringBuilder str;
    private  int size;
    private  int currPosition;

    public MyStringIterator(StringBuilder str) {
        this.str=str;
        this.size=str.length();
    }

    @Override
    public boolean hasNext() {
        return currPosition<size ;//логическое выражание, true= значит еще есть элементы множества
    }
    // этот метод должен вернуть элемент множества
    @Override
    public Character next() {
        Character curCharacter=str.charAt(currPosition);
        currPosition++;
        return curCharacter;
    }
    public void remove(){
        str.deleteCharAt(--currPosition);
        size--;
    }
}
