package ThreeSetCompany.dao;

import ThreeSetCompany.dao.model.Employee;
import ThreeSetCompany.dao.model.SalesManager;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class CompanyTreeSetImpl implements Company {

    private TreeSet<Employee> employees;
    int capacity;

    public CompanyTreeSetImpl(int capacity) {
        this.capacity = capacity;
        employees = new TreeSet<>();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        //        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
////        if( employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
//            return false;
//        }
//        employees[size++] = employee; // ++ - это постфиксная операция
//        return true;
        if(employee == null || employees.size() == capacity) {
            return false;
        }
         // добавили в список сотрудника (элемент списка)
        return employees.add(employee);
        //операция добавления и удаления из множества (Set) имеет сложность O(1);
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
    }


    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }


    @Override
    public int quantity() {
        return employees.size();
    }

    @Override
    public double totalSalary() {
        double res = 0;
//        for (int i = 0; i < size; i++) {
//            res += employees[i].calcSalary();
//        }
        for (Employee e : employees) {
            res += e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if(e instanceof SalesManager) {
                //    SalesManager salesManager = (SalesManager) e;
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
       employees.forEach(e-> System.out.println(e));
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmployeesByPredicate(e-> e.getHours () >= hours);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee>predicate){
        List<Employee> res = new ArrayList<>();
        for (Employee employee:
             employees) {
                    if(predicate.test(employee)){
                        res.add(employee);
                    }
        }
        return res.toArray(new Employee[0]);
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmployeesByPredicate(e->e.calcSalary()>=minSalary&&e.calcSalary()<maxSalary);
    }
}
