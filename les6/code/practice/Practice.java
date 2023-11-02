package practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int a=123;
        int b= -745;
        Scanner scanner=new Scanner(System.in);// включаем считывание с клавиатуры
        System.out.println("input 1st number");// приглашение пользователю для ввода числа
        int number1 = scanner.nextInt(); // получение числа с клавиатуры

        System.out.println("input 2nd number");// приглашение пользователю для ввода числа
        int number2 = scanner.nextInt(); // получение числа с клавиатуры
        int isMin =(a<b)? a:b;

        int isMin2 =(number1<number2)? number1:number2;
        System.out.println("Minimum =" + isMin);

        System.out.println("Minimum =" + isMin2);
    }
}
