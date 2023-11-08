package shop.dao.model;

public class Laptop extends Computer{

    private double display;

    private double weight;

    public Laptop(long id, String cpu, int ram, int ssd, String brand, int price,double display, double weight,boolean discounted,double discountAmount) {
        super(id, cpu, ram, ssd, brand, price,discounted,discountAmount);
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "display=" + display +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
