package hw;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/*Задача 1. В классе DateOperation  реализовать метод getAge,
        принимающий дату рождения в виде String, и возвращающий возраст в годах.*/
public class DateOperation {

    public static int getAge(String birthDate) {
        LocalDate birthDateTime = LocalDate.parse(birthDate,DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        LocalDate currentDate=LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthDateTime,currentDate);
        return (int) age;

    }

    public static void main(String[] args) {
        String birthday ="2001.05.23";
        int age= DateOperation.getAge(birthday);
        System.out.println("Age: " +age +"Years old");


    }
}