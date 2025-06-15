package Builder.controller;

import Builder.*;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "BuildServlet", urlPatterns = {"/BuildServlet"})
public class BuildServlet extends HttpServlet {
    
    private Director director = new Director();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("/Patrones/Builder.jsp");
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

        String opStr = request.getParameter("Buildopcion");
        int op = 0;
        if (opStr != null) {
            op = Integer.parseInt(opStr);
        }

        String resultado;
        switch (op) {
            case 1:
                BuilderCasa bc = new BuilderCasa();
                director.constructCasa(bc);
                resultado = "Con builder se obtuvo: " + bc.getCasa() + "<br/>" + 
                        "de " + bc.getCasa().getPisos() + " pisos." + "<br/>" +
                        "Y " + bc.getCasa().getVentanas() + " ventanas";
                break;
            case 2:
                BuilderEdificio be = new BuilderEdificio();
                director.constructEdificio(be);
                resultado = "Con builder se obtuvo: " + be.getEdificio() + "<br/>" + 
                        "de " + be.getEdificio().getPisos() + " pisos." + "<br/>" +
                        "Y " + be.getEdificio().getVentanas() + " ventanas";
                break;
            case 3:
                request.getRequestDispatcher("/Patrones/index.jsp").forward(request, response);
                return;
            default:
                resultado = "Opción inválida.";
                break;
        }

        // Reenviar a la misma page con el resultado como atributo
        request.setAttribute("resultadoBuilder", resultado);
        request.getRequestDispatcher("/Patrones/Builder.jsp").forward(request, response);
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
