<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacto</title>
</head>
<body>
	<h1>
	<%
	out.println(request.getAttribute("cli"));
	out.println(request.getAttribute("ini"));
	%>
	</h1>
	<h2>madness</h2>
</body>
</html>