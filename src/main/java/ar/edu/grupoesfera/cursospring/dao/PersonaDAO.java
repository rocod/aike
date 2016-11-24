package ar.edu.grupoesfera.cursospring.dao;

import ar.edu.grupoesfera.cursospring.modelo.Persona;

public interface PersonaDAO {
	
	public Persona grabarPersona(Persona persona);
	public boolean existePersona(String email);
	public Persona obtenerPersona(Persona persona);

}
