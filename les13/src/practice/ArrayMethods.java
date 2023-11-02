package practice;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayMethods {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    // ищем максимальный элемент массива
    public static int maxArray(int[] arr) {
        int max = arr[0]; // первое приближение для максимума
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        return max;
    }

    //ищем индекс максимального элемента
    public static int maxArrayIndex(int[] arr) {
        int max = arr[0]; // первое приближение для максимума
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    //пузирьковая сортировка от меньшего к большему
    public static int[] sortArray(int[] arr) {
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            // переставляем минимальный элемент в начало
            int tmp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = tmp;
        }
        return arr;
    }
    // метод печатает строку разделителя
    public static void split(){
        System.out.println("=======================");
    }


    public static int minArray(int[] arr) {
        int min = arr[0]; // первое приближение для минимума
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        return min;
    }

    public static int minArrayIndex(int[] arr) {
        int min = arr[0]; // первое приближение для максимума
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}