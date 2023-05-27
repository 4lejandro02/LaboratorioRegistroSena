<%-- 
    Document   : EditarA
    Created on : 8/05/2023, 8:42:00 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Programa"%>
<%@page import="modeldao.ProgramaDao"%>
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
            <form action="../ControladorPrograma">
            <h4>EDITAR PROGRAMA</h4>
            <%
            ProgramaDao pro = new ProgramaDao();
            int id = Integer.parseInt((String)request.getAttribute("id"));
            Programa p = new Programa();
            p= pro.list(id);
            
            %>
            <label for="id">Editar Código:</label>
            <input class="controls" type="text" name="codigo" value="<%=p.getCodprograma()%>">
            <br>
            <br>
             <label for="id">Editar Nombre</label>
            <input class="controls" type="text" name="nombre" value="<%=p.getNombrepro()%>">
            <br>
            <p><input class="botons" type="submit" name="accion" value="Actualizar">

            </form>
        </section>
        
        
    </body>
</html>
