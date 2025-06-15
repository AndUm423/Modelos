<%-- 
    Document   : AbsFactory
    Created on : 14/06/2025, 5:39:19 p. m.
    Author     : edg-a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Abstract Factory</title>
    </head>
    <body>
        <h1>Ejemplo Abstract Factory!</h1>
        <h2>Menú de Opciones</h2>

        <form action="AFServlet" method="post">
            <label>Seleccione una opción:</label><br/>
            <input type="radio" name="AFopcion" value="1" /> Fabricar Chocolate Blanco<br/>
            <input type="radio" name="AFopcion" value="2" /> Fabricar Chocolate Negro<br/>
            <input type="radio" name="AFopcion" value="3" /> Fabricar Crema de Chocolate<br/>
            <input type="radio" name="AFopcion" value="4" /> Salir<br/><br/>
            <input type="submit" value="Enviar" />
        </form>

        <hr/>

        <%-- Mostrar resultado si existe --%>
        <%//@page import="MF.co.edu.udistrital.controller.*"%>
        <%
            String resultado = (String) request.getAttribute("resultadoAF");
            if (resultado != null) {
        %>
            <h3>Resultado:</h3>
            <p><%= resultado %></p>
        <%
            }
        %>
        
        <hr/>
        <h3>Diagrama Clases:</h3>
        <img src="<%= request.getContextPath() %>/Diagramas/imagen.jpg" alt="DiagramaAF"/>
        
    </body>
</html>

