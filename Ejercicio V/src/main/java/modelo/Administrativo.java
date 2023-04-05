package modelo;
import java.util.Scanner;

public class Administrativo extends Usuario {
	private String experienciaPrevia;
	private String area;
	Scanner sc = new Scanner(System.in);
	
	public Administrativo(Usuario usuario) {
		super(usuario.getNombreUsuario(), usuario.getFechaNacimientoUsuario(), usuario.getRunUsuario());
	}

	public Administrativo(String nombre, String fechaNacimiento, Long run, String experienciaPrevia, String area) {
		super (nombre, fechaNacimiento, run);
		this.experienciaPrevia = experienciaPrevia;
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		do {
			if (experienciaPrevia.length() <= 100) {
				this.experienciaPrevia = experienciaPrevia;
				break;
			} else {
				System.out.println("La experiencia previa no debe exceder los 100 caracteres");
				experienciaPrevia = sc.nextLine();
			}
		}while(true);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		do {
			if (area.length() >= 5 && area.length() <=20) {
				this.area = area;
				break;
			}else {
				System.out.println("Ingrese un area mayor que 4 y menor que 20 caracteres");
				area = sc.nextLine();
			}
		} while (true);
	}

	@Override
	public String toString() {
		return "Administrativo [experienciaPrevia=" + experienciaPrevia + ", area=" + area + "]";
	}
	
}
