<%-- 
    Document   : index
    Created on : 8 mar 2023, 11:28:24
    Author     : Agustin
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Estatica </title>
    </head>
    <body>
        <h1>Ejemplo Inclusion Estatica</h1>
        
        <ul>
            <li><%@include file="paginas/noticias1.html"  %></li>
            <li><%@include file="paginas/noticias2.jsp"  %></li>
            <li>third</li>
        </ul>

    </body>
</html>
