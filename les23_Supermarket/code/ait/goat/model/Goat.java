package ait.goat.model;

public class  Goat {
    private static int count;

    public String name;

    public static int getCount(){
        return count;
    }
    public static void increment(){
        count++;
    }


}
