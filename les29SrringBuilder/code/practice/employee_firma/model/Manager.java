package practice.employee_firma.model;

public class Manager extends Emloyee {

    private double baseSalary;

    private int grade;

    public Manager(int id, String firstname, String lastname, int age, double hours, double baseSalary, int grade) {
        super(id, firstname, lastname, age, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = baseSalary + grade * hours;
        return salary;
    }

    }

