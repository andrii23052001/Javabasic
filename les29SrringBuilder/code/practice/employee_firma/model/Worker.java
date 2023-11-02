package practice.employee_firma.model;

public class Worker extends Emloyee{
    private double grade;        /// ставка

    public Worker(int id, String firstname, String lastname, int age, double hours, double grade) {
        super(id, firstname, lastname, age, hours);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary= hours * grade;
        return salary;
    }
}
