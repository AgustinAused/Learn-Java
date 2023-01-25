<%-- 
    Document   : index
    Created on : 25 ene 2023, 13:22:06
    Author     : Agustin
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title> Hola Mundo JSP</title>
    </head>
    <body>
        <h1>Hola mundo</h1>
        
        
        <ul>
            <li> <% out.print("Hola mundo con Scriplets "); %></li>
            <li> ${"Hola Mundo con Expression Language (EL)"} </li>
            <li> <%= "Hola Mundo con Expression" %> </li>
            <li> <c:out value="HolaMundo con JSTL" /> </li>
            <li></li>
            <li></li>
        </ul>
    </body>
</html>
