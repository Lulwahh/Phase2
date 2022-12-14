<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList"%>
<%@page import="com.example.learnersacademy2.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teachers List</title> <link type="text/css" rel="stylesheet" href="css/styleAll.css">
</head>
<body style="background-image: url('css/background.jpg');">
<br><br>
<div class="container">
    <center> <h2>View All Teachers</h2>
        <%--        <p>While Inserting New Student The System Will Assign The New Student to a Class</p>--%>
    </center>
</div><br><br>
<div class="container" >
<table border ="1" width="500" align="center">
         <tr bgcolor="FFEE88">
          <th><b>id</b></th>
          <th><b>Name</b></th>
          <th><b>Degree</b></th>
         </tr>
        <%ArrayList<Teacher> teacherslist = 
            (ArrayList<Teacher>)request.getAttribute("teachersList");
        for(Teacher t:teacherslist){%>
            <tr>
                <td><%=t.getId()%></td>
                <td><%=t.getTname()%></td>
                <td><%=t.getDegree()%></td>
            </tr>
            <%}%>
        </table> 
</div>
</body>
</html>