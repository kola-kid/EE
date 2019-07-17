<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %-->
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Order</title>
</head>
<body>
<div class = "container">
    <h2 class="welcomeText">Create new order</h2>
    <form method="post">
        <div class = "mainInput">
            <input type="number" min="0" name="userId" placeholder="userId"/>
        </div>
        <div class = "mainInput">
            <input type = "number" min="0" name="flowerId" placeholder="flowerId"/>
        </div>
        <div class = "mainInput">
            <input type = "number" min="1" name="totalPrice" placeholder="Total_price"/>
        </div>
        <div class="mainInput">
            <input type="date" name="openDate" placeholder="Open_date"/>
        </div>
        <div class="mainInput">
            <input type="date" name="closeDate" placeholder="Close_date"/>
        </div>
        <div class="mainInput">
            <input type="text" name="status" placeholder="Status">
        </div>
        <br>
        <input class ="Submit" type="submit" name="submit" value="Order"/>
    </form>
</div>
</body>
</html>