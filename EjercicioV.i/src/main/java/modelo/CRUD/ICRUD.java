package modelo.CRUD;

import java.util.List;

public interface ICRUD<D> {

	List<D>listarTodos();
	void registrar(D d);
	void actualizar(D d);
	void eliminar(int id);
}
