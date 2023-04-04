package modelo;
import java.util.Scanner;

public class Cliente extends Usuario {

	private String nombres;
	private String apellidos;
	private int telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	Scanner sc = new Scanner(System.in);
	
	public Cliente(String nombre, String fechaNacimiento, Long run, String nombres, String apellidos, int telefono,
    		String afp, int sistemaSalud, String direccion, String comuna, int edad, String String) {
    	super(nombre, fechaNacimiento, run);
    	this.nombres = nombres;
    	this.apellidos = apellidos;
    	this.telefono = telefono;
    	this.afp = afp;
    	this.sistemaSalud = sistemaSalud;
    	this.direccion = direccion;
    	this.comuna = comuna;
    	this.edad = edad;
	}
	public Cliente (Usuario usuario) {

        super(usuario.getNombreUsuario(),usuario.getFechaNacimientoUsuario(),usuario.getRunUsuario());
	}
	public Cliente () {
		
	}
	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		do {
            if (nombres.length() >=5 || nombres.length() <= 30) {
                this.nombres = nombres;
                break;

            } else {
                System.out.println("Ingrese nombre valido, mínimo 5 caracteres y máximo 30");
                nombres = sc.nextLine();
            }
		}while (nombres.length() == 0);
    }

	public String getApellidos() {
		return apellidos;
	}

	  public void setApellidos(String apellidos) {
	    	do { 
	            if (apellidos.length() >= 5 || apellidos.length() <= 30 || apellidos.isEmpty()) {
	                this.apellidos = apellidos;
	                break;
	            }else {
	                System.out.println("El apellido debe ser mayor que 5 caracteres y mayor de 30 caracteres");
	                apellidos = sc.nextLine();
	            }
	    	}while (apellidos.length()==0);
	}

	public int getTelefono() {
		return telefono;
	}


    public void setTelefono(int telefono) {
    	do {    		
            if(telefono == 0) {
                System.out.println("Ingrese teléfono, de 12 dígitos numéricos ");
                telefono = Integer.parseInt(sc.nextLine());
            }else if(telefono !=0) {
                this.telefono = telefono;
                break;
            }
    	} while (true);
    }

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
        do {
            if (afp.length() >= 4 && afp.length() <= 30) {
                this.afp = afp;
                break;
            } else {
                System.out.println("Ingrese una afp con más de 4 caracteres y menos a 10 caracateres");
            }
            afp = sc.nextLine();
        }while(true);
    }
	
	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
        do {
            if (sistemaSalud == 1 || sistemaSalud == 2) {
                this.sistemaSalud = sistemaSalud;
                break;
            } else {
                System.out.println("Valor incorrecto. Por favor ingrese 1 o 2.");
                sistemaSalud = Integer.parseInt(sc.nextLine());
            }
        }while(true);
    }

	public String getDireccion() {
		return direccion;
	}

	   public void setDireccion(String direccion) {
	        do {
	            if (direccion.length() <= 70) {
	                this.direccion = direccion;
	                break;
	            } else {
	                System.out.println("La dirección debe tener menos de 70 caracteres ");
	                direccion = sc.nextLine();
	            }
	        }while(true);
	    }

	public String getComuna() {
		return comuna;
	}

	   public void setComuna(String comuna) {
	        do {
	            if (comuna.length() <= 50) {
	                this.comuna = comuna;
	                break;
	            } else {
	                System.out.println("La comuna no debe exceder de  50 caracteres");
	                comuna = sc.nextLine();
	            }
	        }while(true);
	    }

	public int getEdad() {
		return edad;
	}

	   public void setEdad(int edad) {
	    	do {
	            if ( edad < 0 || edad > 150) {
	                System.out.println("Ingrese una Edad mayor o igual a 0 y menor de 150 años");
	                edad = Integer.parseInt(sc.nextLine());
	            }
	            else {
	                this.edad = edad;
	                break;
	            }
	    	}while (true);
	    }

		public String obtenerSistemaSalud() {
			if (sistemaSalud == 1) {
				return "FONASA";
			} else {
				return "ISAPRE";
			}
		}
	@Override
	public String toString() {
		return "Cliente [nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", afp=" + afp
				+ ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad="
				+ edad + "]";
	}
	
}
