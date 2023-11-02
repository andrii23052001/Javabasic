package practice;
//1 Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника -
//любая из сторон должна быть меньше суммы двух других.
//Сообщить результат - существует или нет треугольник с заданными сторонами.
public class HomeWorktreugolnicItry {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=15;

        int ab= a+b;
        int ac= a+c;
        int bc= b+c;

        if (a<ac&&b<ab&&c<bc){
            System.out.println("Такого треугольника нет");
        }
        else System.out.println("Такой треугольник есть");
    }

}
