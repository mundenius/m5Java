package modelo.CRUD.Capacitacion_CRUD;

import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.clases.Capacitacion;
import modelo.DAO.CapacitacionDAO.*;
import modelo.implementacion.ImplementacionInterfazCapacitacion;
import modelo.interfaces.ICapacitacion;



//@WebServlet(name = "CrearCapacitacion", urlPatterns = "/FormularioCrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("vista/capacitacion.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("RecuperadorCapacitacionConsola").forward(request, response);

		
		// Obtener los valores de los campos del formulario
		String idCapacitacion = request.getParameter("idCapacitacion"); 
		String fechaCap = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar"); 
		String duracionCap = request.getParameter("duracion"); 
		int idUsuario_Run = Integer.parseInt(request.getParameter("idUsuario")); 

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
		System.out.println(idUsuario_Run);
		// Guardar los valores en los atributos de la solicitud

		try {
			System.out.println("entering try/catch CREAR CAPACITACION SERVLET");
			Capacitacion capacitacion = new Capacitacion();
			ImplCapacitacionDAO capdao = new ImplCapacitacionDAO();
			
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
			request.setAttribute("idUsuario", idUsuario_Run);
			capacitacion.setIdUsuario_Run(idUsuario_Run);
			
			capdao.registrar(capacitacion);
			// Redirige a una pagina de confirmacion
			response.sendRedirect("vista/CONFIRMACIONES/confirmacionCapacitacion.jsp");
			
		}catch(Exception e) {
			System.out.println(e + " SERVLET CREAR CAPACITACION");
		}

		

	}

}
