package hw;

import java.util.HashSet;
import java.util.Scanner;

/*Задача 1. Написать программу, которая:

        прочитает с клавиатуры количество вводимых названий земель в Германии,
        прочитает с клавиатуры названия земель и соберёт их в множество,
        выведет полученные результаты на экран.*/
public class GermanCities {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of local states!: ");
        //сделали прием от пользователя

        int pcsOfgermanystates = scanner.nextInt();
        //сделали переменную что бы принять определенное кол-во городов
        HashSet<String> germanystates =new HashSet<>(); //тут будут храниться наши уникальные города

        for (int i = 0; i < pcsOfgermanystates; i++) { // в цикле фори пробежались по кол-во городов
            System.out.println("Enter name of states please!: ");
            String states = scanner.next();//после того как прошлись по кол-ву, делаем Стринг сканер для того что бы  принять и сохранить города
            germanystates.add(states); // добавляем в наш хєш сет наши города которые мы получили
        }
        for (String s:
             germanystates) {
            System.out.println(s); // прошлись по хешсету  в который мы сохранили города и распечатали их
        }
        System.out.println("Pcs of states : "+ germanystates.size() ); // узнали кол-во городов

        //Везде где я написал города в коментах там земли, мне лень исправлять
    }
}