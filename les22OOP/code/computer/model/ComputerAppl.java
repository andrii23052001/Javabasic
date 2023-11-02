package computer.model;

public class ComputerAppl {
    public static void main(String[] args) {


        Computer[] shop = new Computer[5];
        shop[0] = new Computer("i5", 12, 512, "HP");
        shop[1] = new Laptop("i7", 64, 1024, "Dell", 3, 0.3);
        shop[2] = new Laptop("i7", 64, 1024, "Asus", 4.5, 0.4);

        shop[3] = new Smartphone("A16 Bionic chip", 32, 2, "Iphone 15", 8, 140, 343443);
        printall(shop);
        System.out.println("__________________________");
          Computer computer = new Computer("i5", 12, 512, "HP"); //shop[0];
          boolean checker=shop[0].equals(computer);  // boolean checker=shop[0]==computer;
        System.out.println(checker);

        checker=shop[1].equals(shop[2]);
        System.out.println(checker);

        Smartphone smartphone=new Smartphone("A16 Bionic chip", 32, 2, "Iphone 15", 8, 140, 343323);
        checker=smartphone.equals(shop[3]);
        System.out.println(checker);
    }


    public static void printall(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)                    // что бы не печатать пустые элементы
                System.out.println(arr[i]);
        }
        System.out.println("__________________________");
    }

}