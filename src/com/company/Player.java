package com.company;

public class Player {
    //Fields
    private String fname;
    private String lname;
    private int age;
    private int team;

    //Constructor
    public Player(String fname, String lname, int age, int team) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.team = team;
    }

    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public int getAge() {
        return age;
    }
    public int getTeam() {
        return team;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTeam(int team) {
        this.team = team;
    }
    //ToString
    public String toString() {
        return("First name: " + fname + "\nLast name: " + lname + "\nAge: " + age + "\nTeam: " + team);
    }
}
