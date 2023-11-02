package practice;

import java.util.Arrays;

public class BubbleSortvv2 {
    public static void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { //правый конец будет двигаться к началу
                if (arr[j] > arr[j + 1]) { // если левые из соседей элемент больше правого то их меняем местами
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;


                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

}

