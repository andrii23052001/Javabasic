package hw;
/*
        Создайте абстрактный класс Shape с типом поля double (одно)
        и абстрактными методами calcArea и calcPerimeter.
        Создать классы Circle - круг, Triangle-треугольник, Square- квадрат,
        расширяющие класс Shape и реализующие абстрактные методы.
        Напишите класс FigureAppl с методом main.
        В методе создайте массив фигур. Добавьте в массив два круга, один треугольник и один квадрат.
        Рассчитайте общую площадь и общий периметр всех фигур из массива фигур. /*

 */
public abstract class Shape {

    protected double side; // Поле для хранения одного значения типа double.

    public Shape(double side) {
        this.side = side;
    }

    public abstract double calcArea();//  Абстрактный метод для вычисления площади фигуры.
    public abstract  double calcPerimeter();//  Абстрактный метод для вычисления периметра фигуры.


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Figure ");
        sb.append(" Side : ").append(side);
        return sb.toString();
    }

}






