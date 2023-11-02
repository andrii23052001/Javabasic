package practice;
//Задание 2. Распечатать в консоли таблицу умножения от 1 до 10.
public class Multiplay {
    public static void main(String[] args) {
        int n =1; // первое число
        int m=1; // второе число

        while (n<=10){
            while (m<=10){
                System.out.println( n + "*" + m +" =" + n * m +" |" );
                m++;

            }
            System.out.println(); // переход на след строку
            m=1;// сброс m на начальное значение
            n++; // увеличиваем n на 1
        }
    }
}
