<%-- comentarios, agregar autores etc --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Confirmación de contacto</title>
	<style>
		body {
		    font-family: Arial, sans-serif;
		    background-color: #f7f7f7;
		    color: #444;
		    margin: 0;
		    padding: 0;
		}

css

	.container {
		max-width: 800px;
		margin: 0 auto;
		padding: 50px 20px;
		box-sizing: border-box;
	}

	h1 {
		font-size: 2.5rem;
		text-align: center;
		margin-bottom: 30px;
		color: #333;
	}

	p {
		font-size: 1.1rem;
		line-height: 1.5;
		margin-bottom: 20px;
	}

	ul {
		margin: 0;
		padding: 0;
		list-style: none;
		font-size: 1.1rem;
		line-height: 1.5;
	}

	li:before {
		content: "✓";
		margin-right: 10px;
		color: #3bb3e0;
	}

	.btn {
		display: inline-block;
		background-color: #3bb3e0;
		color: #fff;
		padding: 10px 20px;
		border-radius: 5px;
		text-decoration: none;
		font-size: 1.1rem;
		margin-top: 30px;
	}

	.btn:hover {
		background-color: #2b96b8;
	}

	@media screen and (max-width: 480px) {
		h1 {
			font-size: 2rem;
		}

		p {
			font-size: 1rem;
		}

		.btn {
			font-size: 1rem;
		}
	}
</style>

</head>
<body>
	<div class="container">
		<h1>¡Gracias por contactarnos!</h1>
		<p>Recibimos tu mensaje y nos pondremos en contacto contigo.</p>

		<a href="index.jsp" class="btn">Regresar al inicio</a>
	</div>
</body>
</html>