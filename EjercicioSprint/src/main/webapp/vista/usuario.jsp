<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="vista/assets/crearUsuarioStyle.css">
<title>Crear Usuario</title>
</head>
<body>
<header>
<%@include file= "/FIJOS/Header.jsp" %>
</header>
<nav>
	<%@include file= "/FIJOS/Navbar.jsp" %>
</nav>
    <div class="signupFrm">
        <form action="CrearUsuario" method="POST" class="form">
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
    
    
          <input type="submit" class="submitBtn" value="Crear Usuario">
        </form>
      </div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</html>