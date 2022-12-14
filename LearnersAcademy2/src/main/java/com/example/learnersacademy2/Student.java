package com.example.learnersacademy2;

public class Student {
    public Integer id;
    public String sname;
    public String major;
    public Integer classID;

    public Student(Integer id, String sname, String major, Integer classID) {
        this.id = id;
        this.sname = sname;
        this.major = major;
        this.classID = classID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    @Override
    public String toString() {
        return "Student Details {" +
                "Student ID: " + id +
                ", Student Name: '" + sname + '\'' +
                ", Major: '" + major + '\'' +
                ", Class: " + classID +
                '}';
    }
}
