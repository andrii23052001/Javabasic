package hw;


import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
class Container implements Iterable<Box>{
    static AtomicInteger containerCounter = new AtomicInteger(1);
    String label;
    List<Box> boxes;

    public Container(String label, int numBoxes) {
        this.label = "Container-" + containerCounter.getAndIncrement();
        Random random = new Random();
        this.boxes = IntStream.range(0, numBoxes)
                .mapToObj(i -> new Box(random.nextInt(5,11)))
                .collect(Collectors.toList());
    }
    public int getTotalParcels() {
        return boxes.stream()
                .mapToInt(box -> box.parcels.size())
                .sum();
    }

    public String getLabel() {
        return  label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "Container{ " +
                "label=' " + label + '\'' +
                ", boxes= " + boxes;
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
}