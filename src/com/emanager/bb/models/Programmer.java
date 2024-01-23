package com.emanager.bb.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Programmer extends BaseEmployee{

    private String activeProject;
    private HashSet<ProgramLanguages> programLanguages;
    private HashSet<Programmer> teamColleagues;

    public Programmer(String name, int age, String telephone, String email, LocalDate startedAt, double salary, Gender gender, String activeProject) {
        super(name, age, telephone, email, startedAt, salary, gender);
        this.activeProject = activeProject;
        this.programLanguages = new HashSet<>();
        this.teamColleagues = new HashSet<>();
    }

    public String getActiveProject() {
        return activeProject;
    }

    public HashSet<ProgramLanguages> getProgramLanguages() {
        return new HashSet<>(programLanguages);
    }

    public void addProgrammingLanguage(ProgramLanguages programLanguage) {

        if(programLanguage != null){
            programLanguages.add(programLanguage);
        }
    }

    public void removeProgrammingLanguage(ProgramLanguages programLanguage){

        try{
            programLanguages.remove(programLanguage);
        } catch (NoSuchElementException e) {
            System.out.println("There is no such programming language in the list like: " + programLanguage);
        } catch (NullPointerException e) {
            System.out.println("The programming language can't be null! Try again with different data!");
        }
    }

    public HashSet<Programmer> getTeamColleagues() {
        return new HashSet<>(teamColleagues);
    }

    @Override
    public String toString() {
        return super.toString() + " Programmer{ " +
                "activeProject= '" + activeProject + '\'' +
                ", programLanguages= " + programLanguages +
                ", teamColleagues= " + teamColleagues +
                " }";
    }
}
