<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.controladores;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.SprintTest;
import ar.edu.grupoesfera.cursospring.modelo.Turno;
import ar.edu.grupoesfera.cursospring.servicios.ServicioTurnos;

public class VistaBuscarTest extends SprintTest {

	@Test
	public void testVista_buscar(){
		
		ServicioTurnos servicioTurno=mock(ServicioTurnos.class);		
		Turno turno=new Turno();
	
		
		ControladorEjemplosBasicos miControlador= new ControladorEjemplosBasicos();
		miControlador.setServicioTurno(servicioTurno);
		ModelAndView mav =miControlador.vista_buscar(turno);
		
		assertThat(mav.getViewName()).isEqualTo("index_lista");
		
		
	}

}

=======
package ar.edu.grupoesfera.cursospring.controladores;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.SprintTest;
import ar.edu.grupoesfera.cursospring.modelo.Turno;
import ar.edu.grupoesfera.cursospring.servicios.ServicioTurnos;

public class VistaBuscarTest extends SprintTest {

	@Test
	public void testVista_buscar(){
		
		ServicioTurnos servicioTurno=mock(ServicioTurnos.class);		
		Turno turno=new Turno();
	
		
		ControladorEjemplosBasicos miControlador= new ControladorEjemplosBasicos();
		miControlador.setServicioTurno(servicioTurno);
		ModelAndView mav =miControlador.vista_buscar(turno);
		
		assertThat(mav.getViewName()).isEqualTo("index_lista");
		
		
	}

}

>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
