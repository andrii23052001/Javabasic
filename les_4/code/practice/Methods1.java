package practice;


public class Methods1 {
    public static void main(String[] args) {
        int a,b; // определили нужные нам переменные
        a=3;
        b=4;
      int c=  hipotenusa(a,b); //квадрат гипотенезы
        System.out.println(c);
   int d= -46;
        int mod = modul(d); //  смена знака числа
        System.out.println(mod);
    }
    public static int modul(int d){
        return -d;
    }

    public static int hipotenusa(int a,int b){
        return a*a + b*b;
    }
     int f= 20;
    int kub=cub(f);


public static int cub(int x){
    return x * x * x;
}

}