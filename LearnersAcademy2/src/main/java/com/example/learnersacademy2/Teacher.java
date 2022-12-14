package com.example.learnersacademy2;

public class Teacher {
    Integer id;
    String tname;
    String degree;

    public Teacher(Integer id, String tname, String degree) {
        this.id = id;
        this.tname = tname;
        this.degree = degree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Instructor Details {" +
                "Instructor ID: " + id +
                ", Instructor Name: '" + tname + '\'' +
                ", Instructor Degree: '" + degree + '\'' +
                '}';
    }
}

