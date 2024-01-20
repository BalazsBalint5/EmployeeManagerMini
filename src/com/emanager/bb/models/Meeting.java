package com.emanager.bb.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Meeting {

    private String meetingDescription;
    private LocalDate startTime;
    private List<BaseEmployee> attendees;

    public Meeting(String meetingDescription, LocalDate startTime) {
        this.meetingDescription = meetingDescription;
        this.startTime = startTime;
        this.attendees = new ArrayList<>();
    }

    public void addAttendee(BaseEmployee employee) {

        try{
            attendees.add(employee);
        } catch (NullPointerException e) {
            System.out.println("Employee can't be null! Please try again with valid data!");
        }
    }

    public void removeAttendee(BaseEmployee employee) {

        try{
            attendees.remove(employee);
        } catch (NullPointerException e) {
            System.out.println("Employee can't be null. Please try again with valid data!");
        } catch (NoSuchElementException e) {
            System.out.println("Couldn't removed the employee. Couldn't found such employee");
        }
    }

    public String getMeetingDescription() {
        return meetingDescription;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public List<BaseEmployee> getAttendees() {
        return attendees;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingDescription='" + meetingDescription + '\'' +
                ", startTime=" + startTime +
                ", attendees=" + attendees +
                '}';
    }
}
