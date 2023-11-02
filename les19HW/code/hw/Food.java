package hw;

public class Food  extends  Product {
    protected String expDate;

    public Food(String name, long barCode, double price, String expDate) {
        super(name, barCode, price);
        this.expDate = expDate;

    }

    @Override
    public String toString() {
        return  " Food " + "{" +
                " name : " + name + " Bar Code :" +barCode+
                " Price "+price+
                " expDate :" + expDate +
                '}';
    }

    public void display () {
        super.display();
        System.out.println(" expDate " + expDate);
    }
}


