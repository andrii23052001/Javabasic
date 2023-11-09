package hw2;

import java.util.Iterator;

public class FibonacciIteratorAppl2 {
    public static void main(String[] args) {


    Fibinacci2 fibonacci =new Fibinacci2(8);


        System.out.print("Первые 8 чисел в последовательности Фибоначчи: ");


    Iterator<Integer> iterator = fibonacci.iterator();
        int sum = 0;
        while (iterator.hasNext()) {
        int number = iterator.next();
        System.out.print(number + " ");
        sum += number;
    }
        System.out.println("!");
        if (sum > 0) {
        System.out.println("\nСумма первых 8 чисел в последовательности Фибоначчи: " + sum);
    }
}
}
/*sum - это переменная, которая предназначена для хранения суммы чисел Фибоначчи.
        number - это текущее число в последовательности Фибоначчи, которое было сгенерировано итератором.
        Строка sum += number; означает "прибавить значение number к текущему значению sum*/
