package array;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
       int[]arr= new int[100];

        Random random = new Random();
        int randomNum = random.nextInt(100)+1 ; // Генерируем случайное число от 1 до 100

        // Задумываем случайную позицию для добавления числа
        int randomPosition = random.nextInt(arr.length);

        // Добавляем случайное число в массив на случайную позицию
        arr[randomPosition] = randomNum;

        // Ищем дубликат
        int duplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == randomNum && i != randomPosition) {
                duplicate = randomNum;
                break;
            }
        }

        System.out.println("Добавленное случайное число: " + randomNum);
        System.out.println("Позиция добавления: " + randomPosition);
        if (duplicate != 0) {
            System.out.println("Найденный дубликат: " + duplicate);
        } else {
            System.out.println("Дубликат не найден.");
        }
    }
}





