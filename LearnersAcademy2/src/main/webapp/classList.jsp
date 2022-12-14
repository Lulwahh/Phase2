<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.ArrayList"%>
<%@page import="com.example.learnersacademy2.Class"%>
<%@page import="com.example.learnersacademy2.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class List</title>
    <link type="text/css" rel="stylesheet" href="css/styleAll.css">
</head>
<body style="background-image: url('css/background.jpg');">
<br><br>
<div class="container">
    <center> <h2>View All Classes</h2>
        <%--        <p>While Inserting New Student The System Will Assign The New Student to a Class</p>--%>
    </center>
</div><br><br>
<div class="container" >
<table border ="1" width="500" align="center">
         <tr bgcolor="FFEE88">
          <th><b>ClassID</b></th>
          <th><b>Section</b></th>
          <th><b>Time</b></th>
         </tr>
        <%ArrayList<Class> classeslist =
            (ArrayList<Class>)request.getAttribute("classesList");
        for(Class c:classeslist){%>
            <tr>
                <td><%=c.getId()%></td>
                <td><%=c.getSection()%></td>
                <td><%=c.getTime()%></td>
            </tr>
            <%}%>
        </table>
    </div>


</body>
</html>