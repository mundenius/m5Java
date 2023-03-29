<%-- comentarios, agregar autores etc --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ingrese capacitacion</title>
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

form {
	width: 50%;
	margin: 50px auto;
	background-color: #FFFFFF;
	border-radius: 5px;
	padding: 20px;
	box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.2);
}

label {
	display: block;
	margin-top: 10px;
	color: #333333;
}

input[type="text"], input[type="email"], textarea {
	width: 100%;
	padding: 10px;
	margin-top: 5px;
	margin-bottom: 10px;
	border-radius: 5px;
	border: 1px solid #CCCCCC;
	font-size: 16px;
	color: #333333;
	box-sizing: border-box;
}

input[type="submit"] {
	width: 100%;
	background-color: #333333;
	color: #FFFFFF;
	padding: 10px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
	margin-top: 10px;
}

input[type="submit"]:hover {
	background-color: #555555;
}
</style>
</head>
<body>

	<header>
		<h1>Crear Capacitación</h1>
	</header>


	<main>
		<form action="FormularioCrearCapacitacion" method="POST"  onsubmit="return validarDuracion()">
			<label for="nombre">Nombre de la capacitación:</label> 
			<input type="text" id="nombre" name="nombreCap" required><br><br>
			
			<label for="descripcion">Descripción:</label>
			<textarea id="descripcion" name="descripcion" required></textarea><br><br>
			
			<label for="fecha">Fecha de inicio:</label> 
			<input type="date" id="fecha" name="fecha" required><br><br> 
			 
			<label for="duracion">Duración (minutos):</label>  
			<input type="number" id="duracion" name="duracion" required>minutos<br><br>
			<script>
				const duracionInput = document.getElementById('duracion');

				duracionInput
						.addEventListener(
								'change',
								function() {

									const duracionValue = parseInt(duracionInput.value);

									// Si el valor es menor o igual a 15, alertta
									if (duracionValue <= 15) {
										alert('La capacitacion no puede durar menos de 15 minutos');
										duracionInput.value = 15;
									}
								});
			</script>


			<input type="submit" value="enviar">
		</form>
	</main>

</body>
</html>