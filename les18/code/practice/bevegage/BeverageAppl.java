package practice.bevegage;

public class BeverageAppl {
    public static void main(String[] args) {
        Beverage b1= new Beverage("Milk","box",10);

        b1.toBuy("Milk","box",20);

        b1.displayStock();
        System.out.println("=====================================");

        Beer b2 = new Beer("Augustiner","6 pack",10,"elle");
        b2.toBuy("Augustiner","6 pack",10,"elle");
        b2.displayStock();

        Beverage beverage = new Beverage();
        beverage.displayStock();
    }
}
