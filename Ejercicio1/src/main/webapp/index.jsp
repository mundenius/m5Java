<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #D1F2EB;
	color: #FFFFFF;
}

h1 {
	text-align: center;
	margin-top: 50px;
	color: #333333;
}

nav {
	background-color: #333333;
	color: #FFFFFF;
	padding: 20px;
}

nav ul {
	list-style: none;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: space-between;
	align-items: center;
}

nav ul li a {
	color: #FFFFFF;
	text-decoration: none;
	padding: 10px;
	font-size: 16px;
	border-radius: 5px;
}

nav ul li a:hover {
	background-color: #FFFFFF;
	color: #333333;
}

main {
	width: 80%;
	margin: 0 auto;
}

section {
	margin-top: 50px;
	background-color: #FFFFFF;
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
		<h1>Bienvenido</h1>
		<nav>
			<ul>
				<li><a href="contacto.jsp">Contacto</a></li>
				<li><a href="capacitacion.jsp">Crear Capacitación</a></li>
			</ul>
		</nav>
	</header>
		<section>
			<h2>Capacitaciones recientes</h2>
			<p>No hay capacitaciones recientes</p>
		</section>
</body>
</html>
