package modelo.DAO.ClienteDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.clases.Cliente;
import modelo.clases.Cliente;
import modelo.conexion.Singleton;

public class ImplClienteDAO implements IClienteDAO {

	ResultSet rs;
	Statement st;
	
	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		// se instancia una nueva conexion con el singleton a la base de datos
				Connection conn = Singleton.getConnection();
				System.out.println("llegó la conexion.. " + conn); // debug
				// TODO Auto-generated method stub
				List<Cliente> lista = new ArrayList<Cliente>();
				/**SE CREA UNA LISTA PARA ALMACENAR OBJETOS QUE SE TRAERAN DE LA BASE DE DATOS
				 * SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA SELECT PARA LA BASE DE DATOS
				 * SE PREPRARA EL STATEMENT, Y SE EJECUTA
				 * EL RESULSET GENERARA RESULTADOS, LOS CUALES SE CAPTURARAN EN EL WHILE LOOP
				 * POR CADA VEZ QUE SE EJECUTE EL WHILE LOOP, SE CREARA UN NUEVO OBJETO DE LO QUE SE ESTA LISTANDO
				 * FINALMENTE SE AGREGA CADA OBJETO A LA LISTA DE OBJETOS
				 *  */
				try {
					String sql = "SELECT usuario.run, usuario.nombre, usuario.apellido, usuario.fechanacimiento, cliente.clitelefono, cliente.cliafp, cliente.clisistemasalud, cliente.clidireccion, cliente.clicomuna, cliente.cliedad FROM usuario INNER JOIN cliente ON usuario.run=cliente.rutcliente;";
					PreparedStatement st = conn.prepareStatement(sql);
					rs = st.executeQuery(sql);
					System.out.println("query ejecutada");
					while (rs.next()) {
						Cliente cli = new Cliente();
						cli.setRut(rs.getLong(1));	// el numero es por la columna en la base de datos
						cli.setNombre(rs.getString(2));
						cli.setApellido(rs.getString(3));
						cli.setFechaNacimiento(String.valueOf(rs.getDate(4)));
						cli.setTelefono(rs.getInt(5)); 
						cli.setAfp(rs.getString(6));
						cli.setSistemaSalud(rs.getString(7));
						cli.setDireccion(rs.getString(8));
						cli.setComuna(rs.getString(9));
						cli.setEdad(rs.getInt(10));
												
						lista.add(cli);
						System.out.println("Cliente creado");
					}
					System.out.println("saliendo try/catch listarTodos()");
				} catch (Exception e) {
					System.out.println(e + " LISTAR, CLIENTE DAO IMPL");
				} finally {
					try {
//						st.close();
//						rs.close();
//						conn.close();
					} catch (Exception e) {
						System.out.println(e + " TRY/CATCH close connections");
					}
				}

