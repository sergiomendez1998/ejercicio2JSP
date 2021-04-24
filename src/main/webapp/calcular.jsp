<%-- 
    Document   : calcular
    Created on : Apr 24, 2021, 10:29:09 AM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        
         <h1>AGREGAR VALORES</h1>

        <form action="calcularValores.html" method="POST">

            <label>INGRESE VALOR A:</label> 
            <input type="text" name="valorA" id="valorA" required="true"/>

              <label>INGRESE VALOR B:</label> 
            <input type="text" name="valorB" id="valorB" required="true"/>
            
             <label>INGRESE VALOR C:</label> 
            <input type="text" name="valorC" id="valorC" required="true"/>
            
            
            <input type="submit" value="Enviar valores" />

        </form>

        <% if (request.getAttribute("respuesta") != null) {%>
        <div><%=request.getAttribute("respuesta")%></div>
        <%}%>
        
    </body>
</html>
