package hw;

public class Triangle extends  Shape{
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {                               //Math.sqrt - это метод в языке программирования Java,
                                                             // который используется для вычисления квадратного корня числа. Он принимает один аргумент
                                                           // (число, из которого нужно извлечь квадратный корень)
                                                           // и возвращает квадратный корень этого числа.
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }                                                         //В вашей исходной формуле (Math.sqrt(3) / 4) * Math.pow(side, 2), Math.sqrt(3) используется для вычисления квадратного корня из числа 3, а затем результат делится на 4. Это значение используется в геометрической формуле для вычисления площади равностороннего треугольника.







    @Override
    public double calcPerimeter() {
        return 3 * side;                   // периметр равен сумме всех сторон
    }
}
