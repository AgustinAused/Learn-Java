<%-- 
    Document   : reporteExcel
    Created on : 2 feb 2023, 10:36:37
    Author     : Agustin
--%>
<%-- importamos las clases que vamos a usar --%>
<%@page errorPage="/WEB-INF/manejoErrores.jsp" %>
<%@page import="utilerias.Converciones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nombreArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "attachment;filename="+ nombreArchivo);
    %>
<!DOCTYPE html>
<html>
    <head>

        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br>
        <table border="1">
            <!-- Añadimos los campos para agregar en las columnas -->
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <!-- Agregamos una fila-->
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprendemos las sintaxis basicas de java</td>
                <td><%= Converciones.format("500") %></td>
            </tr>
            <!-- Agregamos una fila -->
            <tr>
                <td>2. Programacion con Java</td>
                <td>Pondremos en practica conceptos de la programacion orientada a objetos</td>
                <td><%= Converciones.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
