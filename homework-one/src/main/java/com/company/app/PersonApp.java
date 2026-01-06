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
    public static double getSumSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            throw new IllegalArgumentException("Ошибка пустой массив!");
        }
        double salar = 0;
        for (Employee employee : employees) {
            salar += employee.calculateSalary();
        }
        return salar;
    }

    // - Статический метод, который вернет доход компании(все продажи).
    // Это приносят только **SalesManagers**.
    public static double sumCompanyRevenue(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            throw new IllegalArgumentException("Ошибка пустой массив!");
        }
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee instanceof SaleManager) {
                SaleManager saleManager = (SaleManager) employee;
                sum += saleManager.getTotalSales();
            }
        }
        return sum;
    }

    public static boolean employeeSearch(Employee[] employees, Employee employee) {
        if (employees == null || employees.length == 0) {
            return false;
        }
      return   Arrays.asList(employees).contains(employee);
    }
}
