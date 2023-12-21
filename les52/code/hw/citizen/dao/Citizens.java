package hw.citizen.dao;

import hw.citizen.model.Person;

public interface Citizens {
    boolean add (Person person);
    boolean remove (int id);
    Person find (int id);
    Iterable<Person> find (int minAge,int maxAge);//список граждан в возрасте от и до
    Iterable<Person> find (String lastname);//найти по фамилии
    Iterable<Person> getAllPersonsSortedById();//отсортированные персоны по айди
    Iterable<Person> getAllPersonsSortedByAge();// отсортированные персоны по имени
    Iterable<Person> getAllPersonsSortedByLastName();// отсортированные персоны по фамилии
    int size();
}
