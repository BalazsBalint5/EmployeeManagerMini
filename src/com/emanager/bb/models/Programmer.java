package com.emanager.bb.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Programmer extends BaseEmployee{

    private String activeProject;
    private List<ProgramLanguages> programLanguages;
    private List<Programmer> teamColleagues;

    public Programmer(int age, String name, String telephone, String email, LocalDate startedAt, double salary, Gender gender, String activeProject, List<ProgramLanguages> programLanguages, List<Programmer> teamColleagues) {
        super(name, age, telephone, email, startedAt, salary, gender);
        this.activeProject = activeProject;
        this.programLanguages = new ArrayList<>();
        this.teamColleagues = teamColleagues;
    }

    public String getActiveProject() {
        return activeProject;
    }

    public List<ProgramLanguages> getProgramLanguages() {
        return programLanguages;
    }

    public List<Programmer> getTeamColleagues() {
        return teamColleagues;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "activeProject='" + activeProject + '\'' +
                ", programLanguages=" + programLanguages +
                ", teamColleagues=" + teamColleagues +
                '}';
    }
}
