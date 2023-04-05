package modelo.DAO.UsuarioDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import modelo.clases.Usuario;
import modelo.conexion.Singleton;


public class ImplUsuarioDAO implements IUsuarioDAO {

	ResultSet rs;
	Statement st;

	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		// se instancia una nueva conexion con el singleton
		Connection conn = Singleton.getConnection();
		System.out.println("llegó la conexion.. " + conn); // debug
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			String sql = "SELECT * FROM usuario ORDER by idusuario";
			PreparedStatement st = conn.prepareStatement(sql);
			rs = st.executeQuery(sql);
			System.out.println("query ejecutada");
			while (rs.next()) {
				Usuario us = new Usuario();
				us.setIdUsuario(rs.getInt(1)); // el numero es por la columna en la base de datos
				us.setNombre(rs.getString(2));
				us.setApellido(rs.getString(3));
				us.setFechaNacimiento(String.valueOf(rs.getDate(4)));
				us.setRut(rs.getLong(5));
				lista.add(us);
				System.out.println("Capacitacion creada");
			}
			System.out.println("saliendo try/catch listarTodos()");
		} catch (Exception e) {
			System.out.println(e + " LISTAR, CAPACITACION DAO IMPL");
		} finally {
			try {
				st.close();
				rs.close();
				conn.close();
			} catch (Exception e) {
				System.out.println(e + " TRY/CATCH close connections");
			}
		}

		return lista;
	}

	@Override
	public void registrar(Usuario d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Usuario d) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

}
