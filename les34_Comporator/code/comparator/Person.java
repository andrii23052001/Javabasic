package comparator;

public class Person {
    private String name;
    private int age;
    private int zipCode;

    public Person(String name, int age, int zipCode) {
        this.name = name;
        this.age = age;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", zipCode=" + zipCode +
                '}';
    }
}
