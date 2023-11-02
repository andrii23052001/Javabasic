package homeword;

import java.util.Scanner;

//Задача 3. В кинотеатре есть разные типы билетов: стандартный,
   //     студенческий (-10%) и для пенсионеров(-25%).
   //     Каждый тип билета имеет свою стоимость. Клиент может также выбрать место
     //   в VIP-зоне, что увеличит стоимость билета на 25%. Создайте метод calculateTicketPrice,
    //    который принимает возраст клиента, статус студента и флаг VIP-места.
public class Cinema1 {
    public static void main(String[] args) {

        double ticket=10;
        boolean isStudent=false;
        boolean isVip=false;
        int age=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Если вы студент нажмите 1  ,\n если вы хотите вип место нажмите 2,\n если вы пенсионер нажмите 3,\nесли вы хотите стандартный билет нажмите 4");
        int choice=scanner.nextInt();

        double finishticket=0;



        switch (choice){
            case 1 -> finishticket=calculateTicketPrice(10,true,false,22);
            case 2 -> finishticket=calculateTicketPrice(10,false,true,35);
            case 3 -> finishticket=calculateTicketPrice(10,false,false,62);
            case 4 -> finishticket=calculateTicketPrice(10,false,false,45);
        }
        System.out.println("Стоимость билета $ : " + finishticket);
    }
    public static double calculateTicketPrice(double ticket,boolean isStudent,boolean isVip,int age) {
        double newPrice = 0;
        if (age >= 60) {
            return newPrice = ticket * 0.75;

        }
        if (isStudent) {
            return newPrice = ticket * 0.9;
        }
        if (isVip) {
            return newPrice = ticket * 1.25;
        }
        return newPrice = ticket;

    }
}
