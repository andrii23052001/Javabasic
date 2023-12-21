package hw;

/*Задача 2. Написать программу, которая:

        прочитает с клавиатуры количество вводимых чисел,
        прочитает с клавиатуры сами числа и соберёт их в множество,
        удалить из множества числа большие 10 и выведет полученные результаты на экран. Все числа, которые подаются на вход программы, целые.*/

import java.util.HashSet;
import java.util.Scanner;

public class Numbers1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во чисел: ");
        int pcsOfNum = scanner.nextInt();

        HashSet<Integer> allNumbers = new HashSet<>();

        for (int i = 0; i < pcsOfNum; i++) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            allNumbers.add(number);
        }

        System.out.println("Числа множества:");
        for (Integer n : allNumbers) {
            System.out.println(n);
        }

        System.out.println("Числа меньше 10:");
        for (Integer n : allNumbers) {
            if (n < 10) {
                System.out.print(n + "|");
            }
        }

        System.out.println("\nКоличество чисел в множестве: " + allNumbers.size());

        scanner.close();
    }
}
