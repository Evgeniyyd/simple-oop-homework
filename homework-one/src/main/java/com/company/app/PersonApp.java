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
        Arrays.stream(employees).filter(Objects::nonNull).forEach(Employee::display);
    }

    // - Статический метод, который вернет затраты компании(зарплата всех сотрудников).
    public static double getSumSalary(Employee[] employees) {
        double sum = Arrays.stream(employees).filter(Objects::nonNull).mapToDouble(Employee::calculateSalary).sum();
        return sum;
    }

    // - Статический метод, который вернет доход компании(все продажи).
    // Это приносят только **SalesManagers**.
    public static double sumCompanyRevenue(Employee[] employees) {
        double sum = Arrays.stream(employees).filter(Objects::nonNull).filter(employee -> employee instanceof SaleManager).map(employee ->
                (SaleManager) employee).mapToDouble(SaleManager::getTotalSales).sum();
        return sum;
    }

    public static boolean employeeSearch(Employee[] employees, Employee employee) {
      return   Arrays.stream(employees).filter(Objects::nonNull).anyMatch(employee1 -> Objects.equals(employee1,employee));
    }
}
