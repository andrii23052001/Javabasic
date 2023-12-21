package hw;

import java.util.TreeSet;

public class TheeSetExample {
    public static void main(String[] args) {
        // Создаем TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Наполняем TreeSet 10-ю элементами
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(9);

        // Выводим содержимое TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Примеры методов для TreeSet
        System.out.println("First element: " + treeSet.first()); // Получение первого элемента
        System.out.println("Last element: " + treeSet.last()); // Получение последнего элемента
        System.out.println("Lower (less than 5): " + treeSet.lower(5)); // Получение элемента меньше 5
        System.out.println("Higher (greater than 5): " + treeSet.higher(5)); // Получение элемента больше 5

        // Удаление элемента
        treeSet.remove(3);
        System.out.println("TreeSet after removing 3: " + treeSet);
    }
}
