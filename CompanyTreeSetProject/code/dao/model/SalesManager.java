package dao.model;

public class SalesManager extends Employee {
    private double salesValue;//обьем продаж(кол-во)

    private double percent;// у него будет зп рассчитываться от продаж

    public double getSalesValue() {
        return salesValue;
    }

    public SalesManager(int id, String name, String lastname, int age, int hours, double salesValue, double percent) {
        super(id, name, lastname, age, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    @Override
    public double calcSalary() {
        double salary= salesValue*percent;
        return salary;
    }
}
