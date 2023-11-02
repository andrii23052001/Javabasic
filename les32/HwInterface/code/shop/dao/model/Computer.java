package shop.dao.model;

public class Computer {

    private int id ;
    private String cpu;

    private int ram ;

    private int ssd;

    private String brand;

    public Computer(int id, String cpu, int ram, int ssd, String brand) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Computer computer = (Computer) object;

        return id == computer.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSsd() {
        return ssd;
    }
}
