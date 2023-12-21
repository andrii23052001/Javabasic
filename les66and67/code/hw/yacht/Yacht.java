package hw.yacht;


/*Задание 1. Создать класс «Яхта». В классе должна храниться следующая информация:

        производитель(верфь);
        год выпуска;
        длина;
        материал корпуса (дерево, пластик, металл);
        стоимость.
        Нужно создать набор яхт и выполнить следующие задачи:

        отобразить все яхты;
        отобразить яхты, сделанные из указанного материала корпуса;
        отобразить яхты дороже указанной цены;
        отобразить яхты, чей год выпуска находится в заданном диапазоне;
        отсортировать яхты в порядке убывания стоимости;
        получить среднюю стоимость яхты из созданного набора.*/
public class Yacht {
    String manufacturer;

    int yearOfIssue;

    String material;

    double price;

    public Yacht(String manufacturer, int yearOfIssue, String material, double price) {
        this.manufacturer = manufacturer;
        this.yearOfIssue = yearOfIssue;
        this.material = material;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer +
                ", Year of Issue: " + yearOfIssue +
                ", Material: " + material +
                ", Price: €" + price;
    }

}
