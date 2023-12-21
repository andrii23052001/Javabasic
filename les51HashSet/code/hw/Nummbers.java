package hw;


import java.util.HashSet;
import java.util.Scanner;

/*Задача 2. Написать программу, которая:

        прочитает с клавиатуры количество вводимых чисел,
        прочитает с клавиатуры сами числа и соберёт их в множество,
        удалить из множества числа большие 10 и выведет полученные результаты на экран. Все числа, которые подаются на вход программы, целые.*/
public class Nummbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел");
        int pcsOfnum = scanner.nextInt();

        HashSet<Integer> allnumbers = new HashSet<>();

        for (int i = 0; i < pcsOfnum; i++) {
            System.out.println("Введите число : ");
            int numbers = scanner.nextInt();
            allnumbers.add(numbers);
        }
        for (Integer n : allnumbers) {
            if (n <=10) {
                System.out.print(n + "|");
            }
        }

        scanner.close();
    }
}