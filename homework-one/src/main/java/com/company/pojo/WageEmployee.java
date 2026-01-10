package com.company.pojo;

import lombok.ToString;
import lombok.EqualsAndHashCode;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class WageEmployee extends Employee {
    private double wage;
    private double hours;

    public WageEmployee(String name, int age, boolean married, String company, String position, double baseSalary, double hours, double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    public double calculateSalary() {
        double salary = getBaseSalary();
        if (salary < 0){
            throw  new IllegalArgumentException("Зарплата не может быть отрецательной");
        }
        return salary + (hours * wage);
    }
}
