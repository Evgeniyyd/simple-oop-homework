package com.company.pojo;

import lombok.Getter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee {
    @Getter
    private int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        setGrade(grade);
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 6) {
            this.grade = grade;
        }
    }

    @Override
    public double calculateSalary() {
        double baseSalary = getBaseSalary();
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрецательной");
        }

        return baseSalary * grade;
    }
}

