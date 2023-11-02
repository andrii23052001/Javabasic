package practice.employee_firma;

import practice.employee_firma.model.Emloyee;
import practice.employee_firma.model.Manager;
import practice.employee_firma.model.SalesManager;
import practice.employee_firma.model.Worker;

public class EmployeeAppl {
    public static void main(String[] args) {

        Emloyee[] empl = new Emloyee[4]; // создаем массив на 6 сотрудников
        empl[0] = new Manager(100,"John","Smith",45,160,5000,5);
        empl[1] = new SalesManager(101,"Anna","Black",36,160,25000,0.1);
        empl[2] = new SalesManager(102,"Thomas","White",28,160,30000,0.1);
        empl[3]=  new Worker(103,"Gans","Bauer",30,160,5);

        double total = totalSalary(empl);// вызываем метод для расчета зарплаты
        System.out.println("Total salary :" + total);
        double average = averageAge(empl); // вызываем метод возраста среднего роботника
        System.out.println("Average age :" + average);
    }
    private static double totalSalary(Emloyee[]emloyees){
        double sum = 0;
        for (int i = 0; i < emloyees.length; i++) {
            if (emloyees[i] != null){
                sum +=emloyees[i].calcSalary();
            }

        }
        return sum;
    }
     private static double averageAge(Emloyee[]emloyees){
        double averageage = 0;
         for (int i = 0; i < emloyees.length; i++) {
             if (emloyees[i] != null){
                 averageage+=emloyees[i].getAge();
             }

         }
         return averageage/emloyees.length;          // делим общий возраст на количество сотрудников
     }
}
