package practice;
/* Написать программу, определяющую, является ли год високосным.
        Для того чтобы год был високосным, он должен: делится без остатка на 4 и,
        либо не должен делится без остатка на 100
        , либо если он делится на 100, то он должен делится также
        на 400.Проверить на годах 1700, 1800, 1900 -
       не високосные, а 2000 високосный*/

public class HomewordGOD {
    public static void main(String[] args) {

    int year=2000;// обьявление года
    int condition4 = year%4;// должен делиться без остатка на 4 (condition4==0)
    int condition100 = year%100;//не должен делится без остатка на 100(condition100>0)
    int condition400 = year%400; // либо если он делится без остатка на 100,
    // то он должен делится также
  //  на 400 (condition 100==0 & condition400==0)
     if(condition4 == 0& condition100 != 0^(condition100 == 0 &condition400==0)) {
        System.out.println("Год"+ year +" высокосный");
     } else System.out.println ("Год" + year + "не высокосный!");
}
}