package com.company.pojo;

public abstract class Employee extends Person {
    private String company;
    private String position;
    private  double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
  public abstract double  calculateSalary();

    @Override
    public void display() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Employee:" + "\n" +
                "company= " + company +
                ", position= " + position +
                ", baseSalary= " + baseSalary;
    }
}
