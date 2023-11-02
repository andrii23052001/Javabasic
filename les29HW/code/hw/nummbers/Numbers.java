package hw.nummbers;
/*Задание 4. (на повторение и закрепление)
        Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
        Найдите среднюю величину
        по всем четным элементам массива.
        Разработайте соответсвующий тест (набор тестов). /*

 */
public class Numbers {

    public static void main(String[] args) {
        int[] numbers = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};

        System.out.print("Все четные числа в массиве: ");
        System.out.println();
        EvenNumbers(numbers);
        System.out.println("_________________________________________");

        int sum = sumOfEvenNumbers(numbers);
        System.out.println(" Сумма четных чисел в массиве :" + sum);

    }

    public static int EvenNumbers(int[] arr) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        return even;
    }

    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];

            }
        }
        return sum;
    }
}

   /* public static int sumOfEvenNumbers(int[]arr){
        int result =0;
        int sum = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                sum+=arr[i];                       Найдите среднюю величину
                count++;
            }
        }
        result = sum / count;
        return result;
}
 */