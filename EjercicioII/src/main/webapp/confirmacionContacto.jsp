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
.container {
	max-width: 800px;
	margin: 0 auto;
	padding: 50px 20px;
	box-sizing: border-box;
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
p{
    color: grey;
}

input[type="submit"]:hover {
	background-color: #555555;
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