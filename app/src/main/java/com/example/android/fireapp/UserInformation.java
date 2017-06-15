package com.example.android.fireapp;

import java.util.ArrayList;

/**
 * Created by Yash Chowdhary on 04-06-2017.
 */

public class UserInformation {

    public String name;
    public String studentNumber;
    public String faculty;
    public boolean isAdmin;
    public String email;
    public boolean isGod;
    //public ArrayList<String> tournamentStatuses;

    //Define this constructor
    public UserInformation() {
        // Default constructor required for calls to DataSnapshot.getValue(UserInformation.class)
    }


    public boolean isGod() {
        return isGod;
    }

    public void setGod(boolean god) {
        isGod = god;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public ArrayList<String> getTournamentStatuses() {
        return tournamentStatuses;
    }

    public void setTournamentStatuses(ArrayList<String> tournamentStatuses) {
        this.tournamentStatuses = tournamentStatuses;
    }*/
}
