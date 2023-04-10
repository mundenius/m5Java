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
<title>Crear Administrativo</title>
<link rel="stylesheet" href="vista/assets/stylesheet.css">

</head>
<body>

<div class="signupFrm">
        <form action="CrearAdministrativo" method="POST" class="form">
          <h1 class="title">Crear usuario</h1>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="nombre" name="nombre">
            <label for="" class="label">Nombre: </label>
          </div>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="apellido" name="apellido">
            <label for="" class="label">Apellido: </label>
          </div>
    
          <div class="inputContainer">
            <input type="date" class="input" name="fechaNacimiento">
            <label for="" class="label">Fecha de nacimiento: </label>
          </div>
          
          <div class="inputContainer">
            <input type="text" class="input" placeholder="11111111-1" name="rut">
            <label for="" class="label">Rut: </label>
          </div>
          
          <div class="inputContainer">
            <input type="text" class="input" placeholder="somethin@noreply.com" name="email">
            <label for="" class="label">Email: </label>
          </div>
          
          <div class="inputContainer">
            <input type="text" class="input" placeholder="Finanzas, Gerencia, etc" name="area">
            <label for="" class="label">Area: </label>
          </div>
    
    
          <input type="submit" class="submitBtn" value="Crear Administrativo">
        </form>
      </div>
</body>
</html>