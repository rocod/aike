<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Turno;

public interface TurnoDAO {

	public List<Turno> mostrarLista();
	public List<Turno> mostrarListaPorFiltro(String filtro);
	public void modificarTurno(Turno turno);
	public Turno consultarTurno(long id);
	public List<Turno> mostrarListaPorEstado(String estado);
}
=======
package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Turno;

public interface TurnoDAO {

	public List<Turno> mostrarLista();
	public List<Turno> mostrarListaPorFiltro(String filtro);
	public void modificarTurno(Turno turno);
	public Turno consultarTurno(long id);
	public List<Turno> mostrarListaPorEstado(String estado);
}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
