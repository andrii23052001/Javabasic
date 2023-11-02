package practice;

import java.util.Scanner;

/*Родители позволяют ребенку играть на компьютере 1 час.
        Напишите программу, которая будет реагировать на полученную в школе оценку:

        1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
        2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
        3. "Посредственно.", время для игр уменьшается на 30 мин.
        4. "Плохо!", сегодня никаких игр на компьютере.
        5. "Позор семьи!", никаких игр на компьютере 2 дня. */
public class Practice1 {

    public static void main(String[] args) {
        int timeForGame =60;// skolko razresheno igrat na pk
        Scanner scanner = new Scanner(System.in);// МЫ ВКЛЮЧИЛИ ВВОД ДАННЫХ С КЛАВИАТУРЫ
        System.out.println("input today's mark"); // приглашение ко вводу
        int mark = scanner.nextInt();// получение оценки с клавиатуры

        switch (mark){
            case 1: {
                System.out.println("Good child");// похвалили
                timeForGame = timeForGame + 30;// увеличили время
                System.out.println("Time for game " + timeForGame+"" );
                break;
            }
            case 2 : {
                System.out.println("Very good");
                break;
            }
            case 3:{
                System.out.println("No so good");
                timeForGame=timeForGame-30;
                System.out.println("Time for game" + timeForGame );
                break;
            }
            case 4:{
                System.out.println("VERY BAD");
//                timeForGame=0;
                break;
            }
            case 5 : {
                System.out.println("Shame you");
                System.out.println("No games for 2 days!!!");
                break;
            }
            default:{
                System.out.println(" Wrong input");
            }
        }
    }
}