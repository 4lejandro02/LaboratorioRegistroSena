<%-- 
    Document   : ListarP
    Created on : 8/05/2023, 9:07:50 p. m.
    Author     : APRENDIZ
--%>

<%@page import="model.Ficha"%>
<%@page import="modeldao.FichaDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
        <h1>FICHAS REGISTRADAS EN EL SISTEMA</h1>
        <table class="table table-responsive">
            <thead>
                <tr>
                    <th class="text-center">CÓDIGO FICHA </th>
                    <th class="text-center">CANTIDAD APRENDICES </th>
                    <th class="text-center">CODIGO PROGRAMA </th>
                    <th class="text-center">CODIGO APRENDICES </th>

                </tr>

                <%    
                FichaDao dao = new FichaDao();
                List<Ficha>lista=dao.listaFichas();
                Iterator<Ficha>it=lista.iterator();
                Ficha fic =null;
                while(it.hasNext()){
                    fic=it.next();
                    
                %>
            </thead>
                <tbody>
                    <tr>
                        <td class="text-center"><%=fic.getCodFicha()%></td>
                        <td class="text-center"><%=fic.getCantiaprendices()%></td>
                        <td class="text-center"><%=fic.getNombrepro()%></td>
                        <td class="text-center"><%=fic.getNombreapre()%></td>

                    
                        <td class="text-center">
                            <a class="btn btn-danger" href="../ControladorFicha?accion=editar&id=<%=fic.getCodFicha()%>">EDITAR</a>
                            <a class="btn btn-warning" href="../ControladorFicha?accion=eliminar&id=<%=fic.getCodFicha()%>">ELIMINAR</a>
                        
                        </td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>
