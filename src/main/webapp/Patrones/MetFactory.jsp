<%-- 
    Document   : MetFactory
    Created on : 14/06/2025, 2:08:07 p. m.
    Author     : edg-a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Metodo Factory</title>
    </head>
    <body>
        <h1>Ejemplo Metodo Factory!</h1>
        <h2>Menú de Opciones</h2>

        <form action="FMServlet" method="post">
            <label>Seleccione una opción:</label><br/>
            <input type="radio" name="MFopcion" value="1" /> Fabricar Chocolate Blanco<br/>
            <input type="radio" name="MFopcion" value="2" /> Fabricar Chocolate Negro<br/>
            <input type="radio" name="MFopcion" value="3" /> Fabricar Crema de Chocolate<br/>
            <input type="radio" name="MFopcion" value="4" /> Salir<br/><br/>
            <input type="submit" value="Enviar" />
        </form>

        <hr/>

        <%-- Mostrar resultado si existe --%>
        <%
            String resultado = (String) request.getAttribute("resultadoMF");
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
