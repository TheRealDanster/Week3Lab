<%-- 
    Document   : ageCalculator
    Created on : 22-Sep-2020, 5:51:07 PM
    Author     : cprg352
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
            <p>${message}</p>
        </form>
        <a href="ArithmeticCalculatorServlet">Arithmetic Calculator</a>
    </body>
</html>
