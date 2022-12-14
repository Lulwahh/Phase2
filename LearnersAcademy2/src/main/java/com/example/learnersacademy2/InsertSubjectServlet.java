package com.example.learnersacademy2;
import java.util.*;
import java.sql.*;
import java.io.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;

@WebServlet({"/InsertSubjectServlet"})
public class InsertSubjectServlet extends HttpServlet{
    public static final String DB_URLTOCONNECT ="jdbc:mysql://localhost:3306/LearnerAcademy";
    public static final String DB_USERNAME ="root";
    public static final String DB_PASS="Root1234";
    static private Connection dbCon;
    static private String qry;
    static private PreparedStatement preparedStatement;
    static private Statement theStatement;
    static private ResultSet myRs;
    private static final long serialVersionUID = 1L;
    public InsertSubjectServlet() {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String sname = request.getParameter("sname");
        String shortName = request.getParameter("shortName");

        try {
            java.lang.Class.forName("com.mysql.cj.jdbc.Driver");
            dbCon = DriverManager.getConnection(DB_URLTOCONNECT, DB_USERNAME, DB_PASS);
            System.out.println("connected successfully");
            qry = "insert into subjects VALUES (?,?,?)";
            preparedStatement = dbCon.prepareStatement(qry);
            preparedStatement.setNull(1, 0);
            preparedStatement.setString(2, sname);
            preparedStatement.setString(3, shortName);
            if (preparedStatement.executeUpdate() > 0) {
                System.out.println("subject inserted successfully");
                response.sendRedirect("menu.jsp");
            }
        } catch (ClassNotFoundException var6) {
            var6.printStackTrace();
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

    }
}
