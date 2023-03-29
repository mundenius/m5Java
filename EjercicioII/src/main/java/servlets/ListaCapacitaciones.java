package servlets;

import java.util.ArrayList;

import servlets.FormularioCrearCapacitacion.Capacitacion;

public class ListaCapacitaciones {

	ArrayList<Capacitacion>listaCapacitaciones = new ArrayList<Capacitacion>();

	public void agregarCapacitacion(Capacitacion capacitacion) {
		listaCapacitaciones.add(capacitacion);
	}
	
	public void listarCapacitaciones(Capacitacion capacitacion) {
		for(int i = 0; i < listaCapacitaciones.size() ; i++) {
			System.out.println(listaCapacitaciones.get(i));
		}
	}
}