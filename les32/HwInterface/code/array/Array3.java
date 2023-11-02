package array;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int []arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        Random random= new Random();
        int randomposition= random.nextInt(100);
        int randomnumber= random.nextInt(100);

        arr[randomposition]=randomnumber;

        int duplicate=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==randomnumber&& i !=randomposition){
                duplicate=randomnumber;
                break;
            }

        }


    }



}
