package com.emanager.bb.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends BaseEmployee{

    private List<BaseEmployee> employees;
    private List<Meeting> futureMeetings;

    public Manager(int age, String name, String telephone, String email, LocalDate startedAt, double salary, Gender gender, List<BaseEmployee> employees, List<LocalDate> futureMeetings) {
        super(age, name, telephone, email, startedAt, salary, gender);
        this.employees = new ArrayList<>();
        this.futureMeetings = new ArrayList<>();
    }

    public List<BaseEmployee> getEmployees() {
        return employees;
    }

    public List<Meeting> getFutureMeetings() {
        return futureMeetings;
    }

    public void addEmployee(BaseEmployee employee) {
        employees.add(employee);
    }

    public void removeEmployee(BaseEmployee employee) {
        employees.remove(employee);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employees=" + employees +
                ", futureMeetings=" + futureMeetings +
                '}';
    }
}
