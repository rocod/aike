<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.dao;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.hibernate.Session;
import org.junit.Test;

import ar.edu.grupoesfera.cursospring.modelo.Direccion;
import ar.edu.grupoesfera.cursospring.modelo.Persona;
import ar.edu.grupoesfera.cursospring.modelo.SprintTest;

public class PersonaDAOImplTest extends SprintTest  {
	@Inject PersonaDAO personaDAO;
	
	@Test
	public void testPersonaDAO(){
		
		boolean resultado;
		resultado=personaDAO.existePersona("rominacodarin@gmail.com");
		/*
		Persona persona=new Persona();
		
		persona.setNombre("Romina");
		persona.setApellido("Codarin");
		persona.setEmail("rominacodarin@gmail.com");
		persona.setTelefono("4483-1139");
		
		personaDAO.grabarPersona(persona);
		
		*/
		assertThat(resultado).isTrue();		
		
	
		
		
		
	}

}
=======
package ar.edu.grupoesfera.cursospring.dao;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.hibernate.Session;
import org.junit.Test;

import ar.edu.grupoesfera.cursospring.modelo.Direccion;
import ar.edu.grupoesfera.cursospring.modelo.Persona;
import ar.edu.grupoesfera.cursospring.modelo.SprintTest;

public class PersonaDAOImplTest extends SprintTest  {
	@Inject PersonaDAO personaDAO;
	
	@Test
	public void testPersonaDAO(){
		
		boolean resultado;
		resultado=personaDAO.existePersona("rominacodarin@gmail.com");
		/*
		Persona persona=new Persona();
		
		persona.setNombre("Romina");
		persona.setApellido("Codarin");
		persona.setEmail("rominacodarin@gmail.com");
		persona.setTelefono("4483-1139");
		
		personaDAO.grabarPersona(persona);
		
		*/
		assertThat(resultado).isTrue();		
		
	
		
		
		
	}

}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
