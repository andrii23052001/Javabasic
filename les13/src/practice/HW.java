package practice;

//Задача 1. Дополните класс ArrayMethods методами, которые находят:

    //    минимальный элемент в массиве
      //  индекс минимального элемента в массиве В классе ArrayAppl
        //задайте собственный массив из целых чисел на 10 элементов,
        //найдите минимальный элемент и его индекс.
        //Лучше сделать в своих классах по аналогии с классной работой.
public class HW {
        public static void main(String[] args) {

        int[] number = {8, 9, 32, 65, 98, 57, 4, 1, 62, 10};
        int min=ArrayMethods.minArray(number);
            System.out.println("numbers :" + min);
            int minIndex=ArrayMethods.minArrayIndex(number);
            System.out.println(" Index :" + minIndex);
    }
    }