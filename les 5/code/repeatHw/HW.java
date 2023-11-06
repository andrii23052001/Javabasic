package repeatHw;
/*Задача 1. Задать в программе три стороны треугольника.
        Проверить выполнимость неравенства треугольника
        - любая из сторон должна быть меньше суммы двух других
        . Сообщить результат - существует или нет треугольник с заданными сторонами.

        Задача 2. Сделайте расчет покупки товаров со скидками.
        Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%. Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
        Вычислите итоговую стоимость покупки и величину полученной скидки.

        Задача 3(*). Написать программу, определяющую,
        является ли год високосным. Для того чтобы год был високосным,
        он должен: делится без остатка на 4 и, либо не должен делится без остатка на
        100, либо если он делится на 100, то он должен делится также на 400.
        Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.*/
public class HW {
    public static void main(String[] args) {
        int a=1;
        int b =2;
        int c=3;

        if (a>b+c && b>a+c && c> b+a){
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }

}
