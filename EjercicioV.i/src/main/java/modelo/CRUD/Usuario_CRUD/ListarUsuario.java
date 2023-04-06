package modelo.CRUD.Usuario_CRUD;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAO.UsuarioDAO.*;

/**
 * Servlet implementation class ListarUsuario
 */
@WebServlet("/ListarUsuario")
public class ListarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("entering try/catch sv listar usuarios");
			IUsuarioDAO udao = new ImplUsuarioDAO();
			System.out.println("se creo la instancia udao"); //DEBUG
//			listausuario = udao.listarTodos();	otra forma
			request.setAttribute("listausuarios", udao.listarTodos()); //listausuario	otra forma
			System.out.println("request.setAttribute de ListarUsuario exitoso"); //DEBUG
			RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/listaUsuarios.jsp");
			dispatcher.forward(request, response);
			
			System.out.println("se despacho el forward de request,response");
		}catch(Exception e) {
			System.out.println(e + " LISTAR USUARIO SERVLET");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
