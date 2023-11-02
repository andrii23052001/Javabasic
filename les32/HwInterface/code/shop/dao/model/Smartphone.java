package shop.dao.model;

public class Smartphone  extends Computer{

    private int display;

    private double weight;


    public Smartphone(int id, String cpu, int ram, int ssd, String brand,int display,double weight) {
        super(id, cpu, ram, ssd, brand);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Smartphone that = (Smartphone) object;

        if (display != that.display) return false;
        return Double.compare(weight, that.weight) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + display;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
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
        return "Smartphone{" +
                "display=" + display +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
