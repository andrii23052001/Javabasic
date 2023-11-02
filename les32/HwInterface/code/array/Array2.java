package array;

// Заполняем массив числами от 1 до 100

// Генерируем случайное число от 1 до 100

// Задумываем случайную позицию для добавления числа

// Добавляем случайное число в массив на случайную позицию

// Ищем дубликат


import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;

        }
        Random random=new Random();
        int randomNum= random.nextInt(100);

        int randomPosition=random.nextInt(100);

        arr[randomPosition]=randomNum;
        int duplicate=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==randomNum&& i !=randomPosition){
                duplicate=randomNum;
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

