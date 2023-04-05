<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/vista/assets/crearUsuarioStyle.css">
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
        <form action="" class="form">
          <h1 class="title">Crear usuario</h1>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="a">
            <label for="" class="label">Email</label>
          </div>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="a">
            <label for="" class="label">Nombre de Usuario</label>
          </div>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="a">
            <label for="" class="label">Contraseña</label>
          </div>
    
          <div class="inputContainer">
            <input type="text" class="input" placeholder="a">
            <label for="" class="label">Repita la Contraseña</label>
          </div>
    
          <input type="submit" class="submitBtn" value="Sign up">
        </form>
      </div>
</body>
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</html>