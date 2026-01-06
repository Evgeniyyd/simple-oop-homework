package com.company.pojo;

import lombok.EqualsAndHashCode;
import lombok.ToString;
@EqualsAndHashCode
@ToString
public class Manager extends Employee {
   private int grade;

    public Manager(String name, int age, boolean married, String company, String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void display() {
        System.out.println(this.toString());

    }
    @Override
    public String toString() {
        return "Manager:" + "\n" +
                "grade= " + grade;
    }

    public double calculateSalary() {
        double baseSalary = getBaseSalary();
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Ошибка пустой массив");
        }
        return baseSalary * grade;
    }
}
