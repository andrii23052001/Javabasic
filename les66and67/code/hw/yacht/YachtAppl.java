package hw.yacht;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* Нужно создать набор яхт и выполнить следующие задачи:

         отобразить все яхты;
         отобразить яхты, сделанные из указанного материала корпуса;
         отобразить яхты дороже указанной цены;
         отобразить яхты, чей год выпуска находится в заданном диапазоне;
         отсортировать яхты в порядке убывания стоимости;
         получить среднюю стоимость яхты из созданного набора.*/
public class YachtAppl {
    public static void main(String[] args) {
        ArrayList<Yacht> yachts = new ArrayList<>(List.of(
                new Yacht("Manufacturer1", 2020, "Metal", 149999.99),
                new Yacht("Manufacturer2", 2018, "Plastic", 120000),
                new Yacht("Manufacturer3", 2022, "Wood", 180000),
                new Yacht("Manufacturer4", 2019, "Metal", 200000),
                new Yacht("Manufacturer5", 2021, "Plastic", 160000)
        ));

        // Отобразить все яхты
        System.out.println("========= Все яхты =========");
        printAll(yachts);

        // Отобразить яхты, сделанные из указанного материала корпуса
        System.out.println("\n========= Яхты из металла =========");
        ShowYachtsByMaterial(yachts, "Metal");

        // Отобразить яхты дороже указанной цены
        System.out.println("\n========= Яхты дороже €170000 =========");
        displayYachtsMoreExpensiveThan(yachts, 170000);

        // Отобразить яхты, чей год выпуска находится в заданном диапазоне
        System.out.println("\n========= Яхты с 2019 по 2021 год =========");
        displayYachtByYearsFromTo(yachts, 2019, 2021);

        // Отсортировать яхты в порядке убывания стоимости
        System.out.println("\n========= Сортировка по убыванию стоимости =========");
        displaySortByPrice(yachts);

        // Получить среднюю стоимость яхты из созданного набора
        System.out.println("\n========= Средняя стоимость яхт =========");
        avgPriceFromThisListOfYachts(yachts);

        // Нарисовать маленькую яхту в конце
        drawSmallYacht();
        drawSea();
    }

    // Отобразить все яхты
    public static void printAll(ArrayList<Yacht> yachts) {
        for (Yacht y : yachts) {
            System.out.println(y);
        }
    }

    // Отобразить яхты, сделанные из указанного материала корпуса
    public static void ShowYachtsByMaterial(ArrayList<Yacht> yachts, String material) {
        List<Yacht> res = yachts.stream().filter(yacht -> yacht.getMaterial().equals(material))
                .collect(Collectors.toList());
        res.forEach(System.out::println);
    }

    // Отобразить яхты дороже указанной цены
    public static void displayYachtsMoreExpensiveThan(ArrayList<Yacht> yachts, double price) {
        yachts.stream()
                .filter(yacht -> yacht.getPrice() > price)
                .forEach(System.out::println);
    }

    // Отобразить яхты, чей год выпуска находится в заданном диапазоне
    public static void displayYachtByYearsFromTo(ArrayList<Yacht> yachts, int from, int to) {
        yachts.stream()
                .filter(yacht -> yacht.getYearOfIssue() >= from && yacht.getYearOfIssue() <= to)
                .forEach(System.out::println);
    }

    // Отсортировать яхты в порядке убывания стоимости
    public static void displaySortByPrice(ArrayList<Yacht> yachts) {
        yachts.stream()
                .sorted(Comparator.comparing(Yacht::getPrice).reversed())
                .forEach(System.out::println);
    }

    // Получить среднюю стоимость яхты из созданного набора
    public static void avgPriceFromThisListOfYachts(ArrayList<Yacht> yachts) {
        System.out.println("Средняя стоимость яхт: €" +
                yachts.stream()
                        .mapToDouble(Yacht::getPrice)
                        .average()
                        .orElse(0.0)); // Возвращает 0, если список пустой
    }

    // Нарисовать маленькую яхту
    public static void drawSmallYacht() {
        System.out.println("\n========= Маленькая яхта =========");
        System.out.println("   _____|_____\n" +
                "     _|_____|_\n" +
                " ~~~~~~~~~~~~~");
    }
    // Метод для рисования моря
    public static void drawSea() {
        System.out.println("              ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("       ~ ~ ~ ~  ~   ~   ~   ~   ~  ~  ~  ~ ~ ~ ~ ");
        System.out.println("   ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println(" ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
}
}