				return lista;
	}

	@Override
	public void registrar(Cliente cli) {
		/**SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA INSERT PARA LA BASE DE DATOS
		 * SE PREPARA LA SENTENCIA AL ASIGNARLE VALORES A LAS COLUMNAS
		 * PRIMERO SE SETTEAN LOS DE USUARIO, Y LUEGO EL DEL TIPO DE USUARIO
		 * ESTO DEBIDO A LA FOREIGN KEY
		 * FINALMENTE SE EJECUTAN LAS SENTENCIAS
		 *  */
		System.out.println("pre getConnection");
		// se instancia una nueva conexion con el singleton
		Connection conn = Singleton.getConnection();
		System.out.println("llego la conexion= " + conn);
		try {
			System.out.println("just entered try/catch REGISTRAR CLIENTE IMPL\n");
			String sql = "INSERT INTO usuario(nombre, apellido, fechanacimiento, run) VALUES (?, ?, ?, ?);";
			PreparedStatement st = conn.prepareStatement(sql);
			System.out.println("pre st.SETTER");
			st.setString(1, cli.getNombre());
			st.setString(2, cli.getApellido());
			st.setDate(3, StringToDate(cli.getFechaNacimiento()));
			st.setLong(4, cli.getRut());
			st.executeUpdate();
			System.out.println("atributos set en la query insertar USUARIO \nProsigue insertar datos de CLIENTE"); // DEBUG

			String sqlcli = "INSERT INTO cliente(clitelefono, cliafp, clisistemasalud, clidireccion, clicomuna, cliedad, rutcliente) VALUES (?,?,?,?,?,?,?);";
			PreparedStatement stmt = conn.prepareStatement(sqlcli);
			System.out.println("pre stmt.SETTER");
			stmt.setInt(1, cli.getTelefono());
			stmt.setString(2, cli.getAfp());
			stmt.setString(3, cli.getSistemaSalud());
			stmt.setString(4, cli.getDireccion());
			stmt.setString(5, cli.getComuna());
			stmt.setInt(6, cli.getEdad());
			stmt.setLong(7, cli.getRut());
			stmt.executeUpdate();
			System.out.println("atributos set en la query para CLIENTE");

//			st.close();
//			conn.close();
		} catch (Exception e) {
			System.out.println("Error al registrar CLIENTE: " + e.getMessage());
		}

	}

	@Override
	public void actualizar(Cliente cli) {
		/**SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA UPDATE PARA LA BASE DE DATOS
		 * SE PREPARA LA SENTENCIA AL ASIGNARLE VALORES A LAS COLUMNAS
		 * PRIMERO SE SETTEAN LOS ATRIBUTOS QUE SE QUIEREN EDITAR DE USUARIO, Y LUEGO EL DEL TIPO DE USUARIO
		 * ESTO DEBIDO A LA FOREIGN KEY EN LA BASE DE DATOS
		 * FINALMENTE SE EJECUTAN LAS SENTENCIAS
		 *  */
		System.out.println("pre getConnection");
		//se instancia una nueva conexion con el singleton
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ACTUALIZAR CLIENTE IMPL\n");
		        String sql = "UPDATE usuario set nombre = ?, apellido = ?, fechaNacimiento = ? WHERE run = ?;";
		        PreparedStatement st = conn.prepareStatement(sql);
		        System.out.println("pre st.SETTER");
		        st.setString(1, cli.getNombre());
		        st.setString(2, cli.getApellido());
		        st.setDate(3, StringToDate(cli.getFechaNacimiento()));
		        st.setLong(4, cli.getRut());
		        System.out.println("pre executeUpdate Usuario");
		        st.executeUpdate();
		        System.out.println("atributos set en la query actualizar USUARIO \nProsigue actualizar datos de CLIENTE"); //DEBUG
		        
		        String sqlcli = "UPDATE cliente set clitelefono = ?, cliafp = ?, clisistemasalud = ?, clidireccion = ?, clicomuna = ?, cliedad = ? WHERE rutcliente = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqlcli);
		        stmt.setInt(1, cli.getTelefono());
		        stmt.setString(2, cli.getAfp());
		        stmt.setString(3, cli.getSistemaSalud());
		        stmt.setString(4, cli.getDireccion());
		        stmt.setString(5, cli.getComuna());
		        stmt.setInt(6, cli.getEdad());
		        stmt.setLong(7, cli.getRut());
		        System.out.println("pre executeUpdate Cliente");
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para actualizar CLIENTE");
		        
//		        st.close();
//		        stmt.close();
		    } catch (Exception e) {
		        System.out.println("Error al actualizar CLIENTE: " + e.getMessage());
		    }finally {
		    	try {
//		    		st.close();
//		    		conn.close();
		    		
		    	}catch(Exception e) {
		    		System.out.println(e + "closing try/catch ");
		    	}
		    }

	}

	@Override
	public void eliminar(Cliente cli) {
		/**SE CREA UN ATRIBUTO QUE CONTIENE LA SENTENCIA DELETE PARA LA BASE DE DATOS
		 * SE PREPARA LA SENTENCIA AL ASIGNARLE VALORES A LAS COLUMNAS
		 * PRIMERO SE SETTEA EL ATRIBUTO CON EL QUE SE ENCONTRARA EL REGISTRO A ELIMINAR (RUT)
		 * LUEGO SE EJECUTA LA SENTENCIA, PRIMERO SE ELIMINAN LOS DATOS DEL TIPO DE USUARIO
		 * LUEGO LOS DATOS DEL USUARIO PER SE
		 * ESTO DEBIDO A LA FOREIGN KEY EN LA BASE DE DATOS
		 *  */
		 Connection conn = Singleton.getConnection();
		 System.out.println("llego la conexion= " + conn);
			try {
				System.out.println("just entered try/catch ELIMINAR CLIENTE IMPL\n");
		        String sql = "DELETE FROM cliente WHERE rutcliente = (?);";
		        PreparedStatement st = conn.prepareStatement(sql);
		        st.setLong(1, cli.getRut());
		        System.out.println("pre executeUpdate cliente");
		        st.executeUpdate();
		        System.out.println("atributos set en la query eliminar CLIENTE \nProsigue eliminacion de datos USUARIO"); //DEBUG
		        
		        String sqlcli = "DELETE FROM usuario WHERE run = ?;";
		        PreparedStatement stmt = conn.prepareStatement(sqlcli);
		        stmt.setLong(1, cli.getRut());
		        System.out.println("pre executeUpdate usuario");
		        stmt.executeUpdate();
		        System.out.println("atributos set en la query para eliminar USUARIO");
		        
//		        st.close();
//		        conn.close();
		    } catch (Exception e) {
		        System.out.println("Error al eliminar CLIENTE: " + e.getMessage());
		    }

	}

	public static Date StringToDate(String fecha) {
		Date date = Date.valueOf(fecha);
		return date;
	}
}
