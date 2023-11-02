package practice;
//Запрограммировать бот, который помогает выбрасывать мусор в баки разных цветов:

import java.util.Scanner;

//   упаковки в желтый бак
      //  пищевые отходы в коричневый бак
      //  бумага в зеленый бак
       // прочие отходы в черный бак

public class Garbage {
    // ввод наз мусора - строкой может быть много значений
    //желтый бак должен принять упаковки пластик пакеты
    //черный бак должен принять отходы мусор
    // синий бак бумага
         public static void main(String[] args) {
             Scanner scanner= new Scanner(System.in);
             System.out.println("Input type of garbage: ");
             System.out.println("pakage,plastic,bag,waste,paper,cartoon");
             String garbage= scanner.next();
             if (garbage.equals("package")|garbage.equals("plastic")  | garbage.equals("bag")){ // == не применяеться для string
                 System.out.println("Put it inti yellow box");                                          // equals == как равно равно
             } else if (garbage.equals("rest")| garbage.equals("waste")) {
                 System.out.println("Put it into black box");
             } else {
                 System.out.println("Put it into blue box");
             }

         }
     }