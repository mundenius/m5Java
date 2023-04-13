/**
 * 
 * @author Valentina Saldias 
 * @author Javiera Saavedra
 * @author Adrian Fredes
 * @author Carlos Carrasco
 * @contact https://github.com/mundenius/m5Java
 */
package modelo.clases;

public class Administrativo extends Usuario{ // clase Administrativo extiende de la clase Usuario

	// variables privadas
	private int idAdmin;
	private String email;
	private String area;

	//constructor sin parametros
	public Administrativo() {
		
	}

    // Constructor con parametros, recibe siete argumentos que inicializan las variables de instancia
	public Administrativo(int idUsuario, String nombre, String apellido, String fechaNacimiento, long rut, int idAdmin, String email, String area) {
		super(idUsuario, nombre, apellido, fechaNacimiento, rut);
		this.idAdmin = idAdmin;
		this.email = email;
		this.area = area;
	}

	
	//getters y setters
	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	//metodo toString que devuelve una cadena de texto que representa al objeto actual de Administrativo
	@Override 
	public String toString() {
		return "\nId Administrativo: " + getIdAdmin() + "\nEmail: " + getEmail() + "\nArea: " + getArea();
	}
	
}