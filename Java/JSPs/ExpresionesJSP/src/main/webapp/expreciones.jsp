<%-- 
    Document   : expreciones
    Created on : 28 ene 2023, 10:06:16
    Author     : Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>

    </head>
    <body>
        <h1>JSP con Expresiones</h1>
        Contacatenacion: <%= "Saludo"+ " " + "JSPs" %>
        <br>
        Operacion matematica: <%= 2 * 4 / 2 * 5 %>
        <br>
        Session ID: <%= session.getId() %>
        <hr>
        <a href="index.html">Volver al Inicio </a>
    </body>
</html>
