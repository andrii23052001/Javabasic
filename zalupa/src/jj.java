import java.util.Random;

public class jj {
    public static void main(String[] args) {

        int[] arr = new int[100];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i]%3==0){
                System.out.println("Числа кратные 3ем :"+arr[i]);
            } ;
        }
        }
    }

