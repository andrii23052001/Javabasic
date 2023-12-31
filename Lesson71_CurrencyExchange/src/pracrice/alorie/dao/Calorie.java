package pracrice.alorie.dao;

import pracrice.alorie.model.CalorieEntry;
import pracrice.alorie.model.Product;

import java.time.LocalDateTime;
import java.util.List;

public interface Calorie {

    void addEntry(LocalDateTime dateTime, List <Product> products);

    List <CalorieEntry> getEntries();

    List<Product> readProductsFromCSV();

    void saveFood(List<Product> products);

    List<Product> loadFood();

    void addProduct(List<Product> libraryFood, List<Product> userProducts, String food, int gram, LocalDateTime dateTime);

    boolean removeProduct (String product);
}
