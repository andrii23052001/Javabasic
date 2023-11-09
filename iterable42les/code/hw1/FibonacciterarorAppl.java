package hw1;

import hw.fibonacci.Fibonacci;

import java.util.Iterator;

public class FibonacciterarorAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci =new Fibonacci(8);
        int sum = 0;

        System.out.print("Первые 8 чисел в последовательности Фибоначчи: ");


        Iterator<Integer> iterator = fibonacci.iterator();

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


