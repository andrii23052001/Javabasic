package practice.company.dao;
/*- добавить сотрудника
        - удалить сотрудника
        - найти сотрудника
        - кол-во сотрудников
        - ФОТ
        - средняя з/п
        - объем продаж
        - напечатать список сотрудников */


import practice.company.model.Employee;

public interface Company {
    //объявляем методы, только сигнатуры , без тела метода
     boolean  addEmployee(Employee employee); // dobavlaem sotrydnika

    Employee removeEmloyee(int id); // удаляем работника

   Employee findEmloyee(int id);

   int quantity(); // количество сотрудников


    double totalSalary(); //общая зарплата


    double avgSalary(); //средняя зп по компании

    double totalSales(); // обьем  продаж

    void printEmployees();  //void потому что метод ничего не возвращает, а только печатает
// ------------------------------------------------
//      - список работников, у которых отработано больше часов, чем...
  Employee [] findEmployeesHoursGraderThan(int hours);
//      - список работников, у которых зарплата в интервале от... и до...
Employee[]findEmployeesSalaryRange(int minSalary, int maxSalary);

}
