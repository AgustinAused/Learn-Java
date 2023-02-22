<%-- 
    Document   : manejoErrores
    Created on : 18 feb 2023, 12:55:25
    Author     : Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de Errores</title>
    </head>
    <body>
        <h1>Manejo de Errores</h1>
        <br/>
        <p> Ha ocurrido un problema: <%= exception.getMessage()%></p>
        <br/>
        <textarea id="id" name="name" rows="5" cols="10">
            <pre>
                <% exception.printStackTrace(new PrintWriter(out)); %>
            </pre>
        </textarea>
    </body>
</html>
