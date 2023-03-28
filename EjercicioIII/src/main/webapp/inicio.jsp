<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
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
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
		<script type="text/javascript" src="/assets/main.js"></script>
</body>

</html>
