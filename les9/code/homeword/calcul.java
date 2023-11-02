package homeword;

import java.util.Scanner;

public class calcul {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ВВЕДИТЕ ПЕРВОЕ ЧИСЛО");
        int a=scanner.nextInt();

        System.out.println("ВВЕДИТЕ ВТОРОЕ ЧИСЛО");
        int b= scanner.nextInt();
        System.out.println("1+,2-,3*,4/");
        int vubor=scanner.nextInt();

        if (vubor==1){
            int res=a+b;
            System.out.println("Результат" + res);

        }  if (vubor==2) {
            int res = a - b;
            System.out.println("Результат" + res);

        }if (vubor==3){
            int res=a*b;
            System.out.println("Результат" + res);

        } if (vubor==4){
            int res=a/b;
            System.out.println("Результат" + res);
        }
    }
    }
