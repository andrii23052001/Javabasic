package hw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest1 {
    @Test
    void getAge() {
        String date1= "2010.10.10";
        String date2= "2015.11.11";
        String date3=  "1999.05.05";


        int age1= DateOperation.getAge(date1);
        int age2= DateOperation.getAge(date2);
        int age3= DateOperation.getAge(date3);



        assertEquals(13,age1);
        assertEquals(7,age2);
        assertEquals(24,age3);

    }
}