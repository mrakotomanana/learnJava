package org.example.main;

import java.io.Serializable;
import java.math.BigDecimal;

public class Person implements Serializable {
    private String name;
    private int age;
    private BigDecimal salary;

    public Person(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Person setSalary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }
}
