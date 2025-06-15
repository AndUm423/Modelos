<%-- 
    Document   : index
    Created on : 14/06/2025, 9:59:54 a. m.
    Author     : edg-a
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Patrones!</h1>
        <h1>Por: Andrés Umaña</h1>
        
        <br />
        
        <table border="1" width="80%">
            <thead>
                <tr>
                    <th>Creacionales</th>
                    <th>Estructurales</th>
                    <th>De Comportamiento</th>
                </tr>
                
            </thead>
            <tbody>
                <tr>
                    <td><a href="MFServlet">Metodo Factory</a></td>
                    <td><a href="">Composite</a></td>
                    <td><a href="">Command</a></td>
                </tr>
                <tr>
                    <td><a href="AFServlet">Abstract Factory</a></td>
                    <td><a href="">Proxy</a></td>
                    <td><a href="">Iterator</a></td>
                </tr>
                <tr>
                    <td><a href="">Singleton</a></td>
                    <td><a href="">Facade</a></td>
                    <td><a href="">Mediator</a></td>
                </tr>
                <tr>
                    <td><a href="">Prototype</a></td>
                    <td><a href="">Decorator</a></td>
                    <td><a href="">Memento</a></td>
                </tr>
                <tr>
                    <td><a href="BuildServlet">Builder</a></td>
                    <td><a href="">Bridge</a></td>
                    <td><a href="">Observer</a></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><a href="">State</a></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><a href="">Visitor</a></td>
                </tr>
            </tbody>
        </table>
        
        <br />
        <form action="Servlet" method="post">
        <label for="opcion">Ingrese una opción:</label>
        <input type="number" id="opcion" name="opcion" />
        <button type="submit">Enviar</button>
        </form>
        
        <%-- Mostrar resultado si existe --%>
        <%
            String resultado = (String) request.getAttribute("resultado");
            if (resultado != null) {
        %>
            <h3>Resultado:</h3>
            <p><%= resultado %></p>
        <%
            }
        %>
    </body>
</html>
