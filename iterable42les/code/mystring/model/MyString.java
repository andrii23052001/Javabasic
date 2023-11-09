package mystring.model;

import java.util.Iterator;

public class MyString implements Iterable <Character>  {
    // поля
    private StringBuilder str;//встроенный Java класс

    public MyString(StringBuilder str) {
        this.str = new StringBuilder(str);
    }

    public StringBuilder getStr() {
        return str;
    }

    public void setStr(StringBuilder str) {
        this.str = str;
    }
    //добавление символов

    public void addChar(char ch){
        str.append(ch);
    }
    //метод удаления символа
    public  void  removeChar(char ch){
        int index=str.indexOf(Character.toString(ch));//нашли индекс на котором стоит ср
        str.deleteCharAt(index);//удалили
    }

    @Override
    public String toString() {
        return str.toString();
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyStringIterator(str);
    }
}
