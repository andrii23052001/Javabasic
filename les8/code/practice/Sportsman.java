package practice;

//Задача 3. В первый день спортсмен пробежал s километров,
  //      а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
    //    Определите номер того дня, на который пробег спортсмена составит не менее target километров.
      //  Программа получает на вход действительные числа s и target и
        //должна вывести одно натуральное число.
public class Sportsman {
    public static void main(String[] args) {
        double start=1;
        int days=0;// счетчик
        int target=50;
        while (start<=target){
            start=start+start*0.1;
            days++;
            System.out.println(start + " количество км. День " + days );
        }
        System.out.println("Цель достигнута за " + days);
    }
}
