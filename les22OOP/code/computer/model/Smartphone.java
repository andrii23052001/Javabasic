package computer.model;

public class Smartphone extends Laptop {

    public int getEmei() {
        return emei;
    }

    public void setEmei(int emei) {
        this.emei = emei;
    }

    public Smartphone(String cpu, int ram, int ssd, String brand, double hours, double weight, int emei) {
        super(cpu, ram, ssd, brand, hours, weight);
        this.emei = emei;
    }

    public int emei;

    public Smartphone(String cpu, int ram, int ssd, String brand, double hours, double weight) {
        super(cpu, ram, ssd, brand, hours, weight);


    }

    public boolean equals(Object object) {
        if (!(object instanceof Smartphone)) {
            return false;
        }
        Smartphone other = (Smartphone) object;
        return emei== other.emei;

    }
}