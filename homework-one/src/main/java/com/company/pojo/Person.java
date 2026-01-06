package com.company.pojo;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public abstract class Person {
    private int age;
    private String name;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;
    }

    public void display() {
        System.out.println(this.toString());

    }

}
