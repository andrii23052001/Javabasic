package practice;

//Задача 1. Создайте массив и заполните
  //      его символами латинского алфавита от A до Z.
    //    Раcпечатайте полученный массив.
public class ArrayAlphabet {
    public static void main(String[] args) {
        //заполнить массив числами от  1 до 20
        int[] arrayNum=new int[20]; //обьявили массив

        for (int i = 0; i < arrayNum.length; i++) { //запускаем цикл
            arrayNum[i]=i+1; // заполняем элементы массива

        }
        // цикл для печати массива
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + ", ");
        }
        System.out.println(); //переход на новую строку
        System.out.println(" 0-й по индексу элемент "+arrayNum[0]);
        System.out.println("19 по индексу элемент " + arrayNum[19]);
        // System.out.println("20 по индексу элемент " + arrayNum[20]);

        char[]alphabet=new char[26]; // лат алф 26 букв
        //заполнение
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i]=(char) (65 + i);       //65 - это код большой буквы А латинского алфавита
        }                                   // (char) это привидение int  к типу char
        // печать массива
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
