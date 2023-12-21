package numbers_stream;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class RandomStream {
    private static final int N_NUMBER = 6;
    private static final int MIN = -10;
    private static final int MAX = 10;

    public static void main(String[] args) {
        // Получаем поток случайных чисел
        Stream<Integer> numbers = getRandomNumbers(N_NUMBER, MIN, MAX);

        // Выводим числа в одной строке
        System.out.println("Generated numbers:");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println("\n================================================");

        // Получаем новый поток случайных чисел
        Stream<Integer> numbers1 = getRandomNumbers(N_NUMBER, MIN, MAX);

        // Выводим числа с меткой "Random number" и разделителем "|"
        System.out.print("Generated numbers with label and separator: ");
        numbers1.forEach(s -> System.out.print("Random number " + s + " | "));
        System.out.println("\n================================================");

        // Получаем поток случайных чисел целочисленного типа (IntStream)
        long positiveCount = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))  // Печать чисел перед фильтрацией
                .filter(n -> n > 0)  // Фильтрация положительных чисел
                .count();  // Подсчет положительных чисел
        System.out.println("\nPositive numbers count: " + positiveCount);

        int sumOddNumbers=getRandomNumbers(N_NUMBER,MIN,MAX)
                .peek(n-> System.out.print(n+ " | "))
                .filter(n->n%2!=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\nSum of odd numbers from stream"+sumOddNumbers);
        //найдите максимальное число, минимальное число
        // Находим и выводим максимальное число
        int maxNumber = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | ")) // Промежуточная операция
                .max(Comparator.naturalOrder())
                .orElseThrow(); // Вы можете использовать другой метод обработки, если не хотите использовать исключение
        System.out.println("\nMaximum number from stream: " + maxNumber);
        // END OF MAIN
    }

    private static Stream<Integer> getRandomNumbers(int nNumber, int min, int max) {
        // Генерация потока случайных чисел в диапазоне [min, max)
        return new Random().ints(min, max).limit(nNumber).boxed();
    }
    // END OF CLASS
}