<%-- 
    Document   : ListarP
    Created on : 8/05/2023, 9:07:50 p. m.
    Author     : APRENDIZ
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Programa"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.ProgramaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar</title>
    </head>
    <body>
        <div class="container">
        <h1>PROGRAMAS REGISTRADOS EN EL SISTEMA</h1>
        <table class="table table-responsive">
            <thead>
                <tr>
                    <th class="text-center">CODIGO </th>
                    <th class="text-center">NOMBRE </th>

                </tr>

                <%    
                ProgramaDao dao = new ProgramaDao();
                List<Programa>lista=dao.listadoP();
                Iterator<Programa>it=lista.iterator();
                Programa usu =null;
                while(it.hasNext()){
                    usu=it.next();
                    
                %>
            </thead>
                <tbody>
                    <tr>
                        <td class="text-center"><%=usu.getCodprograma()%></td>
                        <td class="text-center"><%=usu.getNombrepro()%></td>

                    
                        <td class="text-center">
                            <a class="btn btn-danger" href="../ControladorPrograma?accion=editar&id=<%=usu.getCodprograma()%>">EDITAR</a>
                            <a class="btn btn-warning" href="../ControladorPrograma?accion=eliminar&id=<%=usu.getCodprograma()%>">ELIMINAR</a>
                        
                        </td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
