package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionServlet")
public class SesionServlet extends HttpServlet{
    
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        
        String titulo = null; 
        
        // pedir contador de visitas a la session
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        // si es nulo es la primera vex que acedemos 
        
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        }else{
            contadorVisitas++;
            titulo= "Bienvenido Nuevamente";
        }
        
        // agregamos el nuevo valor de contador visitas a la sesion 
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        // mandamos al respuesta al cliente 
        PrintWriter out = response.getWriter();
        out.print("<h1>" + titulo + "</h1>");
        out.print("<br/>");
        out.print("<p style='font-size:20px'> La cantidad de veces que ingreso a la web:" + contadorVisitas +"</p>" );
        out.print("<p style='font-size:20px'> La Id de la session es:" + sesion.getId() +"</p>" );
        out.close();
        
        
    }
}
