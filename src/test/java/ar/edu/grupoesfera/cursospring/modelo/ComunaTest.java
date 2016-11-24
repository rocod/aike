<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.modelo;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class ComunaTest extends SprintTest {
	@Test
	@Transactional
	@Rollback
	public void testComuna(){
		
		Barrio barrio1 =new Barrio();		
		barrio1.setNombre("San Justo");
		
		Barrio barrio2 =new Barrio();		
		barrio2.setNombre("I Casanova");
		
		Comuna comuna=new Comuna();
		comuna.addBarrio(barrio1);
		comuna.addBarrio(barrio2);
		
		Session s=getSession();
		s.save(comuna);
		
		assertThat(s.get(Comuna.class, comuna.getId())).isNotNull();
		assertThat(s.get(Comuna.class, comuna.getId()).getBarrios()).hasSize(2);
		
	}

}
=======
package ar.edu.grupoesfera.cursospring.modelo;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class ComunaTest extends SprintTest {
	@Test
	@Transactional
	@Rollback
	public void testComuna(){
		
		Barrio barrio1 =new Barrio();		
		barrio1.setNombre("San Justo");
		
		Barrio barrio2 =new Barrio();		
		barrio2.setNombre("I Casanova");
		
		Comuna comuna=new Comuna();
		comuna.addBarrio(barrio1);
		comuna.addBarrio(barrio2);
		
		Session s=getSession();
		s.save(comuna);
		
		assertThat(s.get(Comuna.class, comuna.getId())).isNotNull();
		assertThat(s.get(Comuna.class, comuna.getId()).getBarrios()).hasSize(2);
		
	}

}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
