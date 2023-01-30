<%-- 
    Document   : fondoColor
    Created on : 28 ene 2023, 11:07:28
    Author     : Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
    String fondo = request.getParameter("colorFondo");
    if (fondo == null || fondo.trim().equals("")){
        fondo= "white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSPs Cambio de color</title>
    </head>
    <body bgcolor=<%= fondo%>>
        <h1>JSPs Cambio de color</h1>
        <br>
        <br>
        <p style="font-size: 16px;">Color de fondo: <%= fondo %></p>
        <br>
        <a href="index.html">Volver al Inicio</a>
    </body>
</html>
