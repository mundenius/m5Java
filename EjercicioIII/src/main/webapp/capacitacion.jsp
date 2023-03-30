<%-- comentarios, agregar autores etc --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<title>Ingrese capacitacion</title>
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