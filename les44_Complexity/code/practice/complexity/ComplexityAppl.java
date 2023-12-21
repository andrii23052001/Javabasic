package practice.complexity;

import java.util.Arrays;

public class ComplexityAppl {
    public static void main(String[] args) {


        //заведем простой массив целых чисел
        //будем выполнять с ними различные операции(вычисление среднего, сложение элементов,поиск элемента поиск мин и макс , сортировка)
        //оценим вычислительную сложность алгоритма

        int[] arr = {-24, 7, -67, 15, 8, 93, 1};
        //вычисление среднего значения
        // узнать длинну массива
        // сумму делим на кол-во элементов
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];// здесь растет колво операций
        }
         double avg = (double) sum / arr.length;//кастинг в другой тип данных
        System.out.println(avg);
        //что будет происходить при росте количества элементов массива?
        //это линейная сложность так как кол-во операций прямо пропорционально кол-ву элементов массива
        // O(n) - это вычислительная сложность


        //поиск элемента массива
        // - если пробегаем по массиву, то сложность линейная O(n)
        //- если бинарный поиск
      //  Arrays.sort(arr);// сортируем целые числа - оценим отдельно
      /*  System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------");
        int index= Arrays.binarySearch(arr,-67);
        System.out.println(index);

         index= Arrays.binarySearch(arr,-93);
        System.out.println(index);

        index= Arrays.binarySearch(arr,-100);
        System.out.println(index);*/
       /*
        //при 8 элементах - 3 итерации деления массива
        при 16 - 4 итерации
            1024 элемента - 10 итераций*/
        //2048 - 11 итераций
        // o(log(n)) - это логарифмическая сложность (самая низкая!)

        //сортировка методом BubleSort сравниваем по 2 элемента i-текущий с i + 1 -ым
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    //переставим элементы местами
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        //это квадратичная сложность O(n в квадрате)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //сложность в методе sort - полилинейная
    }
}