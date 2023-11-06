package hw;

/*
Задача 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
        если базовая зарплата 500$.
        За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка
        100%, за 15 лет работы надбавка 150%.
        Сколько лет проработал работник вводится с клавиатуры.
*/

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите количество лет : ");
        int years= scanner.nextInt();
    int basic = 500;
    double bonus3Years= 1.1;
    double bonus5Years= 1.5;
    int bonus10Years=2;
    double bonus15Years=2.5;

    if (years >=3 && years <5){
            System.out.println( "ИТОГОВАЯ ЗП С НАДБАВКОЙ ЗА 3 года" + basic * bonus3Years);
        }
    if (years >= 5 && years <10){
            System.out.println("ИТОГОВАЯ ЗП С НАДБАВКОЙ ЗА5 лет " + basic * bonus5Years);
        }
        if  (years >= 10 && years <15){
            System.out.println("ИТОГОВАЯ ЗП С НАДБАВКОЙ ЗА 10 лет " + basic * bonus10Years);
        }
        if  (years >= 15 ){
            System.out.println("ИТОГОВАЯ ЗП С НАДБАВКОЙ ЗА 15 лет " + basic * bonus15Years);
        }

}
}