package supermarket.dao;

import supermarket.model.Product;

import java.time.LocalDate;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;


class SupermarketImplTest {

    SupermarketImpl supermarket;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl();
        LocalDate now = LocalDate.now();
        supermarket.addProduct(new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5)));
        supermarket.addProduct(new Product(222222, "Choko Milk", "Dairy", "MilkLand", 13, now.minusDays(3)));
        supermarket.addProduct(new Product(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50)));
        supermarket.addProduct(new Product(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85)));
        supermarket.addProduct(new Product(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25)));



    }

    @org.junit.jupiter.api.Test
    void addProduct() {
        Product product1 = new Product(12345, "Choco Milk", "Milk", "Prostokvashino", 2.99, LocalDate.now().plusDays(7));
        assertTrue(supermarket.addProduct(product1));
        System.out.println("Добавили Шоколадное молоко в список " + product1);

        printSupermarket(supermarket);
        assertFalse(supermarket.addProduct(product1)); // не можем добавить уже существующий
        assertFalse(supermarket.addProduct(null)); //не может добавить пустоту
        assertEquals(6, supermarket.skuQuantity());//ожидаем 6 элементов
        Product product2 = new Product(123456, "Milka Choco", "Chocolate", "Milka", 1.99, LocalDate.now().plusDays(30));
        assertTrue(supermarket.addProduct(product2));

    }

    @org.junit.jupiter.api.Test
    void removeProduct() {
        assertEquals(5, supermarket.skuQuantity());

        Product rem1 = supermarket.removeProduct(111111);

        assertNotNull(rem1);  //ТЕСТ НА ТО ЧТО ПОЗИЦИЯ С ТАКИМ БАР КОДОМ ДЕЙСТВИТЕЛЬНО ЕСТЬ

        System.out.println(rem1);
        /*Таким образом, в тесте assertNotNull(rem1) проверяется успешность удаления продукта
    с баркодом 111111 из супермаркета. Если удаление было успешным, rem1 будет не null,
        и тест пройдет. Если бы удаление не удалось (например, продукт с таким баркодом не существует),
        тест не пройдет, и вы получите сообщение об ошибке.*/

        assertEquals(4, supermarket.skuQuantity());

        assertNull(supermarket.findByBarCode(111111));//это значит что поиске по баркоду метод находит NULL =пустоту , что значит что удаление прошло успешно


    }

    @org.junit.jupiter.api.Test
    void findByBarCode() {
        Product foudproduct = supermarket.findByBarCode(222222);
        assertNotNull(foudproduct); //нашли этот элемент
        System.out.println(foudproduct);

        assertEquals(222222, foudproduct.getBarCode()); //ожидаем 222222 и получаем 222 222


/*
        printSupermarket(supermarket);
*/

        assertNull(supermarket.findByBarCode(2));//мы не можем найти несуществующий обьект
    }

    @org.junit.jupiter.api.Test
    void findByCategory() {
        Iterable<Product> breadProducts = supermarket.findByCategory("bread");
        assertNotNull(breadProducts);//мы нашли не пустоту , то бишь нашли bread
        System.out.println(breadProducts + " Нашли Хлеб");
        int countBreadProducts = 0;
        for (Product product : breadProducts) {
            assertEquals("Bread", product.getCategory());
            countBreadProducts++;
        }
        assertEquals(2, countBreadProducts);//всего 2 хлеба в списке и мы нашли 2 хлеба
    }

    @org.junit.jupiter.api.Test
    void findByBrand() {
        Iterable<Product> foundOfBrand = supermarket.findByBrand("Farmer");
        assertNotNull(foundOfBrand);
        System.out.println("Нашли по бренду " + foundOfBrand);
        int brandProductsOfPcs = 0;

        for (Product product : foundOfBrand
        ) {
            assertEquals("Farmer", product.getBrand());
            brandProductsOfPcs++;
        }
        assertEquals(1, brandProductsOfPcs);
        System.out.println(brandProductsOfPcs);
    }

    @org.junit.jupiter.api.Test
    void findProductsWithExpiredDate() {
        LocalDate currentTime = LocalDate.now();

        Iterable<Product> foundOfExpDate = supermarket.findProductsWithExpiredDate();
        assertNotNull(foundOfExpDate);
        System.out.println(foundOfExpDate + "\n");//нашли просрочку
        System.out.println("==============================================================");

        int expDateProduct = 0;

        for (Product p :
                foundOfExpDate) {
            assertTrue(p.getDate().isBefore(currentTime));
            expDateProduct++;
            System.out.println(p + "Мы нашли просроченные товары");
        }

        assertEquals(2, expDateProduct);//ожидаем 2 просроченных товара и проверяем действительно их 2
    }


    @org.junit.jupiter.api.Test
    void skuQuantity() {
        assertEquals(5, supermarket.skuQuantity());
        assertNotNull(supermarket.skuQuantity());
    }

    @org.junit.jupiter.api.Test
    void iterator() {
        int count = 0;
        for (Product p :
                supermarket) {
            count++;
        }
        assertEquals(5, count);//мы ожидаем что итератор переберет все товары У НАС ИХ 5 и вернет покажет нам 5 позиций

        assertNotNull(supermarket.iterator());//говорит о том что у нас не пустота

        Iterator<Product> iterator = supermarket.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();//next продолжает пробегать по супермаркету
            System.out.println(product); // выводим через ИТЕРАТОР
        }
        assertEquals(supermarket.skuQuantity(), count);//сравнили метод квантити (кол-во товоров сейчас) с итератором который прошел про всем товаром
        assertTrue(supermarket.iterator().hasNext());//итератор говорит что действительно у нас есть еще следующие(элементы) продукты в супермаркете
    }

    private static void printSupermarket(Supermarket supermarket) {
        System.out.println("Содержимое супермаркета:");

        for (Product product : supermarket) {
            System.out.println(product);
        }
    }
}
/*
for (Product product : breadProducts): Цикл for-each, который проходит через каждый элемент в breadProducts.

        assertEquals("Bread", product.getCategory()): Эта строка проверяет, что категория каждого продукта в breadProducts равна строке "Bread". Если это условие не выполняется для хотя бы одного продукта, тест завершится с ошибкой.

        countBreadProducts++: Если категория продукта равна "Bread", счетчик countBreadProducts увеличивается на 1.

        assertEquals(2, countBreadProducts): Эта строка проверяет, что фактическое количество продуктов с категорией "Bread" (то есть тех, для которых countBreadProducts увеличился) равно 2. Если это условие выполняется, тест проходит успешно.

        Этот участок кода гарантирует, что метод findByCategory("bread") возвращает ожидаемое количество продуктов с категорией "Bread" и что у каждого из этих продуктов категория действительно равна "Bread".*/



     /*   Iterable<Product> expiredProducts = supermarket.findProductsWithExpiredDate();: Мы создаем переменную expiredProducts, в которую помещаем результат выполнения метода findProductsWithExpiredDate() из нашего супермаркета. Этот метод находит все продукты с истекшим сроком годности.

        assertNotNull(expiredProducts, "Iterable<Product> не должен быть null");: Мы проверяем, что переменная expiredProducts не является null (пустой). Если она пустая, то у нас проблема, и мы выводим сообщение "Iterable<Product> не должен быть null".

        System.out.println("Продукты с истекшим сроком годности:");: Мы выводим на экран заголовок, чтобы было понятно, что дальше будут перечислены продукты с истекшим сроком годности.

        for (Product product : expiredProducts) {: Мы начинаем цикл, который перебирает все продукты в expiredProducts.

        assertTrue(product.getDate().isBefore(currentDate), "Дата истечения срока должна быть до текущей даты");: Мы проверяем, что дата истечения срока годности продукта (.getDate()) действительно меньше текущей даты. Если это не так, то это может быть проблемой, и мы выводим сообщение "Дата истечения срока должна быть до текущей даты".

        System.out.println(product);: Мы выводим информацию о каждом продукте с истекшим сроком годности.

        countExpiredProducts++;: Мы увеличиваем счетчик найденных продуктов с истекшим сроком годности.

        }: Мы заканчиваем цикл.

        assertEquals(1, countExpiredProducts, "Ожидаем, что найден 1 продукт с истекшим сроком годности");: Мы проверяем, что общее количество найденных продуктов с истекшим сроком годности равно 1. Если это не так, выводим сообщение "Ожидаем, что найден 1 продукт с истекшим сроком годности".

        Таким образом, этот код помогает нам найти и отобразить продукты в супермаркете, у которых истек срок годности, и убеждается, что их количество равно ожидаемому значению (в данном случае, 1).*/







   /* Iterator<Product> iterator = supermarket.iterator();: Создается итератор для перебора элементов супермаркета. Это делается вызовом метода iterator() у объекта supermarket. Тип Iterator<Product> указывает, что итератор предназначен для перебора объектов типа Product.

        while (iterator.hasNext()) {: Цикл будет выполняться, пока итератор имеет следующий элемент.

        Product product = iterator.next();: Получает следующий элемент с помощью метода next() итератора. Этот элемент представляет собой объект типа Product, и его содержимое сохраняется в переменной product.

        System.out.println(product);: Выводит информацию о продукте в консоль. Это достигается автоматическим вызовом метода toString() у объекта product. В классе Product предполагается, что метод toString() переопределен, чтобы предоставить информацию о продукте в удобочитаемом формате.

        Таким образом, каждая итерация цикла обрабатывает следующий продукт с использованием итератора и выводит его информацию в консоль. Это полезно, например, при отладке или отображении содержимого коллекции для пользователя.*/