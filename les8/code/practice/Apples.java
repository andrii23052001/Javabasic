package practice;
// Задача 1. Задача о яблоках (начальное значение 30 яблок).
// Запустить цикл, в котором яблоки берутся из корзины до тех пор, пока они там есть.
// Последнее сообщение: "Яблоки кончились!".
public class Apples {
    public static void main(String[] args) {
     int apples=30;//стартовые значения
     int counter=0;// счетчик
     int applesInCycle=apples; // параметр
        while (applesInCycle>0){
            // тело цикла
            System.out.println("Take one apple from basket");
            applesInCycle=applesInCycle -1; // изменяем параметр цикла
            //applesInCycle--;
            counter++;// количество выполненых операций
            System.out.println("The rest of apples "+ applesInCycle);
        }
        System.out.println(" THE JOB IS DONE,TOTAL APPLES  "  + counter +   " added in pei " + apples + " in basket " );
    }
}
