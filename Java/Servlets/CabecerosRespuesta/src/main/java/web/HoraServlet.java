package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        response.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora Actualizada: 'HH:mm:ss");
        String horaFormateada = formateador.format(fecha);

        // permite escribir en un ficherop como en pantalla 
        // respondemos al cliente
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Codigos de Estado</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1> Fecha y Hora del dia</h1>");
        out.print("<p Style='align-content:center'>"+horaFormateada+"</p>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
