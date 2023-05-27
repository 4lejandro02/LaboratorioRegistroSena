<%-- 
    Document   : index
    Created on : 5/05/2023, 3:22:10 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Aprendiz"%>
<%@page import="modeldao.AprendizDao"%>
<%@page import="java.util.List"%>
<%@page import="model.Programa"%>
<%@page import="modeldao.ProgramaDao"%>
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
        <h1>REGISTRO DE FICHAS</h1>
        <section class="form-register">
            <form action="../ControladorFicha">
            
            <input class="form-control" type="text" name="codficha" placeholder="Código Ficha">
            <br>
            <input class="form-control" type="text" name="cantiaprendices" placeholder="Cantidad de Aprendices">
            <br>
            <div class="form-group">
                <label Nombre Programa></label>
                <select name="listapro" class="custom-select">
                    <option value="0">Seleccionar nombre del programa</option>
                    <%ProgramaDao pro = new ProgramaDao(); 
                    List<Programa> lista = pro.listadoP();%>
                <%for(Programa li:lista){%>
                <option value="<%=li.getCodprograma() %>"><%=li.getNombrepro()%></option>
                <%}%>
                </select>
            </div>
                
            <div class="form-group">
                <label Nombre Programa></label>
                <select name="listaapre" class="custom-select">
                    <option value="0">Seleccionar nombre del aprendiz</option>
                        <%AprendizDao adao = new AprendizDao();
                List<Aprendiz>list = adao.listadoA();
                %>
                <%
                for(Aprendiz li:list){%>
                <option value="<%=li.getId()%>"><%=li.getNombrea()%><%=li.getNombrea()%></option>
                <%}%>
               </select>
            </div>
            <p><input class="btn btn-primary" type="submit" name="accion" value="Registrar">
            </form>
        </section>
        
    </body>
</html>
