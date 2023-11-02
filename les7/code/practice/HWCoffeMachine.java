package practice;
// Написать программу для "Кофе-машины", которая позволяет пользователю выбрать напиток:

import java.util.Scanner;

//    Эспрессо
      //  Американо
       // Латте
       // Капучино После выбора программа должна сообщить стоимость выбранного напитка.
public class HWCoffeMachine {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Choose a drink\n Espresso: 1 \n Americano : 2 \n Latte : 3 \n Cappuccino : 4 ");

        int drinkselection=scanner.nextInt();
        switch(drinkselection){
            case 1 -> System.out.println("Price:3.5$\nEspresso coffee for real aristocrats");
            case 2-> System.out.println("Price:4$\nYou have a wonderful choice - we will prepare a real Italian Americano for you");
            case 3-> System.out.println("Price:7$\nAriana Grande loves Lattes - so smile and feel the pleasure from every sip of the wonderful drink");
            case 4-> System.out.println("Price:5$\nCappuccino is a standard, you can’t go wrong with your choice, so drink a wonderful cappuccino and be happy");
            default -> System.out.println("My friend, we only have 3 coffee positions, if you want something else, go to Starbucks");
        }
    }
}
