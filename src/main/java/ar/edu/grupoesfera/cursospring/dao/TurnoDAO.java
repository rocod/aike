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
