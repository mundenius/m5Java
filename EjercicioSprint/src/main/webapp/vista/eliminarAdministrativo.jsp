<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Administrativo</title>
</head>
<body>
<%@include file = "/FIJOS/Navbar.jsp"%>

<div class="signupFrm">
		<form action="EliminarAdmin" method="POST" class="form">
			<h1 class="title">Eliminar Administrativo</h1>
			
			<div class="inputContainer">
				<label for="" class="label">Ingrese el RUT del Administrativo que desea eliminar: </label> <input type="text"
					class="input" placeholder="11111111-1" name="rutadmin">
			</div>
						<input type="submit" class="submitBtn" value="Eliminar Cliente">
		</form>
	</div>
	
<footer>
<%@include file= "/FIJOS/Footer.jsp" %>
</footer>
</body>
</html>