package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // simulando los valores correctos 
        String usuarioOk = "juan";
        String passwordOk = "123456";

        String usuarioCliente = request.getParameter("usuario");
        String passwordCliente = request.getParameter("password");
        PrintWriter out = response.getWriter();

        if (usuarioOk.equals(usuarioCliente) && passwordOk.equals(passwordCliente)) {
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Codigos de Estado</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Datos Correctos</h1>");
            out.print("<h2>usuario enviado: " + usuarioCliente + ", password enviado:" + passwordCliente + "</h2>");
            out.print("</body>");
            out.print("</html>");
            
        } else {
            response.sendError(response.SC_UNAUTHORIZED,"Las credenciales son incorrectas");
        }
        out.close();
    }
}
