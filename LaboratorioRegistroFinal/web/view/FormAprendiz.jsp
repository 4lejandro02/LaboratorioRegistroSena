<%-- 
    Document   : index
    Created on : 5/05/2023, 3:22:10 p. m.
    Author     : APRENDIZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <title>FormAprendiz</title>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    
    <body>
        <h1>REGISTRO DE APRENDIZ</h1>
        <div class="form-register">
            <form action="../ControladorAprendiz">
            
            <input class="form-control" type="text" name="documento" id="documento" placeholder="ingresa tu documento">
            <br>
            <input class="form-control" type="text" name="nombre" id="nombre" placeholder="ingresa tu nombre">
            <br>
            <input class="form-control" type="text" name="apellido" id="apellido" placeholder="ingresa tu apellido">
            <br>
            <input class="form-control" type="email" name="correo" id="correo" placeholder="ingresa tu correo">
            <br>
            <input class="form-control" type="text" name="Numero" id="Numero" placeholder="ingresa tu celular">
            <br>
            <input class="btn btn-primary" type="submit" name="accion" value="Registrar">
            </form>
        </div>
        
        
    </body>
</html>
