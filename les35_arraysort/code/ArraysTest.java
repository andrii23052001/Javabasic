import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import soldier.model.Soldier;

import java.util.Arrays;

public class ArraysTest {

    Integer[] arrNum;
    String[] arrStr;

    Soldier[] soldiers;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
        soldiers = new Soldier[]{
                new Soldier("John", 182, 82.3, 91),
                new Soldier("Peter", 175, 77.1, 75),
                new Soldier("Rabindranate", 162, 55.1, 91),
                new Soldier("Mary", 159, 82.3, 91),
                new Soldier("Ann", 162, 55, 88),

        };
    }

    @Test
    void testArraysSort() {
        Arrays.sort(arrNum);
        System.out.println(Arrays.toString(arrNum));
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));


    }

    @Test
    void testSoldiersNaturalOrder() {
        Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        PrintArray(soldiers);

    }
    private void PrintArray (Object[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("============================");
    }

}
