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
@WebServlet(name = "CrearUsuario", urlPatterns = "/CrearUsuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtener los valores de los campos del formulario

				int idUsuario = Integer.parseInt(request.getParameter("idUsuario")); 
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				String fechaNacimiento = request.getParameter("fechaNacimiento"); 
				long rut = Long.parseLong(request.getParameter("rut")); 
				

				Date fecha= null;
				if (fechaNacimiento != null && !fechaNacimiento.isEmpty()) {
				    try {
				        fecha = new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento);
				    } catch (ParseException e) {
				        e.printStackTrace();
				    }
				}

							
				// Imprimir los valores obtenidos en la consola
				System.out.println(idUsuario);
				System.out.println(nombre);
				System.out.println(apellido);
				System.out.println(fecha);
				System.out.println(rut);
				// Guardar los valores en los atributos de la solicitud

				try {
					System.out.println("entering try/catch CREAR USUARIO SERVLET");
					Connection conn = Singleton.getConnection();
					Usuario usuario = new Usuario();
					ImplUsuarioDAO usdao = new ImplUsuarioDAO();
					
					request.setAttribute("idUsuario", idUsuario);
					usuario.setIdUsuario(idUsuario);
					request.setAttribute("nombre", nombre);
					usuario.setNombre(nombre);
					request.setAttribute("apellido", apellido);
					usuario.setApellido(apellido);
					request.setAttribute("fecha nacimiento", fechaNacimiento);
					usuario.setFechaNacimiento(fechaNacimiento);
					request.setAttribute("rut", rut);
					usuario.setRut(rut);

					
					usdao.registrar(usuario);
					// Redirige a una pagina de confirmacion
					conn.close();
					response.sendRedirect("confirmacionUsuario.jsp"); 
					
				}catch(Exception e) {
					System.out.println(e + " SERVLET CREAR USUARIO");
				}

				

			}

}
