package prime_numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer>numbers= new ArrayList<>(List.of(
                10,11,12,13,14,15,16,17,18,19,20
        ));
        //Отобрать только простые числа из этого списка
        System.out.println("Numbers: ");
        numbers.stream().forEach(n-> System.out.print(n+ " "));//терминальная операция
        System.out.println();

        System.out.println("Получим простые числа :");
        numbers.stream().filter(n->isPrime(n))//фильтр
                .forEach(n-> System.out.print(n+ " "));
        System.out.println();
        //другой способ
        System.out.println("Получим простые числа 2 способ :");
        numbers.stream()
                .filter(PrimeNumbers::isPrime) // Фильтр для простых чисел
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }


    public static boolean isPrime(int n){
        int i =2;
        while (i<n){
            if (n%i==0){
                return false;
            }
            i++;//переход к следующему числу
        }
        return true;
    }
}



   /* В этом фрагменте кода вы создаете стрим из списка чисел (numbers), применяете фильтр с использованием метода isPrime для отбора простых чисел, а затем выводите результат с помощью forEach. Вот пошаговое объяснение этого фрагмента:

        numbers.stream(): Превращает список чисел в стрим.

        .filter(PrimeNumbers::isPrime): Применяет фильтр, где PrimeNumbers::isPrime - это ссылка на метод isPrime в классе PrimeNumbers. Этот фильтр оставляет только те элементы стрима, для которых метод isPrime возвращает true.

        .forEach(n -> System.out.print(n + " ")): Для каждого элемента, который прошел через фильтр, выполняется операция, указанная внутри forEach. В данном случае, для каждого простого числа выполняется вывод в консоль.

        System.out.println(): Добавляет новую строку для удобного форматирования вывода.

        Таким образом, в итоге на консоль выводятся только простые числа из вашего списка numbers.*/