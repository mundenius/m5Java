/**
 * 
 * @author Valentina Saldias 
 * @author Javiera Saavedra
 * @author Adrian Fredes
 * @author Carlos Carrasco
 * @contact https://github.com/mundenius/m5Java
 */
package modelo.clases;

public class Cliente extends Usuario { // clase Cliente extiende de la clase Usuario

	//variables privadas
	private int idCliente;
	private int telefono;
	private String afp;
	private String sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	//constructor sin parametros
	public Cliente() {

	}

	//constructor con parametros
	public Cliente(int idUsuario, String nombre, String apellido, String fechaNacimiento, long rut, int idCliente, int telefono,
			String afp, String sistemaSalud, String direccion, String comuna, int edad) {
		super(idUsuario, nombre, apellido, fechaNacimiento, rut);
		this.idCliente = idCliente;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	//getters y setters
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(String sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//metodo toString que devuelve cadena de texto representando al objeto actual de Cliente
	@Override
	public String toString() {
		return "Nombre Cliente: " + super.getNombreCompleto() + "\nTelefono: " + getTelefono() + "\nAFP: " + getAfp()
				+ "\nSistema de Salud: " + getSistemaSalud() + "\nDireccion: " + getDireccion() + "\nComuna: "
				+ getComuna() + "\nEdad: " + getEdad();
	}

}
