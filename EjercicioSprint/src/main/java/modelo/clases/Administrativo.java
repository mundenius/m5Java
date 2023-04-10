package modelo.clases;

public class Administrativo extends Usuario{

	private int idAdmin;
	private String email;
	private String area;

	
	public Administrativo() {
		
	}
	
	public Administrativo(int idUsuario, String nombre, String apellido, String fechaNacimiento, long rut, int idAdmin, String email, String area) {
		super(idUsuario, nombre, apellido, fechaNacimiento, rut);
		this.idAdmin = idAdmin;
		this.email = email;
		this.area = area;
	}

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
	
	@Override 
	
	public String toString() {
		return "\nId Administrativo: " + getIdAdmin() + "\nEmail: " + getEmail() + "\nArea: " + getArea();
	}
	
}