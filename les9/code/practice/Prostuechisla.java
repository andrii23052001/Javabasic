package practice;

import java.util.Scanner;

// Пользователь вводит натуральное число n.
  //      Определите, является ли оно простым. Простое число - это такое число,
    //    которое делится только на себя и на 1.
     //   Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
public class Prostuechisla {
    public static void main(String[] args) {
        // алгоритм
        // любое целое n будем пробовать делить на числа, меньшие его, начиная с 2
        // 10 / 2 =5 - значит не простое число
        // а вот 11 делим на 2.3.4 ....10 не разделилось . ТО число простое
        Scanner scanner=new Scanner(System.in);
        System.out.println("input positive integer number");
        int number= scanner.nextInt();

        boolean isPrime=true;
        // булеан применяется когда только 2 варианта исхода

        int delitel =2;
        while (delitel<number){
            if (number % delitel==0){  // если разделилось число нацело на delitel
                isPrime=false;

            }
            delitel++;


        }
        System.out.println(number + " is prime " +isPrime);
    }
}
