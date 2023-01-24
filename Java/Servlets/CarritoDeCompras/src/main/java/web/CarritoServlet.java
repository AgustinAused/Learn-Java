package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        //creamos o recuperamos la sesion http
        HttpSession sesion = request.getSession();

        //recuperamos la lista de articulos si existe
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        // verificamos si existe 
        if (articulos == null) {
            // inicializamos la lista
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        // recuperamos el articulo enviado 
        String articuloNuevo = request.getParameter("articulo");

        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try (
            // mostramos al cliente
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Articulos agregados al carrito:</h1>");
            out.print("<hr>");
            out.print("<ul>");
            // iteramos el array y mostramos los elementos
            for (String articulo : articulos) {
                out.print("<li style='font-sixe:16px'>" + articulo + "</li>");

            }
            out.print("</ul>");
            out.print("<br>");
            out.print("<br>");
            out.print("<a href='index.html'>Volver al Inicio</a>");
            // cerrramos el objeto
        }

    }
}
