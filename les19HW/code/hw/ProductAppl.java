package hw;

public class ProductAppl {


    public static void main(String[] args) {

        Product[] food = new Product[3];

        food[0] = new Food("Potato", 12337, 2, "1.10.2024");
       // System.out.println(food[0]);
        System.out.println("_______________________________");

        food[1] = new MeetFood("Sausages", 2281488, 3, "15.10.2023", "Beef");
     //   System.out.println(food[1]);

        System.out.println("_______________________________");

        food[2] = new MilkFood("Banana Yogurt", 23637, 2.2, "7.10.2023", "Cow's milk", 3.5);
      //  System.out.println(food[2]);

        System.out.println("-------------------------------");

        PrintAll(food);

        double sumPrice = 0;

        for (int i = 0; i < food.length; i++) {
            sumPrice = sumPrice + food[i].getPrice();
        }
        System.out.println(" Total price : " + sumPrice);





    }

    public static void PrintAll (Object[]arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }



    }

