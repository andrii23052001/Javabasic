package dao.model.tests;

import dao.model.Employee;

public class Worker extends Employee {

    private double grade;//добавляем уровень надбавки

    public Worker(int id, String name, String lastname, int age, int hours, double grade) {
        super(id, name, lastname, age, hours);
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = hours * grade;
        return salary;
    }
}
