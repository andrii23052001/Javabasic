package practice.linked_list.perfomance_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PerfomanceList {
    //определим константы
    private static final int N_NUMBERS = 1_000_000;
    private static final int MIN = 10;
    private static final int MAX = 100;
    private static Random random= new Random();


    public static void main(String[] args) {


        List<Integer> list=new ArrayList<>();
        fillList(list);//заполнить лист методами
        System.out.println("===========for each=============");
        //сложим все элементы листа
        int sum=0;
        for (Integer n:
             list) {
            sum+=n;
        }
         long t2=System.currentTimeMillis();
        System.out.println("Sum = " + sum);

    }




    private static void fillList(List<Integer>list){
        long t1=System.currentTimeMillis();//засекли время
        for (int i = 0; i <N_NUMBERS; i++) {
         list.add(MIN + random.nextInt(MAX- MIN));

        }
        long t2=System.currentTimeMillis();
        System.out.println("Duration of filling the list : " + (t2-t1));
    }


}
