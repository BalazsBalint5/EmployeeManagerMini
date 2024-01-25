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
        return ("""
                Employee:
                    id: %d
                    name: %s
                    age: %d
                    telephone: %s
                    email: %s
                    startedAt: %s
                    salary: %.1f
                    gender: %s
                """.formatted(id,name,age,telephone,email,startedAt,salary,gender));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEmployee that = (BaseEmployee) o;

        if (getAge() != that.getAge()) return false;
        if (Double.compare(that.getSalary(), getSalary()) != 0) return false;
        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getTelephone() != null ? !getTelephone().equals(that.getTelephone()) : that.getTelephone() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(that.getEmail()) : that.getEmail() != null) return false;
        if (getStartedAt() != null ? !getStartedAt().equals(that.getStartedAt()) : that.getStartedAt() != null)
            return false;
        return getGender() == that.getGender();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getAge();
        result = 31 * result + (getTelephone() != null ? getTelephone().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getStartedAt() != null ? getStartedAt().hashCode() : 0);
        temp = Double.doubleToLongBits(getSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getGender() != null ? getGender().hashCode() : 0);
        return result;
    }
}
