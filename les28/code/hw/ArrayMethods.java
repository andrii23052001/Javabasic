package hw;


/*Задача 1. Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:

        сумма всех элементов массива;
        поиск элемента в массиве;
        Разработайте тесты для этих методов.
          /*
 */
public class ArrayMethods {

    public  double findSumAllElement (double[]arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum +arr[i];
        }
        return sum;
    }
    public  int findElementIndex(double[] arr, double target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Возвращаем индекс, если элемент найден.
            }
        }
        return -1; // Элемент не найден, возвращаем -1.
    }

}
