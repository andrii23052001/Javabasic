package hw;

public class Square extends Shape{
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return Math.pow(side,2);  //взводим сторону во вторую степень ,тоже самое что и множим сторону на сторону
    }

    @Override
    public double calcPerimeter() {
        return 4*side;
    }
}
