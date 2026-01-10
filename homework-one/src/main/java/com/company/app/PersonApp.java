package com.company.app;

import com.company.pojo.Employee;
import com.company.pojo.SaleManager;
import lombok.NonNull;

import java.awt.*;
import java.util.Arrays;

public class PersonApp {

    //- Статический метод, который выведет на консоль информацию
    // обо всех сотрудниках из массива.
    public static void printAllEmployee(@NonNull Employee[] employees) {
        Arrays.stream(employees)
                .forEach(Employee::display);
    }

    // - Статический метод, который вернет затраты компании(зарплата всех сотрудников).
    public static double getSumSalary(@NonNull Employee[] employees) {
        return Arrays.stream(employees)
                .mapToDouble(Employee::calculateSalary)
                .sum();

    }

    // - Статический метод, который вернет доход компании(все продажи).
    // Это приносят только **SalesManagers**.
    public static double sumCompanyRevenue(@NonNull Employee[] employees) {
        return Arrays.stream(employees)
                .filter(employee -> employee.getClass().equals(SaleManager.class))
                .map(employee ->
                        (SaleManager) employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();

    }

    //
    public static boolean employeeSearch(@NonNull Employee[] employees, @NonNull Employee employee) {

        return Arrays.asList(employees).contains(employee);

    }
}