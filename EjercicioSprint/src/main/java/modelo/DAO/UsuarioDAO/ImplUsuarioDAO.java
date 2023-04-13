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
		// se instancia una nueva conexion con el singleton a la base de datos
		Connection conn = Singleton.getConnection();
		System.out.println("llegó la conexion.. " + conn); // debug
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			String sql = "SELECT * FROM usuario ORDER by idusuario;";
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
				System.out.println("Usuario creado");
			}
			System.out.println("saliendo try/catch listarTodos()");
		} catch (Exception e) {
			System.out.println(e + " LISTAR, USUARIO DAO IMPL");
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
	public void registrar(Usuario usuario) {
		// TODO Auto-generated method stub
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch REGISTRAR USUARIO IMPL\n");
		        String sql = "INSERT INTO usuario(idUsuario, nombre, apellido, fechaNacimiento, run) VALUES (?, ?, ?, ?, ?)";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setInt(1, usuario.getIdUsuario());
		        st.setString(2, usuario.getNombre());
		        st.setString(3, usuario.getApellido());
		        st.setDate(4, StringToDate(usuario.getFechaNacimiento()));
		        st.setLong(5, usuario.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query"); //DEBUG
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al registrar usuario: " + e.getMessage());
		    }
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Usuario usuario) {
		// TODO Auto-generated method stub

	}
	
	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}

}
