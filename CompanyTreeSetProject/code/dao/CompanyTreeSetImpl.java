package dao;

import dao.model.Employee;
import dao.model.SalesManager;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class CompanyTreeSetImpl implements Company {

    private TreeSet<Employee> employees;//сюда будем хранить роботников
    int capacity;

    //делаем конструктор для вместимости Компании

    public CompanyTreeSetImpl(int capacity) {
        this.capacity = capacity;
        employees = new TreeSet<>();
        /*Эта строка кода создает новый объект TreeSet для хранения элементов типа
        Employee и указывает, что для сортировки элементов следует использовать
        реализацию метода compareTo в классе Employee, где сравниваются их id.*/
    }


    @Override
    public boolean addEmployee(Employee emloyee) {

        if (emloyee == null || employees.size() == capacity) {
            return false;
        }
                return employees.add(emloyee);
        //если работник - пустой или количество роботников= вместимости, то мы не добавим , в других случаях добаляем
        }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        if (victim != null) { // а надо ли это проверять?
            employees.remove(victim);
            return victim;
        }
        return null;
        //множества не содержат в общем случае элемент null не нужна
        //Если мы нашли жертву по айди то удаляем, если нет то null
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee e:
             employees) {
            if (e.getId()==id){
                return e;
            }
        }
        return null;
        //Если тот id который мы введем будет соответствовать , тому который мы сложем получить у элемента с помощью getID значит мы нашли иначе не нашли
    }

    @Override
    public int quantity() {
        return employees.size();
    }

    @Override
    public double totalSalary() {
        double res=0;
        for (Employee e:
             employees) {
            return res+=e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        double salary= totalSalary()/employees.size();
        return  salary;
    }

    @Override
    public double totalSales() {
        double res= 0;
        for (Employee e:
             employees) {
            if (e instanceof SalesManager){
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (Employee e:
             employees) {
            System.out.println(e);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
            return findEmployeesByPredicate(e-> e.getHours () >= hours);
        }
    /*Этот метод находит и возвращает массив сотрудников,
    у которых количество отработанных часов больше или равно указанному значению. Внутри метода используется предикат (лямбда-выражение),
    чтобы фильтровать сотрудников в соответствии с заданным условием.*/
   /* Это лямбда-выражение представляет собой функцию, которая принимает
    объект Employee (обозначенный как e) и проверяет, что количество
    отработанных часов (getHours())
    у этого сотрудника больше или равно указанному значению (hours).*/

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate){
        List<Employee> res = new ArrayList<>();
        for (Employee employee:
                employees) {
            if(predicate.test(employee)){
                res.add(employee);
            }
        }
        return res.toArray(new Employee[0]);
    }
   /* Этот метод принимает предикат (функцию, проверяющую условие) в качестве аргумента
    и возвращает массив сотрудников, которые удовлетворяют заданному условию. В
    данном случае, метод проходит по списку сотрудников (employees), применяя предикат
    к каждому из них, и добавляет в список (res) только тех сотрудников, для которых
    предикат возвращает true.
    Затем массив сотрудников из списка преобразуется в массив и возвращается.*/

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(e->e.calcSalary()>=minSalary&&e.calcSalary()<=maxSalary);
    }
}
  /*  Этот метод возвращает массив сотрудников, зарплата которых находится
        в заданном диапазоне (minSalary до maxSalary). Он использует метод
        findEmployeesByPredicate, передавая ему предикат,
        который проверяет условие для зарплаты каждого сотрудника в диапазоне.*/