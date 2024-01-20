package com.emanager.bb;

import com.emanager.bb.models.Gender;
import com.emanager.bb.models.Manager;
import com.emanager.bb.models.Meeting;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager man1 = new Manager("Manager", 45, "063034349", "manager1email",
                LocalDate.now(), 10000.0, Gender.MALE);

        Meeting meet1 = new Meeting("Morning meeting", LocalDate.now());
        Meeting meet2 = new Meeting("Night meeting", LocalDate.now());

        meet1.addAttendee(man1);

        man1.addMeeting(null);
        man1.addMeeting(meet1);
        man1.removeMeeting(meet2);

        System.out.println(meet1);
    }
}