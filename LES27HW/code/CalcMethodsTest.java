import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcMethodsTest {

    CalcMethods calcMethods;

    @BeforeEach
    void setUp() {
        calcMethods = new CalcMethods();
    }

    @Test
    void addTest() {
        int a =5;
        int b = 3;
        assertEquals(8,calcMethods.add(a,b));
    }

    @Test
    void subtraction() {                         // объявление метода
        int a = 10;
        int b = 5;
        assertEquals(5,calcMethods.subtraction(a,b)); // использование метода
    }

    @Test
    void division() {
        double a =100;
        double b = 33;
        assertEquals(3.0303030303030303,calcMethods.division(a,b));
    }

    @Test
    void multiplication() {
        double a = 1.5;
        double b = 3;
        assertEquals(4.5,calcMethods.multiplication(a,b));
    }

    @Test
    void wholePartOfDivision() {
        int a = 10;
        int b = 3;
        assertEquals(3,calcMethods.wholePartOfDivision(a,b));
    }
}