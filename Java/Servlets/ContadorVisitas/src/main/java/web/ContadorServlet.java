package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorServlet")
public class ContadorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // decladramos la variable contador 
        int contador = 0;

        // revisamos si existe la variable contadorVisitas 
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("contadorVisitas")) {
                    contador = Integer.parseInt(c.getValue());

                }
            }
        }
        // incrementamos el contador en uno (que significa la visita del usuario)
        contador++;
        // agregamos la respuesta al navegador 
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));

        // se alcenara una hora (3600 segundos)
        c.setMaxAge(3600);

        // agregadmos la cookie al navegador 
        response.addCookie(c);

        // mandamos al navvegador el mensaje 
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<h2> la cantidad de veces que visito la web es:" + contador + "</h2>");
        out.close();

    }
}
