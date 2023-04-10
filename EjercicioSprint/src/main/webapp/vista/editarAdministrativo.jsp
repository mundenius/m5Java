<%-- autores:
Javiera Saavedra
Valentina Saldias
Adrian Fredes 
Carlos Carrasco --%>

<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Administrativo</title>
<link rel="stylesheet" href="vista/assets/stylesheet.css">

</head>
<body>

<div class="signupFrm">
        <form action="EditarAdministrativo" method="POST" class="form">
          <h1 class="title">Editar Administrativo</h1>
    
          <div class="inputContainer">
            <label for="" class="label">Nombre: </label>
            <input type="text" class="input" placeholder="nombre" name="nombre">
          </div>
    
          <div class="inputContainer">
            <label for="" class="label">Apellido: </label>
            <input type="text" class="input" placeholder="apellido" name="apellido">
          </div>
    
          <div class="inputContainer">
            <label for="" class="label">Fecha de nacimiento: </label>
            <input type="date" class="input" name="fechaNacimiento">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Rut: </label>
            <input type="text" class="input" placeholder="11111111-1" name="rut">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Email: </label>
            <input type="text" class="input" placeholder="somethin@noreply.com" name="email">
          </div>
          
          <div class="inputContainer">
            <label for="" class="label">Area: </label>
            <input type="text" class="input" placeholder="Finanzas, Gerencia, etc" name="area">
          </div>
    
    
          <input type="submit" class="submitBtn" value="Editar Administrativo">
        </form>
      </div>
</body>
</html>