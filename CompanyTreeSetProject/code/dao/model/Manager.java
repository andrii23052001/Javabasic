package dao.model;

//наследуем Employee(Родителя)
public class Manager extends Employee {

    private double baseSalary;
    private int grade;

    public Manager(int id, String name, String lastname, int age, int hours, double baseSalary, int grade) {
        super(id, name, lastname, age, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary= baseSalary + grade * hours;
        return salary;
    }

    //расширяем класс дополнительными полями
    //делаем приват так как будем использовать в этом классе для конструктора



}
