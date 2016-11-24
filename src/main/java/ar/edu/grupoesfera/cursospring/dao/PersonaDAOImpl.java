package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Persona;
import ar.edu.grupoesfera.cursospring.modelo.Turno;


@Service("PersonaDAO") @Transactional
public class PersonaDAOImpl implements PersonaDAO {
	@Inject
	 private SessionFactory sessionFactory;
	
	@Override
	public Persona grabarPersona(Persona persona) {
		Session session=sessionFactory.getCurrentSession();
		session.save(persona);
		Persona p=session.get(Persona.class, persona.getId());		
		return p;
	}

	@Override
	public boolean existePersona(String email) {
		
		Session session=sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<Persona> persona = session.createCriteria(Persona.class).add(Restrictions.eq("email", email)).list();
		
		if(persona.isEmpty()){
			return false;
		}else{
			return true;
		}
				
	}

	@Override
	public Persona obtenerPersona(Persona persona) {
		Session session=sessionFactory.getCurrentSession();
		Persona p = (Persona) session.createCriteria(Persona.class).add(Restrictions.eq("email", persona.getEmail())).uniqueResult();		
		return p;
	}
	

}
