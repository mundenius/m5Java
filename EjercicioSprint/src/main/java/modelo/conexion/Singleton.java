package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Singleton {

	//Propiedades
	
		private static Connection conn = null;

		//Constructor
		private Singleton() {
			String url="jdbc:mysql://127.0.0.1:3306/asesoriaprevriesgos";
			String driver = "com.mysql.cj.jdbc.Driver";
			
			String user = "root";
			String password = "Gryffindor97";
			
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//METODOS
		public static Connection getConnection() {
			if(conn == null) {
				new Singleton();
				System.out.println("Se creo la conexion"); //DEBUG
			}
			System.out.println("Retorno conexion..."); //DEBUG
			return conn;
		}
}
