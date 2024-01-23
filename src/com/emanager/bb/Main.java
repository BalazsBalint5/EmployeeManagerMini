package com.emanager.bb;

import com.emanager.bb.models.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager man1 = new Manager("Manager", 45, "063034349", "manager1email",
                LocalDate.now(), 10000.0, Gender.MALE);

        Programmer pr1 = new Programmer("Programmer", 28, "042321321",
                "programmer@email", LocalDate.now(), 50000.0, Gender.FEMALE, "post-it");
        Programmer pr2 = new Programmer("Jack", 28, "042321321",
                "programmer@email", LocalDate.now(), 50000.0, Gender.FEMALE, "post-it");

        man1.addEmployee(pr1);
        pr1.addProgrammingLanguage(ProgramLanguages.JAVA);
        HashSet<ProgramLanguages> hashSetPr = pr1.getProgramLanguages();
        hashSetPr.add(ProgramLanguages.ANGULAR);
        pr1.addProgrammingLanguage(ProgramLanguages.PHP);
        pr1.addProgrammingLanguage(null);

        System.out.println(pr1.getProgramLanguages());
        System.out.println(hashSetPr);
//        Meeting meet1 = new Meeting("Morning meeting", LocalDate.now());
//        Meeting meet2 = new Meeting("Night meeting", LocalDate.now());
//
//        meet1.addAttendee(man1);
//
//        man1.addMeeting(null);
//        man1.addMeeting(meet1);
//        man1.removeMeeting(meet2);


    }
}