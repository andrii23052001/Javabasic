package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeDataAppl {
    //считать из файла employees.csv
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("leson65/code/practice/employees.csv"))) {
           String str= br.readLine();
           // System.out.println(str);
            String[]cells =str.split(",");
            printCells(cells);
            //total salary
            //total employees
            //avg salary
            //avg age
            //читаем по строкам и что можем, сразу считаем
            double salary=0;
            int counter=0;
            double age=0;
            str=br.readLine();
            while (str!=null){
                counter++;
                cells=str.split(",");
                //salary
                salary +=Double.parseDouble(cells[2]);
                LocalDate birhDate=LocalDate.parse(cells[3]);
                age += ChronoUnit.YEARS.between(birhDate,LocalDate.now());
                printCells(cells);
                str = br.readLine();
            }
            System.out.println("Total salary: "+salary);
            System.out.println("Total employees: "+counter);
            System.out.println("Average salary "+ salary/counter);
            System.out.println("Average year:"+ age/counter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printCells(String[] cells) {
        for (String s:
             cells) {
            System.out.print(s+ "\t"); // \t- это табуляция. Отступление на один тап
        }
        System.out.println();
    }


}
