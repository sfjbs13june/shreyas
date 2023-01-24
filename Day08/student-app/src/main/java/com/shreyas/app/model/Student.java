package com.shreyas.app.model;

public class Student {
    String name;
    String rollno;
    String std;
    String schoolname;

    public Student(String name, String rollno, String std, String schoolname) {
        this.name = name;
        this.rollno = rollno;
        this.std = std;
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }



}
