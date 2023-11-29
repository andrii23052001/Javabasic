package dao;
//  - добавить сотрудника
//    - удалить сотрудника
//    - найти сотрудника
//    - кол-во сотрудников
//    - ФОТ
//    - средняя з/п
//    - объем продаж
//    - напечатать список сотрудников

import dao.model.Employee;

public interface Company {
  boolean addEmployee(Employee emloyee);// в этой строке что добавление будет элементов из Имплоии , булеан для того что бы посмотреть ТРУ или Фолс


    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity();
    double totalSalary(); // - ФОТ, зарплата всех
    double avgSalary(); // средняя зарплата по компании, average - средний
    double totalSales(); // - объем продаж
    void printEmployees();
    //---------------------
//      - список работников, у которых отработано больше часов, чем...
    Employee[] findEmployeesHoursGreaterThan(int hours);
    //      - список работников, у которых зарплата в интервале от... и до...
    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);

}
