package com.emanager.bb.models;

import java.time.LocalDate;

public class BaseEmployee {

    private Integer id;
    private String name;
    private String telephone;
    private String email;
    private LocalDate startedAt;
    private double salary;

    public BaseEmployee(String name, String telephone, String email, LocalDate startedAt, double salary) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.startedAt = startedAt;
        this.salary = salary;
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
}
