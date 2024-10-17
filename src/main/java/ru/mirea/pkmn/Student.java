package ru.mirea.KozlovAR.pkmn;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String familyName;
    private String group;
    private String firstName;
    private String surName;

    public Student(String familyName, String group, String firstName, String surName) {
        this.familyName = familyName;
        this.group = group;
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "familyName='" + familyName + '\'' +
                ", group='" + group + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
