package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;

/**
 * Servlet implementation class Login
 */
@WebServlet(name = "Login", urlPatterns = "/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        if(session.getAttribute("nombre") != null){
            //SI EXISTE, ELIMINAR EL ATRIBUTO
            session.removeAttribute("nombre");
            response.sendRedirect("/index.jsp");
        }
        else{
            response.sendRedirect("inicio.jsp");
        }


    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("pass");
		

		//debug muestra los datos en consolas si se reciben en servlet
		System.out.println(usuario);
		System.out.println(password);

		
		if(usuario == null || password == null || !validacionDatos(usuario,password)) {
			request.setAttribute("datosInvalidos", "Los datos ingresados no coinciden");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("nombre", usuario);
			response.sendRedirect("inicio.jsp");
		}
	}

	public boolean validacionDatos(String nombre, String password) {
        HashMap<String, String> usuarios = new HashMap<String, String>();
        usuarios.put("admin", "1234");
        usuarios.put("vale", "007");
        usuarios.put("carlos", "234");
        usuarios.put("javi", "987");
        usuarios.put("adrian", "456");
        
        
        return usuarios.containsKey(nombre) && usuarios.get(nombre).equals(password);
    }
}
