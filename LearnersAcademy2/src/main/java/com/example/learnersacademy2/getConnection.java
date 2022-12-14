package com.example.learnersacademy2;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class getConnection {
    public static final String DB_URLTOCONNECT ="jdbc:mysql://localhost:3306/LearnerAcademy";
    public static final String DB_USERNAME ="root";
    public static final String DB_PASS="Root1234";
    static private Connection dbCon;
    static private String qry;
    static private PreparedStatement preparedStatement;
    static private Statement theStatement;
    static private ResultSet myRs;
    static public  ArrayList<Student> students = new ArrayList();

    public static void main(String[] args) {
        try {

//			ArrayList<Student> students = new ArrayList();
//			Load the driver
            java.lang.Class.forName("com.mysql.cj.jdbc.Driver");
//			Try to establish the connection
            dbCon = (Connection) DriverManager.getConnection(DB_URLTOCONNECT, DB_USERNAME, DB_PASS);
            System.out.println("connected successfully");
            theStatement = dbCon.createStatement();
            students= getStudents(students);
            for(Student student:students) {
                System.out.println(student.id);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Can't load the driver : " + e.getMessage());
        }catch(SQLException e) {
            System.out.println("Can't connect, some issues  : " + e.getMessage());
        }
    }

    public static ArrayList<Student> getStudents(ArrayList<Student> students) {
        try {
            qry= "SELECT * FROM students";
            //myStmt = myConn.createStatement();

            while (myRs.next()) {
                myRs = theStatement.executeQuery(qry);
                // retrieve data from result set row
                int id = myRs.getInt("id");
                String sname = myRs.getString("sname");
                String major = myRs.getString("major");
                int classID = myRs.getInt("classID");

                // create new student object
                Student tempStudent = new Student(id, sname, major, classID);

                // add it to the list of students
                students.add(tempStudent);

            }
        } catch (Exception e) {
            System.out.println("Technical Issues While Getting Students: " + e.getMessage());
        }
        return students;
    }

}
