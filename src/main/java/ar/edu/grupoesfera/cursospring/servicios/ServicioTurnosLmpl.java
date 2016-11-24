package ar.edu.grupoesfera.cursospring.servicios;


import java.util.List;






import javax.inject.Inject;

import org.springframework.stereotype.Service;





import ar.edu.grupoesfera.cursospring.dao.TurnoDAO;
import ar.edu.grupoesfera.cursospring.modelo.Turno;

@Service
public class ServicioTurnosLmpl implements ServicioTurnos {

		@Inject
		TurnoDAO turnoDAO;
	

	@Override
	public Turno crearTurno(Turno turno) {
		// TODO Auto-generated method stub
		turno.setEspecialidad("cardiologo");
	//	turno.setFecha("01/10/2000");
		turno.setHorario("16:00hs");
		return turno;
	}

	@Override
	public List<Turno> obtenerTurnos() {
		
	List<Turno> lista=turnoDAO.mostrarLista();
		return lista;	
	
	}

	@Override
	public List<Turno> obtenerTurnos(String filtro) {
		
		
		
		List<Turno> lista=turnoDAO.mostrarListaPorFiltro(filtro);
		return lista;
		
	}

	@Override
	public List<Turno> mostrarLista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificarTurno(Turno turno) {
		
		turnoDAO.modificarTurno(turno);
		
	}

	@Override
	public Turno consultarTurno(long id) {
		
		Turno turno=turnoDAO.consultarTurno(id);
		return turno;
	}

	@Override
	public List<Turno> obtenerTurnosPorEstado(String estado) {
		List<Turno> lista=turnoDAO.mostrarListaPorEstado(estado);
		return lista;
	}
	public TurnoDAO getTurnoDAO() {
		return turnoDAO;
	}

	public void setTurnoDAO(TurnoDAO turnoDAO) {
		this.turnoDAO = turnoDAO;
	}
	
	
}
