package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookiesServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        // crear variale para nuevo usuario 
        boolean nuevoUsuario = true;
        
        // obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
        
        // buscamos si existe una cookie creada con aneteriosidad 
        // llamada recurrenteVisitante
        if (cookies != null){
            for (Cookie c : cookies) {
                if (c.getName().equals("recurrenteVisitante") && c.getValue().equals("si")){
                    // es un usuario recurrente 
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        String mensaje = null;
        
        if (nuevoUsuario){
            Cookie visitanteCookie = new Cookie("recurrenteVisitante","si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar la web por primera vez";
        }else{
            mensaje = "Gracias por visitar nuevamente la web";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<h2>"+mensaje+"</h2>");
        out.close();
    }
}
