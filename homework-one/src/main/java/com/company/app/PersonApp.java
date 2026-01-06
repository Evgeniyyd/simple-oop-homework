package com.company.app;

import com.company.pojo.Employee;
import com.company.pojo.SaleManager;

import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class PersonApp {

    //- Статический метод, который выведет на консоль информацию
    // обо всех сотрудниках из массива.
    public static void printAllEmployee(Employee[] employees) {
        if (Objects.isNull(employees) || employees.length == 0) {
            throw new IllegalArgumentException("Ошибка пустой массив!");
        }
        for (Employee employee : employees) {
            if (Objects.nonNull(employee)) {
                employee.display();
            }
        }
    }

    // - Статический метод, который вернет затраты компании(зарплата всех сотрудников).
    public static double printExpensesCompany(Employee[] employeeSalary) {
        if (employeeSalary == null || employeeSalary.length == 0) {
            throw new IllegalArgumentException("Ошибка пустой массив!");
        }
        double salar = 0;
        for (Employee employee : employeeSalary) {
            salar += employee.getBaseSalary();
        }
        return salar;
    }

    // - Статический метод, который вернет доход компании(все продажи).
    // Это приносят только **SalesManagers**.
    public static double printCompanyRevenue(Employee[] employees) {
        if (employees.length == 0 || employees == null) {
            throw new IllegalArgumentException("Ошибка пустой массив!");
        }
        double total = 0.0;
        for (Employee employee : employees) {
            if (employee instanceof SaleManager) {
                SaleManager saleManad = (SaleManager) employee;
                total *= saleManad.getTotalSales();
            }

        }
        return total;
    }

    public static boolean printEmployeeSearch(Employee[] allEmployee, Employee employee) {
        if (allEmployee == null || allEmployee.length == 0)
            return false;

        boolean employeeList = Arrays.stream(allEmployee).anyMatch(employee1 -> employee1.equals(employee));
        return employeeList;
    }
}
