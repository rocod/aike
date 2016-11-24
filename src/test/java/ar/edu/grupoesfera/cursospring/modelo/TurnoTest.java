<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.modelo;

import static org.assertj.core.api.Assertions.assertThat;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class TurnoTest extends SprintTest {
	@Test
	@Transactional
	@Rollback
	
	public void testTurno(){
		Turno turno=new Turno();
		
		
		
		Session s = getSession();
	
		s.save(turno);	
		
		Turno t = s.get(Turno.class, turno.getId());
		assertThat(t).isNotNull();
		
		
	}

}
=======
package ar.edu.grupoesfera.cursospring.modelo;

import static org.assertj.core.api.Assertions.assertThat;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class TurnoTest extends SprintTest {
	@Test
	@Transactional
	@Rollback
	
	public void testTurno(){
		Turno turno=new Turno();
		
		
		
		Session s = getSession();
	
		s.save(turno);	
		
		Turno t = s.get(Turno.class, turno.getId());
		assertThat(t).isNotNull();
		
		
	}

}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
