package shop.dao.model;

/*
Задача 1. Повторить самостоятельно реализацию методов
        и прогон тестов для Book - Library.
        Задача 2. Марафон: Во всех класcах должен быть некий id (штрих-код, isbn и т.д.)
        По методам - должны быть CRUD-операции:
         С - create R - read, find U - update (не обязательно) D - delete, remove
        Book - Library, найти несколько книг по автору
        Computer (Laptop, SmartPhone) - Shop,
        найти компьютеры со скидкой на BlackFriday
        Product (Food, MeatFood, MilkFood) -
        Supermarket, искать продукты по сроку годности (алфавитный порядок)
        Pets (Cat, Dog) - Hotel, стоимость пребывания,
        выручка от отеля, найти по породе
        Student, Aspirant, Professor - High school
        Главное - не функциональность, а последовательность
        от классов через интерфейс к тестированию и имплементации.
*/
public class Computer {
    private long id;

    private String cpu;

    private int ram;

    private int ssd;

    private String brand;

    private int price;
    private boolean discounted;
    private double discountAmount;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Computer(long id, String cpu, int ram, int ssd, String brand, int price,boolean discounted,double discountAmount) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
        this.discounted=discounted;
        this.discountAmount=discountAmount;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    public void setDiscounted(boolean discounted) {
        this.discounted = discounted;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                ", price=" + price + ", discount Amount : "+ discountAmount+"discounted" + discounted+
                '}';

    }
}
