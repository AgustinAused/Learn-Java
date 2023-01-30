<%-- 
    Document   : scrpitlets
    Created on : 28 ene 2023, 11:08:00
    Author     : Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <br>
        <br>
        <%-- Scriptlest para enviar informacion al navegador --%>
        <%
            out.print("Saludos Desde un Scriptlest");
         %>
         <%-- Scriptlest para manipular los ombjetos implicitos --%>
         <% 
            String nombreAplicacion = request.getContextPath();
            out.print("<h1>Nombre de la Aplicacion: " + nombreAplicacion + "</h1>");
         %>
         <br>
         <%--Scriptlet con codigo condicionado --%>
         <% 
            if (session != null && session.isNew() ){
         %>
         <p style="font-size:20px"> La session es nueva</p>
         <%
            }else{
         %>
         <p style="font-size:20px"> La session No es nueva</p>
         <% } %>
        <p></p>
    </body>
</html>
