<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Turno;

@Service("TurnoDao") @Transactional
public class TurnoDAOImp implements TurnoDAO {
	@Inject
	 private SessionFactory sessionFactory;

	@Override
	public List<Turno> mostrarLista() {

		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Turno> resultado = session.createCriteria(Turno.class).list();

		return resultado;
	}

	@Override
	public void modificarTurno(Turno turno) {
		
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(turno);
		
	}

	@Override
	public Turno consultarTurno(long id) {
		
		Session session=sessionFactory.getCurrentSession();
		Turno turno = (Turno) session.createCriteria(Turno.class).add(Restrictions.eq("id", id)).uniqueResult();
		
		return turno;
	}

	@Override
	public List<Turno> mostrarListaPorEstado(String estado) {
		
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Turno> resultado = session.createCriteria(Turno.class).add(Restrictions.eq("estado", estado)).list();

		return resultado;
	}

	@Override
	public List<Turno> mostrarListaPorFiltro(String filtro) {
		
		String busqueda="%"+filtro+"%";
		
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Turno> resultado = session.createCriteria(Turno.class).add(Restrictions.ilike("especialidad", busqueda)).list();

		return resultado;
	}

}
=======
package ar.edu.grupoesfera.cursospring.dao;

import java.util.List;

import javax.inject.Inject;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.modelo.Turno;

@Service("TurnoDao") @Transactional
public class TurnoDAOImp implements TurnoDAO {
	@Inject
	 private SessionFactory sessionFactory;

	@Override
	public List<Turno> mostrarLista() {

		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Turno> resultado = session.createCriteria(Turno.class).list();

		return resultado;
	}

	@Override
	public void modificarTurno(Turno turno) {
		
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(turno);
		
	}

	@Override
	public Turno consultarTurno(long id) {
		
		Session session=sessionFactory.getCurrentSession();
		Turno turno = (Turno) session.createCriteria(Turno.class).add(Restrictions.eq("id", id)).uniqueResult();
		
		return turno;
	}

	@Override
	public List<Turno> mostrarListaPorEstado(String estado) {
		
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Turno> resultado = session.createCriteria(Turno.class).add(Restrictions.eq("estado", estado)).list();

		return resultado;
	}

	@Override
	public List<Turno> mostrarListaPorFiltro(String filtro) {
		
		String busqueda="%"+filtro+"%";
		
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Turno> resultado = session.createCriteria(Turno.class).add(Restrictions.ilike("especialidad", busqueda)).list();

		return resultado;
	}

}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
