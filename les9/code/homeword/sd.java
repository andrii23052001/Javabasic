package homeword;

import java.util.Scanner;

//Определение времени суток. Напишите программу, которая принимает текущий час (от 0 до 23)
//      и выводит приветствие
//    в зависимости от времени суток (утро, день, вечер, ночь).
public class sd {
    public static void main(String[] args) {
   while (true){

    Scanner scanner=new Scanner(System.in);
        System.out.println("Введите час суток");

        int time= scanner.nextInt();



        switch (time){
            case 0,1,2,3:
                System.out.println("Доброй ночи");
                break;

            case 4,5,6,7,8,9,10,11:
                System.out.println("Доброе утро ");
                break;


        }  if ( time ==-1) {
           break;

}
}
    }
}