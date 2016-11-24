package ar.edu.grupoesfera.cursospring.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ar.edu.grupoesfera.cursospring.dao.PersonaDAO;
import ar.edu.grupoesfera.cursospring.modelo.Persona;

@Service
public class ServicioPersonaImpl implements ServicioPersona {
	@Inject
	PersonaDAO personaDAO;
	
	@Override
	public Persona guardarPersona(Persona persona) {
		Persona p=new Persona();
		boolean resultado=personaDAO.existePersona(persona.getEmail());
		if(resultado==false){
			p=personaDAO.grabarPersona(persona);
			
		}else{
			
			p=personaDAO.obtenerPersona(persona);
		}
		return p;
		
	}

	public PersonaDAO getPersonaDAO() {
		return personaDAO;
	}

	public void setPersonaDAO(PersonaDAO personaDAO) {
		this.personaDAO = personaDAO;
	}

}
