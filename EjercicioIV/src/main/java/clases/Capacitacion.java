package clases;

public class Capacitacion {

	String nombreCap;
    String descripcion;
    String fechaCap;
    String duracionCap;
    
    public Capacitacion() {
    	
    }
    public Capacitacion(String nombreCap, String descripcion, String fechaCap, String duracionCap) {
    	this.nombreCap = nombreCap;
    	this.descripcion = descripcion;
    	this.fechaCap = fechaCap;
    	this.duracionCap = duracionCap;
    }
    
    /**@param nombre capacitacion */ 
    public void setNombreCap(String nombreCap) {
    	this.nombreCap = nombreCap;
    }
    public String getNombreCap() {
    	return nombreCap;
    }
    
    /**@param descripcion capacitacion */
    public void setDescripcion(String descripcion) {
    	this.descripcion = descripcion;
    }
    public String getDescripcion() {
    	return descripcion;
    }
    
    /**@param fecha capacitacion */
    public void setFechaCap(String fechaCap) {
    	this.fechaCap = fechaCap; 
    }
    public String getFechaCap() {
    	return fechaCap;
    }
    
    /**@param duracion capacitacion */
    public void setDuracionCap(String duracionCap) {
    	this.duracionCap = duracionCap;
    }
    public String getDuracionCap() {
    	return duracionCap;
    }
    
    @Override 
    public String toString() {
    	return "Nombre Capacitacion: " + getNombreCap() + "\nDescripcion Capacitacion: " + getDescripcion() 
    	+ "\nFecha Capacitacion: " + getFechaCap() + "\nDuracion Capacitacion: " + getDuracionCap();
    }

}
