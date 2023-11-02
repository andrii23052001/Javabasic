package ait.product.model;

public class Supermarket {
    private Product [] products;
    private int quantity;

    public Supermarket(int capacity){
        products = new Product[capacity];
    }
    // CRUD
    public boolean addProduct (Product product){
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null){
            return false;
        }
        products[quantity]= product;
        quantity++;
        return true;

    }
    public Product findProduct(long barcode){
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode){
                return products[i];
            }
        }
        return null;
    }
    public Product updateProduct(long barcode, double price){
        // todo update product price
        return null;
    }
    public boolean removeProduct (long barcode){
        // todo remove product
        return false;
    }

    public void printAllProdacts(){
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null){
                System.out.println(products[i]);
            }
        }
    }


}