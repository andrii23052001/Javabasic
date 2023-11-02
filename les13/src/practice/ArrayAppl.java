package practice;

public class ArrayAppl {
    public static void main(String[] args) {

        int[] number={8,9,12,65,98,57,4,1,22};
        ArrayMethods.printArray(number);

        int max =ArrayMethods.maxArray(number);
        System.out.println(" Maximum "+ max);

        int min=ArrayMethods.minArray(number);
        System.out.println(" Min " + min);

        int maxIndex=ArrayMethods.maxArrayIndex(number);
        System.out.println(" index of max element "+maxIndex);

        ArrayMethods.sortArray(number); //выполняем сортировку
        ArrayMethods.printArray(number);//печатаем после сортировки
        ArrayMethods.split();



        int[] number2={-5,56,-100,0,15,52,67,8,1};
        ArrayMethods.printArray(number2);

        int maxIndex2=ArrayMethods.maxArrayIndex(number2);
        System.out.println(" index of max element "+maxIndex2);




        int max2 =ArrayMethods.maxArray(number2);
        System.out.println(" Maximum "+ max2);

        String[] digits = {"zero", "one", "two", "three",
                "four", "five", "six", "seven", "eight", "nine"};

        ArrayMethods.printArray(digits);




    }
}
