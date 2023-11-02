package practice;
//Распечатать в консоли все числа от 1 до 100,
       // которые делятся на 5 без остатка.
public class NumberBy5 {
    public static void main(String[] args) {
        int shetchic=1;
        while (shetchic<=100){
            if(shetchic %5==0){
                System.out.print(shetchic + " | " );
            }
            shetchic++;
        }
    }

}
