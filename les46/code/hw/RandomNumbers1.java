package hw;

/*Задача 5.(*) Заполните структуру типа ArrayList 20-ю случайными целыми числами в
        интервале от 1 до 10. Удалите из полученного списка дубликаты.
       */

import java.util.*;

public class RandomNumbers1{
    public static void main(String[] args) {
        List<Integer> randomNumbersList=new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomnumbers = random.nextInt(1,10);
            randomNumbersList.add(randomnumbers);
        }
        System.out.println(randomNumbersList);
     //удаление дубликатов ИСПОЛЬЗУЕМ СЕТ
        Set<Integer> updateNumbers= new HashSet<>(randomNumbersList);

        randomNumbersList.clear();
        randomNumbersList.addAll(updateNumbers);
        System.out.println(updateNumbers);

    }




}
