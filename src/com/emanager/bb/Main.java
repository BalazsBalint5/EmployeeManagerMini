package com.emanager.bb;

import com.emanager.bb.models.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Manager man1 = new Manager("Thomas", 45, "063034349", "manager1email",
                LocalDate.now(), 10000.0, Gender.MALE);

        Programmer pr1 = new Programmer("Jane", 28, "042321321",
                "programmer@email", LocalDate.now(), 50000.0, Gender.FEMALE, "post-it");
        Programmer pr2 = new Programmer("Jack", 28, "042321321",
                "programmer@email", LocalDate.now(), 50000.0, Gender.MALE, "post-it");

        Meeting met1 = new Meeting("morning meeting", LocalDateTime.now());
        System.out.println(pr1);
        man1.addMeeting(met1);
        System.out.println(man1);

        BaseEmployee bs1 = new BaseEmployee("Bs1", 22, "07383833", "email", LocalDate.now(), 100.0, Gender.MALE);

    }
}