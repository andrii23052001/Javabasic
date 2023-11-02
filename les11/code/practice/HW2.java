package practice;

public class HW2 {
    public static int multiplyElementsWithEvenIndices(int[] arr) {
        int product = 1; // Инициализируем произведение значением 1

        // Итерируемся по массиву с четными индексами (начиная с 0)
        for (int i = 0; i < arr.length; i += 2) {
            product *= arr[i]; // Умножаем текущий элемент на произведение
        }

        return product; // Возвращаем произведение
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int result = multiplyElementsWithEvenIndices(array);
        System.out.println("Произведение элементов с четными индексами: " + result);
    }
}