/**
  * crear usuarios (cliente, admin, profesional)
  */
 
        function validarFormulario() {
            var nombre = document.getElementById("nombre").value.trim();
            var apellido = document.getElementById("apellido").value.trim();
            var rut = document.getElementById("rut").value.trim();
            var email = document.getElementById("email").value.trim();
            var area = document.getElementById("area").value.trim();
            var telefono = document.getElementById("telefono").value.trim();
            var afp = document.getElementById("afp").value.trim();
			var sistemasalud = document.getElementById("sistemasalud").value.trim();
			var direccion = document.getElementById("direccion").value.trim();
			var comuna = document.getElementById("comuna").value.trim();
			var edad = document.getElementById("edad").value.trim();
			var tituloprof = document.getElementById("tituloprof").value.trim();
            var proyecto = document.getElementById("proyecto").value.trim();


            if (nombre == "") {
                alert("Por favor, ingrese su nombre.");
                return false;
            }

            if (apellido == "") {
                alert("Por favor, ingrese su apellido.");
                return false;
            }

            if (rut == "") {
                alert("Por favor, ingrese su rut.");
                return false;
            }

            if (email == "") {
                alert("Por favor, ingrese su correo electrónico.");
                return false;
            }

            if (area == "") {
                alert("Por favor, ingrese su área.");
                return false;
            }

         
            if (telefono == "") {
                alert("Por favor, ingrese su numero de telefono.");
                return false;
            }

            if (afp == "") {
                alert("Por favor, ingrese Afp en la que se encuentra.");
                return false;
            }
            
            if (sistemasalud == ""){
            	alert("por favor ingrese si se encuentra en fonasa o isapre.");
            	return false;
            }
            
            if (direccion == ""){
            	alert("Por favor, ingrese su direccion.");
            	return false;
            }

            if (comuna == ""){
            	alert("Por favor ingrese su comuna.");
            	return false;
            }
            
            if (edad == ""){
            	alert("Por favor, ingrese su edad.");
            	return false;
            }
            
      
            if (tituloprof == ""){
            	alert("por favor, ingrese su titulo profesional");
            	return false;
            }
            
            if (proyecto == ""){
            	alert("por favor ingrese el proyecto");
            	return false;
            }	
            return true;
        }


        document.getElementById("crear").onsubmit = function() {
            return validarFormulario();
        };
   