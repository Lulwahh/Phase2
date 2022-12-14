<!DOCTYPE html>
<html>
<head>
    <meta charset="US-ASCII">
    <title>Login Page</title>
    <link type="text/css" rel="stylesheet" href="css/login.css">
</head>
<body style="background-image: url('css/background.jpg');">
<br>
<center> <h1> Admin Login </h1> </center>
<form action="LoginServlet" method="post">
    <div class="container">
        <input type="hidden" name="command" value="LOGIN" />
        <label>Username : </label>
        <br/>
        <input type="text" placeholder="Enter Username" name="user" required>
        <br/>
        <label>Password : </label>
        <br/>
        <input type="password" placeholder="Enter Password" name="pwd" required>
        <br/>
        <button type="submit">Login</button>
        <br/>

    </div>
</form>

</body>
</html>

<%----%>