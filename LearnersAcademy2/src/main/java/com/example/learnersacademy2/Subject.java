package com.example.learnersacademy2;


public class Subject {

    Integer id;
    String sname;
    String shortname;

    public Subject(Integer id,String sname, String shortname) {
        this.id=id;
        this.sname = sname;
        this.shortname = shortname;
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

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @Override
    public String toString() {
        return "Subject Details{" +
                "Subject ID: " + id +
                ", Subject Name: '" + sname + '\'' +
                ", Subject ShortName'" + shortname + '\'' +
                '}';
    }
}
