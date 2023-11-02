public class SumOfArray {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};



        int sum= SumOfArray(arr);

        System.out.println(sum);


    }
    public static int SumOfArray(int[]arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum+= arr[i];

        }
    return sum;
    }

}
