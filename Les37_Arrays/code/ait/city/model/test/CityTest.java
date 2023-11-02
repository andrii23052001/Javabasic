package ait.city.model.test;

import ait.city.model.City;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CityTest {
    City[] cities;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);

    }

    private void printArray(Object[] arr, String title) {
        System.out.println("========" + title + "========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }

    @Test
    void testIntegerDesc() {
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};

        Arrays.sort(actual, (n1, n2) -> Integer.compare(n2, n1));
        assertArrayEquals(expected, actual);


    }

    @Test
    void testCityComparable() {
        printArray(cities, "Original array");
        Arrays.sort(cities);
        printArray(cities, "Natural order");
        City pattern = new City(null, 2_700_000);
        int index = Arrays.binarySearch(cities, pattern);
        System.out.println("index= " + index);
    }

    @Test
    void testCityNameComporator() {
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparator);
        printArray(cities, "Sort by name");

    }
}

/*
 @Test
    void testArrayCopy(){
        Comparator<City>comparator=(c1,c2)->
 }
}*/
