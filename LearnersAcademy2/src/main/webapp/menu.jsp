<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.example.learnersacademy2.getConnection"%>
<%@page import="com.example.learnersacademy2.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
    <link type="text/css" rel="stylesheet" href="css/login.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body style="background-image: url('css/background.jpg');">
<br>
<div class="container" >
    <center> <h2>Learner's Academy Admin Portal</h2></center>
    <br>
    <div class="btn-group btn-group-justified" style="boarder: 0px" >
        <a href="GetStudentsServlet " class="btn btn-default" style="background-color: rosybrown; color: white" >View All Students</a>
        <a href="GetTeachersServlet" class="btn btn-default" style="background-color: rosybrown; color: white">View All Teachers</a>
        <a href="GetSubjectServlet" class="btn btn-default" style="background-color: rosybrown; color: white">View All Subjects</a>
        <a href="GetClassServlet" class="btn btn-default" style="background-color: rosybrown; color: white">View All Classes</a>
    </div>
</div>
<br>
<div class="container" >
<%--    <center> <h3>Learner's Academy Admin Portal</h3></center>--%>
    <div class="btn-group btn-group-justified" style="boarder: 0px" >
        <center><a href="InsertStudent.jsp" class="btn btn-default" style="background-color: rosybrown; color: white; scale: 1.1">Insert New Student</a>
            <br>
            <br>
            <a href="InsertTeacher.jsp" class="btn btn-default" style="background-color: rosybrown; color: white; scale: 1.1">Insert New Teacher</a>
            <br>
            <br>
            <a href="InsertSubject.jsp" class="btn btn-default " style="background-color: rosybrown; color: white; scale: 1.1">Insert New Subject</a>
            <br>
            <br>
            <a href="GetClassServletForInsert" class="btn btn-default" style="background-color: rosybrown; color: white; scale: 1.1">  Insert New Class  </a>
        </center>
    </div>
</div> <br>

<center>
    <a href="index.jsp" class="btn btn-defaultb" style="background-color: rosybrown; color: white">Logout</a>
</center>




</body>
</html>