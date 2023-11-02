package hw;
        /*   Создать класс Product, с полями

private String name; private long barCode; private double price;

        Создать класс Food расширяющий класс Product с полем private String expDate;,
        которое хранит дату истечения срока годности.

        Создать класс MeatFood расширяющий класс Food с полем private String meatType;,
        которое хранит тип мяса из которого изготовлен продукт.

        Создать класс MilkFood расширяющий класс Food
        с полями private String milkType;
        private double fat;, которые хранят тип молока и жирность продукта соответственно.

        Во всех классах переопределить метод toString.

        Создать класс ProductAppl c методом main.
        В методе main создать массив в котором хранятся
        по одному объекту для каждого продукта. Создать метод печатающий все продукты из массива
         и метод возвращающий сумму цен всех продуктов.

         */

public class Product {

    protected String name;

    protected long barCode;

    protected double price;

    public Product(String name, long barCode, double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
    }

    public Product() {
        this.name = name;
        this.barCode = barCode;
        this.price = price;


    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", barCode=" + barCode +
                ", price=" + price +
                '}';
    }

    public void display() {
        System.out.println(" Name " + name + " Bar Code " + barCode + " price " + price+"$");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void printAll (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr [i]);
            System.out.println("-------------------------------------");

        }
    }
}


