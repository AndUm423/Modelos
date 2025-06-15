<%-- 
    Document   : Builder
    Created on : 14/06/2025, 6:28:36 p. m.
    Author     : edg-a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Builder</title>
    </head>
    
    <body>
        <h1>Ejemplo patron Builder!</h1>
        <h2>Menú de Opciones</h2>

        <form action="BuildServlet" method="post">
            <label>Seleccione una opción:</label><br/>
            <input type="radio" name="Buildopcion" value="1" /> Fabricar Casa (Con Builder)<br/>
            <input type="radio" name="Buildopcion" value="2" /> Fabricar Edificio (Con Builder) <br/>
            <input type="radio" name="Buildopcion" value="3" /> Salir<br/><br/>
            <input type="submit" value="Enviar" />
        </form>
        
        <hr/>

        <%-- Mostrar resultado si existe --%>
        <%//@page import="MF.co.edu.udistrital.controller.*"%>
        <%
            String resultado = (String) request.getAttribute("resultadoBuilder");
            if (resultado != null) {
        %>
            <h3>Resultado:</h3>
            <p><%= resultado %></p>
        <%
            }
        %>
        
        <hr/>
        <h3>Diagrama Clases:</h3>
        <img src="<%= request.getContextPath() %>/Diagramas/imagen.jpg" alt="DiagramaMF"/>
        
    </body>
</html>
