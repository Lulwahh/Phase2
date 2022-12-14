package com.example.learnersacademy2;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.*;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get request parameters for userID and password
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");


        if(user.length()>5){
            Cookie loginCookie = new Cookie("user",user);
            //setting cookie to expiry in 30 mins
            loginCookie.setMaxAge(30*60);
            response.addCookie(loginCookie);
            response.sendRedirect("menu.jsp");
        }else{
//            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
//            PrintWriter out= response.getWriter();
            response.sendRedirect("ERROR.jsp");
//            rd.include(request, response);
        }

    }

}
