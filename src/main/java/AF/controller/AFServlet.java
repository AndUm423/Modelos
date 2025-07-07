package AF.controller;

import AF.ConcretoDosNe;
import AF.ConcretoTresCr;
import AF.ConcretoUnoBl;
import AF.SerValidar;
import AF.ServFabricar;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author edg-a
 */
@WebServlet(name = "AFServlet", urlPatterns = {"/AFServlet"})
public class AFServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("/Patrones/AbsFactory.jsp");
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

        String opStr = request.getParameter("AFopcion");
        int op = 0;
        if (opStr != null) {
            op = Integer.parseInt(opStr);
        }

        String resultado;
        switch (op) {
            case 1:
                resultado = fabricar(new ConcretoUnoBl());
                break;
            case 2:
                resultado = fabricar(new ConcretoDosNe());
                break;
            case 3:
                resultado = fabricar(new ConcretoTresCr());
                break;
            case 4:
                request.getRequestDispatcher("/Patrones/index.jsp").forward(request, response);
                return;
            default:
                resultado = "Opción inválida.";
                break;
        }

        // t
        // Reenviar a la misma page con el resultado como atributo
        request.setAttribute("resultadoAF", resultado);
        request.getRequestDispatcher("/Patrones/AbsFactory.jsp").forward(request, response);
        processRequest(request, response);
    }

    private String fabricar(ServFabricar choco) {
        SerValidar valid = choco.Fabricar();
        return valid.validarInsumos() + "<br/>" + valid.tipoChocolate();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
