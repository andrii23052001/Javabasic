package computer.model;

public class Laptop extends Computer {

    private double hours;
    private double weight;

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public Laptop(String cpu, int ram, int ssd, String brand, double hours, double weight) {
        super(cpu, ram, ssd, brand);
        this.hours = hours;
        this.weight = weight;

    }


    public void display(){
        super.display();
        System.out.print(" Hours " + hours + " Weight" + weight);

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Type of Computer : Laptop{" +
                "and info about hours and weight hours=: " + hours  +
                ", weight=" + weight +
                '}';

    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Laptop)){
            return false;
        }
        Laptop other = (Laptop) object;
        return super.equals(other) && hours== other.hours && weight== other.weight;

    }
}
