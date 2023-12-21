package hw;

import java.util.ArrayList;
import java.util.List;

public class Alphabet1 {
    public static void main(String[] args) {

        List<Character> alphabetlist= new ArrayList<>();
        for (char i = 'A';  i <='Z' ; i++) {
            alphabetlist.add(i);
        }
        System.out.println("Alphabet " + alphabetlist);
    }
}
