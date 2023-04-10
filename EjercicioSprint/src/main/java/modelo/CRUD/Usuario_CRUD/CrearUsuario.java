package modelo.CRUD.Usuario_CRUD;

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


import modelo.DAO.UsuarioDAO.*;
import modelo.conexion.Singleton;
import modelo.clases.Usuario;
/**
 * Servlet implementation class CrearUsuario
 */
//@WebServlet(name = "CrearUsuario", urlPatterns = "/CrearUsuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("vista/menuCrearUsuario.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// Obtener los valores de los campos del formulario
//
//				String idUsuario = request.getParameter("idUsuario"); 
//				String nombre = request.getParameter("nombre");
//				String apellido = request.getParameter("apellido");
//				String fechaNacimiento = request.getParameter("fechaNacimiento"); 
//				String rut = request.getParameter("rut"); 
//				
//
//				Date fecha= null;
//				if (fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
//				    try {
//				        fecha = new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento);
//				    } catch (ParseException e) {
//				        e.printStackTrace();
//				    }
//				}
//
//							
//				// Imprimir los valores obtenidos en la consola
//				System.out.println(idUsuario);
//				System.out.println(nombre);
//				System.out.println(apellido);
//				System.out.println(fecha);
//				System.out.println(rut);
//				// Guardar los valores en los atributos de la solicitud
//
//				try {
//					System.out.println("entering try/catch CREAR USUARIO SERVLET");
//					Usuario usuario = new Usuario();
//					ImplUsuarioDAO usdao = new ImplUsuarioDAO();
//					
//					request.setAttribute("idUsuario", idUsuario);
//					usuario.setIdUsuario(Integer.parseInt(idUsuario));
//					request.setAttribute("nombre", nombre);
//					usuario.setNombre(nombre);
//					request.setAttribute("apellido", apellido);
//					usuario.setApellido(apellido);
//					request.setAttribute("fecha nacimiento", fechaNacimiento);
//					usuario.setFechaNacimiento(fechaNacimiento);
//					request.setAttribute("rut", rut);
//					usuario.setRut(Long.parseLong(rut));
//
//					
//					usdao.registrar(usuario);
//					// Redirige a una pagina de confirmacion
//					response.sendRedirect("ConfirmacionUsuario"); 
//					
//				}catch(Exception e) {
//					System.out.println(e + " SERVLET CREAR USUARIO");
//				}
//
//				
//
			}

}
