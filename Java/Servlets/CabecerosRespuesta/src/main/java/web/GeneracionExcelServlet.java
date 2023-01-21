
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      // indicar el tipo de respuesta al navegador 
      response.setContentType("application/vnd.ms-excel");  
      response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
      // para uso profesional de excel usar poi.apache.org
      
      // indicar al navegador no guardar cache 
      response.setHeader("Pragma","no-cache");
      response.setHeader("Cache-Contropl", "no-store");
      response.setDateHeader("Expires", -1);
      
      
      // desplegar informaciona la cliente 
      PrintWriter out = response.getWriter();
      out.print("Valores");
      out.print("\n1");
      out.print("\n2");
      out.print("\n3");
      out.print("\n4");
      out.print("\ntotal\t=SUMA(a2:a5)");
    }
}
