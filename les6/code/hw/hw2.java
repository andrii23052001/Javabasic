package hw;


import java.util.Scanner;

/*Задача 2. Пользователь с клавиатуры вводит число от 1 до 12,
        программа сообщает,
        какому времени года принадлежит введенный месяц.*/
public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12:");

        int monthNumber = scanner.nextInt();

        String[] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println(months[monthNumber -1]);
        } else {
            System.out.println("Неверное число. Введите число от 1 до 12.");
        }
    }
}