package hw;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double calcArea() {
    double  areaOfCircle =  Math.PI * Math.pow(side,2);// Math.pow возведение в степень
     return areaOfCircle;
    }

    @Override
    public double calcPerimeter() {
        return 2  * Math.PI * side;
    }
}
