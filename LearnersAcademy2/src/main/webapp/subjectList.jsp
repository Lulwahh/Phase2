<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.ArrayList"%>
<%@page import="com.example.learnersacademy2.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subjects List</title>
    <link type="text/css" rel="stylesheet" href="css/styleAll.css">
</head>
<body style="background-image: url('css/background.jpg');">
<br><br>
<div class="container">
    <center> <h2>View All Subjects</h2>
        <%--        <p>While Inserting New Student The System Will Assign The New Student to a Class</p>--%>
    </center>
</div><br><br>
<div class="container" >
<table border ="1" width="500" align="center">
         <tr bgcolor="FFEE88">
          <th><b>id</b></th>
          <th><b>Subject Name</b></th>
          <th><b>Short Name</b></th>
         </tr>
        <%ArrayList<Subject> subjectslist = 
            (ArrayList<Subject>)request.getAttribute("subjectsList");
        for(Subject s:subjectslist){%>
            <tr>
                <td><%=s.getId()%></td>
                <td><%=s.getSname()%></td>
                <td><%=s.getShortname()%></td>
            </tr>
            <%}%>
        </table>
</div>
</body>
</html>