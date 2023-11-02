package hw;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] figure = new Shape[4];
        figure[0] = new Circle(5);
        figure[1] = new Circle(6);
        figure[2] = new Triangle(10);
        figure[3] = new Square(20);

        double totalArea = AllTotalArea(figure);
        System.out.println("Общая площадь всех элементов :" + totalArea);
        double totalPerimetr = PerimetrOfAllFigure(figure);
        System.out.println(" Общий периметр всех элементов :" + PerimetrOfAllFigure(figure));

        double AreaOfTwoCircle = Areaof2Circle(figure);
        System.out.println("Площадь двух кругов :");
        System.out.println(AreaOfTwoCircle);
    }


    public static double AllTotalArea(Shape[] figures) {
        double totalArea = 0;
        for (int i = 0; i < figures.length; i++) {
            totalArea += figures[i].calcArea();
        }
        return totalArea;
    }

    public static double PerimetrOfAllFigure(Shape[] figures) {
        double totalPerimetr = 0;
        for (int i = 0; i < figures.length; i++) {
            totalPerimetr += figures[i].calcPerimeter();
        }
        return totalPerimetr;
    }

    public static double Areaof2Circle(Object[] arr) {
        double total2Circle = 0;
        for (int i = 0; i < 2; i++) {
            if (arr[i] instanceof Circle) {
                total2Circle += ((Circle) arr[i]).calcArea();
            }
        }
        return total2Circle;
    }
}
