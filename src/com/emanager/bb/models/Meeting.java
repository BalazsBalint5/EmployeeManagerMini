package com.emanager.bb.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Meeting {

    private String meetingDescription;
    private LocalDate startTime;
    private List<BaseEmployee> attendees;

    public Meeting(String meetingDescription, LocalDate startTime, List<BaseEmployee> attendees) {
        this.meetingDescription = meetingDescription;
        this.startTime = startTime;
        this.attendees = new ArrayList<>();
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
