import java.util.Scanner;

public class Zalupa {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name=scanner.nextLine();

        if (name.equals("John")){
            System.out.println("Hi,John");
        } else  {
            System.out.println("Wrong name");

        }
    }
}