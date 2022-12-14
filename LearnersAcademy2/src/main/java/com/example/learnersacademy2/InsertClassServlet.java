package com.example.learnersacademy2;

import java.util.*;
import java.sql.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;

@WebServlet({"/InsertClassServlet"})
public class InsertClassServlet extends HttpServlet {
    public static final String DB_URLTOCONNECT ="jdbc:mysql://localhost:3306/LearnerAcademy";
    public static final String DB_USERNAME ="root";
    public static final String DB_PASS="Root1234";
    static private Connection dbCon;
    static private String qry;
    static private PreparedStatement preparedStatement;
    static private Statement theStatement;
    static private ResultSet myRs;
    private static final long serialVersionUID = 1L;
    public InsertClassServlet() {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        int section = Integer.parseInt(request.getParameter("section"));
        String time = request.getParameter("time");
        int teacherID = Integer.parseInt(request.getParameter("teacherID"));
        int subjectID = Integer.parseInt(request.getParameter("subjectID"));
        try {
            java.lang.Class.forName("com.mysql.cj.jdbc.Driver");
            dbCon = DriverManager.getConnection(DB_URLTOCONNECT, DB_USERNAME, DB_PASS);
            System.out.println("connected successfully");
            qry = "insert into classes VALUES (?,?,?,?,?)";
            preparedStatement = dbCon.prepareStatement(qry);
            preparedStatement.setNull(1, 0);
            preparedStatement.setInt(2, section);
            preparedStatement.setString(3, time);
            preparedStatement.setInt(4, teacherID);
            preparedStatement.setInt(5, subjectID);

            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("class inserted successfully");
                response.sendRedirect("menu.jsp");
            }
        } catch (ClassNotFoundException var6) {
            var6.printStackTrace();
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

    }

}
