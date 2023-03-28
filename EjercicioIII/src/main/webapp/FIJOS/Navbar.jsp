<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<script src= assets/main.js></script>
<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<a class="navbar-brand"
			href="${pageContext.request.contextPath}/inicio.jsp">Prevención
			de Riesgo</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" aria-current="page"
					href="${pageContext.request.contextPath}/inicio.jsp">Inicio</a></li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/FormularioContacto">Contacto</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/FormularioCrearCapacitacion">Capacitación</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/ListaCapacitaciones">Lista
						de Capacitaciones</a></li>

				<%
				if (request.getSession().getAttribute("nombre") != null) {
				%>
				<li class="dropdown">
					<button class="btn btn-secondary dropdown-toggle" type="button"
						id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">Menú <% %></button>
					<div class="dropdown-menu" aria-labelledby="dropdownMenu2">
						<a class="dropdown-item" type="button">Editar
							Usuario</a>
						<a class="dropdown-item" type="button" href="${pageContext.request.contextPath}/Login">Cerrar Sesión</a>
					</div>
				</li>
				<%-- 				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> Menú Usuario </a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">Configuración</a></li>
						<li><a class="dropdown-item"
							href="${pageContext.request.contextPath}/index.jsp">Cerrar
								Sesión</a></li>
					</ul></li> --%>

				<%
				} else {
				%>

				<li class="nav-item"><a class="nav-link"
					href="${pageContext.request.contextPath}/index.jsp">Login</a></li>

				<%
				}
				%>
			</ul>
		</div>
	</div>
</nav>