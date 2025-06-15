package FM.controller;

import FM.ChocolateBlanco;
import FM.ChocolateNegro;
import FM.CremaChocolatee;
import FM.FabChocolate;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "FMServlet", urlPatterns = {"/FMServlet"})
public class FMServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("/Patrones/MetFactory.jsp");
        dispatcher.forward(request, response);
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String opStr = request.getParameter("MFopcion");
        int op = 0;
        if (opStr != null) {
            op = Integer.parseInt(opStr);
        }

        String resultado;
        switch (op) {
            case 1:
                resultado = fabricar(new ChocolateBlanco());
                break;
            case 2:
                resultado = fabricar(new ChocolateNegro());
                break;
            case 3:
                resultado = fabricar(new CremaChocolatee());
                break;
            case 4:
                request.getRequestDispatcher("/Patrones/index.jsp").forward(request, response);
                return;
            default:
                resultado = "Opción inválida.";
                break;
        }

        // Reenviar a la misma page con el resultado como atributo
        request.setAttribute("resultadoMF", resultado);
        request.getRequestDispatcher("/Patrones/MetFactory.jsp").forward(request, response);
        processRequest(request, response);
    }

    private String fabricar(FabChocolate choco) {
        return choco.validarInsumos() + "<br/>" + choco.tipoChocolate();
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
