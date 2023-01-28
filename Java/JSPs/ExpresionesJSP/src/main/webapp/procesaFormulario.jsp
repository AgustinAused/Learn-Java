<%-- 
    Document   : procesoFormulario
    Created on : 28 ene 2023, 10:09:38
    Author     : Agustin
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultados de Procesar el Formulario</h1>
        <hr>

        <p style="font-size: 20px;">Usuario: <%= request.getParameter("usuario")%> </p> 
        <p style="font-size: 20px;">Password: <%= request.getParameter("password")%></p>
        
        <hr>
        <a href="index.html">Volver al Inicio</a>
    </body>
</html>
