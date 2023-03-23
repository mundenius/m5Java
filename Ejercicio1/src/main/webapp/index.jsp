<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<title>Inicio</title>
</head>
<body>
<header>
        <h1 class="display-1 text center"><svg fill="currentColor">
        </svg> <%
        out.println(request.getAttribute("titulo"));
        %></h1>
        
    </header>
	 <nav class="navbar">
                <a href="#" class="toggle-button">
                    <span class="bar"></span>
                    <span class="bar"></span>
                    <span class="bar"></span>
                </a>
        <div class="navbar-links">
                <ul class="nav justify-content-center">
                    <li class="nav-item"><a href="index.jsp" class="nav-link px-2 text-muted">
                    <% 
                    out.println(request.getAttribute("ini"));
                    %></a></li>
                    <li class="nav-item"><a href="contacto.jsp" class="nav-link px-2 text-muted">
                    <%
                    out.println(request.getAttribute("contacto"));
                    %></a></li>
                    <li class="nav-item"><a href="capacitacion.jsp" class="nav-link px-2 text-muted">
					<%
					out.println(request.getAttribute("cap"));
					%></a></li>
                </ul>
            </div>
        </nav>
</body>
</html>