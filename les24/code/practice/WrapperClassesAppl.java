package practice;

public class WrapperClassesAppl {

    public static void main(String[] args) {
        // количество цифр в числе, версия 2 (делим на 10 до получения 0, цикл while)
        Integer x = 987654321; // это обьект типа Integer
        String st = x.toString();  //преобразование строки
        int l = st.length(); // узнали длину строки
        System.out.println(" Number of digits " + x + " = " + l);
        System.out.println(x.MAX_VALUE);

        Double y = 32456.78;
        String st1 = y.toString();
        System.out.println(" Number of digits in " + y + " = " + st1.length());


        // присвоение и вычисления

        int n = 20;
        Integer m = 10;
        System.out.println(" n = " + n);
        System.out.println("m = " + m);

        m = m + n; // произошла автозапаковка и автоупаковка
        System.out.println(" m + n = " + m);

        Double pi = 3.14;
        double circleLenght = 2 * pi * 10;
        System.out.printf("Circle lenght = %.2f", circleLenght);
        System.out.println();

        // константы классов - оберток
        System.out.println("------------Constants of Wrapper Classes ");
        System.out.println(" Integer Max " + Integer.MAX_VALUE);
        System.out.println(" Integer Min " + Integer.MIN_VALUE);

        System.out.println(" Long Max " + Long.MAX_VALUE);
        System.out.println(" Long Min " + Long.MIN_VALUE);
        System.out.println(" Double MAX " + Double.MAX_VALUE);
        System.out.println(" Double MIN " + Double.MIN_VALUE);

        //обработка деления на 0

        System.out.println("-----------Not a number(NaN)----------");

        double a = 20.0 / 0;
        if (Double.isInfinite(a) || Double.isNaN(a)) ;
        System.out.println("Wrong operation or wrong result ");

        // перевод String to number = перевод строки к числу
        System.out.println("Parsing String to number");

        String str="987654321";

        int num = Integer.parseInt(str);
        System.out.println("String = " + str + " = " + num);

      String str1="2.7118281823";

      double exp = Double.parseDouble(str1);
        System.out.println(" Exp = " + exp);


   }
}
