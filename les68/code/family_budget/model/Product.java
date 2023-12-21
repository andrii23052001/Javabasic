package family_budget.model;

import java.util.Objects;

public class Product {

    private String product;
    private double price;

    private int quantity;

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Double.compare(price, product1.price) == 0 && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
/*
1. Проект - внедрение информационных технологий на базе Java в семье.

        **Проблематика:** необходимость отслеживания трат, контроль за расходами.

        **Цель проекта:** разработать простое приложение, которое позволит оперативно контролировать
        семейный бюджет.

        2. Практика - реализация проекта:
        - проведение обследования объекта информатизации:
        - первичная информация (данные) - как поступают?
        - электронные источники (50%):
        -  личный ноутбук
        - мобильные приложения
        - банковское приложение
        - личный кабинет в Интернет-магазине
        - бумажные носители (50%):
        - в блокнотике
        - есть бумажные чеки
        - реестр покупок
        - счета
        Вывод: мы хотим, чтобы удобно наглядно быстро и не "на бумажке".

        - Боль: непредвиденные расходы!

        - участники процесса?
        - магазины
        - работодатель (в части дохода)
        - члены семьи - у нас несколько **"центров затрат"** (много трат, в разное время, залезаем в кредиты),
        - информацию от разных участников надо собрать и консолидировать:
        - посчитать, свести баланс
        - консолидировать = свести по статьям расходов (продукты, коммуналька, одеджа, Интернет, подписки...),  исключить "неучтенку", дубликаты

        - сбор и ввод информации - как происходит?
        - посредством электронных и бумажных носителей - это сейчас
        - надо оперативно вводить данные в "одно окно, хранилище"
        - автоматизация расчета(ов)

        - конечный потребитель результата проекта?
        - глава домового хозяйства.

        - разработка информационной модели:
        - классы (с чем работаем?):
        - меню -> emun
        - персоны (кто тратит деньги - имя, пол, возраст)
        - поставщики (кому платим - магазины и т.д. - название)
        - продукт (product, price, quantity)
        - покупка/расход (data, сумма общая, поставщик, список продуктов, кто потратил)
        - доходы (вид, сумма, кто принес)
        - статьи бюджета, категории (название категории, тип: доход или расход)
        - интерфейсы (что делаем?):
        - бюджет, кошелек (действия = методы)

        - продумывание и проектирование UI/UX:
        - меню приложения
        - узнать баланс
        - добавить покупку
        - добавить бюджет
        - аналитика - по магазинам (поставщикам), по персонам, по статьям бюджета, по месяцам
        - сценарий использования:
        - при каждом расходе и доходе;
        - регулярно раз в неделю, как минимум 1 раз в месяц.

        - написание кода:
        - реализация классов
        - проектирование тестов
        - разработка приложения*/