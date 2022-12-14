<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.learnersacademy2.Teacher" %>
<%@ page import="com.example.learnersacademy2.Subject" %>
<%@ page import="com.example.learnersacademy2.Class" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Class</title>
    <link type="text/css" rel="stylesheet" href="css/styleAll.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body style="background-image: url('css/background.jpg');">

<form action="InsertClassServlet" align="center">
    <div class="container" >
        <center><h2>Learner's Academy Admin Portal</h2></center>
        <br>
        <div class="btn-group btn-group-justified" >
            <a href="menu.jsp " class="btn btn-default" style="background-color: rosybrown; color: white" >Back to Menu</a>
            <a href="GetStudentsServlet " class="btn btn-default" style="background-color: rosybrown; color: white" >View All Students</a>
            <a href="GetTeachersServlet" class="btn btn-default" style="background-color: rosybrown; color: white">View All Teachers</a>
            <a href="GetSubjectServlet" class="btn btn-default" style="background-color: rosybrown; color: white">View All Subjects</a>
            <a href="GetClassServlet" class="btn btn-default" style="background-color: rosybrown; color: white">View All Classes</a>
        </div>
    </div>
    <br>
    <br>
    <div class="container">
        <h2>Insert New Class</h2>
        <p>While Inserting New Class The System Will Assign The New Class to a Teacher and a Subject</p>

    </div>
    <br>
    <br>

    <div class="container">
        <label>Class Section:</label>
        <input type="text" placeholder="Class Section" name="section"><br>
        <label>Class time: Ex(1:00PM)</label>
        <input type="text" placeholder="Class Time" name="time"><br>
        <label>Assign Class to a Teacher:</label>
        <select name="teacherID">
            <option >Teacher</option>
            <option value="9110">Lulwah</option>
            <option value="9111">Ali</option>
            <option value="9112">Nourah</option>
        </select>
        <br>
        <label>Assign Class to a Subject:</label>
        <select name="subjectID">
            <option>Subject</option>
            <option value="100">Java</option>
            <option value="101">Business Writing</option>
            <option value="102">Accounting</option>
            <option value="103">Art</option>
            <option value="104">Physics</option>
            <option value="105">Intro in Law</option>
        </select> <br>
        <input type="submit" value="submit">
    </div>
</form>
</body>
</html>