<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 8:42:00 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Ficha"%>
<%@page import="modeldao.FichaDao"%>
<%@page import="java.lang.String"%>
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
            <form action="../ControladorFicha">
            <h4>EDITAR FICHA</h4>
            <%
            FichaDao fi = new FichaDao();
            int id = Integer.parseInt((String)request.getAttribute("id"));
            Ficha f = new Ficha();
            f= fi.list(id);
            
            %>
            <label for="id">Editar Código Ficha:</label>
            <input class="controls" type="text" name="id" value="<%=f.getCodFicha()%>">
            <br>
            <br>
             <label for="id">Editar Cantidad Aprendices</label>
            <input class="controls" type="text" name="documento" value="<%=f.getCantiaprendices()%>">
            <br>
            <br>
             <label for="id">Editar Código Programa</label>
            <input class="controls" type="text" name="documento" value="<%=f.getNombrepro()%>">
            <br>
            <br>
             <label for="id">Editar Código Aprendiz</label>
            <input class="controls" type="text" name="documento" value="<%=f.getNombreapre()%>">
            <br>
            <p><input class="botons" type="submit" name="accion" value="Actualizar">

            </form>
        </section>
        
        
    </body>
</html>
