package modelo.interfaces;

import java.util.List;

import modelo.clases.Capacitacion;

//La interface ICapacitacion define los metodos para acceder a los datos de capacitacion
public interface ICapacitacion {
	
    // Metodo para listar todas las capacitaciones
	public List<Capacitacion> listaCapacitacion();
	
	// Metodo para registrar una capacitación desde la consola
	public void registrarConsola(Capacitacion capacitacion);
}
