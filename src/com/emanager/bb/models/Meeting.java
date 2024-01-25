package com.emanager.bb.models;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Meeting {

    private String meetingDescription;
    private LocalDateTime startTime;
    private List<BaseEmployee> attendees;

    public Meeting(String meetingDescription, LocalDateTime startTime) {
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public List<BaseEmployee> getAttendees() {
        return attendees;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedTime = startTime.format(formatter);

        return """
                Meeting description: %s, Start time: %s, attendees:""".formatted(meetingDescription, formattedTime);
    }
}
