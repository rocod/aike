package ar.edu.grupoesfera.cursospring.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import ar.edu.grupoesfera.cursospring.modelo.SprintTest;
import ar.edu.grupoesfera.cursospring.modelo.Turno;

public class TurnoDAOImplTest extends SprintTest {
	
	@Inject
	TurnoDAO turnoDao;
	
	@Test
	public void testTurnoDao(){
		
		/*
		Turno turno=new Turno();
		turno.setId(2);
		turno.setEstado("Reservado");
		
		turno=turnoDao.consultarTurno(2);
		System.out.println(turno.getEstado());
		
		*/
		List<Turno> lista=turnoDao.mostrarListaPorFiltro("car");
		boolean num =lista.isEmpty();
		
		for (Turno turno: lista)
			  System.out.println(turno.getDoctor());	
		
		assertThat(num).isEqualTo(false);
		
		
	}

}
