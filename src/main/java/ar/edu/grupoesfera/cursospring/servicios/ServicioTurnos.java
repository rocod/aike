package ar.edu.grupoesfera.cursospring.servicios;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Turno;

public interface ServicioTurnos {
	public Turno crearTurno(Turno turno);
	public List<Turno> obtenerTurnos();
	public List<Turno> obtenerTurnos(String filtro);
	public List<Turno> obtenerTurnosPorEstado(String estado);
	public List<Turno> mostrarLista();
	public void modificarTurno(Turno turno);
	public Turno consultarTurno(long id);
}

