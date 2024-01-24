package com.emanager.bb.models;

import java.time.LocalDate;

public class BaseEmployee {

    private Integer id;
    private final String name;
    private final int age;
    private final String telephone;
    private final String email;
    private final LocalDate startedAt;
    private final double salary;
    private final Gender gender;

    public BaseEmployee(String name, int age, String telephone, String email, LocalDate startedAt, double salary, Gender gender) {
        this.age = age;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.startedAt = startedAt;
        this.salary = salary;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getStartedAt() {
        return startedAt;
    }

    public double getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", startedAt=" + startedAt +
                ", salary=" + salary +
                ", gender=" + gender + ", ";
    }
}
