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
        <title>AndresUmaña: Modelos</title>
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
                    <td><a href="FMServlet">Metodo Factory</a></td>
                    <td><a href="CompositeServlet">Composite</a></td>
                    <td><a href="CommandServlet">Command</a></td>
                </tr>
                <tr>
                    <td><a href="AFServlet">Abstract Factory</a></td>
                    <td><a href="ProxyServlet">Proxy</a></td>
                    <td><a href="IteratorServlet">Iterator</a></td>
                </tr>
                <tr>
                    <td><a href="SingletonServlet">Singleton</a></td>
                    <td><a href="FacadeServlet">Facade</a></td>
                    <td><a href="MediatorServlet">Mediator</a></td>
                </tr>
                <tr>
                    <td><a href="PrototypeServlet">Prototype</a></td>
                    <td><a href="DecoratorServlet">Decorator</a></td>
                    <td><a href="MementoServlet">Memento</a></td>
                </tr>
                <tr>
                    <td><a href="BuildServlet">Builder</a></td>
                    <td><a href="BridgeServlet">Bridge</a></td>
                    <td><a href="ObserverServlet">Observer</a></td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href="AdapterServlet">Adater</a></td>
                    <td><a href="StateServlet">State</a></td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href="FlyweightServlet">Flyweight</a></td>
                    <td><a href="VisitorServlet">Visitor</a></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><a href="CoRServlet">Chain Of Responsibility</a></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><a href="StrategyServlet">Strategy</a></td>
                </tr>
                <tr>
                    <td></td>
                    <td><a href=""></a></td>
                    <td><a href="TMServlet">Template Method</a></td>
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
