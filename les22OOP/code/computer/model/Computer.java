package computer.model;

public class Computer {
    private String cpu;

    private int ram;

    private int ssd;

    private String brand;

    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                '}';
    }


    public boolean equals(Object object) {
        if (!(object instanceof Computer)) {
            return false;

        }
        Computer other = (Computer) object;
        return cpu.equals(other.cpu) && ram== other.ram &&  ssd==other.ssd && brand.equals(other.brand);

    }





    public void display(){
        System.out.print(" Brand " + brand + " CPU " + cpu +" Ram " + ram + "  SSD " + ssd);
    }
}

