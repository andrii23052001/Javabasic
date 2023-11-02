package comparator;

import java.util.Arrays;

public class PersonAppl {
    public static void main(String[] args) {


        Person personAndre = new Person("Andrii", 35, 1000);
        Person personMaria = new Person("Maria", 33, 234123);

        Person personPetya = new Person("Petja", 54, 32432);

        Person[] people = {personAndre, personMaria, personPetya};

        Arrays.sort(people);
    }
}