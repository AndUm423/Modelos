package udistrital.edu.co.controlador;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.System.out;

/**
 *
 * @author edg-a
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("/Patrones/index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {    
        doGet(request, response);
        
        /*
        String opcionStr = request.getParameter("opcion");
        int opcion;
        String resultado = null;
        
        if (opcionStr != null && !opcionStr.isEmpty()) {
            opcion = Integer.parseInt(opcionStr);
            if (opcion == 2){
                resultado = "numero 2";
                out.println("El numero fue 2");
            }
        }
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("/Patrones/index.jsp").forward(request, response);
        */
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
