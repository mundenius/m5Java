package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FormularioContacto", urlPatterns = "/FormularioContacto")
public class FormularioContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("vista/contacto.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener los valores
		
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String mensaje = request.getParameter("mensaje");
		
		Mensaje men = new Mensaje();
		// datos para ver si llegan en consola
		
		System.out.println(nombre);
		System.out.println(email);
		System.out.println(mensaje);

		request.setAttribute("nombre", nombre);
		men.setNombre(nombre);
		request.setAttribute("email", email);
		men.setEmail(email);
		request.setAttribute("mensaje", mensaje);
		men.setMensaje(mensaje);
		
		/** se ejecuta el metodo to String para desplegar los datos del formulario de contacto en la consola */
		System.out.println(men.toString());
		
		response.sendRedirect("ConfirmacionContacto");
		return;

	}

	/**@privateClass MENSAJE */
	public class Mensaje {
		/**@param NOMBRE; EMAIL Y MENSAJE */
		String nombre;
		String email;
		String mensaje; 
		
		public Mensaje() {
			
		}
		
		public Mensaje(String nombre, String email, String mensaje) {
			this.nombre = nombre;
			this.email = email; 
			this.mensaje = mensaje;
		}
		
		/** SETTER Y GETTER 
		 * @param NOMBRE
		 * */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getNombre() {
			return nombre;
		}
		
		/** SETTER Y GETTER 
		 * @param EMAIL
		 * */
		
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail() {
			return email;
		}
		
		/** SETTER Y GETTER 
		 * @param MENSAJE
		 * */
		
		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
		public String getMensaje() {
			return mensaje;
		}
		
		@Override 
		
		public String toString() {
			return getNombre() + "\n" + getEmail() + "\n" + getMensaje();
		}
	}
	
}
