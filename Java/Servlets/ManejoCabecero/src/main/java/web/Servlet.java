package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String metodoHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Header Http</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Header HTTP</h1>");
        out.print("<p>Metodo HTTP: "+metodoHttp+"</p>");
        out.print("<br>");
        String uri = request.getRequestURI();
        out.print("<p>Uri Solicitada: "+ uri +"</p>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
