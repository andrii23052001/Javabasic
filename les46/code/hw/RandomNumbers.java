package hw;

import java.util.*;

/*Задача 5.(*) Заполните структуру типа ArrayList 20-ю случайными целыми числами в
        интервале от 1 до 10. Удалите из полученного списка дубликаты.
       */
public class RandomNumbers {
    public static void main(String[] args) {

        List<Integer> randomNumbersList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(1,10) ;
            randomNumbersList.add(randomNumber);
        }

        System.out.println("Исходный список: " + randomNumbersList);

        // Используем HashSet для удаления дубликатов
        Set<Integer> NumbersSet = new HashSet<>(randomNumbersList);

        // Обновляем ArrayList без дубликатов
        randomNumbersList.clear();// удаляем все элемент из списка
        randomNumbersList.addAll(NumbersSet); //добавляем только уже без дупликатов , мы удалили их с помощью хэш сета

        System.out.println("Список без дубликатов: " + randomNumbersList);
    }
}