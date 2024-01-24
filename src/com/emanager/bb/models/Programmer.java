package com.emanager.bb.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Programmer extends BaseEmployee{

    private final String activeProject;
    private final HashSet<ProgramLanguages> programLanguages;
    private final HashSet<Programmer> teamProgrammers;

    public Programmer(String name, int age, String telephone, String email, LocalDate startedAt, double salary, Gender gender, String activeProject) {
        super(name, age, telephone, email, startedAt, salary, gender);
        this.activeProject = activeProject;
        this.programLanguages = new HashSet<>();
        this.teamProgrammers = new HashSet<>();
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
            System.out.println("The programming language parameter can't be null! Try again with different data!");
        }
    }

    public void addTeamProgrammers(Programmer employee) {

        if(employee != null) {
            teamProgrammers.add(employee);
        }
    }

    public void removeTeamProgrammers(Programmer employee) {
        try{
            programLanguages.remove(employee);
        } catch (NoSuchElementException e) {
            System.out.println("There is no such programmer colleague in the list like: " + employee);
        } catch (NullPointerException e) {
            System.out.println("The employee parameter can't be null! Try again with different data!");
        }
    }

    public HashSet<Programmer> getTeamProgrammers() {
        return new HashSet<>(teamProgrammers);
    }

    @Override
    public String toString() {
        return super.toString() + " Programmer{ " +
                "activeProject= '" + activeProject + '\'' +
                ", programLanguages= " + programLanguages +
                ", teamProgrammers= " + teamProgrammers +
                " }";
    }
}
