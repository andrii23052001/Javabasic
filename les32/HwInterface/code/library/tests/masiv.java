package library.tests;

public class masiv {

    public static void main(String[] args) {
        int []arr= new int[5] ;
        arr[0]=1;
        arr[1]=223;
        arr[2]=434;
        arr[3]=5;
        arr[4]=0;
        int maxElement= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxElement){
                maxElement=arr[i];

            }
        }
        System.out.println(maxElement);
    }
}
