package ar.edu.grupoesfera.cursospring.controladores;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import ar.edu.grupoesfera.cursospring.modelo.Persona;
import ar.edu.grupoesfera.cursospring.modelo.SprintTest;
import ar.edu.grupoesfera.cursospring.servicios.ServicioTurnos;

public class CrearPersonaTest extends SprintTest {
	
	@Test
	public void testCrearPersona(){
	ServicioTurnos servicioTurno=mock(ServicioTurnos.class);
	
	ControladorEjemplosBasicos miControlador= new ControladorEjemplosBasicos();
	miControlador.setServicioTurno(servicioTurno);
	Persona persona=new Persona();
	ModelAndView mav =miControlador.crearPersona(persona, "Cardiologia", "fecha", 2);
	//assertThat(mav.getModel().get("especialidad")).isEqualTo("Cardiologia");
	assertThat(mav.getViewName()).isEqualTo("mostrar");
	}

}
