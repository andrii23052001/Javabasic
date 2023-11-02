package homeword;

import java.util.Scanner;

public class cal1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите первое число");
        int a=scanner.nextInt();

        System.out.println("Введите второе число");
        int b= scanner.nextInt();

        System.out.println("Выбор 1=плюс 2=минус 3=деление 4=умножение");
        int choise=scanner.nextInt();

        if (choise==1){
            int res=a+b;
            System.out.println("Результат " + res);
        } if (choise==2){
            int res=a-b;
            System.out.println("Результат " + res);
        } if (choise==3){
            int res=a/b;
            System.out.println("Результат " + res);
        }if (choise==4){
            int res=a*b;
            System.out.println("Результат " + res);
        }
    }
}
