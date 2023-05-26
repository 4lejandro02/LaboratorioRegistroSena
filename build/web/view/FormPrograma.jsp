<%-- 
    Document   : FormPrograma
    Created on : 5/05/2023, 6:58:07 p. m.
    Author     : APRENDIZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Programa</title>
    </head>
    <body>
        <h1>REGISTRO DE PROGRAMAS</h1>
        <div class="col-lg-6">
            <form action="../ControladorPrograma">
                Codigo de Programa:<br><!-- comment -->
                <input class="form-control" type="number" name="codpro">
                <br>
                Nombre del Programa:<br>
                <input class="form-control" type="text" name="nombrepro">
                <br>
                <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
            </form> 
        </div>
    </body>
</html>
