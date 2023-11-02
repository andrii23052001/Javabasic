package practice.employee_firma.model;

public class SalesManager extends Emloyee {
    private double salesValue; // зарплата в качестве процента
    private  double percent;

    public SalesManager(int id, String firstname, String lastname, int age, double hours, double salesValue, double percent) {
        super(id, firstname, lastname, age, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double calcSalary() {
        double salary= salesValue * percent;
        return salary;
    }
}
