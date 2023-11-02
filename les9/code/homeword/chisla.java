package homeword;

import java.util.Scanner;

//Определение времени суток. Напишите программу, которая принимает текущий час (от 0 до 23)
//      и выводит приветствие
//    в зависимости от времени суток (утро, день, вечер, ночь).
public class chisla {
    public static void main(String[] args) {
      while (true){



              Scanner scanner=new Scanner(System.in);
        System.out.println(" Введите время");
        int time= scanner.nextInt();

          if (time<0 || time>23){

              break;
          }

              switch (time){

            case 0,1,2,3 :
                System.out.println("Good night");
                break;

            case 4,5,6,7,8,9,10,11 :
                System.out.println("Good morning");
                break;
            case 12,13,14,15,16 :
                System.out.println("Good afternoon");
                break;
            case 17,18,19,20,21,22,23 :
                System.out.println("Good evening");




                }

        }
    }
    }


