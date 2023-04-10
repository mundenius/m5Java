package modelo.DAO.ClienteDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

import modelo.clases.Cliente;
import modelo.conexion.Singleton;

public class ImplClienteDAO implements IClienteDAO {

	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registrar(Cliente cli) {
		System.out.println("pre getConnection");
		// se instancia una nueva conexion con el singleton
		Connection conn = Singleton.getConnection();
		System.out.println("llego la conexion= " + conn);
		try {
			System.out.println("just entered try/catch REGISTRAR CLIENTE IMPL\n");
			String sql = "INSERT INTO usuario(nombre, apellido, fechaNacimiento, run) VALUES (?, ?, ?, ?);";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, cli.getNombre());
			st.setString(2, cli.getApellido());
			st.setDate(3, StringToDate(cli.getFechaNacimiento()));
			st.setLong(4, cli.getRut());
			st.executeUpdate();
			System.out
					.println("atributos set en la query insertar USUARIO \nProsigue insertar datos de CLIENTE"); // DEBUG

			String sqlcli = "INSERT INTO cliente(clitelefono, cliafp, clisistemasalud, clidireccion, clicomuna, cliedad, rutcliente) VALUES (?,?,?,?,?,?,?);";
			PreparedStatement stmt = conn.prepareStatement(sqlcli);
			stmt.setInt(1, cli.getTelefono());
			stmt.setString(2, cli.getAfp());
			stmt.setString(3, cli.getSistemaSalud());
			stmt.setString(4, cli.getDireccion());
			stmt.setString(5, cli.getComuna());
			stmt.setInt(6, cli.getEdad());
			stmt.setLong(7, cli.getRut());
			stmt.executeUpdate();
			System.out.println("atributos set en la query para CLIENTE");

			st.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("Error al registrar CLIENTE: " + e.getMessage());
		}

	}

	@Override
	public void actualizar(Cliente cli) {
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ACTUALIZAR CLIENTE IMPL\n");
		        String sql = "UPDATE usuario set nombre = ?, apellido = ?, fechaNacimiento = ? WHERE run = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setString(1, cli.getNombre());
		        st.setString(2, cli.getApellido());
		        st.setDate(3, StringToDate(cli.getFechaNacimiento()));
		        st.setLong(4, cli.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query actualizar USUARIO \nProsigue insertar datos de CLIENTE"); //DEBUG
		        
		        String sqlcli = "UPDATE cliente set clitelefono = ?, cliafp = ?, clisistemasalud = ?, clidireccion = ?, clicomuna = ?, cliedad = ? WHERE idcliente = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqlcli);
		        stmt.setInt(1, cli.getTelefono());
		        stmt.setString(2, cli.getAfp());
		        stmt.setString(3, cli.getSistemaSalud());
		        stmt.setString(4, cli.getDireccion());
		        stmt.setString(5, cli.getComuna());
		        stmt.setInt(6, cli.getEdad());
		        stmt.setInt(7, cli.getIdCliente());
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para actualizar CLIENTE");
		        
		        st.close();
		        stmt.close();
		    } catch (Exception e) {
		        System.out.println("Error al actualizar CLIENTE: " + e.getMessage());
		    }finally {
		    	try {
//		    		st.close();
		    		conn.close();
		    		
		    	}catch(Exception e) {
		    		System.out.println(e + "closing try/catch ");
		    	}
		    }

	}

	@Override
	public void eliminar(Cliente cli) {
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ELIMINAR CLIENTE IMPL\n");
		        String sql = "DELETE FROM cliente WHERE rutcliente = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setLong(1, cli.getRut());
		        st.executeUpdate();
		        System.out.println("atributos set en la query eliminar CLIENTE \nProsigue eliminacion de datos USUARIO"); //DEBUG
		        
		        String sqlcli = "DELETE FROM usuario WHERE run = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqlcli);
		        stmt.setInt(1, cli.getIdCliente());
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para USUARIO");
		        
		        st.close();
		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al eliminar CLIENTE: " + e.getMessage());
		    }

	}

	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}
}
