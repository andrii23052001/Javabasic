package consultationComporator;

public class Person {
    // создаем поля для персоны - человека

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

    public String getName() {
        return name;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getAge() {
        return age;
    }
}
