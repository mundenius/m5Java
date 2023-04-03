package CRUD.Capacitacion_CRUD;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexion.Singleton;
import DAO.CapacitacionDAOImpl;
import DAO.ICapacitacionDAO;

/**
 * Servlet implementation class ListarCapacitacion
 */
@WebServlet("/ListarCapacitacion")
public class ListarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = Singleton.getConnection();
		try {
			System.out.println("entering try/catch svLP...");
			//se crea conexion con la base de datos
//			List<Persona> listapersona = new ArrayList<Persona>();  otra forma 
			
			ICapacitacionDAO capdao = new CapacitacionDAOImpl();
			System.out.println("se creo la listapersona e instancia de perdao");
//			listapersona = perdao.listarTodos();	otra forma
			request.setAttribute("listacapacitacion", capdao.listarTodos()); //listapersona	otra forma
			System.out.println("request.setAttribute de ListarCapacitacion exitoso"); //DEBUG
			RequestDispatcher dispatcher = request.getRequestDispatcher("listaCapacitaciones.jsp");

			dispatcher.forward(request, response);
			System.out.println("se despacho el forward de request,response");
			conn.close();
		}catch(Exception e) {
			System.out.println(e + " LISTAR CAPACITACION SERVLET");
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
