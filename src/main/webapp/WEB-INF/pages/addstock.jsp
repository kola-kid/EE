<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %-->
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Stock</title>
</head>
<body>
<div class = "container">
    <h2 class="welcomeText">Add Flower</h2>
    <form method="post">
        <div class = "mainInput">
            <input type="text" name="name" placeholder="name"/>
        </div>
        <div class = "mainInput">
            <input type = "number" step="0.5" min="1" name="price" placeholder="price"/>
        </div>
        <div class = "mainInput">
            <input type = "number" name="val" min="1" placeholder="val"/>
        </div>
        <br>
        <input class ="Submit" type="submit" name="submit" value="Add Flower"/>
    </form>
</div>
</body>
</html>