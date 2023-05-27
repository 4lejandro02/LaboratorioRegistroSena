<%-- 
    Document   : ListarA
    Created on : 5/05/2023, 7:20:43 p. m.
    Author     : APRENDIZ
--%>

<%@page import="java.util.Iterator"%>
<%@page import="model.Aprendiz"%>
<%@page import="java.util.List"%>
<%@page import="modeldao.AprendizDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar</title>
    </head>
    <body>
        <div class="container">
        <h1>APRENDICES REGISTRADOS EN EL SISTEMA</h1>
        <table class="table table-responsive">
            <thead>
                <tr>
                    <th class="text-center">ID</th>
                    <th class="text-center">DOCUMENTO</th>
                    <th class="text-center">NOMBRE</th>
                    <th class="text-center">APELLIDO</th>
                    <th class="text-center">EMAIL</th>
                    <th class="text-center">CELULAR</th>
                </tr>
            </thead>
                <%    
                AprendizDao dao = new AprendizDao();
                List<Aprendiz>lista=dao.listadoA();
                Iterator<Aprendiz>it=lista.iterator();
                Aprendiz usu =null;
                while(it.hasNext()){
                    usu=it.next();
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%=usu.getId()%></td>
                        <td class="text-center"><%=usu.getDocumento()%></td>
                        <td class="text-center"><%=usu.getNombrea()%></td>
                        <td class="text-center"><%=usu.getApellidoa()%></td>
                        <td class="text-center"><%=usu.getCorreoa()%></td>
                        <td class="text-center"><%=usu.getTelea()%></td>
                    
                        <td class="text-center">
                            <a class="btn btn-danger" href="../ControladorAprendiz?accion=editar&id=<%=usu.getId() %>">EDITAR</a>
                            <a class="btn btn-warning" href="../ControladorAprendiz?accion=eliminar&id=<%=usu.getId()%>">ELIMINAR</a>
                        
                        </td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
    </body>
</html>

