<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="navbar3.css">
</head>
<body>
<div class="m-4">
    <nav class="navbar navbar-expand-sm navbar-light bg-light">
        <div class="container-fluid">
            <a href="#" class="navbar-brand">Prevención de Riesgo</a>
            <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div id="navbarCollapse" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="nav-item">
                        <a href="Inicio" class="nav-link">Inicio</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Administrativo</a>
                        <div class="dropdown-menu">
                            <a href="#" class="dropdown-item">Crear Administrativo</a>
                            <a href="#" class="dropdown-item">Lista de Administrativos</a>
                            <a href="#" class="dropdown-item">Editar Administrativo</a>
                            <a href="#" class="dropdown-item">Eliminar Administrativo</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Cliente</a>
                        <div class="dropdown-menu">
                            <a href="#" class="dropdown-item">Crear Cliente</a>
                            <a href="#" class="dropdown-item">Lista de Clientes</a>
                            <a href="#" class="dropdown-item">Editar Cliente</a>
                            <a href="#" class="dropdown-item">Eliminar Cliente</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Profesional</a>
                        <div class="dropdown-menu">
                            <a href="#" class="dropdown-item">Crear Profesional</a>
                            <a href="#" class="dropdown-item">Lista de Profesionales</a>
                            <a href="#" class="dropdown-item">Editar Profesional</a>
                            <a href="#" class="dropdown-item">Eliminar Profesional</a>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Capacitación</a>
                        <div class="dropdown-menu">
                            <a href="CrearCapacitacion" class="dropdown-item">Crear Capacitación</a>
                            <a href="ListarCapacitacion" class="dropdown-item">Lista de Capacitaciones</a>
                            <a href="#" class="dropdown-item">Editar Capacitacion</a>
                            <a href="#" class="dropdown-item">Eliminar Capacitacion</a>
                        </div>
                    </li>
                </ul>
                <ul class="nav navbar-nav ms-auto">
                    <li class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Usuario</a>
                        <div class="dropdown-menu dropdown-menu-end">
                            <a href="FormularioContacto" class="dropdown-item">Contacto</a>
                            <a href="CrearUsuario" class="dropdown-item">Crear Usuario</a>
                            <a href="ListarUsuario" class="dropdown-item">Lista de Usuarios</a>
                            <a href="#" class="dropdown-item">Editar Usuario</a>
                            <a href="#" class="dropdown-item">Eliminar Usuario</a>
                            <div class="dropdown-divider"></div>
                            <%
				if (request.getSession().getAttribute("nombre") != null) {
				%>
                            <a href="CerrarSesion" class="dropdown-item">Cerrar sesion</a>
 
				<%
				} else {
				%>

			<li class="nav-item"><a class="nav-link"
				href="Login">Login</a></li>

				<%
				}
				%>
	                       </div>
                    </li>
                </ul>
            </div>
        </div>
    </nav>    
</div>




</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>  

