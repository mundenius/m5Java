/**
 * 
 * @author Valentina Saldias 
 * @author Javiera Saavedra
 * @author Adrian Fredes
 * @author Carlos Carrasco
 * @contact https://github.com/mundenius/m5Java
 */
package modelo.clases;

public class Usuario {

	private int idUsuario;
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private long rut;
	
	public Usuario() {
	}
	
	public Usuario(int idUsuario, String nombre, String apellido, String fechaNacimiento, long rut) {
	this.idUsuario = idUsuario;
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNacimiento = fechaNacimiento;
	this.rut = rut;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public long getRut() {
		return rut;
	}

	public void setRut(long rut) {
		this.rut = rut;
	}

	
	public String getNombreCompleto() {
		return getNombre() + " " + getApellido();
	}
	@Override
	public String toString() {
		return "Usuario \nidUsuario: " + idUsuario + "\nNombre: " + nombre + "\nApellido: " + apellido
				+ "\nFecha de nacimiento: " + fechaNacimiento + "\nRut: " + rut;
	}
	
	

}
	
