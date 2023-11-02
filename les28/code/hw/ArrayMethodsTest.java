package hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    ArrayMethods arrayMethods;

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods();

    }

    @Test
    void findSumOfAllElements() {
        double[] sum = {1, 2.7, 1, 3, 2, 4.5, 6, 5.4, 4, 2};
        assertEquals(31.6, arrayMethods.findSumAllElement(sum));

    }

    @Test
    void emptyArray() {
        double[] sum = {};
        assertEquals(0, arrayMethods.findSumAllElement(sum));
    }

    @Test
    void AllNegativeNumbersOfArray() {
        double[] sum = {-2.5, -2, -3.25 - 2.25};
        assertEquals(-10, arrayMethods.findSumAllElement(sum));
    }


    @Test
    void MixedNumbersOfArray() {
        double[] sum = {2, 5, -3, -2.75};
        assertEquals(1.25, arrayMethods.findSumAllElement(sum));
    }


    @Test
    void findElementIndex() {
        double[] arr = {1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5};
        double expectedElement = 5;
        double result = arrayMethods.findElementIndex(arr, 3.5);
        assertEquals(expectedElement, result, 0.01);
    }

    @Test
    void testEmptyArray() {
        double[] arr = {};
        double expectedElement = -1;
        double result = arrayMethods.findElementIndex(arr, 50);//// проверка пустого массива
        assertEquals(expectedElement, result, 0.01);
    }

    @Test
    void findLastElement() {
        double[] arr = {1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5};
        double expectedElement = 7;                         // ожидаем элемент с индексом 7
        double result = arrayMethods.findElementIndex(arr, 4.5);
        assertEquals(expectedElement, result, 0.01);
    }
    @Test
    void vtoroeVhojdenieElementaSoznacheniem2() {
        double[] arr = {1, 1.5, 2, 2.5, 3, 3.5,2, 4, 4.5};
        double expectedElement = 2;                         // ожидаем элемент с индексом 7
        double result = arrayMethods.findElementIndex(arr, 2);
        assertEquals(expectedElement, result, 0.01);
    }
 //Спросить если я хочу найти определенный элемент с одним значением
}
