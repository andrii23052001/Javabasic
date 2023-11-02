package homeword;

import java.util.Scanner;

//Определение времени суток. Напишите программу, которая принимает текущий час (от 0 до 23)
  //      и выводит приветствие
    //    в зависимости от времени суток (утро, день, вечер, ночь).
public class Vremasytok {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){ // // Бесконечный цикл
        System.out.println(" Введите время суток от 0 до 23 : ");
        int time= scanner.nextInt();
            if (time == -1) {
                System.out.println("Выход из программы.");
                break; // Выход из цикла - окончание программы при вводе -1
            }

        switch (time){
            case 0 , 1 , 3  : System.out.println("Доброй ночи");
            break;
            case 4,5,6,7,8,9,10,11 : System.out.println("Доброе утро зай");
                break;
            case 12,13,14,15,16 : System.out.println(" Добрый день конфетка ");
                break;
            case 17,18,19,20,21,22,23 : System.out.println("Добрый вечер гений");
                break;
            default:
                System.out.println(" Не верное значение ! ");

        }

    }
    }
}
