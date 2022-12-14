package com.example.learnersacademy2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet({"/GetTSCservlet"})
public class GetTSCservlet extends HttpServlet{
    public static final String DB_URLTOCONNECT ="jdbc:mysql://localhost:3306/LearnerAcademy";
    public static final String DB_USERNAME ="root";
    public static final String DB_PASS="Root1234";
    static private Connection dbCon;
    static private String qry;
    static private PreparedStatement preparedStatement;
    static private Statement theStatement;
    static private ResultSet myRs;
    private static final long serialVersionUID = 1L;
    public GetTSCservlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        List<Teacher> teachers = new ArrayList();
        List<Subject> subjects = new ArrayList();
        List<Class> classes = new ArrayList();

        try {
            java.lang.Class.forName("com.mysql.cj.jdbc.Driver");
            dbCon = DriverManager.getConnection(DB_URLTOCONNECT, DB_USERNAME, DB_PASS);
            System.out.println("connected successfully");
            qry = "select * from teachers";
            theStatement = dbCon.createStatement();
            myRs = theStatement.executeQuery(qry);

            while(myRs.next()) {
                int id = myRs.getInt("id");
                String techName = myRs.getString("tname");
                String techDegree = myRs.getString("degree");
                Teacher teacher = new Teacher(id,techName,techDegree);
                teachers.add(teacher);
            }

            request.setAttribute("teachersList", teachers);
            qry = "select * from classes";
            myRs = theStatement.executeQuery(qry);
            while(myRs.next()) {
                int id = myRs.getInt("id");
                int section = myRs.getInt("section");
                String classTime = myRs.getString("time");
                int classTeacher = myRs.getInt("teacherID");
                int classSub = myRs.getInt("subjectID");
                Class c = new Class(id,section,classTime,classTeacher,classSub);
                classes.add(c);
            }
            request.setAttribute("classesList", classes);
            qry = "select * from subjects";
            myRs = theStatement.executeQuery(qry);
            while(myRs.next()) {
                int id = myRs.getInt("id");
                String subname = myRs.getString("sname");
                String shortName = myRs.getString("shortName");

                Subject subject = new Subject(id,subname,shortName);
                subjects.add(subject);
            }
            request.setAttribute("subjectsList", subjects);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Newschedule.jsp");
            dispatcher.forward(request, response);
        } catch (ClassNotFoundException var8) {
            var8.printStackTrace();
        } catch (SQLException var9) {
            var9.printStackTrace();
        }

    }
}
