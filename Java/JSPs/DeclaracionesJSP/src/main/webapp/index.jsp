<%-- 
    Document   : index
    Created on : 31 ene 2023, 15:12:54
    Author     : Agustin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%! 
    // declarar varible con get
private String usuario = "Agustin";

public String getUsuario(){
    return this.usuario;
}
// declaramos un contador de visitas

private int contadorVisitas = 1;
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones Jsp</title>
    </head>
    <body>
        <h1>Declaraciones JSP</h1>
        <p style=" font-size: 20px;">Valor usuario por medio de un atributo: <%= this.usuario %></p>
        <br>
        <p style=" font-size: 20px;">Valor usuario por medio de un Metodo: <%= this.getUsuario() %></p>
        <br>
        <p style=" font-size: 20px;">Valor del contador de visitas:<%=  this.contadorVisitas++ %> </p>
    </body>
</html>
