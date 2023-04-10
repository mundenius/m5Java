package modelo.DAO.AdminDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.clases.Administrativo;
import modelo.clases.Usuario;
import modelo.conexion.Singleton;

public class ImplAdminDAO implements IAdminDAO{

	ResultSet rs;
	Statement st;

	@Override
	public List<Administrativo> listarTodos() {
		// se instancia una nueva conexion con el singleton a la base de datos
		Connection conn = Singleton.getConnection();
		System.out.println("llegó la conexion.. " + conn); // debug
		// TODO Auto-generated method stub
		List<Administrativo> lista = new ArrayList<Administrativo>();
		try {
			String sql = "SELECT usuario.run, usuario.nombre, usuario.apellido, usuario.fechanacimiento, administrativo.email, administrativo.area FROM usuario INNER JOIN administrativo ON usuario.run=administrativo.rutadmin;";
			PreparedStatement st = conn.prepareStatement(sql);
			rs = st.executeQuery(sql);
			System.out.println("query ejecutada");
			while (rs.next()) {
				Administrativo admin = new Administrativo();
				admin.setRut(rs.getLong(1));	// el numero es por la columna en la base de datos
				admin.setNombre(rs.getString(2));
				admin.setApellido(rs.getString(3));
				admin.setFechaNacimiento(String.valueOf(rs.getDate(4)));
				admin.setEmail(rs.getString(5)); 
				admin.setArea(rs.getString(6));
				
				lista.add(admin);
				System.out.println("Administrativo creado");
			}
			System.out.println("saliendo try/catch listarTodos()");
		} catch (Exception e) {
			System.out.println(e + " LISTAR, ADMIN DAO IMPL");
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
	public void registrar(Administrativo admin) {
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch REGISTRAR ADMINISTRATIVO IMPL\n");
		        String sql = "INSERT INTO usuario(nombre, apellido, fechaNacimiento, run) VALUES (?, ?, ?, ?);";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setString(1, admin.getNombre());
		        st.setString(2, admin.getApellido());
		        st.setDate(3, StringToDate(admin.getFechaNacimiento()));
		        st.setLong(4, admin.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query insertar USUARIO \nProsigue insertar datos de administrativo"); //DEBUG
		        
		        String sqladmin = "INSERT INTO administrativo(email, area, rutadmin) VALUES (?,?,?);";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setString(1, admin.getEmail());
		        stmt.setString(2, admin.getArea());
		        stmt.setLong(3, admin.getRut());
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para ADMINISTRATIVO");
		        
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al registrar ADMINISTRATIVO: " + e.getMessage());
		    }
		
	}

	@Override
	public void actualizar(Administrativo admin) {
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ACTUALIZAR ADMINISTRATIVO IMPL\n");
		        String sql = "UPDATE usuario set nombre = ?, apellido = ?, fechaNacimiento = ? WHERE run = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setString(1, admin.getNombre());
		        st.setString(2, admin.getApellido());
		        st.setDate(3, StringToDate(admin.getFechaNacimiento()));
		        st.setLong(4, admin.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query actualizar USUARIO \nProsigue insertar datos de administrativo"); //DEBUG
		        
		        String sqladmin = "UPDATE administrativo set email = ?, area = ? WHERE rutadmin = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setString(1, admin.getEmail());
		        stmt.setString(2, admin.getArea());
		        stmt.setLong(3, admin.getRut());
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para ADMINISTRATIVO");
		        
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al actualizar ADMINISTRATIVO: " + e.getMessage());
		    }
		
	}

	@Override
	public void eliminar(Administrativo admin) {
		Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ELIMINAR ADMINISTRATIVO IMPL\n");
		        String sql = "DELETE FROM admin WHERE rutadmin = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setLong(1, admin.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query eliminar ADMINISTRATIVO \nProsigue eliminacion de datos USUARIO"); //DEBUG
		        
		        String sqladmin = "DELETE FROM usuario WHERE run = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setInt(1, admin.getIdAdmin());
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para USUARIO");
		        
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al eliminar ADMINISTRATIVO: " + e.getMessage());
		    }
		
	}

	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}
}
