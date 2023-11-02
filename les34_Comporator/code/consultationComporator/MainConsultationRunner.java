package consultationComporator;

import java.util.Arrays;

public class MainConsultationRunner {
    public static void main(String[] args) {
        Person personAndre=new Person("Andrej",35,10557);// 35-32=2
        Person personMaria=new Person("Maria",33,10557);//35-
        Person personVasja=new Person("Vasja",25,10369);
        Person personPetja= new Person("Petja",43,10089);

        Person[] people={personAndre,personMaria,personVasja,personPetja};

        Arrays.sort(people); // метод из библиотеки Array который отвечает за сортировку
    }
}
