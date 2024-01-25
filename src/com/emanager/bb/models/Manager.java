package com.emanager.bb.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Manager extends BaseEmployee{

    private List<BaseEmployee> employees;
    private List<Meeting> futureMeetings;

    public Manager(String name, int age, String telephone, String email, LocalDate startedAt, double salary, Gender gender) {
        super(name, age, telephone, email, startedAt, salary, gender);
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
        try {
            employees.add(employee);
            System.out.println("Employee: " + '(' + employee.getName() + ')' + " successfully added to the employee list");
        } catch (NullPointerException e) {
            System.out.println("Employee can't be null. Please try again with valid data!");
        }
    }

    public void removeEmployee(BaseEmployee employee) {
        try {
            employees.remove(employee);
            System.out.println("Employee: " + '(' + employee.getName() + ')' + " successfully removed from the employee list");
        } catch (NullPointerException e) {
            System.out.println("Employee can't be null. Please try again with valid data!");
        } catch (NoSuchElementException e) {
            System.out.println("Couldn't removed the employee: " + '(' + employee.getName() + ')' + " Couldn't found such meeting");
        }
    }

    public void addMeeting(Meeting meeting) {
        if(meeting != null) {
            futureMeetings.add(meeting);
            System.out.println("Meeting successfully added to the list!");
        } else {
            System.out.println("Meeting can't be null. Please try again with valid data!");
        }
    }

    public void removeMeeting(Meeting meeting) {
        try {
            futureMeetings.remove(meeting);
            System.out.println("Meeting was removed successfully!");
        } catch (NullPointerException e) {
            System.out.println("Meeting can't be null. Please try again with valid data!");
        } catch (NoSuchElementException e) {
            System.out.println("Couldn't removed the meeting. Couldn't found such meeting");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        if (getEmployees() != null ? !getEmployees().equals(manager.getEmployees()) : manager.getEmployees() != null)
            return false;
        return getFutureMeetings() != null ? getFutureMeetings().equals(manager.getFutureMeetings()) : manager.getFutureMeetings() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getEmployees() != null ? getEmployees().hashCode() : 0);
        result = 31 * result + (getFutureMeetings() != null ? getFutureMeetings().hashCode() : 0);
        return result;
    }

    public String toString() {
        return super.toString() + """
                    Role: Manager
                    Employees:
                    Meetings: %s
                """.formatted(futureMeetings.toString());
    }
}
