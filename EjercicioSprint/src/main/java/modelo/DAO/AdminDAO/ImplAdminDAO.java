package modelo.DAO.AdminDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import modelo.clases.Administrativo;
import modelo.conexion.Singleton;

public class ImplAdminDAO implements IAdminDAO{

	@Override
	public List<Administrativo> listarTodos() {
		// TODO Auto-generated method stub
		return null;
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
		        st.setString(2, admin.getNombre());
		        st.setString(3, admin.getApellido());
		        st.setDate(4, StringToDate(admin.getFechaNacimiento()));
		        st.setLong(5, admin.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query insertar USUARIO \nProsigue insertar datos de administrativo"); //DEBUG
		        
		        String sqladmin = "INSERT INTO administrativo(email, area) VALUES (?,?);";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setString(1, admin.getEmail());
		        stmt.setString(2, admin.getArea());
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
		        
		        String sqladmin = "UPDATE administrativo set email = ?, area = ? WHERE idadmin = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setString(1, admin.getEmail());
		        stmt.setString(2, admin.getArea());
		        stmt.setInt(3, admin.getIdAdmin());
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
		        String sql = "DELETE FROM usuario WHERE run = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setLong(1, admin.getRut());
		        System.out.println("atributos set en la query eliminar USUARIO \nProsigue eliminacion de datos de administrativo"); //DEBUG
		        
		        String sqladmin = "DELETE FROM cliente WHERE idadmin = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqladmin);
		        stmt.setInt(1, admin.getIdAdmin());
		        
		        System.out.println("atributos set en la query para ADMINISTRATIVO");
		        
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
