package practice.company.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.dao.Company;
import practice.company.dao.CompanyImpl;
import practice.company.model.Employee;
import practice.company.model.Manager;
import practice.company.model.SalesManager;
import practice.company.model.Worker;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee [] e;

    @BeforeEach
    void setUp() {
         company=new CompanyImpl(5);
    e= new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager(102,"Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager(103,"Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker(104, "Gans", "Bauer", 30, 80, 5);
               //добавляем элементы массива в company

        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }



    }

    @Test
    void addEmployee() {
        // не можем добавить null
        assertFalse(company.addEmployee(null));
        // не можем добавить второй раз уже существующий
        assertFalse(company.addEmployee(e[1]));
        Employee employee1 = new Manager(105,"Ivan","Dubin",55,160,6000,6);
        assertTrue(company.addEmployee(employee1));// dobavili novogo sotrydnika
        assertEquals(5,company.quantity()); // теперь в компании 5 сотрудников
        Employee employee2 = new Manager(106,"Petr","Dubin",55,160,6000,6);
        assertFalse(company.addEmployee(employee2)); //не можем привысить capacity

    }

    @org.junit.jupiter.api.Test
    void removeEmloyee() {
        //удаляем сотрудника
        assertEquals(e[1],company.removeEmloyee(102));
        System.out.println("______________________________");
        assertEquals(3,company.quantity());  // сотрудников стало на 1 меньше (4-1)=3
        assertNull(company.removeEmloyee(102));//дважды не можем удалить
        assertNull(company.findEmloyee(102)); // не можем найти после удаления
        company.printEmployees();
    }

    @Test
    void findEmloyee() {
assertEquals(e[1],company.findEmloyee(102));
//ищем несуществующего сотрудника
assertNull(company.findEmloyee(105));
    }

    @Test
    void quantity() {
        assertEquals(4,company.quantity());
    }

    @org.junit.jupiter.api.Test
    void totalSalary() {
        assertEquals(11700,company.totalSalary());
    }

    @Test
    void avgSalaryTest() {
        assertEquals(11700.0/4.0,company.avgSalary(),0.01);
    }

    @Test
    void totalSales() {
        assertEquals(55000,company.totalSales());
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }



    @Test
    void findEmployeesHoursGraderThanTest(){
        Employee [] actual = company.findEmployeesHoursGraderThan(100);
        Employee [] expected = {e[0],e[1],e[2]};
        assertArrayEquals(expected,actual);
        company.printEmployees();
    }

    @Test
    void findEmployeesSalaryRangeTest(){
        company.printEmployees();
        Employee[]actual= company.findEmployeesSalaryRange(2900,6000);
        Employee [] expected = {e[0],e[2]};
        assertArrayEquals(expected,actual);
        System.out.println(Arrays.toString(actual));


    }
}

