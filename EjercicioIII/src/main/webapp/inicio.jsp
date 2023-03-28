<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<title>Inicio</title>
<style>
body {
	font-family: Montserrat;
	background-color: #FFFFFF;
	color: black;
}

h1 {
	text-align: center;
	margin-top: 0;
}

/* nav {
	background-color: #333333;
	color: #FFFFFF;
	padding: 20px;
} */
nav ul {
	list-style: none;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

nav ul li a {
	color: grey;
	text-decoration: none;
	padding: 10px;
	font-size: 16px;
	border-radius: 5px;
}

nav ul li a:hover {
	background-color: #333333;
	color: #FFFFFF;
}

main {
	width: 90%;
	margin: 0 0;
}

section {
	margin-top: 50px;
	background-color: #D1F2EB;
	border-radius: 5px;
	padding: 20px;
	box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.2);
}

section h2 {
	margin-top: 0;
	color: #333333;
}

section p {
	margin-bottom: 0;
	color: #777777;
}
</style>
</head>
<body>
	<header>
		<h1 class="display-1 text center">Bienvenido</h1>
	</header>
	<nav>
		<%@ include file="FIJOS/Navbar.jsp"%>
		<!-- 		<ul>
			<li><a href="contacto.jsp">Contacto</a></li>
			<li><a href="capacitacion.jsp">Crear Capacitación</a></li>
		</ul> -->
	</nav>
	<section>
		<h2>Capacitaciones recientes</h2>
		<p>No hay capacitaciones recientes</p>
	</section>
		<script type="text/javascript" src="/assets/main.js"></script>
</body>

</html>
