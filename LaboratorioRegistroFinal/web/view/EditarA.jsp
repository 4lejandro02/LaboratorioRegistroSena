<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 8:42:00 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Aprendiz"%>
<%@page import="java.lang.String"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <title>Start Page</title>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

    <body>
        <section class="form-register">
            <form action="../ControladorAprendiz">
            <h4>EDITAR APRENDIZ</h4>
            <%
            AprendizDao ape = new AprendizDao();
            int id = Integer.parseInt((String)request.getAttribute("id"));
            Aprendiz ap = new Aprendiz();
            ap= ape.list(id);
            
            %>
            <label for="id">Edita tu Id:</label>
            <input class="controls" type="text" name="id" value="<%=ap.getId()%>">
            <br>
            <br>
             <label for="id">Edita tu Documento:</label>
            <input class="controls" type="text" name="documento" value="<%=ap.getDocumento()%>">
            <br>
            <br>
            <label for="id">Edita tu Nombre:</label>
            <input class="controls" type="text" name="nombre"  value="<%=ap.getDocumento()%>">
            <br>
            <br>
            <label for="id">Edita tu Apellido:</label>
            <input class="controls" type="text" name="apellido"  value="<%=ap.getApellidoa()%>">
            <br>
            <br>
            <label for="id">Edita tu Correo:</label>
            <input class="controls" type="email" name="correo"  value="<%=ap.getCorreoa()%>">
            <br>
            <br>
            <label for="id">Edita tu Número Telefónico:</label>
            <input class="controls" type="text" name="Numero"  value="<%=ap.getTelea()%>">
            <br>
            <p><input class="botons" type="submit" name="accion" value="Actualizar">

            </form>
        </section>
        
        
    </body>
</html>
