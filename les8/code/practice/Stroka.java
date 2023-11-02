package practice;

import java.util.Scanner;

//Задача 1. Программа получает на вход строку и число повторений этой строки.
    //    Программа должна вывести эту строку нужное количество раз.
public class Stroka {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите текст");
        String str=scanner.nextLine();
        System.out.println("Кол-во повторов");
        int countUP= scanner.nextInt();// получаем с клавиатуры к-во раз
        int counter=0;
        while (counter<countUP){
            System.out.println(str);
            counter++;
        }

        }

}






