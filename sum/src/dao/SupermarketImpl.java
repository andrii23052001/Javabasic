package dao;


import dao.model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SupermarketImpl implements Supermarket {


    List<Product> source= new ArrayList<>();

    @Override
    public boolean addProduct(Product product) {
        if(product == null||findByBarCode(product.getBarCode())!=null) {
            return false;
        }
        source.add(product);
           return true;
    }

    @Override
    public Product removeProduct(long barCode) {
      Product productByBarCode= findByBarCode(barCode);
      if (productByBarCode!=null){
          source.remove(productByBarCode);
          return productByBarCode;
      }
      return null;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product thisProduct:
           source  ) {
         if (thisProduct.getBarCode()==barCode){
             return thisProduct;
         }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {

        return null;
    }

    @Override
    public Iterable<Product> findProductWithExpDate() {
        return null;
    }

    @Override
    public int skuQuantity() {
        return source.size();
    }

    @Override
    public Iterator<Product> iterator() {

        Iterator<Product>IteratorProducts= new Iterator<Product>() {
            private int currentPosition;
            @Override
            public boolean hasNext() {

                return currentPosition<source.size();
            }

            @Override
            public Product next() {

              return source.get(currentPosition++);
            }
        };
        return IteratorProducts;
    }
}