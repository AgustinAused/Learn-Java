package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlets")
public class Servlets extends HttpServlet{
    
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        //leer parametros del formularionhtml
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        
        PrintWriter out = response.getWriter();
        
        out.print("<p>El usuario es: "+usuario+"</p>");
        out.print("<br/>");
        out.print("<p>La password es: "+password+"</p>");   
    }
    
    
    
    
}
