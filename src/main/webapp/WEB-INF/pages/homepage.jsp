<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %-->
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<div class = "container">
    <h2 class="welcomeText">Home Page</h2>
    <form method="post">
        <div class = "mainInput">
            <input type="text" name="login" placeholder="login"/>
        </div>
        <div class = "mainInput">
            <input type = "email" name="email" placeholder="email"/>
        </div>
        <div class = "mainInput">
            <input type = "password" name="password" placeholder="password"/>
        </div>
        <div class="mainInput">
            <input type="text" name="fullName" placeholder="Full_name"/>
        </div>
        <br>
        <input class ="Submit" type="submit" name="submit" value="Over"/>
    </form>
</div>
</body>
</html>