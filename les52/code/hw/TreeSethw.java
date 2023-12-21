package hw;

import java.util.TreeSet;
/*Задача 1. Прочитать теорию из урока 52. Наполнить свою TreeSet 10-ю элементами (числа).
        В документации Oracle изучить и попробовать методы для TreeSet.*/
public class TreeSethw {
    public static void main(String[] args) {

        TreeSet<Integer>numbers=new TreeSet<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(7);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(9);

        // Выводим все элементы TreeSet
        System.out.println("Все элементы в TreeSet: " + numbers);

        // Пример использования метода ceiling
        System.out.println("Элемент, больший или равный 5: " + numbers.ceiling(5));


        // Пример использования метода higher
        System.out.println("Элемент, строго больший 7: " + numbers.higher(7));


        // Пример использования метода lower
        System.out.println("Элемент, строго меньший 4: " + numbers.lower(4));

        // Пример использования метода first
        System.out.println("Первый элемент TreeSet: " + numbers.first());

        // Пример использования метода last
        System.out.println("Последний элемент TreeSet: " + numbers.last());

        // Пример использования метода remove
        numbers.remove(3);
        System.out.println("После удаления элемента 3 (2-й индекс): " + numbers);

        // Пример использования метода size
        System.out.println("Размер(кол-во элементов) TreeSet: " + numbers.size());

        // Пример использования метода subSet
        System.out.println("Поднабор от 3 элемента до 7 го (включительно) до 7 (исключительно): " + numbers.subSet(3, 7));



        // Пример использования метода headSet
        System.out.println("Поднабор от 4 (включительно) до начала: " + numbers.headSet(4));

        // Пример использования метода tailSet
        System.out.println("Поднабор от 6 (включительно) до конца: " + numbers.tailSet(6));

        // Пример использования метода descendingSet
        System.out.println("TreeSet в обратном порядке: " + numbers.descendingSet());

        // Пример использования метода contains
        System.out.println("Содержит ли TreeSet элемент 5? " + numbers.contains(5));

        // Пример использования метода isEmpty
        System.out.println("TreeSet пустой? " + numbers.isEmpty());

        // Пример использования метода clear
        numbers.clear();
        System.out.println("После очистки TreeSet: " + numbers);
    }
}
