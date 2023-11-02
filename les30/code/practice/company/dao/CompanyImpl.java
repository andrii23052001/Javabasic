package practice.company.dao;

import practice.company.model.Employee;
import practice.company.model.SalesManager;


public class CompanyImpl implements Company {

    //добавляем поля
    private Employee[] employees; // создали массив где будем хранить всех сотрудников
    private int size; // текущие количество сотрудников

    // нужно создать конструктор
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; // capacity - максимальный размер компании

    }

    @Override
    public boolean addEmployee(Employee employee) {
        // не добавляем null
        // не превышаем capacity, не добавляем уже существующего


        if (employee == null || size == employees.length || findEmloyee(employee.getId()) != null) {
            return false;
        }

        employees[size] = employee;
        size++;
        return true;
    }


    @Override
    public Employee removeEmloyee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i]; //убрали найденный элемент в переменную
                employees[i] = employees[size - 1]; // на место найденного поставили последнее  // из существ в массиве
                employees[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmloyee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {    // нашелся элемент массива у которого совпал id
                return employees[i];   // вернули найденный элемент массива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {

        return size;
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) employees[i]; //провели кастинг ,даункастинг
                res += salesManager.getSalesValue();  // гетер который вытаскивает обьем продаж

            }

        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }

    }

    //    Для выборки элементов из массива, удовлетворяющих заданному условию,
//    надо сначала подсчитать количество элементов массива, удовлетворяющих условию.
//    Потом создать массив под это количество,
//    и только потом его заполнить
    @Override
    public Employee[] findEmployeesHoursGraderThan(int hours) {
        int count = 0;
        //сколько будет элементов массива удолетворяющих условию
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count]; // создаем массив размеров count
        //заполняем массив res
        for (int i = 0, j = 0; j < res.length ;i++){
            if (employees[i].getHours() >hours){
                res[j++]=employees[i];
            }
        }
        return res;
}


    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        //считаем скольуо будет элементов массива удолетворяющих условию
       int count=0;
        for (int i = 0; i <size; i++) {
            if (employees[i].calcSalary()> minSalary && employees[i].calcSalary()<maxSalary){
                count++;
            }
        }
        Employee[]res= new  Employee[count]; // создаем массив размером count
        //заполняем массив res
        for (int i = 0, j = 0; j < res.length ;i++){
            if (employees[i].calcSalary()> minSalary && employees[i].calcSalary()<maxSalary){
                res[j++]=employees[i];
            }
        }


        return res;
    }
}
