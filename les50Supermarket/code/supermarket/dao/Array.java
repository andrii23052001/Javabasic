package supermarket.dao;

/*Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        Найдите максимальный элемент массива и его индекс.*/


public class Array {
    public static void main(String[] args) {
        int[]arr={56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
         int maxEl= arr[0];
         int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxEl){
                maxEl=arr[i];
                System.out.println(maxEl);
                index=i;
                System.out.println(index);
            }


        }


        }


    }

