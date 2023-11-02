package consultationComporator.comparator;

import consultationComporator.Person;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // Сравнение людей по возрасту
        return o1.getAge() - o2.getAge();
    }
}