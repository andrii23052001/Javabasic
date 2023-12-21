package hw;

/*Задание 1. Создайте класс Container с полями: String label
        (маркировка) и List - список коробок с посылками.
        Создайте класс Box с полем: List - список посылок.
        Классы Container и Box являются итерируемыми.
        Создайте класс Parcel (посылка) с полем double weight - вес посылки.
        Создайте класс ShipmentAppl с методом main.
        Задумайте случайное количество контейнеров (от 10 до 20).
        В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
        В каждой коробке задумайте случайное количество посылок (от 5 до 10).
        Предположим, что каждая посылка в среднем имеет вес = 2 кг.*/
public class Parcel {

    double weight;

    public Parcel(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nParcel have " + weight + "kg";
    }
}