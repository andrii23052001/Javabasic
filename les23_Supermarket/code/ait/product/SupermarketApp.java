package ait.product;

import ait.product.model.Food;
import ait.product.model.Product;
import ait.product.model.Supermarket;

public class SupermarketApp {
    public static void main(String[] args) {

        Supermarket kiosk = new Supermarket(4);
        kiosk.addProduct(new Product(100,"Gift card",20));
        kiosk.addProduct(new Food(2000,"Sosages",5,"20.10.2023",false));
        kiosk.addProduct(new Food(3000,"Goat cheese",13,"31.12.2023",true));
        kiosk.addProduct(null);
        kiosk.addProduct(new Food(4000,"Pork fat",3,"15.11.2023",true));

      kiosk.printAllProdacts();

      Product product=kiosk.findProduct(2000);
        System.out.println(product);

    }
}
