package practice.pet;
/*Задача 1. Создать класс Pet (Домашнее животное) с приватными полями:
        id
        вид
        возраст
        кличка
        Стандартные методы:

        конструктор на все поля;
        геттеры и сеттеры на все поля;
        метод toDisplay.
        Дополнительные методы:

        спать
        есть
        делать звук
        играть
        гулять
        В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.

 */
public class Pet {

    public int id;
    public String type;

    public int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(int id, String type, int year, String name) {
        this.id = id;
        this.type = type;
        this.year = year;
        this.name = name;
    }

    public String name;

    public void displayPet() {
        System.out.println(" ID " + id + " type " + type + " Year " + year + " Name " + name);


    }

    public void sleepPet(){
        System.out.println(" Dog is sleeping now");
    }
}
