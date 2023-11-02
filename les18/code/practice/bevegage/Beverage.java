package practice.bevegage;

public class Beverage {
    // поля класса (Fields)
    private String title; // название напитка name of Beverage
    private String packing; // вид упаковки
    private int quantity; // количество упаковок

    //  пустой конструктор
    public Beverage() {
    }


    // конструктор


    public String getTitle() {
        return title;
    }

    public void Beer () {
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;



    }

    // метод для покупки
    public void toBuy(String title, String packing, int quantity) {
        // связываем текущий обьект  с методом
        this.packing = packing;
        this.title = title;
        this.quantity = quantity;
        System.out.println("Go to market and buy : " + title + " " + packing + " " + quantity + ".");
    }


    // метод для проверки того что осталось на складе

    public void displayStock(){
        System.out.println(" We have : " + title + " " + packing + " " + quantity);

    }

}
