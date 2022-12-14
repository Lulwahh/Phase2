package com.example.learnersacademy2;

public class Class {
    Integer id;
    Integer section;
    String time;
    Integer teacherID;
    Integer subjectID;

    public Class(Integer id, Integer section, String time, Integer teacherID, Integer subjectID) {
        this.id=id;
        this.section = section;
        this.time = time;
        this.teacherID = teacherID;
        this.subjectID = subjectID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public Integer getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(Integer subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public String toString() {
        return "Class Details {" +
                "Class ID: " + id +
                ", Class Section: " + section +
                ", Class Time: '" + time + '\'' +
                ", TeacherID: " + teacherID +
                ", SubjectID: " + subjectID +
                '}';
    }
}
