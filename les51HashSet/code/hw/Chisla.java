package hw;

import java.util.HashSet;
import java.util.Random;

/*Задача 4. (*) Даны два списка неуникальных целых чисел или слов. Посчитайте, сколько
        уникальных элементов содержится одновременно, как в первом, так и во втором списке.*/
public class Chisla {
    public static void main(String[] args) {

        Random random = new Random();

        int [] num = new  int [500];

        HashSet<Integer> numbers= new HashSet<>();
        for (int i = 0; i <num.length; i++) {
            num [i]= random.nextInt(1,26);
            numbers.add(num[i]);
        }
        System.out.println(numbers);

    }
}
