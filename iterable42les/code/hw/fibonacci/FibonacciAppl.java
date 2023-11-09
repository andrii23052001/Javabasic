package hw.fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {


    Fibonacci fibonacci = new Fibonacci(32);

    int count = 0;
    int sum = 0;

        System.out.print("Первые 8 чисел в последовательности Фибоначчи: ");
        for (int number : fibonacci) {
        System.out.print(number + ", ");
        sum += number;
        count++;

        if (count >= 8) {
            break;
        }
    }

        if (sum > 0) {
        System.out.println("\nСумма первых 8 чисел в последовательности Фибоначчи: " + sum);
    }
}
}
