package computer.model;

public class ComputerAppl {
    public static void main(String[] args) {
        //Computer computer = new Computer("i5",12,512,"HP");
        //Computer laptop = new Laptop("i7",16,512,"Dell",5,0.3);

        double a = 10; // upper восходящее преобразование
        int b = (int) a; //down casting

        Computer[] shop = new Computer[5];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 16, 1, "Dell", 5, 0.3);
        shop[2] = new Laptop("i5", 64, 2, "Asus", 10, 0.4);

        shop[3] = new Smartphone("A16 Bionic chip", 32, 2, "Iphone 15", 8, 140, 343443);

        Laptop laptop1 = (Laptop) shop[1];
        laptop1.setHours(4.5);


        printall(shop);


        int total = getTotalSSDCapacity(shop);
        System.out.println("Total ssd capacity = " + total);


        double totalBatteryLife = getTotalBatteryLife(shop);
        System.out.println("Total battery life of all laptops: " + totalBatteryLife + " hours");


        int totalLaptopSSDCapacity = getTotalLaptopSSDCapacity(shop);
        System.out.println("Total SSD capacity of all laptops: " + totalLaptopSSDCapacity + " GB");

    }








    public static void printall(Computer[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null)                    // что бы не печатать пустые элементы
            System.out.println(arr[i]);
        }
        System.out.println("__________________________");
    }

    public static int getTotalSSDCapacity(Computer[]arr) {
     int res=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null)
            res+=arr[i].getSsd();  // res= res + arr[i].getSsd();
        }
        return res;
    }
 public static double getTotalBatteryLife (Object[]arr){

        double totalBatteryLife = 0;
     for (int i = 0; i < arr.length; i++) {
       if (arr[i] instanceof Laptop ){
             Laptop laptop = (Laptop) arr[i];
          totalBatteryLife += laptop.getHours();
         }
         if (arr[i] instanceof Smartphone ){
             Laptop laptop = (Laptop) arr[i];
             totalBatteryLife -= laptop.getHours();
         }

     }

     return totalBatteryLife;
 }


    public static int getTotalLaptopSSDCapacity(Object[] arr) {
        int totalLaptopSSDCapacity = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] instanceof Laptop   ) {
                Laptop laptop = (Laptop) arr[i];
                totalLaptopSSDCapacity += laptop.getSsd();

            }
         if (arr[i]instanceof Smartphone){
         Laptop laptop=(Laptop)arr[i];
         totalLaptopSSDCapacity-=laptop.getSsd();
         }
        }

        return totalLaptopSSDCapacity;
    }
}
