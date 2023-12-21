package practice;

import java.util.Comparator;
import java.util.LinkedList;

public class GermanCity {
    public static void main(String[] args) {
        LinkedList<String> germanCities = new LinkedList<>();
        germanCities.add("Berlin");
        germanCities.add("Bremen");
        germanCities.add("Dresden");
        germanCities.offerFirst("Hamburg"); // добавили в начало
        germanCities.add("Bavaria");
        germanCities.addFirst("Potsdam");
        germanCities.add("Wiesbaden");
        germanCities.add(3, "Hamburg"); // добавили в центр списка
        System.out.println("Информация о городах:");
        System.out.println(germanCities);

        System.out.println(germanCities.removeLast() + ": Последний элемент, который мы удаляем"); // удаляем последний элемент
        System.out.println(germanCities.remove(2) + ": Элемент, который удаляем с индексом 2 (Бремен)"); // удаляем элемент по индексу 2
        System.out.println(germanCities); // проверили удаление

        System.out.println(germanCities.getFirst() + ": Первый элемент"); // получаем первый элемент
        System.out.println(germanCities.size() + ": Количество элементов"); // узнали количество элементов


        System.out.println(germanCities + " :Создаем клон");

        germanCities.sort( Comparator.naturalOrder() );
        System.out.println(germanCities+ " :Отсортировали по Алфавиту!");

        // Создаем объект People и выводим информацию о людях
        People peopleInfo = new People();
        peopleInfo.DisplayPeople(peopleInfo.people);


    }
}

class People {
    LinkedList<String> people;

    public People() {
        people = new LinkedList<>();
        people.add("Yura");
        people.add("Masha");
        people.addFirst("Sasha");
        people.offerLast("Grisha");
        people.add("Karina");

    }

    public void DisplayPeople(LinkedList<String> people) {
        System.out.println("\nИнформация о людях:");
        for (String person : people) {
            System.out.println(person);
        }
    }
}
