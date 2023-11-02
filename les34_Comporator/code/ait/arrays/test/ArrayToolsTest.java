package ait.arrays.test;

import ait.arrays.utils.ArrayTools;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

class ArrayToolsTest {
    Integer[]arrNum;
    String[]arrStr;

    @BeforeEach
    void setUp() {
        arrNum=new Integer[]{9,7,4,7,2,5,1,0};
        arrStr=new String[]{"one","two","three","four","five"};
    }

    @org.junit.jupiter.api.Test
    void printArray() {
        System.out.println("======testPrintAray====");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }
    @Test
    void testSearch(){
        System.out.println("=======testSearch============");
        int index = ArrayTools.search(arrStr,"five");
        System.out.println("index= " + index) ;

        index=ArrayTools.search(arrNum,4);
        System.out.println("index" + index);

        index=ArrayTools.search(arrNum,10);
        System.out.println("index"+index);

    }
    @Test
    void testFindByPredicat(){
        System.out.println("==========testFindByPredicat========");
        Predicate <Integer>predicate= new Predicate<Integer>(){
            @Override
            public boolean test(Integer integer) {
                return integer<5;
            }
        };
        Integer num = ArrayTools.findByPredicate(arrNum,predicate);
        System.out.println(num);
        String str = ArrayTools.findByPredicate(arrStr,s -> s.length()==4);
        System.out.println(str);
    }
    @Test
    void testBbubleSort(){
        System.out.println("======testBubbleSort====");
        ArrayTools.bubleSort(arrNum,(n1,n2)->n2-n1);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubleSort(arrStr);
        ArrayTools.printArray(arrStr);

    }

}