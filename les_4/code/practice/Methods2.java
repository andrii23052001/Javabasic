package practice;

public class Methods2 {
    public static void main(String[] args) {
        int a=41;
        int n=dicBy2(a);
        System.out.println(n);

        int b=83;
        int m=dicBy5(b);
        System.out.println(m);

        int number=23;
        int resultat=sumDigits(number);
        System.out.println(resultat);

    }
    public static int sumDigits(int n){
        //первую цифру
        int c1=n/10;
        // poluchit vtoraua cifra
        int c2=n%10;
        // slojit cifri
        return c1+c2;

    }
    public static int dicBy5(int num){
        return num /5;
    }
    public static int dicBy2(int a) {
        return a%2;
    }
}
