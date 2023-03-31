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
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
	<link rel="stylesheet" href="assets/stylesheet.css">
<title>Inicio</title>

</head>
<body>
	<header>
		<%@include file= "FIJOS/Header.jsp" %>
	</header>
	<nav>
	
	<%@include file= "FIJOS/Navbar.jsp" %>
<!-- 		<ul>
			<li><a href="contacto.jsp">Contacto</a></li>
			<li><a href="capacitacion.jsp">Crear Capacitación</a></li>
		</ul> -->
	</nav>
	<section>
		<h2>Capacitaciones recientes</h2>
		<p>No hay capacitaciones recientes</p>
	</section>
</body>
<br>
<br>
<footer>
<%@include file= "FIJOS/Footer.jsp" %>
</footer>
</html>
