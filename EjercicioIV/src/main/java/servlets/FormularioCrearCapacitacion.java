package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Time;



@WebServlet(name = "FormularioCrearCapacitacion", urlPatterns = "/FormularioCrearCapacitacion")
public class FormularioCrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener los valores de los campos del formulario
		ListaCapacitaciones lista1 = new ListaCapacitaciones();
		Capacitacion capacitacion = new Capacitacion();

		String idCapacitacion = request.getParameter("idCapacitacion"); 
		String fechaCap = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar"); 
		String duracionCap = request.getParameter("duracion"); 
		int cliente_rutcliente = Integer.parseInt(request.getParameter("cliente_rutcliente")); 

		Date fecha = null;
		if (fechaCap != null && !fechaCap.isEmpty()) {
		    try {
		        fecha = new SimpleDateFormat("dd-MM-yyyy").parse(fechaCap);
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		}


		int duracion = 0;
		if (duracionCap != null && !duracionCap.isEmpty()) {
		    duracion = Integer.parseInt(duracionCap);
		}
		
		
		
		// Imprimir los valores obtenidos en la consola
		System.out.println(idCapacitacion);
		System.out.println(fecha);
		System.out.println(hora);
		System.out.println(lugar);
		System.out.println(duracion);
		System.out.println(cliente_rutcliente);
		// Guardar los valores en los atributos de la solicitud

		request.setAttribute("idcapacitacion", idCapacitacion);
		capacitacion.setIdCapacitacion(idCapacitacion);
		request.setAttribute("fecha", fecha);
		capacitacion.setFechaCap(fechaCap);
		request.setAttribute("hora", hora);
		capacitacion.setHora(hora);
		request.setAttribute("lugar", lugar);
		capacitacion.setLugar(lugar);
		request.setAttribute("duracion", duracion);
		capacitacion.setDuracionCap(duracionCap);
		request.setAttribute("cliente_rutcliente", cliente_rutcliente);
		capacitacion.setCliente_rutcliente(cliente_rutcliente);

		lista1.agregarCapacitacion(capacitacion);

		// Redirige a una pagina de confirmacion
		response.sendRedirect("confirmacionCapacitacion.jsp");

		lista1.listarCapacitaciones(capacitacion);
		return;
		//request.setAttribute("capacitaciones", ListaCapacitaciones);

	}

	/**
	 * @publicClass se crea clase interna para manejar arraylist de capacitaciones
	 */
	public class Capacitacion {
		String idCapacitacion;
		String fechaCap;
		String hora;
		String lugar;
		String duracionCap;
		int cliente_rutcliente;
		
		public Capacitacion() {
		}


		public Capacitacion(String idCapacitacion, String fechaCap, String hora, String lugar, String duracionCap,
				int cliente_rutcliente) {
			this.idCapacitacion = idCapacitacion;
			this.fechaCap = fechaCap;
			this.hora = hora;
			this.lugar = lugar;
			this.duracionCap = duracionCap;
			this.cliente_rutcliente = cliente_rutcliente;
		}

		public void setIdCapacitacion(String idCapacitacion) {
			this.idCapacitacion = idCapacitacion;
		}

		public String getIdCapacitacion() {
			return idCapacitacion;
		}

		public void setFechaCap(String fechaCap) {
			this.fechaCap = fechaCap;
		}

		public String getFechaCap() {
			return fechaCap;
		}

		public void setHora(String hora) {
			this.hora = hora;
		}

		public String getHora() {
			return hora;
		}

		public void setLugar(String lugar) {
			this.lugar = lugar;
		}

		public String getLugar() {
			return lugar;
		}

		public void setDuracionCap(String duracionCap) {
			this.duracionCap = duracionCap;
		}

		public String getDuracionCap() {
			return duracionCap;
		}

		public void setCliente_rutcliente(int cliente_rutcliente) {
			this.cliente_rutcliente = cliente_rutcliente;
		}

		public int getCliente_rutcliente() {
			return cliente_rutcliente;
		}

		@Override
		public String toString() {
			return "\nToString\nId capacitacion: " + getIdCapacitacion() + "\nFecha: " + getFechaCap() + "\nHora: " + getHora()
					+ "\nLugar: " + getLugar() + "\nduracion: " + getDuracionCap() + "\nRut del cliente: "
					+ getCliente_rutcliente();
		}
	}
}