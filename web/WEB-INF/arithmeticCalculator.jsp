<%-- 
    Document   : arithmeticCalculator
    Created on : 22-Sep-2020, 6:36:00 PM
    Author     : cprg352
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form name="frm" method="post">
            First: <input type="number" name="first"><br>
            Second: <input type="number" name="second"><br>
            <input type="submit" value="+" onclick="{document.frm.hdnbt.value=this.value;document.frm.submit();}">
            <input type="submit" value="-" onclick="{document.frm.hdnbt.value=this.value;document.frm.submit();}">
            <input type="submit" value="*" onclick="{document.frm.hdnbt.value=this.value;document.frm.submit();}">
            <input type="submit" value="%" onclick="{document.frm.hdnbt.value=this.value;document.frm.submit();}">
            <input type="hidden" name="hdnbt">
            <p>${message}</p>
        </form>
        <a href="AgeCalculatorServlet">Arithmetic Calculator</a>
    </body>
</html>
