package practice.todoappl.try_cath;

import java.util.Scanner;

public class TryCathAppl {
    public static void main(String[] args) {
      /*  try {
            Scanner scanner= new Scanner(System.in);
            System.out.println("input first number");
            int a= scanner.nextInt();
            System.out.println("Input second number ");
            int b = scanner.nextInt();
            int division = a/b;
            System.out.println("Division " +a + " / " + b + " = " +division);
        }catch (Exception e){
            System.out.println( e.getMessage());// cause = prichina perevod
        }*/

        int[]arr={73,-17,99,26,-45,34,-83};

        int l =arr.length;

        System.out.println(l);
        try {
            arr[9] = 157;
        }catch (Exception e){
            System.out.println(e.getMessage() + " , " + e.toString());
        }
        // 3. Проверка ввода пользователя на корректность
        Scanner scanner= new Scanner(System.in);
        try {

            System.out.println("Input number ");
            int n = scanner.nextInt();
            System.out.println(" Your input " + n);
        }catch (Exception e){
            System.out.println(e.toString()+ ", " + e.getMessage()+ " , " +e.getCause()+ "Wrong input");
        }

    }


}
