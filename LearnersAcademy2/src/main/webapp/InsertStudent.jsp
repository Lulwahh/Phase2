<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert a New Student</title>
    <link type="text/css" rel="stylesheet" href="css/styleAll.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body style="background-image: url('css/background.jpg');">
<div style="display:flex;justify-content: center;align-items: center">

    <form action="InsertStudentServlet">

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
            <center> <h2>Insert New Student</h2>
            <p>While Inserting New Student The System Will Assign The New Student to a Class</p>
            </center>
        </div>
        <br>
        <br>
        <%--<input type="number" placeholder="ID" name="id">--%>
        <div class="container">
            <label>Student Name:</label>
            <input type="text" placeholder="Student Name" name="sname"><br><br>
            <label>Student Major:</label>
            <input type="text" placeholder="Major" name="major"><br><br>
            <label>Assign Student to a Class:</label>
            <input type="number" placeholder="classID" name="classID"> <label> </label> <input type="submit" value="submit"><br><br>
        </div>

</div>
</form>
</body>
</html>