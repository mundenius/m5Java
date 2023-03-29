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
		
		String nombreCap = request.getParameter("nombreCap");
        String descripcion = request.getParameter("descripcion");
        String fechaCap = request.getParameter("fecha");
        String duracionCap = request.getParameter("duracion");

        Date fecha = null;
        try {
            fecha = new SimpleDateFormat("dd-MM-yyyy").parse(fechaCap);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int duracion = Integer.parseInt(duracionCap);

        // Imprimir los valores obtenidos en la consola
        System.out.println(nombreCap);
        System.out.println(descripcion);
        System.out.println(fecha);
        System.out.println(duracion);

        // Guardar los valores en los atributos de la solicitud
        
        
        request.setAttribute("nombre", nombreCap);
        capacitacion.setNombreCap(nombreCap);
        request.setAttribute("descripcion", descripcion);
        capacitacion.setDescripcion(descripcion);
        request.setAttribute("fecha", fecha);
        capacitacion.setFechaCap(fechaCap);
        request.setAttribute("duracion", duracion);
        capacitacion.setDuracionCap(duracionCap);
        
        lista1.agregarCapacitacion(capacitacion);

    	// Redirige a una pagina de confirmacion
		 response.sendRedirect("confirmacionContacto.jsp");
		 
		 lista1.listarCapacitaciones(capacitacion);
		 return;


	}
/** @publicClass se crea clase interna para manejar arraylist de capacitaciones */
	public class Capacitacion {
		String nombreCap;
        String descripcion;
        String fechaCap;
        String duracionCap;
        
        public void Capacitacion() {
        	
        }
        public void Capacitacion(String nombreCap, String descripcion, String fechaCap, String duracionCap) {
        	this.nombreCap = nombreCap;
        	this.descripcion = descripcion;
        	this.fechaCap = fechaCap;
        	this.duracionCap = duracionCap;
        }
        
        /**@param nombre capacitacion */ 
        public void setNombreCap(String nombreCap) {
        	this.nombreCap = nombreCap;
        }
        public String getNombreCap() {
        	return nombreCap;
        }
        
        /**@param descripcion capacitacion */
        public void setDescripcion(String descripcion) {
        	this.descripcion = descripcion;
        }
        public String getDescripcion() {
        	return descripcion;
        }
        
        /**@param fecha capacitacion */
        public void setFechaCap(String fechaCap) {
        	this.fechaCap = fechaCap; 
        }
        public String getFechaCap() {
        	return fechaCap;
        }
        
        /**@param duracion capacitacion */
        public void setDuracionCap(String duracionCap) {
        	this.duracionCap = duracionCap;
        }
        public String getDuracionCap() {
        	return duracionCap;
        }
        
        @Override 
        public String toString() {
        	return "Nombre Capacitacion: " + getNombreCap() + "\nDescripcion Capacitacion: " + getDescripcion() 
        	+ "\nFecha Capacitacion: " + getFechaCap() + "\nDuracion Capacitacion: " + getDuracionCap();
        }
	}
}
