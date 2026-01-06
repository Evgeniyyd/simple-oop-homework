package com.company.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Getter
public class SaleManager extends Employee {
    private double totalSales;
    private double bonus;


    public SaleManager(String name, int age, boolean married, String company, String position, double baseSalary, double totalSales, double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        double baseSalary = getBaseSalary();

        if (baseSalary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрецательной");
        }

        return baseSalary + totalSales * bonus / 100;
    }
}
