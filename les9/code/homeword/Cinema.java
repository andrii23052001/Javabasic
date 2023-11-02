package homeword;

import java.util.Scanner;

//Задача 3. В кинотеатре есть разные типы билетов: стандартный,
  //      студенческий (-10%) и для пенсионеров(-25%).
    //    Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне,
      //  что увеличит стоимость билета на 25%.
        //Создайте метод calculateTicketPrice,
        //который принимает возраст клиента, статус студента и флаг VIP-места.
public class Cinema {

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("  Введите возраст : ");
            int age=scanner.nextInt();
            boolean isStudent=false;
            boolean isVip=false;

            double price = calculateTicketPrice(age,isStudent,isVip);
            System.out.println("Стоимость билета: $" + price);
        }

        public static double calculateTicketPrice(int age, boolean isStudent, boolean isVip) {
            double p = 10;
            if (age >= 60) p -= 2.5;
            if (isStudent) p *= 0.9;
            if (isVip) p *= 1.25;
            return p;
        }
    }




















