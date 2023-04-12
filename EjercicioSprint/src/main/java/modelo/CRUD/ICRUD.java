package modelo.CRUD;

import java.util.List;

//La interface ICRUD define los metodos basicos para el acceso a datos (CRUD: crear, leer, actualizar y eliminar)
public interface ICRUD<D> {

	List<D>listarTodos();// Metodo para listar todos los registros
	void registrar(D d);// Metodo para registrar un nuevo registro
	void actualizar(D d);// Metodo para actualizar un registro existente 
	void eliminar(D d);// Metodo para eliminar un registro existente
	
}
